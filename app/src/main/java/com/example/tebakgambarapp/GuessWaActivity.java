package com.example.tebakgambarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GuessWaActivity extends AppCompatActivity {

    EditText edtText;
    Button btnCek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_wa);

        getSupportActionBar().setTitle("Tebak Gambar");

        edtText = findViewById(R.id.guess_wa);
        btnCek = findViewById(R.id.btn_cek);
        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtText.getText().toString().isEmpty()){
                    Toast.makeText(GuessWaActivity.this, "Jawaban tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (edtText.getText().toString().equals("Whatsapp")) {
                    Toast.makeText(GuessWaActivity.this, "Jawaban benar!", Toast.LENGTH_SHORT).show();
                } else if (edtText.getText().toString().equals("whatsapp")) {
                    Toast.makeText(GuessWaActivity.this, "Jawaban benar!", Toast.LENGTH_SHORT).show();
                } else if (edtText.getText().toString().equals("WA")) {
                    Toast.makeText(GuessWaActivity.this, "Jawaban benar!", Toast.LENGTH_SHORT).show();
                } else if (edtText.getText().toString().equals("Wa")) {
                    Toast.makeText(GuessWaActivity.this, "Jawaban benar!", Toast.LENGTH_SHORT).show();
                } else if (edtText.getText().toString().equals("wa")) {
                    Toast.makeText(GuessWaActivity.this, "Jawaban benar!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Jawaban Salah!", Toast.LENGTH_SHORT).show();
//
                }
            }
        });
    }

}