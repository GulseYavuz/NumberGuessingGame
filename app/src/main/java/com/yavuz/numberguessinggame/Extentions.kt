package com.yavuz.numberguessinggame

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.replaceFragment(fragment: Fragment){
    this.supportFragmentManager.beginTransaction()
        .addToBackStack(fragment.tag)
        .replace(R.id.frame_layout, fragment)
        .commit()
}

fun Fragment.replaceFragment(fragment: Fragment){
    this.requireActivity().supportFragmentManager
        .beginTransaction()
        .addToBackStack(fragment.tag)
        .replace(R.id.frame_layout, fragment)
        .commit()
}