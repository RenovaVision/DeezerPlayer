package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.ArtistAlbums
import com.renovavision.deezerplayer.data.entities.TopArtistTracks
import com.renovavision.deezerplayer.domain.entities.ArtistAlbumsEntity
import com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity

class ArtistRepoMapper {

    fun mapTopArtistsTracksToEntity(tracks: TopArtistTracks): TopArtistTracksEntity =
        TopArtistTracksEntity(
            data = tracks.data.map { mapArtistTrackEntity(it) },
            total = tracks.total,
            prev = tracks.prev,
            next = tracks.next
        )

    private fun mapArtistTrackEntity(track: TopArtistTracks.ArtistTrack): TopArtistTracksEntity.ArtistTrackEntity =
        TopArtistTracksEntity.ArtistTrackEntity(
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
            contributors = track.contributors?.map { mapContributorToEntity(it) },
            artist = mapMainArtistToEntity(track.artist),
            album = mapAlbumToEntity(track.album),
            type = track.type
        )

    fun mapArtistAlbumsToEntity(albums: ArtistAlbums): ArtistAlbumsEntity = ArtistAlbumsEntity(
        data = albums.data.map { mapArtistAlbumToEntity(it) },
        total = albums.total,
        prev = albums.prev,
        next = albums.next
    )

    private fun mapArtistAlbumToEntity(album: ArtistAlbums.ArtistAlbum): ArtistAlbumsEntity.ArtistAlbumEntity =
        ArtistAlbumsEntity.ArtistAlbumEntity(
            id = album.id,
            title = album.title,
            link = album.link,
            cover = album.cover,
            cover_small = album.cover_small,
            cover_medium = album.cover_medium,
            cover_big = album.cover_big,
            cover_xl = album.cover_xl,
            genre_id = album.genre_id,
            fans = album.fans,
            release_date = album.release_date,
            record_type = album.record_type,
            tracklist = album.tracklist,
            explicit_lyrics = album.explicit_lyrics,
            type = album.type
        )
}