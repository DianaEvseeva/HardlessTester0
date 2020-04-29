package com.example.hardlesstester2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.hardlesstester2.adapter.MeasureAdapter;
import com.example.hardlesstester2.entity.Measure;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Button startButton;
    private RecyclerView recyclerView;
    private MeasureAdapter measureAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.button_start);
        recyclerView = findViewById(R.id.main_activity_table);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        measureAdapter = new MeasureAdapter();
        recyclerView.setAdapter(measureAdapter);

        List<Measure> measures = getMeasures();
        measureAdapter.setMeasures(measures);


//        int size = measureAdapter.measures.size();
//        String msg = Integer.toString(size);
//        Toast.makeText(MainActivity.this,msg, Toast.LENGTH_SHORT).show();
    }


    private List<Measure> getMeasures(){
        return Arrays.asList(
                new Measure("Измерение новой детали", 2 ),
                new Measure("Измерение сплава ХХХХХХХХ-ХХХХХХХХ", 6 ),
                new Measure("Измерение детали", 2 ),
                new Measure("Новое измерение", 8 ),
                new Measure("Измерение новой детали", 1 )
        );
    }
}
