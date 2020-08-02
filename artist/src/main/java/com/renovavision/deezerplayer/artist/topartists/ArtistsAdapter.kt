package com.renovavision.deezerplayer.artist.topartists

import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.deezerplayer.artist.databinding.ArtistItemBinding
import com.renovavision.deezerplayer.domain.entities.Artist
import com.renovavision.deezerplayer.ui.uni.Dispatch
import com.renovavision.deezerplayer.ui.utils.BaseAdapter
import com.renovavision.deezerplayer.ui.utils.BaseViewHolder

class ArtistsAdapter(dispatch: Dispatch) :
    BaseAdapter<Artist, ArtistsAdapter.ArtistViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = ArtistViewHolder(
        ArtistItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: Artist, newItem: Artist) =
        oldItem.id == newItem.id

    inner class ArtistViewHolder(private val binding: ArtistItemBinding) :
        BaseViewHolder<Artist>(binding.root) {

        override fun onCreate(dispatch: Dispatch) {
            super.onCreate(dispatch)

            itemView.setOnClickListener {
                item.let {
                    dispatch.invoke(
                        ArtistClicked(
                            item
                        )
                    )
                }
            }
        }

        override fun onBind(item: Artist) {
            binding.artistView.artistInfo = item
        }
    }
}