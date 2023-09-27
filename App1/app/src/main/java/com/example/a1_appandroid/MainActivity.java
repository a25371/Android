package com.example.a1_appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtUser;
    private EditText edtPass;
    private Button btnSignin;

    /* CICLO DE VIDA: ONLOAD JAVASCRIPT */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //document.getElementById("idUser");
        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        btnSignin = findViewById(R.id.btnSignin);
        // btnEnviar.addEventListener("click", "Bienvenido a JS");
        View.OnClickListener miClase = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Hola que tal??", Toast.LENGTH_SHORT).show();
            }
        };
        //btnSignin.setOnClickListener(new MiClaseClick());


    }
}