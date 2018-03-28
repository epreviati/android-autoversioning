package com.gmail.previati.edgardo.androidautoversioning.extensions

import android.app.Activity
import android.widget.Toast

/**
 * © Edgardo Previati on 28/03/2018
 * previati.edgardo@gmail.com
 * AndroidAutoVersioning
 * com.gmail.previati.edgardo.androidautoversioning.extensions
 */

/**
 * Shows a toast into the activity with the requested message for the requested duration
 *
 * @param message
 * @param duration
 */
fun <T : Activity> T.toast(message: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(applicationContext, message ?: "null", duration).show()
}