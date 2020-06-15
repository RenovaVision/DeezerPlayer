package com.renovavision.deezerplayer.artist

import com.renovavision.deezerplayer.domain.entities.Artist
import com.renovavision.deezerplayer.domain.entities.PlayerModel

interface ArtistNavigator {

    fun navTopArtistsToArtist(artist: Artist)

    fun navArtistToAlbum(id: Int)

    fun navArtistToPlayer(track: PlayerModel)
}