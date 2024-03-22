package com.example.tebakgambarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivLine = findViewById(R.id.iv_line);
        ivLine.setOnClickListener(this);
        ImageView ivWa = findViewById(R.id.iv_wa);
        ivWa.setOnClickListener(this);
        ImageView ivSc = findViewById(R.id.iv_snapchat);
        ivSc.setOnClickListener(this);
        ImageView ivTwitter = findViewById(R.id.iv_twitter);
        ivTwitter.setOnClickListener(this);
        ImageView ivIg = findViewById(R.id.iv_ig);
        ivIg.setOnClickListener(this);
        ImageView ivYoutube = findViewById(R.id.iv_youtbe);
        ivYoutube.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.iv_line) {
            Intent lineIntent = new Intent(MainActivity.this, GuessLineActivity.class);
            startActivity(lineIntent);
        }
        if (v.getId() == R.id.iv_wa) {
            Intent lineIntent = new Intent(MainActivity.this, GuessWaActivity.class);
            startActivity(lineIntent);
        }
        if (v.getId() == R.id.iv_snapchat) {
            Intent lineIntent = new Intent(MainActivity.this, GuessSnapchatActivity.class);
            startActivity(lineIntent);
        }
        if (v.getId() == R.id.iv_twitter) {
            Intent lineIntent = new Intent(MainActivity.this, GuessTwitterActivity.class);
            startActivity(lineIntent);
        }
        if (v.getId() == R.id.iv_ig) {
            Intent lineIntent = new Intent(MainActivity.this, GuessInstagramActivity.class);
            startActivity(lineIntent);
        }
        if (v.getId() == R.id.iv_youtbe) {
            Intent lineIntent = new Intent(MainActivity.this, GuessYoutubeActivity.class);
            startActivity(lineIntent);
        }
    }
}