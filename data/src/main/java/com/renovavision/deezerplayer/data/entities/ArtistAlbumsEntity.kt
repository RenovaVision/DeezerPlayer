package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArtistAlbumsEntity(
    val data: List<ArtistAlbumEntity>,
    val total: Int,
    val prev: String?,
    val next: String?
) {

    @JsonClass(generateAdapter = true)
    data class ArtistAlbumEntity(
        val id: Int,
        val title: String,
        val link: String?,
        val cover: String?,
        val cover_small: String?,
        val cover_medium: String?,
        val cover_big: String?,
        val cover_xl: String?,
        val genre_id: Int?,
        val fans: Int?,
        val release_date: String?,
        val record_type: String?,
        val tracklist: String?,
        val explicit_lyrics: Boolean,
        val type: String
    )
}