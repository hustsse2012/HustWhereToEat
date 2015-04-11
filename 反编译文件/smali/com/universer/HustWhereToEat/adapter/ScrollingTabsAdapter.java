package com.universer.HustWhereToEat.adapter; class ScrollingTabsAdapter {/*

.class public Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;
.super Ljava/lang/Object;
.source "ScrollingTabsAdapter.java"

# interfaces
.implements Lcom/universer/HustWhereToEat/view/TabAdapter;


# instance fields
.field private final activity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .parameter "act"

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    #p0=(Reference);
    iput-object p1, p0, Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;->activity:Landroid/app/Activity;

    .line 22
    return-void
.end method


# virtual methods
.method public getView(I)Landroid/view/View;
    .locals 9
    .parameter "position"

    .prologue
    .line 26
    iget-object v7, p0, Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;->activity:Landroid/app/Activity;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 27
    .local v2, inflater:Landroid/view/LayoutInflater;
    #v2=(Reference);
    const v7, 0x7f030017

    #v7=(Integer);
    const/4 v8, 0x0

    #v8=(Null);
    invoke-virtual {v2, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/widget/Button;

    .line 28
    .local v4, tab:Landroid/widget/Button;
    iget-object v7, p0, Lcom/universer/HustWhereToEat/adapter/ScrollingTabsAdapter;->activity:Landroid/app/Activity;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f080001

    #v8=(Integer);
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v3

    .line 29
    .local v3, mTitles:[Ljava/lang/String;
    #v3=(Reference);
    new-instance v5, Ljava/util/HashSet;

    #v5=(UninitRef);
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v5, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 30
    .local v5, tab_sets:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    #v5=(Reference);
    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v7

    #v7=(Integer);
    new-array v6, v7, [Ljava/lang/String;

    .line 31
    .local v6, tabs_new:[Ljava/lang/String;
    #v6=(Reference);
    const/4 v0, 0x0

    .line 32
    .local v0, cnt:I
    #v0=(Null);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v0=(Integer);v1=(Integer);
    array-length v7, v3

    if-lt v1, v7, :cond_1

    .line 38
    array-length v7, v6

    if-ge p1, v7, :cond_0

    .line 39
    aget-object v7, v6, p1

    #v7=(Null);
    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v4, v7}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 40
    :cond_0
    #v7=(Conflicted);
    return-object v4

    .line 33
    :cond_1
    #v7=(Integer);
    aget-object v7, v3, v1

    #v7=(Null);
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_2

    .line 34
    aget-object v7, v3, v1

    #v7=(Null);
    aput-object v7, v6, v0

    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 32
    :cond_2
    #v7=(Boolean);
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

*/}
