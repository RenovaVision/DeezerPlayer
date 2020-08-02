package com.renovavision.deezerplayer.domain.usecases

import com.renovavision.deezerplayer.domain.repositories.TrackRepository
import javax.inject.Inject

class GetTopTracks @Inject constructor(private val trackRepository: TrackRepository) {

    suspend fun getTopTracks() = trackRepository.loadTopTracks()
}