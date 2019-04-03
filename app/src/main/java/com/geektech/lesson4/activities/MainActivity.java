package com.geektech.lesson4.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.geektech.lesson4.R;
import com.geektech.lesson4.adapters.MainAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    int[] id = {1, 2, 3, 4, 5};
    String[] title = {"Iphone", "Samsung", "Xioami", "Honor", "Lenovo"};
    String[] des = {"Iphone des.", "Samsung des.", "Xiaomi des.", "Honor des.", "Lenovo des."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MainAdapter adapter = new MainAdapter(id, title, des);
        recyclerView.setAdapter(adapter);
    }
}
