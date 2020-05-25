package com.renovavision.deezerplayer.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.renovavision.deezerplayer.domain.entities.ArtistEntity
import com.renovavision.deezerplayer.ui.databinding.ArtistViewBinding
import com.squareup.picasso.Picasso

class ArtistView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = ArtistViewBinding.inflate(LayoutInflater.from(context), this)

    @get:JvmSynthetic
    var artistInfo: ArtistEntity
        get() = throw UnsupportedOperationException()
        set(value) {
            binding.artistName.text = value.name

            value.picture_big?.let {
                Picasso.get()
                    .load(it)
                    .into(binding.imageView)
            }
        }
}