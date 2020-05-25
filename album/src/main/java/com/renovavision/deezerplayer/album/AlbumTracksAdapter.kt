package com.renovavision.deezerplayer.album

import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.deezerplayer.album.databinding.TrackItemBinding
import com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.AlbumTrackEntity
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.entities.TrackModel
import com.renovavision.deezerplayer.utils.BaseAdapter
import com.renovavision.deezerplayer.utils.BaseViewHolder
import com.renovavision.deezerplayer.utils.Dispatch

class AlbumTracksAdapter(dispatch: Dispatch) :
    BaseAdapter<AlbumTrackEntity, AlbumTracksAdapter.TrackViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = TrackViewHolder(
        TrackItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: AlbumTrackEntity, newItem: AlbumTrackEntity) =
        oldItem.id == newItem.id

    inner class TrackViewHolder(private val binding: TrackItemBinding) :
        BaseViewHolder<AlbumTrackEntity>(binding.root) {

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

        override fun onBind(item: AlbumTrackEntity) {
            binding.trackView.track = TrackModel(item.artist.name, item.title, item.preview)
        }
    }
}