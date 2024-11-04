package com.damkur.hitungbd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PersegiActivity extends AppCompatActivity {

    private EditText inputSisi;
    private Button buttonHitung;
    private TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        // Menghubungkan variabel dengan ID di layout
        inputSisi = findViewById(R.id.inputSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textHasil = findViewById(R.id.textHasil);

        // Mengatur klik tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan input dari pengguna
                String sisiStr = inputSisi.getText().toString();

                if (sisiStr.isEmpty()) {
                    // Menampilkan pesan jika input kosong
                    Toast.makeText(PersegiActivity.this, "Masukkan panjang sisi!", Toast.LENGTH_SHORT).show();
                } else {
                    // Mengubah input menjadi angka dan menghitung luas
                    double sisi = Double.parseDouble(sisiStr);
                    double luas = sisi * sisi;

                    // Menampilkan hasil di TextView tanpa penambahan teks sebelumnya
                    textHasil.setText("Hasil: " + luas);
                }
            }
        });
    }
}
