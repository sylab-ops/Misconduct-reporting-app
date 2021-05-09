package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class createDiaryActivity extends AppCompatActivity {

    Button btnNext6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_diary);


        btnNext6 = findViewById(R.id.btnNext6);


        //Dairy next Button Handler
        btnNext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(createDiaryActivity.this, ContactsActivity.class));
            }
        });


    }
}
