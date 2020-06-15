package com.renovavision.deezerplayer.app

import com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider
import dagger.Binds
import dagger.Module

@Module
interface AppModule {

    @Binds
    fun provideCoroutineDispatcher(provider: AppCoroutineDispatcher): CoroutineDispatcherProvider
}