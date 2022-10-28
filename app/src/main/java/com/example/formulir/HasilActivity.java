package com.example.formulir;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    TextView txt1, txt2, txt3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 = findViewById(R.id.hasilnama);
        txt2 = findViewById(R.id.hasiltempat);
        txt3 = findViewById(R.id.hasiltanggal);

        String nama = getIntent().getExtras().getString("nama");
        String tempat = getIntent().getExtras().getString("tempat");
        String tanggal = getIntent().getExtras().getString("tanggal");

        txt1.setText("Nama : "+nama);
        txt3.setText("Tanggal Lahir : "+tanggal);
        txt2.setText("Tempat Lahir : "+tempat);


    }
}