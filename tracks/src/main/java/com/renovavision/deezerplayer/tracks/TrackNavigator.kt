package com.renovavision.deezerplayer.tracks

import com.renovavision.deezerplayer.domain.entities.Artist
import com.renovavision.deezerplayer.domain.entities.PlayerModel

interface TrackNavigator {

    fun navTopTracksToArtist(artist: Artist)

    fun navTopTracksToPlayer(track: PlayerModel)
}