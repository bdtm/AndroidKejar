package com.example.boedioetomo.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class DataRegistrasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_registrasi);

        Bundle b = getIntent().getExtras();

        TextView nik = (TextView) findViewById(R.id.nik_value);
        TextView nama = (TextView) findViewById(R.id.nama_value);
        TextView jeniskelamin = (TextView) findViewById(R.id.JK_value);
        TextView jurusan =(TextView) findViewById(R.id.jurusan_value);
        TextView Chk1 = (TextView) findViewById(R.id.hobi_value);
        TextView Chk2 = (TextView) findViewById(R.id.hobi_value2);
        TextView Chk3 = (TextView) findViewById(R.id.hobi_value3);

        nik.setText(b.getCharSequence("nik"));
        nama.setText(b.getCharSequence("nama"));
        jeniskelamin.setText(b.getCharSequence("jeniskelamin"));
        jurusan.setText(b.getCharSequence("jurusan"));
        Chk1.setText(b.getCharSequence("Chk1"));
        Chk2.setText(b.getCharSequence("Chk2"));
        Chk3.setText(b.getCharSequence("Chk3"));
    }

}
