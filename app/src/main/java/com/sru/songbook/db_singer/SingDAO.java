package com.sru.songbook.db_singer;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao // Data Access Object

public interface SingDAO {
    @Query("Select * from SingerEnty")
    List<SingerEnty> getAll();
    @Insert
    public void InsertSinger(SingerEnty... singdbs);
    @Delete
    public void DeleteAll(SingerEnty... singdbs);

    @Query("Delete from SingerEnty")
    public void DeletAllQuery();
    @Query("Delete from SingerEnty where name = :name")
    public void DeletNameQurey(String name);

}
