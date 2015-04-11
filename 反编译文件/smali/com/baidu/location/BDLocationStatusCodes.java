package com.baidu.location; class BDLocationStatusCodes {/*

.class public final Lcom/baidu/location/BDLocationStatusCodes;
.super Ljava/lang/Object;


# static fields
.field public static final ERROR:I = 0x1

.field public static final GEOFENCE_NOT_AVAIABLE:I = 0x3e8

.field public static final GEOFENCE_SERVICE_NO_ALIVIABLE:I = 0x3ea

.field public static final GEOFENCE_TOO_MANY_GEOFENCES:I = 0x3e9

.field public static final SUCCESS:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getStatusCode(I)I
    .locals 2

    const/4 v0, 0x1

    #v0=(One);
    if-ltz p0, :cond_0

    if-le p0, v0, :cond_1

    :cond_0
    const/16 v1, 0x3e8

    #v1=(PosShort);
    if-gt v1, p0, :cond_2

    const/16 v1, 0x3ea

    if-gt p0, v1, :cond_2

    :cond_1
    :goto_0
    #v1=(Conflicted);
    return p0

    :cond_2
    #v1=(PosShort);
    move p0, v0

    #p0=(One);
    goto :goto_0
.end method

*/}
