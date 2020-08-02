package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopArtistsEntity(
    val data: List<ArtistEntity>,
    val total: Int
)