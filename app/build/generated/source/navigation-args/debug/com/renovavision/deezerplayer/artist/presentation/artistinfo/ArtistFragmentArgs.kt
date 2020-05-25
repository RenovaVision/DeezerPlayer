package com.renovavision.deezerplayer.artist.presentation.artistinfo

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class ArtistFragmentArgs(
  val artist: Serializable?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Serializable::class.java)) {
      result.putParcelable("artist", this.artist as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Serializable::class.java)) {
      result.putSerializable("artist", this.artist as Serializable?)
    } else {
      throw UnsupportedOperationException(Serializable::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ArtistFragmentArgs {
      bundle.setClassLoader(ArtistFragmentArgs::class.java.classLoader)
      val __artist : Serializable?
      if (bundle.containsKey("artist")) {
        if (Parcelable::class.java.isAssignableFrom(Serializable::class.java) ||
            Serializable::class.java.isAssignableFrom(Serializable::class.java)) {
          __artist = bundle.get("artist") as Serializable?
        } else {
          throw UnsupportedOperationException(Serializable::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"artist\" is missing and does not have an android:defaultValue")
      }
      return ArtistFragmentArgs(__artist)
    }
  }
}
