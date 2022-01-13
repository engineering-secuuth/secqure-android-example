package com.secqure.androidexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.widget.Button
import com.secqure.secqureauth.Secqure

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rn_button = findViewById(R.id.rn_button) as Button
        // set on-click listener
        rn_button.setOnClickListener {
            Log.d("Main", "RN_Button Clicked...")
            WebView.setWebContentsDebuggingEnabled(true)
            Secqure(this@MainActivity, "68cc59e4-ed89-4271-bce3-a5b417772103", "TL5vB28DsVjb9JgH")
                .login(CallbackActivity::class.java.name)
//            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}