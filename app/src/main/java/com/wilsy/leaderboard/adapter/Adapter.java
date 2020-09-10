package com.wilsy.leaderboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wilsy.leaderboard.R;
import com.wilsy.leaderboard.model.Hours;

import java.util.List;

//
// Created by Wilson Khanyezi on 2020/09/09.
//
class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
LayoutInflater mLayoutInflater;
List<Hours> mHours;

public Adapter(Context ctx, List<Hours>hours){
    this.mLayoutInflater = LayoutInflater.from(ctx);
    this.mHours = hours;

}


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = mLayoutInflater.inflate(R.layout.frame_textview, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.name.setText(mHours.get(position).getName());
    holder.hours.setText(mHours.get(position).getHours());
    holder.country.setText(mHours.get(position).getCountry());
//    holder.badgeUrl.setImageBitmap(mHours.get(position).getBadgeUrl());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    TextView name;
    TextView hours,country;
    ImageView badgeUrl;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.text_name);
        hours = itemView.findViewById(R.id.textDesc);
//        badgeUrl = itemView.findViewById(R.id.imageView);

    }
}
}
