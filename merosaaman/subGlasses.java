package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subGlasses extends AppCompatActivity  implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_glasses );

        b1 = findViewById( R.id.tripald);
        b2 = findViewById( R.id.arglass);
        b3 = findViewById( R.id.googleglass);
        b4 = findViewById( R.id.magnifyingglass);
        b5 = findViewById( R.id.eyeglass);
        b6 = findViewById( R.id.obscureglass);
        b7 = findViewById( R.id.protectorglass);
        b8 = findViewById( R.id.sunglass);
        b9 = findViewById( R.id.othersub);

        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
        b3.setOnClickListener( this );
        b4.setOnClickListener( this );
        b5.setOnClickListener( this );
        b6.setOnClickListener( this );
        b7.setOnClickListener( this );
        b8.setOnClickListener( this );
        b9.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.tripald:
                maincategory.subcat="3D glasses";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.arglass:
                maincategory.subcat="AR glasses";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.googleglass:
                maincategory.subcat="Google glasses";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.magnifyingglass:
                maincategory.subcat="Magnifying glasses";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.eyeglass:
                maincategory.subcat="Eye glasses";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.obscureglass:
                maincategory.subcat="Obscure glasses";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.protectorglass:
                maincategory.subcat="Protecter glasses";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.sunglass:
                maincategory.subcat="Sun glasses";
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
