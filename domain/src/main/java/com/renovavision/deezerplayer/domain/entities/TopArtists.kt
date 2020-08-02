package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class TopArtists(
    val data: List<Artist>,
    val total: Int
): Serializable