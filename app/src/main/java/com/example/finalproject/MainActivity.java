package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_i = (Button)findViewById(R.id.myself);
        Button b_f = (Button)findViewById(R.id.family);
        Button b_s = (Button)findViewById(R.id.school);

        b_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Activity_intro.class);
                startActivity(intent);
            }
        });

        b_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        family_intro.class);
                startActivity(intent);
            }
        });

        b_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        school_intro.class);
                startActivity(intent);
            }
        });

        startActivity(new Intent(this, Loading.class));

    }
}
