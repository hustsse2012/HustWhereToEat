package com.universer.HustWhereToEat.activity; class SlidingActivity$1 {/*

.class Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;
.super Ljava/lang/Object;
.source "SlidingActivity.java"

# interfaces
.implements Lcom/universer/HustWhereToEat/fragment/AllFragment$MyPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/activity/SlidingActivity;->initListener(Lcom/universer/HustWhereToEat/fragment/AllFragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/activity/SlidingActivity;

.field private final synthetic val$fragment:Lcom/universer/HustWhereToEat/fragment/AllFragment;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/activity/SlidingActivity;Lcom/universer/HustWhereToEat/fragment/AllFragment;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SlidingActivity;

    iput-object p2, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;->val$fragment:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 5
    .parameter "position"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, 0x0

    .line 91
    #v3=(Null);
    const-string v0, "SlidingActivity"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    const-string v2, "onPageSelected : "

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;->val$fragment:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->isFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SlidingActivity;

    #v0=(Reference);
    iget-object v0, v0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    invoke-virtual {v0, v4, v3}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    .line 99
    :goto_0
    return-void

    .line 94
    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;->val$fragment:Lcom/universer/HustWhereToEat/fragment/AllFragment;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/universer/HustWhereToEat/fragment/AllFragment;->isEnd()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SlidingActivity;

    #v0=(Reference);
    iget-object v0, v0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    invoke-virtual {v0, v3, v4}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    goto :goto_0

    .line 97
    :cond_1
    #v0=(Boolean);
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SlidingActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SlidingActivity;

    #v0=(Reference);
    iget-object v0, v0, Lcom/universer/HustWhereToEat/activity/SlidingActivity;->mSlidingMenu:Lcom/universer/HustWhereToEat/view/SlidingMenu;

    invoke-virtual {v0, v3, v3}, Lcom/universer/HustWhereToEat/view/SlidingMenu;->setCanSliding(ZZ)V

    goto :goto_0
.end method

*/}
