package com.example.interiitapp;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button signparticipant,signadmin,continueguest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signparticipant = findViewById(R.id.button2);
        signadmin = findViewById(R.id.button3);
        continueguest = findViewById(R.id.button4);

        signparticipant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Homescreen.class);
                startActivity(intent);
            }
        });

        signadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Homescreen.class);
                startActivity(intent);
            }
        });

        continueguest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Homescreen.class);
                startActivity(intent);
            }
        });
    }
}