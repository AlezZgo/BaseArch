package com.developersancho.maps

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.developersancho.provider.NavigationProvider
import com.ramcosta.composedestinations.annotation.Destination

@NonRestartableComposable
@Destination(start = true)
@Composable
fun MapsScreen(
    text: String = "",
    viewModel: MapsViewModel = hiltViewModel(),
    navigator: NavigationProvider
) = Box(contentAlignment = Alignment.Center) {
    Text(text)
}