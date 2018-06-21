package com.f20170270.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void confirm(View view)
    {
        finishAffinity();
    }


    public void returnback(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
