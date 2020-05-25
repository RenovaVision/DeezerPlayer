package com.renovavision.player

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class PlayerFragmentArgs(
  val track: Serializable?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): PlayerFragmentArgs {
      bundle.setClassLoader(PlayerFragmentArgs::class.java.classLoader)
      val __track : Serializable?
      if (bundle.containsKey("track")) {
        if (Parcelable::class.java.isAssignableFrom(Serializable::class.java) ||
            Serializable::class.java.isAssignableFrom(Serializable::class.java)) {
          __track = bundle.get("track") as Serializable?
        } else {
          throw UnsupportedOperationException(Serializable::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"track\" is missing and does not have an android:defaultValue")
      }
      return PlayerFragmentArgs(__track)
    }
  }
}
