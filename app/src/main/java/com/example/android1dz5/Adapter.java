package com.example.android1dz5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1dz5.databinding.ItemOfRecyclerBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<ModelOfItem> arrayList;
    private OnItemClickListener clickListener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemOfRecyclerBinding.inflate(LayoutInflater.from(parent.getContext()), parent,
                false));
    }

    public void setArrayList(ArrayList<ModelOfItem> arrayList, OnItemClickListener clickListener) {
        this.arrayList = arrayList;
        this.clickListener = clickListener;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(view -> {
            clickListener.onclick(position);
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemOfRecyclerBinding binding;

        public ViewHolder(@NonNull ItemOfRecyclerBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;


        }

        public void onBind(ModelOfItem modelOfItem) {
            binding.number.setText(modelOfItem.getNumber());
            binding.song.setText(modelOfItem.getSong());
            binding.author.setText(modelOfItem.getAuthor());
            binding.time.setText(modelOfItem.getTime());
        }
    }

    public interface OnItemClickListener {
        void onclick(int p);
    }
}
