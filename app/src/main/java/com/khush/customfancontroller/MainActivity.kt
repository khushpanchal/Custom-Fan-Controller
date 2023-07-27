package com.khush.customfancontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khush.customfancontroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(
                mainBinding.container.id, DialFragment.newInstance(), "fragment"
            ).commitAllowingStateLoss()
        }
    }
}