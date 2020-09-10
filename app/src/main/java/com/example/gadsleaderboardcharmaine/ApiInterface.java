package com.example.gadsleaderboardcharmaine;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/api/hours")
    Call<List<TopLearnerDetails>> getLearningHours();

    @GET("/api/skillIq")
    Call<List<TopLearnerDetails>> getSkillIq();
}
