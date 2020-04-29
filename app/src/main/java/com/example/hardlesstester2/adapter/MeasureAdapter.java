package com.example.hardlesstester2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hardlesstester2.R;
import com.example.hardlesstester2.entity.Measure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeasureAdapter extends RecyclerView.Adapter<MeasureAdapter.MeasureViewHolder>{

    public List<Measure> measures;

    public MeasureAdapter(){
        measures = new ArrayList<>();
    }

    public void setMeasures(List<Measure> measures) {

        if(!this.measures.isEmpty()) this.measures.clear();

        this.measures.addAll(measures);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MeasureViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.main_table_item, viewGroup, false);
        return new MeasureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeasureViewHolder holder, int position) {
        Measure measure = measures.get(position);
        holder.bind(measure);
    }

    @Override
    public int getItemCount() {
        return measures.size();
    }

    class MeasureViewHolder extends RecyclerView.ViewHolder{
        private TextView measurementTextView;
        private TextView seriesCountTextView;


        public MeasureViewHolder(@NonNull View itemView) {
            super(itemView);

            seriesCountTextView = itemView.findViewById(R.id.series_count_textView);
            measurementTextView = itemView.findViewById(R.id.measurement_textView);
        }

        public void bind(Measure measure) {
            measurementTextView.setText(measure.getNameMeasurement());
            seriesCountTextView.setText(Integer.toString(measure.getCountSeries()));
        }
    }




}
