package com.example.facebookcodingchallenge.models

import android.os.Parcel
import android.os.Parcelable

data class TextCard (
        val value: String?,
        val attributes: Attributes?
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

        companion object CREATOR : Parcelable.Creator<TextCard> {
                override fun createFromParcel(parcel: Parcel): TextCard {
                        return TextCard(parcel)
                }

                override fun newArray(size: Int): Array<TextCard?> {
                        return arrayOfNulls(size)
                }
        }
}