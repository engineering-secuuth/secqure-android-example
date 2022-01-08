package com.secqure.androidexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class CallbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_callback)

        val intent = intent
        val message = intent.getStringExtra("LOGIN_SUCCESS_MESSAGE")
        Log.d("payload_in_callback:", message!!)
    }
}