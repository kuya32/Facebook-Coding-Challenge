package com.example.facebookcodingchallenge.models

import android.os.Parcel
import android.os.Parcelable

data class Attributes (
    val text_color: String?,
    val font: Font?
        ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readParcelable(Font::class.java.classLoader)
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(text_color)
        parcel.writeParcelable(font, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Attributes> {
        override fun createFromParcel(parcel: Parcel): Attributes {
            return Attributes(parcel)
        }

        override fun newArray(size: Int): Array<Attributes?> {
            return arrayOfNulls(size)
        }
    }
}