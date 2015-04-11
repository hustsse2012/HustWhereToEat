package com.universer.HustWhereToEat.view; class ScrollableTabView {/*

.class public Lcom/universer/HustWhereToEat/view/ScrollableTabView;
.super Landroid/widget/HorizontalScrollView;
.source "ScrollableTabView.java"


# instance fields
.field private mAdapter:Lcom/universer/HustWhereToEat/view/TabAdapter;

.field private final mContainer:Landroid/widget/LinearLayout;

.field private mPager:Landroid/support/v4/view/ViewPager;

.field private final mTabs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 25
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 29
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, v0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v3, -0x1

    #v3=(Byte);
    const/4 v2, 0x0

    .line 32
    #v2=(Null);
    invoke-direct {p0, p1, p2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    #p0=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    .line 19
    iput-object v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mAdapter:Lcom/universer/HustWhereToEat/view/TabAdapter;

    .line 22
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mTabs:Ljava/util/ArrayList;

    .line 33
    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->setHorizontalScrollBarEnabled(Z)V

    .line 34
    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->setHorizontalFadingEdgeEnabled(Z)V

    .line 35
    new-instance v1, Landroid/widget/LinearLayout;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    .line 36
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 39
    .local v0, params:Landroid/widget/LinearLayout$LayoutParams;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    iget-object v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 42
    iget-object v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v1}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->addView(Landroid/view/View;)V

    .line 43
    return-void
.end method

.method static synthetic access$0(Lcom/universer/HustWhereToEat/view/ScrollableTabView;)Landroid/support/v4/view/ViewPager;
    .locals 1
    .parameter

    .prologue
    .line 17
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    return-object v0
.end method

.method private initTabs()V
    .locals 4

    .prologue
    .line 61
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 62
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 64
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mAdapter:Lcom/universer/HustWhereToEat/view/TabAdapter;

    if-nez v3, :cond_0

    .line 86
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 67
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_1
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v3}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v3

    #v3=(Integer);
    if-lt v0, v3, :cond_1

    .line 85
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p0, v3}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->selectTab(I)V

    goto :goto_0

    .line 68
    :cond_1
    move v1, v0

    .line 69
    .local v1, index:I
    #v1=(Integer);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mAdapter:Lcom/universer/HustWhereToEat/view/TabAdapter;

    #v3=(Reference);
    invoke-interface {v3, v0}, Lcom/universer/HustWhereToEat/view/TabAdapter;->getView(I)Landroid/view/View;

    move-result-object v2

    .line 70
    .local v2, tab:Landroid/view/View;
    #v2=(Reference);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 71
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 72
    iget-object v3, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mTabs:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    new-instance v3, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;

    #v3=(UninitRef);
    invoke-direct {v3, p0, v1}, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;-><init>(Lcom/universer/HustWhereToEat/view/ScrollableTabView;I)V

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 1
    .parameter "changed"
    .parameter "l"
    .parameter "t"
    .parameter "r"
    .parameter "b"

    .prologue
    .line 92
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    .line 93
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->selectTab(I)V

    .line 96
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public selectTab(I)V
    .locals 9
    .parameter "position"

    .prologue
    .line 99
    const/4 v0, 0x0

    .local v0, i:I
    #v0=(Null);
    const/4 v2, 0x0

    .local v2, pos:I
    :goto_0
    #v0=(Integer);v2=(Integer);v4=(Conflicted);v7=(Conflicted);
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v7

    #v7=(Integer);
    if-lt v0, v7, :cond_0

    .line 103
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    #v7=(Reference);
    invoke-virtual {v7, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 104
    .local v3, selectView:Landroid/view/View;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 105
    .local v5, w:I
    #v5=(Integer);
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v1

    .line 106
    .local v1, l:I
    #v1=(Integer);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->getWidth()I

    move-result v7

    #v7=(Integer);
    div-int/lit8 v7, v7, 0x2

    sub-int v7, v1, v7

    div-int/lit8 v8, v5, 0x2

    #v8=(Integer);
    add-int v6, v7, v8

    .line 107
    .local v6, x:I
    #v6=(Integer);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->getScrollY()I

    move-result v7

    invoke-virtual {p0, v6, v7}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->smoothScrollTo(II)V

    .line 109
    return-void

    .line 100
    .end local v1           #l:I
    .end local v3           #selectView:Landroid/view/View;
    .end local v5           #w:I
    .end local v6           #x:I
    :cond_0
    #v1=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);
    iget-object v7, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mContainer:Landroid/widget/LinearLayout;

    #v7=(Reference);
    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 101
    .local v4, tab:Landroid/view/View;
    #v4=(Reference);
    if-ne v2, p1, :cond_1

    const/4 v7, 0x1

    :goto_1
    #v7=(Boolean);
    invoke-virtual {v4, v7}, Landroid/view/View;->setSelected(Z)V

    .line 99
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 101
    :cond_1
    #v7=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    goto :goto_1
.end method

.method public setAdapter(Lcom/universer/HustWhereToEat/view/TabAdapter;)V
    .locals 1
    .parameter "tabAdapter"

    .prologue
    .line 47
    iput-object p1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mAdapter:Lcom/universer/HustWhereToEat/view/TabAdapter;

    .line 48
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mAdapter:Lcom/universer/HustWhereToEat/view/TabAdapter;

    if-eqz v0, :cond_0

    .line 49
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->initTabs()V

    .line 51
    :cond_0
    return-void
.end method

.method public setViewPage(Landroid/support/v4/view/ViewPager;)V
    .locals 1
    .parameter "pager"

    .prologue
    .line 54
    iput-object p1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    .line 55
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mPager:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->mAdapter:Lcom/universer/HustWhereToEat/view/TabAdapter;

    if-eqz v0, :cond_0

    .line 56
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->initTabs()V

    .line 58
    :cond_0
    return-void
.end method

*/}
