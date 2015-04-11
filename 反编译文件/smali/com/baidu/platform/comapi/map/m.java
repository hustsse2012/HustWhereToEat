package com.baidu.platform.comapi.map; class m {/*

.class Lcom/baidu/platform/comapi/map/m;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/baidu/platform/comapi/map/l;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/m;->a:Lcom/baidu/platform/comapi/map/l;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method a(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    const v1, 0xff09

    #v1=(Char);
    if-eq v0, v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Integer);v1=(Char);v2=(Uninit);
    iget v0, p1, Landroid/os/Message;->arg1:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/m;->a:Lcom/baidu/platform/comapi/map/l;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/m;->a:Lcom/baidu/platform/comapi/map/l;

    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    iget v2, p1, Landroid/os/Message;->arg2:I

    #v2=(Integer);
    invoke-interface {v0, v1, v2}, Lcom/baidu/platform/comapi/map/l;->a(II)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x0 -> :sswitch_0
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x3 -> :sswitch_0
        0x4 -> :sswitch_0
        0x5 -> :sswitch_0
        0x6 -> :sswitch_0
        0x7 -> :sswitch_0
        0x8 -> :sswitch_0
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xc -> :sswitch_0
        0x65 -> :sswitch_0
        0x66 -> :sswitch_0
    .end sparse-switch
.end method

.method a(Lcom/baidu/platform/comapi/map/l;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/m;->a:Lcom/baidu/platform/comapi/map/l;

    return-void
.end method

.method b(Lcom/baidu/platform/comapi/map/l;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/m;->a:Lcom/baidu/platform/comapi/map/l;

    return-void
.end method

*/}
