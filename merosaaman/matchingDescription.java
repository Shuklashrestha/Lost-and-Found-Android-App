package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class matchingDescription extends AppCompatActivity {

    TextView a,b,c,d,e,f,g,h,i,j,k,l,m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_matching_description );


        a= findViewById( R.id.maincatname1 );
        a.setText( matching.s5 );
        b= findViewById( R.id.subcatname1 );
        b.setText( matching.s6 );
        c= findViewById( R.id.colorname1 );
        c.setText( matching.s7 );
        d= findViewById( R.id.lostdate1 );
        h= findViewById( R.id.lostloc1 );
        j= findViewById( R.id.username1 );
        j.setText( matching.s1 );
        k= findViewById( R.id.email1 );
        k.setText( matching.s2 );
        l= findViewById( R.id.phone1 );
        l.setText( matching.s3 );
        m= findViewById( R.id.address1 );
        m.setText( matching.s4 );

        e= findViewById( R.id.catdate1 );
        f= findViewById( R.id.catloc1 );
        g= findViewById( R.id.catrq1 );
        i= findViewById( R.id.lostre1 );



        int day = matching.i1;
        int month= matching.i2;
        int year = matching.i3;
        String loclat = matching.s9;
        String loclong =  matching.s10;



        d.setText( day + " / " + month + " / " + year );
        h.setText( "https://www.google.com/search?q="+loclat+"%2C+"+loclong+"&oq="+loclat+"%2C+"+loclong+"&aqs=chrome" );
        // h.setText("Lat: "+loclat+", Long: "+loclong );

        if(lostFindRemind.task == "FS"){
            e.setText( "Lost Date" );
            f.setText( "Lost Location" );
            g.setText( "Reward" );
            i.setText( matching.s8 );
        }
        else if(lostFindRemind.task == "LS"){
            e.setText( "Found Date" );
            f.setText( "Found Location" );
            g.setText( "Question" );
            i.setText(matching.s8 );
        }


        findViewById(R.id.confirmbtn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent( matchingDescription.this, navigation_bar.class );
                    startActivity( intent );
            }
        });

    }
}
