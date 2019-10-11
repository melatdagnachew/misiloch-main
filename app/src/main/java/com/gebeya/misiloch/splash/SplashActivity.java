package com.gebeya.misiloch.splash;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.gebeya.misiloch.App;
import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseActivity;
import com.gebeya.misiloch.welcome.WelcomeActivity;

public class SplashActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.splashFragmentContainer, new SplashFragment())
                .commit();

        App app = (App) getApplication();
        app.setName("Hello world!");
        startActivity(new Intent(this, WelcomeActivity.class));
    }
}