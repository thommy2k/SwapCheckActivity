package com.example.swapcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Swap = findViewById(R.id.SwapBtn);
        Button Check = findViewById(R.id.btnCheck);
        EditText swapEdit = findViewById(R.id.editSwap);
        EditText chkEdit = findViewById(R.id.editChk);

        Swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = swapEdit.getText().toString();
                swapEdit.setText(chkEdit.getText().toString());
                chkEdit.setText(item);
            }
        });

        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPage.this, Output.class);
                String item1 = swapEdit.getText().toString();
                String item2 = chkEdit.getText().toString();
                intent.putExtra("swapEdit", item1);
                intent.putExtra("chkEdit", item2);

                startActivity(intent);
            }
        });
    }
}