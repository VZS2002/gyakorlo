package com.example.gyakorlo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText beir;
    private Button nagy,kis,szin;
    private TextView szoveg;

    public int getRandomSzin(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nagy = findViewById(R.id.nagy);
        Button kis = findViewById(R.id.kis);
        Button szin = findViewById(R.id.szin);
        EditText beir = findViewById(R.id.beir);
        TextView szoveg = findViewById(R.id.szoveg);

        nagy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szoveg.setText(beir.getText().toString().toUpperCase());
            }
        });
        kis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szoveg.setText(beir.getText().toString().toLowerCase());
            }
        });
        szin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               szoveg.setBackgroundColor(getRandomSzin());
            }
        });
    }
}