package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subCosmetics extends AppCompatActivity  implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_cosmetics );

        b1 = findViewById( R.id.blush);
        b2 = findViewById( R.id.bodylotion);
        b3 = findViewById( R.id.bronzer);
        b4 = findViewById( R.id.brush);
        b5 = findViewById( R.id.concealer);
        b6 = findViewById( R.id.mitt);
        b7 = findViewById( R.id.eyebrow);
        b8 = findViewById( R.id.eyeliner);
        b9 = findViewById( R.id.eyeshadow);
        b10 = findViewById( R.id.facecleanser);
        b11 = findViewById( R.id.facialmask);
        b12 = findViewById( R.id.eyelash);
        b13 = findViewById( R.id.foundation);
        b14 = findViewById( R.id.libalm);
        b15 = findViewById( R.id.lipgloss);
        b16 = findViewById( R.id.lipstick);
        b17 = findViewById( R.id.mascara);
        b18 = findViewById( R.id.nailpolish);
        b19 = findViewById( R.id.powder);
        b20 = findViewById( R.id.primer);
        b21 = findViewById( R.id.ointment);
        b22 = findViewById( R.id.cream);
        b23 = findViewById( R.id.turner);
        b24 = findViewById( R.id.othersub);

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

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.blush:
                maincategory.subcat="Blush";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.bodylotion:
                maincategory.subcat="Body lotion";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.bronzer:
                maincategory.subcat="Bronzer";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.brush:
                maincategory.subcat="Brush";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.concealer:
                maincategory.subcat="Concealer";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.mitt:
                maincategory.subcat="Mitt";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.eyebrow:
                maincategory.subcat="Eyebrow pencile";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.eyeliner:
                maincategory.subcat="Eye liner";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.eyeshadow:
                maincategory.subcat="Eyeshadow";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.facecleanser:
                maincategory.subcat="Face cleanser";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.facialmask:
                maincategory.subcat="Facial mask";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.eyelash:
                maincategory.subcat="Eye lashes";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.foundation:
                maincategory.subcat="Foundation";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.libalm:
                maincategory.subcat="Li blam";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.lipgloss:
                maincategory.subcat="Lip gloss";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.lipstick:
                maincategory.subcat="Lip stick";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.mascara:
                maincategory.subcat="Mascara";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.nailpolish:
                maincategory.subcat="Nail polish";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.powder:
                maincategory.subcat="Powder";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.primer:
                maincategory.subcat="Primer";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.ointment:
                maincategory.subcat="Ointment";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.cream:
                maincategory.subcat="Cream";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.turner:
                maincategory.subcat="Turner";
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
