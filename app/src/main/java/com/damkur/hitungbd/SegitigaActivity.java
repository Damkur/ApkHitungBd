package com.damkur.hitungbd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SegitigaActivity extends AppCompatActivity {

    private EditText inputBase;
    private EditText inputHeight;
    private Button buttonHitungSegitiga;
    private TextView hasilSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        // Menghubungkan elemen-elemen layout dengan kode Java
        inputBase = findViewById(R.id.inputBase);
        inputHeight = findViewById(R.id.inputHeight);
        buttonHitungSegitiga = findViewById(R.id.buttonHitungSegitiga);
        hasilSegitiga = findViewById(R.id.hasilSegitiga);

        // Menambahkan fungsi pada tombol "Hitung"
        buttonHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan nilai alas dan tinggi dari input
                String baseText = inputBase.getText().toString();
                String heightText = inputHeight.getText().toString();

                if (!baseText.isEmpty() && !heightText.isEmpty()) {
                    double base = Double.parseDouble(baseText);
                    double height = Double.parseDouble(heightText);

                    // Menghitung luas segitiga (0.5 * alas * tinggi)
                    double luas = 0.5 * base * height;

                    // Menampilkan hasil perhitungan
                    hasilSegitiga.setText("Hasil: " + luas);
                } else {
                    // Jika input kosong, tampilkan pesan kesalahan
                    hasilSegitiga.setText("Masukkan nilai alas dan tinggi.");
                }
            }
        });
    }
}
