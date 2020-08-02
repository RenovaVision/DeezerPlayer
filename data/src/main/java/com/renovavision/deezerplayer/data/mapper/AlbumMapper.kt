package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.AlbumDetailsEntity
import com.renovavision.deezerplayer.data.entities.AlbumDetailsEntity.*
import com.renovavision.deezerplayer.data.entities.AlbumDetailsEntity.GenresEntity.GenreEntity
import com.renovavision.deezerplayer.data.entities.AlbumDetailsEntity.TracksEntity.AlbumTrackEntity
import com.renovavision.deezerplayer.domain.entities.AlbumDetails
import com.renovavision.deezerplayer.domain.entities.AlbumDetails.*
import com.renovavision.deezerplayer.domain.entities.AlbumDetails.Genres.Genre
import com.renovavision.deezerplayer.domain.entities.AlbumDetails.Tracks.AlbumTrack

internal val albumDetailsMapper: FunctionMapper<AlbumDetailsEntity, AlbumDetails> = {
    AlbumDetails(
        id = it.id,
        title = it.title,
        upc = it.upc,
        link = it.link,
        share = it.share,
        cover = it.cover,
        cover_small = it.cover_small,
        cover_medium = it.cover_medium,
        cover_big = it.cover_big,
        cover_xl = it.cover_xl,
        genre_id = it.genre_id,
        genres = genresMapper(it.genres),
        label = it.label,
        nb_tracks = it.nb_tracks,
        duration = it.duration,
        fans = it.fans,
        rating = it.rating,
        release_date = it.release_date,
        record_type = it.record_type,
        available = it.available,
        tracklist = it.tracklist,
        explicit_lyrics = it.explicit_lyrics,
        explicit_content_lyrics = it.explicit_content_lyrics,
        explicit_content_cover = it.explicit_content_cover,
        contributors = it.contributors?.map { contributorEntity ->
            contributorMapper(contributorEntity)
        },
        artist = authorMapper(it.artist),
        type = it.type,
        tracks = albumTracksMapper(it.tracks)
    )
}

private val genresMapper: FunctionMapper<GenresEntity, Genres> = {
    Genres(
        data = it.data.map { genreEntity ->
            genreMapper(genreEntity)
        }
    )
}

private val genreMapper: FunctionMapper<GenreEntity, Genre> = {
    Genre(
        id = it.id,
        name = it.name,
        picture = it.picture,
        type = it.type
    )
}

private val authorMapper: FunctionMapper<AuthorEntity, Author> = {
    Author(
        id = it.id,
        name = it.name,
        picture = it.picture,
        picture_small = it.picture_small,
        picture_medium = it.picture_medium,
        picture_big = it.picture_big,
        picture_xl = it.picture_xl,
        tracklist = it.tracklist,
        type = it.type
    )
}

private val albumTracksMapper: FunctionMapper<TracksEntity, Tracks> = {
    Tracks(
        data = it.data.map { albumTrackEntity ->
            albumTrackMapper(albumTrackEntity)
        }
    )
}

private val albumTrackMapper: FunctionMapper<AlbumTrackEntity, AlbumTrack> = {
    AlbumTrack(
        id = it.id,
        readable = it.readable,
        title = it.title,
        title_short = it.title_short,
        title_version = it.title_version,
        link = it.link,
        duration = it.duration,
        rank = it.rank,
        explicit_lyrics = it.explicit_lyrics,
        explicit_content_lyrics = it.explicit_content_lyrics,
        explicit_content_cover = it.explicit_content_cover,
        preview = it.preview,
        artist = mainArtistMapper(it.artist),
        type = it.type
    )
}