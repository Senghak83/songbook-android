package com.sru.songbook.recyler_Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.songbook.db_singer.SingerEnty;

import java.util.ArrayList;

public class Sing_Adapter_list extends RecyclerView.Adapter<Singer_horder> {
    private LayoutInflater inlf;
    private int Layout ;
    private ArrayList<SingerEnty> ls;

    public Sing_Adapter_list(int layout, ArrayList<SingerEnty> ls){
        this.Layout = layout;
        this.ls = ls;
    }

    @NonNull
    @Override
    public Singer_horder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inlf = LayoutInflater.from(parent.getContext());
        View v = inlf.inflate(Layout,parent,false);


        return new Singer_horder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Singer_horder holder, int position) {
        SingerEnty sing = (SingerEnty)ls.get(position);
        String detail = "Start working "+ls.get(position).getStartsing()+
                " Company : "+ls.get(position).getProduction()+
                "\n Number of song : "+ls.get(position).getNumber();
        holder.getSinger().setText(ls.get(position).getName());
        holder.getSing_detail().setText(detail);




    }

    @Override
    public int getItemCount() {
        return ls.isEmpty()? 0 : ls.size();
    }
}
