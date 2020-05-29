package com.example.merosaaman;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import static com.example.merosaaman.mapStart.a;
import static com.example.merosaaman.mapStart.l1;
import static com.example.merosaaman.mapStart.l2;
import static com.example.merosaaman.mapStart.m1;
import static com.example.merosaaman.mapStart.m2;


public class myLocationListener implements LocationListener {


    private Handler mHandler = new Handler();
    Context context;


    public myLocationListener(Context context) {
        this.context = context;
    }

    @Override
    public void onLocationChanged(Location location) {
        String Loca = "Log : " + String.valueOf( location.getLongitude() ) + " ,lat: " + String.valueOf( location.getLatitude() );
        Toast.makeText( context, Loca, Toast.LENGTH_LONG ).show();
        mapStart.textView.setText("Location:"+ l1 +", "+ m1);

        l1 = location.getLongitude();
        m1 = location.getLatitude();

        System.out.println( l1 + "," + m1 );

        if(a!=1)
        check();
        mHandler.postDelayed( locdata, 2000 );


    }

    private Runnable locdata = new Runnable() {
        @Override
        public void run() {
            l2 = l1;
            m2 = m1;
        }
    };

        @Override
        public void onStatusChanged (String s,int i, Bundle bundle){
            Toast.makeText( context, "GPS data is changed ", Toast.LENGTH_LONG ).show();

        }

        @Override
        public void onProviderEnabled (String s){
            Toast.makeText( context, "GPS is enabled", Toast.LENGTH_LONG ).show();

        }

        @Override
        public void onProviderDisabled (String s){
            Toast.makeText( context, "GPS is disabled", Toast.LENGTH_LONG ).show();

        }

    void check() {
            double d1= l1*100;
            int i1=(int)d1;

        double d2= l2*100;
        int i2=(int)d2;

        double d3= m1*100;
        int i3=(int)d3;

        double d4= m2*100;
        int i4=(int)d4;

        if (mode_selection.mode == "SM" && (i1 != i2 && i3 != i4)) {
            System.out.println( "Location changed" +i1+"  "+i2+"  "+i3+"  "+i4);
            Intent intent =new Intent( context, getNofificationForReminding.class );
            context.startActivity( intent );

        } else if (mode_selection.mode == "RM" && (i1 == i2 && i3 == i4)) {
            System.out.println( "Location is not changed" +i1+"  "+i2+"  "+i3+"  "+i4 );
            Intent intent =new Intent( context, getNofificationForReminding.class );
            context.startActivity( intent );
        }
    }



}

