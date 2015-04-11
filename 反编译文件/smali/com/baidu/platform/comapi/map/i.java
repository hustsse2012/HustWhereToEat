package com.baidu.platform.comapi.map; class i {/*

.class Lcom/baidu/platform/comapi/map/i;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/baidu/platform/comapi/map/h;


# direct methods
.method constructor <init>(Lcom/baidu/platform/comapi/map/h;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/i;->a:Lcom/baidu/platform/comapi/map/h;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    invoke-static {}, Lcom/baidu/platform/comapi/map/h;->e()Lcom/baidu/platform/comapi/map/m;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/platform/comapi/map/h;->e()Lcom/baidu/platform/comapi/map/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/m;->a(Landroid/os/Message;)V

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    :cond_0
    return-void
.end method

*/}
