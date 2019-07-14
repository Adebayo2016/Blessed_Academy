package com.walexhino.blessedtutorials;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

public class FragmentTutorial extends android.support.v4.app.Fragment implements View.OnClickListener {
     private CardView tutorial;


    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.tutorials_fragment,container, false);


        return view;

    }

    public FragmentTutorial(){

    }


    @Override
    public void onClick(View view) {





    }
}
