package com.developersancho.maps

import com.developersancho.model.dto.location.LocationDto
import com.developersancho.model.dto.maps.MapsDto

sealed class MapsEvent {
    object LoadMaps : MapsEvent()
}

class MapsState {
    val mapsList: List<MapsDto> = emptyList()
}

