package com.renovavision.deezerplayer.domain.usecases

import com.renovavision.deezerplayer.domain.repositories.ArtistRepository
import com.renovavision.deezerplayer.domain.repositories.TrackRepository
import javax.inject.Inject

class GetTopArtists @Inject constructor(private val artistRepository: ArtistRepository) {

    suspend fun getTopArtists() = artistRepository.loadTopArtists()
}