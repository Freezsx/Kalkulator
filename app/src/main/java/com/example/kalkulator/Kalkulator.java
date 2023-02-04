package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {

    EditText edtNilaiA, edtNilaiB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        edtNilaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtNilaiA.getText().length() > 0) && (edtNilaiB.getText().length()>0)){
                    double angka1 = Double.parseDouble(edtNilaiA.getText().toString());
                    double angka2 = Double.parseDouble(edtNilaiB.getText().toString());
                    double hasil = angka1 + angka2;
                    txtHasil.setText(Double.toString(hasil));
                    Toast.makeText(getApplicationContext(),"Hasil : " +  hasil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon masukan angka pertama & kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtNilaiA.getText().length() > 0) && (edtNilaiB.getText().length()>0)){
                    double angka1 = Double.parseDouble(edtNilaiA.getText().toString());
                    double angka2 = Double.parseDouble(edtNilaiB.getText().toString());
                    double hasil = angka1 - angka2;
                    txtHasil.setText(Double.toString(hasil));
                    Toast.makeText(getApplicationContext(),"Hasil : " +  hasil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon masukan angka pertama & kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtNilaiA.getText().length() > 0) && (edtNilaiB.getText().length()>0)){
                    double angka1 = Double.parseDouble(edtNilaiA.getText().toString());
                    double angka2 = Double.parseDouble(edtNilaiB.getText().toString());
                    double hasil = angka1 * angka2;
                    txtHasil.setText(Double.toString(hasil));
                    Toast.makeText(getApplicationContext(),"Hasil : " +  hasil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon masukan angka pertama & kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtNilaiA.getText().length() > 0) && (edtNilaiB.getText().length()>0)){
                    double angka1 = Double.parseDouble(edtNilaiA.getText().toString());
                    double angka2 = Double.parseDouble(edtNilaiB.getText().toString());
                    double hasil = angka1 / angka2;
                    txtHasil.setText(Double.toString(hasil));
                    Toast.makeText(getApplicationContext(),"Hasil : " +  hasil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon masukan angka pertama & kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}