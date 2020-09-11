package com.example.gadsleaderboardcharmaine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.widget.Toolbar;

import org.w3c.dom.Comment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ApiInterface apiInterface;
    private TabLayout tablayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private ImageView images;
    private ProgressBar mProgressBar;
    public static int SPLASH_TIME_OUT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tablayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        // Add Fragment here
        adapter.addFragment(new LearningHours(), getString(R.string.top_learner_title));
        adapter.addFragment(new SkillIq(), getString(R.string.top_iq_score));
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
        images = (ImageView) findViewById(R.id.imageViewa);
        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Post.class);
                startActivity(intent);
            }
        });
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(homeIntent);
            finish();

        }
    },SPLASH_TIME_OUT);
        onPreExecute();
    }

    protected void onPreExecute() {
        mProgressBar = (android.widget.ProgressBar) findViewById(R.id.progressBar);
        mProgressBar.setVisibility(View.VISIBLE);
        mProgressBar.setProgress(1);
    }

}


