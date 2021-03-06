package com.codeblogs.mvvmandroidarchitecture.data.remote.service

import com.codeblogs.mvvmandroidarchitecture.data.dto.recipe.RecipesItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("recipes.json")
    suspend fun fetchRecipes(): Response<List<RecipesItem>>
}