package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiaryHistoryActivity extends AppCompatActivity {

    Button btnaddicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_history);
        btnaddicon = findViewById(R.id.btnNext);


        //Dairy next Button Handler
        btnaddicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(DiaryHistoryActivity.this, ReportTypesActivity.class));
            }
        });
    }
}
