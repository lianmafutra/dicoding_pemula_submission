package com.dicoding_submission;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Halaman_About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman__about);
        TextView txt_nama_profil = findViewById(R.id.txt_nama_profil);

        Typeface customfont = Typeface.createFromAsset(getAssets(), "myfont.ttf");
        txt_nama_profil.setTypeface(customfont);
    }
}
