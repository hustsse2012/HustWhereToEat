package com.universer.HustWhereToEat.activity; class LoginActivity$2 {/*

.class Lcom/universer/HustWhereToEat/activity/LoginActivity$2;
.super Ljava/lang/Object;
.source "LoginActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/universer/HustWhereToEat/activity/LoginActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/activity/LoginActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$2;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter "v"

    .prologue
    .line 38
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$2;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    #v0=(Reference);
    const-string v1, "\u8be5\u529f\u80fd\u5373\u5c06\u5f00\u653e\u54e6"

    .line 39
    #v1=(Reference);
    const/4 v2, 0x0

    .line 38
    #v2=(Null);
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 40
    return-void
.end method

*/}
