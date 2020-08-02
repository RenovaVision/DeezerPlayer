package com.renovavision.deezerplayer.data.repositories

import com.renovavision.deezerplayer.data.api.MusicApi
import com.renovavision.deezerplayer.data.mapper.albumDetailsMapper
import com.renovavision.deezerplayer.domain.repositories.AlbumRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AlbumRepositoryImpl @Inject constructor(private val musicApi: MusicApi) : AlbumRepository {

    override suspend fun loadAlbumInfo(id: Int) =
        albumDetailsMapper(musicApi.loadAlbumInfo(id))
}