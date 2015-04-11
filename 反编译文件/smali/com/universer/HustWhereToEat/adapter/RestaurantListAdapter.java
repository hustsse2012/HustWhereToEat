package com.universer.HustWhereToEat.adapter; class RestaurantListAdapter {/*

.class public Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;
.super Landroid/widget/BaseAdapter;
.source "RestaurantListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;
    }
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private restaurantList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/universer/HustWhereToEat/model/Restaurant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .parameter "mContext"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/universer/HustWhereToEat/model/Restaurant;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 21
    .local p2, restaurantList:Ljava/util/List;,"Ljava/util/List<Lcom/universer/HustWhereToEat/model/Restaurant;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 23
    #p0=(Reference);
    iput-object p1, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->mContext:Landroid/content/Context;

    .line 24
    iput-object p2, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->restaurantList:Ljava/util/List;

    .line 25
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->restaurantList:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter "position"

    .prologue
    .line 36
    iget-object v0, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->restaurantList:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter "position"

    .prologue
    .line 42
    int-to-long v0, p1

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .parameter "position"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    .line 48
    if-nez p2, :cond_1

    .line 49
    new-instance v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;-><init>(Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;)V

    .line 51
    .local v0, childHolder:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;
    #v0=(Reference);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->mContext:Landroid/content/Context;

    #v3=(Reference);
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 52
    const v4, 0x7f030004

    #v4=(Integer);
    const/4 v5, 0x0

    .line 51
    #v5=(Null);
    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 54
    const v3, 0x7f05001b

    #v3=(Integer);
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/widget/TextView;

    .line 53
    iput-object v3, v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;->restaurantNameTxt:Landroid/widget/TextView;

    .line 56
    const v3, 0x7f05001a

    #v3=(Integer);
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/widget/ImageView;

    .line 55
    iput-object v3, v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;->restaurantImg:Landroid/widget/ImageView;

    .line 58
    const v3, 0x7f05001c

    #v3=(Integer);
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/widget/TextView;

    .line 57
    iput-object v3, v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;->restaurantAddressTxt:Landroid/widget/TextView;

    .line 59
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 65
    :goto_0
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->restaurantList:Ljava/util/List;

    #v3=(Reference);
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v3}, Lcom/universer/HustWhereToEat/model/Restaurant;->getName()Ljava/lang/String;

    move-result-object v2

    .line 66
    .local v2, restaurantName:Ljava/lang/String;
    #v2=(Reference);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v3}, Lcom/universer/HustWhereToEat/model/Restaurant;->getAddress()Ljava/lang/String;

    move-result-object v1

    .line 67
    .local v1, restaurantAddress:Ljava/lang/String;
    #v1=(Reference);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v3}, Lcom/universer/HustWhereToEat/model/Restaurant;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 71
    iget-object v4, v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;->restaurantImg:Landroid/widget/ImageView;

    .line 72
    #v4=(Reference);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v3}, Lcom/universer/HustWhereToEat/model/Restaurant;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 71
    #v3=(Integer);
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 76
    :cond_0
    #v3=(Conflicted);v4=(Conflicted);
    iget-object v3, v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;->restaurantAddressTxt:Landroid/widget/TextView;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    iget-object v3, v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;->restaurantNameTxt:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    return-object p2

    .line 62
    .end local v0           #childHolder:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;
    .end local v1           #restaurantAddress:Ljava/lang/String;
    .end local v2           #restaurantName:Ljava/lang/String;
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;

    .restart local v0       #childHolder:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter$ChildHolder;
    goto :goto_0
.end method

*/}
