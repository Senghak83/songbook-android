package com.sru.songbook.fragment_;


import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sru.songbook.R;
import com.sru.songbook.db_SongMS.SongDBs;
import com.sru.songbook.db_product.ProductDAO;
import com.sru.songbook.db_product.tbl_product;
import com.sru.songbook.recyler_Adapter.Product_Adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;


/**
 * A simple {@link Fragment} subclass.
 */
public class fProduction extends Fragment {

    private RecyclerView rcv;
    private ArrayList<tbl_product> ls;//= new ArrayList<>();


    public fProduction() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ls = new ArrayList<>();
        View v = inflater.inflate(R.layout.fragment_f_production, container, false);
        //------Add data to list--
        //ls.add(new tbl_product("R.drawable.p_hornmase","Hong Meas","Start 1990 "));
        //ls.add(new Production(R.drawable.p_m,"M Production","Comany is varable now"));
        //ls.add(new Production(R.drawable.p_vproduct,"V Production","Instand of HM"));
        //ls.add(new Production(R.drawable.p_town,"Town Production","Popular Song 2020"));


        rcv = v.findViewById(R.id.RCLV);
        rcv.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //---   Read Data from Data Base ---
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                SongDBs db = SongDBs.getInstance(getContext());
                ProductDAO pDao = db.getProduction();
                List<tbl_product> ls_db = pDao.getAllProducgt();
                if (ls_db == null || ls_db.isEmpty()) {

                    //Toast.  makeText(getContext(),"No Data in database ",Toast.LENGTH_LONG).show();

                } else {
                    ls = (ArrayList<tbl_product>) ls_db;
                }

                //--- Back to Main Thread ....
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        rcv.setAdapter(new Product_Adapter(R.layout.production_list, ls,fProduction.this));
                    }
                });// end runOnUiThread  ......

            }
        };


        Executors.newSingleThreadExecutor().execute(runnable);
    }
}
