package com.example.recyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyTViewHolder> {
    public Context context;
    public List<film> datalist;

    public class MyTViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView name,year;


        public MyTViewHolder(View view){
            super(view);
            photo = view.findViewById(R.id.filmphoto);
            name = view.findViewById(R.id.name);
            year = view.findViewById(R.id.year);

        }

    }

    public Adapter(Context context, List<film> foodList){
        this.context = context;
        this.datalist = foodList;
    }

    @Override
    public MyTViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film,parent,false);

        return new MyTViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyTViewHolder holder, int position) {

        film item = datalist.get(position);

        Glide.with(context.getApplicationContext())
            .load(item.getPhoto())
            .placeholder(R.drawable.ic_film)
            .into(holder.photo);

        holder.name.setText(item.getName());
        holder.year.setText(item.getYear());

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
}

