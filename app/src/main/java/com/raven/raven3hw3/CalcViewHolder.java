package com.raven.raven3hw3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalcViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    public CalcViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.vh_text_view);
    }

    public void onBind(String text){
        textView.setText(text);
    }
}
