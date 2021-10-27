package com.reactnativenpmlibrary

import android.util.Log
import com.google.gson.Gson
import java.lang.Exception


object JsonUtil {
  private const val TAG = "JsonUtil"
  private val M_GSON = Gson()
  fun jsonify(obj: Any?): String {
    return try {
      M_GSON.toJson(obj)
    } catch (e: Exception) {
      Log.d(TAG, "jsonify: ")
      return ""
    }
  }
}
