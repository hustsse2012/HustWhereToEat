package com.universer.HustWhereToEat.fragment; class AllFragment {/*

.class public Lcom/universer/HustWhereToEat/fragment/AllFragment;
.super Landroid/support/v4/app/Fragment;
.source "AllFragment.java"

# interfaces
.implements Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;,
        Lcom/universer/HustWhereToEat/fragment/AllFragment$MyAdapter;,
        Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener",
        "<",
        "Landroid/widget/ListView;",
        ">;",
        "Landroid/support/v4/view/ViewPager$OnPageChangeListener;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "NewsFragment"


# instance fields
.field private listViewPagerAdapter:Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;

.field private mActivity:Landroid/app/Activity;

.field private mAdapter:Lcom/universer/HustWhereToEat/fragment/AllFragment$MyAdapter;

.field private mPager:Landroid/support/v4/view/ViewPager;

.field private mScrollableTabView:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

.field private mScrollingTabsAdapter:Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;

.field private mTopBackView:Landroid/widget/ImageView;

.field private mTopTitleView:Landroid/widget/TextView;

.field private myPageChangeListener:Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;

.field private pagerItemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private showLeft:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 54
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 64
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 54
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    .line 65
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mActivity:Landroid/app/Activity;

    .line 66
    return-void
.end method

.method static synthetic access$0(Lcom/universer/HustWhereToEat/fragment/AllFragment;)Ljava/util/ArrayList;
    .locals 1
    .parameter

    .prologue
    .line 54
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method private initScrollableTabs(Landroid/view/View;Landroid/support/v4/view/ViewPager;)V
    .locals 2
    .parameter "view"
    .parameter "mViewPager"

    .prologue
    .line 119
    .line 120
    const v0, 0x7f050049

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    .line 119
    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollableTabView:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    .line 121
    new-instance v0, Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;-><init>(Landroid/app/Activity;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollingTabsAdapter:Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;

    .line 122
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollableTabView:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollingTabsAdapter:Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;

    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->setAdapter(Lcom/universer/HustWhereToEat/view/TabAdapter;)V

    .line 123
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollableTabView:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    invoke-virtual {v0, p2}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->setViewPage(Landroid/support/v4/view/ViewPager;)V

    .line 124
    return-void
.end method


# virtual methods
.method public getViewPage()Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    return-object v0
.end method

.method public isEnd()Z
    .locals 3

    .prologue
    .line 161
    const-string v0, "NewsFragment"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "isEnd: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", pagerItemList "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 162
    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 161
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    #v0=(Integer);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_0

    .line 164
    const/4 v0, 0x1

    .line 166
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isFirst()Z
    .locals 3

    .prologue
    .line 152
    const-string v0, "NewsFragment"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "isFirst: "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", pagerItemList "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 153
    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 152
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    .line 155
    const/4 v0, 0x1

    .line 157
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .parameter "savedInstanceState"

    .prologue
    .line 132
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 134
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->showLeft:Landroid/view/View;

    #v0=(Reference);
    new-instance v1, Lcom/universer/HustWhereToEat/fragment/AllFragment$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/universer/HustWhereToEat/fragment/AllFragment$1;-><init>(Lcom/universer/HustWhereToEat/fragment/AllFragment;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .parameter "savedInstanceState"

    .prologue
    .line 70
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 71
    const-string v0, "NewsFragment"

    #v0=(Reference);
    const-string v1, "onCreate"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .parameter "inflater"
    .parameter "container"
    .parameter "savedInstanceState"

    .prologue
    .line 82
    const v1, 0x7f030018

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 84
    .local v0, mView:Landroid/view/View;
    #v0=(Reference);
    const v1, 0x7f05001e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->showLeft:Landroid/view/View;

    .line 87
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->showLeft:Landroid/view/View;

    const v2, 0x7f050020

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mTopTitleView:Landroid/widget/TextView;

    .line 88
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mTopTitleView:Landroid/widget/TextView;

    const v2, 0x7f070008

    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->showLeft:Landroid/view/View;

    const v2, 0x7f05001f

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mTopBackView:Landroid/widget/ImageView;

    .line 92
    const v1, 0x7f05004a

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    .line 94
    new-instance v1, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v1, p0, v2}, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->listViewPagerAdapter:Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;

    .line 95
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->listViewPagerAdapter:Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 97
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    .line 98
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    new-instance v2, Landroid/support/v4/app/Fragment;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/support/v4/app/Fragment;-><init>()V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    new-instance v2, Landroid/support/v4/app/Fragment;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/support/v4/app/Fragment;-><init>()V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    new-instance v2, Landroid/support/v4/app/Fragment;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/support/v4/app/Fragment;-><init>()V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 114
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-direct {p0, v0, v1}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->initScrollableTabs(Landroid/view/View;Landroid/support/v4/view/ViewPager;)V

    .line 115
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 76
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 77
    const-string v0, "NewsFragment"

    #v0=(Reference);
    const-string v1, "onDestroy"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    return-void
.end method

.method public onDestroyView()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 258
    #v2=(Null);
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 259
    const-string v0, "NewsFragment"

    #v0=(Reference);
    const-string v1, "onDestroyView"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    iput-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->listViewPagerAdapter:Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;

    .line 261
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 262
    iput-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->pagerItemList:Ljava/util/ArrayList;

    .line 263
    iput-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollableTabView:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    .line 264
    iput-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollingTabsAdapter:Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;

    .line 265
    iput-object v2, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mActivity:Landroid/app/Activity;

    .line 266
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0
    .parameter "position"

    .prologue
    .line 238
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0
    .parameter "position"
    .parameter "arg1"
    .parameter "arg2"

    .prologue
    .line 243
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1
    .parameter "position"

    .prologue
    .line 247
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->myPageChangeListener:Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->myPageChangeListener:Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;

    invoke-interface {v0, p1}, Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;->onPageSelected(I)V

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollableTabView:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    if-eqz v0, :cond_1

    .line 251
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->mScrollableTabView:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    invoke-virtual {v0, p1}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->selectTab(I)V

    .line 254
    :cond_1
    return-void
.end method

.method public onRefresh(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
            "<",
            "Landroid/widget/ListView;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 207
    .local p1, refreshView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase<Landroid/widget/ListView;>;"
    new-instance v0, Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    new-array v1, v1, [Ljava/lang/Void;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 208
    return-void
.end method

.method public setMyPageChangeListener(Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;)V
    .locals 0
    .parameter "l"

    .prologue
    .line 197
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment;->myPageChangeListener:Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;

    .line 199
    return-void
.end method

*/}
