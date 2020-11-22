package com.suleymancelik.github.ui.list.ui;

import com.suleymancelik.github.core.helper.NetworkHelper;
import com.suleymancelik.github.data.api.RepoListAPI;
import com.suleymancelik.github.data.common.*;
import com.suleymancelik.github.data.repo.RepoListModelItem;
import retrofit2.Retrofit;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/RepoListRepository;", "", "()V", "mApiClient", "Lretrofit2/Retrofit;", "getMApiClient", "()Lretrofit2/Retrofit;", "setMApiClient", "(Lretrofit2/Retrofit;)V", "mNetworkHelper", "Lcom/suleymancelik/github/core/helper/NetworkHelper;", "getMNetworkHelper", "()Lcom/suleymancelik/github/core/helper/NetworkHelper;", "setMNetworkHelper", "(Lcom/suleymancelik/github/core/helper/NetworkHelper;)V", "provideRepoList", "Lcom/suleymancelik/github/data/common/Result;", "", "Lcom/suleymancelik/github/data/repo/RepoListModelItem;", "userName", "", "ui-list_debug"})
public final class RepoListRepository {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public retrofit2.Retrofit mApiClient;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.suleymancelik.github.core.helper.NetworkHelper mNetworkHelper;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getMApiClient() {
        return null;
    }
    
    public final void setMApiClient(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.core.helper.NetworkHelper getMNetworkHelper() {
        return null;
    }
    
    public final void setMNetworkHelper(@org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.core.helper.NetworkHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.data.common.Result<java.util.List<com.suleymancelik.github.data.repo.RepoListModelItem>> provideRepoList(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return null;
    }
    
    @javax.inject.Inject()
    public RepoListRepository() {
        super();
    }
}