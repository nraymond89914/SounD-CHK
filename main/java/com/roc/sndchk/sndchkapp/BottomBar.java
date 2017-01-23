package com.roc.sndchk.sndchkapp;

//old code
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import com.roughike.bottombar.OnMenuTabClickListener;



// new code 12/28
import android.content.Intent;
/*
public class BottomBar extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.Bottombaritethree);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, StoryPageActivity.class);
                startActivity(intent);

            }

        });

    }
}
*/



    // old code
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


                if (i == R.id.Bottombaritemone) {

                    Feedfragment f = new Feedfragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                } else if (i == R.id.Bottombaritemtwo) {


                    Camerafragment f = new Camerafragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                } else if (i == R.id.Bottombaritethree) {
                    Favoritesfragment f = new Favoritesfragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int i) {

            }


        });

        mBottomBar.mapColorForTab(0,"#F44336");
        mBottomBar.mapColorForTab(1,"#FF6F00");
        mBottomBar.mapColorForTab(2,"#FF6F00");


    }

}
