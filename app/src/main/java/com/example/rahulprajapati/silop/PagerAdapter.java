package com.example.rahulprajapati.silop;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int tab;

    public PagerAdapter(FragmentManager fm, int tab) {
        super(fm);
        this.tab = tab;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                sources sources = new sources();
                return sources;
            case 1:
                argument argument = new argument();
                return  argument;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tab;
    }
}
