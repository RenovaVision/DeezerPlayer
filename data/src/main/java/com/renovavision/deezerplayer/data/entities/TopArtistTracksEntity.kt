package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopArtistTracksEntity(
    val data: List<ArtistTrackEntity>,
    val total: Int,
    val prev: String?,
    val next: String?
) {

    @JsonClass(generateAdapter = true)
    data class ArtistTrackEntity(
        val id: Int,
        val readable: Boolean,
        val title: String,
        val title_short: String?,
        val title_version: String?,
        val link: String?,
        val duration: Int?,
        val rank: Int?,
        val explicit_lyrics: Boolean,
        val explicit_content_lyrics: Int?,
        val explicit_content_cover: Int?,
        val preview: String,
        val contributors: List<ContributorEntity>?,
        val artist: MainArtistEntity,
        val album: AlbumEntity,
        val type: String
    )
}