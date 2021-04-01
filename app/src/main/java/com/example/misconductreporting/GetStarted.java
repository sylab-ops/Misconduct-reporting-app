package com.example.misconductreporting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GetStarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
    }

    public void gotoRegister(View view) {
        Intent intent1 = new Intent(this, Register.class);
        startActivity(intent1);
        finish();
    }

    public void gotoLogin(View view) {
        Intent intent1 = new Intent(this, Login.class);
        startActivity(intent1);
        finish();
    }

    public void gotoHomepage(View view) {
        Intent intent1 = new Intent(this, Homepage.class);
        startActivity(intent1);
        finish();
    }
}