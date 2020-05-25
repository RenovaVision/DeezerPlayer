package com.renovavision.deezerplayer.utils

import android.media.MediaPlayer

class DeezerPlayer : MediaPlayer.OnPreparedListener {

    private val mediaPlayer = MediaPlayer()

    @get:JvmSynthetic
    var isLooping: Boolean
        get() = mediaPlayer.isLooping
        set(value) {
            mediaPlayer.isLooping = value
        }

    fun isPlaying() = mediaPlayer.isPlaying

    fun getDuration() = mediaPlayer.duration / 1000
    fun getCurrentPosition() = mediaPlayer.currentPosition / 1000
    fun seekTo(position: Int) {
        mediaPlayer.seekTo(position * 1000)
    }

    fun playMusic(track: String) {
        if (mediaPlayer.duration == 0) {
            mediaPlayer.apply {
                setDataSource(track)
                setOnPreparedListener(this@DeezerPlayer)
                prepareAsync()
            }
        } else {
            mediaPlayer.start()
        }
    }

    fun pauseTrack() {
        mediaPlayer.pause()
    }

    fun stopTrack() {
        mediaPlayer.stop()
        mediaPlayer.reset()
    }

    override fun onPrepared(mediaPlayer: MediaPlayer) {
        mediaPlayer.start()
    }
}