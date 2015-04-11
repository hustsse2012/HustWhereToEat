package com.handmark.pulltorefresh.library; class PullToRefreshHorizontalScrollView {/*

.class public Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;
.super Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
.source "PullToRefreshHorizontalScrollView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
        "<",
        "Landroid/widget/HorizontalScrollView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter "context"

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;)V

    .line 30
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
    .locals 0
    .parameter "context"
    .parameter

    .prologue
    .line 37
    .local p2, mode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
    invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V

    .line 38
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
    .locals 0
    .parameter "context"
    .parameter
    .parameter

    .prologue
    .line 41
    .local p2, mode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
    .local p3, style:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;"
    invoke-direct {p0, p1, p2, p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V

    .line 42
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method protected bridge synthetic createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;->createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/HorizontalScrollView;
    .locals 3
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 53
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    #v1=(Integer);
    const/16 v2, 0x9

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    .line 54
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 59
    .local v0, scrollView:Landroid/widget/HorizontalScrollView;
    :goto_0
    #v0=(Reference);
    sget v1, Lcom/handmark/pulltorefresh/library/R$id;->scrollview:I

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setId(I)V

    .line 60
    return-object v0

    .line 56
    .end local v0           #scrollView:Landroid/widget/HorizontalScrollView;
    :cond_0
    #v0=(Uninit);
    new-instance v0, Landroid/widget/HorizontalScrollView;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .restart local v0       #scrollView:Landroid/widget/HorizontalScrollView;
    #v0=(Reference);
    goto :goto_0
.end method

.method public final getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    #v0=(Reference);
    return-object v0
.end method

.method protected isReadyForPullEnd()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 70
    #v2=(Null);
    iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;->mRefreshableView:Landroid/view/View;

    #v1=(Reference);
    check-cast v1, Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1, v2}, Landroid/widget/HorizontalScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 71
    .local v0, scrollViewChild:Landroid/view/View;
    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 72
    iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;->mRefreshableView:Landroid/view/View;

    check-cast v1, Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;->getWidth()I

    move-result v4

    #v4=(Integer);
    sub-int/2addr v3, v4

    if-lt v1, v3, :cond_0

    const/4 v1, 0x1

    .line 74
    :goto_0
    #v1=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v1

    :cond_0
    #v1=(Integer);v3=(Integer);v4=(Integer);
    move v1, v2

    .line 72
    #v1=(Null);
    goto :goto_0

    :cond_1
    #v1=(Reference);v3=(Uninit);v4=(Uninit);
    move v1, v2

    .line 74
    #v1=(Null);
    goto :goto_0
.end method

.method protected isReadyForPullStart()Z
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;->mRefreshableView:Landroid/view/View;

    #v0=(Reference);
    check-cast v0, Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
