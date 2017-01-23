package com.roc.sndchk.sndchkapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

//import android.app.Fragment;

/**
 * Created by marjorieanncuerdo on 11/16/16.
 */

public class Camerafragmentsender extends Fragment {

    CommunicationChannel mCommChListner = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_camera,container);
        /*Button mButton = (Button) v.findViewById(R.id.scan_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        return v;
    }

    //create an interface which will help us to communicate with fragments by help of Activity
    interface CommunicationChannel
    {
        public void setCommunication(String msg);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if(activity instanceof CommunicationChannel)
        {
            mCommChListner = (CommunicationChannel)activity;
        }
        else
        {
            throw new ClassCastException();
        }

    }

    public void sendMessage(String msg)
    {
        mCommChListner.setCommunication(msg);
    }
}
