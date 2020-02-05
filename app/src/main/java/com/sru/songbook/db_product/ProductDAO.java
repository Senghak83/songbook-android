package com.sru.songbook.db_product;

import android.icu.text.Replaceable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface ProductDAO {

    @Query("Select * from tbl_product")
    List<tbl_product> getAllProducgt();

    @Delete
    public void deletAll(tbl_product ... tbl_products);
    @Insert(onConflict = REPLACE)
    public void InsertAll(tbl_product ... tbl_products);


    @Insert
    public void InsertAlls(List<tbl_product> ls);
    @Update(onConflict = REPLACE)
    public int UpdateObjec(tbl_product objec);


}
