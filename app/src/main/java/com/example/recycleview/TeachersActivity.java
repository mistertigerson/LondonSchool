package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.databinding.ActivityMain3Binding;
import com.example.recycleview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class TeachersActivity extends AppCompatActivity {

    public ActivityMain3Binding binding;
    public ArrayList<String> arrayList = new ArrayList<>();

    public MainAdapter adapter = new MainAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView((binding.getRoot()));

        binding.recycler1.setAdapter(adapter);
        adapter.addList(arrayList);
        createList();

    }


    private void createList() {

        arrayList.add("Система mylondonschool.com");
        arrayList.add("Owncloud");
        arrayList.add("Gmail");
        arrayList.add("Контакты");
        arrayList.add("Онлайн уроки");
        arrayList.add("Emergency Cases");
        arrayList.add("Карта школы");

    }
}