package com.dicoding_submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.tabs.TabLayout;

public class Halaman_Detail extends AppCompatActivity {

    ImageView img_profil_detail;
    TextView txt_nama_detail, txt_skill_detail, txt_rating_detail;
    RatingBar ratingBar_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman__detail);


        img_profil_detail = findViewById(R.id.ing_profil_detail);
        txt_nama_detail = findViewById(R.id.txt_nama_detail);
        txt_skill_detail =  findViewById(R.id.txt_skill_detail);
        txt_rating_detail =  findViewById(R.id.txt_rating_detail);
        ratingBar_detail = findViewById(R.id.ratingBar2);

        Bundle bundle = getIntent().getExtras();
        txt_nama_detail.setText(bundle.getString("nama"));
        txt_skill_detail.setText(bundle.getString("skill"));
        txt_rating_detail.setText(bundle.getString("rating"));
        ratingBar_detail.setRating(Float.parseFloat(bundle.getString("rating")));


        Glide.with(this)
                .load((bundle.getString("foto")))
                .apply(new RequestOptions().override(350, 550))
                .into(img_profil_detail);

    }
}
