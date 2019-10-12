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

    public static final String KEY_IMAGE = "IMAGE";
    public static final String KEY_TITLE = "TITLE";
    public static final String KEY_DESC = "DESCRIPTION";

    public static WelcomeFragment newInstance(int image, String title, String description) {
        WelcomeFragment fragment = new WelcomeFragment();

        Bundle args = new Bundle();
        args.putInt(KEY_IMAGE, image);
        args.putString(KEY_TITLE, title);
        args.putString(KEY_DESC, description);
        fragment.setArguments(args);

        return fragment;
    }

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

        Bundle args = getArguments();
        int welcomeImage = args.getInt(KEY_IMAGE);
        String welcomeTitle = args.getString(KEY_TITLE);
        String welcomeDescription = args.getString(KEY_DESC);

        image.setImageResource(welcomeImage);
        title.setText(welcomeTitle);
        description.setText(welcomeDescription);

        return root;
    }
}