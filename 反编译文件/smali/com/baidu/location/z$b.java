package com.baidu.location; class z$b {/*

.class public Lcom/baidu/location/z$b;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/z;


# direct methods
.method public constructor <init>(Lcom/baidu/location/z;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/z$b;->a:Lcom/baidu/location/z;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    sget-boolean v0, Lcom/baidu/location/f;->isServing:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);
    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lcom/baidu/location/z$b;->a:Lcom/baidu/location/z;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/location/z;->byte(Landroid/os/Message;)V

    goto :goto_0

    :sswitch_1
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/z$b;->a:Lcom/baidu/location/z;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/z;->ab()V

    goto :goto_0

    #v0=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_0
        0x3e -> :sswitch_1
        0x3f -> :sswitch_1
    .end sparse-switch
.end method

*/}
