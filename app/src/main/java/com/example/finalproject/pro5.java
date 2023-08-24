package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class pro5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro5);
        ImageView back5 = findViewById(R.id.backpro5);
        Button btnpro5 = findViewById(R.id.btnpro5);

        btnpro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro5.this,login.class);
                startActivity(i);
                Toast.makeText(pro5.this,"you should regist to add ", Toast.LENGTH_LONG).show();
            }
        });

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro5.this, womenclick.class);
                startActivity(i);
            }
        });


    }
}