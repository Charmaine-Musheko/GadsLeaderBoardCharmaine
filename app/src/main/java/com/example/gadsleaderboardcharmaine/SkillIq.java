package com.example.gadsleaderboardcharmaine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SkillIq extends Fragment{
    View view;
    private static final String TAG = "LearningHours";
    private RecyclerView skillRecyclerview;
    private ArrayList<ApiSkillIqModel> skillScore;
    public SkillIq() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.skill_iq,container,false);
        skillRecyclerview = (RecyclerView) view.findViewById(R.id.skilliq_recyclerview);
        SkillsRecyclerViewAdapter skillsRecyclerViewAdapter = new SkillsRecyclerViewAdapter(getContext(),skillScore);
        skillRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        skillRecyclerview.setAdapter(skillsRecyclerViewAdapter);
        return view;
    }

    /**
     * Called to do initial creation of a fragment.  This is called after
     * {@link #//onAttach(Activity)} and before
     * {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}.
     *
     * <p>Note that this can be called while the fragment's activity is
     * still in the process of being created.  As such, you can not rely
     * on things like the activity's content view hierarchy being initialized
     * at this point.  If you want to do work once the activity itself is
     * created, see {@link #onActivityCreated(Bundle)}.
     *
     * <p>Any restored child fragments will be created before the base
     * <code>Fragment.onCreate</code> method returns.</p>
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        skillScore = new ArrayList<>();
        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                 277,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                288,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                200,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                254,
                 "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                260,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                287,
                "Nigeria",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
               167,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                294,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                259,
              "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                190,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                175,
              "Nigeria",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel( "Perry Oluwatobi",
                156,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                192,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel( "Perry Oluwatobi",
               215,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                239,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                185,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Oluwatobi",
                180,
                "Nigeria",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel( "Perry Sam",
                 255,
                "South Africa",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel("Perry Zimo",
                 259,
            "Tanzania",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));

        skillScore.add(new ApiSkillIqModel( "Paul Chenge",
                 202,
                "Zimbabwe",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700835/skill-IQ-trimmed.png"));
        }
}



