package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WhenActivity extends AppCompatActivity {

    Button btnNext3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_when);

        btnNext3 = findViewById(R.id.btnNext3);


        //Dairy next Button Handler
        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(WhenActivity.this, whoActivity.class));
            }
        });
    }
}
