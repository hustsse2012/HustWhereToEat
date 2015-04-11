package com.baidu.platform.comapi.map; class h {/*

.class public Lcom/baidu/platform/comapi/map/h;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/baidu/platform/comjni/map/basemap/a;

.field private static b:Lcom/baidu/platform/comapi/map/h;

.field private static c:Lcom/baidu/platform/comapi/map/m;

.field private static d:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    sput-object v0, Lcom/baidu/platform/comapi/map/h;->b:Lcom/baidu/platform/comapi/map/h;

    sput-object v0, Lcom/baidu/platform/comapi/map/h;->c:Lcom/baidu/platform/comapi/map/m;

    sput-object v0, Lcom/baidu/platform/comapi/map/h;->d:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/h;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->b:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/platform/comapi/map/h;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comapi/map/h;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/map/h;->b:Lcom/baidu/platform/comapi/map/h;

    :cond_0
    sget-object v0, Lcom/baidu/platform/comapi/map/h;->b:Lcom/baidu/platform/comapi/map/h;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->b:Lcom/baidu/platform/comapi/map/h;

    invoke-direct {v0, p0}, Lcom/baidu/platform/comapi/map/h;->b(Lcom/baidu/platform/comapi/map/o;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->b:Lcom/baidu/platform/comapi/map/h;

    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_1
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static a()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    if-eqz v0, :cond_3

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->b:Lcom/baidu/platform/comapi/map/h;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const v0, 0xff09

    #v0=(Char);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->d:Landroid/os/Handler;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    sput-object v2, Lcom/baidu/platform/comapi/map/h;->d:Landroid/os/Handler;

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    sget-object v0, Lcom/baidu/platform/comapi/map/h;->c:Lcom/baidu/platform/comapi/map/m;

    #v0=(Reference);
    if-eqz v0, :cond_1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->c:Lcom/baidu/platform/comapi/map/m;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/m;->a()V

    sput-object v2, Lcom/baidu/platform/comapi/map/h;->c:Lcom/baidu/platform/comapi/map/m;

    :cond_1
    sput-object v2, Lcom/baidu/platform/comapi/map/h;->b:Lcom/baidu/platform/comapi/map/h;

    :cond_2
    sput-object v2, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    :cond_3
    return-void
.end method

.method private b(Lcom/baidu/platform/comapi/map/o;)Z
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-nez v1, :cond_2

    invoke-virtual {p1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    sput-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    :cond_2
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    if-eqz v1, :cond_0

    new-instance v0, Lcom/baidu/platform/comapi/map/m;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comapi/map/m;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/map/h;->c:Lcom/baidu/platform/comapi/map/m;

    new-instance v0, Lcom/baidu/platform/comapi/map/i;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/platform/comapi/map/i;-><init>(Lcom/baidu/platform/comapi/map/h;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/map/h;->d:Landroid/os/Handler;

    const v0, 0xff09

    #v0=(Char);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->d:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method static synthetic e()Lcom/baidu/platform/comapi/map/m;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->c:Lcom/baidu/platform/comapi/map/m;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/map/g;",
            ">;"
        }
    .end annotation

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    const-string v1, ""

    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v1, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_0

    const-string v1, ""

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    #v1=(Reference);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    const-string v2, "dataset"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    #v5=(Reference);
    if-eqz v5, :cond_0

    move v4, v3

    :goto_1
    #v2=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-ge v4, v2, :cond_4

    new-instance v6, Lcom/baidu/platform/comapi/map/g;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/baidu/platform/comapi/map/g;-><init>()V

    #v6=(Reference);
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    #v2=(Reference);
    const-string v7, "id"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->a:I

    const-string v7, "name"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/baidu/platform/comapi/map/g;->b:Ljava/lang/String;

    const-string v7, "size"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->c:I

    const-string v7, "cty"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->d:I

    const-string v7, "child"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_3

    const-string v7, "child"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    #v8=(Reference);
    move v2, v3

    :goto_2
    #v2=(Integer);
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v9

    #v9=(Integer);
    if-ge v2, v9, :cond_2

    new-instance v9, Lcom/baidu/platform/comapi/map/g;

    #v9=(UninitRef);
    invoke-direct {v9}, Lcom/baidu/platform/comapi/map/g;-><init>()V

    #v9=(Reference);
    invoke-virtual {v7, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    #v10=(Reference);
    const-string v11, "id"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    #v11=(Integer);
    iput v11, v9, Lcom/baidu/platform/comapi/map/g;->a:I

    const-string v11, "name"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v9, Lcom/baidu/platform/comapi/map/g;->b:Ljava/lang/String;

    const-string v11, "size"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    #v11=(Integer);
    iput v11, v9, Lcom/baidu/platform/comapi/map/g;->c:I

    const-string v11, "cty"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    #v10=(Integer);
    iput v10, v9, Lcom/baidu/platform/comapi/map/g;->d:I

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    #v9=(Integer);v10=(Conflicted);v11=(Conflicted);
    invoke-virtual {v6, v8}, Lcom/baidu/platform/comapi/map/g;->a(Ljava/util/ArrayList;)V

    :cond_3
    #v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    move v4, v2

    goto/16 :goto_1

    :catch_0
    #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto/16 :goto_0

    :cond_4
    #v2=(Integer);v4=(Integer);v5=(Reference);
    move-object v0, v1

    #v0=(Reference);
    goto/16 :goto_0
.end method

.method public a(Lcom/baidu/platform/comapi/map/l;)V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->c:Lcom/baidu/platform/comapi/map/m;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/m;->a(Lcom/baidu/platform/comapi/map/l;)V

    return-void
.end method

.method public a(I)Z
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Reference);
    sget-object v0, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v0, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->d(I)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public a(Z)Z
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    sget-object v0, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v0, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(Z)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/map/g;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-nez v1, :cond_0

    :goto_0
    #v0=(Reference);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Null);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    const-string v1, ""

    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v1}, Lcom/baidu/platform/comjni/map/basemap/a;->i()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    #v1=(Reference);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    const-string v2, "dataset"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    #v5=(Reference);
    move v4, v3

    :goto_1
    #v2=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-ge v4, v2, :cond_3

    new-instance v6, Lcom/baidu/platform/comapi/map/g;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/baidu/platform/comapi/map/g;-><init>()V

    #v6=(Reference);
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    #v2=(Reference);
    const-string v7, "id"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->a:I

    const-string v7, "name"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/baidu/platform/comapi/map/g;->b:Ljava/lang/String;

    const-string v7, "size"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->c:I

    const-string v7, "cty"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->d:I

    const-string v7, "child"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_2

    const-string v7, "child"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    #v8=(Reference);
    move v2, v3

    :goto_2
    #v2=(Integer);
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v9

    #v9=(Integer);
    if-ge v2, v9, :cond_1

    new-instance v9, Lcom/baidu/platform/comapi/map/g;

    #v9=(UninitRef);
    invoke-direct {v9}, Lcom/baidu/platform/comapi/map/g;-><init>()V

    #v9=(Reference);
    invoke-virtual {v7, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    #v10=(Reference);
    const-string v11, "id"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    #v11=(Integer);
    iput v11, v9, Lcom/baidu/platform/comapi/map/g;->a:I

    const-string v11, "name"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v9, Lcom/baidu/platform/comapi/map/g;->b:Ljava/lang/String;

    const-string v11, "size"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    #v11=(Integer);
    iput v11, v9, Lcom/baidu/platform/comapi/map/g;->c:I

    const-string v11, "cty"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    #v10=(Integer);
    iput v10, v9, Lcom/baidu/platform/comapi/map/g;->d:I

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_1
    #v9=(Integer);v10=(Conflicted);v11=(Conflicted);
    invoke-virtual {v6, v8}, Lcom/baidu/platform/comapi/map/g;->a(Ljava/util/ArrayList;)V

    :cond_2
    #v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    move v4, v2

    goto/16 :goto_1

    :catch_0
    #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto/16 :goto_0

    :cond_3
    #v2=(Integer);v4=(Integer);v5=(Reference);
    move-object v0, v1

    #v0=(Reference);
    goto/16 :goto_0
.end method

.method public b(Lcom/baidu/platform/comapi/map/l;)V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/h;->c:Lcom/baidu/platform/comapi/map/m;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/m;->b(Lcom/baidu/platform/comapi/map/l;)V

    return-void
.end method

.method public b(I)Z
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-gez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v1, p1, v0, v0}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZI)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/map/g;",
            ">;"
        }
    .end annotation

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    const-string v1, ""

    #v1=(Reference);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    if-nez v1, :cond_0

    :goto_0
    #v0=(Reference);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Null);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    #v1=(Reference);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    const-string v2, "dataset"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    #v5=(Reference);
    move v4, v3

    :goto_1
    #v2=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v2

    #v2=(Integer);
    if-ge v4, v2, :cond_3

    new-instance v6, Lcom/baidu/platform/comapi/map/g;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/baidu/platform/comapi/map/g;-><init>()V

    #v6=(Reference);
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    #v2=(Reference);
    const-string v7, "id"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->a:I

    const-string v7, "name"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/baidu/platform/comapi/map/g;->b:Ljava/lang/String;

    const-string v7, "size"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->c:I

    const-string v7, "cty"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v6, Lcom/baidu/platform/comapi/map/g;->d:I

    const-string v7, "child"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_2

    const-string v7, "child"

    #v7=(Reference);
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    #v8=(Reference);
    move v2, v3

    :goto_2
    #v2=(Integer);
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v9

    #v9=(Integer);
    if-ge v2, v9, :cond_1

    new-instance v9, Lcom/baidu/platform/comapi/map/g;

    #v9=(UninitRef);
    invoke-direct {v9}, Lcom/baidu/platform/comapi/map/g;-><init>()V

    #v9=(Reference);
    invoke-virtual {v7, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    #v10=(Reference);
    const-string v11, "id"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    #v11=(Integer);
    iput v11, v9, Lcom/baidu/platform/comapi/map/g;->a:I

    const-string v11, "name"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v9, Lcom/baidu/platform/comapi/map/g;->b:Ljava/lang/String;

    const-string v11, "size"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    #v11=(Integer);
    iput v11, v9, Lcom/baidu/platform/comapi/map/g;->c:I

    const-string v11, "cty"

    #v11=(Reference);
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    #v10=(Integer);
    iput v10, v9, Lcom/baidu/platform/comapi/map/g;->d:I

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_1
    #v9=(Integer);v10=(Conflicted);v11=(Conflicted);
    invoke-virtual {v6, v8}, Lcom/baidu/platform/comapi/map/g;->a(Ljava/util/ArrayList;)V

    :cond_2
    #v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    move v4, v2

    goto/16 :goto_1

    :cond_3
    #v6=(Conflicted);
    move-object v0, v1

    #v0=(Reference);
    goto/16 :goto_0

    :catch_0
    #v0=(Null);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v1

    goto/16 :goto_0

    :catch_1
    move-exception v1

    goto/16 :goto_0
.end method

.method public c(I)Z
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-gez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v1, p1, v0, v0}, Lcom/baidu/platform/comjni/map/basemap/a;->b(IZI)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/map/k;",
            ">;"
        }
    .end annotation

    const/4 v9, 0x1

    #v9=(One);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    const-string v1, ""

    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v1}, Lcom/baidu/platform/comjni/map/basemap/a;->h()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_0

    const-string v1, ""

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    #v1=(Reference);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v3

    #v3=(Integer);
    if-eqz v3, :cond_0

    const-string v3, "dataset"

    #v3=(Reference);
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    :goto_1
    #v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    #v4=(Integer);
    if-ge v2, v4, :cond_4

    new-instance v4, Lcom/baidu/platform/comapi/map/k;

    #v4=(UninitRef);
    invoke-direct {v4}, Lcom/baidu/platform/comapi/map/k;-><init>()V

    #v4=(Reference);
    new-instance v5, Lcom/baidu/platform/comapi/map/j;

    #v5=(UninitRef);
    invoke-direct {v5}, Lcom/baidu/platform/comapi/map/j;-><init>()V

    #v5=(Reference);
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    #v6=(Reference);
    const-string v7, "id"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v5, Lcom/baidu/platform/comapi/map/j;->a:I

    const-string v7, "name"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v5, Lcom/baidu/platform/comapi/map/j;->b:Ljava/lang/String;

    const-string v7, "pinyin"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v5, Lcom/baidu/platform/comapi/map/j;->c:Ljava/lang/String;

    const-string v7, "size"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v5, Lcom/baidu/platform/comapi/map/j;->h:I

    const-string v7, "ratio"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v5, Lcom/baidu/platform/comapi/map/j;->i:I

    const-string v7, "status"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v5, Lcom/baidu/platform/comapi/map/j;->l:I

    new-instance v7, Lcom/baidu/platform/comapi/basestruct/c;

    #v7=(UninitRef);
    invoke-direct {v7}, Lcom/baidu/platform/comapi/basestruct/c;-><init>()V

    #v7=(Reference);
    iput-object v7, v5, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    iget-object v7, v5, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v8, "x"

    #v8=(Reference);
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v7, v8}, Lcom/baidu/platform/comapi/basestruct/c;->a(I)V

    iget-object v7, v5, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v8, "y"

    #v8=(Reference);
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v7, v8}, Lcom/baidu/platform/comapi/basestruct/c;->b(I)V

    const-string v7, "up"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    if-ne v7, v9, :cond_2

    const/4 v7, 0x1

    #v7=(One);
    iput-boolean v7, v5, Lcom/baidu/platform/comapi/map/j;->j:Z

    :goto_2
    #v7=(Boolean);
    const-string v7, "lev"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    iput v7, v5, Lcom/baidu/platform/comapi/map/j;->e:I

    iget-boolean v7, v5, Lcom/baidu/platform/comapi/map/j;->j:Z

    #v7=(Boolean);
    if-eqz v7, :cond_3

    const-string v7, "svr_size"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    #v6=(Integer);
    iput v6, v5, Lcom/baidu/platform/comapi/map/j;->k:I

    :goto_3
    #v7=(Conflicted);
    invoke-virtual {v4, v5}, Lcom/baidu/platform/comapi/map/k;->a(Lcom/baidu/platform/comapi/map/j;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_2
    #v6=(Reference);v7=(Integer);
    const/4 v7, 0x0

    #v7=(Null);
    iput-boolean v7, v5, Lcom/baidu/platform/comapi/map/j;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    :cond_3
    #v3=(Reference);v4=(Reference);v5=(Reference);v6=(Reference);v7=(Boolean);v8=(Integer);
    const/4 v6, 0x0

    :try_start_1
    #v6=(Null);
    iput v6, v5, Lcom/baidu/platform/comapi/map/j;->k:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :cond_4
    #v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-object v0, v1

    #v0=(Reference);
    goto/16 :goto_0
.end method

.method public d(I)Z
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-nez v1, :cond_0

    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(Null);v2=(Uninit);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v0, v2, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->b(IZI)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public e(I)Z
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-gez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v1, p1, v0}, Lcom/baidu/platform/comjni/map/basemap/a;->c(IZ)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public f(I)Lcom/baidu/platform/comapi/map/k;
    .locals 7

    const/4 v6, 0x1

    #v6=(One);
    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-gez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const-string v1, ""

    sget-object v1, Lcom/baidu/platform/comapi/map/h;->a:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v1, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->e(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_0

    const-string v1, ""

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    new-instance v1, Lcom/baidu/platform/comapi/map/k;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/map/k;-><init>()V

    #v1=(Reference);
    new-instance v3, Lcom/baidu/platform/comapi/map/j;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/baidu/platform/comapi/map/j;-><init>()V

    :try_start_0
    #v3=(Reference);
    new-instance v4, Lorg/json/JSONObject;

    #v4=(UninitRef);
    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    const-string v2, "id"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, v3, Lcom/baidu/platform/comapi/map/j;->a:I

    const-string v2, "name"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lcom/baidu/platform/comapi/map/j;->b:Ljava/lang/String;

    const-string v2, "pinyin"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lcom/baidu/platform/comapi/map/j;->c:Ljava/lang/String;

    const-string v2, "headchar"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lcom/baidu/platform/comapi/map/j;->d:Ljava/lang/String;

    const-string v2, "size"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, v3, Lcom/baidu/platform/comapi/map/j;->h:I

    const-string v2, "ratio"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, v3, Lcom/baidu/platform/comapi/map/j;->i:I

    const-string v2, "status"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, v3, Lcom/baidu/platform/comapi/map/j;->l:I

    new-instance v2, Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/platform/comapi/basestruct/c;-><init>()V

    #v2=(Reference);
    iput-object v2, v3, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    iget-object v2, v3, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v5, "x"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v2, v5}, Lcom/baidu/platform/comapi/basestruct/c;->a(I)V

    iget-object v2, v3, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v5, "y"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v2, v5}, Lcom/baidu/platform/comapi/basestruct/c;->b(I)V

    const-string v2, "up"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    if-ne v2, v6, :cond_2

    const/4 v2, 0x1

    #v2=(One);
    iput-boolean v2, v3, Lcom/baidu/platform/comapi/map/j;->j:Z

    :goto_1
    #v2=(Boolean);
    const-string v2, "lev"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, v3, Lcom/baidu/platform/comapi/map/j;->e:I

    const-string v2, "ver"

    #v2=(Reference);
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    iput v2, v3, Lcom/baidu/platform/comapi/map/j;->f:I

    invoke-virtual {v1, v3}, Lcom/baidu/platform/comapi/map/k;->a(Lcom/baidu/platform/comapi/map/j;)V

    move-object v0, v1

    #v0=(Reference);
    goto/16 :goto_0

    :cond_2
    #v0=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    iput-boolean v2, v3, Lcom/baidu/platform/comapi/map/j;->j:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto/16 :goto_0
.end method

*/}
