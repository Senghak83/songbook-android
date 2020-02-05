package com.sru.songbook.db_Song;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface SongDAO {

    @Query("Select * from tbl_song")
    List<tbl_song> getAll();
    @Insert
    public void InsertAll(tbl_song ... tbl_songs);
    @Update
    public void upDate(tbl_song tblSong);
    @Delete
    public void deletAll(tbl_song ... tbl_songs);


}
