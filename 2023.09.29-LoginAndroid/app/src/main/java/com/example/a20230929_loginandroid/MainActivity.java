package com.example.a20230929_loginandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a20230929_loginandroid.actions.ServicePeliculas;
import com.example.a20230929_loginandroid.actions.ViewPeliculas;
import com.example.a20230929_loginandroid.beans.User;
import com.example.a20230929_loginandroid.login_user.ContractLoginUser;

public class MainActivity extends AppCompatActivity
                        implements ViewPeliculas,
                        ContractLoginUser.View {
    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;

    private ServicePeliculas sPeliculas =
            new ServicePeliculas(this);
    /* PATRÓN SINGLETON*/
    private static MainActivity mainActivity = null;

    public static MainActivity getInstance() {
        return mainActivity; //0x457845AF
    }

    /* FIN PATRÓN SINGLETON*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity = this;
        initComponents();

    }

    private void initComponents() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mainActivity, message, Toast.LENGTH_SHORT).show();
                sPeliculas.getDatosPeliculas();
            }
        });
    }

    @Override
    public void showPeliculas(String message) {

    }

    @Override
    public void successLogin(User user) {

    }

    @Override
    public void failureLogin(String err) {

    }
}