package com.renovavision.deezerplayer.data.repositories

import com.renovavision.deezerplayer.data.api.MusicApi
import com.renovavision.deezerplayer.data.mapper.AlbumRepoMapper
import com.renovavision.deezerplayer.domain.repositories.AlbumRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AlbumRepositoryImpl @Inject constructor(private val musicApi: MusicApi) : AlbumRepository {

    private val mapper = AlbumRepoMapper()

    override suspend fun loadAlbumInfo(id: Int) =
        mapper.mapAlbumInfoToEntity(musicApi.loadAlbumInfo(id))
}