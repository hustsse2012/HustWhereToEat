package com.baidu.mapapi.cloud; class NearbySearchInfo {/*

.class public Lcom/baidu/mapapi/cloud/NearbySearchInfo;
.super Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;


# instance fields
.field public location:Ljava/lang/String;

.field public radius:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;-><init>()V

    #p0=(Reference);
    const-string v0, "http://api.map.baidu.com/geosearch/v2/nearby"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/NearbySearchInfo;->a:Ljava/lang/String;

    const/16 v0, 0x3e8

    #v0=(PosShort);
    iput v0, p0, Lcom/baidu/mapapi/cloud/NearbySearchInfo;->radius:I

    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-super {p0}, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->a()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_1

    invoke-super {p0}, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/NearbySearchInfo;->location:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/NearbySearchInfo;->location:Ljava/lang/String;

    const-string v3, ""

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "location"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/NearbySearchInfo;->location:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/baidu/mapapi/cloud/NearbySearchInfo;->radius:I

    #v0=(Integer);
    if-ltz v0, :cond_0

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "radius"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/baidu/mapapi/cloud/NearbySearchInfo;->radius:I

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);
    return-object v0
.end method

*/}
