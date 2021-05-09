package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DesiredoutcomeActivity extends AppCompatActivity {

    Button btnNext5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desiredoutcome);

        btnNext5 = findViewById(R.id.btnNext5);


        //Dairy next Button Handler
        btnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(DesiredoutcomeActivity.this, PreviewActivity.class));
            }
        });
    }
}
