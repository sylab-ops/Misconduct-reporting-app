package com.example.misconductreporting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void gotoLogin(View view) {
        Intent intent1 = new Intent(this, Login.class);
        startActivity(intent1);
        finish();
    }
}