package com.sylabblueprint.chatbee;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ContactsActivity extends AppCompatActivity {
    Button button3, button4, button2,button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        button4 = findViewById(R.id.button4);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button = findViewById(R.id.button);


        //Dairy next Button Handler

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(ContactsActivity.this, ConfirmAppointmentActivity.class));
            }

        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(ContactsActivity.this, ConfirmAppointmentActivity.class));
            }

        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(ContactsActivity.this, ConfirmAppointmentActivity.class));
            }

        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(ContactsActivity.this, ConfirmAppointmentActivity.class));
            }

        });
    }
}