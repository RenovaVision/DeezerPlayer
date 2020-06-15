package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.TopTracksEntity
import com.renovavision.deezerplayer.data.entities.TopTracksEntity.*
import com.renovavision.deezerplayer.domain.entities.TopTracks
import com.renovavision.deezerplayer.domain.entities.TopTracks.*

internal val topTracksMapper: FunctionMapper<TopTracksEntity, TopTracks> = {
    TopTracks(
        data = it.data.map { trackEntity ->
            topTrackMapper(trackEntity)
        },
        total = it.total,
        prev = it.prev,
        next = it.next
    )
}

private val topTrackMapper: FunctionMapper<TrackEntity, Track> = {
    Track(
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
        position = it.position,
        artist = artistMapper(it.artist),
        album = albumMapper(it.album),
        type = it.type
    )
}