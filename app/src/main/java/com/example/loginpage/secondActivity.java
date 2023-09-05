package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Get the name from the intent
        String nombre = getIntent().getStringExtra("valorKey");

        // Display the name
        TextView textView = findViewById(R.id.txtname);
        textView.setText(nombre);
    }
}