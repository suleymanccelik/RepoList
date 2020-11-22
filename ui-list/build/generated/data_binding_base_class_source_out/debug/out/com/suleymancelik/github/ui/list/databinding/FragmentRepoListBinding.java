// Generated by view binder compiler. Do not edit!
package com.suleymancelik.github.ui.list.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.suleymancelik.github.common.ui.databinding.IncludeNoConnectionBinding;
import com.suleymancelik.github.common.ui.databinding.IncludeSearchBarBinding;
import com.suleymancelik.github.common.ui.databinding.IncludeSystemErrorBinding;
import com.suleymancelik.github.ui.list.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRepoListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final IncludeNoConnectionBinding noConnectionView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final EpoxyRecyclerView rclRepoList;

  @NonNull
  public final IncludeSearchBarBinding searchView;

  @NonNull
  public final IncludeSystemErrorBinding systemErrorView;

  private FragmentRepoListBinding(@NonNull ConstraintLayout rootView,
      @NonNull IncludeNoConnectionBinding noConnectionView, @NonNull ProgressBar progressBar,
      @NonNull EpoxyRecyclerView rclRepoList, @NonNull IncludeSearchBarBinding searchView,
      @NonNull IncludeSystemErrorBinding systemErrorView) {
    this.rootView = rootView;
    this.noConnectionView = noConnectionView;
    this.progressBar = progressBar;
    this.rclRepoList = rclRepoList;
    this.searchView = searchView;
    this.systemErrorView = systemErrorView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRepoListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRepoListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_repo_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRepoListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.no_connection_view;
      View noConnectionView = rootView.findViewById(id);
      if (noConnectionView == null) {
        break missingId;
      }
      IncludeNoConnectionBinding binding_noConnectionView = IncludeNoConnectionBinding.bind(noConnectionView);

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rcl_repo_list;
      EpoxyRecyclerView rclRepoList = rootView.findViewById(id);
      if (rclRepoList == null) {
        break missingId;
      }

      id = R.id.searchView;
      View searchView = rootView.findViewById(id);
      if (searchView == null) {
        break missingId;
      }
      IncludeSearchBarBinding binding_searchView = IncludeSearchBarBinding.bind(searchView);

      id = R.id.system_error_view;
      View systemErrorView = rootView.findViewById(id);
      if (systemErrorView == null) {
        break missingId;
      }
      IncludeSystemErrorBinding binding_systemErrorView = IncludeSystemErrorBinding.bind(systemErrorView);

      return new FragmentRepoListBinding((ConstraintLayout) rootView, binding_noConnectionView,
          progressBar, rclRepoList, binding_searchView, binding_systemErrorView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
