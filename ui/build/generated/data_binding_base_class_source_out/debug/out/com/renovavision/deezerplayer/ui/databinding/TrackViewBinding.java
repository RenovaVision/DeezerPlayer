// Generated by view binder compiler. Do not edit!
package com.renovavision.deezerplayer.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.renovavision.deezerplayer.ui.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TrackViewBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final AppCompatTextView artistName;

  @NonNull
  public final AppCompatImageView imageView;

  @NonNull
  public final AppCompatTextView trackName;

  private TrackViewBinding(@NonNull View rootView, @NonNull AppCompatTextView artistName,
      @NonNull AppCompatImageView imageView, @NonNull AppCompatTextView trackName) {
    this.rootView = rootView;
    this.artistName = artistName;
    this.imageView = imageView;
    this.trackName = trackName;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static TrackViewBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.track_view, parent);
    return bind(parent);
  }

  @NonNull
  public static TrackViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      AppCompatTextView artistName = rootView.findViewById(R.id.artistName);
      if (artistName == null) {
        missingId = "artistName";
        break missingId;
      }
      AppCompatImageView imageView = rootView.findViewById(R.id.imageView);
      if (imageView == null) {
        missingId = "imageView";
        break missingId;
      }
      AppCompatTextView trackName = rootView.findViewById(R.id.trackName);
      if (trackName == null) {
        missingId = "trackName";
        break missingId;
      }
      return new TrackViewBinding(rootView, artistName, imageView, trackName);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}