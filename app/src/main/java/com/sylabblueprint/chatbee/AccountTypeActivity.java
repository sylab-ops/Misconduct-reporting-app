package com.sylabblueprint.chatbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AccountTypeActivity extends AppCompatActivity {
    TextView haveAccount;
    Button individualBtn, organizationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_type);

        haveAccount = findViewById(R.id.haveAccount);
        individualBtn = findViewById(R.id.individualBtn);
        organizationBtn = findViewById(R.id.organizationBtn);

        individualBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountTypeActivity.this, RegisterActivity.class));
            }
        });


        organizationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountTypeActivity.this, RegisterActivity.class));
            }
        });

        haveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountTypeActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}
