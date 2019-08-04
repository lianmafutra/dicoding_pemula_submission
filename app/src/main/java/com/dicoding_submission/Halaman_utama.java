package com.dicoding_submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dicoding_submission.Adapter.My_Adapter;
import com.dicoding_submission.Data.My_Data;
import com.dicoding_submission.Model.Model_Data;

import java.util.ArrayList;

public class Halaman_utama extends AppCompatActivity {


    private RecyclerView rv;
    private ArrayList<Model_Data> list = new ArrayList<>();
    My_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        rv = findViewById(R.id.id_rv_menu_utama);
        rv.setHasFixedSize(true);
        list.addAll(My_Data.getlistdata());
        showRecyclerList();


    }

    private void showRecyclerList() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new My_Adapter(list);
        rv.setAdapter(adapter);
        adapter.setOnItemClickCallback(new My_Adapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Model_Data data) {
                showSelectedHero(data);
            }
        });
    }

    private void showSelectedHero(Model_Data hero) {
        Intent intent = new Intent(Halaman_utama.this, Halaman_Detail.class);
        intent.putExtra("nama", hero.getNama());
        intent.putExtra("foto", hero.getFoto());
        intent.putExtra("skill", hero.getSkill());
        intent.putExtra("rating", hero.getRating());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent intent = new Intent(Halaman_utama.this, Halaman_About.class);
                startActivity(intent);
                break;

            case R.id.action_exit:
                finish();
                break;

        }
    }
}
