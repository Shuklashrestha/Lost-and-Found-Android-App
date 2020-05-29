package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class mapStart extends AppCompatActivity {
    static TextView textView;
    public static double l1,l2,m1,m2,a=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_map_start );
        textView=findViewById( R.id.textV );

        buGet( textView );
    }

    public void buGet(View view){
        CheckUserPermsions();
    }

    //access to permsions
    void CheckUserPermsions(){
        if ( Build.VERSION.SDK_INT >= 23){
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                    PackageManager.PERMISSION_GRANTED  ){
                requestPermissions(new String[]{
                                android.Manifest.permission.ACCESS_FINE_LOCATION},
                        REQUEST_CODE_ASK_PERMISSIONS);
                return ;
            }
        }

        getLocation();// init the contact list

    }
    //get acces to location permsion
    final private int REQUEST_CODE_ASK_PERMISSIONS = 123;



    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_ASK_PERMISSIONS:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    getLocation();// init the contact list
                } else {
                    // Permission Denied
                    Toast.makeText( this,"Denail location" , Toast.LENGTH_SHORT)
                            .show();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }


    void getLocation(){

    /*    LocationManager lm = (LocationManager)getSystemService( LOCATION_SERVICE );
        Location location = lm.getLastKnownLocation( LocationManager.GPS_PROVIDER );
        textView.setText( "Log : " + String.valueOf(  location.getLongitude())+" ,lat: "+String.valueOf( location.getLatitude() ) );
      */

        a++;
        System.out.println( "number ===== "+a );

        myLocationListener myLocationListener = new myLocationListener( this );
        LocationManager lm = (LocationManager)getSystemService( LOCATION_SERVICE );
        lm.requestLocationUpdates( LocationManager.GPS_PROVIDER,3000,5,myLocationListener );
        System.out.println( l1 + "," + l2 );
        textView.setText("Location:"+ l1 +", "+ m1);

    }
}
