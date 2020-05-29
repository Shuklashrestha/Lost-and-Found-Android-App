package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subCards extends AppCompatActivity  implements View.OnClickListener  {


    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_cards );

        b1 = findViewById( R.id.studentcard);
        b2 = findViewById( R.id.passport);
        b3 = findViewById( R.id.keycard);
        b4 = findViewById( R.id.giftcard);
        b5 = findViewById( R.id.drivinglicense);
        b6 = findViewById( R.id.idcard);
        b7 = findViewById( R.id.creditcard);
        b8 = findViewById( R.id.debitcard);
        b9 = findViewById( R.id.businesscard);
        b10 = findViewById( R.id.ace);
        b11 = findViewById( R.id.atm);
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
            case R.id.studentcard:
                maincategory.subcat="Student Card";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.passport:
                maincategory.subcat="Passport";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.keycard:
                maincategory.subcat="Key Card";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.giftcard:
                maincategory.subcat="Gift card";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.drivinglicense:
                maincategory.subcat="Driving License";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.idcard:
                maincategory.subcat="ID card";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.creditcard:
                maincategory.subcat="Credit card";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.debitcard:
                maincategory.subcat="Debit card";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.businesscard:
                maincategory.subcat="Business card";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.ace:
                maincategory.subcat="ACE";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.atm:
                maincategory.subcat="ATM";
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
