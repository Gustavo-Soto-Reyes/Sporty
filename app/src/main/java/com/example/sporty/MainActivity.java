package com.example.sporty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView rv;
    private List<Sport> sportList;
    private CustomAdapter ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recyclerView);
        sportList = new ArrayList<>();
        sportList.add(new Sport(R.drawable.basketball, "Basketball"));
        sportList.add(new Sport(R.drawable.football, "Football"));
        sportList.add(new Sport(R.drawable.ping, "Pong Ping"));
        sportList.add(new Sport(R.drawable.tennis, "Tennis"));
        sportList.add(new Sport(R.drawable.volley, "Volleyball"));

        ca = new CustomAdapter(sportList);


        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(ca);

        ca.setClickListener(this);

    }

    @Override
    public void onClick(View v, int pos) {
        Toast.makeText(this, "Sport: "+sportList.get(pos).sportName, Toast.LENGTH_SHORT).show();
    }
}