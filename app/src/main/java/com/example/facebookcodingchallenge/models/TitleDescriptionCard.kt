package com.example.facebookcodingchallenge.models

import android.os.Parcel
import android.os.Parcelable

data class TitleDescriptionCard (
    val title: Title?,
    val description: Description?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readParcelable(Title::class.java.classLoader),
        parcel.readParcelable(Description::class.java.classLoader)
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeParcelable(title, flags)
        parcel.writeParcelable(description, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TitleDescriptionCard> {
        override fun createFromParcel(parcel: Parcel): TitleDescriptionCard {
            return TitleDescriptionCard(parcel)
        }

        override fun newArray(size: Int): Array<TitleDescriptionCard?> {
            return arrayOfNulls(size)
        }
    }
}