// Generated by Dagger (https://dagger.dev).
package com.suleymancelik.github.ui.list.ui;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepoListViewModel_AssistedFactory_Factory implements Factory<RepoListViewModel_AssistedFactory> {
  private final Provider<RepoListWork> repoListWorkProvider;

  public RepoListViewModel_AssistedFactory_Factory(Provider<RepoListWork> repoListWorkProvider) {
    this.repoListWorkProvider = repoListWorkProvider;
  }

  @Override
  public RepoListViewModel_AssistedFactory get() {
    return newInstance(repoListWorkProvider);
  }

  public static RepoListViewModel_AssistedFactory_Factory create(
      Provider<RepoListWork> repoListWorkProvider) {
    return new RepoListViewModel_AssistedFactory_Factory(repoListWorkProvider);
  }

  public static RepoListViewModel_AssistedFactory newInstance(Provider<RepoListWork> repoListWork) {
    return new RepoListViewModel_AssistedFactory(repoListWork);
  }
}