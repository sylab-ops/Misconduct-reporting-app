package com.sylabblueprint.chatbee;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DiaryActivity extends AppCompatActivity {

    Button btnnext;
    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        getSupportActionBar().setTitle("Diary");

        btnnext = findViewById(R.id.btnnext);

        //Dairy next Button Handler
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start LoginActivity
                startActivity(new Intent(DiaryActivity.this, DiaryHistoryActivity.class));
            }
        });


            final ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setTitle(null);

            compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
            compactCalendar.setUseThreeLetterAbbreviation(true);

            //Set an event for Teachers' Professional Day 2016 which is 21st of October

            Event ev1 = new Event(Color.RED, 1477040400000L, "Teachers' Professional Day");
            compactCalendar.addEvent(ev1);

            compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
                @Override
                public void onDayClick(Date dateClicked) {
                    Context context = getApplicationContext();

                    if (dateClicked.toString().compareTo("Fri Oct 21 00:00:00 AST 2016") == 0) {
                        Toast.makeText(context, "Teachers' Professional Day", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(context, "No Events Planned for that day", Toast.LENGTH_SHORT).show();
                    }


                }

                @Override
                public void onMonthScroll(Date firstDayOfNewMonth) {
                    actionBar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
                }
            });

        }



    }
