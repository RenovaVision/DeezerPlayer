// Generated by view binder compiler. Do not edit!
package com.renovavision.deezerplayer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.renovavision.deezerplayer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavView;

  @NonNull
  public final FragmentContainerView navHostFragment;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavView, @NonNull FragmentContainerView navHostFragment) {
    this.rootView = rootView;
    this.bottomNavView = bottomNavView;
    this.navHostFragment = navHostFragment;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      BottomNavigationView bottomNavView = rootView.findViewById(R.id.bottomNavView);
      if (bottomNavView == null) {
        missingId = "bottomNavView";
        break missingId;
      }
      FragmentContainerView navHostFragment = rootView.findViewById(R.id.navHostFragment);
      if (navHostFragment == null) {
        missingId = "navHostFragment";
        break missingId;
      }
      return new ActivityMainBinding((ConstraintLayout) rootView, bottomNavView, navHostFragment);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}