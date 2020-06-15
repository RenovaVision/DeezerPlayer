package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class MainArtist(
    val id: Int,
    val name: String,
    val tracklist: String?,
    val type: String
): Serializable