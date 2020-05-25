package com.renovavision.deezerplayer.artist.presentation.artistinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0016B,\u0012%\u0010\u0004\u001a!\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/TracksAdapter;", "Lcom/renovavision/deezerplayer/utils/BaseAdapter;", "Lcom/renovavision/deezerplayer/domain/entities/TopArtistTracksEntity$ArtistTrackEntity;", "Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/TracksAdapter$TrackViewHolder;", "dispatch", "Lkotlin/Function1;", "Lcom/renovavision/deezerplayer/utils/Dispatchable;", "Lkotlin/ParameterName;", "name", "dispatchable", "", "Lcom/renovavision/deezerplayer/utils/Dispatch;", "(Lkotlin/jvm/functions/Function1;)V", "areItemsTheSame", "", "oldItem", "newItem", "buildViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "TrackViewHolder", "artist_debug"})
public final class TracksAdapter extends com.renovavision.deezerplayer.utils.BaseAdapter<com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity.ArtistTrackEntity, com.renovavision.deezerplayer.artist.presentation.artistinfo.TracksAdapter.TrackViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.renovavision.deezerplayer.artist.presentation.artistinfo.TracksAdapter.TrackViewHolder buildViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity.ArtistTrackEntity oldItem, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity.ArtistTrackEntity newItem) {
        return false;
    }
    
    public TracksAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.renovavision.deezerplayer.utils.Dispatchable, kotlin.Unit> dispatch) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J/\u0010\t\u001a\u00020\u00072%\u0010\n\u001a!\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\u000bj\u0002`\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/TracksAdapter$TrackViewHolder;", "Lcom/renovavision/deezerplayer/utils/BaseViewHolder;", "Lcom/renovavision/deezerplayer/domain/entities/TopArtistTracksEntity$ArtistTrackEntity;", "binding", "Lcom/renovavision/deezerplayer/artist/databinding/TrackItemBinding;", "(Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/TracksAdapter;Lcom/renovavision/deezerplayer/artist/databinding/TrackItemBinding;)V", "onBind", "", "item", "onCreate", "dispatch", "Lkotlin/Function1;", "Lcom/renovavision/deezerplayer/utils/Dispatchable;", "Lkotlin/ParameterName;", "name", "dispatchable", "Lcom/renovavision/deezerplayer/utils/Dispatch;", "artist_debug"})
    public final class TrackViewHolder extends com.renovavision.deezerplayer.utils.BaseViewHolder<com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity.ArtistTrackEntity> {
        private final com.renovavision.deezerplayer.artist.databinding.TrackItemBinding binding = null;
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.renovavision.deezerplayer.utils.Dispatchable, kotlin.Unit> dispatch) {
        }
        
        @java.lang.Override()
        public void onBind(@org.jetbrains.annotations.NotNull()
        com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity.ArtistTrackEntity item) {
        }
        
        public TrackViewHolder(@org.jetbrains.annotations.NotNull()
        com.renovavision.deezerplayer.artist.databinding.TrackItemBinding binding) {
            super(null);
        }
    }
}