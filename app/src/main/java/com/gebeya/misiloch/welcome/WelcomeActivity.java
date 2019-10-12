package com.gebeya.misiloch.welcome;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.gebeya.misiloch.App;
import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseActivity;

import butterknife.BindArray;
import butterknife.BindView;
import butterknife.ButterKnife;

public class WelcomeActivity extends BaseActivity  {

    public static final int PAGE_COUNT = 3;

    public static final String KEY_IMAGE = "IMAGE";
    public static final String KEY_TITLE = "TITLE";
    public static final String KEY_DESC = "DESCRIPTION";


    @BindArray(R.array.welcome_titles)
    String[] titles;

    @BindArray(R.array.welcome_descriptions)
    String[] description;

    int[] images = {R.drawable.welcome_camera_icon,R.drawable.welcome_favorite_icon,R.drawable.welcome_share_icon};

    @BindView(R.id.welcomeViewPager)
    ViewPager viewPager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        WelcomePagerAdapter adapter = new WelcomePagerAdapter(getSupportFragmentManager());
        adapter.setImages(images);
        adapter.setTitles(titles);
        adapter.setDescription(description);

        viewPager.setAdapter(adapter);
    }
}