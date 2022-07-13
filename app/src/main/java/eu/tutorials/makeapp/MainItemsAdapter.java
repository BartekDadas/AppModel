package eu.tutorials.makeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import eu.tutorials.makeapp.activities.ChoiceAppActivity;
import eu.tutorials.makeapp.activities.MainActivity;
import eu.tutorials.makeapp.data.model.APP;

public class MainItemsAdapter extends RecyclerView.Adapter<MainItemsAdapter.ViewModel> {

    private Context context;
    private ArrayList<APP> array;

    public MainItemsAdapter(Context context, ArrayList<APP> array) {
        this.context = context;
        this.array = array;
    }

    @NonNull
    @Override
    public ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == R.layout.item_main) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent,
                    false);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.btn_add_up, parent,false);
        }
        return new ViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewModel holder, int position) {
        if (position == array.size()) {
            holder.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, ChoiceAppActivity.class);
                    context.startActivity(intent);
                }
            });
        } else {
            holder.textView.setText(array.get(position).getTitle());
//        Glide.with(context).load(array.get(position).getImage()).into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return array.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        return (position == array.size()) ? R.layout.btn_add_up : R.layout.item_main;
    }


    public static class ViewModel extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        Button button;

        public ViewModel(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_item_main);
            imageView =  itemView.findViewById(R.id.iv_item_main);
            button = itemView.findViewById(R.id.btn_add_app);
        }
    }
}
