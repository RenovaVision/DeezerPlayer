package com.renovavision.deezerplayer.data.api

import com.renovavision.deezerplayer.data.entities.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MusicApi {

    @GET("chart/0/tracks")
    suspend fun loadTopTracks(): TopTracksEntity

    @GET("chart/0/artists")
    suspend fun loadTopArtists(): TopArtistsEntity

    @GET("artist/{id}/top")
    suspend fun loadTopArtistTracks(
        @Path("id") id: Int,
        @Query("limit") limit: Int = 50,
        @Query("index") startIndex: Int = 0
    ): TopArtistTracksEntity

    @GET("artist/{id}/albums")
    suspend fun loadArtistAlbums(@Path("id") artistId: Int): ArtistAlbumsEntity

    @GET("album/{id}")
    suspend fun loadAlbumInfo(@Path("id") id: Int): AlbumDetailsEntity

    @GET("search/track")
    suspend fun loadSearchResult(@Query("q") query: String): TopTracksEntity
}