package com.walexhino.blessedtutorials;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ValidFragment")
public class FragmentQuestion extends android.support.v4.app.Fragment  {




    private CardView futa, unimed,oau,unilag,unilorin,uniben;

    View view;





    public FragmentQuestion (){







    }







    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.past_question_fragment,container, false);
        futa=(CardView)view.findViewById(R.id.futa);


        futa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity() ,OpenfFuta.class);
                startActivity(intent);





            }
        });

        unimed=(CardView)view.findViewById(R.id.unimed);
        unimed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(), unimedPdf.class);
                startActivity(intent);
            }
        });


        oau=(CardView)view.findViewById(R.id.oau);
        oau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (view.getContext(),OpenPdf.class );
                intent2.putExtra("send", "oau.pdf");
                startActivityForResult(intent2,0);
            }
        });


        unilag=(CardView)view.findViewById(R.id.unilag);
        unilag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (view.getContext(),OpenPdf.class );
                intent2.putExtra("send", "unilag.pdf");
                startActivityForResult(intent2,0);
            }
        });


        unilorin=(CardView)view.findViewById(R.id.more);
        unilorin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (view.getContext(),MorePdf.class );
                startActivity(intent2);
            }
        });

       uniben=(CardView)view.findViewById(R.id.uniben);
       uniben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (view.getContext(),OpenPdf.class );
                intent2.putExtra("send", "uniben.pdf");
                startActivityForResult(intent2,0);
            }
        });







        return view;



    }










    }

