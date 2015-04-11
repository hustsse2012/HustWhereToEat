package com.baidu.location; class af {/*

.class Lcom/baidu/location/af;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/os/HandlerThread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/af;->a:Landroid/os/HandlerThread;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static a()Landroid/os/HandlerThread;
    .locals 3

    sget-object v0, Lcom/baidu/location/af;->a:Landroid/os/HandlerThread;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Landroid/os/HandlerThread;

    #v0=(UninitRef);
    const-string v1, "ServiceStartArguments"

    #v1=(Reference);
    const/16 v2, 0xa

    #v2=(PosByte);
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/af;->a:Landroid/os/HandlerThread;

    sget-object v0, Lcom/baidu/location/af;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    sget-object v0, Lcom/baidu/location/af;->a:Landroid/os/HandlerThread;

    return-object v0
.end method

*/}
