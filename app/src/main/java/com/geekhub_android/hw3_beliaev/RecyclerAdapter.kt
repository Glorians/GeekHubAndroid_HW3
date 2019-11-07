package com.geekhub_android.hw3_beliaev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerAdapter (private val callback: AdapterCallBack) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    interface AdapterCallBack {
        fun onLongItemClick(phone: Phone)
    }

    private val items = mutableListOf<Phone>()


    fun addItem(phone: Phone) {
        items.add(phone)
        notifyItemInserted(items.size)
    }

    fun deleteItem(phone: Phone) {
        val position = items.indexOf(phone)
        items.remove(phone)
        notifyItemRemoved(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(phone = items[position])
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view),
            View.OnLongClickListener {

        private lateinit var phone: Phone

        init {
            view.setOnLongClickListener(this)
        }

        fun onBind(phone: Phone) {
            view.brand.text = phone.brand
            view.model.text = phone.model
            view.image.setImageResource(phone.image)
        }

        override fun onLongClick(v: View?): Boolean {
            callback.onLongItemClick(phone)
            return true
        }


    }
}
