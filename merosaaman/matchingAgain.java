package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class matchingAgain extends AppCompatActivity {

    public static String myphoneno="9847260218";
    public static String myemail="shukla.sth@gmail.com";
    public static Integer matchingid = 73;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_matching_again );


        findViewById(R.id.loosing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matchingAgain.this, matching.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.finding).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matchingAgain.this, matching.class);
                startActivity(intent);

            }
        });
    }
}
