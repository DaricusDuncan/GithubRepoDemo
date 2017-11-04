package com.example.thewealthyduncan.githubrepodemo.api.service;

import com.example.thewealthyduncan.githubrepodemo.api.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by TheWealthyDuncan on 11/3/17.
 */

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}
