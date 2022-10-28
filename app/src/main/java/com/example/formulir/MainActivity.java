package com.example.formulir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText etnm;
    EditText etem;
    EditText etps;
    ToggleButton tb;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inputan
        etnm = findViewById(R.id.etnm);
        etem = findViewById(R.id.etem);
        etps = findViewById(R.id.etps);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void submit_data(View view){
        Intent i1 = new Intent(this, HasilActivity.class);
        i1.putExtra("nama", etnm.getText().toString());
        i1.putExtra("tempat", etem.getText().toString());
        i1.putExtra("tanggal", etps.getText().toString());
        startActivity(i1);
    }


}