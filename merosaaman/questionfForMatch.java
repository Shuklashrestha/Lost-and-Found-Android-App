package com.example.merosaaman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class questionfForMatch extends AppCompatActivity {
    public static String question;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_questionf_for_match );

        editText = findViewById( R.id.questiontext );

        findViewById(R.id.ask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ques = editText.getText().toString().trim();

                if (ques.isEmpty() ) {
                    editText.setError("Ask question for perfect match");
                    editText.requestFocus();
                    return;
                }
                question = ques;
                Intent intent = new Intent(questionfForMatch.this, lostItemViewDescription.class);
                startActivity(intent);

            }
        });
    }
}
