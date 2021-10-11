package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CubeActivity extends AppCompatActivity {

    EditText sisiET;
    Button btnHasil;
    TextView tvLuas,tvKeliling,tvVolume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        sisiET = (EditText) findViewById(R.id.sisi);
        btnHasil = (Button) findViewById(R.id.hasil);
        tvLuas = (TextView) findViewById(R.id.resultLuas);
        tvKeliling = (TextView)findViewById(R.id.resultKeliling);
        tvVolume = (TextView) findViewById(R.id.resultVolume);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sisi, resultLuas,resultKeliling,resultVolume;
                sisi = Double.valueOf(sisiET.getText().toString().trim());
                resultLuas = 6 * sisi * sisi;
                resultKeliling = 12 * sisi;
                resultVolume = sisi * sisi * sisi;
                String parseLuas = String.valueOf(resultLuas);
                String parseKeliling = String.valueOf(resultKeliling);
                String parseVolume = String.valueOf(resultKeliling);

                tvLuas.setText(parseLuas);
                tvKeliling.setText(parseKeliling);
                tvVolume.setText(parseVolume);
            }
        });

    }
}