package com.roc.sndchk.sndchkapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.content.Intent;

import android.widget.Button;

/**
 * Created by marjorieanncuerdo on 11/16/16.
 */

public class Camerafragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_camera, container, false);
        Button button = (Button)v.findViewById(R.id.Bottombaritemtwo);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), CameraActivity.class);
                startActivity(intent);

            }

        });
        return v;
    }

}

