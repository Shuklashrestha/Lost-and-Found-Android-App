package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subDocuments extends AppCompatActivity  implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_documents );


        b1 = findViewById( R.id.receipt);
        b2 = findViewById( R.id.personaldoc);
        b3 = findViewById( R.id.officefiles);
        b4 = findViewById( R.id.marrigedoc);
        b5 = findViewById( R.id.housepaper);
        b6 = findViewById( R.id.medicalrep);
        b7 = findViewById( R.id.certificate);
        b8 = findViewById( R.id.carpaper);
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
            case R.id.receipt:
                maincategory.subcat="Receipt";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.personaldoc:
                maincategory.subcat="Personal Documents";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.officefiles:
                maincategory.subcat="Office files";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.marrigedoc:
                maincategory.subcat="Marrige documents";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.housepaper:
                maincategory.subcat="House paper";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.medicalrep:
                maincategory.subcat="Medical reports";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.certificate:
                maincategory.subcat="Certificate";
                intent = new Intent(this, datePicker.class);
                startActivity(intent);
                break;

            case R.id.carpaper:
                maincategory.subcat="Car paper";
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
