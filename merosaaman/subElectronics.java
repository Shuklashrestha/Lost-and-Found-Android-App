package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subElectronics extends AppCompatActivity  implements View.OnClickListener  {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_electronics );

        b1 = findViewById( R.id.speaker);
        b2 = findViewById( R.id.ipod);
        b3 = findViewById( R.id.camera);
        b4 = findViewById( R.id.charger);
        b5 = findViewById( R.id.console);
        b6 = findViewById( R.id.headphones);
        b7 = findViewById( R.id.earphones);
        b8 = findViewById( R.id.ipad);
        b9 = findViewById( R.id.ipod2);
        b10 = findViewById( R.id.joystick);
        b11 = findViewById( R.id.microphone);
        b12 = findViewById( R.id.mouse);
        b13 = findViewById( R.id.pendrive);
        b14 = findViewById( R.id.chargingdock);
        b15 = findViewById( R.id.webcam);
        b16 = findViewById( R.id.playstation);
        b17 = findViewById( R.id.wakietalkie);
        b18 = findViewById( R.id.tablet);
        b19 = findViewById( R.id.psp);
        b20 = findViewById( R.id.videocamera);
        b21 = findViewById( R.id.othersub);

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
        b17.setOnClickListener( this );
        b18.setOnClickListener( this );
        b19.setOnClickListener( this );
        b20.setOnClickListener( this );
        b21.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.speaker:
                maincategory.subcat="Speaker";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.ipod:
                maincategory.subcat="Ipod";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.camera:
                maincategory.subcat="Camera";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.charger:
                maincategory.subcat="Charger";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.console:
                maincategory.subcat="Console";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.headphones:
                maincategory.subcat="HeadPhones";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.earphones:
                maincategory.subcat="Earphones";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.ipad:
                maincategory.subcat="Ipad";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.ipod2:
                maincategory.subcat="Ipod";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.joystick:
                maincategory.subcat="Joystick";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.microphone:
                maincategory.subcat="Microphone";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.mouse:
                maincategory.subcat="Mouse";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.pendrive:
                maincategory.subcat="Pendrive";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.chargingdock:
                maincategory.subcat="Charging Dock";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.webcam:
                maincategory.subcat="Webcam";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.playstation:
                maincategory.subcat="Playstation";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.wakietalkie:
                maincategory.subcat="Walkie Talkie";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.tablet:
                maincategory.subcat="Tablet";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.psp:
                maincategory.subcat="Psp";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.videocamera:
                maincategory.subcat="Videocamera";
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
