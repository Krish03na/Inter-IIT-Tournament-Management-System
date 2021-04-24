package com.example.interiitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Homescreen extends AppCompatActivity {
      ImageView leaderboard,matchresult,schedule;
      ImageView menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        //binding the images with the variables
        leaderboard = findViewById(R.id.leaderboard);
        matchresult = findViewById(R.id.matchresult);
        schedule = findViewById(R.id.schedule);

        menu = findViewById(R.id.menu);

        leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homescreen.this,Leaderboard.class);
                startActivity(intent);
            }
        });
    }
}