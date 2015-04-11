package com.universer.HustWhereToEat.adapter; class ListViewPagerAdapter$3 {/*

.class Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$3;
.super Ljava/lang/Object;
.source "ListViewPagerAdapter.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$3;->this$0:Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .parameter
    .parameter "arg1"
    .parameter "position"
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
    .line 162
    .local p1, arg0:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    const-wide/16 v2, -0x1

    #v2=(LongLo);v3=(LongHi);
    cmp-long v2, p4, v2

    #v2=(Byte);
    if-gez v2, :cond_0

    .line 169
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 165
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Byte);
    long-to-int v0, p4

    .line 166
    .local v0, realPosition:I
    #v0=(Integer);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$3;->this$0:Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;

    #v2=(Reference);
    invoke-static {v2}, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->access$0(Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/universer/HustWhereToEat/model/Restaurant;

    .line 167
    .local v1, tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;
    iget-object v2, p0, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter$3;->this$0:Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;

    invoke-static {v2, v1}, Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;->access$1(Lcom/universer/HustWhereToEat/adapter/ListViewPagerAdapter;Lcom/universer/HustWhereToEat/model/Restaurant;)V

    goto :goto_0
.end method

*/}
