package com.example.facebookcodingchallenge.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.Glide
import com.example.facebookcodingchallenge.models.Card
import com.example.facebookcodingchallenge.utils.DEFAULT_CARD_IMAGE
import com.example.facebookcodingchallenge.utils.loadImage

@Composable
fun SingleCard(
    card: Card
) {
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(
                bottom = 6.dp,
                top = 6.dp
            )
            .fillMaxWidth(),
        elevation = 8.dp
    ) {
        Column {
            card.image?.url.let { url ->
                val image = url?.let { loadImage(url = it, defaultImage = DEFAULT_CARD_IMAGE).value }
                image?.let { img ->
                    Image(
                        bitmap = img.asImageBitmap(),
                        "Card",
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        contentScale = ContentScale.Crop,
                    )
                }
            }
        }
    }
}