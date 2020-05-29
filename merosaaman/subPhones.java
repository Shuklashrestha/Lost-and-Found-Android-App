package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subPhones extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_mobile );


        b1 = findViewById( R.id.oppo);
        b2 = findViewById( R.id.philips);
        b3 = findViewById( R.id.samsungmobile);
        b4 = findViewById( R.id.sony);
        b5 = findViewById( R.id.vivo);
        b6 = findViewById( R.id.zte);
        b7 = findViewById( R.id.htc);
        b8 = findViewById( R.id.huawei);
        b9 = findViewById( R.id.motrola);
        b10 = findViewById( R.id.lg);
        b11 = findViewById( R.id.nokia);
        b12 = findViewById( R.id.o2);
        b13 = findViewById( R.id.windowsmobile);
        b14 = findViewById( R.id.anymobile);
        b15 = findViewById( R.id.othersub);

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
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.oppo:
                maincategory.subcat="Oppo";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.philips:
                maincategory.subcat="Philips";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.samsungmobile:
                maincategory.subcat="Samsung";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.sony:
                maincategory.subcat="Sony";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.vivo:
                maincategory.subcat="Vivo";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.zte:
                maincategory.subcat="ZTE";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.htc:
                maincategory.subcat="HTC";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.huawei:
                maincategory.subcat="Huawai";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.motrola:
                maincategory.subcat="Motorola";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.lg:
                maincategory.subcat="LG";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.nokia:
                maincategory.subcat="Nokia";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.o2:
                maincategory.subcat="02";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.windowsmobile:
                maincategory.subcat="Window mobile";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.anymobile:
                maincategory.subcat="Any mobile";
                intent = new Intent(subPhones.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.othersub:
                intent = new Intent(subPhones.this, otherSub2.class);
                startActivity(intent);
                break;
        }

    }

}
