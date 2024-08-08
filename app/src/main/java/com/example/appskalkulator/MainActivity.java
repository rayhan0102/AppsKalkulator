package com.example.appskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //deklarasi variabel, variabel harus di deklarasikan terlebih dahulu lalu dipanggil untuk menurunkan fungsi ke object
    Button btambah,bkurang,bkali,bbagi,bbersih;
    EditText etext1,etext2;
    TextView thasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //ini menurunkan fungsi button di view ke variabel object
        //button di java
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btambah = (Button) findViewById(R.id.btntambah);
        bkurang = (Button) findViewById(R.id.btnkurang);
        bkali = (Button) findViewById(R.id.btnkali);
        bbagi = (Button) findViewById(R.id.btnbagi);
        bbersih = (Button) findViewById(R.id.BERSIHKAN);
        //textview di java
        thasil = (TextView) findViewById(R.id.hasil);
        //edit text di java
        etext1 = (EditText) findViewById(R.id.editangka1);
        etext2 = (EditText) findViewById(R.id.editangka2);

        btambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((etext1.getText().length()>0) && (etext2.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(etext1.getText().toString());
                    double angka2 = Double.parseDouble(etext2.getText().toString());
                    double result = angka1 + angka2;
                    thasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Terlebih Dahulu", Toast.LENGTH_LONG).show();
                }
            }
        });

        bkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((etext1.getText().length()>0) && (etext2.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(etext1.getText().toString());
                    double angka2 = Double.parseDouble(etext2.getText().toString());
                    double result = angka1 - angka2;
                    thasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Terlebih Dahulu", Toast.LENGTH_LONG).show();
                }
            }
        });

        bkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((etext1.getText().length()>0) && (etext2.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(etext1.getText().toString());
                    double angka2 = Double.parseDouble(etext2.getText().toString());
                    double result = angka1 * angka2;
                    thasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Terlebih Dahulu", Toast.LENGTH_LONG).show();
                }
            }
        });

        bbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((etext1.getText().length()>0) && (etext2.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(etext1.getText().toString());
                    double angka2 = Double.parseDouble(etext2.getText().toString());
                    double result = angka1 / angka2;
                    thasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Terlebih Dahulu", Toast.LENGTH_LONG).show();
                }
            }
        });

        bbersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etext1.setText("");
                etext2.setText("");
                thasil.setText("0");
                etext1.requestFocus();
            }
        });

    }

}
