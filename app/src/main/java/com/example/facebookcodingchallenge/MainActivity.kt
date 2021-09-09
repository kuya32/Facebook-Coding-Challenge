package com.example.facebookcodingchallenge

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.facebookcodingchallenge.network.RetroInstance
import com.example.facebookcodingchallenge.repository.CardRepository
import com.example.facebookcodingchallenge.ui.theme.FacebookCodingChallengeTheme
import com.example.facebookcodingchallenge.viewModel.MainActivityViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private lateinit var repository: CardRepository
    private var viewModel: MainActivityViewModel = MainActivityViewModel(repository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }


        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getPage()
        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("Response", response.cards.toString())
        })
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FacebookCodingChallengeTheme {
        Greeting("Android")
    }
}