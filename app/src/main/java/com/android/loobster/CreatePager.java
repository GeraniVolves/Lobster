package com.android.loobster;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CreatePager extends FragmentPagerAdapter {

    private Fragment[] fragments;

    public CreatePager(FragmentManager fm) {
        super(fm);
        fragments = new Fragment[]{
            new CreateTaskFragment(),
            new CreateStageFragment(),
            new CreateProjectFragment()
        };
    }

    @Override public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override public int getCount() {
        return fragments.length;
    }
}
