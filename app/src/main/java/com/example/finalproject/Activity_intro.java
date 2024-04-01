package com.example.finalproject;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_intro extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduce_myself);
        Button b_i = (Button)findViewById(R.id.exit_intro);
        b_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void onClick(View button){
        PopupMenu popup = new PopupMenu(this, button);

        popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.army:
                        Toast.makeText(Activity_intro.this, "3월 레이다병, 논산훈련소 입영예정",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ddi:
                        Toast.makeText(Activity_intro.this, "호랑이띠",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.girl:
                        Toast.makeText(Activity_intro.this, "없습니다...",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.s_state:
                        Toast.makeText(Activity_intro.this, "3학년 재학중",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
        popup.show();
    }
}
