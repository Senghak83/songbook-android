package com.sru.songbook.fragment_;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.songbook.R;
import com.sru.songbook.db_singer.SingerEnty;
import com.sru.songbook.recyler_Adapter.Sing_Adapter_list;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class fSinger extends Fragment {

    private List<SingerEnty> ls ;
    private ArrayList<SingerEnty> data;
    private RecyclerView srcy;

    public fSinger() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        //ls = new ArrayList<>();
        data = new ArrayList<>();

        //--------


//        final SingerEnty tbl[] ={
//                new SingerEnty("Prap Savath",1000,"2010","HM"),
//                new SingerEnty("Srey Pov",1000,"2010","KH"),
//                new SingerEnty("Phearum",1000,"2010","ITC"),
//                new SingerEnty("Meng Thong",1000,"2010","ITC"),
//                new SingerEnty("Siev Heang",1000,"2010","TOM"),
//                new SingerEnty("Senghak",1000,"2010","SRU"),
//
//
//        };

        // ---  Create DB ---
//        Runnable runables = new Runnable() {
//            @Override
//            public void run() {
//                SongDBs sdb = SongDBs.getInstance(getContext());
//                SingDAO sing = sdb.getSinger();
//
//                ls = sing.getAll();
//                if(ls.isEmpty()){
//                    sing.InsertSinger(tbl);
//                    ls = sing.getAll();
//                }
//
//
//            }
//        };
//        //-----------


        data.add(new SingerEnty("ABA  kdiekd",1000,"2000","MSP"));
        data.add(new SingerEnty("Sense",1000,"2000","MSP"));
        data.add(new SingerEnty("Sense",1000,"2000","MSP"));
        data.add(new SingerEnty("Sense",1000,"2000","MSP"));
        data.add(new SingerEnty("ABA  kdiekd",1000,"2000","MSP"));
        data.add(new SingerEnty("Sense",1000,"2000","MSP"));
        data.add(new SingerEnty("Sense",1000,"2000","MSP"));
        data.add(new SingerEnty("Sense",1000,"2000","MSP"));

//        for (int i = 0 ; i< ls.size(); i++)
//            data.add(ls.get(i));
//
//        Executor executor = Executors.newSingleThreadExecutor();
//        executor.execute(runables);

        //Toast.makeText(getContext(),""+ls.size(),Toast.LENGTH_LONG).show();





        View v = inflater.inflate(R.layout.fragment_f_singer, container, false);
        srcy = v.findViewById(R.id.sing_rcl);
        srcy.setLayoutManager(new LinearLayoutManager(getContext()));
        srcy.setAdapter(new Sing_Adapter_list(R.layout.singer_list,data));

        return v;
    }

}
