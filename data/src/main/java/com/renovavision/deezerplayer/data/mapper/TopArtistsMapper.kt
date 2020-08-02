package com.renovavision.deezerplayer.data.mapper

import com.renovavision.deezerplayer.data.entities.TopArtistsEntity
import com.renovavision.deezerplayer.domain.entities.TopArtists

internal val topArtistsMapper: FunctionMapper<TopArtistsEntity, TopArtists> = {
    TopArtists(
        data = it.data.map { artistEntity ->
            artistMapper(artistEntity)
        },
        total = it.total
    )
}