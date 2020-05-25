package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MainArtist(
    val id: Int,
    val name: String,
    val tracklist: String?,
    val type: String
)