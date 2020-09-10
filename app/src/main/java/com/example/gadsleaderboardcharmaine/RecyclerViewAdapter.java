package com.example.gadsleaderboardcharmaine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.URL;
import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {
   Context mContext;
   ArrayList<ApiHoursModel> mData;
   public RecyclerViewAdapter(Context mContext, ArrayList<ApiHoursModel> mData){
       this.mContext = mContext;
       this.mData = mData;
   }
    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_toplearner, parent, false);
        myViewHolder vHolder = new myViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
    holder.tv_name.setText(mData.get(position).getName());
    holder.tv_learningHours.setImageResource(mData.get(position).getHours());
    holder.tv_country.setText(mData.get(position).getCountry());
    holder.tv_url.setText(mData.get(position).getBadgeUrl());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{
       private TextView tv_name;
       private ImageView tv_learningHours;
       private TextView  tv_country;
       private TextView tv_url;
       private ImageView img;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.name_learner);
            tv_learningHours = (ImageView) itemView.findViewById(R.id.learning_hours);
            tv_country = (TextView) (itemView).findViewById(R.id.country);
            tv_url = (TextView) itemView.findViewById(R.id.badge_url);
            img = (ImageView) itemView.findViewById(R.id.img_content);
        }
    }
}
