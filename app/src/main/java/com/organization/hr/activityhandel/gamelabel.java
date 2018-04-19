package com.organization.hr.activityhandel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class gamelabel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamelabel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void play1(View view)
    {
       // Intent i = new Intent(this,PLAY1.class);
        //startActivity(i);
    }

    public void play2(View view)
    {
        Intent i = new Intent(this,play2.class);
        startActivity(i);
    }

    public void play3(View view)
    {
        Intent i = new Intent(this,play3.class);
        startActivity(i);
    }
    public void play4(View view)
    {
        Intent i = new Intent(this,Play4.class);
        startActivity(i);
    }

}
