package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.TopArtists
import com.renovavision.deezerplayer.data.entities.TopTracks
import com.renovavision.deezerplayer.domain.entities.TopArtistsEntity
import com.renovavision.deezerplayer.domain.entities.TopTracksEntity

class HomeRepoMapper {

    fun mapTopArtistsToEntity(topArtists: TopArtists): TopArtistsEntity = TopArtistsEntity(
        data = topArtists.data.map { mapArtistToEntity(it) },
        total = topArtists.total
    )

    fun mapTopTracksToEntity(tracks: TopTracks): TopTracksEntity = TopTracksEntity(
        data = tracks.data.map { mapTopTrackToEntity(it) },
        total = tracks.total,
        prev = tracks.prev,
        next = tracks.next
    )

    private fun mapTopTrackToEntity(track: TopTracks.Track): TopTracksEntity.TrackEntity =
        TopTracksEntity.TrackEntity(
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
            position = track.position,
            artist = mapArtistToEntity(track.artist),
            album = mapAlbumToEntity(track.album),
            type = track.type
        )
}