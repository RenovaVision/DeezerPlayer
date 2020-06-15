package com.renovavision.deezerplayer.domain

import kotlinx.coroutines.CoroutineDispatcher

interface CoroutineDispatcherProvider {
    fun mainDispatcher(): CoroutineDispatcher
    fun ioDispatcher(): CoroutineDispatcher
}
