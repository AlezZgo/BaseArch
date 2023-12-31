package com.developersancho.provider

interface NavigationProvider {
    fun openCharacterDetail(characterId: Int)
    fun openEpisodeDetail(episodeId: Int)
    fun openLocationDetail(locationId: Int)
    fun openMaps(text : String)
    fun openTermAndPrivacy()
    fun openAppLanguage()
    fun openAbout()
    fun navigateUp()
}