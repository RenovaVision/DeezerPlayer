package com.renovavision.deezerplayer.data.repositories

import com.renovavision.deezerplayer.data.api.MusicApi
import com.renovavision.deezerplayer.data.mapper.artistAlbumsMapper
import com.renovavision.deezerplayer.data.mapper.topArtistTracksMapper
import com.renovavision.deezerplayer.data.mapper.topArtistsMapper
import com.renovavision.deezerplayer.domain.entities.ArtistAlbums
import com.renovavision.deezerplayer.domain.entities.TopArtistTracks
import com.renovavision.deezerplayer.domain.entities.TopArtists
import com.renovavision.deezerplayer.domain.repositories.ArtistRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ArtistRepositoryImpl @Inject constructor(private val musicApi: MusicApi) : ArtistRepository {

    override suspend fun loadTopArtists(): TopArtists =
        topArtistsMapper(musicApi.loadTopArtists())

    override suspend fun loadArtistAlbums(id: Int): ArtistAlbums =
        artistAlbumsMapper(musicApi.loadArtistAlbums(id))

    override suspend fun loadTopArtistTracks(id: Int): TopArtistTracks =
        topArtistTracksMapper(musicApi.loadTopArtistTracks(id))
}