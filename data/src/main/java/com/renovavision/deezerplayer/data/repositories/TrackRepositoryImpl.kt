package com.renovavision.deezerplayer.data.repositories

import com.renovavision.deezerplayer.data.api.MusicApi
import com.renovavision.deezerplayer.data.mapper.topTracksMapper
import com.renovavision.deezerplayer.domain.entities.TopTracks
import com.renovavision.deezerplayer.domain.repositories.TrackRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TrackRepositoryImpl @Inject constructor(private val musicApi: MusicApi) : TrackRepository {

    override suspend fun loadTopTracks(): TopTracks =
        topTracksMapper(musicApi.loadTopTracks())
}