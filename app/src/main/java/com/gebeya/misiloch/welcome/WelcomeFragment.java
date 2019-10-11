package com.gebeya.misiloch.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseFragment;

public class WelcomeFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate(R.layout.fragment_welcome, container);

        return root;
    }
}