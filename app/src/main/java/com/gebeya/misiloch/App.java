package com.gebeya.misiloch;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.airbnb.lottie.utils.Utils;
import com.gebeya.misiloch.framework.util.Const;
import com.gebeya.misiloch.framework.util.Util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        Util.d(this, "<===== ON_CREATE =====>");

        retrofit = new Retrofit.Builder()
                .baseUrl(Const.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit(){

        return retrofit;
    }

}