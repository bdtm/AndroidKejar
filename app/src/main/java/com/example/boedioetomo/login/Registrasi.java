package com.example.boedioetomo.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Registrasi extends AppCompatActivity {

    EditText nama, nik, jurusan;
    Button Submit, Cancel;
    RadioGroup jeniskelamin;
    CheckBox Chk1, Chk2, Chk3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        Submit = (Button) findViewById(R.id.Submit);
        Cancel = (Button) findViewById(R.id.Cancel);
        nik = (EditText) findViewById(R.id.nik);
        nama = (EditText) findViewById(R.id.nama);
        jurusan = (EditText) findViewById(R.id.jurusan);
        jeniskelamin =(RadioGroup) findViewById(R.id.jeniskelamin);
        Chk1 = (CheckBox) findViewById(R.id.Chk1);
        Chk2 = (CheckBox) findViewById(R.id.Chk2);
        Chk3 = (CheckBox) findViewById(R.id.Chk3);

        Submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle b = new Bundle();
                if (Chk1.isChecked()){
                    b.putString("Chk1", Chk1.getText().toString());
                }
                if (Chk2.isChecked()){
                    b.putString("Chk2", Chk2.getText().toString());
                }
                if (Chk3.isChecked()){
                    b.putString("Chk3", Chk3.getText().toString());
                }
                if (nama.getText().toString().equals("") && jurusan.getText().toString().equals("") &&
                        nik.getText().toString().equals("")){
                    Toast.makeText(Registrasi.this, "Silahkan masukan data!", Toast.LENGTH_SHORT).show();
                }else
                    b.putString("nik", nik.getText().toString());
                    b.putString("nama", nama.getText().toString());
                    int id = jeniskelamin.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(id);
                    b.putString("jeniskelamin", radioButton.getText().toString());
                    b.putString("jurusan", jurusan.getText().toString());

                Intent intent = new Intent(getApplicationContext(), DataRegistrasi.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        Cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
            }
        });
        }
    }
