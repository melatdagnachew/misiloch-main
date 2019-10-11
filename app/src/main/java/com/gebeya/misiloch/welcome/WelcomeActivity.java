package com.gebeya.misiloch.welcome;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.gebeya.misiloch.App;
import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseActivity;

public class WelcomeActivity extends BaseActivity  {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        App app = (App) getApplication();
        toast(app.getName());
    }
}
