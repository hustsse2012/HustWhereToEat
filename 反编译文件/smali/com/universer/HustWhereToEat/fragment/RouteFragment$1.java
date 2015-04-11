package com.universer.HustWhereToEat.fragment; class RouteFragment$1 {/*

.class Lcom/universer/HustWhereToEat/fragment/RouteFragment$1;
.super Ljava/lang/Object;
.source "RouteFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/fragment/RouteFragment;->onActivityCreated(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/fragment/RouteFragment;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/fragment/RouteFragment;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment$1;->this$0:Lcom/universer/HustWhereToEat/fragment/RouteFragment;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .parameter "v"

    .prologue
    .line 41
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/RouteFragment$1;->this$0:Lcom/universer/HustWhereToEat/fragment/RouteFragment;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/fragment/RouteFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;

    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->showLeft()V

    .line 42
    return-void
.end method

*/}
