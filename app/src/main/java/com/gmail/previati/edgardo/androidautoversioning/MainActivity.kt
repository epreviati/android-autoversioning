package com.gmail.previati.edgardo.androidautoversioning

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gmail.previati.edgardo.androidautoversioning.extensions.toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * © Edgardo Previati on 28/03/2018
 * previati.edgardo@gmail.com
 * AndroidAutoVersioning
 * com.gmail.previati.edgardo.androidautoversioning
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        text_version_code.text = BuildConfig.VERSION_CODE.toString()
        text_version_name.text = BuildConfig.VERSION_NAME
        text_build_type.text = BuildConfig.BUILD_TYPE

        button_show_flavor.setOnClickListener { toast(BuildConfig.FLAVOR) }
        button_show_application_id.setOnClickListener { toast(BuildConfig.APPLICATION_ID) }
    }
}
