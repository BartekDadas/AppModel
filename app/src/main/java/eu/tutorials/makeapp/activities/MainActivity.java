package eu.tutorials.makeapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

import eu.tutorials.makeapp.MainItemsAdapter;
import eu.tutorials.makeapp.R;
import eu.tutorials.makeapp.data.model.Apps;

public class MainActivity extends AppCompatActivity {

    Context mContext;
    RecyclerView recyclerView;
    private MainItemsAdapter mainItemsAdapter;
    private ArrayList arrayList;
    private Apps mAppps;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecyclerView();
    }

    void setupRecyclerView() {
        arrayList = mAppps.getApps();
        mainItemsAdapter = new MainItemsAdapter(mContext, arrayList);
        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(mainItemsAdapter);
    }



}