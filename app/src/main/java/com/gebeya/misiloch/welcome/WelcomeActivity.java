package com.gebeya.misiloch.welcome;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.gebeya.misiloch.App;
import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseActivity;

import butterknife.BindArray;
import butterknife.BindView;
import butterknife.ButterKnife;

public class WelcomeActivity extends BaseActivity implements ViewPager.OnPageChangeListener {

    public static final int PAGE_COUNT = 3;

    @BindView(R.id.welcomeViewPager)
    ViewPager viewPager;

    @BindArray(R.array.welcome_titles)
    String[] titles;

    @BindArray(R.array.welcome_descriptions)
    String[] descriptions;

    int[] images = {
        R.drawable.welcome_camera_icon,
        R.drawable.welcome_favorite_icon,
        R.drawable.welcome_share_icon,
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        WelcomePagerAdapter adapter = new WelcomePagerAdapter(getSupportFragmentManager());
        adapter.setTitles(titles);
        adapter.setDescriptions(descriptions);
        adapter.setImages(images);

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        d("Current page: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
