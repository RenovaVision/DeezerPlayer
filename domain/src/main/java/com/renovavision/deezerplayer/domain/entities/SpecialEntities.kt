package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class TrackModel(
    val artistName: String,
    val title: String,
    val song: String,
    val image: String? = null
)

data class PlayerModel(
    val id: Int,
    val title: String,
    val song: String,
    val image: String? = null
) : Serializable