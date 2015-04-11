package com.universer.HustWhereToEat.activity; class LoginActivity$3 {/*

.class Lcom/universer/HustWhereToEat/activity/LoginActivity$3;
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
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$3;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .parameter "v"

    .prologue
    .line 46
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$3;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    #v0=(Reference);
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$3;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    #v2=(Reference);
    const-class v3, Lcom/universer/HustWhereToEat/activity/SlidingActivity;

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->startActivity(Landroid/content/Intent;)V

    .line 47
    return-void
.end method

*/}
