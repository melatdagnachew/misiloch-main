package com.gebeya.misiloch;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.airbnb.lottie.utils.Utils;
import com.gebeya.misiloch.framework.util.Util;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Util.d(this, "<===== ON_CREATE =====>");
    }
}