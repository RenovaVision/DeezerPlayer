package com.renovavision.deezerplayer.data.repositories

import com.renovavision.deezerplayer.data.api.MusicApi
import com.renovavision.deezerplayer.data.mapper.HomeRepoMapper
import com.renovavision.deezerplayer.domain.entities.TopArtistsEntity
import com.renovavision.deezerplayer.domain.entities.TopTracksEntity
import com.renovavision.deezerplayer.domain.repositories.HomeRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeRepositoryImpl @Inject constructor(private val musicApi: MusicApi) : HomeRepository {

    private val mapper = HomeRepoMapper()

    override suspend fun loadTopTracks(): TopTracksEntity =
        mapper.mapTopTracksToEntity(musicApi.loadTopTracks())

    override suspend fun loadTopArtists(): TopArtistsEntity =
        mapper.mapTopArtistsToEntity(musicApi.loadTopArtists())
}