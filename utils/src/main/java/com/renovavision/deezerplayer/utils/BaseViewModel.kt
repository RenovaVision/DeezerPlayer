package com.renovavision.deezerplayer.utils

import androidx.lifecycle.ViewModel

abstract class BaseViewModel: ViewModel() {

    abstract fun dispatch(dispatchable: Dispatchable)
}