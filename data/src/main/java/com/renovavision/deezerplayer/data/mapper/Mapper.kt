package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.Album
import com.renovavision.deezerplayer.data.entities.Artist
import com.renovavision.deezerplayer.data.entities.Contributor
import com.renovavision.deezerplayer.data.entities.MainArtist
import com.renovavision.deezerplayer.domain.entities.AlbumEntity
import com.renovavision.deezerplayer.domain.entities.ArtistEntity
import com.renovavision.deezerplayer.domain.entities.ContributorEntity
import com.renovavision.deezerplayer.domain.entities.MainArtistEntity

fun mapContributorToEntity(contributor: Contributor): ContributorEntity =
    ContributorEntity(
        id = contributor.id,
        name = contributor.name,
        link = contributor.link,
        share = contributor.share,
        picture = contributor.picture,
        picture_small = contributor.picture_small,
        picture_medium = contributor.picture_medium,
        picture_big = contributor.picture_big,
        picture_xl = contributor.picture_xl,
        radio = contributor.radio,
        tracklist = contributor.tracklist,
        type = contributor.type,
        role = contributor.role
    )

fun mapMainArtistToEntity(artist: MainArtist): MainArtistEntity = MainArtistEntity(
    id = artist.id,
    name = artist.name,
    tracklist = artist.tracklist,
    type = artist.type
)

fun mapAlbumToEntity(album: Album): AlbumEntity = AlbumEntity(
    id = album.id,
    title = album.title,
    cover = album.cover,
    cover_small = album.cover_small,
    cover_medium = album.cover_medium,
    cover_big = album.cover_big,
    cover_xl = album.cover_xl,
    tracklist = album.tracklist,
    type = album.type
)

fun mapArtistToEntity(artist: Artist): ArtistEntity = ArtistEntity(
    id = artist.id,
    name = artist.name,
    link = artist.link,
    picture = artist.picture,
    picture_small = artist.picture_small,
    picture_medium = artist.picture_medium,
    picture_big = artist.picture_big,
    picture_xl = artist.picture_xl,
    radio = artist.radio,
    tracklist = artist.tracklist,
    position = artist.position,
    type = artist.type
)