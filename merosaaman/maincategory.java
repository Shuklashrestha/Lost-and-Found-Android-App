package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class maincategory extends AppCompatActivity implements View.OnClickListener {

    public static String categoryName,subcat;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_maincategory );

        b1 = findViewById( R.id.laptops );
        b2 = findViewById( R.id.phones );
        b3 = findViewById( R.id.watches );
        b4 = findViewById( R.id.electronics);
        b5 = findViewById( R.id.keys );
        b6 = findViewById( R.id.cards );
        b7 = findViewById( R.id.documents );
        b8 = findViewById( R.id.bags );
        b9 = findViewById( R.id.money );
        b10 = findViewById( R.id.jewellery );
        b11 = findViewById( R.id.glasses );
        b12 = findViewById( R.id.garments );
        b13 = findViewById( R.id.shoes );
        b14 = findViewById( R.id.cosmetics );
        b15 = findViewById( R.id.pets );
        b16 = findViewById( R.id.umbrella );
        b17 = findViewById( R.id.human );
        b18 = findViewById( R.id.othersmain );

        b1.setOnClickListener( this );
        b2.setOnClickListener( this );
        b3.setOnClickListener( this );
        b4.setOnClickListener( this );
        b5.setOnClickListener( this );
        b6.setOnClickListener( this );
        b7.setOnClickListener( this );
        b8.setOnClickListener( this );
        b9.setOnClickListener( this );
        b10.setOnClickListener( this );
        b11.setOnClickListener( this );
        b12.setOnClickListener( this );
        b13.setOnClickListener( this );
        b14.setOnClickListener( this );
        b15.setOnClickListener( this );
        b16.setOnClickListener( this );
        b17.setOnClickListener( this );
        b18.setOnClickListener( this );

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.laptops:
              //  Toast.makeText( this,"Laptop selected",Toast.LENGTH_SHORT ).show();
                categoryName="Laptops";
                intent = new Intent(maincategory.this, subLaptops.class);
                startActivity(intent);
                break;

            case R.id.phones:
                categoryName="phones";
                intent = new Intent(maincategory.this, subPhones.class);
                startActivity(intent);
                break;

            case R.id.watches:
                categoryName="watches";
                intent = new Intent(maincategory.this, subWatches.class);
                startActivity(intent);
                break;

            case R.id.electronics:
                categoryName="electronics";
                intent = new Intent(maincategory.this, subElectronics.class);
                startActivity(intent);
                break;

            case R.id.keys:
                categoryName="keys";
                intent = new Intent(maincategory.this, subKeys.class);
                startActivity(intent);
                break;

            case R.id.cards:
                categoryName="cards";
                intent = new Intent(maincategory.this, subCards.class);
                startActivity(intent);
                break;

            case R.id.documents:
                categoryName="documents";
                intent = new Intent(maincategory.this, subDocuments.class);
                startActivity(intent);
                break;

            case R.id.bags:
                categoryName="bags";
                intent = new Intent(maincategory.this, subBags.class);
                startActivity(intent);
                break;

            case R.id.money:
                categoryName="money";
                intent = new Intent(maincategory.this, subMoney.class);
                startActivity(intent);
                break;

            case R.id.jewellery:
                categoryName="jewellery";
                intent = new Intent(maincategory.this, subJewellery.class);
                startActivity(intent);
                break;

            case R.id.glasses:
                categoryName="glasses";
                intent = new Intent(maincategory.this, subGlasses.class);
                startActivity(intent);
                break;

            case R.id.garments:
                categoryName="garments";
                intent = new Intent(maincategory.this, subGarments.class);
                startActivity(intent);
                break;

            case R.id.shoes:
                categoryName="shoes";
                intent = new Intent(maincategory.this, subShoes.class);
                startActivity(intent);
                break;

            case R.id.cosmetics:
                categoryName="phones";
                intent = new Intent(maincategory.this, subCosmetics.class);
                startActivity(intent);
                break;

            case R.id.pets:
                categoryName="pets";
                intent = new Intent(maincategory.this, subPets.class);
                startActivity(intent);
                break;

            case R.id.umbrella:
                categoryName="umbrella";
                intent = new Intent(maincategory.this, subUmbrella.class);
                startActivity(intent);
                break;

            case R.id.human:
                categoryName="human";
                intent = new Intent(maincategory.this, subHuman.class);
                startActivity(intent);
                break;

            case R.id.othersmain:
                intent = new Intent(maincategory.this, subOthers.class);
                startActivity(intent);
                break;

        }

    }
}
