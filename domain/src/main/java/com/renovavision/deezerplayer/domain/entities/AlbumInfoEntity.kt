package com.renovavision.deezerplayer.domain.entities

import java.io.Serializable

data class AlbumInfoEntity(
    val id: Int,
    val title: String,
    val upc: Long?,
    val link: String?,
    val share: String?,
    val cover: String?,
    val cover_small: String?,
    val cover_medium: String?,
    val cover_big: String?,
    val cover_xl: String?,
    val genre_id: Int?,
    val genres: GenresEntity?,
    val label: String?,
    val nb_tracks: Int?,
    val duration: Int?,
    val fans: Int?,
    val rating: Int?,
    val release_date: String?,
    val record_type: String?,
    val available: Boolean?,
    val tracklist: String?,
    val explicit_lyrics: Boolean,
    val explicit_content_lyrics: Int?,
    val explicit_content_cover: Int?,
    val contributors: List<ContributorEntity>?,
    val artist: AuthorEntity,
    val type: String,
    val tracks: TracksEntity
) : Serializable {

    data class GenresEntity(
        val data: List<GenreEntity>?
    ) : Serializable {

        data class GenreEntity(
            val id: Int,
            val name: String,
            val picture: String?,
            val type: String
        ) : Serializable
    }

    data class AuthorEntity(
        val id: Int,
        val name: String,
        val picture: String?,
        val picture_small: String?,
        val picture_medium: String?,
        val picture_big: String?,
        val picture_xl: String?,
        val tracklist: String?,
        val type: String
    ) : Serializable

    data class TracksEntity(
        val data: List<AlbumTrackEntity>
    ) : Serializable {

        data class AlbumTrackEntity(
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
            val artist: MainArtistEntity,
            val type: String
        ) : Serializable {

            fun getTrackTitleForPlayer() = "${artist.name} - $title"
        }
    }
}