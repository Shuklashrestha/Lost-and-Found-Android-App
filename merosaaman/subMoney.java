package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subMoney extends AppCompatActivity  implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_money );

        b1 = findViewById( R.id.japaneseyen);
        b2 = findViewById( R.id.turkishlire);
        b3 = findViewById( R.id.saudiriyal);
        b4 = findViewById( R.id.notes);
        b5 = findViewById( R.id.mauritius);
        b6 = findViewById( R.id.indian);
        b7 = findViewById( R.id.euro);
        b8 = findViewById( R.id.dollor);
        b9 = findViewById( R.id.coin);
        b10 = findViewById( R.id.ruble);
        b11 = findViewById( R.id.chinese);
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
            case R.id.japaneseyen:
                maincategory.subcat="Japanese yen";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.turkishlire:
                maincategory.subcat="Turkish Lire";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);

                break;


            case R.id.saudiriyal:
                maincategory.subcat="Saudi riyal";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.notes:
                maincategory.subcat="Notes";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.mauritius:
                maincategory.subcat="Mauritius";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.indian:
                maincategory.subcat="Indian ruppee";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.euro:
                maincategory.subcat="Euro";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.dollor:
                maincategory.subcat="Dollor";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.coin:
                maincategory.subcat="Coins";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.ruble:
                maincategory.subcat="Ruble";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.chinese:
                maincategory.subcat="Chinese";
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
