package com.damkur.hitungbd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PersegiPanjangActivity extends AppCompatActivity {

    private EditText inputPanjang;
    private EditText inputLebar;
    private Button buttonHitung;
    private TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        // Menghubungkan variabel dengan ID di layout
        inputPanjang = findViewById(R.id.inputPanjang);
        inputLebar = findViewById(R.id.inputLebar);
        buttonHitung = findViewById(R.id.buttonHitung);
        textHasil = findViewById(R.id.textHasil);

        // Mengatur klik tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan input panjang dan lebar dari pengguna
                String panjangStr = inputPanjang.getText().toString();
                String lebarStr = inputLebar.getText().toString();

                if (panjangStr.isEmpty() || lebarStr.isEmpty()) {
                    // Menampilkan pesan jika input kosong
                    Toast.makeText(PersegiPanjangActivity.this, "Masukkan panjang dan lebar!", Toast.LENGTH_SHORT).show();
                    textHasil.setText("Hasil: "); // Menghapus hasil sebelumnya
                } else {
                    // Mengubah input menjadi angka dan menghitung luas
                    double panjang = Double.parseDouble(panjangStr);
                    double lebar = Double.parseDouble(lebarStr);
                    double luas = panjang * lebar;

                    // Menampilkan hasil di TextView tanpa menambah teks sebelumnya
                    textHasil.setText("Hasil: " + luas);
                }
            }
        });
    }
}
