package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopTracks(
    val data: List<Track>,
    val total: Int,
    val prev: String?,
    val next: String?
) {

    @JsonClass(generateAdapter = true)
    data class Track(
        val id: Int,
        val readable: Boolean?,
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
        val position: Int?,
        val artist: Artist,
        val album: Album,
        val type: String
    )
}