package com.example.swapcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        TextView itemOutput = findViewById(R.id.outputItem);

        Intent intent = getIntent();

        String firstOutput = intent.getStringExtra("swapEdit");
        String secondOutput = intent.getStringExtra("chkEdit");

        if(firstOutput.equals(secondOutput)){
            itemOutput.setText("MATCHED OUTPUT");
        } else {
            itemOutput.setText("OUTPUT MISMATCH");
        }
    }
}