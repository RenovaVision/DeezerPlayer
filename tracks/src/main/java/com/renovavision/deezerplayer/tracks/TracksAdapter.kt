package com.renovavision.deezerplayer.tracks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.entities.TopTracks.Track
import com.renovavision.deezerplayer.domain.entities.TrackModel
import com.renovavision.deezerplayer.tracks.databinding.TrackItemBinding
import com.renovavision.deezerplayer.ui.uni.Dispatch
import com.renovavision.deezerplayer.ui.utils.BaseAdapter
import com.renovavision.deezerplayer.ui.utils.BaseViewHolder

class TracksAdapter(dispatch: Dispatch) :
    BaseAdapter<Track, TracksAdapter.TrackViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = TrackViewHolder(
        TrackItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: Track, newItem: Track) =
        oldItem.id == newItem.id

    inner class TrackViewHolder(private val binding: TrackItemBinding) :
        BaseViewHolder<Track>(binding.root) {

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

        override fun onBind(item: Track) {
            binding.trackView.track = TrackModel(
                item.artist.name,
                item.title,
                item.preview,
                item.album.cover_medium
            )
        }
    }
}