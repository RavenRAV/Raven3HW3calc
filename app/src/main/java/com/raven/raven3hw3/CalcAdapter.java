package com.raven.raven3hw3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CalcAdapter extends RecyclerView.Adapter<CalcViewHolder> {

    ArrayList<String>res;

    public CalcAdapter(){
        res = new ArrayList<>();
    }

    public void addText(String text){
        res.add(text);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CalcViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_calc, parent, false);
        return new CalcViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CalcViewHolder holder, int position) {
        String  text = res.get(position);
        holder.onBind(text);

    }

    @Override
    public int getItemCount() {
        return res.size();
    }
}
