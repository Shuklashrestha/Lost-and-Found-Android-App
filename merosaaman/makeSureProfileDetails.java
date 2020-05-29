package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class makeSureProfileDetails extends AppCompatActivity {

    private TextView v11, v22, v33, v44;
    public static String name, email, phone, address;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String sname = "text1", semail = "text2", sphone = "text3", saddress = "text4"; //TEXT

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_make_sure_profile_details );

        v11 = findViewById( R.id.usernamesure );
        v22 = findViewById( R.id.emailsure );
        v33 = findViewById( R.id.phonenosure );
        v44 = findViewById( R.id.addresssure );

        SharedPreferences sharedPreferences = getSharedPreferences( SHARED_PREFS, MODE_PRIVATE );
        name = sharedPreferences.getString( sname, "" );
        email = sharedPreferences.getString( semail, "" );
        phone = sharedPreferences.getString( sphone, "" );
        address = sharedPreferences.getString( saddress, "" );

        v11.setText( name );
        v22.setText(email );
        v33.setText(phone );
        v44.setText( address );

        /*
        if(name == null || email == null || phone==null || address ==null){
            Intent intent = new Intent( makeSureProfileDetails.this, profile.class );
            startActivity( intent );
        }*/

        findViewById(R.id.detailbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lostFindRemind.task == "LS") {
                    Intent intent = new Intent( makeSureProfileDetails.this, DatabaseForLost.class );
                    startActivity( intent );
                }
                else if (lostFindRemind.task == "FS"){
                    Intent intent = new Intent( makeSureProfileDetails.this, DatabaseForFound.class );
                    startActivity( intent );
                }

            }
        });

    }
}
