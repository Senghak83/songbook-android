package com.sru.songbook.recyler_Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sru.songbook.db_product.tbl_product;

import java.util.ArrayList;

public class Product_Adapter extends RecyclerView.Adapter<Produc_horder> {

    private LayoutInflater inflater;
    private int layout;
    private ArrayList<tbl_product> ls;
    Fragment fragment;


    public Product_Adapter(int layout, ArrayList<tbl_product> ls , Fragment fragment) {
        this.layout = layout;
        this.ls = ls;
        this.fragment = fragment;
    }


    @NonNull
    @Override
    public Produc_horder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(layout, parent, false);

        return new Produc_horder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Produc_horder holder, int position) {

        //ImageView imv = holder.getImag();

        tbl_product tbl_product = ls.get(position);

        holder.getDes().setText(tbl_product.getDesc());
        holder.getTitle().setText(tbl_product.getTitle());
        //imv.setImageResource(ls.get(position).getUrl());

        Glide.with(fragment)
                .load(tbl_product.getUrl())
                .into(holder.getImag());

    }

    @Override
    public int getItemCount() {
        return ls == null ? 0 : ls.size();
    }


}
