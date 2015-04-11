package com.handmark.pulltorefresh.extras.listfragment; class PullToRefreshListFragment {/*

.class public Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshListFragment;
.super Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;
.source "PullToRefreshListFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment",
        "<",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshListView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method protected bridge synthetic onCreatePullToRefreshListView(Landroid/view/LayoutInflater;Landroid/os/Bundle;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshListFragment;->onCreatePullToRefreshListView(Landroid/view/LayoutInflater;Landroid/os/Bundle;)Lcom/handmark/pulltorefresh/library/PullToRefreshListView;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected onCreatePullToRefreshListView(Landroid/view/LayoutInflater;Landroid/os/Bundle;)Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
    .locals 2
    .parameter "inflater"
    .parameter "savedInstanceState"

    .prologue
    .line 41
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;

    #v0=(UninitRef);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    return-object v0
.end method

*/}
