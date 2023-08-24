package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class pro1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro1);

        Button pro1btn = findViewById(R.id.pro1btn);
        ImageView back1 =findViewById(R.id.back1);


        pro1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro1.this,login.class);
                startActivity(i);
                Toast.makeText(pro1.this,"you should regist to countinue ",Toast.LENGTH_LONG).show();
            }
        });

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro1.this,womenclick.class);
                startActivity(i);

            }
        });
    }
}