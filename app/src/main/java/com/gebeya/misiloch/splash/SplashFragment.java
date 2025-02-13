package com.gebeya.misiloch.splash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class SplashFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate(R.layout.fragment_splash, container);

        return root;
    }
}
