package com.example.gadsleaderboardcharmaine;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static retrofit2.converter.gson.GsonConverterFactory.*;

public class ApiClient {
    private static final String BASE_URL = "https://docs.google.com/forms/d/e/1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse";
    private Retrofit retrofit;
    private static ApiClient mInstance;

    private ApiClient() {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        public static synchronized ApiClient getInstance () {
            if (mInstance == null) {
                mInstance = new ApiClient();
            }
            return mInstance;
    }
    public ApiInterface getApi(){
        return retrofit.create(ApiInterface.class);
    }
}
