package com.baidu.mapapi.map; class Geometry {/*

.class public Lcom/baidu/mapapi/map/Geometry;
.super Ljava/lang/Object;


# instance fields
.field a:I

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;"
        }
    .end annotation
.end field

.field c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/mapapi/map/Geometry;->c:I

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public setCircle(Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x4

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/Geometry;->a:I

    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p1, p2}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/Geometry;->c:I

    return-void
.end method

.method public setEnvelope(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x3

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/Geometry;->a:I

    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setPoint(Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Lcom/baidu/mapapi/map/Geometry;->a:I

    iput p2, p0, Lcom/baidu/mapapi/map/Geometry;->c:I

    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setPolyLine([Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 3

    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/Geometry;->a:I

    if-nez p1, :cond_1

    :cond_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(PosByte);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    array-length v1, p1

    #v1=(Integer);
    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v1=(Reference);
    aget-object v2, p1, v0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public setPolygon([Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 3

    const/4 v0, 0x5

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/Geometry;->a:I

    if-nez p1, :cond_1

    :cond_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(PosByte);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    array-length v1, p1

    #v1=(Integer);
    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v1=(Reference);
    aget-object v2, p1, v0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

*/}
