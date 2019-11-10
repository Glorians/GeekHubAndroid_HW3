package com.geekhub_android.hw3_beliaev

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

private val phones: ArrayList<Phone> = ArrayList<Phone>() // Список телефонов

class ListFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_list, container, false)

    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {
        setInitialData() // Инициализируем данные

        main_list.layoutManager = LinearLayoutManager(context)
        main_list.adapter = MainAdapter(phones, object : MainAdapter.Callback {
            override fun onItemClicked(item: Phone) {
                Toast.makeText(context, item.brand, Toast.LENGTH_SHORT).show()
            }
        })
    }

    // Слабонервным не смотреть
    private fun setInitialData() {
        phones.add(phone1)
        phones.add(phone2)
        phones.add(phone3)
        phones.add(phone4)
        phones.add(phone5)
        phones.add(phone6)
        phones.add(phone7)
        phones.add(phone8)
        phones.add(phone9)
        phones.add(phone10)
        phones.add(phone11)
        phones.add(phone12)
        phones.add(phone13)
        phones.add(phone14)
        phones.add(phone15)
        phones.add(phone16)
        phones.add(phone17)
        phones.add(phone18)
        phones.add(phone19)
        phones.add(phone20)
    }

    val phone1 = Phone("Apple", "Iphone X", R.drawable.iphonex)
    val phone2 = Phone("Sony", "Xperia 1", R.drawable.xperia)
    val phone3 = Phone("Google", "Pixel 4", R.drawable.pixel)
    val phone4 = Phone("Samsung", "Galaxy Note 10", R.drawable.note10)
    val phone5 = Phone("OnePlus", "7 Pro", R.drawable.oneplus)
    val phone6 = Phone("Asus", "ZenPhone 6", R.drawable.zenphone)
    val phone7 = Phone("Nokia", "Lumia 640", R.drawable.lumia)
    val phone8 = Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone)
    val phone9 = Phone("Samsung", "Galaxy Note 10", R.drawable.note10)
    val phone10 = Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone)
    val phone11 = Phone("Samsung", "Galaxy Note 10", R.drawable.note10)
    val phone12 = Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone)
    val phone13 = Phone("Apple", "Iphone X", R.drawable.iphonex)
    val phone14 = Phone("Google", "Pixel 4", R.drawable.pixel)
    val phone15 = Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone)
    val phone16 = Phone("Asus", "ZenPhone 6", R.drawable.zenphone)
    val phone17 = Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone)
    val phone18 = Phone("Google", "Pixel 4", R.drawable.pixel)
    val phone19 = Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone)
    val phone20 = Phone("Apple", "Iphone X", R.drawable.iphonex)







}
