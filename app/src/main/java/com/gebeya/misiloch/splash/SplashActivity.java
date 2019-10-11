package com.gebeya.misiloch.splash;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SplashFragment fragment = new SplashFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.splashFragmentContainer, fragment);
        transaction.commit();
    }
}
