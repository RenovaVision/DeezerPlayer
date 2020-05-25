package com.renovavision.deezerplayer.domain.usecases

import com.renovavision.deezerplayer.domain.repositories.HomeRepository
import javax.inject.Inject

class GetHomeModel @Inject constructor(private val homeRepository: HomeRepository) {

    suspend fun getTopTracks() = homeRepository.loadTopTracks()

    suspend fun getTopArtists() = homeRepository.loadTopArtists()
}