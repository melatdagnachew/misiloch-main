package com.gebeya.misiloch.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseFragment;

import butterknife.BindView;

public class WelcomeFragment extends BaseFragment {

    @BindView(R.id.welcomeImage)
    ImageView image;

    @BindView(R.id.welcomeTitle)
    TextView title;

    @BindView(R.id.welcomeDescription)
    TextView description;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate(R.layout.fragment_welcome, container);

        return root;
    }
}