package com.example.facebookcodingchallenge.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.facebookcodingchallenge.models.Card
import com.example.facebookcodingchallenge.models.Page
import com.example.facebookcodingchallenge.network.RetroInstance
import com.example.facebookcodingchallenge.repository.CardRepository
import kotlinx.coroutines.launch

class MainActivityViewModel(private val repository: CardRepository): ViewModel() {

    val myResponse: MutableLiveData<Page> = MutableLiveData()

    fun getPage() {
        viewModelScope.launch {
            val response = repository.getPage()
            myResponse.value = response
        }
    }
}