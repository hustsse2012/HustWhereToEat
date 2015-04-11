package com.universer.HustWhereToEat.fragment; class MyLoveFragment$2 {/*

.class Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$2;
.super Ljava/lang/Object;
.source "MyLoveFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->onActivityCreated(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$2;->this$0:Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .parameter "v"

    .prologue
    .line 128
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$2;->this$0:Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;

    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->showLeft()V

    .line 129
    return-void
.end method

*/}
