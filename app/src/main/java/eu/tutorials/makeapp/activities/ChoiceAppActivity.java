package eu.tutorials.makeapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import eu.tutorials.makeapp.R;
import eu.tutorials.makeapp.adapter.CategoryChoiceAdapter;
import eu.tutorials.makeapp.data.model.Category;

public class ChoiceAppActivity extends AppCompatActivity {

    ArrayList<Category> categories;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_app);
        setupRecyclerView();
    }

    void setupRecyclerView() {
        categories = new ArrayList<Category>();
        recyclerView = findViewById(R.id.rv_category);
        CategoryChoiceAdapter adapter = new CategoryChoiceAdapter(this, categories);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        fillCategories();
    }

    private void fillCategories() {
        Category category = new Category("Market", R.drawable.basket);
        categories.add(category);
        category = new Category("Service", R.drawable.waiter );
        categories.add(category);
        category = new Category("Blog", R.drawable.letter);
        categories.add(category);

    }






}