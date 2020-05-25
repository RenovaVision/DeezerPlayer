package com.renovavision.deezerplayer.artist.presentation.topartists

import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.deezerplayer.artist.databinding.ArtistItemBinding
import com.renovavision.deezerplayer.domain.entities.ArtistEntity
import com.renovavision.deezerplayer.utils.BaseAdapter
import com.renovavision.deezerplayer.utils.BaseViewHolder
import com.renovavision.deezerplayer.utils.Dispatch

class ArtistsAdapter(dispatch: Dispatch) :
    BaseAdapter<ArtistEntity, ArtistsAdapter.ArtistViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = ArtistViewHolder(
        ArtistItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: ArtistEntity, newItem: ArtistEntity) =
        oldItem.id == newItem.id

    inner class ArtistViewHolder(private val binding: ArtistItemBinding) :
        BaseViewHolder<ArtistEntity>(binding.root) {

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

        override fun onBind(item: ArtistEntity) {
            binding.artistView.artistInfo = item
        }
    }
}