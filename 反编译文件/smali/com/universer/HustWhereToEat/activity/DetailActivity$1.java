package com.universer.HustWhereToEat.activity; class DetailActivity$1 {/*

.class Lcom/universer/HustWhereToEat/activity/DetailActivity$1;
.super Ljava/lang/Object;
.source "DetailActivity.java"

# interfaces
.implements Landroid/widget/ListAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/activity/DetailActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/activity/DetailActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 133
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;

    #v0=(Reference);
    iget-object v0, v0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->comments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter "position"

    .prologue
    .line 115
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;

    #v0=(Reference);
    iget-object v0, v0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->comments:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter "position"

    .prologue
    .line 109
    int-to-long v0, p1

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1
    .parameter "position"

    .prologue
    .line 103
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .parameter "position"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    .line 93
    new-instance p2, Landroid/widget/TextView;

    .end local p2
    #p2=(UninitRef);
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;

    #v0=(Reference);
    invoke-direct {p2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .restart local p2
    #p2=(Reference);
    move-object v0, p2

    .line 95
    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0x28

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    move-object v0, p2

    .line 96
    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;

    #v1=(Reference);
    iget-object v1, v1, Lcom/universer/HustWhereToEat/activity/DetailActivity;->comments:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;

    #v0=(Reference);
    iget-object v0, v0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->comments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isEnabled(I)Z
    .locals 1
    .parameter "position"

    .prologue
    .line 127
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 0
    .parameter "observer"

    .prologue
    .line 70
    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 0
    .parameter "observer"

    .prologue
    .line 64
    return-void
.end method

*/}
