package com.developersancho.maps

import com.developersancho.framework.base.mvi.BaseViewState
import com.developersancho.framework.base.mvi.MviViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MapsViewModel @Inject constructor(
) : MviViewModel<BaseViewState<MapsState>, MapsEvent>() {
    override fun onTriggerEvent(eventType: MapsEvent) {

    }
}