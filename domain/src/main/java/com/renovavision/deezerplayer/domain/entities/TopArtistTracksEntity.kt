package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class TopArtistTracksEntity(
    val data: List<ArtistTrackEntity>,
    val total: Int,
    val prev: String?,
    val next: String?
): Serializable {

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
    ): Serializable {

        fun getTrackTitleForPlayer() = "${artist.name} ${getContributors()} - $title"

        private fun getContributors(): String? {
            val list = contributors?.map { it.name }

            return list?.filter { it != artist.name }?.joinToString(" & ", "feat ")
        }
    }
}