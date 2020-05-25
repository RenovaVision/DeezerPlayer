package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopArtists(
    val data: List<Artist>,
    val total: Int
)