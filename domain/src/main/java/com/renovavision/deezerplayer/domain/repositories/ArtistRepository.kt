package com.renovavision.deezerplayer.domain.repositories

import com.renovavision.deezerplayer.domain.entities.ArtistAlbums
import com.renovavision.deezerplayer.domain.entities.TopArtistTracks
import com.renovavision.deezerplayer.domain.entities.TopArtists

interface ArtistRepository {

    suspend fun loadTopArtists(): TopArtists

    suspend fun loadArtistAlbums(id: Int): ArtistAlbums

    suspend fun loadTopArtistTracks(id: Int): TopArtistTracks
}