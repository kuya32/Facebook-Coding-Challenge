package com.example.facebookcodingchallenge.models

import android.os.Parcel
import android.os.Parcelable

data class Font (
    val size: Int?
        ) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readValue(Int::class.java.classLoader) as? Int) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(size)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Font> {
        override fun createFromParcel(parcel: Parcel): Font {
            return Font(parcel)
        }

        override fun newArray(size: Int): Array<Font?> {
            return arrayOfNulls(size)
        }
    }
}