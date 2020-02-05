package com.sru.songbook.PageAdapter;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class myPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> ls =new ArrayList<Fragment>();
    private String t[];

    public myPagerAdapter(@NonNull FragmentManager fm, int behavior, List<Fragment>ls,String t[]) {
        super(fm, behavior);
        this.ls = ls;
        this.t = t;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return ls.isEmpty() ? null : ls.get(position);
    }

    @Override
    public int getCount() {
        return ls.isEmpty()? 0 : ls.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return t[position];
    }
}
