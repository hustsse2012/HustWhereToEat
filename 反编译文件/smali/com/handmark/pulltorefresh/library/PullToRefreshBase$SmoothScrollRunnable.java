package com.handmark.pulltorefresh.library; class PullToRefreshBase$SmoothScrollRunnable {/*

.class final Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
.super Ljava/lang/Object;
.source "PullToRefreshBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "SmoothScrollRunnable"
.end annotation


# instance fields
.field private mContinueRunning:Z

.field private mCurrentY:I

.field private final mDuration:J

.field private final mInterpolator:Landroid/view/animation/Interpolator;

.field private mListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;

.field private final mScrollFromY:I

.field private final mScrollToY:I

.field private mStartTime:J

.field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;


# direct methods
.method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
    .locals 2
    .parameter
    .parameter "fromY"
    .parameter "toY"
    .parameter "duration"
    .parameter

    .prologue
    .line 1600
    .local p6, listener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1596
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mContinueRunning:Z

    .line 1597
    const-wide/16 v0, -0x1

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mStartTime:J

    .line 1598
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mCurrentY:I

    .line 1601
    iput p2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollFromY:I

    .line 1602
    iput p3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollToY:I

    .line 1603
    invoke-static {p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->access$0(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)Landroid/view/animation/Interpolator;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 1604
    iput-wide p4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mDuration:J

    .line 1605
    iput-object p6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;

    .line 1606
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    const-wide/16 v7, 0x3e8

    .line 1615
    #v7=(LongLo);v8=(LongHi);
    iget-wide v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mStartTime:J

    #v3=(LongLo);v4=(LongHi);
    const-wide/16 v5, -0x1

    #v5=(LongLo);v6=(LongHi);
    cmp-long v3, v3, v5

    #v3=(Byte);
    if-nez v3, :cond_1

    .line 1616
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    #v3=(LongLo);
    iput-wide v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mStartTime:J

    .line 1634
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-boolean v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mContinueRunning:Z

    #v3=(Boolean);
    if-eqz v3, :cond_2

    iget v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollToY:I

    #v3=(Integer);
    iget v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mCurrentY:I

    #v4=(Integer);
    if-eq v3, v4, :cond_2

    .line 1635
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    #v3=(Reference);
    invoke-static {v3, p0}, Lcom/handmark/pulltorefresh/library/internal/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1641
    :cond_0
    :goto_1
    #v4=(Conflicted);
    return-void

    .line 1624
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Byte);v4=(LongHi);v5=(LongLo);v6=(LongHi);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    #v3=(LongLo);
    iget-wide v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mStartTime:J

    sub-long/2addr v3, v5

    mul-long/2addr v3, v7

    iget-wide v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mDuration:J

    div-long v1, v3, v5

    .line 1625
    .local v1, normalizedTime:J
    #v1=(LongLo);v2=(LongHi);
    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 1627
    iget v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollFromY:I

    #v3=(Integer);
    iget v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollToY:I

    #v4=(Integer);
    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 1628
    #v3=(Float);
    iget-object v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mInterpolator:Landroid/view/animation/Interpolator;

    #v4=(Reference);
    long-to-float v5, v1

    #v5=(Float);
    const/high16 v6, 0x447a

    #v6=(Integer);
    div-float/2addr v5, v6

    invoke-interface {v4, v5}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v4

    .line 1627
    #v4=(Float);
    mul-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 1629
    .local v0, deltaY:I
    #v0=(Integer);
    iget v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollFromY:I

    #v3=(Integer);
    sub-int/2addr v3, v0

    iput v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mCurrentY:I

    .line 1630
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    #v3=(Reference);
    iget v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mCurrentY:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setHeaderScroll(I)V

    goto :goto_0

    .line 1637
    .end local v0           #deltaY:I
    .end local v1           #normalizedTime:J
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;

    #v3=(Reference);
    if-eqz v3, :cond_0

    .line 1638
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;

    invoke-interface {v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;->onSmoothScrollFinished()V

    goto :goto_1
.end method

.method public stop()V
    .locals 1

    .prologue
    .line 1644
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mContinueRunning:Z

    .line 1645
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1646
    return-void
.end method

*/}
