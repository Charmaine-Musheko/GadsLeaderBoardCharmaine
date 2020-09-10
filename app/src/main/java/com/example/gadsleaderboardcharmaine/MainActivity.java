package com.example.gadsleaderboardcharmaine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ApiInterface apiInterface;
    ArrayList<Todo> mData= new ArrayList<>();
    private TabLayout tablayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private RecyclerViewAdapter myViewHolder;
    private RecyclerView topLearner_recyclingview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        topLearner_recyclingview = (RecyclerView)findViewById(R.id.topLearner_recyclingview);
        topLearner_recyclingview.setLayoutManager(new LinearLayoutManager(this));
        tablayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        // Add Fragment here
        adapter.addFragment(new LearningHours(), "Top Learners");
        adapter.addFragment(new SkillIq(), "SkillIq");
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
        tablayout.getTabAt(0).setIcon(R.drawable.top_learner);
        tablayout.getTabAt(1).setIcon(R.drawable.skill_iq_trimmed);
        getTodos();
    }

    private void getTodos() {
        Call<List<Todo>> call = apiInterface.getTodo();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                mData = new ArrayList<>(response.body());
                myViewHolder = new RecyclerViewAdapter(MainActivity.this,mData);
                topLearner_recyclingview.setAdapter(myViewHolder);
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failure", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void getTodosUsingRouteParameter(View view){
    }
    public void getTodoUsingQuery(View view){
    }
    public void postTodos(View view){
    }
}