package com.universer.HustWhereToEat.activity; class DetailActivity$2 {/*

.class Lcom/universer/HustWhereToEat/activity/DetailActivity$2;
.super Ljava/lang/Object;
.source "DetailActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

.field private final synthetic val$phone:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/activity/DetailActivity;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$2;->this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;

    iput-object p2, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$2;->val$phone:Ljava/lang/String;

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter "v"

    .prologue
    .line 142
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "android.intent.action.CALL"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const-string v3, "tel:"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    #v2=(Reference);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$2;->val$phone:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 142
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 144
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity$2;->this$0:Lcom/universer/HustWhereToEat/activity/DetailActivity;

    invoke-virtual {v1, v0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 145
    return-void
.end method

*/}
