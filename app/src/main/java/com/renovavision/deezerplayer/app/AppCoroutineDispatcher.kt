package com.renovavision.deezerplayer.app

import com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppCoroutineDispatcher @Inject constructor() : CoroutineDispatcherProvider {

    override fun mainDispatcher() = Dispatchers.Main

    override fun ioDispatcher() = Dispatchers.IO
}