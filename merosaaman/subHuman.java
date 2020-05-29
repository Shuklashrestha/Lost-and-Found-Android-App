package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subHuman extends AppCompatActivity  implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_human );


        b1 = findViewById( R.id.man);
        b2 = findViewById( R.id.woman);
        b3 = findViewById( R.id.boy);
        b4 = findViewById( R.id.girl);
        b5 = findViewById( R.id.babyboy);
        b6 = findViewById( R.id.babygirl);
        b7 = findViewById( R.id.othersub);

        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
        b3.setOnClickListener( this );
        b4.setOnClickListener( this );
        b5.setOnClickListener( this );
        b6.setOnClickListener( this );
        b7.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.man:
                maincategory.subcat="Man";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.woman:
                maincategory.subcat="Woman";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.boy:
                maincategory.subcat="Boy";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.girl:
                maincategory.subcat="Girl";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.babyboy:
                maincategory.subcat="Baby boy";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.babygirl:
                maincategory.subcat="Baby girl";
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
