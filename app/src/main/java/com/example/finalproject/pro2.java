package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class pro2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro2);

        Button btn2 = findViewById(R.id.pro2btn);
        ImageView back2 = findViewById(R.id.back2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro2.this , login.class);
                startActivity(i);
                Toast.makeText(pro2.this,"you should regist to countinue ",Toast.LENGTH_LONG).show();

            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pro2.this , womenclick.class);
                startActivity(i);
            }
        });




    }
}