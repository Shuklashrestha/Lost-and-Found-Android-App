package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabaseForFound extends AppCompatActivity {

    TextView textView;

    maincategory maincategory= new maincategory();
    subLaptops subLaptops = new subLaptops();
    chooseColor chooseColor = new chooseColor();
    datePicker datePicker = new datePicker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_database_for_found );

        DatabaseReference databasefound= FirebaseDatabase.getInstance().getReference("foundSomethingData");

        textView = findViewById( R.id.datafound );

        String fmaincat= maincategory.categoryName;
        String fsubcat = maincategory.subcat;
        String fcolor = chooseColor.colorSelection;
        int day = datePicker.lday;
        int month= datePicker.lmonth;
        int year = datePicker.lyear;
        String flatdb = MapsActivity.slatidb;
        String flongdb = MapsActivity.slongdb;
        String fques = questionfForMatch.question;
        String fname = makeSureProfileDetails.name;
        String femail = makeSureProfileDetails.email;
        String fphone = makeSureProfileDetails.phone;
        String faddress = makeSureProfileDetails.address;
        Double dlatdb = MapsActivity.latidb;
        Double dlongdb = MapsActivity.longdb;


        String id = databasefound.push().getKey();

        foundSomethingData foundSomethingData = new foundSomethingData( id,fmaincat,fsubcat,fcolor,day,month,year,flatdb,flongdb,fques,fname,femail,fphone,faddress,dlatdb,dlongdb);
        databasefound.child( id ).setValue( foundSomethingData );
        textView.setText( " Successfull ");
        Toast.makeText( this,"Found item details added",Toast.LENGTH_SHORT ).show();

        Intent intent = new Intent( DatabaseForFound.this, matching.class );
        startActivity( intent );


    }
}
