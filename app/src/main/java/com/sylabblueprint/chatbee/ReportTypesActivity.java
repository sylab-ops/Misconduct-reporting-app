package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReportTypesActivity extends AppCompatActivity {
    Button btnself, btnwitness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_types);

        btnself = findViewById(R.id.btnself);
        btnwitness = findViewById(R.id.btnwitness);

        btnself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReportTypesActivity.this, BehaviourCategoryActivity.class));
            }
        });

        btnwitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReportTypesActivity.this, BehaviourCategoryActivity.class));
            }
        });
    }
}
