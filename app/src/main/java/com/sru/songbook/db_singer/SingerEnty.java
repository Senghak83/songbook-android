package com.sru.songbook.db_singer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity

public class SingerEnty {
    @PrimaryKey (autoGenerate = true)
    public int sid;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name ="number")
    public int number;
    @ColumnInfo(name = "startsing")
    public String startsing;
    @ColumnInfo(name="production")
    public String production;

    public SingerEnty(){}



    public SingerEnty(String name, int num, String startsing, String production) {
        this.name = name;
        this.number = num;
        this.startsing = startsing;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStartsing() {
        return startsing;
    }

    public void setStartsing(String startsing) {
        this.startsing = startsing;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
