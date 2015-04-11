package com.universer.HustWhereToEat.fragment; class AllFragment$MyAdapter {/*

.class public Lcom/universer/HustWhereToEat/fragment/AllFragment$MyAdapter;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "AllFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/universer/HustWhereToEat/fragment/AllFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyAdapter"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/fragment/AllFragment;


# direct methods
.method public constructor <init>(Lcom/universer/HustWhereToEat/fragment/AllFragment;Landroid/support/v4/app/FragmentManager;)V
    .locals 0
    .parameter
    .parameter "fm"

    .prologue
    .line 170
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment$MyAdapter;->this$0:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    .line 171
    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 172
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment$MyAdapter;->this$0:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    #v0=(Reference);
    invoke-static {v0}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->access$0(Lcom/universer/HustWhereToEat/fragment/AllFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 3
    .parameter "position"

    .prologue
    .line 182
    const/4 v0, 0x0

    .line 183
    .local v0, fragment:Landroid/support/v4/app/Fragment;
    #v0=(Null);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment$MyAdapter;->this$0:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    #v1=(Reference);
    invoke-static {v1}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->access$0(Lcom/universer/HustWhereToEat/fragment/AllFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge p1, v1, :cond_0

    .line 184
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment$MyAdapter;->this$0:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    #v1=(Reference);
    invoke-static {v1}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->access$0(Lcom/universer/HustWhereToEat/fragment/AllFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .end local v0           #fragment:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 188
    .restart local v0       #fragment:Landroid/support/v4/app/Fragment;
    :goto_0
    #v2=(Conflicted);
    return-object v0

    .line 186
    :cond_0
    #v0=(Null);v1=(Integer);v2=(Uninit);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment$MyAdapter;->this$0:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    #v1=(Reference);
    invoke-static {v1}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->access$0(Lcom/universer/HustWhereToEat/fragment/AllFragment;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .end local v0           #fragment:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/Fragment;

    .restart local v0       #fragment:Landroid/support/v4/app/Fragment;
    goto :goto_0
.end method

*/}
