package com.f20170270.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    int i=0;
    public void fun1(View v)
    {
        i=1;
    }

    public void fun2(View v)
    {
        i=2;
    }

    public void fun3(View v)
    {
        i=3;
    }

    public void fun4(View v)
    {
        i=4;
    }

    public void fun5(View v)
    {
        i=5;
    }

    public void fun6(View v)
    {
        i=6;
    }

    public void fun7(View v)
    {
        i=7;
    }
    public void fun8(View v)
    {
        i=8;
    }


    public void submit(View v)
    {
        switch(i)
        {
            case 1: Intent i1 = new Intent(this, scroll8.class);
               startActivity(i1);

                break;

            case 2: Intent i2 = new Intent(this, scroll7.class);
                startActivity(i2);

                break;

            case 3: Intent i3 = new Intent(this, scroll6.class);
                startActivity(i3);

                break;

            case 4: Intent i4 = new Intent(this, scroll5.class);
                startActivity(i4);

                break;

            case 5: Intent i5 = new Intent(this, scroll4.class);
                startActivity(i5);



                break;

            case 6: Intent i6 = new Intent(this, scroll3.class);
                startActivity(i6);

                break;

            case 7: Intent i7 = new Intent(this, scroll2.class);
                startActivity(i7);

                break;

            case 8: Intent i8 = new Intent(this, scroll.class);
                startActivity(i8);

                break;


        }



   }
}
