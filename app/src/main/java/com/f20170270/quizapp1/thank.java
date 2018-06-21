package com.f20170270.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank);
    }
    public void home(View v)
    {
        Intent i1 = new Intent(this, MainActivity.class);
        startActivity(i1);
    }

    public void answer(View v)
    {
        Intent i1 = new Intent(this, answers.class);
        startActivity(i1);
    }

    public void exit2(View v)
    {
        Intent i1 = new Intent(this, level2.class);
        startActivity(i1);

    }

}
