package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class subOthers extends AppCompatActivity {



    private EditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sub_others );

        edit1 = findViewById( R.id. maintext);
        edit2 = findViewById( R.id. subtext);

        findViewById(R.id.nextcat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String catname = edit1.getText().toString().trim();
                String subcatname = edit2.getText().toString().trim();

                if (catname.isEmpty() ) {
                    edit1.setError("Fill this category");
                    edit1.requestFocus();
                    return;
                }
                if (subcatname.isEmpty() ) {
                    edit2.setError("Fill this category");
                    edit2.requestFocus();
                    return;
                }
                maincategory.categoryName= catname;
                maincategory.subcat = subcatname;

                Intent intent = new Intent(subOthers.this, datePicker.class);
                startActivity(intent);

            }
        });
    }
}
