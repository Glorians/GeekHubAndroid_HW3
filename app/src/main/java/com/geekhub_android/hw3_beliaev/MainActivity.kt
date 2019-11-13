package com.geekhub_android.hw3_beliaev

import android.content.ClipData
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (savedInstanceState == null) {
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.main_list, ListFragment.newInstance(), "phoneList")
//                .commit()
//        }
    }

//    override fun onPhoneSelected (phone: Phone) {
//        val detailsFragment =
//            DetailsFragment.newInstance()
//    }
}

