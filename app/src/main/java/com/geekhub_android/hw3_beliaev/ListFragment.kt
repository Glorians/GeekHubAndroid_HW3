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


class ListFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_list, container, false)

    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {

        main_list.layoutManager = LinearLayoutManager(context)
        main_list.adapter = MainAdapter(phones, object : MainAdapter.Callback {
            override fun onItemClicked(item: Phone) {
                Toast.makeText(context, item.brand, Toast.LENGTH_SHORT).show()
            }
        })
    }

    private val phones = listOf(
        Phone("Apple", "Iphone X", R.drawable.iphonex),
        Phone("Sony", "Xperia 1", R.drawable.xperia),
        Phone("Google", "Pixel 4", R.drawable.pixel),
        Phone("Samsung", "Galaxy Note 10", R.drawable.note10),
        Phone("OnePlus", "7 Pro", R.drawable.oneplus),
        Phone("Asus", "ZenPhone 6", R.drawable.zenphone),
        Phone("Nokia", "Lumia 640", R.drawable.lumia),
        Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone),
        Phone("Asus", "ZenPhone 6", R.drawable.zenphone),
        Phone("Apple", "Iphone X", R.drawable.iphonex),
        Phone("Asus", "ZenPhone 6", R.drawable.zenphone),
        Phone("Google", "Pixel 4", R.drawable.pixel),
        Phone("Sony", "Xperia 1", R.drawable.xperia),
        Phone("OnePlus", "7 Pro", R.drawable.oneplus),
        Phone("Samsung", "Galaxy Note 10", R.drawable.note10),
        Phone("Apple", "Iphone X", R.drawable.iphonex),
        Phone("OnePlus", "7 Pro", R.drawable.oneplus),
        Phone("Asus", "ZenPhone 6", R.drawable.zenphone),
        Phone("Nokia", "Lumia 640", R.drawable.lumia),
        Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone),
        Phone("Sony", "Xperia 1", R.drawable.xperia)

    )

}
