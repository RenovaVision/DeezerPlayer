package com.renovavision.deezerplayer.domain.repositories

import com.renovavision.deezerplayer.domain.entities.AlbumDetails

interface AlbumRepository {

    suspend fun loadAlbumInfo(id: Int): AlbumDetails
}