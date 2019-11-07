package com.geekhub_android.hw3_beliaev

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Phone (val brand: String, val model: String, val image: Int, val details: String = "details") : Parcelable
