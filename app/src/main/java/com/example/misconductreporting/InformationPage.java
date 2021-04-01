package com.example.misconductreporting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InformationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_page);
    }

    public void gotoHomepage(View view) {
//        Intent intent1 = new Intent(this, Homepage.class);
//        startActivity(intent1);
        finish();
    }

}