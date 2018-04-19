package com.organization.hr.activityhandel;



import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.content.ClipData;
import android.content.ClipDescription;
import android.view.View.OnDragListener;

import android.view.View.OnLongClickListener;
import android.view.DragEvent;
import android.util.Log;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.widget.ImageView;
import android.widget.Toast;


public class play2 extends AppCompatActivity  {







    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView b, c, e, f, g, h, i, j, k, l, m, n, r, s, o, p, q;
        final ImageView imgTarget = (ImageView) findViewById(R.id.imgans);
        imgTarget.setVisibility(View.INVISIBLE);




        final ImageView imgAnswer = (ImageView) findViewById(R.id.d);
        final ImageView a = (ImageView) findViewById(R.id.a);

        b = (ImageView) findViewById(R.id.b);
        c = (ImageView) findViewById(R.id.c);
        e = (ImageView) findViewById(R.id.e);
        f = (ImageView) findViewById(R.id.f);
        g = (ImageView) findViewById(R.id.g);
        h = (ImageView) findViewById(R.id.h);
        i = (ImageView) findViewById(R.id.i);
        j = (ImageView) findViewById(R.id.j);
        k = (ImageView) findViewById(R.id.k);
        l = (ImageView) findViewById(R.id.l);
        m = (ImageView) findViewById(R.id.n);
        n = (ImageView) findViewById(R.id.n);
        o = (ImageView) findViewById(R.id.o);
        p = (ImageView) findViewById(R.id.p);
        q = (ImageView) findViewById(R.id.q);
        r = (ImageView) findViewById(R.id.r);
        s = (ImageView) findViewById(R.id.s);


        //onclick listener
       /* findViewById(R.id.b).setOnLongClickListener(listener);
        findViewById(R.id.c).setOnLongClickListener(listener);
        findViewById(R.id.d).setOnLongClickListener(listener);
        findViewById(R.id.e).setOnLongClickListener(listener);
        findViewById(R.id.f).setOnLongClickListener(listener);

        findViewById(R.id.g).setOnLongClickListener(listener);
        findViewById(R.id.h).setOnLongClickListener(listener);
        findViewById(R.id.i).setOnLongClickListener(listener);
        findViewById(R.id.j).setOnLongClickListener(listener);
        findViewById(R.id.k).setOnLongClickListener(listener);
        findViewById(R.id.l).setOnLongClickListener(listener);
        findViewById(R.id.m).setOnLongClickListener(listener);
        findViewById(R.id.n).setOnLongClickListener(listener);
        findViewById(R.id.o).setOnLongClickListener(listener);
        findViewById(R.id.p).setOnLongClickListener(listener);
        findViewById(R.id.q).setOnLongClickListener(listener);
        findViewById(R.id.r).setOnLongClickListener(listener);
        findViewById(R.id.s).setOnLongClickListener(listener);

*/

        a.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "A ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        b.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });


        c.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "A ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        e.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        f.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "A ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        g.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });


        h.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "A ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        i.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });


        j.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "A ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        k.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });


        l.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "A ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        m.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });
        n.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });
        o.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "A ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        p.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });


        q.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "A ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });

        r.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });


        s.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), "B ",
                        Toast.LENGTH_SHORT).show();

                return true;    // <- set to true
            }
        });
        imgAnswer.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(), " image asnwer... ",
                        Toast.LENGTH_SHORT).show();

                imgAnswer.setOnLongClickListener(this);
                return true;    // <- set to true
            }
        });
           imgTarget.setOnDragListener(new View.OnDragListener() {

            @Override
            public boolean onDrag(View v, DragEvent event) {
                // TODO Auto-generated method stub
                final int action = event.getAction();
                switch (action) {

                    case DragEvent.ACTION_DRAG_STARTED:
                        break;

                    case DragEvent.ACTION_DRAG_EXITED:
                        break;

                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;

                    case DragEvent.ACTION_DROP: {
                      //  failure = failure + 1;
                        return (true);
                    }

                    case DragEvent.ACTION_DRAG_ENDED: {
                      /*  total = total + 1;
                        int suc = total - failure;
                        sucess.setText("Sucessful Drops :" + suc);
                        text.setText("Total Drops: " + total);*/
                        return (true);

                    }

                    default:
                        break;
                }
                return true;
            }
        });
        imgAnswer.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent arg1) {
                // TODO Auto-generated method stub
                ClipData clipData = ClipData.newPlainText("", "");

                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
        /*start the drag - contains the data to be dragged,
            metadata for this data and callback for drawing shadow*/
                v.startDrag(clipData, shadowBuilder, v, 0);
                //        we're dragging the shadow so make the view invisible
                v.setVisibility(View.INVISIBLE);
                return true;
            }
        });













        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();








            }
        });
    }












    }
