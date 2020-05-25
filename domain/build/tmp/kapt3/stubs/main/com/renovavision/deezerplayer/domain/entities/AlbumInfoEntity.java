package com.renovavision.deezerplayer.domain.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0003tuvB\u0097\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020&\u00a2\u0006\u0002\u0010\'J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u000b\u0010T\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u001aH\u00c6\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u00c6\u0003J\t\u0010c\u001a\u00020#H\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020&H\u00c6\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\u000b\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00d8\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020&H\u00c6\u0001\u00a2\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020\u001a2\b\u0010p\u001a\u0004\u0018\u00010qH\u00d6\u0003J\t\u0010r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010s\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b8\u00106R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b9\u00106R\u0011\u0010\u001c\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b<\u00106R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b=\u00106R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bD\u00106R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bE\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00100R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00100R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00100R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00100R\u0011\u0010%\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010$\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00100R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010P\u001a\u0004\bN\u0010O\u00a8\u0006w"}, d2 = {"Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity;", "Ljava/io/Serializable;", "id", "", "title", "", "upc", "", "link", "share", "cover", "cover_small", "cover_medium", "cover_big", "cover_xl", "genre_id", "genres", "Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$GenresEntity;", "label", "nb_tracks", "duration", "fans", "rating", "release_date", "record_type", "available", "", "tracklist", "explicit_lyrics", "explicit_content_lyrics", "explicit_content_cover", "contributors", "", "Lcom/renovavision/deezerplayer/domain/entities/ContributorEntity;", "artist", "Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$AuthorEntity;", "type", "tracks", "Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$TracksEntity;", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$GenresEntity;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$AuthorEntity;Ljava/lang/String;Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$TracksEntity;)V", "getArtist", "()Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$AuthorEntity;", "getAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContributors", "()Ljava/util/List;", "getCover", "()Ljava/lang/String;", "getCover_big", "getCover_medium", "getCover_small", "getCover_xl", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExplicit_content_cover", "getExplicit_content_lyrics", "getExplicit_lyrics", "()Z", "getFans", "getGenre_id", "getGenres", "()Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$GenresEntity;", "getId", "()I", "getLabel", "getLink", "getNb_tracks", "getRating", "getRecord_type", "getRelease_date", "getShare", "getTitle", "getTracklist", "getTracks", "()Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$TracksEntity;", "getType", "getUpc", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$GenresEntity;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$AuthorEntity;Ljava/lang/String;Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$TracksEntity;)Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity;", "equals", "other", "", "hashCode", "toString", "AuthorEntity", "GenresEntity", "TracksEntity", "domain"})
public final class AlbumInfoEntity implements java.io.Serializable {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long upc = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String share = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cover = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cover_small = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cover_medium = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cover_big = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cover_xl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer genre_id = null;
    @org.jetbrains.annotations.Nullable()
    private final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity genres = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String label = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer nb_tracks = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer duration = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer fans = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rating = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String release_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String record_type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean available = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tracklist = null;
    private final boolean explicit_lyrics = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer explicit_content_lyrics = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer explicit_content_cover = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.renovavision.deezerplayer.domain.entities.ContributorEntity> contributors = null;
    @org.jetbrains.annotations.NotNull()
    private final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.AuthorEntity artist = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity tracks = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUpc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShare() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCover() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCover_small() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCover_medium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCover_big() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCover_xl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGenre_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNb_tracks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFans() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRelease_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRecord_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTracklist() {
        return null;
    }
    
    public final boolean getExplicit_lyrics() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExplicit_content_lyrics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExplicit_content_cover() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.renovavision.deezerplayer.domain.entities.ContributorEntity> getContributors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.AuthorEntity getArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity getTracks() {
        return null;
    }
    
