package com.baidu.mapapi.cloud; class CloudSearchResult {/*

.class public Lcom/baidu/mapapi/cloud/CloudSearchResult;
.super Lcom/baidu/mapapi/cloud/BaseSearchResult;


# instance fields
.field public poiList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/cloud/CloudPoiInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/mapapi/cloud/BaseSearchResult;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method a(Lorg/json/JSONObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/baidu/mapapi/cloud/BaseSearchResult;->a(Lorg/json/JSONObject;)V

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudSearchResult;->poiList:Ljava/util/List;

    const-string v0, "contents"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v2=(Uninit);v3=(Uninit);
    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    #v2=(Reference);
    if-nez v2, :cond_2

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance v3, Lcom/baidu/mapapi/cloud/CloudPoiInfo;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/baidu/mapapi/cloud/CloudPoiInfo;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v2}, Lcom/baidu/mapapi/cloud/CloudPoiInfo;->a(Lorg/json/JSONObject;)V

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/CloudSearchResult;->poiList:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

*/}
