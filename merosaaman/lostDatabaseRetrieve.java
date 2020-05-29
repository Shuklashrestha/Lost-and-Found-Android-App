package com.example.merosaaman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class lostDatabaseRetrieve extends AppCompatActivity {

    ListView listViewLostItems;
    DatabaseReference databaselost;
    List<lostSomethingData> lostItemLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lost_database_retrieve );

        databaselost= FirebaseDatabase.getInstance().getReference("lostSomethingData");

        listViewLostItems = findViewById( R.id.listViewLostItem );
        lostItemLists = new ArrayList<>(  );


    }


    @Override
    protected void onStart() {
        super.onStart();
        databaselost.addValueEventListener( new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                lostItemLists.clear();
                for (DataSnapshot lostSnapshot: dataSnapshot.getChildren()){
                    lostSomethingData lostSomethingData = lostSnapshot.getValue( com.example.merosaaman.lostSomethingData.class );

                        lostItemLists.add( lostSomethingData );

                }


                lostItemList adapter = new lostItemList( lostDatabaseRetrieve.this,lostItemLists );
                listViewLostItems.setAdapter( adapter );

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        } );

    }
}
/*
Retrieve single data only

    TextView a,b,c,d;
    Button btn;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lost_database_retrieve );

        a= findViewById( R.id.t1 );
        b= findViewById( R.id.t2 );
        c= findViewById( R.id.t3 );
        d= findViewById( R.id.t4 );
        btn = findViewById( R.id.b1 );

        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reff = FirebaseDatabase.getInstance().getReference().child( "lostSomethingData" ).child( "-LlRVdN_AMSfBVIcesK4");
                reff.addValueEventListener( new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String mainCat = dataSnapshot.child( "lmainCat" ).getValue().toString();
                        String subCat = dataSnapshot.child( "lsubCat" ).getValue().toString();
                        String itemcolor = dataSnapshot.child( "lcolor" ).getValue().toString();
                        String day = dataSnapshot.child( "day" ).getValue().toString();
                        String month = dataSnapshot.child( "month" ).getValue().toString();
                        String year = dataSnapshot.child( "year" ).getValue().toString();

                        a.setText( mainCat );
                        b.setText( subCat );
                        c.setText( itemcolor );
                        d.setText( day +" / "+ month +" / "+ year );

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                } );
            }
        } );
    }
}*/
