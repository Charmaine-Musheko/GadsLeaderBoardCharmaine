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

public class LearningHours extends Fragment {
    View v;
    private static final String TAG = "LearningHours";
    private RecyclerView myrecyclerview;
    private ArrayList<ApiHoursModel> listHours;
    public LearningHours() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.learning_hours,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.topLearner_recyclingview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listHours);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
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

        listHours = new ArrayList<>();
        listHours.add(new ApiHoursModel("Kojo Yeboah",
                 55,
                 "Ghana",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel("Sam George",
                 120,
                 "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel("Kojo Asante",
                102,
                "Kenya",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel("Eric Yenge",
               59,
                "Tanzania",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel("Kojo Yeboah",
                65,
                "Ghana",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel( "Sam George",
                 87,
                 "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel( "Kojo Asante",
                69,
                 "Kenya",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel("Eric Yenge",
                104,
                 "Tanzania",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel( "Kojo Yeboah",
                53,
                 "Ghana",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel( "Sam George",
                 102,
                "Nigeria",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add( new ApiHoursModel( "Kojo Asante",
                 80,
                "Kenya",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel(
                "Eric Yenge",
                61,
                "Tanzania",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png" ));
        listHours.add(new ApiHoursModel( "Kojo Yeboah",
                 63,
                "Ghana",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel("Sam George",
                 100,
                 "Nigeria",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel( "Kojo Asante",
                 104,
               "Kenya",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel(  "Eric Yenge",
                 76,
                "Tanzania",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel( "Kojo Yeboah",
                 97,
                 "Ghana",
               "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel( "Sam George",
                72,
                 "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel("Sam George",
                 63,
                "Nigeria",
                "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));
        listHours.add(new ApiHoursModel("Kojo Asante",
                96,
                 "Kenya",
                 "https://res.cloudinary.com/mikeattara/image/upload/v1596700848/Top-learner.png"));

    }
}
