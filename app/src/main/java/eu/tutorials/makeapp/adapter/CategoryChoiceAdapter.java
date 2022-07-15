package eu.tutorials.makeapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import eu.tutorials.makeapp.R;
import eu.tutorials.makeapp.data.model.Category;

public class CategoryChoiceAdapter extends RecyclerView.Adapter<CategoryChoiceAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Category> mCategory;
    private static OnCategoryClick onCategoryClick;

    public CategoryChoiceAdapter(Context context, ArrayList<Category> mCategory, OnCategoryClick onCategoryClick) {
        this.context = context;
        this.mCategory = mCategory;
        this.onCategoryClick = onCategoryClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_choice_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv.setText(mCategory.get(position).getCategoryName());
        Glide.with(context).load(mCategory.get(position).getImageCategory()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return mCategory.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView img;
        TextView tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv_category);
            img = itemView.findViewById(R.id.iv_category);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onCategoryClick.onClickCategory(view, this.getAdapterPosition());
        }
    }

    public interface OnCategoryClick {
        void onClickCategory(View v, int position);
    }
}
