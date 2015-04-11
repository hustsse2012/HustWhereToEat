package com.universer.HustWhereToEat.activity; class LoginActivity$4 {/*

.class Lcom/universer/HustWhereToEat/activity/LoginActivity$4;
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
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$4;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .parameter "v"

    .prologue
    .line 54
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$4;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    #v3=(Reference);
    invoke-static {v3}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->access$0(Lcom/universer/HustWhereToEat/activity/LoginActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    .local v0, factorOneStr:Ljava/lang/String;
    #v0=(Reference);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$4;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    invoke-static {v3}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->access$1(Lcom/universer/HustWhereToEat/activity/LoginActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 56
    .local v1, factorTwoStr:Ljava/lang/String;
    #v1=(Reference);
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "cat"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 57
    const-string v3, "universer"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 58
    const-string v3, "123456"

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 60
    new-instance v2, Landroid/content/Intent;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 61
    .local v2, intent:Landroid/content/Intent;
    #v2=(Reference);
    const-string v3, "one"

    #v3=(Reference);
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    const-string v3, "two"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$4;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    const-class v4, Lcom/universer/HustWhereToEat/activity/SlidingActivity;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 64
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity$4;->this$0:Lcom/universer/HustWhereToEat/activity/LoginActivity;

    invoke-virtual {v3, v2}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->startActivity(Landroid/content/Intent;)V

    .line 66
    .end local v2           #intent:Landroid/content/Intent;
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

*/}
