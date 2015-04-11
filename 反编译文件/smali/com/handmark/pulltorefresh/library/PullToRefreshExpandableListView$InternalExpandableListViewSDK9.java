package com.handmark.pulltorefresh.library; class PullToRefreshExpandableListView$InternalExpandableListViewSDK9 {/*

.class final Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView$InternalExpandableListViewSDK9;
.super Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView$InternalExpandableListView;
.source "PullToRefreshExpandableListView.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "InternalExpandableListViewSDK9"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;


# direct methods
.method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 85
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView$InternalExpandableListViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;

    .line 86
    invoke-direct {p0, p1, p2, p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView$InternalExpandableListView;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 87
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method protected overScrollBy(IIIIIIIIZ)Z
    .locals 7
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
    .line 93
    invoke-super/range {p0 .. p9}, Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView$InternalExpandableListView;->overScrollBy(IIIIIIIIZ)Z

    move-result v6

    .line 97
    .local v6, returnValue:Z
    #v6=(Boolean);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView$InternalExpandableListViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshExpandableListView;

    #v0=(Reference);
    move v1, p1

    #v1=(Integer);
    move v2, p3

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p4

    #v4=(Integer);
    move/from16 v5, p9

    #v5=(Boolean);
    invoke-static/range {v0 .. v5}, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIZ)V

    .line 100
    return v6
.end method

*/}
