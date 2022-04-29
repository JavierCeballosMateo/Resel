package com.example.reselapp;


import androidx.recyclerview.widget.RecyclerView;


import android.view.View;
import android.widget.TextView;

public class SubirProductoHolder extends RecyclerView.ViewHolder {
    private final TextView textView;

    public SubirProductosHolder(View itemView){
        super(itemView);
        textView = (TextView) itemView.findViewById((R.id.textViewProducto));
    }


}