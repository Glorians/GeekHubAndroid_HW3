package com.geekhub_android.hw3_beliaev

import android.content.ClipData
import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_list)

        main_list.layoutManager = LinearLayoutManager(this)
        main_list.adapter = Adapter()

    }

    val phone1 = Phone("Apple", "Iphone X", 1)
    val phone2 = Phone("Sony", "Xperia 1", 2)
    val phone3 = Phone("Google", "Pixel 4", 3)
    val phone4 = Phone("Samsung", "Galaxy Note 10", 4)
    val phone5 = Phone("OnePlus", "7T", 5)
    val phone6 = Phone("Asus", "ZenPhone 5", 6)
    val phone7 = Phone("Nokia", "Lumia 640", 7)
    val phone8 = Phone("Microsoft", "SurfacePhone", 8)

}
