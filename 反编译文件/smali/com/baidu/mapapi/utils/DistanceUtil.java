package com.baidu.mapapi.utils; class DistanceUtil {/*

.class public Lcom/baidu/mapapi/utils/DistanceUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getDistance(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;)D
    .locals 4

    invoke-static {p0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    invoke-static {p1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);
    return-wide v0

    :cond_1
    #v0=(Reference);v1=(Reference);v2=(Uninit);v3=(Uninit);
    new-instance v2, Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(UninitRef);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-direct {v2, v3, v0}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v2=(Reference);
    new-instance v0, Lcom/baidu/platform/comapi/basestruct/c;

    #v0=(UninitRef);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v3

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    invoke-direct {v0, v3, v1}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v0=(Reference);
    invoke-static {v2, v0}, Lcom/baidu/platform/comjni/tools/a;->a(Lcom/baidu/platform/comapi/basestruct/c;Lcom/baidu/platform/comapi/basestruct/c;)D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    goto :goto_0
.end method

*/}
