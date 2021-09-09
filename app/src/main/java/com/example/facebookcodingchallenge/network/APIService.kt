package com.example.facebookcodingchallenge.network

import com.example.facebookcodingchallenge.models.Card
import com.example.facebookcodingchallenge.models.Cards
import com.example.facebookcodingchallenge.models.Page
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("home")
    suspend fun getPageFromAPI(): Page
}