package com.f20170270.quizapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class scroll5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll5);

    }
    int i=0;
    public void fun1(RadioButton v)
    {
        if(v.isChecked())
            i=1;
    }
    public void fun2(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }
    public void fun3(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }
    public void fun4(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }
    public void fun5(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }
    public void fun6(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }
    public void fun7(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }
    public void fun8(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }
    public void fun9(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }
    public void fun10(RadioButton v)
    {
        if(v.isChecked())
            i=i+1;
    }

    int j=0;
    public void submit(View v) {
        fun1((RadioButton)findViewById(R.id.ans1));
        fun2((RadioButton)findViewById(R.id.ans2));
        fun3((RadioButton)findViewById(R.id.ans3));
        fun4((RadioButton)findViewById(R.id.ans4));
        fun5((RadioButton)findViewById(R.id.ans5));
        fun6((RadioButton)findViewById(R.id.ans6));
        fun7((RadioButton)findViewById(R.id.ans7));
        fun8((RadioButton)findViewById(R.id.ans8));
        fun9((RadioButton)findViewById(R.id.ans9));
        fun10((RadioButton)findViewById(R.id.ans10));

        Toast.makeText(getApplicationContext(),"correct answers are:  " + i,Toast.LENGTH_SHORT).show();
        Intent i1 = new Intent(this, gratitude.class);
        i1.putExtra("k", i);
        startActivity(i1);
    }


}
