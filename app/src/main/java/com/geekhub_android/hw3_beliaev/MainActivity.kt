package com.geekhub_android.hw3_beliaev

import android.content.ClipData
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Adapter.{

    private var checkedPhone: Phone? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkedPhone = savedInstanceState?.getParcelable("phone")
        rendering(checkedPhone)
    }

    private fun rendering(item: Phone?) {
        val orientation: Int = resources.configuration.orientation
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        if (item != null) {
            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                transaction.replace(R.id.fragment, DetailsFragment.newInstance(item)).commit()
            }
            if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                transaction.replace(R.id.main_list, ListFragment())
                    .replace(R.id.details_fragment, DetailsFragment.newInstance(item)).commit()
            }
        }



//        else {
//            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
//                transaction.replace(R.id.fragment, ListFragment()).commit()
//            }
//            if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
//                transaction.replace(R.id.list_fragment, ListFragment())
//                    .replace(R.id.details_fragment, DetailsFragment.newInstance(item)).commit()
//            }
//        }

    }

    fun itemClicked (item: Phone) {
        checkedPhone = item
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val orientation: Int = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            transaction.replace(R.id.details_fragment, DetailsFragment.newInstance(item)).commit()
        }
        else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            transaction.replace(R.id.fragment, DetailsFragment.newInstance(item)).addToBackStack(null).commit()
        }

    }
}

