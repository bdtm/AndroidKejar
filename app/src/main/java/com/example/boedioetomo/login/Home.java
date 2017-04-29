package com.example.boedioetomo.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

   Button btnLogout, btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLogout = (Button) findViewById(R.id.btnLogout);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Anda sudah Logout", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Home.this, Login.class));
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Home.this, Registrasi.class));
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                new AlertDialog.Builder(Home.this)
                        .setTitle("Android kejar Yogyakarta")
                        .setIcon(R.drawable.ic_iak)
                        .setMessage("Tugas Aplikasi Android kejar batch 3\n Yogyakarta, 29 April 2017\n budi utomo")
                        .setCancelable(false)
                        .setNegativeButton("Oke", null)
                        .show();
            }
        });
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Keluar Aplikasi?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Home.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
