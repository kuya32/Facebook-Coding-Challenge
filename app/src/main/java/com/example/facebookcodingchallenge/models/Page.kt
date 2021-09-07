package com.example.facebookcodingchallenge.models

import android.os.Parcelable
import com.example.facebookcodingchallenge.models.Cards

data class Page (
    val cards: ArrayList<Cards>
    ): Parcelable