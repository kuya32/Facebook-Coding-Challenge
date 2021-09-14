package com.example.facebookcodingchallenge.repository

import androidx.lifecycle.MutableLiveData
import com.example.facebookcodingchallenge.models.Card
import com.example.facebookcodingchallenge.models.Cards
import com.example.facebookcodingchallenge.models.Page
import com.example.facebookcodingchallenge.network.RetroInstance
import io.reactivex.Observable

interface CardRepository {

    suspend fun getPage(): Page {
        val retro = RetroInstance()
        return retro.api.getPageFromAPI()
    }
}