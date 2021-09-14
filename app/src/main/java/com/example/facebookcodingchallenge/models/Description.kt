package com.example.facebookcodingchallenge.models

import android.os.Parcel
import android.os.Parcelable

data class Description(
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

    companion object CREATOR : Parcelable.Creator<Description> {
        override fun createFromParcel(parcel: Parcel): Description {
            return Description(parcel)
        }

        override fun newArray(size: Int): Array<Description?> {
            return arrayOfNulls(size)
        }
    }
}
