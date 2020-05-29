package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mode_selection extends AppCompatActivity {

    public static String mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mode_selection );

        findViewById(R.id.steady1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode="SM";
                Intent intent = new Intent(mode_selection.this, mapStart.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.ride1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode="RM";
                Intent intent = new Intent(mode_selection.this, mapStart.class);
                startActivity(intent);

            }
        });
    }
}
