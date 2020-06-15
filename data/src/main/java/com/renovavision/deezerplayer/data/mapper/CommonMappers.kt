package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.AlbumEntity
import com.renovavision.deezerplayer.data.entities.ArtistEntity
import com.renovavision.deezerplayer.data.entities.ContributorEntity
import com.renovavision.deezerplayer.data.entities.MainArtistEntity
import com.renovavision.deezerplayer.domain.entities.Album
import com.renovavision.deezerplayer.domain.entities.Artist
import com.renovavision.deezerplayer.domain.entities.Contributor
import com.renovavision.deezerplayer.domain.entities.MainArtist

internal val contributorMapper: FunctionMapper<ContributorEntity, Contributor> = {
    Contributor(
        id = it.id,
        name = it.name,
        link = it.link,
        share = it.share,
        picture = it.picture,
        picture_small = it.picture_small,
        picture_medium = it.picture_medium,
        picture_big = it.picture_big,
        picture_xl = it.picture_xl,
        radio = it.radio,
        tracklist = it.tracklist,
        type = it.type,
        role = it.role
    )
}

internal val mainArtistMapper: FunctionMapper<MainArtistEntity, MainArtist> = {
    MainArtist(
        id = it.id,
        name = it.name,
        tracklist = it.tracklist,
        type = it.type
    )
}

internal val albumMapper: FunctionMapper<AlbumEntity, Album> = {
    Album(
        id = it.id,
        title = it.title,
        cover = it.cover,
        cover_small = it.cover_small,
        cover_medium = it.cover_medium,
        cover_big = it.cover_big,
        cover_xl = it.cover_xl,
        tracklist = it.tracklist,
        type = it.type
    )
}

internal val artistMapper: FunctionMapper<ArtistEntity, Artist> = {
    Artist(
        id = it.id,
        name = it.name,
        link = it.link,
        picture = it.picture,
        picture_small = it.picture_small,
        picture_medium = it.picture_medium,
        picture_big = it.picture_big,
        picture_xl = it.picture_xl,
        radio = it.radio,
        tracklist = it.tracklist,
        position = it.position,
        type = it.type
    )
}