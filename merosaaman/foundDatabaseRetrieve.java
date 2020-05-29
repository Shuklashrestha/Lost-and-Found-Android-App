package com.example.merosaaman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class foundDatabaseRetrieve extends AppCompatActivity {

    ListView listViewFoundItems;
    DatabaseReference databasefound;
    List<foundSomethingData> foundItemLists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_found_database_retrieve );

        databasefound= FirebaseDatabase.getInstance().getReference("foundSomethingData");

        listViewFoundItems = findViewById( R.id.listViewFoundItem );
        foundItemLists = new ArrayList<>(  );
    }

    @Override
    protected void onStart() {
        super.onStart();
        databasefound.addValueEventListener( new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                foundItemLists.clear();
                for (DataSnapshot foundSnapshot: dataSnapshot.getChildren()){
                    foundSomethingData foundSomethingData = foundSnapshot.getValue( com.example.merosaaman.foundSomethingData.class );

                 //   if (foundSomethingData.getUserphone() == matchingAgain.myphoneno || foundSomethingData.getUseremail() == matchingAgain.myemail) {

                        foundItemLists.add( foundSomethingData );
                  //  }
                }
                foundItemList adapter = new foundItemList( foundDatabaseRetrieve.this,foundItemLists );
                listViewFoundItems.setAdapter( adapter );

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        } );

    }
}
