package com.gebeya.misiloch;

import android.app.Application;

import com.gebeya.misiloch.framework.util.Util;

public class App extends Application {

    private String name;

    @Override
    public void onCreate() {
        super.onCreate();
        Util.d(this, "<===== ON_CREATE =====>");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}