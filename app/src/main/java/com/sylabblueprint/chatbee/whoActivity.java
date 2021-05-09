package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class whoActivity extends AppCompatActivity {
    Button btnNext4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);
        btnNext4 = findViewById(R.id.btnNext4);


        //Dairy next Button Handler
        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(whoActivity.this, DesiredoutcomeActivity.class));
            }
        });
    }
}
