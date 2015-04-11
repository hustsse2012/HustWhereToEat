package com.universer.HustWhereToEat.fragment; class MyLoveFragment$1 {/*

.class Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$1;
.super Ljava/lang/Object;
.source "MyLoveFragment.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$1;->this$0:Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .parameter
    .parameter "arg1"
    .parameter "arg2"
    .parameter "id"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 55
    .local p1, arg0:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    const-wide/16 v2, -0x1

    #v2=(LongLo);v3=(LongHi);
    cmp-long v2, p4, v2

    #v2=(Byte);
    if-gez v2, :cond_0

    .line 62
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 58
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Byte);
    long-to-int v0, p4

    .line 59
    .local v0, realPosition:I
    #v0=(Integer);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$1;->this$0:Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;

    #v2=(Reference);
    invoke-static {v2}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->access$0(Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/universer/HustWhereToEat/model/Restaurant;

    .line 60
    .local v1, tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;
    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment$1;->this$0:Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;

    invoke-virtual {v2, v1}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;->startActivity(Lcom/universer/HustWhereToEat/model/Restaurant;)V

    goto :goto_0
.end method

*/}
