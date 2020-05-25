package com.renovavision.deezerplayer.artist.presentation.artistinfo

import android.view.LayoutInflater
import android.view.ViewGroup
import com.renovavision.deezerplayer.artist.databinding.AlbumItemBinding
import com.renovavision.deezerplayer.domain.entities.ArtistAlbumsEntity.ArtistAlbumEntity
import com.renovavision.deezerplayer.utils.BaseAdapter
import com.renovavision.deezerplayer.utils.BaseViewHolder
import com.renovavision.deezerplayer.utils.Dispatch
import com.squareup.picasso.Picasso

class AlbumsAdapter(dispatch: Dispatch) :
    BaseAdapter<ArtistAlbumEntity, AlbumsAdapter.AlbumViewHolder>(dispatch) {

    override fun buildViewHolder(parent: ViewGroup, viewType: Int) = AlbumViewHolder(
        AlbumItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun areItemsTheSame(oldItem: ArtistAlbumEntity, newItem: ArtistAlbumEntity) =
        oldItem.id == newItem.id

    inner class AlbumViewHolder(private val binding: AlbumItemBinding) :
        BaseViewHolder<ArtistAlbumEntity>(binding.root) {

        override fun onCreate(dispatch: Dispatch) {
            super.onCreate(dispatch)

            itemView.setOnClickListener {
                item.let { dispatch.invoke(
                    AlbumClicked(
                        item.id
                    )
                ) }
            }
        }

        override fun onBind(item: ArtistAlbumEntity) {
            Picasso.get()
                .load(item.cover_medium)
                .into(binding.albumImage)
        }
    }
}