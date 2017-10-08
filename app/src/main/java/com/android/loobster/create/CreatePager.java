package com.android.loobster.create;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.loobster.create.post.CreatePostFragment;

public class CreatePager extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Task", "Stage", "Project", "Post"};
    private Fragment[] fragments;

    public CreatePager(FragmentManager fm) {
        super(fm);

        fragments = new Fragment[]{
            new CreateTaskFragment(),
            new CreateStageFragment(),
            new CreateProjectFragment(),
            new CreatePostFragment()
        };

    }

    @Override public int getCount() {
        return fragments.length;
    }

    @Override public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
