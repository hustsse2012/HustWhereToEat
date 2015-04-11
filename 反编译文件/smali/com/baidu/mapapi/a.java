package com.baidu.mapapi; class a {/*

.class Lcom/baidu/mapapi/a;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/BMapManager;


# direct methods
.method constructor <init>(Lcom/baidu/mapapi/BMapManager;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    const/4 v3, 0x3

    #v3=(PosByte);
    const/4 v2, 0x2

    #v2=(PosByte);
    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    const/16 v1, 0x7da

    #v1=(PosShort);
    if-ne v0, v1, :cond_1

    iget v0, p1, Landroid/os/Message;->arg2:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    iget-object v0, v0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    const/16 v1, 0x12c

    invoke-interface {v0, v1}, Lcom/baidu/mapapi/MKGeneralListener;->onGetPermissionState(I)V

    :cond_0
    :goto_0
    :pswitch_1
    #v0=(Conflicted);v1=(Char);
    return-void

    :pswitch_2
    #v0=(Integer);v1=(PosShort);
    invoke-static {}, Lcom/baidu/mapapi/utils/PermissionCheck;->check()Z

    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/BMapManager;->a(Lcom/baidu/mapapi/BMapManager;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    const/4 v1, 0x1

    #v1=(One);
    invoke-static {v0, v1}, Lcom/baidu/mapapi/BMapManager;->a(Lcom/baidu/mapapi/BMapManager;Z)Z

    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    iget-object v0, v0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    invoke-interface {v0, v2}, Lcom/baidu/mapapi/MKGeneralListener;->onGetNetworkState(I)V

    goto :goto_0

    :cond_1
    #v0=(Integer);v1=(PosShort);
    iget v0, p1, Landroid/os/Message;->what:I

    const v1, 0xff09

    #v1=(Char);
    if-eq v0, v1, :cond_0

    iget v0, p1, Landroid/os/Message;->arg2:I

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    iget-object v0, v0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    invoke-interface {v0, v3}, Lcom/baidu/mapapi/MKGeneralListener;->onGetNetworkState(I)V

    :cond_2
    #v0=(Conflicted);
    iget v0, p1, Landroid/os/Message;->arg2:I

    #v0=(Integer);
    if-eq v0, v2, :cond_3

    iget v0, p1, Landroid/os/Message;->arg2:I

    const/16 v1, 0x194

    #v1=(PosShort);
    if-eq v0, v1, :cond_3

    iget v0, p1, Landroid/os/Message;->arg2:I

    const/4 v1, 0x5

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    :cond_3
    #v1=(Char);
    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/a;->a:Lcom/baidu/mapapi/BMapManager;

    iget-object v0, v0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    invoke-interface {v0, v2}, Lcom/baidu/mapapi/MKGeneralListener;->onGetNetworkState(I)V

    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

*/}
