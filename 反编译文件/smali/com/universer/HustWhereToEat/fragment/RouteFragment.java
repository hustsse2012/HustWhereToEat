package com.universer.HustWhereToEat.fragment; class RouteFragment {/*

.class public Lcom/universer/HustWhereToEat/fragment/RouteFragment;
.super Landroid/support/v4/app/Fragment;
.source "RouteFragment.java"


# instance fields
.field private mTopBackView:Landroid/widget/ImageView;

.field private mTopTitleView:Landroid/widget/TextView;

.field private showLeft:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .parameter "savedInstanceState"

    .prologue
    .line 35
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 37
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->showLeft:Landroid/view/View;

    #v0=(Reference);
    new-instance v1, Lcom/universer/HustWhereToEat/fragment/RouteFragment$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/universer/HustWhereToEat/fragment/RouteFragment$1;-><init>(Lcom/universer/HustWhereToEat/fragment/RouteFragment;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .parameter "inflater"
    .parameter "container"
    .parameter "savedInstanceState"

    .prologue
    .line 24
    const v1, 0x7f03000e

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 25
    .local v0, view:Landroid/view/View;
    #v0=(Reference);
    const v1, 0x7f05001e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->showLeft:Landroid/view/View;

    .line 26
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->showLeft:Landroid/view/View;

    const v2, 0x7f050020

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->mTopTitleView:Landroid/widget/TextView;

    .line 27
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->mTopTitleView:Landroid/widget/TextView;

    const v2, 0x7f070009

    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->showLeft:Landroid/view/View;

    const v2, 0x7f05001f

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->mTopBackView:Landroid/widget/ImageView;

    .line 30
    return-object v0
.end method

*/}
