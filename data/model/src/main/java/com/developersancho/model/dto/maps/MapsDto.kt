package com.developersancho.model.dto.maps

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MapsDto (
    val width : Int,
    val length : Int,
) : Parcelable