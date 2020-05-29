package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class profile extends AppCompatActivity {

    private TextView v1, v2, v3, v4;
    private EditText e1, e2, e3, e4;
    Button b1, b2, b3;
    public static String name, email, phone, address;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String sname = "text1", semail = "text2", sphone = "text3", saddress = "text4"; //TEXT

    @Override
    protected void onCreate(Bundle savedInstanceState) {


                super.onCreate( savedInstanceState );
                setContentView( R.layout.activity_profile );

        b1 = findViewById( R.id.viewbtn );
        b2 = findViewById( R.id.updateprofile );
        b3 = findViewById( R.id.updateprof );
        e1 = findViewById( R.id.usernameedit );
        e2 = findViewById( R.id.emailedit );
        e3 = findViewById( R.id.phonenoedit );
        e4 = findViewById( R.id.addressedit );
        v1 = findViewById( R.id.usernameview );
        v2 = findViewById( R.id.emailview );
        v3 = findViewById( R.id.phonenoview );
        v4 = findViewById( R.id.addressview );

        b1.setVisibility( View.INVISIBLE );
        b2.setVisibility( View.VISIBLE );
        b3.setVisibility( View.INVISIBLE );
        v1.setVisibility( View.INVISIBLE );
        v2.setVisibility( View.INVISIBLE );
        v3.setVisibility( View.INVISIBLE );
        v4.setVisibility( View.INVISIBLE );
        e1.setVisibility( View.VISIBLE );
        e2.setVisibility( View.VISIBLE );
        e3.setVisibility( View.VISIBLE );
        e4.setVisibility( View.VISIBLE );

        load();

     /*   SharedPreferences sharedPreferences = getSharedPreferences( SHARED_PREFS, MODE_PRIVATE );
        name = sharedPreferences.getString( sname, "" );
        email = sharedPreferences.getString( semail, "" );
        phone = sharedPreferences.getString( sphone, "" );
        address = sharedPreferences.getString( saddress, "" );  */

        System.out.println( sname+semail+sphone+saddress );
        //update
        e1.setText( name );
        e2.setText(email );
        e3.setText(phone );
        e4.setText( address );


    }

    public void load(){
        SharedPreferences sharedPreferences = getSharedPreferences( SHARED_PREFS, MODE_PRIVATE );
        name = sharedPreferences.getString( sname, "" );
        email = sharedPreferences.getString( semail, "" );
        phone = sharedPreferences.getString( sphone, "" );
        address = sharedPreferences.getString( saddress, "" );

    }

    public void b1Clicked(View v) {
        e1.setVisibility( View.INVISIBLE );
        e2.setVisibility( View.INVISIBLE );
        e3.setVisibility( View.INVISIBLE );
        e4.setVisibility( View.INVISIBLE );
        v1.setVisibility( View.VISIBLE );
        v2.setVisibility( View.VISIBLE );
        v3.setVisibility( View.VISIBLE );
        v4.setVisibility( View.VISIBLE );
        b1.setVisibility( View.VISIBLE );
        b2.setVisibility( View.INVISIBLE );
        b3.setVisibility( View.VISIBLE );

        //load data
        SharedPreferences sharedPreferences = getSharedPreferences( SHARED_PREFS, MODE_PRIVATE );
        name = sharedPreferences.getString( sname, "" );
        email = sharedPreferences.getString( semail, "" );
        phone = sharedPreferences.getString( sphone, "" );
        address = sharedPreferences.getString( saddress, "" );

        System.out.println( sname+semail+sphone+saddress );
        //update
        v1.setText( name );
        v2.setText( email );
        v3.setText( phone );
        v4.setText( address );


    }

    public void b2Clicked(View v) {

        name = e1.getText().toString().trim();
        email = e2.getText().toString().trim();
        phone = e3.getText().toString().trim();
        address = e4.getText().toString().trim();

        if (name.isEmpty()) {
            e1.setError( "Empty Name" );
            e1.requestFocus();
            return;
        }

        if (email.isEmpty()) {
            e2.setError( "Empty Email" );
            e2.requestFocus();
            return;
        }

        if (phone.isEmpty()) {
            e3.setError( "Empty Phone" );
            e3.requestFocus();
            return;
        }

        if (address.isEmpty()) {
            e4.setError( "Empty Address" );
            e4.requestFocus();
            return;
        }
        //save data
        SharedPreferences sharedPreferences = getSharedPreferences( SHARED_PREFS, MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( sname, e1.getText().toString() );
        editor.putString( semail, e2.getText().toString() );
        editor.putString( sphone, e3.getText().toString() );
        editor.putString( saddress, e4.getText().toString() );
        editor.commit();

        System.out.println( sname+semail+sphone+saddress );
        Intent intent = new Intent( profile.this, navigation_bar.class );
        startActivity( intent );


    }

    public void b3Clicked(View v) {
        b1.setVisibility( View.INVISIBLE );
        b2.setVisibility( View.VISIBLE );
        b3.setVisibility( View.INVISIBLE );
        v1.setVisibility( View.INVISIBLE );
        v2.setVisibility( View.INVISIBLE );
        v3.setVisibility( View.INVISIBLE );
        v4.setVisibility( View.INVISIBLE );
        e1.setVisibility( View.VISIBLE );
        e2.setVisibility( View.VISIBLE );
        e3.setVisibility( View.VISIBLE );
        e4.setVisibility( View.VISIBLE );

    }
}