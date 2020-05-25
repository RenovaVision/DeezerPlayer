// Generated by view binder compiler. Do not edit!
package com.renovavision.player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.renovavision.deezerplayer.ui.PlayerInfoView;
import com.renovavision.player.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPlayerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout controller;

  @NonNull
  public final AppCompatTextView endTime;

  @NonNull
  public final AppCompatImageView loopImage;

  @NonNull
  public final AppCompatImageView playPauseImage;

  @NonNull
  public final PlayerInfoView playerInfoView;

  @NonNull
  public final AppCompatSeekBar progressView;

  @NonNull
  public final AppCompatTextView startTime;

  private FragmentPlayerBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout controller, @NonNull AppCompatTextView endTime,
      @NonNull AppCompatImageView loopImage, @NonNull AppCompatImageView playPauseImage,
      @NonNull PlayerInfoView playerInfoView, @NonNull AppCompatSeekBar progressView,
      @NonNull AppCompatTextView startTime) {
    this.rootView = rootView;
    this.controller = controller;
    this.endTime = endTime;
    this.loopImage = loopImage;
    this.playPauseImage = playPauseImage;
    this.playerInfoView = playerInfoView;
    this.progressView = progressView;
    this.startTime = startTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_player, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPlayerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      ConstraintLayout controller = rootView.findViewById(R.id.controller);
      if (controller == null) {
        missingId = "controller";
        break missingId;
      }
      AppCompatTextView endTime = rootView.findViewById(R.id.endTime);
      if (endTime == null) {
        missingId = "endTime";
        break missingId;
      }
      AppCompatImageView loopImage = rootView.findViewById(R.id.loopImage);
      if (loopImage == null) {
        missingId = "loopImage";
        break missingId;
      }
      AppCompatImageView playPauseImage = rootView.findViewById(R.id.playPauseImage);
      if (playPauseImage == null) {
        missingId = "playPauseImage";
        break missingId;
      }
      PlayerInfoView playerInfoView = rootView.findViewById(R.id.playerInfoView);
      if (playerInfoView == null) {
        missingId = "playerInfoView";
        break missingId;
      }
      AppCompatSeekBar progressView = rootView.findViewById(R.id.progressView);
      if (progressView == null) {
        missingId = "progressView";
        break missingId;
      }
      AppCompatTextView startTime = rootView.findViewById(R.id.startTime);
      if (startTime == null) {
        missingId = "startTime";
        break missingId;
      }
      return new FragmentPlayerBinding((ConstraintLayout) rootView, controller, endTime, loopImage,
          playPauseImage, playerInfoView, progressView, startTime);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
