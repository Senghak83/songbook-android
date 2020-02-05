package com.sru.songbook.db_product;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity



public class tbl_product {
    @PrimaryKey(autoGenerate = true)
    private int pid;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "Desc")
    private String Desc;
    @ColumnInfo(name = "url")
    private String url;

    public tbl_product(){}


    public tbl_product( String title, String desc, String url) {

        this.title = title;
        Desc = desc;
        this.url = url;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
