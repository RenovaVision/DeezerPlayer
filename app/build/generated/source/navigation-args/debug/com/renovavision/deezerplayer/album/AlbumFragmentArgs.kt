package com.renovavision.deezerplayer.album

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

data class AlbumFragmentArgs(
  val albumId: Int = 0
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("albumId", this.albumId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): AlbumFragmentArgs {
      bundle.setClassLoader(AlbumFragmentArgs::class.java.classLoader)
      val __albumId : Int
      if (bundle.containsKey("albumId")) {
        __albumId = bundle.getInt("albumId")
      } else {
        __albumId = 0
      }
      return AlbumFragmentArgs(__albumId)
    }
  }
}
