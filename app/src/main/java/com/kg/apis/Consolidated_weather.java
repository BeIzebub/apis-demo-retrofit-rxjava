package com.kg.apis;


public class Consolidated_weather
{
    private String visibility;

    private String created;

    private String applicable_date;

    private String wind_direction;

    private String predictability;

    private String wind_direction_compass;

    private String weather_state_name;

    private String min_temp;

    private String weather_state_abbr;

    private String the_temp;

    private String humidity;

    private String wind_speed;

    private String id;

    private String max_temp;

    private String air_pressure;

    public String getVisibility ()
    {
        return visibility;
    }

    public void setVisibility (String visibility)
    {
        this.visibility = visibility;
    }

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
    }

    public String getApplicable_date ()
    {
        return applicable_date;
    }

    public void setApplicable_date (String applicable_date)
    {
        this.applicable_date = applicable_date;
    }

    public String getWind_direction ()
    {
        return wind_direction;
    }

    public void setWind_direction (String wind_direction)
    {
        this.wind_direction = wind_direction;
    }

    public String getPredictability ()
    {
        return predictability;
    }

    public void setPredictability (String predictability)
    {
        this.predictability = predictability;
    }

    public String getWind_direction_compass ()
    {
        return wind_direction_compass;
    }

    public void setWind_direction_compass (String wind_direction_compass)
    {
        this.wind_direction_compass = wind_direction_compass;
    }

    public String getWeather_state_name ()
    {
        return weather_state_name;
    }

    public void setWeather_state_name (String weather_state_name)
    {
        this.weather_state_name = weather_state_name;
    }

    public String getMin_temp ()
    {
        return min_temp;
    }

    public void setMin_temp (String min_temp)
    {
        this.min_temp = min_temp;
    }

    public String getWeather_state_abbr ()
    {
        return weather_state_abbr;
    }

    public void setWeather_state_abbr (String weather_state_abbr)
    {
        this.weather_state_abbr = weather_state_abbr;
    }

    public String getThe_temp ()
    {
        return the_temp;
    }

    public void setThe_temp (String the_temp)
    {
        this.the_temp = the_temp;
    }

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getWind_speed ()
    {
        return wind_speed;
    }

    public void setWind_speed (String wind_speed)
    {
        this.wind_speed = wind_speed;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getMax_temp ()
    {
        return max_temp;
    }

    public void setMax_temp (String max_temp)
    {
        this.max_temp = max_temp;
    }

    public String getAir_pressure ()
    {
        return air_pressure;
    }

    public void setAir_pressure (String air_pressure)
    {
        this.air_pressure = air_pressure;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [visibility = "+visibility+", created = "+created+", applicable_date = "+applicable_date+", wind_direction = "+wind_direction+", predictability = "+predictability+", wind_direction_compass = "+wind_direction_compass+", weather_state_name = "+weather_state_name+", min_temp = "+min_temp+", weather_state_abbr = "+weather_state_abbr+", the_temp = "+the_temp+", humidity = "+humidity+", wind_speed = "+wind_speed+", id = "+id+", max_temp = "+max_temp+", air_pressure = "+air_pressure+"]";
    }
}