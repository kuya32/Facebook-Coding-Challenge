package com.example.facebookcodingchallenge.models

import android.os.Parcel
import android.os.Parcelable
import com.example.facebookcodingchallenge.models.Cards

data class Page (
    val cards: ArrayList<Cards>?
    ): Parcelable {
    constructor(parcel: Parcel) : this(arrayListOf<Cards>().apply {
        parcel.readList(this, Cards::class.java.classLoader)
    }) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeList(cards)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Page> {
        override fun createFromParcel(parcel: Parcel): Page {
            return Page(parcel)
        }

        override fun newArray(size: Int): Array<Page?> {
            return arrayOfNulls(size)
        }
    }
}