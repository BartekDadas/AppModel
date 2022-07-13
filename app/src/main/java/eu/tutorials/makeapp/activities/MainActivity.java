package eu.tutorials.makeapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

import eu.tutorials.makeapp.MainItemsAdapter;
import eu.tutorials.makeapp.R;
import eu.tutorials.makeapp.data.model.APP;


public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    private ArrayList<APP> arrayList = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecyclerView();
    }

    void setupRecyclerView() {
        APP app = new APP("Example", R.drawable.ic_launcher_background );
        arrayList.add(app);
        MainItemsAdapter mainItemsAdapter = new MainItemsAdapter(this, arrayList);
        recyclerView = findViewById(R.id.rv_main);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(mainItemsAdapter);
    }




}