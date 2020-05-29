package com.example.merosaaman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class matching extends AppCompatActivity {

    public static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    public static int i1,i2,i3;
 //   ListView listViewLostItems,listViewFoundItems;
    DatabaseReference databaselost,databasefound;
    List<lostSomethingData> lostItemLists;
    List<foundSomethingData> foundItemLists;

    String lfmaincat= maincategory.categoryName;
    String lfsubcat = maincategory.subcat;
    String lfcolor = chooseColor.colorSelection;
    Double mloclat =  MapsActivity.latidb;
    Double mloclong = MapsActivity.longdb;
  //  int day = datePicker.lday;
   // int month= datePicker.lmonth;
   // int year = datePicker.lyear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_matching );

        databaselost= FirebaseDatabase.getInstance().getReference("lostSomethingData");
        databasefound= FirebaseDatabase.getInstance().getReference("foundSomethingData");

     //   listViewLostItems = findViewById( R.id.listViewLostItem );
     //   listViewFoundItems = findViewById( R.id.listViewFoundItem );

        lostItemLists = new ArrayList<>(  );
        foundItemLists = new ArrayList<>(  );

    }

    @Override
    protected void onStart() {
        super.onStart();

        if(lostFindRemind.task == "LS"){
            databasefound.addValueEventListener( new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    foundItemLists.clear();
                    for (DataSnapshot foundSnapshot: dataSnapshot.getChildren()){
                        foundSomethingData foundSomethingData = foundSnapshot.getValue( com.example.merosaaman.foundSomethingData.class );
                        String maincat = foundSomethingData.getFmain_category();
                        String subcat = foundSomethingData.getFsub_category();
                        String itemcolor = foundSomethingData.getFitem_color();
                        Double loclat = foundSomethingData.getDlat();
                        Double loclong = foundSomethingData.getDlong();
                        if(lfmaincat.equals( maincat ) && lfsubcat.equals( subcat ) && lfcolor.equals( itemcolor ) && mloclat.equals( loclat ) && mloclong.equals( loclong )){
                            // get notification to both
                            s1 = foundSomethingData.getUsername();
                            s2 = foundSomethingData.getUseremail();
                            s3 = foundSomethingData.getUserphone();
                            s4 = foundSomethingData.getUseraddress();
                            s5 = maincat;
                            s6 = subcat;
                            s7 = itemcolor;
                            s8 = foundSomethingData.getFquestion();
                            s9 = foundSomethingData.getFlatititude();
                            s10 = foundSomethingData.getFlongnitude();
                            i1 = foundSomethingData.getDay();
                            i2 = foundSomethingData.getMonth();
                            i3 = foundSomethingData.getYear();

                            Intent intent = new Intent( matching.this, getNotification.class );
                            startActivity( intent );
                            break;
                        }
                        foundItemLists.add( foundSomethingData );
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            } );
        }
        else if(lostFindRemind.task == "FS"){
            databaselost.addValueEventListener( new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    lostItemLists.clear();
                    for (DataSnapshot lostSnapshot: dataSnapshot.getChildren()){
                        lostSomethingData lostSomethingData = lostSnapshot.getValue( com.example.merosaaman.lostSomethingData.class );
                        String maincat = lostSomethingData.getLmain_category();
                        String subcat = lostSomethingData.getLsub_category();
                        String itemcolor = lostSomethingData.getLitem_color();
                        Double loclat = lostSomethingData.getDlat();
                        Double loclong = lostSomethingData.getDlong();
                        if(lfmaincat.equals( maincat ) && lfsubcat.equals( subcat ) && lfcolor.equals( itemcolor ) && mloclat.equals( loclat ) && mloclong.equals( loclong )){
                            // get notification to both

                            s1 = lostSomethingData.getUsername();
                            s2 = lostSomethingData.getUseremail();
                            s3 = lostSomethingData.getUserphone();
                            s4 = lostSomethingData.getUseraddress();
                            s5 = maincat;
                            s6 = subcat;
                            s7 = itemcolor;
                            s8 = lostSomethingData.getLreward_point();
                            s9 = lostSomethingData.getLlatititude();
                            s10 = lostSomethingData.getLlongnitude();
                            i1 = lostSomethingData.getDay();
                            i2 = lostSomethingData.getMonth();
                            i3 = lostSomethingData.getYear();


                            Intent intent = new Intent( matching.this, getNotification.class );
                            startActivity( intent );
                            break;
                        }
                        lostItemLists.add( lostSomethingData );
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            } );
        }

        findViewById(R.id.goback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( matching.this, navigation_bar.class );
                startActivity( intent );
            }
        });
    }


}
