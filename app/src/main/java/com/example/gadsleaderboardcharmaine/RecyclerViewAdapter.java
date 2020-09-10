package com.example.gadsleaderboardcharmaine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {
   Context mContext;
   List<Todo> mData;
   public RecyclerViewAdapter(Context mContext, List<Todo> mData){
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
    holder.tv_learningHours.setText(mData.get(position).getLearningHours());
    holder.img.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{
       private TextView tv_name;
       private TextView tv_learningHours;
       private ImageView img;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.name_learner);
            tv_learningHours = (TextView) itemView.findViewById(R.id.learning_hours);
            img = (ImageView) itemView.findViewById(R.id.img_content);
        }
    }
}
