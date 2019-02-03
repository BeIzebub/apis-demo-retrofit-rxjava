package com.kg.apis;

import android.app.ProgressDialog;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherActivity extends AppCompatActivity {

    private TextView cityTextView;
    private TextView weatherTextView;
    private TextView dateTextView;
    private ImageView weatherImageView;

    private Retrofit retrofit;
    private WeatherService weatherService;
    private CompositeDisposable compositeDisposable;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        cityTextView = findViewById(R.id.cityTextView);
        weatherTextView = findViewById(R.id.weatherTextView);
        dateTextView = findViewById(R.id.dateTextView);
        weatherImageView = findViewById(R.id.weatherImageView);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("loading...");
        progressDialog.show();

        compositeDisposable = new CompositeDisposable();
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.metaweather.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        weatherService = retrofit.create(WeatherService.class);

        showWeather("san francisco");
    }

    private void showWeather(String cityName) {
        weatherService.searchCities(cityName)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<CitySearchResult>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onSuccess(List<CitySearchResult> citySearchResults) {
                        if(!citySearchResults.isEmpty()){
                            showWeather(citySearchResults.get(0).getWoeid());
                        } else {
                            Toast.makeText(WeatherActivity.this, "City not found", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(WeatherActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void showWeather(int id) {
        weatherService.getCityInfo(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<CityInfo>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onSuccess(CityInfo cityInfo) {
                        Consolidated_weather weather = cityInfo.getConsolidated_weather().get(0);
                        weatherTextView.setText(weather.getWeather_state_name());
                        cityTextView.setText(cityInfo.getTitle());
                        dateTextView.setText(weather.getApplicable_date());

                        Glide.with(WeatherActivity.this)
                                .asBitmap()
                                .load(buildWeatherImageUri(weather.getWeather_state_abbr()))
                                .into(weatherImageView);
                        progressDialog.dismiss();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(WeatherActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private Uri buildWeatherImageUri(String abbreviation) {
        return Uri.parse("https://www.metaweather.com/" +
                "static/img/weather/png/64/" +
                abbreviation +
                ".png");
    }

    @Override
    protected void onDestroy() {
        compositeDisposable.dispose();
        super.onDestroy();
    }
}
