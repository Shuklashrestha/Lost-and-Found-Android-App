package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subBags extends AppCompatActivity  implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_bags );

        b1 = findViewById( R.id.wallet);
        b2 = findViewById( R.id.handbag);
        b3 = findViewById( R.id.backpack);
        b4 = findViewById( R.id.grocery);
        b5 = findViewById( R.id.basket);
        b6 = findViewById( R.id.beach);
        b7 = findViewById( R.id.briefcase);
        b8 = findViewById( R.id.bucket);
        b9 = findViewById( R.id.camerabag);
        b10 = findViewById( R.id.clutch);
        b11 = findViewById( R.id.cosmeticbag);
        b12 = findViewById( R.id.doctorbag);
        b13 = findViewById( R.id.longhand);
        b14 = findViewById( R.id.hobo);
        b15 = findViewById( R.id.laptopbag);
        b16 = findViewById( R.id.makeupbag);
        b17 = findViewById( R.id.messengerbag);
        b18 = findViewById( R.id.pouch);
        b19 = findViewById( R.id.schoolbag);
        b20 = findViewById( R.id.shoppingbag);
        b21 = findViewById( R.id.totebag);
        b22 = findViewById( R.id.shoulderbag);
        b23 = findViewById( R.id.sportsbag);
        b24 = findViewById( R.id.suitcase);
        b25 = findViewById( R.id.othersub);

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
        b22.setOnClickListener( this );
        b23.setOnClickListener( this );
        b24.setOnClickListener( this );
        b25.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.wallet:
                maincategory.subcat="Wallet";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.handbag:
                maincategory.subcat="Hand Bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.backpack:
                maincategory.subcat="Back pack";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.grocery:
                maincategory.subcat="Grocery bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.basket:
                maincategory.subcat="Basket";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.beach:
                maincategory.subcat="Beach bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.briefcase:
                maincategory.subcat="Briefcase";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.bucket:
                maincategory.subcat="Bucket bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.camerabag:
                maincategory.subcat="Camera bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.clutch:
                maincategory.subcat="Clutch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.cosmeticbag:
                maincategory.subcat="Cosmetic bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.doctorbag:
                maincategory.subcat="Doctor bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.longhand:
                maincategory.subcat="Long handbag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.hobo:
                maincategory.subcat="Hobo bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.laptopbag:
                maincategory.subcat="Laptop bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.makeupbag:
                maincategory.subcat="Makeup bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.messengerbag:
                maincategory.subcat="Messenger bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.pouch:
                maincategory.subcat="Pouch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.schoolbag:
                maincategory.subcat="School bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.shoppingbag:
                maincategory.subcat="Shopping bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.totebag:
                maincategory.subcat="Toto bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.shoulderbag:
                maincategory.subcat="Shoulder bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.sportsbag:
                maincategory.subcat="Sports bag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.suitcase:
                maincategory.subcat="Suitcase";
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
