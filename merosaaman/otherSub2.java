package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class otherSub2 extends AppCompatActivity {

    private EditText edit11;
    private TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_other_sub2 );

        text2 = findViewById( R.id.maintext2 );

        String othermaincat= maincategory.categoryName;

        text2.setText(othermaincat );

        edit11 = findViewById( R.id.subtext2);

        findViewById(R.id.nextcat2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String subcatname = edit11.getText().toString().trim();

                if (subcatname.isEmpty() ) {
                    edit11.setError("Fill this category");
                    edit11.requestFocus();
                    return;
                }

                maincategory.subcat = subcatname;
                Intent intent = new Intent(otherSub2.this, datePicker.class);
                startActivity(intent);

            }
        });
    }
}
