package com.renovavision.deezerplayer.data

import com.renovavision.deezerplayer.data.repositories.AlbumRepositoryImpl
import com.renovavision.deezerplayer.data.repositories.ArtistRepositoryImpl
import com.renovavision.deezerplayer.data.repositories.TrackRepositoryImpl
import com.renovavision.deezerplayer.domain.repositories.AlbumRepository
import com.renovavision.deezerplayer.domain.repositories.ArtistRepository
import com.renovavision.deezerplayer.domain.repositories.TrackRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun albumRepository(albumRepository: AlbumRepositoryImpl): AlbumRepository

    @Binds
    fun artistRepository(artistRepository: ArtistRepositoryImpl): ArtistRepository

    @Binds
    fun trackRepository(trackRepository: TrackRepositoryImpl): TrackRepository
}