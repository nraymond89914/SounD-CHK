package com.roc.sndchk.sndchkapp;

import android.provider.Contacts;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.view.Menu;

import com.roc.sndchk.sndchkapp.Favoritesfragment;
import com.roc.sndchk.sndchkapp.Peoplefragment;
import com.roc.sndchk.sndchkapp.R;
import com.roughike.bottombar.OnMenuTabClickListener;

public class BottomBar extends ActionBarActivity {

    com.roughike.bottombar.BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar);
        mBottomBar = com.roughike.bottombar.BottomBar.attach(this,savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_bottom_bar,new OnMenuTabClickListener() {

            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.Bottombaritemfive) {
                    Favoritesfragment f = new Favoritesfragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                } else if (i == R.id.Bottombaritemone) {
                    Peoplefragment f = new Peoplefragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int i) {

            }


        });

        mBottomBar.mapColorForTab(0,"#F44336");
        mBottomBar.mapColorForTab(1,"#FF6F00");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bottom_bar, menu);
        return true;
    }
}
