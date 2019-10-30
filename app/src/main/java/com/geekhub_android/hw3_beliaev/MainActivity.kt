package com.geekhub_android.hw3_beliaev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

class MainActivity : AppCompatActivity() {

    private val phones: ArrayList<Phone> = ArrayList<Phone>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_list)


        setInitialData()
        main_list.layoutManager = LinearLayoutManager(this)
//        main_list.adapter = Adapter(this, phones)


        // создаем адаптер
        val adapter = Adapter(this, phones)
        // устанавливаем для списка адаптер
        main_list.adapter = adapter




    }

    fun setInitialData() {
        phones.add(phone1)
        phones.add(phone2)
        phones.add(phone3)
        phones.add(phone4)
        phones.add(phone5)
        phones.add(phone6)
        phones.add(phone7)
        phones.add(phone8)
    }

    val phone1 = Phone("Apple", "Iphone X", R.drawable.xperia)
    val phone2 = Phone("Sony", "Xperia 1", R.drawable.xperia)
    val phone3 = Phone("Google", "Pixel 4", R.drawable.xperia)
    val phone4 = Phone("Samsung", "Galaxy Note 10", R.drawable.xperia)
    val phone5 = Phone("OnePlus", "7T", R.drawable.xperia)
    val phone6 = Phone("Asus", "ZenPhone 5", R.drawable.xperia)
    val phone7 = Phone("Nokia", "Lumia 640", R.drawable.xperia)
    val phone8 = Phone("Microsoft", "SurfacePhone", R.drawable.xperia)

}

