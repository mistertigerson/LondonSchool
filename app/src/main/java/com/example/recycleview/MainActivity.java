package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.recycleview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.informationBt.setOnClickListener(v -> {
            Intent intent = new Intent(this, InformationActivity.class);
            startActivity(intent);
        });
        binding.forTeachersBt.setOnClickListener(v -> {
            Intent intent = new Intent(this, TeachersActivity.class);
            startActivity(intent);
        });
        binding.forManagersBt.setOnClickListener(v -> {
        });
    }

}