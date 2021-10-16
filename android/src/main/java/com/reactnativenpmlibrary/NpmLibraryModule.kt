package com.reactnativenpmlibrary

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class NpmLibraryModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return "NpmLibrary"
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  fun multiply(a: Int, b: Int, promise: Promise) {

    promise.resolve(a * b)
  }

  @ReactMethod
  fun showToast(message: String) {
    if (currentActivity != null) {
      Toast.makeText(currentActivity, message, Toast.LENGTH_SHORT).show()
    }
  }

}
