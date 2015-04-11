package com.baidu.platform.comapi.map; class e {/*

.class Lcom/baidu/platform/comapi/map/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/platform/comapi/map/Projection;


# instance fields
.field private a:Lcom/baidu/platform/comapi/map/o;


# direct methods
.method public constructor <init>(Lcom/baidu/platform/comapi/map/o;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/e;->a:Lcom/baidu/platform/comapi/map/o;

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/e;->a:Lcom/baidu/platform/comapi/map/o;

    return-void
.end method


# virtual methods
.method public fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/e;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(II)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    new-instance v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(UninitRef);
    invoke-direct {v0, v2, v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v0=(Reference);
    if-eqz v1, :cond_0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v1, "geox"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->setLongitudeE6(I)V

    const-string v1, "geoy"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->setLatitudeE6(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public metersToEquatorPixels(F)F
    .locals 4

    float-to-double v0, p1

    #v0=(DoubleLo);v1=(DoubleHi);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/e;->a:Lcom/baidu/platform/comapi/map/o;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/map/o;->c()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    div-double/2addr v0, v2

    double-to-float v0, v0

    #v0=(Float);
    return v0
.end method

.method public toPixels(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p2, :cond_0

    new-instance p2, Landroid/graphics/Point;

    #p2=(UninitRef);
    invoke-direct {p2, v0, v0}, Landroid/graphics/Point;-><init>(II)V

    :cond_0
    #p2=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/e;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-object p2

    :cond_2
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->b(II)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    const-string v0, "scrx"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p2, Landroid/graphics/Point;->x:I

    const-string v0, "scry"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p2, Landroid/graphics/Point;->y:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

*/}
