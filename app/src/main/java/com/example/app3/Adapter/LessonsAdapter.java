package com.example.app3.Adapter;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.app3.Domain.Lessions;
import com.example.app3.databinding.ViewholderExerciseBinding;
import com.example.app3.databinding.ViewholderWorkoutBinding;

import java.util.ArrayList;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.Viewholder> {
    private final ArrayList<Lessions> list;
    private Context context;

    public LessonsAdapter(ArrayList<Lessions> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public LessonsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
      ViewholderExerciseBinding binding=ViewholderExerciseBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new Viewholder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull LessonsAdapter.Viewholder holder, @SuppressLint("RecyclerView") int position) {
          holder.binding.titleTxt.setText(list.get(position).getTitle());
          holder.binding.priceTxt.setText(list.get(position).getDuration());
          int resId=context.getResources().getIdentifier(list.get(position).getPicPath(),"drawable",context.getPackageName());
        Glide.with(context)
                .load(resId)
                .into(holder.binding.pic);
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("amazon://www.amazon.in/"+list.get(position).getLink()));
                Intent webIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/"+list.get(position).getLink()));
                try {
                  context.startActivity(appIntent);
                }
                catch (ActivityNotFoundException ex){
                  context.startActivity(webIntent);
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ViewholderExerciseBinding binding;
        public Viewholder(ViewholderExerciseBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
