package com.sru.songbook.db_Produc;

public class Production {

    private int image;
    private String title;
    private String des;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Production(int image, String title, String ds) {
        this.image = image;
        this.title = title;
        this.des = ds;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
