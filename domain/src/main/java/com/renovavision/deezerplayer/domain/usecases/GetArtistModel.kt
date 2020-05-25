package com.renovavision.deezerplayer.domain.usecases

import com.renovavision.deezerplayer.domain.entities.ArtistAlbumsEntity
import com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity
import com.renovavision.deezerplayer.domain.repositories.ArtistRepository
import javax.inject.Inject

class GetArtistModel @Inject constructor(private val artistRepository: ArtistRepository) {

    suspend fun invoke(id: Int): ArtistModel {
        val artistTracks = artistRepository.loadTopArtistTracks(id)
        val artistAlbums = artistRepository.loadArtistAlbums(id)

        return ArtistModel(artistTracks, artistAlbums)
    }
}

data class ArtistModel(
    val artistTracks: TopArtistTracksEntity,
    val artistAlbums: ArtistAlbumsEntity
)