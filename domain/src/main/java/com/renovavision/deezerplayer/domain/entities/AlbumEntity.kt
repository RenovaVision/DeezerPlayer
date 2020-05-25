package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class AlbumEntity(
    val id: Int,
    val title: String,
    val cover: String?,
    val cover_small: String?,
    val cover_medium: String?,
    val cover_big: String?,
    val cover_xl: String?,
    val tracklist: String?,
    val type: String
): Serializable