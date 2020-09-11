package com.example.gadsleaderboardcharmaine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SkillsRecyclerViewAdapter extends RecyclerView.Adapter<SkillsRecyclerViewAdapter.skillsViewHolder>  {
        Context mContextSkill;
        ArrayList<ApiSkillIqModel> mDataSkill;
        public SkillsRecyclerViewAdapter(Context mContextSkill, ArrayList<ApiSkillIqModel> mDataSkill){
            this.mContextSkill = mContextSkill;
            this.mDataSkill = mDataSkill;
        }
        @NonNull
        @Override
        public skillsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view;
            view = LayoutInflater.from(mContextSkill).inflate(R.layout.item_skilliq, parent, false);
            skillsViewHolder viewHolder = new skillsViewHolder(view);
            return viewHolder;
        }

       @Override
        public void onBindViewHolder(@NonNull  skillsViewHolder holders, int i) {
       holders.tv_namea.setText(mDataSkill.get(i).getName());
        holders.tv_skillScore.setText(String.valueOf(mDataSkill.get(i).getScore()));
        holders.tv_countrya.setText(mDataSkill.get(i).getCountry());
        holders.tv_urla.setText(mDataSkill.get(i).getBadgeUrl());
    }


        @Override
        public int getItemCount() {
            return mDataSkill.size();
        }

        public static class skillsViewHolder extends RecyclerView.ViewHolder{
            private TextView tv_namea;
            private TextView tv_skillScore;
            private TextView  tv_countrya;
            private TextView tv_urla;


            public skillsViewHolder(@NonNull View itemView) {
                super(itemView);
                tv_namea = (TextView) itemView.findViewById(R.id.name_learnera);
                tv_skillScore = (TextView) itemView.findViewById(R.id.learning_hoursb);
                tv_countrya = (TextView) (itemView).findViewById(R.id.countrya);
                tv_urla = (TextView) itemView.findViewById(R.id.badge_urla);
            }
        }

}
