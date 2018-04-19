package com.organization.hr.activityhandel;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class Play4 extends AppCompatActivity {
    int flag=0,flag2=0,flag3=0,flag4=0,flag5=0;

    ImageView img1,img2,img3,img4,img5,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17,
    img18,img19,img20,img21,img22,img23,img24,img25,img6;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.imag3);
        img4=(ImageView)findViewById(R.id.imag4);
        img5=(ImageView)findViewById(R.id.imag5);
        img6=(ImageView)findViewById(R.id.imag6);
        img7=(ImageView)findViewById(R.id.imag7);
        img8=(ImageView)findViewById(R.id.imag8);
        img9=(ImageView)findViewById(R.id.imag9);
        img10=(ImageView)findViewById(R.id.imag10);
        img11=(ImageView)findViewById(R.id.imag11);

        img12=(ImageView)findViewById(R.id.imag12);
        img13=(ImageView)findViewById(R.id.imag13);
        img14=(ImageView)findViewById(R.id.imag14);
        img15=(ImageView)findViewById(R.id.img15);
        img16=(ImageView)findViewById(R.id.imag16);
        img17=(ImageView)findViewById(R.id.imag17);
        img18=(ImageView)findViewById(R.id.imag18);


        img19=(ImageView)findViewById(R.id.img19);
        img20=(ImageView)findViewById(R.id.imag20);
        img21=(ImageView)findViewById(R.id.img21);
        img22=(ImageView)findViewById(R.id.img22);
        img23=(ImageView)findViewById(R.id.imag23);
        img24=(ImageView)findViewById(R.id.img24);
        img25=(ImageView)findViewById(R.id.imag25);

        // InVisiblity of number making

        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.INVISIBLE);
        img5.setVisibility(View.INVISIBLE);
        img7.setVisibility(View.INVISIBLE);

        img10.setVisibility(View.INVISIBLE);
        img16.setVisibility(View.INVISIBLE);
        img20.setVisibility(View.INVISIBLE);
        img23.setVisibility(View.INVISIBLE);





    /*    img3.setOnLongClickListener(new myOnLongClickListener());
        img6.setOnLongClickListener(new myOnLongClickListener());


        img12.setOnLongClickListener(new myOnLongClickListener());
        img13.setOnLongClickListener(new myOnLongClickListener());

        img14.setOnLongClickListener(new myOnLongClickListener());
        img16.setOnLongClickListener(new myOnLongClickListener());


        img17.setOnLongClickListener(new myOnLongClickListener());


*/
        img6.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });

        img15.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent arg1) {
                  flag=1;
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
        img3.setOnTouchListener(new View.OnTouchListener() {

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
                flag = 0;
                return true;
            }
        });
        img12.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });

        img11.setOnTouchListener(new View.OnTouchListener() {

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
                flag = 0;
                return true;
            }
        });
        img18.setOnTouchListener(new View.OnTouchListener() {

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
                flag = 0;
                return true;
            }
        });



        img13.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });
        img8.setOnTouchListener(new View.OnTouchListener() {

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
                flag = 0;
                return true;
            }
        });

        img9.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });


        img14.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });

        img17.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });


        img19.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });
        img21.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });
        img10.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent arg1) {
                // TODO Auto-generated method stub
             //   ClipData clipData = ClipData.newPlainText("", "");

               // View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
        /*start the drag - contains the data to be dragged,
            metadata for this data and callback for drawing shadow*/
               // v.startDrag(clipData, shadowBuilder, v, 0);
                //        we're dragging the shadow so make the view invisible
               // v.setVisibility(View.INVISIBLE);
               // flag=0;
                img10.setVisibility(View.VISIBLE);
                return true;
            }
        });

        img25.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });
        img22.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });
        img24.setOnTouchListener(new View.OnTouchListener() {

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
                flag=0;
                return true;
            }
        });





        findViewById(R.id.layout1).setOnDragListener(new myDragListener(1));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }





    public void ten(View v)
    {
      img10.setVisibility(View.VISIBLE);

        flag3=1;


    }




    public void sixten(View v)
    {
        img16.setVisibility(View.VISIBLE);

        flag2=1;


    }

    public void twenty(View v)
    {

        img20.setVisibility(View.VISIBLE);
        flag4=1;


    }

    public void twentythree(View v)
    {

        img23.setVisibility(View.VISIBLE);
        flag5=1;


    }




    class myDragListener implements View.OnDragListener {
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
                    Toast.makeText(getApplicationContext(), "Drag Exited", Toast.LENGTH_LONG).show();
                    break;

                case DragEvent.ACTION_DROP:

                  if(flag==1)
                  {
                      img16.setVisibility(View.VISIBLE);

                      function_win();

                  }
                  else if(flag==0&&flag3==1)
                  {
                      img10.setVisibility(View.VISIBLE);
                      function_worng();
                  }
                  else if(flag==0&&flag2==1)
                  {
                      img16.setVisibility(View.VISIBLE);
                      function_worng();
                  }

                  else if(flag==0&&flag5==1)
                  {
                      img23.setVisibility(View.VISIBLE);
                      function_worng();
                  }

                  else if(flag==0&&flag4==1)
                  {
                      img20.setVisibility(View.VISIBLE);
                      function_worng();
                  }

                    else
                  {
                      function_worng();
                  }


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





    public void function_win()
    {


      Toast.makeText(getApplicationContext(),"YOU WIN ..!",Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,PLAY1.class);
        startActivity(i);

    }

    public void function_worng()
    {


        Toast.makeText(getApplicationContext(),"YOU Lose ..!",Toast.LENGTH_LONG).show();

       Intent i = new Intent(this,Lose.class);
        startActivity(i);


    }






}
