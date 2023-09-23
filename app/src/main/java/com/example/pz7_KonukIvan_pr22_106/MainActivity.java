package com.example.pz7_KonukIvan_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked() == true) {
                    checkBox.setTextColor(Color.BLACK);
                    Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                    MainActivity.this.startActivity(intent);

                }
                else
                {
                    checkBox.setTextColor(Color.RED);
                }

            }
        });

    }



}
