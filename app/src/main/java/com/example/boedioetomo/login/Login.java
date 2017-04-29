package com.example.boedioetomo.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText edtUsername, edtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPass = (EditText) findViewById(R.id.edtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUsername.getText().toString().equals("") &&
                        edtPass.getText().toString().equals("")){
                   Toast.makeText(Login.this, "Silahkan masukan data!", Toast.LENGTH_SHORT).show();
                }
                else if
                (edtUsername.getText().toString().equals("admin") &&
                        edtPass.getText().toString().equals("admin")){
                    Toast.makeText(Login.this,"Login berhasil gan", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Login.this, Home.class));
                    finish();
                }else {
                    Toast.makeText(Login.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
