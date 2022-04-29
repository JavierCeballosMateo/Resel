package com.example.reselapp;


import android.app.Activity;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubirProductosAdapter extends RecyclerView.Adapter<SubirProductosActivity> {

    private List<SubirProductosActivity> allProducts;
    private Activity activity;

    public SubirProductosAdapter(List<SubirProductosActivity> productSet, Activity activity){
        this.allProducts = productSet;


    }


    @NonNull
    @Override
    public SubirProductosActivity onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SubirProductosActivity holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}