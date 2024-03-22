package com.example.tebakgambarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GuessLineActivity extends AppCompatActivity {
    EditText edtText;
    Button btnCek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_line);

        getSupportActionBar().setTitle("Tebak Gambar");

        edtText = findViewById(R.id.guess_ln);
        btnCek = findViewById(R.id.btn_cek);
        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtText.getText().toString().isEmpty()){
                    Toast.makeText(GuessLineActivity.this, "Jawaban tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (edtText.getText().toString().equals("Line")) {
                    Toast.makeText(GuessLineActivity.this, "Jawaban benar!", Toast.LENGTH_SHORT).show();
                } else if (edtText.getText().toString().equals("line")) {
                    Toast.makeText(GuessLineActivity.this, "Jawaban benar!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Jawaban Salah!", Toast.LENGTH_SHORT).show();
//
                }
            }
        });
    }

//
}