package com.renovavision.deezerplayer.domain.repositories

import com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity

interface AlbumRepository {

    suspend fun loadAlbumInfo(id: Int): AlbumInfoEntity
}