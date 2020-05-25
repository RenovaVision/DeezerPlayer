package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class ArtistEntity(
    val id: Int,
    val name: String,
    val link: String?,
    val picture: String?,
    val picture_small: String?,
    val picture_medium: String?,
    val picture_big: String?,
    val picture_xl: String?,
    val radio: Boolean?,
    val tracklist: String?,
    val position: Int?,
    val type: String
): Serializable