package com.organization.hr.activityhandel;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class play3 extends AppCompatActivity {

    ImageView imgTr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        imgTr = (ImageView)findViewById(R.id.imgTr);
        imgTr.setVisibility(View.INVISIBLE);

        findViewById(R.id.img1).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img2).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img3).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img4).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img5).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img6).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img7).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img8).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img9).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img10).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img11).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img12).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img13).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img14).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img15).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img16).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img17).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img18).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.img19).setOnLongClickListener(new myOnLongClickListener());
        findViewById(R.id.imgAns).setOnLongClickListener(new myOnLongClickListener());
      




       /* findViewById(R.id.imgTarget).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img1).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img2).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img3).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img4).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img5).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img6).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img7).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img8).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img9).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img10).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img11).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img12).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img13).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img14).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img15).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img16).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img17).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img18).setOnDragListener(new myDragListener(1));
        findViewById(R.id.img19).setOnDragListener(new myDragListener(1));*/

        findViewById(R.id.fullLayout).setOnDragListener(new myDragListener(1));
       // findViewById(R.id.baselayout).setOnDragListener(new myDragListener(1));
















        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    class myOnLongClickListener implements OnLongClickListener {


        public boolean onLongClick(View v) {
            ClipData clipData = ClipData.newPlainText("", "");

            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
        /*start the drag - contains the data to be dragged,
            metadata for this data and callback for drawing shadow*/
            v.startDrag(clipData, shadowBuilder, v, 0);
            //        we're dragging the shadow so make the view invisible
            v.setVisibility(View.INVISIBLE);
            return true;
        }
    }



    class myDragListener implements OnDragListener {
        private int num;
        public myDragListener( int num)
        {
            super();
            this.num=num;
        }

        public boolean onDrag(View v, DragEvent event) {
            int action=event.getAction();


            switch (action)
            {
                case DragEvent.ACTION_DRAG_STARTED:
                    Log.i("script", num + "- ACTION_DRAG_STARTED");
                    if(event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN))
                      {return (true);}
                   return  (false);


                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("script", num + "- ACTION_DRAG_ENTERED");
                      v.setBackgroundColor(Color.WHITE);
                    break;
                case DragEvent.ACTION_DRAG_LOCATION:
                    Log.i("script", num + "- ACTION_DRAG_LOCATION");
                    break;

                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("script", num + "- ACTION_DRAG_ENTERED");
                    v.setBackgroundColor(Color.WHITE);
                    Toast.makeText(getApplicationContext(),"Drag Exited",Toast.LENGTH_LONG).show();
                    break;

                case DragEvent.ACTION_DROP:
                   /* Log.i("script", num + "- ACTION_DROP");
                    View view=(View) event.getLocalState();
                    ViewGroup owner =(ViewGroup) view.getParent();
                    owner.removeView(view);
                    LinearLayout continer =(LinearLayout) v;
                    continer.addView(view);
                    view.setVisibility(view.VISIBLE);
                    function();
                    break;*/

                    imgTr.setVisibility(View.VISIBLE);
                    /*Log.i("script", num + "- ACTION_DROP");
                    View view=(View) event.getLocalState();
                    ViewGroup owner =(ViewGroup) view.getParent();
                    owner.removeView(view);

                    LinearLayout continer =(LinearLayout) v;
                    switch (v.getId())
                    {
                        case R.id.img5 :
                            continer.addView(view);
                            view.setVisibility(view.VISIBLE);
                            function();

                            break;
                        default:
                            wrong();
                    }

*/                         function();


                     break;




                case DragEvent.ACTION_DRAG_ENDED:
                    Log.i("script", num + "- ACTION_DRAG_ENDED");
                    break;

                default:

                    break;


            }

            return (true);
        }
    }





    private void  function() {

        TextView score =(TextView)findViewById(R.id.score);
        score.setText("3");
        Toast.makeText(getApplicationContext(),"You win ...! ",
                Toast.LENGTH_SHORT).show();

    }

    private void  wrong()
    {
        Toast.makeText(getApplicationContext(),"worng answer ...! ",
                Toast.LENGTH_SHORT).show();
    }



}







