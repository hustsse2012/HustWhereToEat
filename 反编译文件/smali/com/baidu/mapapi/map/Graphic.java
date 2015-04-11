package com.baidu.mapapi.map; class Graphic {/*

.class public Lcom/baidu/mapapi/map/Graphic;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/baidu/mapapi/map/Geometry;

.field private b:Lcom/baidu/mapapi/map/Symbol;

.field private c:J


# direct methods
.method public constructor <init>(Lcom/baidu/mapapi/map/Geometry;Lcom/baidu/mapapi/map/Symbol;)V
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/Graphic;->a:Lcom/baidu/mapapi/map/Geometry;

    iput-object v0, p0, Lcom/baidu/mapapi/map/Graphic;->b:Lcom/baidu/mapapi/map/Symbol;

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/mapapi/map/Graphic;->c:J

    iput-object p1, p0, Lcom/baidu/mapapi/map/Graphic;->a:Lcom/baidu/mapapi/map/Geometry;

    iput-object p2, p0, Lcom/baidu/mapapi/map/Graphic;->b:Lcom/baidu/mapapi/map/Symbol;

    return-void
.end method


# virtual methods
.method a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/baidu/mapapi/map/Graphic;->c:J

    return-void
.end method

.method public getGeometry()Lcom/baidu/mapapi/map/Geometry;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Graphic;->a:Lcom/baidu/mapapi/map/Geometry;

    #v0=(Reference);
    return-object v0
.end method

.method public getID()J
    .locals 2

    iget-wide v0, p0, Lcom/baidu/mapapi/map/Graphic;->c:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getSymbol()Lcom/baidu/mapapi/map/Symbol;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Graphic;->b:Lcom/baidu/mapapi/map/Symbol;

    #v0=(Reference);
    return-object v0
.end method

*/}
