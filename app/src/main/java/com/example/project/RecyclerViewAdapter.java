package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Ants> listOfAnts;
    private LayoutInflater layoutInflater;

    RecyclerViewAdapter(Context context, List<Ants> listOfBerg) {
        this.layoutInflater = LayoutInflater.from(context);
        this.listOfAnts = listOfBerg;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.activity_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.item.setText(listOfAnts.get(position).toString());

    }

    @Override
    public int getItemCount() {
        return listOfAnts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item;

        ViewHolder(View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.recyclerItem);
        }
    }
}
