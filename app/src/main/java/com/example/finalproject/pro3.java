package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class pro3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro3);
        Button pro3btn = findViewById(R.id.pro3btn);
        ImageView back3 = findViewById(R.id.back3);


        pro3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro3.this,login.class);
                startActivity(i);
                Toast.makeText(pro3.this,"you should regist to add ", Toast.LENGTH_LONG).show();
            }
        });

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro3.this, womenclick.class);
                startActivity(i);
            }
        });

    }
}