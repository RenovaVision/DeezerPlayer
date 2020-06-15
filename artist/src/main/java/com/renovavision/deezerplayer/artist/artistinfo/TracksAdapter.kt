package com.renovavision.deezerplayer.artist.artistinfo

import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.deezerplayer.artist.databinding.TrackItemBinding
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.entities.TopArtistTracks.ArtistTrack
import com.renovavision.deezerplayer.domain.entities.TrackModel
import com.renovavision.deezerplayer.ui.uni.Dispatch
import com.renovavision.deezerplayer.ui.utils.BaseAdapter
import com.renovavision.deezerplayer.ui.utils.BaseViewHolder

class TracksAdapter(dispatch: Dispatch) :
    BaseAdapter<ArtistTrack, TracksAdapter.TrackViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = TrackViewHolder(
        TrackItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: ArtistTrack, newItem: ArtistTrack) =
        oldItem.id == newItem.id

    inner class TrackViewHolder(private val binding: TrackItemBinding) :
        BaseViewHolder<ArtistTrack>(binding.root) {

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

        override fun onBind(item: ArtistTrack) {
            binding.trackView.track = TrackModel(
                item.artist.name,
                item.title,
                item.preview,
                item.album.cover_medium
            )
        }
    }
}