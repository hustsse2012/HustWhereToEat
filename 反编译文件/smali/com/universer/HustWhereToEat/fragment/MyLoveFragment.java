package com.universer.HustWhereToEat.fragment; class MyLoveFragment {/*

.class public Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;
.super Lcom/universer/HustWhereToEat/fragment/BaseFragment;
.source "MyLoveFragment.java"


# instance fields
.field private mListView:Landroid/widget/ListView;

.field private mTopBackView:Landroid/widget/ImageView;

.field private mTopTitleView:Landroid/widget/TextView;

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

.field private showLeft:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/fragment/BaseFragment;-><init>()V

    .line 31
    #p0=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    .line 24
    return-void
.end method

.method static synthetic access$0(Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;)Ljava/util/List;
    .locals 1
    .parameter

    .prologue
    .line 31
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    #v0=(Reference);
    return-object v0
.end method

.method private findView(Landroid/view/View;)V
    .locals 2
    .parameter "view"

    .prologue
    .line 80
    const v0, 0x7f05001e

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->showLeft:Landroid/view/View;

    .line 81
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->showLeft:Landroid/view/View;

    const v1, 0x7f050020

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->mTopTitleView:Landroid/widget/TextView;

    .line 82
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->showLeft:Landroid/view/View;

    const v1, 0x7f05001f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->mTopBackView:Landroid/widget/ImageView;

    .line 83
    const v0, 0x7f050031

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->mListView:Landroid/widget/ListView;

    .line 84
    return-void
.end method

.method private initData()V
    .locals 7

    .prologue
    .line 88
    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .local v6, comments:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    #v6=(Reference);
    const-string v1, "\u597d\u8bc4"

    #v1=(Reference);
    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    #v0=(UninitRef);
    const-string v1, "\u9e2d\u8840\u7c89\u4e1d"

    const-string v2, "2130837580"

    .line 97
    #v2=(Reference);
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    #v3=(Integer);
    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u5357\u4e09\u95e8"

    #v4=(Reference);
    const-string v5, "13098840196"

    .line 96
    #v5=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 98
    .local v0, res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u7b80\u6734\u7530\u56ed\u5be8(\u5149\u8c37\u822a\u6bcd\u5e97) "

    .line 100
    const-string v2, "2130837578"

    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    .line 101
    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u5357\u5927\u95e8"

    const-string v5, "13098840196"

    .line 99
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 102
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u6c27\u6c14\u5c42"

    const-string v2, "2130837576"

    .line 104
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u897f\u56ed\u98df\u5802\u9644\u8fd1"

    const-string v5, "13098840196"

    .line 103
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 105
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u9e21\u86cb\u704c\u997c"

    const-string v2, "2130837573"

    .line 107
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u5357\u5927\u95e8\u9644\u8fd1"

    const-string v5, "13098840196"

    .line 106
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 109
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u8521\u6797\u8bb0"

    const-string v2, "2130837570"

    .line 111
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    const-string v4, "\u5149\u8c37\u6b65\u884c\u8857\u5bf9\u9762"

    const-string v5, "13098840196"

    .line 110
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 112
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u51ef\u5a01\u5564\u9152\u5c4b"

    const-string v2, "2130837574"

    .line 114
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    const-string v4, "\u5149\u8c37\u5927\u6d0b\u767e\u8d274\u697c"

    const-string v5, "13098840196"

    .line 113
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 115
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    return-void
.end method

.method private initView()V
    .locals 4

    .prologue
    .line 47
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->mTopTitleView:Landroid/widget/TextView;

    #v0=(Reference);
    const v1, 0x7f07000a

    #v1=(Integer);
    invoke-virtual {p0, v1}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->mListView:Landroid/widget/ListView;

    new-instance v1, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 49
    #v2=(Reference);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->restaurantList:Ljava/util/List;

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Lcom/universer/HustWhereToEat/adapter/RestaurantListAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 48
    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 50
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->mListView:Landroid/widget/ListView;

    new-instance v1, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$1;-><init>(Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 64
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .parameter "savedInstanceState"

    .prologue
    .line 122
    invoke-super {p0, p1}, Lcom/universer/HustWhereToEat/fragment/BaseFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 124
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->showLeft:Landroid/view/View;

    #v0=(Reference);
    new-instance v1, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$2;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$2;-><init>(Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .parameter "inflater"
    .parameter "container"
    .parameter "savedInstanceState"

    .prologue
    .line 36
    const v1, 0x7f03000e

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 37
    .local v0, view:Landroid/view/View;
    #v0=(Reference);
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->initData()V

    .line 38
    invoke-direct {p0, v0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->findView(Landroid/view/View;)V

    .line 39
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->initView()V

    .line 43
    return-object v0
.end method

.method protected startActivity(Lcom/universer/HustWhereToEat/model/Restaurant;)V
    .locals 3
    .parameter "tempRes"

    .prologue
    .line 68
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    #v1=(Reference);
    const-class v2, Lcom/universer/HustWhereToEat/activity/DetailActivity;

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 69
    .local v0, i:Landroid/content/Intent;
    #v0=(Reference);
    const-string v1, "ADDRESS"

    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 70
    const-string v1, "PHONE"

    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getPhone()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 71
    const-string v1, "NAME"

    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    const-string v1, "IMAGE"

    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    const-string v2, "COMMENT"

    .line 74
    invoke-virtual {p1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getCommentList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 73
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 75
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 77
    return-void
.end method

*/}
