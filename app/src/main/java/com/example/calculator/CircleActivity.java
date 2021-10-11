package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends AppCompatActivity {

    Button rumus;
    EditText jariJari;
    Button btnHasil;
    TextView txtLuas,txtKeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        jariJari = (EditText) findViewById(R.id.jariJari);
        btnHasil = (Button) findViewById(R.id.hasil);
        txtLuas = (TextView)findViewById(R.id.resultLuas);
        txtKeliling = (TextView)findViewById(R.id.resultKeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jari,resultLuas,resultKeliling;
                jari = Double.valueOf(jariJari.getText().toString().trim());
                resultLuas = Math.PI * jari * jari;
                resultKeliling = 2 * Math.PI * jari * jari;
                String parseLuas = String.valueOf(resultLuas);
                String parseKeliling = String.valueOf(resultKeliling);
                txtLuas.setText(parseLuas);
                txtKeliling.setText(parseKeliling);
            }
        });


    }
}