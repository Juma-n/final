package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class pro4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro4);

        ImageView back4 = findViewById(R.id.backpro4);
        Button btnpro4 = findViewById(R.id.btnpro4);


        btnpro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro4.this,login.class);
                startActivity(i);
                Toast.makeText(pro4.this,"you should regist to add ", Toast.LENGTH_LONG).show();
            }
        });

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro4.this, womenclick.class);
                startActivity(i);
            }
        });
    }
}