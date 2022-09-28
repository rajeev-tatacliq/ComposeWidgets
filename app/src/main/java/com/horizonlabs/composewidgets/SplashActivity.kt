package com.horizonlabs.composewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.horizonlabs.customimageview.TestClass

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Log.d("",TestClass.messages[0])
    }
}