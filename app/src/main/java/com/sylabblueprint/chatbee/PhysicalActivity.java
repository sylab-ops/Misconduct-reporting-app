package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhysicalActivity extends AppCompatActivity {

    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical);


        btnNext = findViewById(R.id.btnNext);


            //Dairy next Button Handler
        btnNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start LoginActivity
                    startActivity(new Intent(PhysicalActivity.this, WhereActivity.class));
                }
            });
    }
}

