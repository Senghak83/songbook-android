package com.sru.songbook.db_SongMS;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.sru.songbook.db_Song.SongDAO;
import com.sru.songbook.db_Song.tbl_song;
import com.sru.songbook.db_product.ProductDAO;
import com.sru.songbook.db_product.tbl_product;
import com.sru.songbook.db_singer.SingDAO;
import com.sru.songbook.db_singer.SingerEnty;

@Database(entities = {SingerEnty.class, tbl_product.class, tbl_song.class},version = 1 ,exportSchema = true)

public abstract class SongDBs extends RoomDatabase {
    public static SongDBs Inst;



    //-- Singleton
    public static SongDBs getInstance(Context con){

        if(Inst == null){
            Inst = Room.databaseBuilder(con,SongDBs.class,"SongDBs").fallbackToDestructiveMigration().build();
        }
        return Inst;
    }

    public abstract SingDAO getSinger();
    public abstract ProductDAO getProduction();
    public abstract SongDAO getSong();


}
