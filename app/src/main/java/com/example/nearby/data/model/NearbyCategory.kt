package com.example.nearby.data.model

import androidx.annotation.DrawableRes

class NearbyCategory (
    val id: String,
    val name: String
){
    @get:DrawableRes
    val icon: Int?
        get() = NearbyCategoryFilterchipView.fromDescription(description = name)?.icon
}