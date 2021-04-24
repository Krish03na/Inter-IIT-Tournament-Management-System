package com.example.interiitapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


public class MyAdapter extends FirebaseRecyclerAdapter<standingEntry, MyAdapter.entryViewHolder> {

    public MyAdapter(@NonNull FirebaseRecyclerOptions<standingEntry> options) {
        super(options);
    }

    @Override
    protected  void onBindViewHolder(@NonNull entryViewHolder holder, int position, @NonNull standingEntry model){
        holder.rank.setText(String.valueOf(position));//not checked if null
        holder.name.setText(model.getName());//not checked if null
        holder.points.setText(String.valueOf(model.getPoints()));//not checked if null
        //System.out.println("GIVEN HERE" + model.getName());
    }

    @NonNull
    @Override
    public entryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){//functions are public so anyone can change
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new entryViewHolder(view);
    }
    static class entryViewHolder extends RecyclerView.ViewHolder{
        TextView rank,name,points;

        public entryViewHolder(@NonNull View itemView){
            super(itemView);

            rank = itemView.findViewById(R.id.rank);
            name = itemView.findViewById(R.id.name);
            points = itemView.findViewById(R.id.points);
        }
    }
}
