package com.universer.HustWhereToEat.adapter; class ListViewPagerAdapter {/*

.class public Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "ListViewPagerAdapter.java"


# static fields
.field private static final STRINGS:[Ljava/lang/String;


# instance fields
.field private listener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener",
            "<",
            "Landroid/widget/ListView;",
            ">;"
        }
    .end annotation
.end field

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
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 27
    const/16 v0, 0x1a

    #v0=(PosByte);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const-string v2, "Abbaye de Belloc"

    #v2=(Reference);
    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 28
    #v1=(One);
    const-string v2, "Abbaye du Mont des Cats"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    #v1=(PosByte);
    const-string v2, "Abertam"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "Abondance"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "Ackawi"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    .line 29
    const-string v2, "Acorn"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "Adelost"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "Affidelice au Chablis"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "Afuega\'l Pitu"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    .line 30
    const-string v2, "Airag"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "Airedale"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "Aisy Cendre"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "Allgauer Emmentaler"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    .line 31
    const-string v2, "Abbaye de Belloc"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "Abbaye du Mont des Cats"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "Abertam"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    .line 32
    const-string v2, "Abondance"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "Ackawi"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "Acorn"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "Adelost"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "Affidelice au Chablis"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    .line 33
    const-string v2, "Afuega\'l Pitu"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "Airag"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "Airedale"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "Aisy Cendre"

    aput-object v2, v0, v1

    const/16 v1, 0x19

    .line 34
    const-string v2, "Allgauer Emmentaler"

    aput-object v2, v0, v1

    .line 27
    sput-object v0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->STRINGS:[Ljava/lang/String;

    .line 34
    return-void
.end method

.method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;Landroid/content/Context;)V
    .locals 7
    .parameter
    .parameter "mContext"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener",
            "<",
            "Landroid/widget/ListView;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .prologue
    .line 39
    .local p1, listener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener<Landroid/widget/ListView;>;"
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 35
    #p0=(Reference);
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    .line 41
    iput-object p1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->listener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;

    .line 42
    iput-object p2, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->mContext:Landroid/content/Context;

    .line 43
    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .local v6, comments:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    #v6=(Reference);
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    #v0=(UninitRef);
    const-string v1, "\u9ea6\u82bd\u8297"

    const-string v2, "2130837575"

    .line 53
    #v2=(Reference);
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    #v3=(Integer);
    const-string v4, "\u534e\u79d1\u751f\u6d3b\u95e8"

    #v4=(Reference);
    const-string v5, "13098840196"

    .line 52
    #v5=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 54
    .local v0, res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u897f\u82d1\u5496\u5561"

    const-string v2, "2130837571"

    .line 56
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u897f\u5341\u4e00\u820d\u9644\u8fd1"

    const-string v5, "13098840196"

    .line 55
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 57
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u9e2d\u8840\u7c89\u4e1d"

    const-string v2, "2130837580"

    .line 59
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u5357\u4e09\u95e8"

    const-string v5, "13098840196"

    .line 58
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 60
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u7b80\u6734\u7530\u56ed\u5be8(\u5149\u8c37\u822a\u6bcd\u5e97) "

    .line 62
    const-string v2, "2130837578"

    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    .line 63
    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u5357\u5927\u95e8"

    const-string v5, "13098840196"

    .line 61
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 64
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u6c27\u6c14\u5c42"

    const-string v2, "2130837576"

    .line 66
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u897f\u56ed\u98df\u5802\u9644\u8fd1"

    const-string v5, "13098840196"

    .line 65
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 67
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u597d\u8fd0\u6765\u65b0\u5ddd\u83dc"

    const-string v2, "2130837579"

    .line 69
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u897f\u5149\u8c37\u4f53\u80b2\u9986\u5bf9\u9762"

    const-string v5, "13098840196"

    .line 68
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 71
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u9e21\u86cb\u704c\u997c"

    const-string v2, "2130837573"

    .line 73
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u5357\u5927\u95e8\u9644\u8fd1"

    const-string v5, "13098840196"

    .line 72
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 75
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u8521\u6797\u8bb0"

    const-string v2, "2130837570"

    .line 77
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    const-string v4, "\u5149\u8c37\u6b65\u884c\u8857\u5bf9\u9762"

    const-string v5, "13098840196"

    .line 76
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 78
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u6d77\u5e95\u635e"

    const-string v2, "2130837572"

    .line 80
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    const-string v4, "\u73de\u55bb\u8def618\u53f7\uff08\u70fd\u706b\u79d1\u6280\u5bf9\u9762\uff09"

    const-string v5, "13098840196"

    .line 79
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 82
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u51ef\u5a01\u5564\u9152\u5c4b"

    const-string v2, "2130837574"

    .line 84
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    const-string v4, "\u5149\u8c37\u5927\u6d0b\u767e\u8d274\u697c"

    const-string v5, "13098840196"

    .line 83
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 85
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    return-void
.end method

.method static synthetic access$0(Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;)Ljava/util/List;
    .locals 1
    .parameter

    .prologue
    .line 35
    iget-object v0, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1(Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;Lcom/universer/HustWhereToEat/model/Restaurant;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 182
    invoke-direct {p0, p1}, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->startActivity(Lcom/universer/HustWhereToEat/model/Restaurant;)V

    return-void
.end method

.method private startActivity(Lcom/universer/HustWhereToEat/model/Restaurant;)V
    .locals 3
    .parameter "tempRes"

    .prologue
    .line 183
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->mContext:Landroid/content/Context;

    #v1=(Reference);
    const-class v2, Lcom/universer/HustWhereToEat/activity/DetailActivity;

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 184
    .local v0, i:Landroid/content/Intent;
    #v0=(Reference);
    const-string v1, "ADDRESS"

    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    const-string v1, "PHONE"

    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getPhone()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 186
    const-string v1, "NAME"

    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 187
    const-string v1, "IMAGE"

    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 188
    const-string v2, "COMMENT"

    .line 189
    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getCommentList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 188
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 190
    iget-object v1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 191
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .parameter "container"
    .parameter "position"
    .parameter "object"

    .prologue
    .line 195
    check-cast p3, Landroid/view/View;

    .end local p3
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 196
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 205
    const/4 v0, 0x3

    #v0=(PosByte);
    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 13
    .parameter "container"
    .parameter "position"

    .prologue
    const/4 v12, -0x1

    .line 92
    #v12=(Byte);
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 94
    .local v4, context:Landroid/content/Context;
    #v4=(Reference);
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v9

    #v9=(Reference);
    const v10, 0x7f030007

    .line 95
    #v10=(Integer);
    const/4 v11, 0x0

    .line 94
    #v11=(Null);
    invoke-virtual {v9, v10, p1, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 93
    #v5=(Reference);
    check-cast v5, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;

    .line 96
    .local v5, plv:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
    if-nez p2, :cond_1

    .line 97
    new-instance v0, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;

    .line 98
    #v0=(UninitRef);
    iget-object v9, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->mContext:Landroid/content/Context;

    iget-object v10, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    .line 97
    #v10=(Reference);
    invoke-direct {v0, v9, v10}, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 99
    .local v0, allAdapter:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;
    #v0=(Reference);
    new-instance v9, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$1;

    #v9=(UninitRef);
    invoke-direct {v9, p0}, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$1;-><init>(Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;)V

    #v9=(Reference);
    invoke-virtual {v5, v9}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 116
    invoke-virtual {v5, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 173
    .end local v0           #allAdapter:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    iget-object v9, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->listener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;

    #v9=(Reference);
    invoke-virtual {v5, v9}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setOnRefreshListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;)V

    .line 176
    invoke-virtual {p1, v5, v12, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 179
    return-object v5

    .line 117
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Integer);
    const/4 v9, 0x1

    #v9=(One);
    if-ne p2, v9, :cond_4

    .line 119
    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .local v3, bigResList:Ljava/util/List;,"Ljava/util/List<Lcom/universer/HustWhereToEat/model/Restaurant;>;"
    #v3=(Reference);
    iget-object v9, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    #v9=(Reference);
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 121
    .local v6, resIt:Ljava/util/Iterator;,"Ljava/util/Iterator<Lcom/universer/HustWhereToEat/model/Restaurant;>;"
    :cond_2
    :goto_1
    #v2=(Conflicted);v6=(Reference);v9=(Conflicted);
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    #v9=(Boolean);
    if-nez v9, :cond_3

    .line 127
    new-instance v1, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;

    .line 128
    #v1=(UninitRef);
    iget-object v9, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->mContext:Landroid/content/Context;

    .line 127
    #v9=(Reference);
    invoke-direct {v1, v9, v3}, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 129
    .local v1, bigAdapter:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;
    #v1=(Reference);
    invoke-virtual {v5, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 130
    new-instance v9, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$2;

    #v9=(UninitRef);
    invoke-direct {v9, p0}, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$2;-><init>(Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;)V

    #v9=(Reference);
    invoke-virtual {v5, v9}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    .line 122
    .end local v1           #bigAdapter:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;
    :cond_3
    #v1=(Uninit);v9=(Boolean);
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Lcom/universer/HustWhereToEat/model/Restaurant;

    .line 123
    .local v2, bigRes:Lcom/universer/HustWhereToEat/model/Restaurant;
    invoke-virtual {v2}, Lcom/universer/HustWhereToEat/model/Restaurant;->getType()I

    move-result v9

    #v9=(Integer);
    sget v10, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    if-ne v9, v10, :cond_2

    .line 124
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 145
    .end local v2           #bigRes:Lcom/universer/HustWhereToEat/model/Restaurant;
    .end local v3           #bigResList:Ljava/util/List;,"Ljava/util/List<Lcom/universer/HustWhereToEat/model/Restaurant;>;"
    .end local v6           #resIt:Ljava/util/Iterator;,"Ljava/util/Iterator<Lcom/universer/HustWhereToEat/model/Restaurant;>;"
    :cond_4
    #v2=(Uninit);v3=(Uninit);v6=(Uninit);v9=(One);
    const/4 v9, 0x2

    #v9=(PosByte);
    if-ne p2, v9, :cond_0

    .line 146
    new-instance v8, Ljava/util/ArrayList;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .local v8, smallResList:Ljava/util/List;,"Ljava/util/List<Lcom/universer/HustWhereToEat/model/Restaurant;>;"
    #v8=(Reference);
    iget-object v9, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->restaurantList:Ljava/util/List;

    #v9=(Reference);
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 148
    .restart local v6       #resIt:Ljava/util/Iterator;,"Ljava/util/Iterator<Lcom/universer/HustWhereToEat/model/Restaurant;>;"
    :cond_5
    :goto_2
    #v6=(Reference);v7=(Conflicted);v9=(Conflicted);
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    #v9=(Boolean);
    if-nez v9, :cond_6

    .line 154
    new-instance v1, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;

    .line 155
    #v1=(UninitRef);
    iget-object v9, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->mContext:Landroid/content/Context;

    .line 154
    #v9=(Reference);
    invoke-direct {v1, v9, v8}, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 156
    .restart local v1       #bigAdapter:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;
    #v1=(Reference);
    invoke-virtual {v5, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 157
    new-instance v9, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$3;

    #v9=(UninitRef);
    invoke-direct {v9, p0}, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$3;-><init>(Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;)V

    #v9=(Reference);
    invoke-virtual {v5, v9}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    .line 149
    .end local v1           #bigAdapter:Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;
    :cond_6
    #v1=(Uninit);v9=(Boolean);
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Lcom/universer/HustWhereToEat/model/Restaurant;

    .line 150
    .local v7, smallRes:Lcom/universer/HustWhereToEat/model/Restaurant;
    invoke-virtual {v7}, Lcom/universer/HustWhereToEat/model/Restaurant;->getType()I

    move-result v9

    #v9=(Integer);
    sget v10, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    if-ne v9, v10, :cond_5

    .line 151
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1
    .parameter "view"
    .parameter "object"

    .prologue
    .line 200
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
