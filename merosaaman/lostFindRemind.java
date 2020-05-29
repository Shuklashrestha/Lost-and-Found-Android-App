package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lostFindRemind extends AppCompatActivity {

    public static String task = navigation_bar.task;

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lost_find_remind );


        findViewById(R.id.lost_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task = "LS";
                Intent intent = new Intent(lostFindRemind.this, maincategory.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.found_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task = "FS";
                Intent intent = new Intent(lostFindRemind.this, maincategory.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.remind_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //task = "RemindSomething";
           //     Intent intent = new Intent(lostFindRemind.this, mode_selection.class);
             //   Intent intent = new Intent(lostFindRemind.this, lostDatabaseRetrieve.class);
             //   Intent intent = new Intent(lostFindRemind.this, DatabaseForLost.class);

             //   Intent intent = new Intent(lostFindRemind.this, getNotification.class);
              //  Intent intent = new Intent(lostFindRemind.this, profile.class);
                Intent intent = new Intent(lostFindRemind.this, navigation_bar.class);
                startActivity(intent);

            }
        });
    } */
}
