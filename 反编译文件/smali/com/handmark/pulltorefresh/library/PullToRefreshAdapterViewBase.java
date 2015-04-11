package com.handmark.pulltorefresh.library; class PullToRefreshAdapterViewBase {/*

.class public abstract Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;
.super Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
.source "PullToRefreshAdapterViewBase.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/widget/AbsListView;",
        ">",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
        "<TT;>;",
        "Landroid/widget/AbsListView$OnScrollListener;"
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I


# instance fields
.field private mEmptyView:Landroid/view/View;

.field private mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

.field private mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

.field private mLastItemVisible:Z

.field private mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;

.field private mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

.field private mScrollEmptyView:Z

.field private mShowIndicator:Z


# direct methods
.method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
    .locals 3

    .prologue
    .line 38
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I

    #v0=(Reference);
    if-eqz v0, :cond_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    move-result-object v0

    array-length v0, v0

    #v0=(Integer);
    new-array v0, v0, [I

    :try_start_0
    #v0=(Reference);
    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x4

    #v2=(PosByte);
    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_4

    :goto_1
    :try_start_1
    #v1=(Conflicted);v2=(Conflicted);
    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_3

    :goto_2
    :try_start_2
    #v1=(Conflicted);v2=(Conflicted);
    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x5

    #v2=(PosByte);
    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :goto_3
    :try_start_3
    #v1=(Conflicted);v2=(Conflicted);
    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x3

    #v2=(PosByte);
    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_1

    :goto_4
    :try_start_4
    #v1=(Conflicted);v2=(Conflicted);
    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x2

    #v2=(PosByte);
    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_0

    :goto_5
    #v1=(Conflicted);v2=(Conflicted);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I

    goto :goto_0

    :catch_0
    move-exception v1

    #v1=(Reference);
    goto :goto_5

    :catch_1
    #v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_4

    :catch_2
    #v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_3

    :catch_3
    #v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_2

    :catch_4
    #v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_1
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 69
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;)V

    .line 66
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z

    .line 70
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v0=(Reference);
    check-cast v0, Landroid/widget/AbsListView;

    invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 71
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 74
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z

    .line 75
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v0=(Reference);
    check-cast v0, Landroid/widget/AbsListView;

    invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 76
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
    .locals 1
    .parameter "context"
    .parameter

    .prologue
    .line 79
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    .local p2, mode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
    invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V

    .line 66
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z

    .line 80
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v0=(Reference);
    check-cast v0, Landroid/widget/AbsListView;

    invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
    .locals 1
    .parameter "context"
    .parameter
    .parameter

    .prologue
    .line 84
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    .local p2, mode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
    .local p3, animStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;"
    invoke-direct {p0, p1, p2, p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V

    .line 66
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z

    .line 85
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v0=(Reference);
    check-cast v0, Landroid/widget/AbsListView;

    invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 86
    return-void
.end method

.method private addIndicatorViews()V
    .locals 8

    .prologue
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v6, -0x2

    .line 335
    #v6=(Byte);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    move-result-object v0

    .line 336
    .local v0, mode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
    #v0=(Reference);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getRefreshableViewWrapper()Landroid/widget/FrameLayout;

    move-result-object v2

    .line 338
    .local v2, refreshableViewWrapper:Landroid/widget/FrameLayout;
    #v2=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v3=(Reference);
    if-nez v3, :cond_2

    .line 340
    new-instance v3, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v3=(UninitRef);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getContext()Landroid/content/Context;

    move-result-object v4

    #v4=(Reference);
    sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v5=(Reference);
    invoke-direct {v3, v4, v5}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    .line 341
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    #v1=(UninitRef);
    invoke-direct {v1, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 343
    .local v1, params:Landroid/widget/FrameLayout$LayoutParams;
    #v1=(Reference);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/handmark/pulltorefresh/library/R$dimen;->indicator_right_padding:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    #v3=(Integer);
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 344
    const/16 v3, 0x35

    #v3=(PosByte);
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 345
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v3=(Reference);
    invoke-virtual {v2, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 353
    .end local v1           #params:Landroid/widget/FrameLayout$LayoutParams;
    :cond_0
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v3=(Reference);
    if-nez v3, :cond_3

    .line 355
    new-instance v3, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v3=(UninitRef);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getContext()Landroid/content/Context;

    move-result-object v4

    #v4=(Reference);
    sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v5=(Reference);
    invoke-direct {v3, v4, v5}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V

    #v3=(Reference);
    iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    .line 356
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    #v1=(UninitRef);
    invoke-direct {v1, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 358
    .restart local v1       #params:Landroid/widget/FrameLayout$LayoutParams;
    #v1=(Reference);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/handmark/pulltorefresh/library/R$dimen;->indicator_right_padding:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    #v3=(Integer);
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 359
    const/16 v3, 0x55

    #v3=(PosByte);
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 360
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v3=(Reference);
    invoke-virtual {v2, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 367
    .end local v1           #params:Landroid/widget/FrameLayout$LayoutParams;
    :cond_1
    :goto_1
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 347
    :cond_2
    #v1=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v3=(Reference);
    if-eqz v3, :cond_0

    .line 349
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 350
    iput-object v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    goto :goto_0

    .line 362
    :cond_3
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v3=(Reference);
    if-eqz v3, :cond_1

    .line 364
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 365
    iput-object v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    goto :goto_1
.end method

.method private static convertEmptyViewLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/FrameLayout$LayoutParams;
    .locals 2
    .parameter "lp"

    .prologue
    .line 42
    const/4 v0, 0x0

    .line 44
    .local v0, newLp:Landroid/widget/FrameLayout$LayoutParams;
    #v0=(Null);
    if-eqz p0, :cond_0

    .line 45
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .end local v0           #newLp:Landroid/widget/FrameLayout$LayoutParams;
    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    .restart local v0       #newLp:Landroid/widget/FrameLayout$LayoutParams;
    #v0=(Reference);
    instance-of v1, p0, Landroid/widget/LinearLayout$LayoutParams;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 48
    check-cast p0, Landroid/widget/LinearLayout$LayoutParams;

    .end local p0
    iget v1, p0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    #v1=(Integer);
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 54
    :cond_0
    :goto_0
    #v1=(Conflicted);
    return-object v0

    .line 50
    .restart local p0
    :cond_1
    #v1=(Boolean);
    const/16 v1, 0x11

    #v1=(PosByte);
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_0
.end method

.method private getShowIndicatorInternal()Z
    .locals 1

    .prologue
    .line 370
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mShowIndicator:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isPullToRefreshEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private isFirstItemVisible()Z
    .locals 6

    .prologue
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    const/4 v3, 0x1

    #v3=(One);
    const/4 v4, 0x0

    .line 374
    #v4=(Null);
    iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v2=(Reference);
    check-cast v2, Landroid/widget/AbsListView;

    invoke-virtual {v2}, Landroid/widget/AbsListView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 376
    .local v0, adapter:Landroid/widget/Adapter;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 378
    :cond_0
    #v2=(Conflicted);
    const-string v2, "PullToRefresh"

    #v2=(Reference);
    const-string v4, "isFirstItemVisible. Empty View."

    #v4=(Reference);
    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    .line 399
    :goto_0
    #v1=(Conflicted);v2=(Boolean);v5=(Conflicted);
    return v2

    .line 391
    :cond_1
    #v1=(Uninit);v4=(Null);v5=(Uninit);
    iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v2=(Reference);
    check-cast v2, Landroid/widget/AbsListView;

    invoke-virtual {v2}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v2

    #v2=(Integer);
    if-gt v2, v3, :cond_3

    .line 392
    iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v2=(Reference);
    check-cast v2, Landroid/widget/AbsListView;

    invoke-virtual {v2, v4}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 393
    .local v1, firstVisibleChild:Landroid/view/View;
    #v1=(Reference);
    if-eqz v1, :cond_3

    .line 394
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v5

    #v5=(Integer);
    iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    check-cast v2, Landroid/widget/AbsListView;

    invoke-virtual {v2}, Landroid/widget/AbsListView;->getTop()I

    move-result v2

    #v2=(Integer);
    if-lt v5, v2, :cond_2

    move v2, v3

    #v2=(One);
    goto :goto_0

    :cond_2
    #v2=(Integer);
    move v2, v4

    #v2=(Null);
    goto :goto_0

    .end local v1           #firstVisibleChild:Landroid/view/View;
    :cond_3
    #v1=(Conflicted);v2=(Conflicted);v5=(Uninit);
    move v2, v4

    .line 399
    #v2=(Null);
    goto :goto_0
.end method

.method private isLastItemVisible()Z
    .locals 10

    .prologue
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    const/4 v6, 0x1

    #v6=(One);
    const/4 v7, 0x0

    .line 403
    #v7=(Null);
    iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v5=(Reference);
    check-cast v5, Landroid/widget/AbsListView;

    invoke-virtual {v5}, Landroid/widget/AbsListView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 405
    .local v0, adapter:Landroid/widget/Adapter;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_1

    .line 407
    :cond_0
    #v5=(Conflicted);
    const-string v5, "PullToRefresh"

    #v5=(Reference);
    const-string v7, "isLastItemVisible. Empty View."

    #v7=(Reference);
    invoke-static {v5, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move v5, v6

    .line 435
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v8=(Conflicted);v9=(Conflicted);
    return v5

    .line 411
    :cond_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);
    iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v5=(Reference);
    check-cast v5, Landroid/widget/AbsListView;

    invoke-virtual {v5}, Landroid/widget/AbsListView;->getCount()I

    move-result v5

    #v5=(Integer);
    add-int/lit8 v2, v5, -0x1

    .line 412
    .local v2, lastItemPosition:I
    #v2=(Integer);
    iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v5=(Reference);
    check-cast v5, Landroid/widget/AbsListView;

    invoke-virtual {v5}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v4

    .line 415
    .local v4, lastVisiblePosition:I
    #v4=(Integer);
    const-string v5, "PullToRefresh"

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "isLastItemVisible. Last Item Position: "

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " Last Visible Pos: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 416
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 415
    invoke-static {v5, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 426
    add-int/lit8 v5, v2, -0x1

    #v5=(Integer);
    if-lt v4, v5, :cond_3

    .line 427
    iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v5=(Reference);
    check-cast v5, Landroid/widget/AbsListView;

    invoke-virtual {v5}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v5

    #v5=(Integer);
    sub-int v1, v4, v5

    .line 428
    .local v1, childIndex:I
    #v1=(Integer);
    iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v5=(Reference);
    check-cast v5, Landroid/widget/AbsListView;

    invoke-virtual {v5, v1}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 429
    .local v3, lastVisibleChild:Landroid/view/View;
    #v3=(Reference);
    if-eqz v3, :cond_3

    .line 430
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v8

    #v8=(Integer);
    iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    check-cast v5, Landroid/widget/AbsListView;

    invoke-virtual {v5}, Landroid/widget/AbsListView;->getBottom()I

    move-result v5

    #v5=(Integer);
    if-gt v8, v5, :cond_2

    move v5, v6

    #v5=(One);
    goto :goto_0

    :cond_2
    #v5=(Integer);
    move v5, v7

    #v5=(Null);
    goto :goto_0

    .end local v1           #childIndex:I
    .end local v3           #lastVisibleChild:Landroid/view/View;
    :cond_3
    #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v8=(Reference);
    move v5, v7

    .line 435
    #v5=(Null);
    goto :goto_0
.end method

.method private removeIndicatorViews()V
    .locals 3

    .prologue
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    const/4 v2, 0x0

    .line 439
    #v2=(Null);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 440
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getRefreshableViewWrapper()Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 441
    iput-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    .line 444
    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    if-eqz v0, :cond_1

    .line 445
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getRefreshableViewWrapper()Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 446
    iput-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    .line 448
    :cond_1
    #v1=(Conflicted);
    return-void
.end method

.method private updateIndicatorViewsVisibility()V
    .locals 1

    .prologue
    .line 451
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 452
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isRefreshing()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isReadyForPullStart()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 453
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->isVisible()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 454
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->show()V

    .line 463
    :cond_0
    :goto_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 464
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isRefreshing()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isReadyForPullEnd()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 465
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->isVisible()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 466
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->show()V

    .line 474
    :cond_1
    :goto_1
    #v0=(Conflicted);
    return-void

    .line 457
    :cond_2
    #v0=(Boolean);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->isVisible()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 458
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->hide()V

    goto :goto_0

    .line 469
    :cond_3
    #v0=(Boolean);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->isVisible()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 470
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->hide()V

    goto :goto_1
.end method


# virtual methods
.method public getShowIndicator()Z
    .locals 1

    .prologue
    .line 99
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mShowIndicator:Z

    #v0=(Boolean);
    return v0
.end method

.method protected handleStyledAttributes(Landroid/content/res/TypedArray;)V
    .locals 2
    .parameter "a"

    .prologue
    .line 303
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    const/4 v1, 0x5

    #v1=(PosByte);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isPullToRefreshOverScrollEnabled()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mShowIndicator:Z

    .line 304
    return-void

    .line 303
    :cond_0
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method protected isReadyForPullEnd()Z
    .locals 1

    .prologue
    .line 311
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isLastItemVisible()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected isReadyForPullStart()Z
    .locals 1

    .prologue
    .line 307
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isFirstItemVisible()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected onPullToRefresh()V
    .locals 2

    .prologue
    .line 247
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onPullToRefresh()V

    .line 249
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 250
    invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getCurrentMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I

    move-result v1

    #v1=(Integer);
    aget v0, v0, v1

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 262
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 252
    :pswitch_0
    #v0=(Integer);v1=(Integer);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->pullToRefresh()V

    goto :goto_0

    .line 255
    :pswitch_1
    #v0=(Integer);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->pullToRefresh()V

    goto :goto_0

    .line 250
    #v0=(Unknown);v1=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onRefreshing(Z)V
    .locals 1
    .parameter "doScroll"

    .prologue
    .line 265
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-super {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onRefreshing(Z)V

    .line 267
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 268
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->updateIndicatorViewsVisibility()V

    .line 270
    :cond_0
    return-void
.end method

.method protected onReleaseToRefresh()V
    .locals 2

    .prologue
    .line 274
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onReleaseToRefresh()V

    .line 276
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 277
    invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getCurrentMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I

    move-result v1

    #v1=(Integer);
    aget v0, v0, v1

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 289
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 279
    :pswitch_0
    #v0=(Integer);v1=(Integer);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->releaseToRefresh()V

    goto :goto_0

    .line 282
    :pswitch_1
    #v0=(Integer);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->releaseToRefresh()V

    goto :goto_0

    .line 277
    #v0=(Unknown);v1=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onReset()V
    .locals 1

    .prologue
    .line 293
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onReset()V

    .line 295
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 296
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->updateIndicatorViewsVisibility()V

    .line 298
    :cond_0
    return-void
.end method

.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 3
    .parameter "view"
    .parameter "firstVisibleItem"
    .parameter "visibleItemCount"
    .parameter "totalItemCount"

    .prologue
    .line 106
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    const-string v0, "PullToRefresh"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "First Visible: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Visible Count: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 107
    const-string v2, ". Total Items:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;

    if-eqz v0, :cond_0

    .line 115
    if-lez p4, :cond_3

    add-int v0, p2, p3

    #v0=(Integer);
    add-int/lit8 v1, p4, -0x1

    #v1=(Integer);
    if-lt v0, v1, :cond_3

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mLastItemVisible:Z

    .line 119
    :cond_0
    #v0=(Conflicted);
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 120
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->updateIndicatorViewsVisibility()V

    .line 124
    :cond_1
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 125
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    .line 127
    :cond_2
    return-void

    .line 115
    :cond_3
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method protected onScrollChanged(IIII)V
    .locals 3
    .parameter "l"
    .parameter "t"
    .parameter "oldl"
    .parameter "oldt"

    .prologue
    .line 316
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-super {p0, p1, p2, p3, p4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onScrollChanged(IIII)V

    .line 317
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mEmptyView:Landroid/view/View;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mEmptyView:Landroid/view/View;

    #v0=(Reference);
    neg-int v1, p1

    #v1=(Integer);
    neg-int v2, p2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V

    .line 320
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1
    .parameter "view"
    .parameter "state"

    .prologue
    .line 134
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mLastItemVisible:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;

    #v0=(Reference);
    invoke-interface {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;->onLastItemVisible()V

    .line 138
    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 139
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 141
    :cond_1
    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 1
    .parameter "adapter"

    .prologue
    .line 152
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v0=(Reference);
    check-cast v0, Landroid/widget/AdapterView;

    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setAdapter(Landroid/widget/Adapter;)V

    .line 153
    return-void
.end method

.method public final setEmptyView(Landroid/view/View;)V
    .locals 4
    .parameter "newEmptyView"

    .prologue
    .line 169
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getRefreshableViewWrapper()Landroid/widget/FrameLayout;

    move-result-object v2

    .line 171
    .local v2, refreshableViewWrapper:Landroid/widget/FrameLayout;
    #v2=(Reference);
    if-eqz p1, :cond_1

    .line 174
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {p1, v3}, Landroid/view/View;->setClickable(Z)V

    .line 176
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 177
    .local v1, newEmptyViewParent:Landroid/view/ViewParent;
    #v1=(Reference);
    if-eqz v1, :cond_0

    instance-of v3, v1, Landroid/view/ViewGroup;

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 178
    check-cast v1, Landroid/view/ViewGroup;

    .end local v1           #newEmptyViewParent:Landroid/view/ViewParent;
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 183
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    #v3=(Reference);
    invoke-static {v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->convertEmptyViewLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v0

    .line 184
    .local v0, lp:Landroid/widget/FrameLayout$LayoutParams;
    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 185
    invoke-virtual {v2, p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 191
    .end local v0           #lp:Landroid/widget/FrameLayout$LayoutParams;
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v3=(Reference);
    instance-of v3, v3, Lcom/handmark/pulltorefresh/library/internal/EmptyViewMethodAccessor;

    #v3=(Boolean);
    if-eqz v3, :cond_3

    .line 192
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v3=(Reference);
    check-cast v3, Lcom/handmark/pulltorefresh/library/internal/EmptyViewMethodAccessor;

    invoke-interface {v3, p1}, Lcom/handmark/pulltorefresh/library/internal/EmptyViewMethodAccessor;->setEmptyViewInternal(Landroid/view/View;)V

    .line 196
    :goto_1
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mEmptyView:Landroid/view/View;

    .line 197
    return-void

    .line 187
    .restart local v0       #lp:Landroid/widget/FrameLayout$LayoutParams;
    :cond_2
    #v0=(Reference);v1=(Reference);
    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 194
    .end local v0           #lp:Landroid/widget/FrameLayout$LayoutParams;
    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);
    iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v3=(Reference);
    check-cast v3, Landroid/widget/AbsListView;

    invoke-virtual {v3, p1}, Landroid/widget/AbsListView;->setEmptyView(Landroid/view/View;)V

    goto :goto_1
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1
    .parameter

    .prologue
    .line 208
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    .local p1, listener:Landroid/widget/AdapterView$OnItemClickListener;,"Landroid/widget/AdapterView$OnItemClickListener;"
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;

    #v0=(Reference);
    check-cast v0, Landroid/widget/AbsListView;

    invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 209
    return-void
.end method

.method public final setOnLastItemVisibleListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;)V
    .locals 0
    .parameter

    .prologue
    .line 212
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    .local p1, listener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;"
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;

    .line 213
    return-void
.end method

.method public final setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 216
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;

    .line 217
    return-void
.end method

.method public final setScrollEmptyView(Z)V
    .locals 0
    .parameter "doScroll"

    .prologue
    .line 220
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    iput-boolean p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z

    .line 221
    return-void
.end method

.method public setShowIndicator(Z)V
    .locals 1
    .parameter "showIndicator"

    .prologue
    .line 232
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    iput-boolean p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mShowIndicator:Z

    .line 234
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 236
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->addIndicatorViews()V

    .line 241
    :goto_0
    return-void

    .line 239
    :cond_0
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->removeIndicatorViews()V

    goto :goto_0
.end method

.method protected updateUIForMode()V
    .locals 1

    .prologue
    .line 324
    .local p0, this:Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
    invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->updateUIForMode()V

    .line 327
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 328
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->addIndicatorViews()V

    .line 332
    :goto_0
    return-void

    .line 330
    :cond_0
    invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->removeIndicatorViews()V

    goto :goto_0
.end method

*/}
