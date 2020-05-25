package com.renovavision.player

import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.Fragment
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.utils.DeezerPlayer
import com.renovavision.deezerplayer.utils.SimpleSeekBarChangeListener
import com.renovavision.deezerplayer.utils.bindingDelegate
import com.renovavision.deezerplayer.utils.onViewLifecycle
import com.renovavision.player.databinding.FragmentPlayerBinding
import javax.inject.Inject

class PlayerFragment @Inject constructor() : Fragment(R.layout.fragment_player) {

    private val binding by bindingDelegate(FragmentPlayerBinding::bind)

    private val deezerPlayer = DeezerPlayer()
    private val handler = Handler()

    private val updateSongTime = object : Runnable {
        override fun run() {
            val startTime = deezerPlayer.getCurrentPosition()
            val finalTime = deezerPlayer.getDuration()

            binding.startTime.text = deezerPlayer.getCurrentPosition().toString()
            binding.endTime.text =
                (deezerPlayer.getDuration() - deezerPlayer.getCurrentPosition()).toString()

            binding.progressView.max = finalTime
            binding.progressView.progress = startTime

            handler.postDelayed(this, 100)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val track = arguments?.getSerializable("track")?.let { it as PlayerModel }

        track?.let {
            deezerPlayer.playMusic(it.song)
        }

        initViews(track)
    }

    private fun initViews(track: PlayerModel?) {
        onViewLifecycle({ binding.playPauseImage }, {
            setOnClickListener {
                if (deezerPlayer.isPlaying()) {
                    deezerPlayer.pauseTrack()
                    binding.playPauseImage.setImageResource(R.drawable.ic_play)
                } else {
                    track?.let { deezerPlayer.playMusic(track.song) }
                    binding.playPauseImage.setImageResource(R.drawable.ic_pause)
                }
            }
        }, { setOnClickListener(null) })

        onViewLifecycle({ binding.playerInfoView }, {
            playerInfo = track
        })

        onViewLifecycle({ binding.progressView }, {
            handler.postDelayed(updateSongTime, 100)

            setOnSeekBarChangeListener(object : SimpleSeekBarChangeListener() {
                override fun onProgressChanged(seekBar: SeekBar?, position: Int, b: Boolean) {
                    if (b) {
                        deezerPlayer.seekTo(position)
                    }
                }
            })
        }, { setOnSeekBarChangeListener(null) })

        onViewLifecycle({ binding.loopImage }, {
            setOnClickListener {
                if (deezerPlayer.isLooping) {
                    deezerPlayer.isLooping = false
                    DrawableCompat.setTint(
                        binding.loopImage.drawable,
                        ContextCompat.getColor(context, R.color.black)
                    )
                } else {
                    deezerPlayer.isLooping = true
                    DrawableCompat.setTint(
                        binding.loopImage.drawable,
                        ContextCompat.getColor(context, R.color.red)
                    )
                }
            }
        }, { setOnClickListener(null) })
    }

    override fun onPause() {
        super.onPause()

        deezerPlayer.stopTrack()
    }

    override fun onDestroy() {
        super.onDestroy()

        handler.removeCallbacksAndMessages(null)
    }
}