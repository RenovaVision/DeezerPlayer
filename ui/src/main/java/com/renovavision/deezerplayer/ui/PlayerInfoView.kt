package com.renovavision.deezerplayer.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.ui.databinding.PlayerInfoViewBinding
import com.squareup.picasso.Picasso

class PlayerInfoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = PlayerInfoViewBinding.inflate(LayoutInflater.from(context), this)

    @get:JvmSynthetic
    var playerInfo: PlayerModel?
        get() = throw UnsupportedOperationException()
        set(value) {
            Picasso.get()
                .load(value?.image)
                .into(binding.trackImage)

            binding.trackName.text = value?.title
        }
}