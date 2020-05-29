package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import static com.example.merosaaman.notificationHelper.CHANNEL1_ID;

public class getNotification extends AppCompatActivity {
    private NotificationManagerCompat notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_get_notification );
        notificationManager = NotificationManagerCompat.from( this );

        String title = "Merosaaman";
        String message = "Match Found";

        Notification notification = new NotificationCompat.Builder(this,CHANNEL1_ID)
                .setSmallIcon( R.drawable.ic_notification )
                .setContentTitle( title )
                .setContentText( message  )
                .setPriority( NotificationCompat.PRIORITY_HIGH )
                .setCategory( NotificationCompat.CATEGORY_MESSAGE )
                .build();

        notificationManager.notify( 1,notification );


            findViewById( R.id.matchbtn ).setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent( getNotification.this, matchingDescription.class );
                    startActivity( intent );

                }
            } );


    }
}
