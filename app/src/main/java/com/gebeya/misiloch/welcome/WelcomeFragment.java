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

import butterknife.BindArray;
import butterknife.BindView;
import butterknife.ButterKnife;

import static com.gebeya.misiloch.welcome.WelcomeActivity.KEY_DESC;
import static com.gebeya.misiloch.welcome.WelcomeActivity.KEY_IMAGE;
import static com.gebeya.misiloch.welcome.WelcomeActivity.KEY_TITLE;

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

        Bundle args = getArguments();

        int welcomeImage = args.getInt(KEY_IMAGE);
        image.setImageResource(welcomeImage);

        String WelcomeTitle = args.getString(KEY_TITLE);
        title.setText(WelcomeTitle);

        String WelcomeDesc = args.getString(KEY_DESC);
        description.setText(WelcomeDesc);


        return root;

    }

    public static WelcomeFragment newInstance(int image, String title,String description){

        WelcomeFragment fragment = new WelcomeFragment();

        Bundle args = new Bundle();

        args.putInt(KEY_IMAGE,image);
        args.putString(KEY_TITLE,title);
        args.putString(KEY_DESC,description);

        //attach the bundle to the fragment
        fragment.setArguments(args);

        return fragment;


    }
}