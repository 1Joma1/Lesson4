package com.geektech.lesson4.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.lesson4.R;
import com.geektech.lesson4.viewHolders.MainViewHolder;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private int[] id;
    private String[] title, description;

    public MainAdapter(int[] id, String[] title, String[] description){
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder_main, viewGroup, false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder mainViewHolder, int i) {
        mainViewHolder.onBind(title[i], description[i]);
    }

    @Override
    public int getItemCount() {
        return id.length;
    }
}
