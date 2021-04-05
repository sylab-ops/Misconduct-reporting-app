package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sylabblueprint.chatbee.adapters.AdapterChat;
import com.sylabblueprint.chatbee.adapters.AdapterUsers;
import com.sylabblueprint.chatbee.adapters.ChatActivity;

public class main_dashboardActivity extends AppCompatActivity {

    //views
    Button btndiary, btnchat, btncontact, btninfo, btnprofile, btnsetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        btndiary = findViewById(R.id.btndiary);
        btnchat = findViewById(R.id.btnchat);
        btncontact = findViewById(R.id.btncontact);
        btninfo = findViewById(R.id.btninfo);
        btnprofile = findViewById(R.id.btnprofile);
        btnsetting = findViewById(R.id.btnsetting);



        //Dairy Button Handler
        btndiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(main_dashboardActivity.this, DiaryActivity.class));
            }
        });


        //Chat Button Handler
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(main_dashboardActivity.this, DashboardActivity.class));
            }
        });

        //Contact Button Handler
        btncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(main_dashboardActivity.this, ContactsActivity.class));
            }
        });

        //Information Button Handler
        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(main_dashboardActivity.this, InfoActivity.class));
            }
        });

        //Profile Button Handler
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(main_dashboardActivity.this, DashboardActivity.class));
            }
        });

        //Setting Button Handler
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(main_dashboardActivity.this, DashboardActivity.class));
            }
        });
    }
}
