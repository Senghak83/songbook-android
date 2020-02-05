package com.sru.songbook.recyler_Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.songbook.R;

public class Singer_horder extends RecyclerView.ViewHolder {

    private TextView singer;
    private TextView sing_detail;


    public Singer_horder(@NonNull View itemView) {
        super(itemView);
        singer = itemView.findViewById(R.id.sig_name);
        sing_detail = itemView.findViewById(R.id.sin_detail);
    }
    public TextView getSinger(){return singer;}
    public TextView getSing_detail(){return sing_detail;}



}
