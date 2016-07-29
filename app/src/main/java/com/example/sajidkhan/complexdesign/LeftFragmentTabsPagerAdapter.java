package com.example.sajidkhan.complexdesign;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class LeftFragmentTabsPagerAdapter extends FragmentPagerAdapter {

    FragmentManager fm;
    String str;


    public LeftFragmentTabsPagerAdapter(FragmentManager fm, String str) {
        super(fm);
        this.fm = fm;
        this.str = str;
    }

    @Override
    public Fragment getItem(int position) {
        SinglePagertLayoutFragment singlePagertLayoutFragment = new SinglePagertLayoutFragment();
        Bundle bundle = new Bundle();

        switch (position) {

            case 0:

                singlePagertLayoutFragment.setArguments(bundle);
                return singlePagertLayoutFragment;

            case 1:

                singlePagertLayoutFragment.setArguments(bundle);
                return singlePagertLayoutFragment;


        }
        return singlePagertLayoutFragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "First Tab";
            case 1:
                return "Second Tab";


        }
        return "First Tab";
    }
}