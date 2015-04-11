package com.baidu.mapapi.search; class MKLine {/*

.class public Lcom/baidu/mapapi/search/MKLine;
.super Ljava/lang/Object;


# static fields
.field public static final LINE_TYPE_BUS:I = 0x0

.field public static final LINE_TYPE_SUBWAY:I = 0x1


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Lcom/baidu/mapapi/search/MKPoiInfo;

.field private l:Lcom/baidu/mapapi/search/MKPoiInfo;

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method a(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKLine;->d:I

    return-void
.end method

.method a(Lcom/baidu/mapapi/search/MKPoiInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKLine;->k:Lcom/baidu/mapapi/search/MKPoiInfo;

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x0

    #v1=(Null);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    #v4=(Reference);
    move v0, v1

    #v0=(Null);
    move v2, v1

    :goto_0
    #v0=(Integer);v2=(Boolean);v5=(Conflicted);v6=(Conflicted);
    array-length v5, v4

    #v5=(Integer);
    if-ge v0, v5, :cond_3

    aget-char v5, v4, v0

    #v5=(Char);
    const/16 v6, 0x3c

    #v6=(PosByte);
    if-ne v5, v6, :cond_1

    const/4 v2, 0x1

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    aget-char v5, v4, v0

    const/16 v6, 0x3e

    if-ne v5, v6, :cond_2

    move v2, v1

    #v2=(Null);
    goto :goto_1

    :cond_2
    #v2=(Boolean);
    if-nez v2, :cond_0

    aget-char v5, v4, v0

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    #v5=(Integer);v6=(Conflicted);
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/search/MKLine;->j:Ljava/lang/String;

    return-void
.end method

.method a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKLine;->m:Ljava/util/ArrayList;

    return-void
.end method

.method b(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKLine;->e:I

    return-void
.end method

.method b(Lcom/baidu/mapapi/search/MKPoiInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKLine;->l:Lcom/baidu/mapapi/search/MKPoiInfo;

    return-void
.end method

.method b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKLine;->h:Ljava/lang/String;

    return-void
.end method

.method c(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKLine;->f:I

    return-void
.end method

.method d(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKLine;->g:I

    return-void
.end method

.method public getDistance()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKLine;->e:I

    #v0=(Integer);
    return v0
.end method

.method public getGetOffStop()Lcom/baidu/mapapi/search/MKPoiInfo;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKLine;->l:Lcom/baidu/mapapi/search/MKPoiInfo;

    #v0=(Reference);
    return-object v0
.end method

.method public getGetOnStop()Lcom/baidu/mapapi/search/MKPoiInfo;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKLine;->k:Lcom/baidu/mapapi/search/MKPoiInfo;

    #v0=(Reference);
    return-object v0
.end method

.method public getNumViaStops()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKLine;->d:I

    #v0=(Integer);
    return v0
.end method

.method public getPoints()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKLine;->m:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method public getTime()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKLine;->f:I

    #v0=(Integer);
    return v0
.end method

.method public getTip()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKLine;->j:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKLine;->h:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getTotalPrice()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKLine;->b:I

    #v0=(Integer);
    div-int/lit8 v0, v0, 0x64

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKLine;->g:I

    #v0=(Integer);
    return v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKLine;->i:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getZonePrice()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKLine;->c:I

    #v0=(Integer);
    div-int/lit8 v0, v0, 0x64

    return v0
.end method

*/}
