package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleActivity extends AppCompatActivity {

    EditText alasET,tinggiET,sisiET;
    Button btnHasil;
    TextView tvLuas,tvKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        alasET = (EditText)findViewById(R.id.alas);
        tinggiET = (EditText)findViewById(R.id.tinggi);
        sisiET = (EditText)findViewById(R.id.sisi);

        btnHasil = (Button) findViewById(R.id.hasil);
        tvLuas = (TextView) findViewById(R.id.resultLuas);
        tvKeliling = (TextView)findViewById(R.id.resultKeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double alas,tinggi,sisi,resultLuas,resultKeliling;
                alas = Double.valueOf(alasET.getText().toString().trim());
                tinggi = Double.valueOf(tinggiET.getText().toString().trim());
                sisi = Double.valueOf(sisiET.getText().toString().trim());
                resultLuas = (alas * tinggi) /2 ;
                resultKeliling = sisi+sisi+sisi;
                String parseLuas = String.valueOf(resultLuas);
                String parseKeliling = String.valueOf(resultKeliling);
                tvLuas.setText(parseLuas);
                tvKeliling.setText(parseKeliling);
            }
        });
    }
}