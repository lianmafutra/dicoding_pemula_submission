package com.dicoding_submission.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding_submission.Model.Model_Data;
import com.dicoding_submission.R;

import java.util.ArrayList;

public class My_Adapter extends RecyclerView.Adapter<My_Adapter.My_AdapterViewHolder> {

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    private ArrayList<Model_Data> list_adapter;

    public My_Adapter(ArrayList<Model_Data> list) {
        this.list_adapter = list;
    }

    @NonNull
    @Override
    public My_Adapter.My_AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_menu_utama, parent, false);
        return new My_AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final My_Adapter.My_AdapterViewHolder holder, int position) {
        Model_Data hd = list_adapter.get(position);
        holder.txt_nama.setText(hd.getNama());
        holder.txt_skill.setText(hd.getSkill());
        holder.txt_rating.setText(hd.getRating());
        holder.txt_gaji.setText("$" + hd.getGaji() + "/Hour");
        holder.ratingBar.setRating(Float.parseFloat(hd.getRating()));
        Glide.with(holder.itemView.getContext())
                .load(hd.getFoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.img_profil);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(list_adapter.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Model_Data data);
    }

    @Override
    public int getItemCount() {
        return list_adapter.size();
    }

    public class My_AdapterViewHolder extends RecyclerView.ViewHolder {
        TextView txt_nama, txt_skill, txt_gaji, txt_rating;
        ImageView img_profil;
        RatingBar ratingBar;

        public My_AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nama = itemView.findViewById(R.id.txt_nama);
            txt_skill = itemView.findViewById(R.id.txt_skill);
            txt_gaji = itemView.findViewById(R.id.txt_gaji);
            txt_rating = itemView.findViewById(R.id.txt_rating_detail);
            img_profil = itemView.findViewById(R.id.img_profil);
            ratingBar = itemView.findViewById(R.id.ratingBar);


        }
    }
}
