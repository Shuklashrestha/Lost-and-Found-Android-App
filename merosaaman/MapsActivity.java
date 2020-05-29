package com.example.merosaaman;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONException;
import org.json.JSONObject;


//public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback{ // yo thyo hai


public class MapsActivity extends AppCompatActivity {


    public static double longdb,latidb;
    public static String slongdb,slatidb;
    //   private GoogleMap mMap;
    int PLACE_PICKER_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
    //    setContentView( R.layout.activity_choose_color );


//        System.out.println( "intiaizaton1" );
        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();
        try {
  //          System.out.println( "intiaizaton2" );
            startActivityForResult( builder.build( MapsActivity.this ),PLACE_PICKER_REQUEST );
            System.out.println( "intiaizaton3" );
        } catch (GooglePlayServicesRepairableException e) {
      //      System.out.println( "intiaizaton4" );
            e.printStackTrace();
        } catch (GooglePlayServicesNotAvailableException e) {
       //     System.out.println( "intiaizaton5" );
            e.printStackTrace();
        }


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
       /* SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById( R.id.map );
        mapFragment.getMapAsync( this );

*/

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult( requestCode, resultCode, data );
        System.out.println( "intiaizaton6" );

        if(requestCode == PLACE_PICKER_REQUEST) {
           if (resultCode == RESULT_OK) {
               System.out.println( "intiaizaton8" );
               Place place = PlacePicker.getPlace( data, this );
               StringBuilder stringBuilder = new StringBuilder();
               System.out.println( "intiaizaton7" );
               Double latitude = Double.valueOf( place.getLatLng().latitude );
               Double longitude = Double.valueOf( place.getLatLng().longitude );
               String slatitude = String.valueOf( place.getLatLng().latitude );
               String slongitude = String.valueOf( place.getLatLng().longitude );
           //    stringBuilder.append( "LATITUDE : " );
            //   stringBuilder.append( latitude );
            //   stringBuilder.append( "\n" );
            //   stringBuilder.append( "LONGITUDE : " );
             //  stringBuilder.append( longitude );
               //   textView.setText( stringBuilder.toString() );

              latidb = translation( latitude );
              longdb = translation( longitude );
               slatidb = slatitude;
               slongdb = slongitude;

            //   Toast.makeText( this, "Latitude : " + latitude + "\n" + "Longitude : " + longitude, Toast.LENGTH_SHORT ).show();

               if(lostFindRemind.task == "LS"){
                   Intent intent = new Intent( this, reward.class );
                   startActivity( intent );
               }
               else if(lostFindRemind.task == "FS"){
                   Intent intent = new Intent( this, questionfForMatch.class );
                   startActivity( intent );
               }





            }
           else{
               Intent intent = new Intent( this, chooseColor.class );
               startActivity( intent );
           }

        }else {
            Intent intent = new Intent( this, chooseColor.class );
            startActivity( intent );
        }
    }
    Double translation(double a){
        a=a*1000;
        int b = (int) a;
        double c =(double) b;
        return c;
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
/*
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //mMap.setMapType( GoogleMap.MAP_TYPE_NORMAL );
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng( -34, 151 );
        mMap.addMarker( new MarkerOptions().position( sydney ).title( "Marker in Sydney" ) );

        mMap.addCircle( new CircleOptions()
        .center( sydney )
        .radius(100)
        .strokeColor( Color.BLUE )
        .fillColor(Color.GREEN));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom( sydney,14 ) );


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        switch (item.getItemId()) {
            case R.id.normal_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satellite_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    } */
}
