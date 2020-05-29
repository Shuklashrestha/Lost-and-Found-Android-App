package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subKeys extends AppCompatActivity  implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_keys );

        b1 = findViewById( R.id.laguage);
        b2 = findViewById( R.id.lockkey);
        b3 = findViewById( R.id.homekey);
        b4 = findViewById( R.id.bikekey);
        b5 = findViewById( R.id.carkey);
        b6 = findViewById( R.id.othersub);

        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
        b3.setOnClickListener( this );
        b4.setOnClickListener( this );
        b5.setOnClickListener( this );
        b6.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.laguage:
                maincategory.subcat="Laguage key";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.lockkey:
                maincategory.subcat="Lock key";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.homekey:
                maincategory.subcat="Home key";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.bikekey:
                maincategory.subcat="Bike key";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.carkey:
                maincategory.subcat="Car key";
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
