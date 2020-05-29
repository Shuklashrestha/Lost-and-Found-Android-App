package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class chooseColor extends AppCompatActivity  implements View.OnClickListener{

    public static String colorSelection;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_choose_color );

        b1 = findViewById( R.id.red1);
        b2 = findViewById( R.id.blue1);
        b3 = findViewById( R.id.green1);
        b4 = findViewById( R.id.yellow1);
        b5 = findViewById( R.id.orange1);
        b6 = findViewById( R.id.brown1);
        b7 = findViewById( R.id.gray1);
        b8 = findViewById( R.id.black1);
        b9 = findViewById( R.id.white1);
        b10 = findViewById( R.id.silver1);
        b11 = findViewById( R.id.indigo1);
        b12 = findViewById( R.id.golden1);
        b13 = findViewById( R.id.lime1);
        b14 = findViewById( R.id.purple1);
        b15 = findViewById( R.id.pink1);
        b16 = findViewById( R.id.cyan1);

        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
        b3.setOnClickListener( this );
        b4.setOnClickListener( this );
        b5.setOnClickListener( this );
        b6.setOnClickListener( this );
        b7.setOnClickListener( this );
        b8.setOnClickListener( this );
        b9.setOnClickListener( this );
        b10.setOnClickListener( this );
        b11.setOnClickListener( this );
        b12.setOnClickListener( this );
        b13.setOnClickListener( this );
        b14.setOnClickListener( this );
        b15.setOnClickListener( this );
        b16.setOnClickListener( this );

     /*   findViewById(R.id.blue1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorSelection= "blue";
                Intent intent = new Intent(chooseColor.this, MapsActivity.class);
                startActivity(intent);

            }
        }); */
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {

            case R.id.red1:
                colorSelection="Red";
                break;

            case R.id.blue1:
                colorSelection="Blue";
                break;

            case R.id.green1:
                colorSelection="Green";
                break;

            case R.id.yellow1:
                colorSelection="Yellow";
                break;

            case R.id.orange1:
                colorSelection="Orange";
                break;

            case R.id.brown1:
                colorSelection="Brown";
                break;

            case R.id.gray1:
                colorSelection="Gray";
                break;

            case R.id.black1:
                colorSelection="Black";
                break;

            case R.id.white1:
                colorSelection="White";
                break;

            case R.id.silver1:
                colorSelection="Silver";
                break;

            case R.id.indigo1:
                colorSelection="Indigo";
                break;

            case R.id.golden1:
                colorSelection="Golden";
                break;

            case R.id.lime1:
                colorSelection="Lime";
                break;

            case R.id.purple1:
                colorSelection="Purple";
                break;

            case R.id.pink1:
                colorSelection="Pink";
                break;

            case R.id.cyan1:
                colorSelection="Cyan";
                break;

        }

        intent = new Intent(chooseColor.this, MapsActivity.class);
        startActivity(intent);
    }
}
