package com.example.facebookcodingchallenge.models

import android.os.Parcel
import android.os.Parcelable

data class Title(
    val value: String?,
    val attributes: Attributes?,
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readParcelable(Attributes::class.java.classLoader)
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(value)
        parcel.writeParcelable(attributes, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Title> {
        override fun createFromParcel(parcel: Parcel): Title {
            return Title(parcel)
        }

        override fun newArray(size: Int): Array<Title?> {
            return arrayOfNulls(size)
        }
    }
}