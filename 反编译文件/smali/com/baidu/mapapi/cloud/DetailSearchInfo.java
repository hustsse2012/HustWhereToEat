package com.baidu.mapapi.cloud; class DetailSearchInfo {/*

.class public Lcom/baidu/mapapi/cloud/DetailSearchInfo;
.super Lcom/baidu/mapapi/cloud/BaseSearchInfo;


# instance fields
.field public uid:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/mapapi/cloud/BaseSearchInfo;-><init>()V

    #p0=(Reference);
    const-string v0, "http://api.map.baidu.com/geosearch/v2/detail/"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    const/16 v4, 0x32

    #v4=(PosByte);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->a:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->uid:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    #v2=(Reference);
    const/16 v3, 0x3f

    #v3=(PosByte);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->ak:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->ak:Ljava/lang/String;

    const-string v3, ""

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->ak:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-gt v2, v4, :cond_1

    const-string v2, "ak"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->ak:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->geoTableId:I

    #v2=(Integer);
    if-eqz v2, :cond_1

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "geotable_id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->geoTableId:I

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->sn:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->sn:Ljava/lang/String;

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->sn:Ljava/lang/String;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-gt v0, v4, :cond_0

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "sn"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->sn:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    #v0=(Conflicted);v2=(Conflicted);
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    #v0=(Reference);v3=(Conflicted);
    return-object v0
.end method

*/}
