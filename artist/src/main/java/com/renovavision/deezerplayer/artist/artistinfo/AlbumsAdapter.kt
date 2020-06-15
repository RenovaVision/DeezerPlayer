package com.renovavision.deezerplayer.artist.artistinfo

import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.deezerplayer.artist.databinding.AlbumItemBinding
import com.renovavision.deezerplayer.domain.entities.ArtistAlbums.ArtistAlbum
import com.renovavision.deezerplayer.ui.uni.Dispatch
import com.renovavision.deezerplayer.ui.utils.BaseAdapter
import com.renovavision.deezerplayer.ui.utils.BaseViewHolder
import com.squareup.picasso.Picasso

class AlbumsAdapter(dispatch: Dispatch) :
    BaseAdapter<ArtistAlbum, AlbumsAdapter.AlbumViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = AlbumViewHolder(
        AlbumItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: ArtistAlbum, newItem: ArtistAlbum) =
        oldItem.id == newItem.id

    inner class AlbumViewHolder(private val binding: AlbumItemBinding) :
        BaseViewHolder<ArtistAlbum>(binding.root) {

        override fun onCreate(dispatch: Dispatch) {
            super.onCreate(dispatch)

            itemView.setOnClickListener {
                item.let {
                    dispatch.invoke(
                        AlbumClicked(
                            item.id
                        )
                    )
                }
            }
        }

        override fun onBind(item: ArtistAlbum) {
            Picasso.get()
                .load(item.cover_medium)
                .into(binding.albumImage)
        }
    }
}