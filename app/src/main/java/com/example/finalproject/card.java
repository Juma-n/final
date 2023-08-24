package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        TextView insta = findViewById(R.id.insta);
        TextView face = findViewById(R.id.face);
        TextView twe = findViewById(R.id.twe);

    insta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Uri uri = Uri.parse("https://www.facebook.com/login/");
            Intent i = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(i);

        }
    });

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/login/");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);

            }
        });


        twe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/login/");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);

            }
        });




    }
}