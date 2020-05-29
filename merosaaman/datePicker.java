package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class datePicker extends AppCompatActivity {

    public static int lday,lmonth,lyear;
    TextView textView;
    Calendar calendar;
    DatePickerDialog datePickerDialog;
    lostFindRemind lostFindRemind=new lostFindRemind();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_date_picker );

        textView = findViewById( R.id.dateview );

        calendar= Calendar.getInstance();
        int day = calendar.get( Calendar.DAY_OF_MONTH );
        int month = calendar.get( Calendar.MONTH );
        int year = calendar.get( Calendar.YEAR );



        datePickerDialog = new DatePickerDialog( datePicker.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay) {
                textView.setText( mDay + " / " +(mMonth+1) + " / " + mYear );
                lday = mDay;
                lmonth = mMonth+1;
                lyear = mYear;
            }
        }, day,month, year );



        datePickerDialog.show();

        findViewById(R.id.datebutton).setOnClickListener(new View.OnClickListener() {
                 @Override
                public void onClick(View v) {
                     Intent intent = new Intent( datePicker.this, chooseColor.class );
                     startActivity( intent );
                 }
        });
    }
}
