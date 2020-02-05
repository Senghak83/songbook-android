package com.sru.songbook._SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbHelper extends SQLiteOpenHelper {


//    CREATE TABLE contacts (
//            contact_id INTEGER PRIMARY KEY,
//            first_name TEXT NOT NULL,
//            last_name TEXT NOT NULL,
//            email TEXT NOT NULL UNIQUE,
//            phone TEXT NOT NULL UNIQUE
//    );

    private String tblProdc ="Create Table tbProduct (pid Integer primary key, title text, desp text)";
    private String tblSing = "Create table tbSing (sid Integer primary key, sing_name text, n_song text";
    private String tblSong = "Create Table tbSong (song_id Integer primary key, s_title text, time text";

    public dbHelper(@Nullable Context context) {
        super(context,"DBsong", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // create table..
        db.execSQL(tblProdc);
        //db.execSQL(tblSing);
        //db.execSQL(tblSong);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // catch when offline

        db.execSQL("DROP TABLE IF EXISTS tbProduct");
        onCreate(db);

    }
    //--------- Insert Data to table ---
    public void SQLite_Insert_Production(Product_model p_model){
        //-- Add data to Contanvalue
        ContentValues cont = new ContentValues();
        cont.put("p_name",p_model.getName());
        cont.put("p_des",p_model.getDesc());
        cont.put("p_url",p_model.getUrl());
        //---- Add to SQLite DB
        SQLiteDatabase db = getWritableDatabase();
        db.insert("tbProduct",null,cont);
    }

    //----  Read All data from tblProduct
    public Cursor getAllProduct(){
        SQLiteDatabase db = getReadableDatabase();
        Cursor curs = db.rawQuery("Select * from tbProduct",null);
        return curs;

    }
}
