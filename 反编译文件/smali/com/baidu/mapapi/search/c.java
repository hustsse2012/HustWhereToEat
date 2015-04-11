package com.baidu.mapapi.search; class c {/*

.class public Lcom/baidu/mapapi/search/c;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/search/c;->a:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKTransitRoutePlan;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 v2, 0x0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    return-object v2

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
    new-instance v8, Lorg/json/JSONObject;

    #v8=(UninitRef);
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    #v8=(Reference);
    const-string v2, "result_type"

    #v2=(Reference);
    const/16 v3, 0xe

    #v3=(PosByte);
    invoke-virtual {v8, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance v9, Lorg/json/JSONArray;

    #v9=(UninitRef);
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    #v9=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    move v7, v2

    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v7, v2, :cond_c

    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Lcom/baidu/mapapi/search/MKTransitRoutePlan;

    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    const-string v4, "uid"

    #v4=(Reference);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    #v4=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->getStart()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->getStart()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    invoke-static {v5}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    const-string v6, "x"

    #v6=(Reference);
    invoke-virtual {v5}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v10

    #v10=(Integer);
    invoke-virtual {v4, v6, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v6, "y"

    invoke-virtual {v5}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "geopt"

    #v5=(Reference);
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    #v6=(Conflicted);v10=(Conflicted);
    const-string v4, "start_point"

    invoke-virtual {v8, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    const-string v4, "uid"

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    #v4=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->getEnd()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->getEnd()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    invoke-static {v5}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    const-string v6, "x"

    #v6=(Reference);
    invoke-virtual {v5}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v10

    #v10=(Integer);
    invoke-virtual {v4, v6, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v6, "y"

    invoke-virtual {v5}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "geopt"

    #v5=(Reference);
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    #v6=(Conflicted);v10=(Conflicted);
    const-string v4, "end_point"

    invoke-virtual {v8, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v10, Lorg/json/JSONArray;

    #v10=(UninitRef);
    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    #v10=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->getNumLines()I

    move-result v6

    #v6=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    move v5, v3

    :goto_2
    #v3=(Integer);v4=(Conflicted);v5=(Integer);
    if-ge v5, v6, :cond_7

    new-instance v11, Lorg/json/JSONObject;

    #v11=(UninitRef);
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    #v11=(Reference);
    new-instance v12, Lorg/json/JSONArray;

    #v12=(UninitRef);
    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    #v12=(Reference);
    invoke-virtual {v2, v5}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->getLine(I)Lcom/baidu/mapapi/search/MKLine;

    move-result-object v13

    #v13=(Reference);
    new-instance v14, Lorg/json/JSONObject;

    #v14=(UninitRef);
    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    #v14=(Reference);
    const-string v3, "type"

    #v3=(Reference);
    const/4 v4, 0x3

    #v4=(PosByte);
    invoke-virtual {v14, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    const-string v4, "type"

    #v4=(Reference);
    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getType()I

    move-result v15

    #v15=(Integer);
    invoke-virtual {v3, v4, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "start_uid"

    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getGetOnStop()Lcom/baidu/mapapi/search/MKPoiInfo;

    move-result-object v15

    #v15=(Reference);
    iget-object v15, v15, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    invoke-virtual {v3, v4, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "end_uid"

    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getGetOffStop()Lcom/baidu/mapapi/search/MKPoiInfo;

    move-result-object v15

    iget-object v15, v15, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    invoke-virtual {v3, v4, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "vehicle"

    invoke-virtual {v14, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "instructions"

    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getTip()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getGetOnStop()Lcom/baidu/mapapi/search/MKPoiInfo;

    move-result-object v4

    iget-object v4, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v4, :cond_3

    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getGetOnStop()Lcom/baidu/mapapi/search/MKPoiInfo;

    move-result-object v4

    iget-object v4, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v4}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    const-string v15, "x"

    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v16

    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    invoke-virtual {v3, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v15, "y"

    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v15, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "start_location_pt"

    #v4=(Reference);
    invoke-virtual {v14, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    #v0=(Conflicted);v16=(Conflicted);
    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getGetOffStop()Lcom/baidu/mapapi/search/MKPoiInfo;

    move-result-object v4

    iget-object v4, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v4, :cond_4

    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getGetOffStop()Lcom/baidu/mapapi/search/MKPoiInfo;

    move-result-object v4

    iget-object v4, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v4}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    const-string v15, "x"

    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v16

    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    invoke-virtual {v3, v15, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v15, "y"

    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v15, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "end_location_pt"

    #v4=(Reference);
    invoke-virtual {v14, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    #v0=(Conflicted);v16=(Conflicted);
    iget-object v15, v13, Lcom/baidu/mapapi/search/MKLine;->a:Ljava/util/ArrayList;

    new-instance v16, Lorg/json/JSONArray;

    #v16=(UninitRef);
    invoke-direct/range {v16 .. v16}, Lorg/json/JSONArray;-><init>()V

    #v16=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    move v4, v3

    :goto_3
    #v3=(Integer);v4=(Integer);
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_6

    new-instance v17, Lorg/json/JSONObject;

    #v17=(UninitRef);
    invoke-direct/range {v17 .. v17}, Lorg/json/JSONObject;-><init>()V

    #v17=(Reference);
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v3, :cond_5

    const-string v18, "x"

    #v18=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v19

    #v19=(Integer);
    invoke-virtual/range {v17 .. v19}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v18, "y"

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    move-object/from16 v0, v17

    #v0=(Reference);
    move-object/from16 v1, v18

    #v1=(Reference);
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual/range {v16 .. v17}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_5
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    add-int/lit8 v3, v4, 0x1

    #v3=(Integer);
    move v4, v3

    goto :goto_3

    :cond_6
    #v17=(Conflicted);
    const-string v3, "distance"

    #v3=(Reference);
    invoke-virtual {v13}, Lcom/baidu/mapapi/search/MKLine;->getDistance()I

    move-result v4

    invoke-virtual {v14, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v3, "path_geo_pt"

    move-object/from16 v0, v16

    #v0=(Reference);
    invoke-virtual {v14, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v12, v14}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string v3, "busline"

    invoke-virtual {v11, v3, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v10, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v3, v5, 0x1

    #v3=(Integer);
    move v5, v3

    goto/16 :goto_2

    :cond_7
    #v4=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->getNumRoute()I

    move-result v11

    #v11=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    move v6, v3

    :goto_4
    #v3=(Integer);
    if-ge v6, v11, :cond_b

    new-instance v12, Lorg/json/JSONObject;

    #v12=(UninitRef);
    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    #v12=(Reference);
    new-instance v13, Lorg/json/JSONArray;

    #v13=(UninitRef);
    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    #v13=(Reference);
    invoke-virtual {v2, v6}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->getRoute(I)Lcom/baidu/mapapi/search/MKRoute;

    move-result-object v14

    #v14=(Reference);
    new-instance v15, Lorg/json/JSONObject;

    #v15=(UninitRef);
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    #v15=(Reference);
    const-string v3, "type"

    #v3=(Reference);
    const/4 v4, 0x5

    #v4=(PosByte);
    invoke-virtual {v15, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    const-string v3, "instructions"

    invoke-virtual {v14}, Lcom/baidu/mapapi/search/MKRoute;->getTip()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v15, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v14}, Lcom/baidu/mapapi/search/MKRoute;->getStart()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    #v4=(Reference);
    const-string v5, "x"

    #v5=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v16

    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "y"

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v3, "end_location"

    #v3=(Reference);
    invoke-virtual {v15, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, v14, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    move-object/from16 v16, v0

    #v16=(Reference);
    new-instance v17, Lorg/json/JSONArray;

    #v17=(UninitRef);
    invoke-direct/range {v17 .. v17}, Lorg/json/JSONArray;-><init>()V

    #v17=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    move v5, v3

    :goto_5
    #v3=(Integer);v4=(Conflicted);v5=(Integer);
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v5, v3, :cond_a

    const/4 v3, 0x0

    #v3=(Null);
    move v4, v3

    :goto_6
    #v3=(Integer);v4=(Integer);
    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    if-ge v4, v3, :cond_9

    new-instance v18, Lorg/json/JSONObject;

    #v18=(UninitRef);
    invoke-direct/range {v18 .. v18}, Lorg/json/JSONObject;-><init>()V

    #v18=(Reference);
    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v3, :cond_8

    const-string v19, "x"

    #v19=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v20

    #v20=(Integer);
    invoke-virtual/range {v18 .. v20}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v19, "y"

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    #v1=(Reference);
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_8
    #v1=(Conflicted);v3=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    add-int/lit8 v3, v4, 0x1

    #v3=(Integer);
    move v4, v3

    goto :goto_6

    :cond_9
    #v18=(Conflicted);
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    goto :goto_5

    :cond_a
    #v4=(Conflicted);
    const-string v3, "distance"

    #v3=(Reference);
    invoke-virtual {v14}, Lcom/baidu/mapapi/search/MKRoute;->getDistance()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v15, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v3, "path_geo_pt"

    move-object/from16 v0, v17

    invoke-virtual {v15, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string v3, "busline"

    invoke-virtual {v12, v3, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v3, v6, 0x1

    #v3=(Integer);
    move v6, v3

    goto/16 :goto_4

    :cond_b
    #v4=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    #v2=(Reference);
    const-string v3, "steps"

    #v3=(Reference);
    invoke-virtual {v2, v3, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v9, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v7, 0x1

    #v2=(Integer);
    move v7, v2

    goto/16 :goto_1

    :cond_c
    #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    new-instance v2, Lorg/json/JSONArray;

    #v2=(UninitRef);
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    #v2=(Reference);
    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    const-string v4, "legs"

    #v4=(Reference);
    invoke-virtual {v3, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string v3, "routes"

    invoke-virtual {v8, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_7
    #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v9=(Conflicted);
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_0

    :catch_0
    #v2=(Conflicted);
    move-exception v2

    #v2=(Reference);
    goto :goto_7
.end method

.method public static a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKCityListInfo;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    #v2=(Reference);
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lorg/json/JSONObject;

    new-instance v4, Lcom/baidu/mapapi/search/MKCityListInfo;

    #v4=(UninitRef);
    invoke-direct {v4}, Lcom/baidu/mapapi/search/MKCityListInfo;-><init>()V

    #v4=(Reference);
    const-string v5, "num"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    iput v5, v4, Lcom/baidu/mapapi/search/MKCityListInfo;->num:I

    const-string v5, "name"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/baidu/mapapi/search/MKCityListInfo;->city:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :cond_2
    #v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v2}, Ljava/util/ArrayList;->trimToSize()V

    move-object v0, v2

    #v0=(Reference);
    goto :goto_0
.end method

.method private static a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKPoiInfo;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    #v2=(Reference);
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lorg/json/JSONObject;

    new-instance v4, Lcom/baidu/mapapi/search/MKPoiInfo;

    #v4=(UninitRef);
    invoke-direct {v4}, Lcom/baidu/mapapi/search/MKPoiInfo;-><init>()V

    #v4=(Reference);
    const-string v5, "addr"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->address:Ljava/lang/String;

    const-string v5, "uid"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    const-string v5, "name"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->name:Ljava/lang/String;

    const-string v5, "geo"

    invoke-static {v0, v5}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    iput-object v0, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iput-object p2, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->city:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :cond_2
    #v4=(Conflicted);v5=(Conflicted);
    move-object v0, v2

    #v0=(Reference);
    goto :goto_0
.end method

.method static a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;>;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;>;)V"
        }
    .end annotation

    const/4 v3, 0x0

    #v3=(Null);
    invoke-static {p0}, Lcom/baidu/platform/comjni/tools/a;->a(Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/a;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_2

    iget-object v1, v0, Lcom/baidu/platform/comapi/basestruct/a;->d:Ljava/util/ArrayList;

    #v1=(Reference);
    if-eqz v1, :cond_2

    iget-object v5, v0, Lcom/baidu/platform/comapi/basestruct/a;->d:Ljava/util/ArrayList;

    #v5=(Reference);
    move v2, v3

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v2, v0, :cond_1

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/ArrayList;

    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    #v6=(Reference);
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Ljava/util/ArrayList;

    #v7=(UninitRef);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    #v7=(Reference);
    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v3

    :goto_1
    #v4=(Integer);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v4, v1, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/c;

    new-instance v8, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v8=(UninitRef);
    iget v9, v1, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v9=(Integer);
    div-int/lit8 v9, v9, 0x64

    iget v10, v1, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v10=(Integer);
    div-int/lit8 v10, v10, 0x64

    invoke-direct {v8, v9, v10}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v8, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v8=(UninitRef);
    iget v9, v1, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    div-int/lit8 v9, v9, 0x64

    iget v1, v1, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v1=(Integer);
    div-int/lit8 v1, v1, 0x64

    invoke-direct {v8, v9, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v8=(Reference);
    invoke-static {v8}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v4, 0x1

    #v1=(Integer);
    move v4, v1

    goto :goto_1

    :cond_0
    #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {v6}, Ljava/util/ArrayList;->trimToSize()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->trimToSize()V

    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_0

    :cond_1
    #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {p1}, Ljava/util/ArrayList;->trimToSize()V

    invoke-virtual {p2}, Ljava/util/ArrayList;->trimToSize()V

    :cond_2
    #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKAddrInfo;)Z
    .locals 4

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-eqz p0, :cond_0

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    #v2=(Conflicted);
    move v0, v1

    :goto_0
    #v0=(Boolean);v3=(Conflicted);
    return v0

    :cond_1
    :try_start_0
    #v0=(One);v2=(Boolean);v3=(Uninit);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, "address"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->strAddr:Ljava/lang/String;

    const-string v3, "business"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->strBusiness:Ljava/lang/String;

    const-string v3, "addr_detail"

    invoke-static {v2, v3}, Lcom/baidu/mapapi/search/c;->c(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;

    move-result-object v3

    iput-object v3, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->addressComponents:Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;

    const/4 v3, 0x1

    #v3=(One);
    iput v3, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->type:I

    const-string v3, "point"

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/baidu/mapapi/search/c;->g(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    iput-object v3, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->geoPt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    const-string v3, "surround_poi"

    invoke-static {v2, v3}, Lcom/baidu/mapapi/search/c;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->poiList:Ljava/util/ArrayList;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKBusLineResult;)Z
    .locals 11

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-eqz p0, :cond_0

    :try_start_0
    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    if-nez p1, :cond_2

    :cond_0
    #v2=(Conflicted);
    move v0, v1

    :cond_1
    :goto_0
    #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v0

    :cond_2
    #v0=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, "count"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    const-string v4, "details"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_1

    if-lez v3, :cond_1

    move v3, v1

    :goto_1
    #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-ge v3, v2, :cond_1

    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    #v5=(Reference);
    const-string v2, "starttime"

    #v2=(Reference);
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/search/MKBusLineResult;->a(Ljava/lang/String;)V

    const-string v2, "endtime"

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/search/MKBusLineResult;->b(Ljava/lang/String;)V

    const/4 v6, 0x0

    #v6=(Null);
    const-string v2, "name"

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    const-string v2, "ismonticket"

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_4

    move v2, v0

    :goto_2
    invoke-virtual {p1, v6, v7, v2}, Lcom/baidu/mapapi/search/MKBusLineResult;->a(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKBusLineResult;->getBusRoute()Lcom/baidu/mapapi/search/MKRoute;

    move-result-object v2

    #v2=(Reference);
    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    #v6=(Reference);
    invoke-virtual {v2, v6}, Lcom/baidu/mapapi/search/MKRoute;->b(Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKBusLineResult;->getBusRoute()Lcom/baidu/mapapi/search/MKRoute;

    move-result-object v2

    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    #v6=(Reference);
    iput-object v6, v2, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    const-string v2, "geo"

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKBusLineResult;->getBusRoute()Lcom/baidu/mapapi/search/MKRoute;

    move-result-object v6

    invoke-virtual {v6}, Lcom/baidu/mapapi/search/MKRoute;->getArrayPoints()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKBusLineResult;->getBusRoute()Lcom/baidu/mapapi/search/MKRoute;

    move-result-object v7

    iget-object v7, v7, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    invoke-static {v2, v6, v7}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKBusLineResult;->getBusRoute()Lcom/baidu/mapapi/search/MKRoute;

    move-result-object v2

    const/4 v6, 0x3

    #v6=(PosByte);
    invoke-virtual {v2, v6}, Lcom/baidu/mapapi/search/MKRoute;->c(I)V

    const-string v2, "stations"

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKBusLineResult;->getBusRoute()Lcom/baidu/mapapi/search/MKRoute;

    move-result-object v6

    #v6=(Reference);
    new-instance v7, Ljava/util/ArrayList;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lcom/baidu/mapapi/search/MKRoute;->a(Ljava/util/ArrayList;)V

    move v2, v1

    :goto_3
    #v2=(Integer);
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v8

    #v8=(Integer);
    if-ge v2, v8, :cond_6

    invoke-virtual {v5, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    #v8=(Reference);
    if-eqz v8, :cond_3

    new-instance v9, Lcom/baidu/mapapi/search/MKStep;

    #v9=(UninitRef);
    invoke-direct {v9}, Lcom/baidu/mapapi/search/MKStep;-><init>()V

    #v9=(Reference);
    const-string v10, "name"

    #v10=(Reference);
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/baidu/mapapi/search/MKStep;->a(Ljava/lang/String;)V

    const-string v10, "geo"

    invoke-static {v8, v10}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v8

    invoke-virtual {v9, v8}, Lcom/baidu/mapapi/search/MKStep;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v2, :cond_5

    new-instance v8, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v8=(UninitRef);
    invoke-virtual {v9}, Lcom/baidu/mapapi/search/MKStep;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v10

    invoke-virtual {v10}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v10

    #v10=(Integer);
    invoke-virtual {v9}, Lcom/baidu/mapapi/search/MKStep;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v9

    invoke-virtual {v9}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v9

    #v9=(Integer);
    invoke-direct {v8, v10, v9}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v8=(Reference);
    invoke-virtual {v6, v8}, Lcom/baidu/mapapi/search/MKRoute;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_3
    :goto_4
    #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    #v2=(Boolean);v6=(Null);
    move v2, v1

    #v2=(Null);
    goto/16 :goto_2

    :cond_5
    #v2=(Integer);v6=(Reference);v8=(Reference);v9=(Reference);v10=(Reference);
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v8

    #v8=(Integer);
    add-int/lit8 v8, v8, -0x1

    if-ne v2, v8, :cond_3

    new-instance v8, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v8=(UninitRef);
    invoke-virtual {v9}, Lcom/baidu/mapapi/search/MKStep;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v10

    invoke-virtual {v10}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v10

    #v10=(Integer);
    invoke-virtual {v9}, Lcom/baidu/mapapi/search/MKStep;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v9

    invoke-virtual {v9}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v9

    #v9=(Integer);
    invoke-direct {v8, v10, v9}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v8=(Reference);
    invoke-virtual {v6, v8}, Lcom/baidu/mapapi/search/MKRoute;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    move v0, v1

    #v0=(Null);
    goto/16 :goto_0

    :cond_6
    #v0=(One);v3=(Integer);v4=(Reference);v5=(Reference);v7=(Reference);
    add-int/lit8 v2, v3, 0x1

    #v2=(Integer);
    move v3, v2

    goto/16 :goto_1
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKDrivingRouteResult;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    #v2=(Null);
    if-eqz p0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    #v0=(Conflicted);
    move v1, v2

    :goto_0
    #v1=(Boolean);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v1

    :cond_1
    #v0=(Boolean);v1=(One);v2=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    new-instance v5, Lorg/json/JSONObject;

    #v5=(UninitRef);
    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    const-string v0, "taxi"

    #v0=(Reference);
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v4, "total_price"

    #v4=(Reference);
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->a(I)V

    :cond_2
    #v0=(Conflicted);v4=(Conflicted);
    const-string v0, "avoid_jam"

    #v0=(Reference);
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_6

    move v0, v1

    :goto_1
    #v0=(Boolean);
    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->a(Z)V

    const-string v0, "start_point"

    #v0=(Reference);
    invoke-static {v5, v0}, Lcom/baidu/mapapi/search/c;->d(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->a(Lcom/baidu/mapapi/search/MKPlanNode;)V

    const-string v0, "end_point"

    invoke-static {v5, v0}, Lcom/baidu/mapapi/search/c;->d(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->b(Lcom/baidu/mapapi/search/MKPlanNode;)V

    const-string v0, "waypoints"

    invoke-static {v5, v0}, Lcom/baidu/mapapi/search/c;->e(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->a(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->getStart()Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->getStart()Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :goto_2
    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->getEnd()Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v4

    #v4=(Reference);
    if-eqz v4, :cond_8

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->getEnd()Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v4

    iget-object v4, v4, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :goto_3
    const-string v6, "start_point"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "name"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "end_point"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    const-string v8, "name"

    #v8=(Reference);
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "\u9a7e\u8f66\u65b9\u6848\uff1a"

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, "_"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "routes"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_7

    const-string v7, "legs"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_7

    new-instance v7, Ljava/util/ArrayList;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    #v7=(Reference);
    invoke-virtual {p1, v7}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->a(Ljava/util/ArrayList;)V

    new-instance v8, Lcom/baidu/mapapi/search/MKRoutePlan;

    #v8=(UninitRef);
    invoke-direct {v8}, Lcom/baidu/mapapi/search/MKRoutePlan;-><init>()V

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "distance"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    invoke-virtual {v8, v7}, Lcom/baidu/mapapi/search/MKRoutePlan;->a(I)V

    const-string v9, "duration"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    #v9=(Integer);
    invoke-virtual {v8, v9}, Lcom/baidu/mapapi/search/MKRoutePlan;->b(I)V

    new-instance v10, Ljava/util/ArrayList;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    #v10=(Reference);
    invoke-virtual {v8, v10}, Lcom/baidu/mapapi/search/MKRoutePlan;->a(Ljava/util/ArrayList;)V

    new-instance v8, Lcom/baidu/mapapi/search/MKRoute;

    #v8=(UninitRef);
    invoke-direct {v8}, Lcom/baidu/mapapi/search/MKRoute;-><init>()V

    #v8=(Reference);
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v9}, Lcom/baidu/mapapi/search/MKRoute;->d(I)V

    invoke-virtual {v8, v6}, Lcom/baidu/mapapi/search/MKRoute;->a(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Lcom/baidu/mapapi/search/MKRoute;->b(I)V

    invoke-virtual {v8, v7}, Lcom/baidu/mapapi/search/MKRoute;->a(I)V

    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    #v6=(Reference);
    invoke-virtual {v8, v6}, Lcom/baidu/mapapi/search/MKRoute;->b(Ljava/util/ArrayList;)V

    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    #v6=(Reference);
    iput-object v6, v8, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    new-instance v6, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v6=(UninitRef);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v7

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-direct {v6, v7, v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v6=(Reference);
    invoke-virtual {v8, v6}, Lcom/baidu/mapapi/search/MKRoute;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_3
    #v0=(Conflicted);
    if-eqz v4, :cond_4

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(UninitRef);
    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v4

    #v4=(Integer);
    invoke-direct {v0, v6, v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v0=(Reference);
    invoke-virtual {v8, v0}, Lcom/baidu/mapapi/search/MKRoute;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_4
    #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);
    invoke-virtual {v8, v1}, Lcom/baidu/mapapi/search/MKRoute;->c(I)V

    const-string v0, "steps"

    #v0=(Reference);
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    #v4=(Reference);
    invoke-virtual {v8, v4}, Lcom/baidu/mapapi/search/MKRoute;->a(Ljava/util/ArrayList;)V

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    new-instance v6, Lcom/baidu/mapapi/search/MKStep;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/baidu/mapapi/search/MKStep;-><init>()V

    #v6=(Reference);
    const-string v7, "start_desc"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/baidu/mapapi/search/MKStep;->a(Ljava/lang/String;)V

    const-string v7, "direction"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    invoke-virtual {v6, v7}, Lcom/baidu/mapapi/search/MKStep;->a(I)V

    const-string v7, "start_loc"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/baidu/mapapi/search/MKStep;->b(Ljava/lang/String;)V

    const-string v7, "start_loc"

    invoke-static {v5, v7}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/baidu/mapapi/search/MKStep;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    #v2=(Integer);
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v5

    #v5=(Integer);
    if-ge v2, v5, :cond_7

    new-instance v5, Lcom/baidu/mapapi/search/MKStep;

    #v5=(UninitRef);
    invoke-direct {v5}, Lcom/baidu/mapapi/search/MKStep;-><init>()V

    #v5=(Reference);
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_5

    const-string v7, "end_desc"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/baidu/mapapi/search/MKStep;->a(Ljava/lang/String;)V

    const-string v7, "direction"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    invoke-virtual {v5, v7}, Lcom/baidu/mapapi/search/MKStep;->a(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const-string v7, "end_loc"

    #v7=(Reference);
    invoke-static {v6, v7}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/baidu/mapapi/search/MKStep;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "path"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/baidu/mapapi/search/MKStep;->b(Ljava/lang/String;)V

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    #v0=(Integer);v2=(Null);v4=(Conflicted);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    move v0, v2

    #v0=(Null);
    goto/16 :goto_1

    :cond_7
    #v0=(Reference);v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {p1, v3}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->a(Lcom/baidu/mapapi/search/MKRouteAddrResult;)V

    goto/16 :goto_0

    :cond_8
    #v2=(Null);v4=(Reference);v5=(Reference);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    move-object v4, v3

    #v4=(Null);
    goto/16 :goto_3

    :cond_9
    #v4=(Conflicted);
    move-object v0, v3

    #v0=(Null);
    goto/16 :goto_2
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPoiResult;)Z
    .locals 6

    const/4 v2, 0x0

    #v2=(Null);
    if-eqz p0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v2

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    #v0=(Reference);
    const-string v1, "citys"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_4

    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    #v4=(Reference);
    if-eqz p1, :cond_2

    invoke-virtual {p1, v4}, Lcom/baidu/mapapi/search/MKPoiResult;->c(Ljava/util/ArrayList;)V

    :cond_2
    move v1, v2

    :goto_2
    #v1=(Integer);v2=(Reference);v5=(Conflicted);
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_3

    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lorg/json/JSONObject;

    new-instance v2, Lcom/baidu/mapapi/search/MKCityListInfo;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/mapapi/search/MKCityListInfo;-><init>()V

    #v2=(Reference);
    const-string v5, "num"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    iput v5, v2, Lcom/baidu/mapapi/search/MKCityListInfo;->num:I

    const-string v5, "name"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/baidu/mapapi/search/MKCityListInfo;->city:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_2

    :catch_0
    #v0=(Conflicted);v1=(Null);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    move-object v0, v1

    #v0=(Null);
    goto :goto_1

    :cond_3
    #v0=(Integer);v1=(Integer);v2=(Reference);v3=(Reference);v4=(Reference);v5=(Conflicted);
    invoke-virtual {v4}, Ljava/util/ArrayList;->trimToSize()V

    :cond_4
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPoiResult;I)Z
    .locals 10

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-eqz p0, :cond_0

    :try_start_0
    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    if-nez p1, :cond_2

    :cond_0
    #v2=(Conflicted);
    move v0, v1

    :cond_1
    :goto_0
    #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return v0

    :cond_2
    #v0=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    const-string v2, "total"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    const-string v3, "count"

    #v3=(Reference);
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/search/MKPoiResult;->b(I)V

    invoke-virtual {p1, v3}, Lcom/baidu/mapapi/search/MKPoiResult;->a(I)V

    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/search/MKPoiResult;->d(I)V

    div-int v5, v2, v3

    #v5=(Integer);
    rem-int/2addr v2, v3

    if-lez v2, :cond_5

    move v2, v0

    :goto_1
    #v2=(Boolean);
    add-int/2addr v2, v5

    #v2=(Integer);
    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/search/MKPoiResult;->c(I)V

    const-string v2, "current_city"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    #v3=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    if-eqz v3, :cond_6

    const-string v2, "name"

    #v2=(Reference);
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    :goto_2
    const-string v2, "pois"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    invoke-virtual {p1, v5}, Lcom/baidu/mapapi/search/MKPoiResult;->a(Ljava/util/ArrayList;)V

    move v2, v1

    :goto_3
    #v2=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    #v6=(Integer);
    if-ge v2, v6, :cond_1

    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    #v6=(Reference);
    new-instance v7, Lcom/baidu/mapapi/search/MKPoiInfo;

    #v7=(UninitRef);
    invoke-direct {v7}, Lcom/baidu/mapapi/search/MKPoiInfo;-><init>()V

    #v7=(Reference);
    const-string v8, "name"

    #v8=(Reference);
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->name:Ljava/lang/String;

    const-string v8, "addr"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->address:Ljava/lang/String;

    const-string v8, "uid"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    const-string v8, "tel"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->phoneNum:Ljava/lang/String;

    const-string v8, "type"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    #v8=(Integer);
    iput v8, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->ePoiType:I

    iget v8, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->ePoiType:I

    const/4 v9, 0x2

    #v9=(PosByte);
    if-eq v8, v9, :cond_3

    iget v8, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->ePoiType:I

    const/4 v9, 0x4

    if-eq v8, v9, :cond_3

    const-string v8, "geo"

    #v8=(Reference);
    invoke-static {v6, v8}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v8

    iput-object v8, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :cond_3
    #v8=(Conflicted);
    iput-object v3, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->city:Ljava/lang/String;

    const-string v8, "place"

    #v8=(Reference);
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    if-eqz v8, :cond_4

    const-string v9, "src_name"

    #v9=(Reference);
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "cater"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_4

    const-string v8, "detail"

    #v8=(Reference);
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_4

    const/4 v6, 0x1

    #v6=(One);
    iput-boolean v6, v7, Lcom/baidu/mapapi/search/MKPoiInfo;->hasCaterDetails:Z

    :cond_4
    #v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    #v3=(Integer);v5=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move v2, v1

    #v2=(Null);
    goto/16 :goto_1

    :catch_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move v0, v1

    #v0=(Null);
    goto/16 :goto_0

    :cond_6
    #v0=(One);v2=(Null);v3=(Reference);v4=(Reference);v5=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move-object v3, v2

    #v3=(Null);
    goto/16 :goto_2
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKRouteAddrResult;)Z
    .locals 8

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return v0

    :cond_1
    :try_start_0
    #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, "address_info"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "st_cityname"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "en_cityname"

    #v5=(Reference);
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "have_stcitylist"

    #v6=(Reference);
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_3

    const-string v4, "startcitys"

    invoke-static {v2, v4}, Lcom/baidu/mapapi/search/c;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mStartCityList:Ljava/util/ArrayList;

    :goto_1
    #v6=(Conflicted);
    const-string v4, "have_encitylist"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_4

    const-string v3, "endcitys"

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/baidu/mapapi/search/c;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mEndCityList:Ljava/util/ArrayList;

    :goto_2
    const-string v3, "way_points_citylist"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-gtz v2, :cond_5

    :cond_2
    #v2=(Conflicted);
    move v0, v1

    #v0=(One);
    goto :goto_0

    :cond_3
    #v0=(Null);v2=(Reference);v6=(Boolean);
    const-string v6, "startpoints"

    #v6=(Reference);
    invoke-static {v2, v6, v4}, Lcom/baidu/mapapi/search/c;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mStartPoiList:Ljava/util/ArrayList;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    :cond_4
    :try_start_1
    #v1=(One);v2=(Reference);v3=(Boolean);v4=(Reference);v5=(Reference);v7=(Uninit);
    const-string v3, "endpoints"

    #v3=(Reference);
    invoke-static {v2, v3, v5}, Lcom/baidu/mapapi/search/c;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mEndPoiList:Ljava/util/ArrayList;

    goto :goto_2

    :cond_5
    #v2=(Integer);
    new-instance v2, Ljava/util/ArrayList;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    #v2=(Reference);
    iput-object v2, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mWpCityList:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    #v2=(Reference);
    iput-object v2, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mWpPoiList:Ljava/util/ArrayList;

    move v2, v0

    :goto_3
    #v2=(Integer);v7=(Conflicted);
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    #v4=(Integer);
    if-ge v2, v4, :cond_8

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    #v4=(Reference);
    const-string v5, "have_citylist"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_6

    iget-object v5, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mWpCityList:Ljava/util/ArrayList;

    #v5=(Reference);
    const-string v6, "way_points_item"

    #v6=(Reference);
    invoke-static {v4, v6}, Lcom/baidu/mapapi/search/c;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    const-string v5, "have_poilist"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_7

    iget-object v5, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mWpPoiList:Ljava/util/ArrayList;

    #v5=(Reference);
    const-string v6, "way_points_poilist"

    const-string v7, ""

    #v7=(Reference);
    invoke-static {v4, v6, v7}, Lcom/baidu/mapapi/search/c;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    #v7=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    #v5=(Boolean);v6=(Conflicted);
    iget-object v5, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mWpCityList:Ljava/util/ArrayList;

    #v5=(Reference);
    const/4 v6, 0x0

    #v6=(Null);
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    #v5=(Boolean);v6=(Reference);
    iget-object v4, p1, Lcom/baidu/mapapi/search/MKRouteAddrResult;->mWpPoiList:Ljava/util/ArrayList;

    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :cond_8
    #v4=(Integer);v5=(Reference);v6=(Conflicted);
    move v0, v1

    #v0=(One);
    goto/16 :goto_0
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKShareUrlResult;)Z
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    :try_start_0
    #v0=(Null);v1=(Uninit);v2=(Uninit);
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    if-eqz v1, :cond_0

    const-string v2, "url"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lcom/baidu/mapapi/search/MKShareUrlResult;->url:Ljava/lang/String;

    const-string v2, "type"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, p1, Lcom/baidu/mapapi/search/MKShareUrlResult;->type:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :catch_0
    #v0=(Null);v1=(Conflicted);v2=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKSuggestionResult;)Z
    .locals 9

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    :try_start_0
    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    const-string v2, "cityname"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    const-string v3, "poiname"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    const-string v4, "districtname"

    #v4=(Reference);
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_2

    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    invoke-virtual {p1, v5}, Lcom/baidu/mapapi/search/MKSuggestionResult;->a(Ljava/util/ArrayList;)V

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v6

    #v6=(Integer);
    move v1, v0

    :goto_1
    #v7=(Conflicted);v8=(Conflicted);
    if-ge v1, v6, :cond_2

    new-instance v7, Lcom/baidu/mapapi/search/MKSuggestionInfo;

    #v7=(UninitRef);
    invoke-direct {v7}, Lcom/baidu/mapapi/search/MKSuggestionInfo;-><init>()V

    #v7=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    iput-object v8, v7, Lcom/baidu/mapapi/search/MKSuggestionInfo;->city:Ljava/lang/String;

    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/baidu/mapapi/search/MKSuggestionInfo;->key:Ljava/lang/String;

    invoke-virtual {v4, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/baidu/mapapi/search/MKSuggestionInfo;->district:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :catch_0
    #v0=(Null);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKTransitRouteResult;)Z
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p0, :cond_0

    const-string v2, ""

    #v2=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    #v0=(Conflicted);v2=(Conflicted);
    const/4 v2, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    return v2

    :cond_1
    #v0=(Reference);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, "taxi"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v4, "total_price"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/search/MKTransitRouteResult;->a(I)V

    :cond_2
    #v3=(Conflicted);v4=(Conflicted);
    const-string v3, "start_point"

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/baidu/mapapi/search/c;->d(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/search/MKTransitRouteResult;->a(Lcom/baidu/mapapi/search/MKPlanNode;)V

    const-string v3, "end_point"

    invoke-static {v2, v3}, Lcom/baidu/mapapi/search/c;->d(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/search/MKTransitRouteResult;->b(Lcom/baidu/mapapi/search/MKPlanNode;)V

    const-string v3, "routes"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    #v7=(Reference);
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_b

    new-instance v8, Ljava/util/ArrayList;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    #v8=(Reference);
    move-object/from16 v0, p1

    invoke-virtual {v0, v8}, Lcom/baidu/mapapi/search/MKTransitRouteResult;->a(Ljava/util/ArrayList;)V

    const/4 v2, 0x0

    #v2=(Null);
    move v3, v2

    :goto_1
    #v1=(Conflicted);v2=(Integer);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v3, v2, :cond_b

    invoke-virtual {v7, v3}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Lorg/json/JSONObject;

    const-string v4, "legs"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_a

    new-instance v9, Lcom/baidu/mapapi/search/MKTransitRoutePlan;

    #v9=(UninitRef);
    invoke-direct {v9}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;-><init>()V

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v4, "distance"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v9, v4}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->a(I)V

    const-string v4, "start_geo"

    #v4=(Reference);
    invoke-static {v2, v4}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    invoke-virtual {v9, v4}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    const-string v4, "end_geo"

    invoke-static {v2, v4}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    invoke-virtual {v9, v4}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    const-string v4, "time"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v9, v4}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->b(I)V

    const-string v4, "steps"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    #v10=(Reference);
    if-eqz v10, :cond_a

    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_a

    new-instance v11, Ljava/util/ArrayList;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    #v11=(Reference);
    new-instance v12, Ljava/util/ArrayList;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    #v12=(Reference);
    invoke-virtual {v9, v11}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->a(Ljava/util/ArrayList;)V

    invoke-virtual {v9, v12}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->setLine(Ljava/util/ArrayList;)V

    const-string v4, ""

    const/4 v2, 0x0

    #v2=(Null);
    move/from16 v19, v2

    #v19=(Null);
    move-object v2, v4

    #v2=(Reference);
    move/from16 v4, v19

    :goto_2
    #v4=(Integer);
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v5

    #v5=(Integer);
    if-ge v4, v5, :cond_9

    invoke-virtual {v10, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    #v5=(Reference);
    const-string v6, "busline"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v6

    #v6=(Integer);
    if-lez v6, :cond_4

    const/4 v6, 0x0

    #v6=(Null);
    const/4 v13, 0x0

    #v13=(Null);
    invoke-virtual {v5, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    #v13=(Reference);
    if-eqz v13, :cond_4

    const-string v5, "type"

    invoke-virtual {v13, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    const/4 v14, 0x5

    #v14=(PosByte);
    if-ne v5, v14, :cond_5

    const/4 v5, 0x2

    :goto_3
    #v5=(PosByte);
    const-string v14, "start_location"

    #v14=(Reference);
    invoke-static {v13, v14}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v14

    const-string v15, "end_location"

    #v15=(Reference);
    invoke-static {v13, v15}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v15

    if-nez v6, :cond_3

    const-string v6, "instructions"

    #v6=(Reference);
    invoke-virtual {v13, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_3
    const/16 v16, 0x2

    #v16=(PosByte);
    move/from16 v0, v16

    #v0=(PosByte);
    if-ne v5, v0, :cond_6

    new-instance v16, Lcom/baidu/mapapi/search/MKRoute;

    #v16=(UninitRef);
    invoke-direct/range {v16 .. v16}, Lcom/baidu/mapapi/search/MKRoute;-><init>()V

    #v16=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    invoke-virtual {v0, v5}, Lcom/baidu/mapapi/search/MKRoute;->c(I)V

    const-string v5, "distance"

    #v5=(Reference);
    invoke-virtual {v13, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Lcom/baidu/mapapi/search/MKRoute;->a(I)V

    const-string v5, "duration"

    #v5=(Reference);
    invoke-virtual {v13, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Lcom/baidu/mapapi/search/MKRoute;->d(I)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Lcom/baidu/mapapi/search/MKRoute;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v15}, Lcom/baidu/mapapi/search/MKRoute;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Lcom/baidu/mapapi/search/MKRoute;->b(I)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Lcom/baidu/mapapi/search/MKRoute;->a(Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Lcom/baidu/mapapi/search/MKRoute;->b(Ljava/util/ArrayList;)V

    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    move-object/from16 v0, v16

    iput-object v5, v0, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    const-string v5, "path_geo"

    invoke-virtual {v13, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, Lcom/baidu/mapapi/search/MKRoute;->getArrayPoints()Ljava/util/ArrayList;

    move-result-object v6

    move-object/from16 v0, v16

    iget-object v13, v0, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    invoke-static {v5, v6, v13}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    move-object/from16 v0, v16

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_4
    #v6=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    :cond_5
    #v5=(Integer);v6=(Null);v13=(Reference);v14=(PosByte);
    const/4 v5, 0x3

    #v5=(PosByte);
    goto/16 :goto_3

    :cond_6
    #v0=(PosByte);v6=(Reference);v14=(Reference);v15=(Reference);v16=(PosByte);
    new-instance v5, Lcom/baidu/mapapi/search/MKLine;

    #v5=(UninitRef);
    invoke-direct {v5}, Lcom/baidu/mapapi/search/MKLine;-><init>()V

    #v5=(Reference);
    const-string v16, "distance"

    #v16=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v16

    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    invoke-virtual {v5, v0}, Lcom/baidu/mapapi/search/MKLine;->b(I)V

    const-string v16, "duration"

    #v16=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v16

    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    invoke-virtual {v5, v0}, Lcom/baidu/mapapi/search/MKLine;->c(I)V

    new-instance v16, Lcom/baidu/mapapi/search/MKPoiInfo;

    #v16=(UninitRef);
    invoke-direct/range {v16 .. v16}, Lcom/baidu/mapapi/search/MKPoiInfo;-><init>()V

    #v16=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    iput-object v14, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Lcom/baidu/mapapi/search/MKLine;->a(Lcom/baidu/mapapi/search/MKPoiInfo;)V

    new-instance v14, Lcom/baidu/mapapi/search/MKPoiInfo;

    #v14=(UninitRef);
    invoke-direct {v14}, Lcom/baidu/mapapi/search/MKPoiInfo;-><init>()V

    #v14=(Reference);
    iput-object v15, v14, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v5, v14}, Lcom/baidu/mapapi/search/MKLine;->b(Lcom/baidu/mapapi/search/MKPoiInfo;)V

    new-instance v15, Ljava/util/ArrayList;

    #v15=(UninitRef);
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    #v15=(Reference);
    invoke-virtual {v5, v15}, Lcom/baidu/mapapi/search/MKLine;->a(Ljava/util/ArrayList;)V

    new-instance v15, Ljava/util/ArrayList;

    #v15=(UninitRef);
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    #v15=(Reference);
    iput-object v15, v5, Lcom/baidu/mapapi/search/MKLine;->a:Ljava/util/ArrayList;

    const-string v15, "path_geo"

    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v5}, Lcom/baidu/mapapi/search/MKLine;->getPoints()Ljava/util/ArrayList;

    move-result-object v17

    #v17=(Reference);
    iget-object v0, v5, Lcom/baidu/mapapi/search/MKLine;->a:Ljava/util/ArrayList;

    move-object/from16 v18, v0

    #v18=(Reference);
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    #v1=(Reference);
    invoke-static {v15, v0, v1}, Lcom/baidu/mapapi/search/c;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    const-string v15, "vehicle"

    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    if-eqz v13, :cond_8

    const-string v15, "type"

    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v15

    #v15=(Integer);
    invoke-virtual {v5, v15}, Lcom/baidu/mapapi/search/MKLine;->d(I)V

    const-string v15, "start_name"

    #v15=(Reference);
    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, v16

    iput-object v15, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->name:Ljava/lang/String;

    const-string v15, "start_uid"

    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, v16

    iput-object v15, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    const-string v15, "end_name"

    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    iput-object v15, v14, Lcom/baidu/mapapi/search/MKPoiInfo;->name:Ljava/lang/String;

    const-string v15, "end_uid"

    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    iput-object v15, v14, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    const-string v14, "stop_num"

    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v14

    #v14=(Integer);
    invoke-virtual {v5, v14}, Lcom/baidu/mapapi/search/MKLine;->a(I)V

    const-string v14, "type"

    #v14=(Reference);
    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v14

    #v14=(Integer);
    invoke-virtual {v5, v14}, Lcom/baidu/mapapi/search/MKLine;->d(I)V

    const-string v14, "name"

    #v14=(Reference);
    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v5, v14}, Lcom/baidu/mapapi/search/MKLine;->b(Ljava/lang/String;)V

    const-string v14, "zone_price"

    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v14

    #v14=(Integer);
    iput v14, v5, Lcom/baidu/mapapi/search/MKLine;->c:I

    const-string v14, "total_price"

    #v14=(Reference);
    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v13

    #v13=(Integer);
    iput v13, v5, Lcom/baidu/mapapi/search/MKLine;->b:I

    const-string v13, ""

    #v13=(Reference);
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    #v13=(Boolean);
    if-nez v13, :cond_7

    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    #v13=(Reference);
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v13, "_"

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_7
    #v13=(Conflicted);
    new-instance v13, Ljava/lang/StringBuilder;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    #v13=(Reference);
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/baidu/mapapi/search/MKLine;->getTitle()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_8
    invoke-virtual {v5, v6}, Lcom/baidu/mapapi/search/MKLine;->a(Ljava/lang/String;)V

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_9
    #v1=(Conflicted);v5=(Integer);v6=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
    invoke-virtual {v9, v2}, Lcom/baidu/mapapi/search/MKTransitRoutePlan;->a(Ljava/lang/String;)V

    :cond_a
    #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v19=(Conflicted);
    add-int/lit8 v2, v3, 0x1

    #v2=(Integer);
    move v3, v2

    goto/16 :goto_1

    :cond_b
    #v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/search/MKTransitRouteResult;->a(Lcom/baidu/mapapi/search/MKRouteAddrResult;)V

    const/4 v2, 0x1

    #v2=(One);
    goto/16 :goto_0
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKWalkingRouteResult;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    if-eqz p0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return v3

    :cond_1
    #v0=(Boolean);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    const-string v0, "taxi"

    #v0=(Reference);
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v2, "total_price"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->a(I)V

    :cond_2
    #v0=(Conflicted);v2=(Conflicted);
    const-string v0, "start_point"

    #v0=(Reference);
    invoke-static {v4, v0}, Lcom/baidu/mapapi/search/c;->d(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->a(Lcom/baidu/mapapi/search/MKPlanNode;)V

    const-string v0, "end_point"

    invoke-static {v4, v0}, Lcom/baidu/mapapi/search/c;->d(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->b(Lcom/baidu/mapapi/search/MKPlanNode;)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->getStart()Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->getStart()Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :goto_1
    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->getEnd()Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_8

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->getEnd()Lcom/baidu/mapapi/search/MKPlanNode;

    move-result-object v2

    iget-object v2, v2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :goto_2
    const-string v5, "start_point"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "name"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "end_point"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "name"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "\u6b65\u884c\u65b9\u6848\uff1a"

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "_"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "routes"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_7

    const-string v6, "legs"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_7

    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    #v6=(Reference);
    invoke-virtual {p1, v6}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->a(Ljava/util/ArrayList;)V

    new-instance v7, Lcom/baidu/mapapi/search/MKRoutePlan;

    #v7=(UninitRef);
    invoke-direct {v7}, Lcom/baidu/mapapi/search/MKRoutePlan;-><init>()V

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "distance"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v7, v6}, Lcom/baidu/mapapi/search/MKRoutePlan;->a(I)V

    const-string v8, "duration"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v7, v8}, Lcom/baidu/mapapi/search/MKRoutePlan;->b(I)V

    new-instance v9, Ljava/util/ArrayList;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    #v9=(Reference);
    invoke-virtual {v7, v9}, Lcom/baidu/mapapi/search/MKRoutePlan;->a(Ljava/util/ArrayList;)V

    new-instance v7, Lcom/baidu/mapapi/search/MKRoute;

    #v7=(UninitRef);
    invoke-direct {v7}, Lcom/baidu/mapapi/search/MKRoute;-><init>()V

    #v7=(Reference);
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v8}, Lcom/baidu/mapapi/search/MKRoute;->d(I)V

    invoke-virtual {v7, v5}, Lcom/baidu/mapapi/search/MKRoute;->a(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Lcom/baidu/mapapi/search/MKRoute;->b(I)V

    invoke-virtual {v7, v6}, Lcom/baidu/mapapi/search/MKRoute;->a(I)V

    if-eqz v0, :cond_3

    new-instance v5, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v5=(UninitRef);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v6

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-direct {v5, v6, v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v5=(Reference);
    invoke-virtual {v7, v5}, Lcom/baidu/mapapi/search/MKRoute;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_3
    #v0=(Conflicted);
    if-eqz v2, :cond_4

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(UninitRef);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    invoke-direct {v0, v5, v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v0=(Reference);
    invoke-virtual {v7, v0}, Lcom/baidu/mapapi/search/MKRoute;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_4
    #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);
    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-virtual {v7, v0}, Lcom/baidu/mapapi/search/MKRoute;->c(I)V

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    invoke-virtual {v7, v0}, Lcom/baidu/mapapi/search/MKRoute;->b(Ljava/util/ArrayList;)V

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, v7, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    const-string v0, "steps"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_7

    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    invoke-virtual {v7, v5}, Lcom/baidu/mapapi/search/MKRoute;->a(Ljava/util/ArrayList;)V

    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    #v0=(Reference);
    move-object v2, v0

    #v2=(Reference);
    move v0, v3

    :goto_3
    #v0=(Integer);v3=(Reference);v6=(Conflicted);v8=(Conflicted);
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v3

    #v3=(Integer);
    if-ge v0, v3, :cond_6

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    #v3=(Reference);
    new-instance v6, Lcom/baidu/mapapi/search/MKStep;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/baidu/mapapi/search/MKStep;-><init>()V

    #v6=(Reference);
    if-nez v0, :cond_5

    const-string v2, "start_desc"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/baidu/mapapi/search/MKStep;->a(Ljava/lang/String;)V

    const-string v2, "start_loc"

    invoke-static {v3, v2}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/baidu/mapapi/search/MKStep;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :goto_4
    const-string v2, "distance"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, v6, Lcom/baidu/mapapi/search/MKStep;->a:I

    const-string v2, "duration"

    #v2=(Reference);
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, v6, Lcom/baidu/mapapi/search/MKStep;->b:I

    const-string v2, "direction"

    #v2=(Reference);
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v2}, Lcom/baidu/mapapi/search/MKStep;->a(I)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "path"

    #v2=(Reference);
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lcom/baidu/mapapi/search/MKRoute;->getArrayPoints()Ljava/util/ArrayList;

    move-result-object v6

    iget-object v8, v7, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-static {v2, v6, v8}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v0, v0, 0x1

    move-object v2, v3

    goto :goto_3

    :cond_5
    #v8=(Conflicted);
    const-string v8, "end_desc"

    #v8=(Reference);
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/baidu/mapapi/search/MKStep;->a(Ljava/lang/String;)V

    const-string v8, "end_loc"

    invoke-static {v2, v8}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/baidu/mapapi/search/MKStep;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    goto :goto_4

    :cond_6
    #v3=(Integer);v6=(Conflicted);v8=(Conflicted);
    new-instance v0, Lcom/baidu/mapapi/search/MKStep;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKStep;-><init>()V

    #v0=(Reference);
    const-string v3, "end_desc"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/search/MKStep;->a(Ljava/lang/String;)V

    const-string v3, "end_loc"

    invoke-static {v2, v3}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/search/MKStep;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v9=(Conflicted);
    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->a(Lcom/baidu/mapapi/search/MKRouteAddrResult;)V

    const/4 v3, 0x1

    #v3=(One);
    goto/16 :goto_0

    :cond_8
    #v0=(Reference);v2=(Reference);v3=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move-object v2, v1

    #v2=(Null);
    goto/16 :goto_2

    :cond_9
    #v2=(Conflicted);
    move-object v0, v1

    #v0=(Null);
    goto/16 :goto_1
.end method

.method public static a(Ljava/lang/String;Lcom/baidu/mapapi/search/e;)Z
    .locals 8

    const/4 v1, 0x0

    #v1=(Null);
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return v0

    :cond_1
    :try_start_0
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    if-eqz v0, :cond_a

    const-string v2, "content"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_2

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Reference);
    const-string v2, "uid"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lcom/baidu/mapapi/search/e;->d:Ljava/lang/String;

    const-string v2, "addr"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lcom/baidu/mapapi/search/e;->b:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lcom/baidu/mapapi/search/e;->a:Ljava/lang/String;

    const-string v2, "ext"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_7

    const-string v0, "detail_info"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    #v4=(Reference);
    if-eqz v4, :cond_5

    const-string v0, "environment_rating"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->i:Ljava/lang/String;

    const-string v0, "image"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->e:Ljava/lang/String;

    const-string v0, "link"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    #v5=(Reference);
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->o:Ljava/util/List;

    move v2, v1

    :goto_1
    #v0=(Conflicted);v2=(Integer);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    #v0=(Integer);
    if-ge v2, v0, :cond_4

    invoke-virtual {v5, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lorg/json/JSONObject;

    const-string v6, "dianping"

    #v6=(Reference);
    const-string v7, "name"

    #v7=(Reference);
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_3

    new-instance v6, Lcom/baidu/mapapi/search/d;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/baidu/mapapi/search/d;-><init>()V

    #v6=(Reference);
    const-string v7, "cn_name"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/baidu/mapapi/search/d;->b:Ljava/lang/String;

    const-string v7, "url"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/baidu/mapapi/search/d;->c:Ljava/lang/String;

    const-string v7, "name"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lcom/baidu/mapapi/search/d;->d:Ljava/lang/String;

    iget-object v0, p1, Lcom/baidu/mapapi/search/e;->o:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    #v6=(Conflicted);
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_1

    :cond_4
    #v0=(Conflicted);v2=(Conflicted);v7=(Conflicted);
    const-string v0, "overall_rating"

    #v0=(Reference);
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->f:Ljava/lang/String;

    const-string v0, "phone"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->c:Ljava/lang/String;

    const-string v0, "price"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->g:Ljava/lang/String;

    const-string v0, "service_rating"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->j:Ljava/lang/String;

    const-string v0, "taste_rating"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->h:Ljava/lang/String;

    :cond_5
    #v5=(Conflicted);
    const-string v0, "rich_info"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v2, "description"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lcom/baidu/mapapi/search/e;->k:Ljava/lang/String;

    const-string v2, "recommendation"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->l:Ljava/lang/String;

    :cond_6
    #v2=(Conflicted);
    const-string v0, "review"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_7

    move v2, v1

    :goto_2
    #v2=(Integer);v4=(Conflicted);
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_7

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lorg/json/JSONObject;

    const-string v4, "dianping.com"

    #v4=(Reference);
    const-string v5, "from"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_9

    const-string v4, "info"

    #v4=(Reference);
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_9

    move v0, v1

    :goto_3
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    #v5=(Integer);
    if-ge v0, v5, :cond_9

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    #v5=(Reference);
    if-eqz v5, :cond_8

    const-string v0, "content"

    #v0=(Reference);
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/baidu/mapapi/search/e;->m:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto/16 :goto_0

    :cond_8
    #v0=(Integer);v2=(Integer);v4=(Reference);v5=(Reference);
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_9
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_2

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_a
    move v0, v1

    #v0=(Null);
    goto/16 :goto_0
.end method

.method public static b(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKRoute;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 v1, 0x0

    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    return-object v1

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
    new-instance v7, Lorg/json/JSONObject;

    #v7=(UninitRef);
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    #v7=(Reference);
    const-string v1, "result_type"

    #v1=(Reference);
    const/16 v2, 0x14

    #v2=(PosByte);
    invoke-virtual {v7, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance v8, Lorg/json/JSONArray;

    #v8=(UninitRef);
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    #v8=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    move v6, v1

    :goto_1
    #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v6, v1, :cond_d

    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/mapapi/search/MKRoute;

    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKRoute;->getRouteType()I

    move-result v2

    const/4 v3, 0x3

    #v3=(PosByte);
    if-ne v2, v3, :cond_1

    const-string v2, "result_buslinedetail"

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v7, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_1
    #v2=(Conflicted);v3=(PosByte);
    new-instance v9, Lorg/json/JSONObject;

    #v9=(UninitRef);
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    #v9=(Reference);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    #v2=(Reference);
    const-string v3, "uid"

    #v3=(Reference);
    const-string v4, ""

    #v4=(Reference);
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKRoute;->getStart()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKRoute;->getStart()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    invoke-static {v4}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    const-string v5, "x"

    #v5=(Reference);
    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v10

    #v10=(Integer);
    invoke-virtual {v3, v5, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "y"

    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "geopt"

    #v4=(Reference);
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    #v5=(Conflicted);v10=(Conflicted);
    const-string v3, "start_point"

    invoke-virtual {v9, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    #v2=(Reference);
    const-string v3, "uid"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    #v3=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKRoute;->getEnd()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKRoute;->getEnd()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    invoke-static {v4}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    const-string v5, "x"

    #v5=(Reference);
    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v10

    #v10=(Integer);
    invoke-virtual {v3, v5, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "y"

    invoke-virtual {v4}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "geopt"

    #v4=(Reference);
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    #v5=(Conflicted);v10=(Conflicted);
    const-string v3, "end_point"

    invoke-virtual {v9, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKRoute;->getNumSteps()I

    move-result v10

    #v10=(Integer);
    iget-object v11, v1, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    #v11=(Reference);
    new-instance v12, Lorg/json/JSONArray;

    #v12=(UninitRef);
    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    #v12=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    move v5, v2

    :goto_2
    #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Integer);
    if-ge v5, v10, :cond_c

    new-instance v13, Lorg/json/JSONObject;

    #v13=(UninitRef);
    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    #v13=(Reference);
    invoke-virtual {v1, v5}, Lcom/baidu/mapapi/search/MKRoute;->getStep(I)Lcom/baidu/mapapi/search/MKStep;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "direction"

    #v3=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKStep;->a()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v13, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKStep;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKStep;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    #v4=(Reference);
    const-string v14, "x"

    #v14=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v15

    #v15=(Integer);
    invoke-virtual {v4, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v14, "y"

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v4, v14, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v3, "end_loc_pt"

    #v3=(Reference);
    invoke-virtual {v13, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    #v4=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    const-string v3, "end_desc"

    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKStep;->getContent()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v13, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKRoute;->getRouteType()I

    move-result v3

    #v3=(Integer);
    const/4 v4, 0x3

    #v4=(PosByte);
    if-ne v3, v4, :cond_8

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    if-le v2, v5, :cond_7

    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/util/ArrayList;

    new-instance v14, Lorg/json/JSONArray;

    #v14=(UninitRef);
    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    #v14=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    move v4, v3

    :goto_3
    #v3=(Integer);v4=(Integer);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_6

    new-instance v15, Lorg/json/JSONObject;

    #v15=(UninitRef);
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    #v15=(Reference);
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v3, :cond_5

    const-string v16, "x"

    #v16=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v17

    #v17=(Integer);
    invoke-virtual/range {v15 .. v17}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v16, "y"

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    move-object/from16 v0, v16

    invoke-virtual {v15, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v14, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_5
    #v3=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    add-int/lit8 v3, v4, 0x1

    #v3=(Integer);
    move v4, v3

    goto :goto_3

    :cond_6
    #v15=(Conflicted);
    const-string v2, "pathPt"

    invoke-virtual {v13, v2, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    :goto_4
    #v2=(Conflicted);v3=(Conflicted);v14=(Conflicted);
    invoke-virtual {v12, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v5, 0x1

    #v2=(Integer);
    move v5, v2

    goto/16 :goto_2

    :cond_8
    #v2=(Reference);v3=(Integer);v4=(PosByte);
    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKRoute;->getRouteType()I

    move-result v3

    const/4 v4, 0x1

    #v4=(One);
    if-ne v3, v4, :cond_9

    if-ge v5, v10, :cond_7

    const-string v3, "path"

    #v3=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/search/MKStep;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    move-exception v1

    :goto_5
    #v1=(Reference);
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    :cond_9
    #v0=(Reference);v2=(Reference);v3=(Integer);v4=(One);v5=(Integer);v6=(Integer);v8=(Reference);v9=(Reference);v10=(Integer);v11=(Reference);v12=(Reference);v13=(Reference);
    add-int/lit8 v2, v10, -0x1

    #v2=(Integer);
    if-ge v5, v2, :cond_7

    :try_start_1
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/util/ArrayList;

    new-instance v14, Lorg/json/JSONArray;

    #v14=(UninitRef);
    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    #v14=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    move v4, v3

    :goto_6
    #v3=(Integer);v4=(Integer);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_b

    new-instance v15, Lorg/json/JSONObject;

    #v15=(UninitRef);
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    #v15=(Reference);
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v3, :cond_a

    const-string v16, "x"

    #v16=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v17

    #v17=(Integer);
    invoke-virtual/range {v15 .. v17}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v16, "y"

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    move-object/from16 v0, v16

    invoke-virtual {v15, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v14, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_a
    #v3=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    add-int/lit8 v3, v4, 0x1

    #v3=(Integer);
    move v4, v3

    goto :goto_6

    :cond_b
    #v15=(Conflicted);
    const-string v2, "pathPt"

    invoke-virtual {v13, v2, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_4

    :cond_c
    #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    const-string v1, "steps"

    invoke-virtual {v9, v1, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v1, v6, 0x1

    #v1=(Integer);
    move v6, v1

    goto/16 :goto_1

    :cond_d
    #v0=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    #v1=(Reference);
    const-string v2, "legs"

    #v2=(Reference);
    invoke-virtual {v1, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "routes"

    invoke-virtual {v7, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5
.end method

.method private static b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKPoiInfo;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    const/4 v0, 0x0

    :goto_1
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    #v3=(Integer);
    if-ge v0, v3, :cond_2

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    #v3=(Reference);
    new-instance v4, Lcom/baidu/mapapi/search/MKPoiInfo;

    #v4=(UninitRef);
    invoke-direct {v4}, Lcom/baidu/mapapi/search/MKPoiInfo;-><init>()V

    #v4=(Reference);
    const-string v5, "addr"

    #v5=(Reference);
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->address:Ljava/lang/String;

    const-string v5, "tel"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->phoneNum:Ljava/lang/String;

    const-string v5, "uid"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    const-string v5, "zip"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->postCode:Ljava/lang/String;

    const-string v5, "name"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->name:Ljava/lang/String;

    const-string v5, "point"

    invoke-static {v3, v5}, Lcom/baidu/mapapi/search/c;->g(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    iput-object v3, v4, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    #v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0
.end method

.method private static b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {p0}, Lcom/baidu/platform/comjni/tools/a;->a(Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/a;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v2, v0, Lcom/baidu/platform/comapi/basestruct/a;->d:Ljava/util/ArrayList;

    #v2=(Reference);
    if-eqz v2, :cond_1

    iget-object v0, v0, Lcom/baidu/platform/comapi/basestruct/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    move v2, v1

    :goto_0
    #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/c;

    new-instance v3, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v3=(UninitRef);
    iget v4, v1, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v4=(Integer);
    div-int/lit8 v4, v4, 0x64

    iget v5, v1, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v5=(Integer);
    div-int/lit8 v5, v5, 0x64

    invoke-direct {v3, v4, v5}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v3=(Reference);
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v3=(UninitRef);
    iget v4, v1, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    div-int/lit8 v4, v4, 0x64

    iget v1, v1, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v1=(Integer);
    div-int/lit8 v1, v1, 0x64

    invoke-direct {v3, v4, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v3=(Reference);
    invoke-static {v3}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v2, 0x1

    #v1=(Integer);
    move v2, v1

    goto :goto_0

    :cond_0
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {p1}, Ljava/util/ArrayList;->trimToSize()V

    invoke-virtual {p2}, Ljava/util/ArrayList;->trimToSize()V

    :cond_1
    #v2=(Conflicted);
    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/baidu/mapapi/search/MKAddrInfo;)Z
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    :try_start_0
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    if-eqz v1, :cond_0

    const-string v2, "error"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    if-nez v2, :cond_0

    const/4 v2, 0x0

    #v2=(Null);
    iput v2, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->type:I

    const-string v2, "y"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    const-string v3, "x"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    new-instance v4, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v4=(UninitRef);
    invoke-direct {v4, v2, v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v4=(Reference);
    invoke-static {v4}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v2

    #v2=(Reference);
    iput-object v2, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->geoPt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    const-string v2, "addr"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Lcom/baidu/mapapi/search/MKAddrInfo;->strAddr:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :catch_0
    #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPoiResult;I)Z
    .locals 13

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    #v4=(Reference);
    invoke-virtual {p1, v4}, Lcom/baidu/mapapi/search/MKPoiResult;->b(Ljava/util/ArrayList;)V

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, "content"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    #v5=(Reference);
    const-string v3, "result"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    #v6=(Reference);
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_3

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_3

    move v3, v1

    :goto_0
    #v3=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v3, v2, :cond_3

    new-instance v7, Lcom/baidu/mapapi/search/MKPoiResult;

    #v7=(UninitRef);
    invoke-direct {v7}, Lcom/baidu/mapapi/search/MKPoiResult;-><init>()V

    #v7=(Reference);
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    #v2=(Reference);
    const-string v8, "cont"

    #v8=(Reference);
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_1

    new-instance v9, Ljava/util/ArrayList;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    #v9=(Reference);
    move v2, v1

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v10

    #v10=(Integer);
    if-ge v2, v10, :cond_0

    invoke-virtual {v8, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    #v10=(Reference);
    new-instance v11, Lcom/baidu/mapapi/search/MKPoiInfo;

    #v11=(UninitRef);
    invoke-direct {v11}, Lcom/baidu/mapapi/search/MKPoiInfo;-><init>()V

    #v11=(Reference);
    const-string v12, "name"

    #v12=(Reference);
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v11, Lcom/baidu/mapapi/search/MKPoiInfo;->name:Ljava/lang/String;

    const-string v12, "addr"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v11, Lcom/baidu/mapapi/search/MKPoiInfo;->address:Ljava/lang/String;

    const-string v12, "geo"

    invoke-static {v10, v12}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v12

    iput-object v12, v11, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    const-string v12, "uid"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v11, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    const-string v12, "tel"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v11, Lcom/baidu/mapapi/search/MKPoiInfo;->phoneNum:Ljava/lang/String;

    const-string v12, "type"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    #v10=(Integer);
    iput v10, v11, Lcom/baidu/mapapi/search/MKPoiInfo;->ePoiType:I

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    #v11=(Conflicted);v12=(Conflicted);
    invoke-virtual {v7, v9}, Lcom/baidu/mapapi/search/MKPoiResult;->a(Ljava/util/ArrayList;)V

    :cond_1
    #v2=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {v6, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    #v2=(Reference);
    const-string v8, "total"

    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v7, v8}, Lcom/baidu/mapapi/search/MKPoiResult;->b(I)V

    const-string v9, "page_num"

    #v9=(Reference);
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    #v9=(Integer);
    invoke-virtual {v7, v9}, Lcom/baidu/mapapi/search/MKPoiResult;->d(I)V

    const-string v9, "count"

    #v9=(Reference);
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v7, v2}, Lcom/baidu/mapapi/search/MKPoiResult;->a(I)V

    invoke-virtual {v7, p2}, Lcom/baidu/mapapi/search/MKPoiResult;->d(I)V

    div-int v9, v8, v2

    #v9=(Integer);
    rem-int v2, v8, v2

    if-lez v2, :cond_2

    move v2, v0

    :goto_2
    #v2=(Boolean);
    add-int/2addr v2, v9

    #v2=(Integer);
    invoke-virtual {v7, v2}, Lcom/baidu/mapapi/search/MKPoiResult;->c(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto/16 :goto_0

    :cond_2
    move v2, v1

    #v2=(Null);
    goto :goto_2

    :catch_0
    #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    move v0, v1

    :cond_3
    #v0=(Boolean);
    return v0
.end method

.method private static c(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;
    .locals 3

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    #v1=(Reference);
    new-instance v0, Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;-><init>()V

    #v0=(Reference);
    const-string v2, "city"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;->city:Ljava/lang/String;

    const-string v2, "district"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;->district:Ljava/lang/String;

    const-string v2, "province"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;->province:Ljava/lang/String;

    const-string v2, "street"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;->street:Ljava/lang/String;

    const-string v2, "street_number"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/baidu/mapapi/search/MKGeocoderAddressComponent;->streetNumber:Ljava/lang/String;

    goto :goto_0
.end method

.method public static c(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKPoiInfo;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    #v2=(Reference);
    const-string v0, "result_type"

    #v0=(Reference);
    const/16 v1, 0xb

    #v1=(PosByte);
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONArray;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    #v3=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_1
    #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/search/MKPoiInfo;

    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    #v4=(Reference);
    const-string v5, "uid"

    #v5=(Reference);
    iget-object v6, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->uid:Ljava/lang/String;

    #v6=(Reference);
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "type"

    iget v6, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->ePoiType:I

    #v6=(Integer);
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "name"

    iget-object v6, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->name:Ljava/lang/String;

    #v6=(Reference);
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v5, Lorg/json/JSONObject;

    #v5=(UninitRef);
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    #v5=(Reference);
    iget-object v6, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v6, :cond_1

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    const-string v6, "x"

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v7

    #v7=(Integer);
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v6, "y"

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "geopt"

    #v0=(Reference);
    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    #v7=(Conflicted);
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :cond_2
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    const-string v0, "pois"

    #v0=(Reference);
    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_2
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_2
.end method

.method private static d(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/mapapi/search/MKPlanNode;
    .locals 3

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    #v1=(Reference);
    new-instance v0, Lcom/baidu/mapapi/search/MKPlanNode;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKPlanNode;-><init>()V

    #v0=(Reference);
    const-string v2, "name"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    const-string v2, "geo"

    invoke-static {v1, v2}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    iput-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    goto :goto_0
.end method

.method private static e(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/search/MKWpNode;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    const/4 v0, 0x0

    :goto_1
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    #v3=(Integer);
    if-ge v0, v3, :cond_3

    new-instance v3, Lcom/baidu/mapapi/search/MKWpNode;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/baidu/mapapi/search/MKWpNode;-><init>()V

    :try_start_0
    #v3=(Reference);
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    #v4=(Reference);
    const-string v5, "name"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/baidu/mapapi/search/MKWpNode;->name:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "bus_stop"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_2

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    #v4=(Reference);
    const-string v5, "bus_stop"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v4

    #v4=(Boolean);
    iput-boolean v4, v3, Lcom/baidu/mapapi/search/MKWpNode;->a:Z

    :cond_2
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    #v4=(Reference);
    const-string v5, "geo"

    invoke-static {v4, v5}, Lcom/baidu/mapapi/search/c;->f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v4

    iput-object v4, v3, Lcom/baidu/mapapi/search/MKWpNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    #v4=(Conflicted);v5=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    #v3=(Integer);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0

    :catch_0
    #v0=(Integer);v3=(Reference);
    move-exception v3

    goto :goto_2
.end method

.method private static f(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    if-eqz p0, :cond_0

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sget-object v1, Lcom/baidu/mapapi/search/c;->a:Landroid/os/Bundle;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/os/Bundle;->clear()V

    sget-object v1, Lcom/baidu/mapapi/search/c;->a:Landroid/os/Bundle;

    const-string v2, "strkey"

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/baidu/mapapi/search/c;->a:Landroid/os/Bundle;

    invoke-static {v0}, Lcom/baidu/platform/comjni/tools/JNITools;->TransGeoStr2Pt(Ljava/lang/Object;)Z

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(UninitRef);
    invoke-direct {v0, v3, v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/mapapi/search/c;->a:Landroid/os/Bundle;

    const-string v2, "ptx"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->setLongitudeE6(I)V

    sget-object v1, Lcom/baidu/mapapi/search/c;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v2, "pty"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->setLatitudeE6(I)V

    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    goto :goto_0
.end method

.method private static g(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    const-string v0, "x"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    const-string v2, "y"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    new-instance v2, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(UninitRef);
    invoke-direct {v2, v1, v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0
.end method

*/}
