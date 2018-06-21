package com.f20170270.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class gratitude extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gratitude);

        int number = getIntent().getExtras().getInt("answer");
        TextView t1 = (TextView)findViewById(R.id.answer);
        t1.setText(Integer.toString(number));


    }

        public void cont(View v)
        {
            Intent i1 = new Intent(this, thank.class);
            startActivity(i1);

        }

}
