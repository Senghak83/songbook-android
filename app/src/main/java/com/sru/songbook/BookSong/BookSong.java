package com.sru.songbook.BookSong;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.sru.songbook.BasActi;
import com.sru.songbook.PageAdapter.myPagerAdapter;
import com.sru.songbook.R;
import com.sru.songbook.fragment_.fAboiut;
import com.sru.songbook.fragment_.fProduction;
import com.sru.songbook.fragment_.fSinger;
import com.sru.songbook.fragment_.fSong;

import java.util.ArrayList;
import java.util.List;

public class BookSong extends BasActi {

    private ViewPager vpg;
    private List<Fragment> ls = new ArrayList<>();
    private String []t={"Production","Song","Singer","About"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_song);

        vpg = findViewById(R.id.VPG);


        ls.add(new fProduction());
        ls.add(new fSong());
        ls.add(new fSinger());
        ls.add(new fAboiut());



        vpg.setAdapter(new myPagerAdapter(getSupportFragmentManager(),0,ls,t));




    }
}
