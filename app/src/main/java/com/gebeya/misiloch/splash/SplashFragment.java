package com.gebeya.misiloch.splash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gebeya.misiloch.BuildConfig;
import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseFragment;

import butterknife.BindView;

public class SplashFragment extends BaseFragment {

    @BindView(R.id.splashVersion)
    TextView versionLabel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate(R.layout.fragment_splash, container);

        versionLabel.setText(BuildConfig.VERSION_NAME);

        return root;
    }
}
