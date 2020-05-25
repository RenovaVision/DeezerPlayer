package com.renovavision.deezerplayer.tracks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.entities.TopTracksEntity.TrackEntity
import com.renovavision.deezerplayer.domain.entities.TrackModel
import com.renovavision.deezerplayer.tracks.databinding.TrackItemBinding
import com.renovavision.deezerplayer.utils.BaseAdapter
import com.renovavision.deezerplayer.utils.BaseViewHolder
import com.renovavision.deezerplayer.utils.Dispatch

class TracksAdapter(dispatch: Dispatch) :
    BaseAdapter<TrackEntity, TracksAdapter.TrackViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = TrackViewHolder(
        TrackItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: TrackEntity, newItem: TrackEntity) =
        oldItem.id == newItem.id

    inner class TrackViewHolder(private val binding: TrackItemBinding) :
        BaseViewHolder<TrackEntity>(binding.root) {

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

            binding.trackView.artistNameListener =
                View.OnClickListener {
                    item.let { dispatch.invoke(ArtistClicked(item.artist)) }
                }
        }

        override fun onBind(item: TrackEntity) {
            binding.trackView.track = TrackModel(
                item.artist.name,
                item.title,
                item.preview,
                item.album.cover_medium
            )
        }
    }
}