package com.universer.HustWhereToEat.fragment; class LeftFragment {/*

.class public Lcom/universer/HustWhereToEat/fragment/LeftFragment;
.super Landroid/support/v4/app/Fragment;
.source "LeftFragment.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "LeftFragment"


# instance fields
.field private iChangeFragment:Lcom/universer/HustWhereToEat/util/IChangeFragment;

.field private leftAdapter:Lcom/universer/HustWhereToEat/adapter/LeftAdapter;

.field private leftEngTxtList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private leftTxtList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mFragmentManager:Landroid/support/v4/app/FragmentManager;

.field private mListView:Landroid/widget/ListView;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;)V
    .locals 1
    .parameter "fragmentManager"

    .prologue
    .line 47
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 43
    #p0=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftTxtList:Ljava/util/List;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftEngTxtList:Ljava/util/List;

    .line 48
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    .line 49
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0
    .parameter "savedInstanceState"

    .prologue
    .line 80
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 81
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .parameter "inflater"
    .parameter "container"
    .parameter "savedInstanceState"

    .prologue
    .line 54
    const v1, 0x7f030008

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 55
    .local v0, view:Landroid/view/View;
    #v0=(Reference);
    const v1, 0x7f050024

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->mListView:Landroid/widget/ListView;

    .line 57
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftTxtList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    #v2=(Reference);
    const v3, 0x7f070008

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftTxtList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070009

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftTxtList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07000a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftTxtList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07000b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftTxtList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07000c

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftTxtList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07000d

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftEngTxtList:Ljava/util/List;

    const-string v2, "ALL"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftEngTxtList:Ljava/util/List;

    const-string v2, "ROUTE"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftEngTxtList:Ljava/util/List;

    const-string v2, "LOVE"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftEngTxtList:Ljava/util/List;

    const-string v2, "ORDER"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftEngTxtList:Ljava/util/List;

    const-string v2, "ARROUND"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftEngTxtList:Ljava/util/List;

    const-string v2, "SET"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    new-instance v1, Lcom/universer/HustWhereToEat/adapter/LeftAdapter;

    #v1=(UninitRef);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftTxtList:Ljava/util/List;

    iget-object v3, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftEngTxtList:Ljava/util/List;

    .line 70
    #v3=(Reference);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {v1, v2, v3, v4}, Lcom/universer/HustWhereToEat/adapter/LeftAdapter;-><init>(Ljava/util/List;Ljava/util/List;Landroid/content/Context;)V

    .line 69
    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftAdapter:Lcom/universer/HustWhereToEat/adapter/LeftAdapter;

    .line 72
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->mListView:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftAdapter:Lcom/universer/HustWhereToEat/adapter/LeftAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 73
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->mListView:Landroid/widget/ListView;

    invoke-virtual {v1, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 74
    iget-object v1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftAdapter:Lcom/universer/HustWhereToEat/adapter/LeftAdapter;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Lcom/universer/HustWhereToEat/adapter/LeftAdapter;->setSelectPosition(I)V

    .line 76
    return-object v0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
    .parameter
    .parameter "view"
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
    .line 170
    .local p1, parent:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->iChangeFragment:Lcom/universer/HustWhereToEat/util/IChangeFragment;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->iChangeFragment:Lcom/universer/HustWhereToEat/util/IChangeFragment;

    invoke-interface {v0, p3}, Lcom/universer/HustWhereToEat/util/IChangeFragment;->changeFragment(I)V

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftAdapter:Lcom/universer/HustWhereToEat/adapter/LeftAdapter;

    invoke-virtual {v0, p3}, Lcom/universer/HustWhereToEat/adapter/LeftAdapter;->setSelectPosition(I)V

    .line 175
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->leftAdapter:Lcom/universer/HustWhereToEat/adapter/LeftAdapter;

    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/adapter/LeftAdapter;->notifyDataSetChanged()V

    .line 182
    return-void
.end method

.method public setChangeFragmentListener(Lcom/universer/HustWhereToEat/util/IChangeFragment;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 152
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->iChangeFragment:Lcom/universer/HustWhereToEat/util/IChangeFragment;

    .line 153
    return-void
.end method

*/}
