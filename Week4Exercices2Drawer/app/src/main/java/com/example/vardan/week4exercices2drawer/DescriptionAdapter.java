package com.example.vardan.week4exercices2drawer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DescriptionAdapter extends RecyclerView.Adapter<DescriptionAdapter.ListViewHolder> {

    private Context context;
    private String[] listModels;

    DescriptionAdapter(Context context, String[] listModels) {
        this.context = context;
        this.listModels = listModels;
    }

    @Override
    public DescriptionAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        final View view = inflater.inflate(R.layout.list_description, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DescriptionAdapter.ListViewHolder holder, int position) {
        Picasso.get().load(listModels[position]).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return listModels.length;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;

        ListViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_description);
        }
    }
}
