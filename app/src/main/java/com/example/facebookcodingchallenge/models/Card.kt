package com.example.facebookcodingchallenge.models

import android.os.Parcel
import android.os.Parcelable

data class Card(
    val value: String?,
    val title: Title?,
    val attributes: Attributes?,
    val description: Description?,
    val image: Image?,
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readParcelable(Title::class.java.classLoader),
        parcel.readParcelable(Attributes::class.java.classLoader),
        parcel.readParcelable(Description::class.java.classLoader),
        parcel.readParcelable(Image::class.java.classLoader)
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(value)
        parcel.writeParcelable(title, flags)
        parcel.writeParcelable(attributes, flags)
        parcel.writeParcelable(description, flags)
        parcel.writeParcelable(image, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Card> {
        override fun createFromParcel(parcel: Parcel): Card {
            return Card(parcel)
        }

        override fun newArray(size: Int): Array<Card?> {
            return arrayOfNulls(size)
        }
    }
}
