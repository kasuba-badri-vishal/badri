package com.f20170270.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class level2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
    }
    public void confirm(View view)
    {
        finishAffinity();

    }


    public void returnba(View view)
    {
        Intent i = new Intent(this,thank.class);
        startActivity(i);
    }
}
