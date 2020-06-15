package com.renovavision.deezerplayer.album

import com.renovavision.deezerplayer.domain.entities.PlayerModel

interface AlbumNavigator {

    fun navAlbumToPlayer(track: PlayerModel)
}