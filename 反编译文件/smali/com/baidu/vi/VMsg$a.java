package com.baidu.vi; class VMsg$a {/*

.class Lcom/baidu/vi/VMsg$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/vi/VMsg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    iget v2, p1, Landroid/os/Message;->arg2:I

    #v2=(Integer);
    invoke-static {v0, v1, v2}, Lcom/baidu/vi/VMsg;->a(III)V

    return-void
.end method

*/}
