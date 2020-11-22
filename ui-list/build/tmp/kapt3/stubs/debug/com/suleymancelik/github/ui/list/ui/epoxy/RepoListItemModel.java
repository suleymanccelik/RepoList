package com.suleymancelik.github.ui.list.ui.epoxy;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.suleymancelik.github.common.ui.ViewBindingEpoxyModelWithHolder;
import com.suleymancelik.github.data.repo.RepoListModelItem;
import com.suleymancelik.github.ui.list.R;
import com.suleymancelik.github.ui.list.databinding.ItemRepoListBinding;

@com.airbnb.epoxy.EpoxyModelClass()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\f\u0010\u0015\u001a\u00020\n*\u00020\u0002H\u0016R9\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/epoxy/RepoListItemModel;", "Lcom/suleymancelik/github/common/ui/ViewBindingEpoxyModelWithHolder;", "Lcom/suleymancelik/github/ui/list/databinding/ItemRepoListBinding;", "()V", "listener", "Lkotlin/Function1;", "Lcom/suleymancelik/github/data/repo/RepoListModelItem;", "Lkotlin/ParameterName;", "name", "repo", "", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "getRepo", "()Lcom/suleymancelik/github/data/repo/RepoListModelItem;", "setRepo", "(Lcom/suleymancelik/github/data/repo/RepoListModelItem;)V", "getDefaultLayout", "", "bind", "ui-list_debug"})
public abstract class RepoListItemModel extends com.suleymancelik.github.common.ui.ViewBindingEpoxyModelWithHolder<com.suleymancelik.github.ui.list.databinding.ItemRepoListBinding> {
    @org.jetbrains.annotations.NotNull()
    @com.airbnb.epoxy.EpoxyAttribute()
    public com.suleymancelik.github.data.repo.RepoListModelItem repo;
    @org.jetbrains.annotations.NotNull()
    @com.airbnb.epoxy.EpoxyAttribute()
    public kotlin.jvm.functions.Function1<? super com.suleymancelik.github.data.repo.RepoListModelItem, kotlin.Unit> listener;
    
    @org.jetbrains.annotations.NotNull()
    public final com.suleymancelik.github.data.repo.RepoListModelItem getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.data.repo.RepoListModelItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.suleymancelik.github.data.repo.RepoListModelItem, kotlin.Unit> getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.suleymancelik.github.data.repo.RepoListModelItem, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected int getDefaultLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.ui.list.databinding.ItemRepoListBinding $this$bind) {
    }
    
    public RepoListItemModel() {
        super();
    }
}