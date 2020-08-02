package com.renovavision.deezerplayer.domain.usecases

import com.renovavision.deezerplayer.domain.repositories.AlbumRepository
import javax.inject.Inject

class GetAlbumInfo @Inject constructor(private val albumRepository: AlbumRepository) {

    suspend fun invoke(id: Int) = albumRepository.loadAlbumInfo(id)
}