package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ivBall = (ImageView)findViewById(R.id.ivBall);

        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        final Button btnAsk = (Button)findViewById(R.id.btnAsk);
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random acakBall = new Random();
                int acak = acakBall.nextInt(5);
                ivBall.setImageResource(ballArray[acak]);
            }
        });
    }
}
