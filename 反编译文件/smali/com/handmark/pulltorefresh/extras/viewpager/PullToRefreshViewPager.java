package com.handmark.pulltorefresh.extras.viewpager; class PullToRefreshViewPager {/*

.class public Lcom/handmark/pulltorefresh/extras/viewpager/PullToRefreshViewPager;
.super Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
.source "PullToRefreshViewPager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
        "<",
        "Landroid/support/v4/view/ViewPager;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter "context"

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;)V

    .line 29
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method protected createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v4/view/ViewPager;
    .locals 2
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 42
    new-instance v0, Landroid/support/v4/view/ViewPager;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    .local v0, viewPager:Landroid/support/v4/view/ViewPager;
    #v0=(Reference);
    sget v1, Lcom/handmark/pulltorefresh/extras/viewpager/R$id;->viewpager:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setId(I)V

    .line 44
    return-object v0
.end method

.method protected bridge synthetic createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/extras/viewpager/PullToRefreshViewPager;->createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public final getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    #v0=(Reference);
    return-object v0
.end method

.method protected isReadyForPullEnd()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 61
    #v2=(Null);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/extras/viewpager/PullToRefreshViewPager;->getRefreshableView()Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager;

    .line 63
    .local v1, refreshableView:Landroid/support/v4/view/ViewPager;
    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    .line 64
    .local v0, adapter:Landroid/support/v4/view/PagerAdapter;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v4

    #v4=(Integer);
    add-int/lit8 v4, v4, -0x1

    if-ne v3, v4, :cond_0

    const/4 v2, 0x1

    .line 68
    :cond_0
    #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v2
.end method

.method protected isReadyForPullStart()Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 49
    #v2=(Null);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/extras/viewpager/PullToRefreshViewPager;->getRefreshableView()Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager;

    .line 51
    .local v1, refreshableView:Landroid/support/v4/view/ViewPager;
    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    .line 52
    .local v0, adapter:Landroid/support/v4/view/PagerAdapter;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 53
    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v3

    #v3=(Integer);
    if-nez v3, :cond_0

    const/4 v2, 0x1

    .line 56
    :cond_0
    #v2=(Boolean);v3=(Conflicted);
    return v2
.end method

*/}
