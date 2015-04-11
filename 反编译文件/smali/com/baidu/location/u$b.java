package com.baidu.location; class u$b {/*

.class public Lcom/baidu/location/u$b;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/u;


# direct methods
.method public constructor <init>(Lcom/baidu/location/u;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/u$b;->a:Lcom/baidu/location/u;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/u$b;->a:Lcom/baidu/location/u;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/u;->do(Lcom/baidu/location/u;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/u$b;->a:Lcom/baidu/location/u;

    invoke-static {v0}, Lcom/baidu/location/u;->do(Lcom/baidu/location/u;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);
    iget-object v0, p0, Lcom/baidu/location/u$b;->a:Lcom/baidu/location/u;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/u;->if(Lcom/baidu/location/u;)Lcom/baidu/location/LocationClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/LocationClient;->requestNotifyLocation()V

    goto :goto_0
.end method

*/}
