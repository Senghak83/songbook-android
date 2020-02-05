package com.sru.songbook.savedb._page_Adpater;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.sru.songbook.R;
import com.sru.songbook.db_SongMS.SongDBs;
import com.sru.songbook.db_product.ProductDAO;
import com.sru.songbook.db_product.tbl_product;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * A simple {@link Fragment} subclass.
 */
public class fProduct_add extends Fragment implements View.OnClickListener {


    public fProduct_add() {
        // Required empty public constructor
    }


    private EditText p_title;
    private EditText p_desp;
    private EditText p_url;
    private Button bsave,bnew;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=  inflater.inflate(R.layout.fragment_f_product_add, container, false);
        p_title = v.findViewById(R.id.txt_product_title);
        p_desp = v.findViewById(R.id.txt_prod_desc);
        p_url = v.findViewById(R.id.txt_pro_url);


        bnew = v.findViewById(R.id.btNew);
        bsave = v.findViewById(R.id.btSave);



        bsave.setOnClickListener(this);
        bnew.setOnClickListener(this);



        return  v;
    }



    @Override
    public void onClick(View v) {
       switch (v.getId()){
            case R.id.btNew :


                Toast.makeText(getContext(),p_desp.getText(),Toast.LENGTH_LONG).show();


                ClearText();

               break;

               case R.id.btSave:

                   if (p_title.getText().toString().equals("")){
                       Toast.makeText(getContext(),"Input Title",Toast.LENGTH_LONG).show();
                       p_title.requestFocus();
                       return;
                      }
                   else if(p_desp.getText().toString().equals("")){
                       Toast.makeText(getContext(),"Descrip",Toast.LENGTH_LONG).show();
                       p_desp.requestFocus();
                       return;
                   }
                   else if(p_url.getText().toString().equals("")){
                       Toast.makeText(getContext(),"Input URL",Toast.LENGTH_LONG).show();
                       p_url.requestFocus();
                       return;

                   }
                   else{
                       try {
                           Runnable runnable = new Runnable() {
                               @Override
                               public void run() {
                                   tbl_product tpro = new tbl_product(p_title.getText().toString(), p_desp.getText().toString(), p_url.getText().toString());
                                   SongDBs db = SongDBs.getInstance(getContext());
                                   ProductDAO dDao = db.getProduction();
                                   dDao.InsertAll(tpro);

                                   getActivity().runOnUiThread(new Runnable() {
                                       @Override
                                       public void run() {
                                            Toast.makeText(getContext(),"Success",Toast.LENGTH_LONG).show();
                                       }
                                   });

                               }
                           };


                           Executors.newSingleThreadExecutor().execute(runnable);
                           ClearText();

                       }catch (Exception exp){
                           Toast.makeText(getContext(),exp.toString(),Toast.LENGTH_LONG).show();
                           //Log.d(getTag(),exp.toString());
                          Log.i(getTag(),exp.toString());

                       }

                   }// end else


                   break;
           }// end switch case
       }

       //---- funtion clear Text--
    private void ClearText(){
        p_url.setText("");
        p_desp.setText("");
        p_title.setText("");
        p_title.requestFocus();

    }
}
