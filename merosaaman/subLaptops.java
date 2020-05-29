package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.security.PrivateKey;

public class subLaptops extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_laptop );

        b1 = findViewById( R.id.asus);
        b2 = findViewById( R.id.dell);
        b3 = findViewById( R.id.lenovo);
        b4 = findViewById( R.id.hp);
        b5 = findViewById( R.id.apple);
        b6 = findViewById( R.id.samsung);
        b7 = findViewById( R.id.acer);
        b8 = findViewById( R.id.anylaptop);
        b9 = findViewById( R.id.othersub11);

        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
        b3.setOnClickListener( this );
        b4.setOnClickListener( this );
        b5.setOnClickListener( this );
        b6.setOnClickListener( this );
        b7.setOnClickListener( this );
        b8.setOnClickListener( this );
        b9.setOnClickListener( this );

/*
        findViewById(R.id.asus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maincategory.subcat = "asus";
                Intent intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.dell).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maincategory.subcat = "dell";
                Intent intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);

            }
        });*/
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.asus:
                maincategory.subcat="Asus";
                intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.dell:
                maincategory.subcat="Dell";
                intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.lenovo:
                maincategory.subcat="Lenovo";
                intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.hp:
                maincategory.subcat="Hp";
                intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.apple:
                maincategory.subcat="Apple";
                intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.samsung:
                maincategory.subcat="Samsung";
                intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.acer:
                maincategory.subcat="Acer";
                intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.anylaptop:
                maincategory.subcat="Any Laptop";
                intent = new Intent(subLaptops.this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.othersub11:
                intent = new Intent(subLaptops.this, otherSub2.class);
                startActivity(intent);
                break;
        }
    }
}
