package com.renovavision.deezerplayer.data.repositories

import com.renovavision.deezerplayer.data.api.MusicApi
import com.renovavision.deezerplayer.data.mapper.ArtistRepoMapper
import com.renovavision.deezerplayer.domain.entities.ArtistAlbumsEntity
import com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity
import com.renovavision.deezerplayer.domain.repositories.ArtistRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ArtistRepositoryImpl @Inject constructor(private val musicApi: MusicApi) : ArtistRepository {

    private val mapper = ArtistRepoMapper()

    override suspend fun loadTopArtistTracks(id: Int): TopArtistTracksEntity =
        mapper.mapTopArtistsTracksToEntity(musicApi.loadTopArtistTracks(id))

    override suspend fun loadArtistAlbums(id: Int): ArtistAlbumsEntity =
        mapper.mapArtistAlbumsToEntity(musicApi.loadArtistAlbums(id))
}