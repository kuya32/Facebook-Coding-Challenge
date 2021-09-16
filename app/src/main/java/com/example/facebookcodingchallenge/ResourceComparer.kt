package com.example.facebookcodingchallenge

import android.content.Context

class ResourceComparer {

    fun isEqual(context: Context, redId: Int, string: String): Boolean {
        return context.getString(redId) == string
    }
}