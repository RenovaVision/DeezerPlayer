package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.AlbumInfo
import com.renovavision.deezerplayer.data.entities.AlbumInfo.*
import com.renovavision.deezerplayer.data.entities.AlbumInfo.Tracks.*
import com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity
import com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.*
import com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity.GenreEntity
import com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.*

class AlbumRepoMapper {

    fun mapAlbumInfoToEntity(albumInfo: AlbumInfo): AlbumInfoEntity = AlbumInfoEntity(
        id = albumInfo.id,
        title = albumInfo.title,
        upc = albumInfo.upc,
        link = albumInfo.link,
        share = albumInfo.share,
        cover = albumInfo.cover,
        cover_small = albumInfo.cover_small,
        cover_medium = albumInfo.cover_medium,
        cover_big = albumInfo.cover_big,
        cover_xl = albumInfo.cover_xl,
        genre_id = albumInfo.genre_id,
        genres = mapGenresToEntity(albumInfo.genres),
        label = albumInfo.label,
        nb_tracks = albumInfo.nb_tracks,
        duration = albumInfo.duration,
        fans = albumInfo.fans,
        rating = albumInfo.rating,
        release_date = albumInfo.release_date,
        record_type = albumInfo.record_type,
        available = albumInfo.available,
        tracklist = albumInfo.tracklist,
        explicit_lyrics = albumInfo.explicit_lyrics,
        explicit_content_lyrics = albumInfo.explicit_content_lyrics,
        explicit_content_cover = albumInfo.explicit_content_cover,
        contributors = albumInfo.contributors?.map { mapContributorToEntity(it) },
        artist = mapAuthorToEntity(albumInfo.artist),
        type = albumInfo.type,
        tracks = mapTracksToEntity(albumInfo.tracks)
    )

    private fun mapGenresToEntity(genres: Genres?): GenresEntity? =
        GenresEntity(
            data = genres?.data?.map { mapGenreToEntity(it) }
        )

    private fun mapGenreToEntity(genre: Genres.Genre): GenreEntity = GenreEntity(
        id = genre.id,
        name = genre.name,
        picture = genre.picture,
        type = genre.type
    )

    private fun mapAuthorToEntity(author: Author): AuthorEntity =
        AuthorEntity(
            id = author.id,
            name = author.name,
            picture = author.picture,
            picture_small = author.picture_small,
            picture_medium = author.picture_medium,
            picture_big = author.picture_big,
            picture_xl = author.picture_xl,
            tracklist = author.tracklist,
            type = author.type
        )

    private fun mapTracksToEntity(tracks: Tracks): TracksEntity =
        TracksEntity(
            data = tracks.data.map { mapTrackToEntity(it) }
        )

    private fun mapTrackToEntity(track: AlbumTrack): AlbumTrackEntity =
        AlbumTrackEntity(
            id = track.id,
            readable = track.readable,
            title = track.title,
            title_short = track.title_short,
            title_version = track.title_version,
            link = track.link,
            duration = track.duration,
            rank = track.rank,
            explicit_lyrics = track.explicit_lyrics,
            explicit_content_lyrics = track.explicit_content_lyrics,
            explicit_content_cover = track.explicit_content_cover,
            preview = track.preview,
            artist = mapMainArtistToEntity(track.artist),
            type = track.type
        )
}