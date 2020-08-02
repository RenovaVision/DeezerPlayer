package com.renovavision.deezerplayer.album

import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.deezerplayer.album.databinding.TrackItemBinding
import com.renovavision.deezerplayer.domain.entities.AlbumDetails.Tracks.AlbumTrack
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.entities.TrackModel
import com.renovavision.deezerplayer.ui.uni.Dispatch
import com.renovavision.deezerplayer.ui.utils.BaseAdapter
import com.renovavision.deezerplayer.ui.utils.BaseViewHolder

class AlbumTracksAdapter(dispatch: Dispatch) :
    BaseAdapter<AlbumTrack, AlbumTracksAdapter.TrackViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = TrackViewHolder(
        TrackItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: AlbumTrack, newItem: AlbumTrack) =
        oldItem.id == newItem.id

    inner class TrackViewHolder(private val binding: TrackItemBinding) :
        BaseViewHolder<AlbumTrack>(binding.root) {

        override fun onCreate(dispatch: Dispatch) {
            super.onCreate(dispatch)

            itemView.setOnClickListener {
                item.let {
                    dispatch.invoke(
                        TrackClicked(
                            PlayerModel(
                                item.id,
                                item.getTrackTitleForPlayer(),
                                item.preview
                            )
                        )
                    )
                }
            }
        }

        override fun onBind(item: AlbumTrack) {
            binding.trackView.track = TrackModel(item.artist.name, item.title, item.preview)
        }
    }
}