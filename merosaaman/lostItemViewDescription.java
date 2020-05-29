package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;
import java.net.URL;

public class lostItemViewDescription extends AppCompatActivity{

    TextView a,b,c,d,e,f,g,h,i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lost_item_view_description );

        a= findViewById( R.id.maincatname );
        b= findViewById( R.id.subcatname );
        c= findViewById( R.id.colorname );
        d= findViewById( R.id.lostdate );
        e= findViewById( R.id.catdate );
        f= findViewById( R.id.catloc );
        g= findViewById( R.id.catrq );
        h= findViewById( R.id.lostloc );
        i= findViewById( R.id.lostre );

                String maincat= maincategory.categoryName;
                String subcat = maincategory.subcat;                  ////lots of condition req
                String color = chooseColor.colorSelection;
                int day = datePicker.lday;
                int month= datePicker.lmonth;
                int year = datePicker.lyear;
                String loclat = MapsActivity.slatidb;
                String loclong =  MapsActivity.slongdb;
                String rewardcat = reward.rewardpoint;
                String quescat = questionfForMatch.question;

                a.setText( maincat );
                b.setText( subcat );
                c.setText( color );
                d.setText( day + " / " + month + " / " + year );
                h.setText( "https://www.google.com/search?q="+loclat+"%2C+"+loclong+"&oq="+loclat+"%2C+"+loclong+"&aqs=chrome" );
               // h.setText("Lat: "+loclat+", Long: "+loclong );
        if(lostFindRemind.task == "LS"){
            e.setText( "Lost Date" );
            f.setText( "Lost Location" );
            g.setText( "Reward" );
            i.setText( rewardcat );
        }
        else if(lostFindRemind.task == "FS"){
            e.setText( "Found Date" );
            f.setText( "Found Location" );
            g.setText( "Question" );
            i.setText( quescat );
        }


        findViewById(R.id.confirmbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.initilization=="Phone" || MainActivity.initilization=="Google") {

                    Intent intent = new Intent( lostItemViewDescription.this, makeSureProfileDetails.class );
                    startActivity( intent );
                }
                else {

                    openDialog();
                    Intent intent = new Intent( lostItemViewDescription.this, MainActivity.class );
                    startActivity( intent );
                }

            }
        });

    }
    public void openDialog(){
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show( getSupportFragmentManager(),"example dialog" );
    }

/*
    public void loclatlng(View view){
       // String searchlocation = MapsActivity.slatidb+","+MapsActivity.slongdb;
         Intent browserIntent = new Intent( Intent.ACTION_VIEW,Uri.parse("google.com") );
         startActivity( browserIntent );


    }
*/
}
