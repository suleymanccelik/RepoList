package com.suleymancelik.github.ui.list.ui;

import com.suleymancelik.github.core.helper.SuspendingWorkInteractor;
import com.suleymancelik.github.data.common.Result;
import com.suleymancelik.github.data.repo.RepoListModelItem;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/RepoListWork;", "Lcom/suleymancelik/github/core/helper/SuspendingWorkInteractor;", "Lcom/suleymancelik/github/ui/list/ui/RepoListWork$Params;", "Lcom/suleymancelik/github/data/common/Result;", "", "Lcom/suleymancelik/github/data/repo/RepoListModelItem;", "repoListRepository", "Lcom/suleymancelik/github/ui/list/ui/RepoListRepository;", "(Lcom/suleymancelik/github/ui/list/ui/RepoListRepository;)V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "doWork", "params", "(Lcom/suleymancelik/github/ui/list/ui/RepoListWork$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "ui-list_debug"})
public final class RepoListWork extends com.suleymancelik.github.core.helper.SuspendingWorkInteractor<com.suleymancelik.github.ui.list.ui.RepoListWork.Params, com.suleymancelik.github.data.common.Result<java.util.List<? extends com.suleymancelik.github.data.repo.RepoListModelItem>>> {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private final com.suleymancelik.github.ui.list.ui.RepoListRepository repoListRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.ui.list.ui.RepoListWork.Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.suleymancelik.github.data.common.Result<java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem>>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public RepoListWork(@org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.ui.list.ui.RepoListRepository repoListRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/RepoListWork$Params;", "", "username", "", "(Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ui-list_debug"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String username = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUsername() {
            return null;
        }
        
        public Params(@org.jetbrains.annotations.NotNull()
        java.lang.String username) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.suleymancelik.github.ui.list.ui.RepoListWork.Params copy(@org.jetbrains.annotations.NotNull()
        java.lang.String username) {
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
}