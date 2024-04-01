package com.example.finalproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class school_intro extends AppCompatActivity {
    int i = 0;
    ImageView imageView = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_intro);
        Button b_s = (Button) findViewById(R.id.exit_intro3);
        Button button = (Button)findViewById(R.id.id);
        imageView = (ImageView)findViewById(R.id.idphoto);

        b_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if( i == 0 ){
                    imageView.setImageResource(R.drawable.photo_u1);
                }
                else{
                    imageView.setImageResource(R.drawable.photo_u2);
                }
            }
        });
    }
}
