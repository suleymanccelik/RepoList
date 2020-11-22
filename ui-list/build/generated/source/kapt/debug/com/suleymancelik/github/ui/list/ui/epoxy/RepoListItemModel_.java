package com.suleymancelik.github.ui.list.ui.epoxy;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.suleymancelik.github.common.ui.ViewBindingHolder;
import com.suleymancelik.github.data.repo.RepoListModelItem;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/**
 * Generated file. Do not modify! */
public class RepoListItemModel_ extends RepoListItemModel implements GeneratedModel<ViewBindingHolder>, RepoListItemModelBuilder {
  private OnModelBoundListener<RepoListItemModel_, ViewBindingHolder> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<RepoListItemModel_, ViewBindingHolder> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<RepoListItemModel_, ViewBindingHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<RepoListItemModel_, ViewBindingHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;

  public RepoListItemModel_() {
    super();
  }

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final ViewBindingHolder object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void handlePostBind(final ViewBindingHolder object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public RepoListItemModel_ onBind(
      OnModelBoundListener<RepoListItemModel_, ViewBindingHolder> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(ViewBindingHolder object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public RepoListItemModel_ onUnbind(
      OnModelUnboundListener<RepoListItemModel_, ViewBindingHolder> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final ViewBindingHolder object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public RepoListItemModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<RepoListItemModel_, ViewBindingHolder> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final ViewBindingHolder object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public RepoListItemModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<RepoListItemModel_, ViewBindingHolder> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  public RepoListItemModel_ repo(@NotNull RepoListModelItem repo) {
    onMutation();
    super.repo = repo;
    return this;
  }

  @NotNull
  public RepoListModelItem repo() {
    return repo;
  }

  public RepoListItemModel_ listener(@NotNull Function1<? super RepoListModelItem, Unit> listener) {
    onMutation();
    super.listener = listener;
    return this;
  }

  @NotNull
  public Function1<? super RepoListModelItem, Unit> listener() {
    return listener;
  }

  @Override
  public RepoListItemModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public RepoListItemModel_ id(@Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public RepoListItemModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public RepoListItemModel_ id(@Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public RepoListItemModel_ id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public RepoListItemModel_ id(@Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public RepoListItemModel_ layout(@LayoutRes int layoutRes) {
    super.layout(layoutRes);
    return this;
  }

  @Override
  public RepoListItemModel_ spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public RepoListItemModel_ show() {
    super.show();
    return this;
  }

  @Override
  public RepoListItemModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public RepoListItemModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  public RepoListItemModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    super.repo = null;
    super.listener = null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof RepoListItemModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    RepoListItemModel_ that = (RepoListItemModel_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((repo != null ? !repo.equals(that.repo) : that.repo != null)) {
      return false;
    }
    if ((listener != null ? !listener.equals(that.listener) : that.listener != null)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int _result = super.hashCode();
    _result = 31 * _result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (repo != null ? repo.hashCode() : 0);
    _result = 31 * _result + (listener != null ? listener.hashCode() : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "RepoListItemModel_{" +
        "repo=" + repo +
        "}" + super.toString();
  }
}
