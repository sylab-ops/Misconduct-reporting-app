package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class BehaviourCategoryActivity extends AppCompatActivity {
    Button btnPhysical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behaviour_category);

        btnPhysical = findViewById(R.id.btnPhysical);

            //Dairy next Button Handler
        btnPhysical.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start LoginActivity
                    startActivity(new Intent(BehaviourCategoryActivity.this, PhysicalActivity.class));
                }
            });
        }
    }