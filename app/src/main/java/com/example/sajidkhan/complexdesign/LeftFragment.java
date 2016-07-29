package com.example.sajidkhan.complexdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class LeftFragment extends Fragment {

    private static final String TAG = LeftFragment.class.getSimpleName();
    private ViewPager viewPager;
    private TabLayout tabLayout;
    String str;

    public static LeftFragment newInstance() {
        LeftFragment leftFragment = new LeftFragment();
        return leftFragment;
    }


    public LeftFragment() {
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View x = inflater.inflate(R.layout.fragment_left_layout, null);
        tabLayout = (TabLayout) x.findViewById(R.id.tabLeftFullSeatLayout);
        viewPager = (ViewPager) x.findViewById(R.id.pagerLeftFullLayout);

        viewPager.setAdapter(new LeftFragmentTabsPagerAdapter(getChildFragmentManager(), str));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        return x;

    }


}
