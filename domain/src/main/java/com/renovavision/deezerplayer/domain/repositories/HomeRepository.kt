package com.renovavision.deezerplayer.domain.repositories

import com.renovavision.deezerplayer.domain.entities.TopArtistsEntity
import com.renovavision.deezerplayer.domain.entities.TopTracksEntity

interface HomeRepository {

    suspend fun loadTopTracks(): TopTracksEntity

    suspend fun loadTopArtists(): TopArtistsEntity
}