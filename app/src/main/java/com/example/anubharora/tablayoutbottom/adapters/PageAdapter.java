package com.example.anubharora.tablayoutbottom.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.anubharora.tablayoutbottom.fragments.fragment_four;
import com.example.anubharora.tablayoutbottom.fragments.fragment_one;
import com.example.anubharora.tablayoutbottom.fragments.fragment_three;
import com.example.anubharora.tablayoutbottom.fragments.fragment_two;

/**
 * Created by anubharora on 11/15/16.
 */

public class PageAdapter extends FragmentPagerAdapter {

    final int noOfTabs = 4;
    String[] tabsName = {"TAB1", "TAB2", "TAB3", "TAB4"};
    private Context mContext;

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new fragment_one();
            case 1:
                return new fragment_two();
            case 2:
                return new fragment_three();
            case 3:
                return new fragment_four();
            default:
                return null;
        }

    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        return tabsName[position];
//    }

    @Override
    public int getCount() {
        return tabsName.length;
    }
}
