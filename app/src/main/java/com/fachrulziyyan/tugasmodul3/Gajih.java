package com.fachrulziyyan.tugasmodul3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Gajih extends AppCompatActivity {

    private EditText edtName;
    private CheckBox checkboxMarried;
    private RadioGroup radioGroupGolongan;
    private TextView txtResult1, txtResult2, txtResult3, txtResult4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gajih);

        // Inisialisasi Views
        edtName = findViewById(R.id.edtName);
        checkboxMarried = findViewById(R.id.checkboxMarried);
        radioGroupGolongan = findViewById(R.id.radioGroupGolongan);
        txtResult1 = findViewById(R.id.txtResult1);
        txtResult2 = findViewById(R.id.txtResult2);
        txtResult3 = findViewById(R.id.txtResult3);
        txtResult4 = findViewById(R.id.txtResult4);
        Button btnCalculate = findViewById(R.id.btnCalculate);

        // Set OnClickListener untuk Button
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil data dari inputan pengguna
                String name = edtName.getText().toString();
                boolean isMarried = checkboxMarried.isChecked();
                String status = isMarried ? "Menikah" : "Belum Menikah";

                int selectedGolonganId = radioGroupGolongan.getCheckedRadioButtonId();
                String golongan = "";
                if (selectedGolonganId == R.id.radioGolongan1) {
                    golongan = "Golongan 1";
                } else if (selectedGolonganId == R.id.radioGolongan2) {
                    golongan = "Golongan 2";
                }

                // Tampilkan hasil ke TextView
                txtResult1.setText("Nama: " + name);
                txtResult2.setText("Status: " + status);
                txtResult3.setText("Golongan: " + golongan);
                txtResult4.setText("Data berhasil ditampilkan");
            }
        });
    }
}