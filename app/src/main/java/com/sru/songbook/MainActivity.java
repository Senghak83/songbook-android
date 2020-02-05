package com.sru.songbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sru.songbook.BookSong.BookSong;
import com.sru.songbook.db_Produc.Production;
import com.sru.songbook.db_Song.SongDAO;
import com.sru.songbook.db_Song.tbl_song;
import com.sru.songbook.db_SongMS.SongDBs;
import com.sru.songbook.db_product.ProductDAO;
import com.sru.songbook.db_product.tbl_product;
import com.sru.songbook.db_singer.SingDAO;
import com.sru.songbook.db_singer.SingerEnty;
import com.sru.songbook.savedb.AddDb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----- Create Object to store data ------
        // Add data ----
        //----- add to production -----

//        ls_prod = new ArrayList<>();
//
//        ls_prod.add(new tbl_product("HM","Horng Mease HDVT",R.drawable.ic_save));
//        ls_prod.add(new tbl_product("TW","Town Product",R.drawable.ic_singing));
//
//        ls_prod.add(new tbl_product("HM","Horng Mease HDVT",R.drawable.ic_playsong));
//
//
//
//        //--- Create Data base
//        SongDBs  db= SongDBs.getInstance(getApplicationContext());
//
//
//        final ProductDAO pro_dao = db.getProduction();
//        final SingDAO sing_dao = db.getSinger();
//        final SongDAO song_dao = db.getSong();
//
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//                //-------  get Data ----
//                List<tbl_product> lsp = pro_dao.getAllProducgt();
//                List<tbl_song> lssong = song_dao.getAll();
//                List<SingerEnty> lssing = sing_dao.getAll();
//
//                //--- check and write data
//                if(lsp.isEmpty() || lsp == null){
//                    pro_dao.InsertAlls(ls_prod);
//                }
//
//            }
//        };
//
//        //---- Excuter
//
//        Executors.newSingleThreadExecutor().execute(runnable);















    }

    public void toBookSong(View view) {
        startActivity(new Intent(this, BookSong.class));
    }

    public void toAddDB(View view) {
        startActivity(new Intent(this, AddDb.class));
    }
}
