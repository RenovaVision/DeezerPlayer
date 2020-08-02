package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.ArtistAlbumsEntity
import com.renovavision.deezerplayer.data.entities.ArtistAlbumsEntity.ArtistAlbumEntity
import com.renovavision.deezerplayer.data.entities.TopArtistTracksEntity
import com.renovavision.deezerplayer.data.entities.TopArtistTracksEntity.ArtistTrackEntity
import com.renovavision.deezerplayer.domain.entities.ArtistAlbums
import com.renovavision.deezerplayer.domain.entities.ArtistAlbums.ArtistAlbum
import com.renovavision.deezerplayer.domain.entities.TopArtistTracks
import com.renovavision.deezerplayer.domain.entities.TopArtistTracks.ArtistTrack

internal val topArtistTracksMapper: FunctionMapper<TopArtistTracksEntity, TopArtistTracks> = {
    TopArtistTracks(
        data = it.data.map { artistTrackEntity ->
            artistTrackMapper(artistTrackEntity)
        },
        total = it.total,
        prev = it.prev,
        next = it.next
    )
}

private val artistTrackMapper: FunctionMapper<ArtistTrackEntity, ArtistTrack> = {
    ArtistTrack(
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
        contributors = it.contributors?.map { contributorEntity ->
            contributorMapper(contributorEntity)
        },
        artist = mainArtistMapper(it.artist),
        album = albumMapper(it.album),
        type = it.type
    )
}

internal val artistAlbumsMapper: FunctionMapper<ArtistAlbumsEntity, ArtistAlbums> = {
    ArtistAlbums(
        data = it.data.map { artistAlbumEntity ->
            artistAlbumMapper(artistAlbumEntity)
        },
        total = it.total,
        prev = it.prev,
        next = it.next
    )
}

private val artistAlbumMapper: FunctionMapper<ArtistAlbumEntity, ArtistAlbum> = {
    ArtistAlbum(
        id = it.id,
        title = it.title,
        link = it.link,
        cover = it.cover,
        cover_small = it.cover_small,
        cover_medium = it.cover_medium,
        cover_big = it.cover_big,
        cover_xl = it.cover_xl,
        genre_id = it.genre_id,
        fans = it.fans,
        release_date = it.release_date,
        record_type = it.record_type,
        tracklist = it.tracklist,
        explicit_lyrics = it.explicit_lyrics,
        type = it.type
    )
}