package com.handmark.pulltorefresh.library; class PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9 {/*

.class final Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;
.super Landroid/widget/HorizontalScrollView;
.source "PullToRefreshHorizontalScrollView.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "InternalHorizontalScrollViewSDK9"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;


# direct methods
.method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 80
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;

    .line 81
    invoke-direct {p0, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 82
    #p0=(Reference);
    return-void
.end method

.method private getScrollRange()I
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 102
    #v5=(Null);
    const/4 v1, 0x0

    .line 103
    .local v1, scrollRange:I
    #v1=(Null);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getChildCount()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_0

    .line 104
    invoke-virtual {p0, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 105
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getWidth()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getPaddingLeft()I

    move-result v4

    #v4=(Integer);
    sub-int/2addr v3, v4

    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    sub-int/2addr v2, v3

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 107
    .end local v0           #child:Landroid/view/View;
    :cond_0
    #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
    return v1
.end method


# virtual methods
.method protected overScrollBy(IIIIIIIIZ)Z
    .locals 8
    .parameter "deltaX"
    .parameter "deltaY"
    .parameter "scrollX"
    .parameter "scrollY"
    .parameter "scrollRangeX"
    .parameter "scrollRangeY"
    .parameter "maxOverScrollX"
    .parameter "maxOverScrollY"
    .parameter "isTouchEvent"

    .prologue
    .line 88
    invoke-super/range {p0 .. p9}, Landroid/widget/HorizontalScrollView;->overScrollBy(IIIIIIIIZ)Z

    move-result v7

    .line 92
    .local v7, returnValue:Z
    #v7=(Boolean);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;

    .line 93
    #v0=(Reference);
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getScrollRange()I

    move-result v5

    #v5=(Integer);
    move v1, p1

    #v1=(Integer);
    move v2, p3

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p4

    #v4=(Integer);
    move/from16 v6, p9

    .line 92
    #v6=(Boolean);
    invoke-static/range {v0 .. v6}, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIIZ)V

    .line 95
    return v7
.end method

*/}
