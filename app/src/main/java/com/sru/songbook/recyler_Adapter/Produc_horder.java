package com.sru.songbook.recyler_Adapter;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sru.songbook.R;

public class Produc_horder extends RecyclerView.ViewHolder {

     private ImageView imag;
     private TextView title;
     private TextView des;

    public Produc_horder(@NonNull View itemView) {
        super(itemView);

        imag = itemView.findViewById(R.id.pim);
        title = itemView.findViewById(R.id.pti);
        des = itemView.findViewById(R.id.pdes);

    }
    public ImageView getImag(){return imag;}
    public TextView getTitle(){return title;}
    public TextView getDes(){return des;}
}
