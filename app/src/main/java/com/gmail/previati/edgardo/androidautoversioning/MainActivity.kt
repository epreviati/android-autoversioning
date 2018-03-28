package com.gmail.previati.edgardo.androidautoversioning

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        text_version_code.text = BuildConfig.VERSION_CODE.toString()
        text_version_name.text = BuildConfig.VERSION_NAME

        button_show_text.setOnClickListener { Toast.makeText(applicationContext, "Click Happened!!", Toast.LENGTH_LONG).show() }
    }
}
