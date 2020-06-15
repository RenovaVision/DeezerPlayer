package com.renovavision.deezerplayer.domain.repositories

import com.renovavision.deezerplayer.domain.entities.TopArtistTracks
import com.renovavision.deezerplayer.domain.entities.TopTracks

interface TrackRepository {

    suspend fun loadTopTracks(): TopTracks
}