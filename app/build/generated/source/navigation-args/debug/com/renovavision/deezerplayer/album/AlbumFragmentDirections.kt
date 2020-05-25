package com.renovavision.deezerplayer.album

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.renovavision.deezerplayer.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class AlbumFragmentDirections private constructor() {
  private data class NavigateToPlayer(
    val track: Serializable?
  ) : NavDirections {
    override fun getActionId(): Int = R.id.navigate_to_player

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Serializable::class.java)) {
        result.putParcelable("track", this.track as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(Serializable::class.java)) {
        result.putSerializable("track", this.track as Serializable?)
      } else {
        throw UnsupportedOperationException(Serializable::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun navigateToPlayer(track: Serializable?): NavDirections = NavigateToPlayer(track)
  }
}
