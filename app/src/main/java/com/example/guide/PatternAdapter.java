package com.example.guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PatternAdapter  extends RecyclerView.Adapter<PatternAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Pattern> patterns;

    PatternAdapter(Context context, List<Pattern> patterns) {
        this.patterns = patterns;
        this.inflater = LayoutInflater.from(context);
    }

    public PatternAdapter(LayoutInflater inflater,  List<Pattern> patterns) {
        this.inflater = inflater;
        this.patterns = patterns;
    }

    @NonNull
    @Override
    public PatternAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PatternAdapter.ViewHolder holder, int position) {
        Pattern state = patterns.get(position);
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getDescription());
    }

    @Override
    public int getItemCount() {
        return patterns.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.description);
        }
    }
}