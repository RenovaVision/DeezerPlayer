package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class TopTracks(
    val data: List<Track>,
    val total: Int,
    val prev: String?,
    val next: String?
): Serializable {

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
    ): Serializable {

        fun getTrackTitleForPlayer() = "${artist.name} - $title"
    }
}