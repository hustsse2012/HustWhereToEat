package com.universer.HustWhereToEat.fragment; class SurroundFragment {/*

.class public Lcom/universer/HustWhereToEat/fragment/SurroundFragment;
.super Landroid/support/v4/app/Fragment;
.source "SurroundFragment.java"


# instance fields
.field private mTopBackView:Landroid/widget/ImageView;

.field private mTopTitleView:Landroid/widget/TextView;

.field private showLeft:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .parameter "inflater"
    .parameter "container"
    .parameter "savedInstanceState"

    .prologue
    .line 25
    const v1, 0x7f03000e

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 26
    .local v0, view:Landroid/view/View;
    #v0=(Reference);
    const v1, 0x7f05001e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->showLeft:Landroid/view/View;

    .line 28
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->showLeft:Landroid/view/View;

    const v2, 0x7f050020

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->mTopTitleView:Landroid/widget/TextView;

    .line 29
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->mTopTitleView:Landroid/widget/TextView;

    const v2, 0x7f07000c

    invoke-virtual {p0, v2}, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->showLeft:Landroid/view/View;

    const v2, 0x7f05001f

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->mTopBackView:Landroid/widget/ImageView;

    .line 33
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 34
    new-instance v2, Landroid/content/Intent;

    #v2=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    #v3=(Reference);
    const-class v4, Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v4=(Reference);
    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 33
    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 35
    return-object v0
.end method

*/}
