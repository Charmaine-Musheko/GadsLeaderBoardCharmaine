package com.example.gadsleaderboardcharmaine;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/api/hours")
    Call<List<Todo>> getTodo();

    @GET("/api/skillIq")
    Call<List<Todo>> getSkillIq();
}
