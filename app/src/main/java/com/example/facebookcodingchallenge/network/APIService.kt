package com.example.facebookcodingchallenge.network

import com.example.facebookcodingchallenge.models.Cards
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("home")
    suspend fun getCardsListFromAPI(@Query("c") cards: String): Observable<Cards>
}