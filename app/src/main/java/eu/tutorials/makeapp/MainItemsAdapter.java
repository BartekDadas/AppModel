package eu.tutorials.makeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

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
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
                return new ViewModel(view);
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.btn_add_up, parent, false);
                return new ViewModel(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewModel holder, int position) {
        holder.textView.setText(array.get(position).getTitle());
//        Glide.with(context).load(array.get(position).getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return array.size();
    }


    @Override
    public int getItemViewType(int position) {

        if (position != array.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    public static class ViewModel extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public ViewModel(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_item_main);
            imageView =  itemView.findViewById(R.id.iv_item_main);
        }
    }
}
