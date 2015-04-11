package com.universer.HustWhereToEat.view; class ScrollableTabView$1 {/*

.class Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;
.super Ljava/lang/Object;
.source "ScrollableTabView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/view/ScrollableTabView;->initTabs()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

.field private final synthetic val$index:I


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/view/ScrollableTabView;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;->this$0:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    iput p2, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;->val$index:I

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter "v"

    .prologue
    .line 77
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;->this$0:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->access$0(Lcom/universer/HustWhereToEat/view/ScrollableTabView;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    #v0=(Integer);
    iget v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;->val$index:I

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    .line 78
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;->this$0:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    #v0=(Reference);
    iget v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;->val$index:I

    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->selectTab(I)V

    .line 82
    :goto_0
    #v2=(Conflicted);
    return-void

    .line 80
    :cond_0
    #v0=(Integer);v2=(Uninit);
    iget-object v0, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;->this$0:Lcom/universer/HustWhereToEat/view/ScrollableTabView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/universer/HustWhereToEat/view/ScrollableTabView;->access$0(Lcom/universer/HustWhereToEat/view/ScrollableTabView;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    iget v1, p0, Lcom/universer/HustWhereToEat/view/ScrollableTabView$1;->val$index:I

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_0
.end method

*/}
