package com.baidu.mapapi.utils; class CoordinateConvert {/*

.class public Lcom/baidu/mapapi/utils/CoordinateConvert;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 6

    const/4 v0, 0x0

    #v0=(Null);
    const-wide v4, 0x3eb0c6f7a0b5ed8dL

    #v4=(LongLo);v5=(LongHi);
    if-nez p0, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    int-to-double v1, v1

    #v1=(DoubleLo);v2=(DoubleHi);
    mul-double/2addr v1, v4

    double-to-float v1, v1

    #v1=(Float);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v2

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    mul-double/2addr v2, v4

    double-to-float v2, v2

    #v2=(Float);
    invoke-static {}, Lcom/baidu/platform/comapi/a/a;->a()Lcom/baidu/platform/comapi/a/a;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3, v1, v2, p1}, Lcom/baidu/platform/comapi/a/a;->a(FFLjava/lang/String;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(UninitRef);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    invoke-direct {v0, v2, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    goto :goto_0
.end method

.method public static fromGcjToBaidu(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 1

    const-string v0, "gcj02"

    #v0=(Reference);
    invoke-static {p0, v0}, Lcom/baidu/mapapi/utils/CoordinateConvert;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    return-object v0
.end method

.method public static fromWgs84ToBaidu(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 1

    const-string v0, "wgs84"

    #v0=(Reference);
    invoke-static {p0, v0}, Lcom/baidu/mapapi/utils/CoordinateConvert;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    return-object v0
.end method

*/}
