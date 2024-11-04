package com.damkur.hitungbd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LingkaranActivity extends AppCompatActivity {

    private EditText inputRadius;
    private Button buttonHitungLingkaran;
    private TextView hasilLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        // Menghubungkan elemen-elemen layout dengan kode Java
        inputRadius = findViewById(R.id.inputRadius);
        buttonHitungLingkaran = findViewById(R.id.buttonHitungLingkaran);
        hasilLingkaran = findViewById(R.id.hasilLingkaran);

        // Menambahkan fungsi pada tombol "Hitung"
        buttonHitungLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan nilai jari-jari dari input
                String radiusText = inputRadius.getText().toString();

                if (!radiusText.isEmpty()) {
                    double radius = Double.parseDouble(radiusText);

                    // Menghitung luas lingkaran (π * r * r)
                    double luas = Math.PI * radius * radius;

                    // Menampilkan hasil perhitungan
                    hasilLingkaran.setText("Hasil: " + luas);
                } else {
                    // Jika input kosong, tampilkan pesan kesalahan
                    hasilLingkaran.setText("Masukkan nilai jari-jari.");
                }
            }
        });
    }
}
