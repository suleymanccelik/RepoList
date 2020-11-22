package com.suleymancelik.github.ui.list.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.airbnb.mvrx.*;
import com.suleymancelik.github.data.common.EmptyListException;
import com.suleymancelik.github.data.common.NetworkErrorException;
import com.suleymancelik.github.data.repo.RepoListModelItem;
import com.suleymancelik.github.ui.list.R;
import com.suleymancelik.github.ui.list.databinding.FragmentRepoListBinding;
import com.suleymancelik.github.ui.list.ui.epoxy.RepoListUIController;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\bH\u0016J\u001a\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010-\u001a\u00020\u001eH\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u001eH\u0002J\b\u00101\u001a\u00020\u001eH\u0002J\u0016\u00102\u001a\u00020\u001e2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/RepoListFragment;", "Lcom/airbnb/mvrx/BaseMvRxFragment;", "Lcom/suleymancelik/github/ui/list/ui/epoxy/RepoListUIController$AdapterCallbacks;", "()V", "mInflaterContext", "Landroid/content/Context;", "mRepoList", "", "Lcom/suleymancelik/github/data/repo/RepoListModelItem;", "mRepoListController", "Lcom/suleymancelik/github/ui/list/ui/epoxy/RepoListUIController;", "mRepoListViewBinding", "Lcom/suleymancelik/github/ui/list/databinding/FragmentRepoListBinding;", "getMRepoListViewBinding", "()Lcom/suleymancelik/github/ui/list/databinding/FragmentRepoListBinding;", "mRepoListViewBinding$delegate", "Lcom/suleymancelik/github/common/ui/FragmentViewBindingDelegate;", "mRepoListViewModel", "Lcom/suleymancelik/github/ui/list/ui/RepoListViewModel;", "getMRepoListViewModel", "()Lcom/suleymancelik/github/ui/list/ui/RepoListViewModel;", "mRepoListViewModel$delegate", "Lcom/airbnb/mvrx/lifecycleAwareLazy;", "mSearchHandler", "Landroid/os/Handler;", "mSearchQuery", "", "mSearchRunner", "Ljava/lang/Runnable;", "closeIconStatus", "", "query", "handleError", "errorType", "", "invalidate", "listener", "repository", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "prepareInitialPage", "prepareSearchOperation", "showEmptyResultScreen", "showErrorContent", "showListContent", "showLoadingScreen", "showNoNetworkContent", "showSearchResult", "repoList", "ui-list_debug"})
public final class RepoListFragment extends com.airbnb.mvrx.BaseMvRxFragment implements com.suleymancelik.github.ui.list.ui.epoxy.RepoListUIController.AdapterCallbacks {
    private final com.airbnb.mvrx.lifecycleAwareLazy mRepoListViewModel$delegate = null;
    private final com.suleymancelik.github.common.ui.FragmentViewBindingDelegate mRepoListViewBinding$delegate = null;
    private java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem> mRepoList;
    private com.suleymancelik.github.ui.list.ui.epoxy.RepoListUIController mRepoListController;
    private android.content.Context mInflaterContext;
    private android.os.Handler mSearchHandler;
    private java.lang.Runnable mSearchRunner;
    private java.lang.String mSearchQuery;
    private java.util.HashMap _$_findViewCache;
    
    private final com.suleymancelik.github.ui.list.ui.RepoListViewModel getMRepoListViewModel() {
        return null;
    }
    
    private final com.suleymancelik.github.ui.list.databinding.FragmentRepoListBinding getMRepoListViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void invalidate() {
    }
    
    @java.lang.Override()
    public void listener(@org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.data.repo.RepoListModelItem repository) {
    }
    
    private final void handleError(java.lang.Throwable errorType) {
    }
    
    private final void showLoadingScreen() {
    }
    
    private final void showEmptyResultScreen() {
    }
    
    private final void showListContent() {
    }
    
    private final void showErrorContent() {
    }
    
    private final void showNoNetworkContent() {
    }
    
    private final void showSearchResult(java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem> repoList) {
    }
    
    private final void prepareInitialPage() {
    }
    
    private final void closeIconStatus(java.lang.String query) {
    }
    
    private final void prepareSearchOperation(java.lang.String query) {
    }
    
    public RepoListFragment() {
        super(0);
    }
}