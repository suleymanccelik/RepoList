package com.suleymancelik.github.ui.list.ui.epoxy;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.suleymancelik.github.common.ui.ViewBindingHolder;
import com.suleymancelik.github.data.repo.RepoListModelItem;
import java.lang.CharSequence;
import java.lang.Number;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

public interface RepoListItemModelBuilder {
  RepoListItemModelBuilder onBind(
      OnModelBoundListener<RepoListItemModel_, ViewBindingHolder> listener);

  RepoListItemModelBuilder onUnbind(
      OnModelUnboundListener<RepoListItemModel_, ViewBindingHolder> listener);

  RepoListItemModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<RepoListItemModel_, ViewBindingHolder> listener);

  RepoListItemModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<RepoListItemModel_, ViewBindingHolder> listener);

  RepoListItemModelBuilder repo(@NotNull RepoListModelItem repo);

  RepoListItemModelBuilder listener(@NotNull Function1<? super RepoListModelItem, Unit> listener);

  RepoListItemModelBuilder id(long id);

  RepoListItemModelBuilder id(@Nullable Number... ids);

  RepoListItemModelBuilder id(long id1, long id2);

  RepoListItemModelBuilder id(@Nullable CharSequence key);

  RepoListItemModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  RepoListItemModelBuilder id(@Nullable CharSequence key, long id);

  RepoListItemModelBuilder layout(@LayoutRes int layoutRes);

  RepoListItemModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
