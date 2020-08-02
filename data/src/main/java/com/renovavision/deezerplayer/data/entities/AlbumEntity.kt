package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
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
)