package com.renovavision.deezerplayer.ui.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.renovavision.deezerplayer.domain.entities.TrackModel
import com.renovavision.deezerplayer.ui.databinding.TrackViewBinding
import com.squareup.picasso.Picasso

class TrackView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = TrackViewBinding.inflate(LayoutInflater.from(context), this)

    @get:JvmSynthetic
    var track: TrackModel
        get() = throw UnsupportedOperationException()
        set(value) {
            binding.artistName.text = value.artistName
            binding.trackName.text = value.title

            value.image?.let {
                Picasso.get()
                    .load(it)
                    .into(binding.imageView)
            }
        }

    @get:JvmSynthetic
    var artistNameListener: OnClickListener
        get() = throw UnsupportedOperationException()
        set(value) {
            binding.artistName.setOnClickListener(value)
        }
}