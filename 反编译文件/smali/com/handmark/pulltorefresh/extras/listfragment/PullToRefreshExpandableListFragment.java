package com.handmark.pulltorefresh.extras.listfragment; class PullToRefreshExpandableListFragment {/*

.class public Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshExpandableListFragment;
.super Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment;
.source "PullToRefreshExpandableListFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshBaseListFragment",
        "<",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
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
    invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshExpandableListFragment;->onCreatePullToRefreshListView(Landroid/view/LayoutInflater;Landroid/os/Bundle;)Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected onCreatePullToRefreshListView(Landroid/view/LayoutInflater;Landroid/os/Bundle;)Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;
    .locals 2
    .parameter "inflater"
    .parameter "savedInstanceState"

    .prologue
    .line 43
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;

    #v0=(UninitRef);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/extras/listfragment/PullToRefreshExpandableListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    return-object v0
.end method

*/}
