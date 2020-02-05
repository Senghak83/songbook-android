package com.sru.songbook.savedb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.sru.songbook.BasActi;
import com.sru.songbook.PageAdapter.myPagerAdapter;
import com.sru.songbook.R;
import com.sru.songbook.fragment_.fProduction;
import com.sru.songbook.savedb._page_Adpater.fProduct_add;
import com.sru.songbook.savedb._page_Adpater.fSing_add;
import com.sru.songbook.savedb._page_Adpater.fSong_add;
import com.sru.songbook.savedb._page_Adpater.myPageAdager_add_item;

import java.util.ArrayList;

public class AddDb extends BasActi {

    private ViewPager vpadd;
    private ArrayList<Fragment>  ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_db);
        //ls.add(new  )

        ls.add(new fProduct_add());
        ls.add(new fSing_add());
        ls.add(new fSong_add());
        vpadd = findViewById(R.id.pgvAdd_item);
        vpadd.setAdapter(new myPageAdager_add_item(getSupportFragmentManager(),0,ls));

    }
}
