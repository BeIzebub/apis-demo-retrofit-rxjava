package com.kg.apis;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface YesNoService {

    @GET(".")
    Single<YesOrNo> getAnswer();
}
