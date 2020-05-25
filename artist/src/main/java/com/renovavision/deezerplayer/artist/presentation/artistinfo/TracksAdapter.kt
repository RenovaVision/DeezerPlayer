package com.renovavision.deezerplayer.artist.presentation.artistinfo

import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.deezerplayer.artist.databinding.TrackItemBinding
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity.ArtistTrackEntity
import com.renovavision.deezerplayer.domain.entities.TrackModel
import com.renovavision.deezerplayer.utils.BaseAdapter
import com.renovavision.deezerplayer.utils.BaseViewHolder
import com.renovavision.deezerplayer.utils.Dispatch

class TracksAdapter(dispatch: Dispatch) :
    BaseAdapter<ArtistTrackEntity, TracksAdapter.TrackViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = TrackViewHolder(
        TrackItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: ArtistTrackEntity, newItem: ArtistTrackEntity) =
        oldItem.id == newItem.id

    inner class TrackViewHolder(private val binding: TrackItemBinding) :
        BaseViewHolder<ArtistTrackEntity>(binding.root) {

        override fun onCreate(dispatch: Dispatch) {
            super.onCreate(dispatch)

            itemView.setOnClickListener {
                item.let {
                    dispatch.invoke(
                        TrackClicked(
                            PlayerModel(
                                item.id,
                                item.getTrackTitleForPlayer(),
                                item.preview,
                                item.album.cover_big
                            )
                        )
                    )
                }
            }
        }

        override fun onBind(item: ArtistTrackEntity) {
            binding.trackView.track = TrackModel(
                item.artist.name,
                item.title,
                item.preview,
                item.album.cover_medium
            )
        }
    }
}