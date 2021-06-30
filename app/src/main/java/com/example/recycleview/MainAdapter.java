package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.databinding.RecyclerItemBinding;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    public List<String> list;
    public RecyclerItemBinding binding;


    public void addList(List<String> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainAdapter.MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,
                parent, false);

        Context context;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        binding = RecyclerItemBinding.inflate(inflater, parent, false);

        return new MainViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        String text = list.get(position);

        binding.recyclerBtn.setText(text);

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder{

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

        }

    }
}
