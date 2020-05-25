// Generated by view binder compiler. Do not edit!
package com.renovavision.deezerplayer.album.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.renovavision.deezerplayer.album.R;
import com.renovavision.deezerplayer.ui.TrackView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TrackItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TrackView trackView;

  private TrackItemBinding(@NonNull CardView rootView, @NonNull TrackView trackView) {
    this.rootView = rootView;
    this.trackView = trackView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static TrackItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TrackItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.track_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TrackItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      TrackView trackView = rootView.findViewById(R.id.trackView);
      if (trackView == null) {
        missingId = "trackView";
        break missingId;
      }
      return new TrackItemBinding((CardView) rootView, trackView);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
