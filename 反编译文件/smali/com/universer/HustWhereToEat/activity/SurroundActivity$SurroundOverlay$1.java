package com.universer.HustWhereToEat.activity; class SurroundActivity$SurroundOverlay$1 {/*

.class Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;
.super Ljava/lang/Object;
.source "SurroundActivity.java"

# interfaces
.implements Lcom/baidu/mapapi/map/PopupClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->onTap(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

.field private final synthetic val$tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;Lcom/universer/HustWhereToEat/model/Restaurant;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->this$1:Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

    iput-object p2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->val$tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;

    .line 285
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClickedPopup(I)V
    .locals 3
    .parameter "index"

    .prologue
    .line 290
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->this$1:Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

    #v1=(Reference);
    invoke-static {v1}, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->access$0(Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;)Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    move-result-object v1

    .line 291
    const-class v2, Lcom/universer/HustWhereToEat/activity/DetailActivity;

    .line 290
    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 292
    .local v0, i:Landroid/content/Intent;
    #v0=(Reference);
    const-string v1, "ADDRESS"

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->val$tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v2}, Lcom/universer/HustWhereToEat/model/Restaurant;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 293
    const-string v1, "PHONE"

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->val$tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v2}, Lcom/universer/HustWhereToEat/model/Restaurant;->getPhone()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 294
    const-string v1, "NAME"

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->val$tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v2}, Lcom/universer/HustWhereToEat/model/Restaurant;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 295
    const-string v1, "IMAGE"

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->val$tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v2}, Lcom/universer/HustWhereToEat/model/Restaurant;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 296
    const-string v2, "COMMENT"

    .line 297
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->val$tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getCommentList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 296
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 298
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;->this$1:Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

    invoke-static {v1}, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->access$0(Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;)Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->startActivity(Landroid/content/Intent;)V

    .line 299
    return-void
.end method

*/}
