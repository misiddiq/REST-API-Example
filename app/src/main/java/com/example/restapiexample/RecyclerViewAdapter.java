package com.example.restapiexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * This adpter is used to display the content in the RecyclerView
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerHolder> {
    //CTR O then ALT ENTER to override the methods

    List<PhotoModel> models;

    //ALT INSERT short cut key to generate constructor
    public RecyclerViewAdapter(List<PhotoModel> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //If attachToRoot is true then it throws exception saying Rest API Example has stopped
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_row, viewGroup, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder recyclerHolder, int i) {
//        recyclerHolder.textView.setText(models.get(i).tvtitle);
//        recyclerHolder.textView.setText(models.get(i).fullUrl);
        recyclerHolder.textViewID.setText(models.get(i).id);
        recyclerHolder.textView.setText(models.get(i).fullUrl);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textViewID;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title);
            textViewID = itemView.findViewById(R.id.recID);
        }
    }
}
