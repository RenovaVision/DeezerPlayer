package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContributorEntity(
    val id: Int,
    val name: String,
    val link: String?,
    val share: String?,
    val picture: String?,
    val picture_small: String?,
    val picture_medium: String?,
    val picture_big: String?,
    val picture_xl: String?,
    val radio: Boolean,
    val tracklist: String?,
    val type: String,
    val role: String?
)