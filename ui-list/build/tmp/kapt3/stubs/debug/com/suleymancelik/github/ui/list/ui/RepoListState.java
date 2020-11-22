package com.suleymancelik.github.ui.list.ui;

import com.airbnb.mvrx.Async;
import com.airbnb.mvrx.MvRxState;
import com.airbnb.mvrx.Uninitialized;
import com.suleymancelik.github.data.common.Result;
import com.suleymancelik.github.data.repo.RepoListModelItem;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J5\u0010\u000f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/RepoListState;", "Lcom/airbnb/mvrx/MvRxState;", "repoListState", "Lcom/airbnb/mvrx/Async;", "Lcom/suleymancelik/github/data/common/Result;", "", "Lcom/suleymancelik/github/data/repo/RepoListModelItem;", "repoList", "(Lcom/airbnb/mvrx/Async;Ljava/util/List;)V", "getRepoList", "()Ljava/util/List;", "getRepoListState", "()Lcom/airbnb/mvrx/Async;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-list_debug"})
public final class RepoListState implements com.airbnb.mvrx.MvRxState {
    @org.jetbrains.annotations.NotNull()
    private final com.airbnb.mvrx.Async<com.suleymancelik.github.data.common.Result<java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem>>> repoListState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem> repoList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.airbnb.mvrx.Async<com.suleymancelik.github.data.common.Result<java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem>>> getRepoListState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem> getRepoList() {
        return null;
    }
    
    public RepoListState(@org.jetbrains.annotations.NotNull()
    com.airbnb.mvrx.Async<? extends com.suleymancelik.github.data.common.Result<java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem>>> repoListState, @org.jetbrains.annotations.NotNull()
    java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem> repoList) {
        super();
    }
    
    public RepoListState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.airbnb.mvrx.Async<com.suleymancelik.github.data.common.Result<java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem>>> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.ui.list.ui.RepoListState copy(@org.jetbrains.annotations.NotNull()
    com.airbnb.mvrx.Async<? extends com.suleymancelik.github.data.common.Result<java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem>>> repoListState, @org.jetbrains.annotations.NotNull()
    java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem> repoList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}