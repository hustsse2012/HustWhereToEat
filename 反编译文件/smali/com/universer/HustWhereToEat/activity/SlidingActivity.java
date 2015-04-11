package com.universer.HustWhereToEat.activity; class SlidingActivity {/*

.class public Lcom/universer/HustWhereToEat/activity/SlidingActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SlidingActivity.java"

# interfaces
.implements Lcom/universer/HustWhereToEat/util/IChangeFragment;


# static fields
.field private static final TAG:Ljava/lang/String; = "SlidingActivity"


# instance fields
.field allFragment:Lcom/universer/HustWhereToEat/fragment/AllFragment;

.field leftFragment:Lcom/universer/HustWhereToEat/fragment/LeftFragment;

.field mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

.field rightFragment:Lcom/universer/HustWhereToEat/fragment/RightFragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private init()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 61
    #v4=(Null);
    const v1, 0x7f050030

    #v1=(Integer);
    invoke-virtual {p0, v1}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/universer/HustWhereToEat/view/SlidingMenu;

    iput-object v1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    .line 63
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 64
    #v2=(Reference);
    const v3, 0x7f030009

    .line 63
    #v3=(Integer);
    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setLeftView(Landroid/view/View;)V

    .line 65
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 66
    const v3, 0x7f030015

    .line 65
    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setRightView(Landroid/view/View;)V

    .line 67
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 68
    const v3, 0x7f030003

    .line 67
    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCenterView(Landroid/view/View;)V

    .line 70
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 71
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 73
    .local v0, t:Landroid/support/v4/app/FragmentTransaction;
    #v0=(Reference);
    new-instance v1, Lcom/universer/HustWhereToEat/fragment/LeftFragment;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;-><init>(Landroid/support/v4/app/FragmentManager;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->leftFragment:Lcom/universer/HustWhereToEat/fragment/LeftFragment;

    .line 74
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->leftFragment:Lcom/universer/HustWhereToEat/fragment/LeftFragment;

    invoke-virtual {v1, p0}, Lcom/universer/HustWhereToEat/fragment/LeftFragment;->setChangeFragmentListener(Lcom/universer/HustWhereToEat/util/IChangeFragment;)V

    .line 76
    const v1, 0x7f050025

    #v1=(Integer);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->leftFragment:Lcom/universer/HustWhereToEat/fragment/LeftFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 77
    new-instance v1, Lcom/universer/HustWhereToEat/fragment/RightFragment;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/universer/HustWhereToEat/fragment/RightFragment;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->rightFragment:Lcom/universer/HustWhereToEat/fragment/RightFragment;

    .line 80
    new-instance v1, Lcom/universer/HustWhereToEat/fragment/AllFragment;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/universer/HustWhereToEat/fragment/AllFragment;-><init>(Landroid/app/Activity;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->allFragment:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    .line 82
    const v1, 0x7f050019

    #v1=(Integer);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->allFragment:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 83
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 85
    return-void
.end method

.method private initListener(Lcom/universer/HustWhereToEat/fragment/AllFragment;)V
    .locals 1
    .parameter "fragment"

    .prologue
    .line 88
    new-instance v0, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;-><init>(Lcom/universer/HustWhereToEat/activity/SlidingActivity;Lcom/universer/HustWhereToEat/fragment/AllFragment;)V

    #v0=(Reference);
    invoke-virtual {p1, v0}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->setMyPageChangeListener(Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;)V

    .line 101
    return-void
.end method


# virtual methods
.method public changeFragment(I)V
    .locals 3
    .parameter "position"

    .prologue
    .line 113
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 114
    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 115
    .local v1, t:Landroid/support/v4/app/FragmentTransaction;
    #v1=(Reference);
    const/4 v0, 0x0

    .line 116
    .local v0, fragment:Landroid/support/v4/app/Fragment;
    #v0=(Null);
    packed-switch p1, :pswitch_data_0

    .line 142
    :goto_0
    #v0=(Reference);
    const v2, 0x7f050019

    #v2=(Integer);
    invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 143
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 144
    return-void

    .line 118
    :pswitch_0
    #v0=(Null);v2=(Reference);
    new-instance v0, Lcom/universer/HustWhereToEat/fragment/AllFragment;

    .end local v0           #fragment:Landroid/support/v4/app/Fragment;
    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/universer/HustWhereToEat/fragment/AllFragment;-><init>(Landroid/app/Activity;)V

    .restart local v0       #fragment:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    move-object v2, v0

    .line 119
    check-cast v2, Lcom/universer/HustWhereToEat/fragment/AllFragment;

    invoke-direct {p0, v2}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->initListener(Lcom/universer/HustWhereToEat/fragment/AllFragment;)V

    goto :goto_0

    .line 122
    :pswitch_1
    #v0=(Null);
    new-instance v0, Lcom/universer/HustWhereToEat/fragment/RouteFragment;

    .end local v0           #fragment:Landroid/support/v4/app/Fragment;
    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/universer/HustWhereToEat/fragment/RouteFragment;-><init>()V

    .line 123
    .restart local v0       #fragment:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    goto :goto_0

    .line 125
    :pswitch_2
    #v0=(Null);
    new-instance v0, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;

    .end local v0           #fragment:Landroid/support/v4/app/Fragment;
    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/universer/HustWhereToEat/fragment/MyLoveFragment;-><init>()V

    .line 126
    .restart local v0       #fragment:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    goto :goto_0

    .line 129
    :pswitch_3
    #v0=(Null);
    new-instance v0, Lcom/universer/HustWhereToEat/fragment/MyOrdersFragment;

    .end local v0           #fragment:Landroid/support/v4/app/Fragment;
    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/universer/HustWhereToEat/fragment/MyOrdersFragment;-><init>()V

    .line 130
    .restart local v0       #fragment:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    goto :goto_0

    .line 132
    :pswitch_4
    #v0=(Null);
    new-instance v0, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;

    .end local v0           #fragment:Landroid/support/v4/app/Fragment;
    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/universer/HustWhereToEat/fragment/SurroundFragment;-><init>()V

    .line 133
    .restart local v0       #fragment:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    goto :goto_0

    .line 135
    :pswitch_5
    #v0=(Null);
    new-instance v0, Lcom/universer/HustWhereToEat/fragment/SettingFragment;

    .end local v0           #fragment:Landroid/support/v4/app/Fragment;
    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/universer/HustWhereToEat/fragment/SettingFragment;-><init>()V

    .line 137
    .restart local v0       #fragment:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    goto :goto_0

    .line 116
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .parameter "arg0"

    .prologue
    .line 51
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 52
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->requestWindowFeature(I)Z

    .line 53
    const v0, 0x7f03000d

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->setContentView(I)V

    .line 54
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->init()V

    .line 55
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->allFragment:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->initListener(Lcom/universer/HustWhereToEat/fragment/AllFragment;)V

    .line 57
    return-void
.end method

.method public showLeft()V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->showLeftView()V

    .line 105
    return-void
.end method

.method public showRight()V
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->showRightView()V

    .line 109
    return-void
.end method

*/}
