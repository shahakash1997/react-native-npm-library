package com.reactnativenpmlibrary

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import com.google.gson.Gson

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
  fun getJsonString(promise: Promise){
    val testClass = TestClass("akash shah",24,"Developer")
    val str = JsonUtil.jsonify(testClass);
    promise.resolve(str)
  }


  @ReactMethod
  fun showToast(message: String) {
    if (currentActivity != null) {
      Toast.makeText(currentActivity, message, Toast.LENGTH_SHORT).show()
    }
  }

}
