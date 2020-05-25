package com.renovavision.deezerplayer.domain.repositories

import com.renovavision.deezerplayer.domain.entities.ArtistAlbumsEntity
import com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity

interface ArtistRepository {

    suspend fun loadTopArtistTracks(id: Int): TopArtistTracksEntity

    suspend fun loadArtistAlbums(id: Int): ArtistAlbumsEntity
}