package com.handmark.pulltorefresh.extras.listfragment; class PullToRefreshBaseListFragment {/*

.class abstract Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;
.super Landroid/support/v4/app/ListFragment;
.source "PullToRefreshBaseListFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
        "<+",
        "Landroid/widget/AbsListView;",
        ">;>",
        "Landroid/support/v4/app/ListFragment;"
    }
.end annotation


# instance fields
.field private mPullToRefreshListView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 28
    .local p0, this:Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;,"Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment<TT;>;"
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public final getPullToRefreshListView()Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 52
    .local p0, this:Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;,"Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment<TT;>;"
    iget-object v0, p0, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;->mPullToRefreshListView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    #v0=(Reference);
    return-object v0
.end method

.method protected abstract onCreatePullToRefreshListView(Landroid/view/LayoutInflater;Landroid/os/Bundle;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/LayoutInflater;",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6
    .parameter "inflater"
    .parameter "container"
    .parameter "savedInstanceState"

    .prologue
    .line 34
    .local p0, this:Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;,"Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment<TT;>;"
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/ListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 36
    .local v0, layout:Landroid/view/View;
    #v0=(Reference);
    const v4, 0x102000a

    #v4=(Integer);
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/ListView;

    .line 37
    .local v1, lv:Landroid/widget/ListView;
    invoke-virtual {v1}, Landroid/widget/ListView;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/view/ViewGroup;

    .line 40
    .local v3, parent:Landroid/view/ViewGroup;
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    .line 41
    .local v2, lvIndex:I
    #v2=(Integer);
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 42
    invoke-virtual {p0, p1, p3}, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;->onCreatePullToRefreshListView(Landroid/view/LayoutInflater;Landroid/os/Bundle;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    move-result-object v4

    #v4=(Reference);
    iput-object v4, p0, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;->mPullToRefreshListView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    .line 43
    iget-object v4, p0, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;->mPullToRefreshListView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    invoke-virtual {v1}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v3, v4, v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 45
    return-object v0
.end method

*/}
