package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopArtistTracks(
    val data: List<ArtistTrack>,
    val total: Int,
    val prev: String?,
    val next: String?
) {

    @JsonClass(generateAdapter = true)
    data class ArtistTrack(
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
        val contributors: List<Contributor>?,
        val artist: MainArtist,
        val album: Album,
        val type: String
    )
}