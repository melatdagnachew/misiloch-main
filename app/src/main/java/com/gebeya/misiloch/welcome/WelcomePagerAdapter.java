package com.gebeya.misiloch.welcome;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WelcomePagerAdapter extends FragmentPagerAdapter {

    private int[] images;
    private String[] titles;
    private String[] descriptions;

    public WelcomePagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        int image = images[position];
        String title = titles[position];
        String description = descriptions[position];
        return WelcomeFragment.newInstance(image, title, description);
    }

    @Override
    public int getCount() {
        return WelcomeActivity.PAGE_COUNT;
    }

    public int[] getImages() {
        return images;
    }

    public void setImages(int[] images) {
        this.images = images;
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    public String[] getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String[] descriptions) {
        this.descriptions = descriptions;
    }
}
