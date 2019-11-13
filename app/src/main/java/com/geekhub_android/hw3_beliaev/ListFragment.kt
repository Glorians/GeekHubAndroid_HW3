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
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.android.synthetic.main.fragment_list.*
import androidx.fragment.app.FragmentManager


class ListFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_list, container, false)

    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {

        main_list.layoutManager = LinearLayoutManager(context)
        main_list.adapter = MainAdapter(phones, object : MainAdapter.Callback {
            override fun onItemClicked(item: Phone) {

                Toast.makeText(context, resources.getString(item.details), Toast.LENGTH_SHORT).show()
                println(resources.getString(item.details))

                val detailsFragment =
                    DetailsFragment.newInstance(item)
                fragmentManager!!.beginTransaction()
                    .replace(R.id.fragment_list, detailsFragment, "detailsFragment")
                    .addToBackStack(null)
                    .commit()

            }
        })
    }

    companion object {
        fun newInstance(): ListFragment {
            return ListFragment()
        }
    }

    private val phones = listOf(
        Phone("Apple", "Iphone X", R.drawable.iphonex, R.string.str_IphoneX_Details),
        Phone("Sony", "Xperia 1", R.drawable.xperia, R.string.str_Xperia1_Details),
        Phone("Google", "Pixel 4", R.drawable.pixel, R.string.str_GooglePixel4),
        Phone("Samsung", "Galaxy Note 10", R.drawable.note10, R.string.str_SamsungNote10_Details),
        Phone("OnePlus", "7 Pro", R.drawable.oneplus, R.string.str_OnePlus7Pro),
        Phone("Asus", "ZenPhone 6", R.drawable.zenphone, R.string.str_ZenPhone6),
        Phone("Nokia", "Lumia 640", R.drawable.lumia, R.string.str_Lumia640),
        Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone, R.string.str_SurfacePhone),
        Phone("Asus", "ZenPhone 6", R.drawable.zenphone, R.string.str_ZenPhone6),
        Phone("Apple", "Iphone X", R.drawable.iphonex, R.string.str_IphoneX_Details),
        Phone("Asus", "ZenPhone 6", R.drawable.zenphone, R.string.str_ZenPhone6),
        Phone("Google", "Pixel 4", R.drawable.pixel, R.string.str_GooglePixel4),
        Phone("Sony", "Xperia 1", R.drawable.xperia, R.string.str_Xperia1_Details),
        Phone("OnePlus", "7 Pro", R.drawable.oneplus, R.string.str_OnePlus7Pro),
        Phone("Samsung", "Galaxy Note 10", R.drawable.note10, R.string.str_SamsungNote10_Details),
        Phone("Apple", "Iphone X", R.drawable.iphonex, R.string.str_IphoneX_Details),
        Phone("OnePlus", "7 Pro", R.drawable.oneplus, R.string.str_OnePlus7Pro),
        Phone("Asus", "ZenPhone 6", R.drawable.zenphone, R.string.str_ZenPhone6),
        Phone("Nokia", "Lumia 640", R.drawable.lumia, R.string.str_Lumia640),
        Phone("Microsoft", "SurfacePhone", R.drawable.surfacephone, R.string.str_SurfacePhone),
        Phone("Sony", "Xperia 1", R.drawable.xperia, R.string.str_Xperia1_Details)
    )

}
