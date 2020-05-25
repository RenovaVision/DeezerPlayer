package com.renovavision.deezerplayer.data

import com.renovavision.deezerplayer.data.repositories.AlbumRepositoryImpl
import com.renovavision.deezerplayer.data.repositories.ArtistRepositoryImpl
import com.renovavision.deezerplayer.data.repositories.HomeRepositoryImpl
import com.renovavision.deezerplayer.domain.repositories.AlbumRepository
import com.renovavision.deezerplayer.domain.repositories.ArtistRepository
import com.renovavision.deezerplayer.domain.repositories.HomeRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun albumRepository(albumRepository: AlbumRepositoryImpl): AlbumRepository

    @Binds
    fun artistRepository(artistRepository: ArtistRepositoryImpl): ArtistRepository

    @Binds
    fun homeRepository(homeRepository: HomeRepositoryImpl): HomeRepository
}