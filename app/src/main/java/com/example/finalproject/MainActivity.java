package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(i);

            }
        }, 2000);




//        TextView click = findViewById(R.id.start);
//
//        click.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this,MainActivity2.class);
//                startActivity(i);
//            }
//        });
    }
}