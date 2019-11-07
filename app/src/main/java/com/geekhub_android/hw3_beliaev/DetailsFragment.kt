package com.geekhub_android.hw3_beliaev


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_details.*




class DetailsFragment : Fragment() {

    private var selectedItem: Phone? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        selectedItem = arguments?.getParcelable("selectedItem")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)

    }

    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        selectedItem?.image?.let {image.setImageResource(it)}
        selectedItem?.brand?.let {brand.text = it}
        selectedItem?.model?.let {model.text = it}
        content.text = selectedItem?.details ?: getString(R.string.nothing_selected)

    }

    companion object {
        fun newInstance(item: Phone?) : Fragment = DetailsFragment().apply {
            arguments = bundleOf("selectedItem" to item)
        }
    }

}
