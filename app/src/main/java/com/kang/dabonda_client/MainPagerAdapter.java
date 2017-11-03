package com.kang.dabonda_client;

import android.content.IntentSender;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by KANG on 2017-11-02.
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MainPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.mNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment tab = new FirstFragment();
        switch(position){
            case 0:
                break;
            case 1:
                tab = new SecondFragment();
                break;
            case 2:
                tab = new ThirdFragment();
                break;
        }
        return tab;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
