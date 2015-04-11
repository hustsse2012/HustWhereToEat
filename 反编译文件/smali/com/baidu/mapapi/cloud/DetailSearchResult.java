package com.baidu.mapapi.cloud; class DetailSearchResult {/*

.class public Lcom/baidu/mapapi/cloud/DetailSearchResult;
.super Lcom/baidu/mapapi/cloud/BaseSearchResult;


# instance fields
.field public poiInfo:Lcom/baidu/mapapi/cloud/CloudPoiInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/mapapi/cloud/BaseSearchResult;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method a(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/baidu/mapapi/cloud/BaseSearchResult;->a(Lorg/json/JSONObject;)V

    const-string v0, "contents"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_1
    #v1=(Uninit);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/baidu/mapapi/cloud/CloudPoiInfo;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/cloud/CloudPoiInfo;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/cloud/DetailSearchResult;->poiInfo:Lcom/baidu/mapapi/cloud/CloudPoiInfo;

    iget-object v1, p0, Lcom/baidu/mapapi/cloud/DetailSearchResult;->poiInfo:Lcom/baidu/mapapi/cloud/CloudPoiInfo;

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/cloud/CloudPoiInfo;->a(Lorg/json/JSONObject;)V

    goto :goto_0
.end method

*/}
