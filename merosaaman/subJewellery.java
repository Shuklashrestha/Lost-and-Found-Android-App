package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subJewellery extends AppCompatActivity  implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_jewellery );

        b1 = findViewById( R.id.braclet);
        b2 = findViewById( R.id.brooch);
        b3 = findViewById( R.id.choker);
        b4 = findViewById( R.id.crown);
        b5 = findViewById( R.id.diadem);
        b6 = findViewById( R.id.dogtag);
        b7 = findViewById( R.id.earrings);
        b8 = findViewById( R.id.cufflinks);
        b9 = findViewById( R.id.hairpin);
        b10 = findViewById( R.id.necklack);
        b11 = findViewById( R.id.pendant);
        b12 = findViewById( R.id.prayerbeads);
        b13 = findViewById( R.id.tiara);
        b14 = findViewById( R.id.kokoshnik);
        b15 = findViewById( R.id.medal);
        b16 = findViewById( R.id.weddingring);
        b17 = findViewById( R.id.ring);
        b18 = findViewById( R.id.othersub);

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
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.braclet:
                maincategory.subcat="Braclet";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.brooch:
                maincategory.subcat="Brooch";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.choker:
                maincategory.subcat="Choker";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.crown:
                maincategory.subcat="Crown";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.diadem:
                maincategory.subcat="Diadem";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.dogtag:
                maincategory.subcat="Dog tag";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.earrings:
                maincategory.subcat="Earrings";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.cufflinks:
                maincategory.subcat="Cufflinks";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.hairpin:
                maincategory.subcat="Hair pin";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.necklack:
                maincategory.subcat="Necklack";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.pendant:
                maincategory.subcat="Pendant";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.prayerbeads:
                maincategory.subcat="Prayer beads";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.tiara:
                maincategory.subcat="Tiara";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.kokoshnik:
                maincategory.subcat="Kokoshnik";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.medal:
                maincategory.subcat="Medals";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.weddingring:
                maincategory.subcat="Wedding rings";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.ring:
                maincategory.subcat="Ring";
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
