package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.SignInButton;

public class MainActivity extends AppCompatActivity {

    public static String initilization="Nomode";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        findViewById(R.id.phone_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initilization="Phone";
                Intent intent = new Intent(MainActivity.this, phonelog.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.google_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initilization="Google";
                Intent intent = new Intent(MainActivity.this, googleLog.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.guest_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initilization="Guest";
                Intent intent = new Intent(MainActivity.this, navigation_bar.class);
                startActivity(intent);

            }
        });

    }
}
