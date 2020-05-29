package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subGarments extends AppCompatActivity implements View.OnClickListener  {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_garments );

        b1 = findViewById( R.id.coat);
        b2 = findViewById( R.id.cardigan);
        b3 = findViewById( R.id.doctorcoat);
        b4 = findViewById( R.id.furcoat);
        b5 = findViewById( R.id.gown);
        b6 = findViewById( R.id.headgear);
        b7 = findViewById( R.id.hooded);
        b8 = findViewById( R.id.jeans);
        b9 = findViewById( R.id.leather);
        b10 = findViewById( R.id.polo);
        b11 = findViewById( R.id.tshirt);
        b12 = findViewById( R.id.lifevest);
        b13 = findViewById( R.id.tie);
        b14 = findViewById( R.id.varsity);
        b15 = findViewById( R.id.safety);
        b16 = findViewById( R.id.rugby);
        b17 = findViewById( R.id.bow);
        b18 = findViewById( R.id.socks);
        b19 = findViewById( R.id.soccertshirt);
        b20 = findViewById( R.id.scarf);
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
            case R.id.coat:
                maincategory.subcat="Coat";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.cardigan:
                maincategory.subcat="Cardigan";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.doctorcoat:
                maincategory.subcat="Doctor coat";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.furcoat:
                maincategory.subcat="Furcoat";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.gown:
                maincategory.subcat="Gown";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.headgear:
                maincategory.subcat="Head Gear";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.hooded:
                maincategory.subcat="Hooded jacket";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.jeans:
                maincategory.subcat="Jeans";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.leather:
                maincategory.subcat="Leather Jacket";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.polo:
                maincategory.subcat="Polo";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.tshirt:
                maincategory.subcat="T-shirt";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.lifevest:
                maincategory.subcat="Life vest";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.tie:
                maincategory.subcat="Tie";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.varsity:
                maincategory.subcat="Varsity jacket";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.safety:
                maincategory.subcat="Saftety Jacket";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.rugby:
                maincategory.subcat="Rugby belt";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.bow:
                maincategory.subcat="Bow tie";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.socks:
                maincategory.subcat="Socks";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.soccertshirt:
                maincategory.subcat="Soccer T-shirt";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.scarf:
                maincategory.subcat="Scraf";
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