    public AlbumInfoEntity(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Long upc, @org.jetbrains.annotations.Nullable()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    java.lang.String share, @org.jetbrains.annotations.Nullable()
    java.lang.String cover, @org.jetbrains.annotations.Nullable()
    java.lang.String cover_small, @org.jetbrains.annotations.Nullable()
    java.lang.String cover_medium, @org.jetbrains.annotations.Nullable()
    java.lang.String cover_big, @org.jetbrains.annotations.Nullable()
    java.lang.String cover_xl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer genre_id, @org.jetbrains.annotations.Nullable()
    com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity genres, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.Integer nb_tracks, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fans, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
    java.lang.String release_date, @org.jetbrains.annotations.Nullable()
    java.lang.String record_type, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean available, @org.jetbrains.annotations.Nullable()
    java.lang.String tracklist, boolean explicit_lyrics, @org.jetbrains.annotations.Nullable()
    java.lang.Integer explicit_content_lyrics, @org.jetbrains.annotations.Nullable()
    java.lang.Integer explicit_content_cover, @org.jetbrains.annotations.Nullable()
    java.util.List<com.renovavision.deezerplayer.domain.entities.ContributorEntity> contributors, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.AuthorEntity artist, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity tracks) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    public final boolean component22() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.renovavision.deezerplayer.domain.entities.ContributorEntity> component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.AuthorEntity component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Long upc, @org.jetbrains.annotations.Nullable()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    java.lang.String share, @org.jetbrains.annotations.Nullable()
    java.lang.String cover, @org.jetbrains.annotations.Nullable()
    java.lang.String cover_small, @org.jetbrains.annotations.Nullable()
    java.lang.String cover_medium, @org.jetbrains.annotations.Nullable()
    java.lang.String cover_big, @org.jetbrains.annotations.Nullable()
    java.lang.String cover_xl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer genre_id, @org.jetbrains.annotations.Nullable()
    com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity genres, @org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.Integer nb_tracks, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fans, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rating, @org.jetbrains.annotations.Nullable()
    java.lang.String release_date, @org.jetbrains.annotations.Nullable()
    java.lang.String record_type, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean available, @org.jetbrains.annotations.Nullable()
    java.lang.String tracklist, boolean explicit_lyrics, @org.jetbrains.annotations.Nullable()
    java.lang.Integer explicit_content_lyrics, @org.jetbrains.annotations.Nullable()
    java.lang.Integer explicit_content_cover, @org.jetbrains.annotations.Nullable()
    java.util.List<com.renovavision.deezerplayer.domain.entities.ContributorEntity> contributors, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.AuthorEntity artist, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity tracks) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$GenresEntity;", "Ljava/io/Serializable;", "data", "", "Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$GenresEntity$GenreEntity;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "GenreEntity", "domain"})
    public static final class GenresEntity implements java.io.Serializable {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity.GenreEntity> data = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity.GenreEntity> getData() {
            return null;
        }
        
        public GenresEntity(@org.jetbrains.annotations.Nullable()
        java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity.GenreEntity> data) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity.GenreEntity> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity copy(@org.jetbrains.annotations.Nullable()
        java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity.GenreEntity> data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$GenresEntity$GenreEntity;", "Ljava/io/Serializable;", "id", "", "name", "", "picture", "type", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPicture", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "domain"})
        public static final class GenreEntity implements java.io.Serializable {
            private final int id = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String name = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String picture = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String type = null;
            
            public final int getId() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getName() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPicture() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getType() {
                return null;
            }
            
            public GenreEntity(int id, @org.jetbrains.annotations.NotNull()
            java.lang.String name, @org.jetbrains.annotations.Nullable()
            java.lang.String picture, @org.jetbrains.annotations.NotNull()
            java.lang.String type) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.GenresEntity.GenreEntity copy(int id, @org.jetbrains.annotations.NotNull()
            java.lang.String name, @org.jetbrains.annotations.Nullable()
            java.lang.String picture, @org.jetbrains.annotations.NotNull()
            java.lang.String type) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003Jo\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011\u00a8\u0006)"}, d2 = {"Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$AuthorEntity;", "Ljava/io/Serializable;", "id", "", "name", "", "picture", "picture_small", "picture_medium", "picture_big", "picture_xl", "tracklist", "type", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPicture", "getPicture_big", "getPicture_medium", "getPicture_small", "getPicture_xl", "getTracklist", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "domain"})
    public static final class AuthorEntity implements java.io.Serializable {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String picture = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String picture_small = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String picture_medium = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String picture_big = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String picture_xl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String tracklist = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = null;
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPicture() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPicture_small() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPicture_medium() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPicture_big() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPicture_xl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTracklist() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public AuthorEntity(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String picture, @org.jetbrains.annotations.Nullable()
        java.lang.String picture_small, @org.jetbrains.annotations.Nullable()
        java.lang.String picture_medium, @org.jetbrains.annotations.Nullable()
        java.lang.String picture_big, @org.jetbrains.annotations.Nullable()
        java.lang.String picture_xl, @org.jetbrains.annotations.Nullable()
        java.lang.String tracklist, @org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.AuthorEntity copy(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String picture, @org.jetbrains.annotations.Nullable()
        java.lang.String picture_small, @org.jetbrains.annotations.Nullable()
        java.lang.String picture_medium, @org.jetbrains.annotations.Nullable()
        java.lang.String picture_big, @org.jetbrains.annotations.Nullable()
        java.lang.String picture_xl, @org.jetbrains.annotations.Nullable()
        java.lang.String tracklist, @org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$TracksEntity;", "Ljava/io/Serializable;", "data", "", "Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$TracksEntity$AlbumTrackEntity;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AlbumTrackEntity", "domain"})
    public static final class TracksEntity implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.AlbumTrackEntity> data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.AlbumTrackEntity> getData() {
            return null;
        }
        
        public TracksEntity(@org.jetbrains.annotations.NotNull()
        java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.AlbumTrackEntity> data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.AlbumTrackEntity> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.AlbumTrackEntity> data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0012H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\u00a8\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010;H\u00d6\u0003J\u0006\u0010<\u001a\u00020\u0007J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\t\u0010>\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010!R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010!\u00a8\u0006?"}, d2 = {"Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$TracksEntity$AlbumTrackEntity;", "Ljava/io/Serializable;", "id", "", "readable", "", "title", "", "title_short", "title_version", "link", "duration", "rank", "explicit_lyrics", "explicit_content_lyrics", "explicit_content_cover", "preview", "artist", "Lcom/renovavision/deezerplayer/domain/entities/MainArtistEntity;", "type", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/renovavision/deezerplayer/domain/entities/MainArtistEntity;Ljava/lang/String;)V", "getArtist", "()Lcom/renovavision/deezerplayer/domain/entities/MainArtistEntity;", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExplicit_content_cover", "getExplicit_content_lyrics", "getExplicit_lyrics", "()Z", "getId", "()I", "getLink", "()Ljava/lang/String;", "getPreview", "getRank", "getReadable", "getTitle", "getTitle_short", "getTitle_version", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/renovavision/deezerplayer/domain/entities/MainArtistEntity;Ljava/lang/String;)Lcom/renovavision/deezerplayer/domain/entities/AlbumInfoEntity$TracksEntity$AlbumTrackEntity;", "equals", "other", "", "getTrackTitleForPlayer", "hashCode", "toString", "domain"})
        public static final class AlbumTrackEntity implements java.io.Serializable {
            private final int id = 0;
            private final boolean readable = false;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String title = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String title_short = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String title_version = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String link = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer duration = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer rank = null;
            private final boolean explicit_lyrics = false;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer explicit_content_lyrics = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer explicit_content_cover = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String preview = null;
            @org.jetbrains.annotations.NotNull()
            private final com.renovavision.deezerplayer.domain.entities.MainArtistEntity artist = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String type = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTrackTitleForPlayer() {
                return null;
            }
            
            public final int getId() {
                return 0;
            }
            
            public final boolean getReadable() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTitle_short() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTitle_version() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLink() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getDuration() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getRank() {
                return null;
            }
            
            public final boolean getExplicit_lyrics() {
                return false;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getExplicit_content_lyrics() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getExplicit_content_cover() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPreview() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.renovavision.deezerplayer.domain.entities.MainArtistEntity getArtist() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getType() {
                return null;
            }
            
            public AlbumTrackEntity(int id, boolean readable, @org.jetbrains.annotations.NotNull()
            java.lang.String title, @org.jetbrains.annotations.Nullable()
            java.lang.String title_short, @org.jetbrains.annotations.Nullable()
            java.lang.String title_version, @org.jetbrains.annotations.Nullable()
            java.lang.String link, @org.jetbrains.annotations.Nullable()
            java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
            java.lang.Integer rank, boolean explicit_lyrics, @org.jetbrains.annotations.Nullable()
            java.lang.Integer explicit_content_lyrics, @org.jetbrains.annotations.Nullable()
            java.lang.Integer explicit_content_cover, @org.jetbrains.annotations.NotNull()
            java.lang.String preview, @org.jetbrains.annotations.NotNull()
            com.renovavision.deezerplayer.domain.entities.MainArtistEntity artist, @org.jetbrains.annotations.NotNull()
            java.lang.String type) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final boolean component2() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component8() {
                return null;
            }
            
            public final boolean component9() {
                return false;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component10() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component11() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component12() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.renovavision.deezerplayer.domain.entities.MainArtistEntity component13() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component14() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.AlbumTrackEntity copy(int id, boolean readable, @org.jetbrains.annotations.NotNull()
            java.lang.String title, @org.jetbrains.annotations.Nullable()
            java.lang.String title_short, @org.jetbrains.annotations.Nullable()
            java.lang.String title_version, @org.jetbrains.annotations.Nullable()
            java.lang.String link, @org.jetbrains.annotations.Nullable()
            java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
            java.lang.Integer rank, boolean explicit_lyrics, @org.jetbrains.annotations.Nullable()
            java.lang.Integer explicit_content_lyrics, @org.jetbrains.annotations.Nullable()
            java.lang.Integer explicit_content_cover, @org.jetbrains.annotations.NotNull()
            java.lang.String preview, @org.jetbrains.annotations.NotNull()
            com.renovavision.deezerplayer.domain.entities.MainArtistEntity artist, @org.jetbrains.annotations.NotNull()
            java.lang.String type) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}