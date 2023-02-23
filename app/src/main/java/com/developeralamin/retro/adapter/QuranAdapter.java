package com.developeralamin.retro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developeralamin.retro.R;
import com.developeralamin.retro.model.QuranModel;

import java.util.List;

public class QuranAdapter extends RecyclerView.Adapter<QuranAdapter.QuranViewHolder> {

    private Context context;
    private List<QuranModel> list;


    public QuranAdapter(Context context, List<QuranModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public QuranAdapter.QuranViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new QuranViewHolder(LayoutInflater.from(context).inflate(R.layout.quran_item_layout,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull QuranAdapter.QuranViewHolder holder, int position) {

        holder.textView1.setText(list.get(position).getNameBengali().toString());
        holder.textView2.setText(list.get(position).getNameEnglish().toString());
       // holder.textView2.setText(String.valueOf(list.get(position).getNumber()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class QuranViewHolder extends RecyclerView.ViewHolder {

        TextView textView1, textView2;

        public QuranViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.name);
            textView2 = itemView.findViewById(R.id.english);
        }
    }
}
