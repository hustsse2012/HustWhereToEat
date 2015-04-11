package com.universer.HustWhereToEat.fragment; class MircoFragment {/*

.class public Lcom/universer/HustWhereToEat/fragment/MircoFragment;
.super Landroid/support/v4/app/Fragment;
.source "MircoFragment.java"


# instance fields
.field private mTopBackView:Landroid/widget/ImageView;

.field private mTopTitleView:Landroid/widget/TextView;

.field private showLeft:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .parameter "inflater"
    .parameter "container"
    .parameter "savedInstanceState"

    .prologue
    .line 22
    const v1, 0x7f03000e

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 23
    .local v0, view:Landroid/view/View;
    #v0=(Reference);
    const v1, 0x7f05001e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MircoFragment;->showLeft:Landroid/view/View;

    .line 25
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MircoFragment;->showLeft:Landroid/view/View;

    const v2, 0x7f050020

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MircoFragment;->mTopTitleView:Landroid/widget/TextView;

    .line 26
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MircoFragment;->mTopTitleView:Landroid/widget/TextView;

    const v2, 0x7f07000a

    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/fragment/MircoFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MircoFragment;->showLeft:Landroid/view/View;

    const v2, 0x7f05001f

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/MircoFragment;->mTopBackView:Landroid/widget/ImageView;

    .line 29
    return-object v0
.end method

*/}
