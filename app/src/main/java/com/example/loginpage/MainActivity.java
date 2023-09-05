package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usuario, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asignacion de valores
        usuario = (EditText)findViewById(R.id.inputName);
        password = (EditText)findViewById(R.id.inputPassword);

    }
    public void enviarDatos (View view){
        String valor = usuario.getText().toString();
        Bundle variables = new Bundle();
        variables.putString("valorKey",valor);
        Intent actividad2 = new Intent (this, secondActivity.class);
        actividad2.putExtras(variables);
        startActivity(actividad2);
    }

}