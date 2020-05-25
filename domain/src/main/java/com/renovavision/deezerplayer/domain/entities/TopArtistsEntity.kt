package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class TopArtistsEntity(
    val data: List<ArtistEntity>,
    val total: Int
): Serializable