package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subWatches extends AppCompatActivity  implements View.OnClickListener  {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_watches );

        b1 = findViewById( R.id.wallclock);
        b2 = findViewById( R.id.stopwatch);
        b3 = findViewById( R.id.smartwatch);
        b4 = findViewById( R.id.fitnesswatch);
        b5 = findViewById( R.id.digitalwatch);
        b6 = findViewById( R.id.samsungwatch);
        b7 = findViewById( R.id.applewatch);
        b8 = findViewById( R.id.analoguewatch);
        b9 = findViewById( R.id.calculatorwatch);
        b10 = findViewById( R.id.alramclock);
        b11 = findViewById( R.id.tableclock);
        b12 = findViewById( R.id.othersub);

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
    }
    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.wallclock:
                maincategory.subcat="Wall clock";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.stopwatch:
                maincategory.subcat="Stop watch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.smartwatch:
                maincategory.subcat="Smart watch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.fitnesswatch:
                maincategory.subcat="Fitness watch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.digitalwatch:
                maincategory.subcat="Digital watch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.samsungwatch:
                maincategory.subcat="Samsung watch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.applewatch:
                maincategory.subcat="Apple watch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.analoguewatch:
                maincategory.subcat="Analogue watch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;
            case R.id.calculatorwatch:
                maincategory.subcat="Calculator watch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.alramclock:
                maincategory.subcat="Alarm Clock";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.tableclock:
                maincategory.subcat="Table clock";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.othersub:
                intent = new Intent(this, otherSub2.class);
                startActivity(intent);
                break;
        }


    }
}
