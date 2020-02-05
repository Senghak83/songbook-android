package com.sru.songbook.savedb._page_Adpater;

import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class myPageAdager_add_item extends FragmentPagerAdapter {

    //private LayoutInflater infl;
    private String[]t ={"Add-Production","Add-Singer","Add-Song"};
    private ArrayList<Fragment> ls ;
    public myPageAdager_add_item(@NonNull FragmentManager fm, int behavior,ArrayList<Fragment> ls) {
        super(fm, behavior);
        this.ls = ls;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return ls.isEmpty()? null : ls.get(position);
    }

    @Override
    public int getCount() {
        return ls.isEmpty()?0:ls.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return t[position];
    }
}
