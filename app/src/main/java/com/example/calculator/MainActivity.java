package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Deklarasi Variable
    EditText first, second;
    Button tambah, kali, kurang, bagi, clear;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        hasil = (TextView) findViewById(R.id.hasil);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        clear = (Button) findViewById(R.id.clear);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((first.getText().length())>0 && (second.getText().length()>0))
                {
                    double satu = Double.parseDouble(first.getText().toString());
                    double dua = Double.parseDouble(second.getText().toString());
                    double result = satu + dua;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan Angka Pertama dan Angka Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((first.getText().length())>0 && (second.getText().length()>0))
                {
                    double satu = Double.parseDouble(first.getText().toString());
                    double dua = Double.parseDouble(second.getText().toString());
                    double result = satu - dua;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan Angka Pertama dan Angka Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((first.getText().length())>0 && (second.getText().length()>0))
                {
                    double satu = Double.parseDouble(first.getText().toString());
                    double dua = Double.parseDouble(second.getText().toString());
                    double result = satu * dua;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan Angka Pertama dan Angka Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((first.getText().length())>0 && (second.getText().length()>0))
                {
                    double satu = Double.parseDouble(first.getText().toString());
                    double dua = Double.parseDouble(second.getText().toString());
                    double result = satu / dua;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan Angka Pertama dan Angka Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first.setText("");
                second.setText("");
                hasil.setText("0");
                first.requestFocus();
            }
        });

    }
}