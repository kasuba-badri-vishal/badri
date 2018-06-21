package com.f20170270.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.f20170270.quizapp1.Main2Activity;
import com.f20170270.quizapp1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View view)
    {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);

    }

    public void exit(View view)
    {
        Intent i = new Intent(this,Main9Activity.class);
        startActivity(i);
        finish();


    }

}
