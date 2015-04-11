package com.baidu.location; class s$c {/*

.class Lcom/baidu/location/s$c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/s;

.field private if:J


# direct methods
.method private constructor <init>(Lcom/baidu/location/s;)V
    .locals 2

    iput-object p1, p0, Lcom/baidu/location/s$c;->a:Lcom/baidu/location/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/s$c;->if:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/baidu/location/s;Lcom/baidu/location/s$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/s$c;-><init>(Lcom/baidu/location/s;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/location/s$c;->a:Lcom/baidu/location/s;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/s;->new(Lcom/baidu/location/s;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "gps"

    #v1=(Reference);
    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/s$c;->a:Lcom/baidu/location/s;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    invoke-static {v0, v1, v2}, Lcom/baidu/location/s;->for(Lcom/baidu/location/s;J)J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/s$c;->if:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p1, v0}, Lcom/baidu/location/l;->if(Landroid/location/Location;Z)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    iput-wide v0, p0, Lcom/baidu/location/s$c;->if:J

    iget-object v0, p0, Lcom/baidu/location/s$c;->a:Lcom/baidu/location/s;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/s;->int(Lcom/baidu/location/s;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    #v1=(PosByte);
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/s$c;->a:Lcom/baidu/location/s;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/location/s;->int(Lcom/baidu/location/s;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

*/}
