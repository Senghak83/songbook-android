package com.sru.songbook.savedb._page_Adpater;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.songbook.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fSong_add extends Fragment{


    public fSong_add() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f_song_add, container, false);
    }

}
