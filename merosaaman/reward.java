package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;

public class reward extends AppCompatActivity {
    public static String rewardpoint;
    private Spinner spinner;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_reward );

        spinner = findViewById(R.id.spinnerCountry);
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, CountryData.countryNames));

        editText = findViewById( R.id.rewardtext );

        findViewById(R.id.set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countryName = CountryData.countryNames[spinner.getSelectedItemPosition()];
                String number = editText.getText().toString().trim();

                if (number.isEmpty() ) {
                    editText.setError("Fill the reward");
                    editText.requestFocus();
                    return;
                }
                rewardpoint =  number + " ("+countryName+")";

                Intent intent = new Intent(reward.this, lostItemViewDescription.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.skip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rewardpoint =  "Not set";
                Intent intent = new Intent(reward.this, lostItemViewDescription.class);
                startActivity(intent);

            }
        });


    }
}
