package com.sru.songbook.fragment_;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.songbook.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fSong extends Fragment {


    public fSong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f_song, container, false);
    }

}
