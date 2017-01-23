package com.roc.sndchk.sndchkapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import android.app.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by marjorieanncuerdo on 11/16/16.
 */

public class Feedfragment extends Fragment {
    /*
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //View v = inflater.inflate(R.layout.camera,container);
        //addListenerOnButton();
        //this.v = inflater.inflate(R.layout.camera, container, false);
        View v = inflater.inflate(R.layout.feed, container, false);
        final Button button = (Button)v.findViewById(R.id.Bottombaritemone);
        //button = (Button) v.findViewById(R.id.Bottombaritemtwo);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), HomePageActivity.class);
                startActivity(intent);
                // startActivityFromFragment();
            }

        });
        return v;
    }
    */


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_home_page,container,false);
        return v;
    }

}
