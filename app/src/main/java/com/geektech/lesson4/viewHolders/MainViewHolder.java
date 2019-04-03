package com.geektech.lesson4.viewHolders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.geektech.lesson4.R;

public class MainViewHolder extends RecyclerView.ViewHolder {

    private TextView titleView, desView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        titleView = itemView.findViewById(R.id.vh_main_title);
        desView = itemView.findViewById(R.id.vh_main_des);
    }

    public void onBind(String title, String des){
        titleView.setText(title);
        desView.setText(des);
    }
}
