package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class DatabaseForLost extends AppCompatActivity {

    TextView textView;
    DatabaseReference databaselost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_database_for_lost );



        databaselost= FirebaseDatabase.getInstance().getReference("lostSomethingData");



        textView = findViewById( R.id.dataentry );

        String lmaincat= maincategory.categoryName;
        String lsubcat = maincategory.subcat;
        String lcolor = chooseColor.colorSelection;
        int day = datePicker.lday;
        int month= datePicker.lmonth;
        int year = datePicker.lyear;
        String llatdb = MapsActivity.slatidb;
        String llongdb = MapsActivity.slongdb;
        String lreward = reward.rewardpoint;
        String lname = makeSureProfileDetails.name;
        String lemail = makeSureProfileDetails.email;
        String lphone = makeSureProfileDetails.phone;
        String laddress = makeSureProfileDetails.address;
        Double dlatdb = MapsActivity.latidb;
        Double dlongdb = MapsActivity.longdb;



        String id = databaselost.push().getKey();

        lostSomethingData lostSomethingData = new lostSomethingData( id,lmaincat,lsubcat,lcolor,day,month,year,llatdb,llongdb,lreward,lname,lemail,lphone,laddress,dlatdb,dlongdb);
        databaselost.child( id ).setValue( lostSomethingData );
        textView.setText( " Successfull ");
        Toast.makeText( this,"Lost item details added",Toast.LENGTH_SHORT ).show();

        Intent intent = new Intent( DatabaseForLost.this, matching.class );
        startActivity( intent );

    }

}