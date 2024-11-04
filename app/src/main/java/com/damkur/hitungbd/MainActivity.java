package com.damkur.hitungbd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonPersegi;
    private Button buttonPersegiPanjang;
    private Button buttonSegitiga;
    private Button buttonLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghubungkan tombol dengan ID pada layout
        buttonPersegi = findViewById(R.id.buttonPersegi);
        buttonPersegiPanjang = findViewById(R.id.buttonPersegiPanjang);
        buttonSegitiga = findViewById(R.id.buttonSegitiga);
        buttonLingkaran = findViewById(R.id.buttonLingkaran);

        // Intent untuk berpindah ke PersegiActivity
        buttonPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PersegiActivity.class);
                startActivity(intent);
            }
        });

        // Intent untuk berpindah ke PersegiPanjangActivity
        buttonPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PersegiPanjangActivity.class);
                startActivity(intent);
            }
        });

        // Intent untuk berpindah ke SegitigaActivity
        buttonSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegitigaActivity.class);
                startActivity(intent);
            }
        });

        // Intent untuk berpindah ke LingkaranActivity
        buttonLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LingkaranActivity.class);
                startActivity(intent);
            }
        });
    }
}
