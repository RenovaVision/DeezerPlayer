// Generated by view binder compiler. Do not edit!
package com.renovavision.deezerplayer.album.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.renovavision.deezerplayer.album.R;
import com.renovavision.deezerplayer.ui.ErrorMessageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAlbumBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final ErrorMessageView errorContainer;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final Toolbar toolbar;

  private FragmentAlbumBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout,
      @NonNull ErrorMessageView errorContainer, @NonNull ProgressBar progress,
      @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.coordinatorLayout = coordinatorLayout;
    this.errorContainer = errorContainer;
    this.progress = progress;
    this.recyclerView = recyclerView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAlbumBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAlbumBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_album, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAlbumBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      AppBarLayout appBarLayout = rootView.findViewById(R.id.app_bar_layout);
      if (appBarLayout == null) {
        missingId = "appBarLayout";
        break missingId;
      }
      CoordinatorLayout coordinatorLayout = rootView.findViewById(R.id.coordinator_layout);
      if (coordinatorLayout == null) {
        missingId = "coordinatorLayout";
        break missingId;
      }
      ErrorMessageView errorContainer = rootView.findViewById(R.id.error_container);
      if (errorContainer == null) {
        missingId = "errorContainer";
        break missingId;
      }
      ProgressBar progress = rootView.findViewById(R.id.progress);
      if (progress == null) {
        missingId = "progress";
        break missingId;
      }
      RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
      if (recyclerView == null) {
        missingId = "recyclerView";
        break missingId;
      }
      Toolbar toolbar = rootView.findViewById(R.id.toolbar);
      if (toolbar == null) {
        missingId = "toolbar";
        break missingId;
      }
      return new FragmentAlbumBinding((CoordinatorLayout) rootView, appBarLayout, coordinatorLayout,
          errorContainer, progress, recyclerView, toolbar);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}