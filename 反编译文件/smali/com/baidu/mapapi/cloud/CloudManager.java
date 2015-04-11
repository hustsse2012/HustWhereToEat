package com.baidu.mapapi.cloud; class CloudManager {/*

.class public Lcom/baidu/mapapi/cloud/CloudManager;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;

.field private static c:Lcom/baidu/mapapi/cloud/CloudManager;


# instance fields
.field private b:Landroid/os/Bundle;

.field private d:Lcom/baidu/platform/comjni/map/cloud/a;

.field private e:Landroid/os/Handler;

.field private f:Lcom/baidu/mapapi/cloud/CloudListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/baidu/mapapi/cloud/CloudManager;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapapi/cloud/CloudManager;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->b:Landroid/os/Bundle;

    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/cloud/CloudManager;)Lcom/baidu/mapapi/cloud/CloudListener;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->f:Lcom/baidu/mapapi/cloud/CloudListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/mapapi/cloud/CloudManager;->a:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private a(I)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->a(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-gtz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    #v1=(Conflicted);
    return-object v0
.end method

.method static synthetic a(Lcom/baidu/mapapi/cloud/CloudManager;I)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/cloud/CloudManager;->a(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method private a(Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;)Z
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->a()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->b:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v2, "url"

    #v2=(Reference);
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    iget-object v1, p0, Lcom/baidu/mapapi/cloud/CloudManager;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/cloud/a;->a(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public static getInstance()Lcom/baidu/mapapi/cloud/CloudManager;
    .locals 1

    sget-object v0, Lcom/baidu/mapapi/cloud/CloudManager;->c:Lcom/baidu/mapapi/cloud/CloudManager;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/mapapi/cloud/CloudManager;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/cloud/CloudManager;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/cloud/CloudManager;->c:Lcom/baidu/mapapi/cloud/CloudManager;

    :cond_0
    sget-object v0, Lcom/baidu/mapapi/cloud/CloudManager;->c:Lcom/baidu/mapapi/cloud/CloudManager;

    return-object v0
.end method


# virtual methods
.method public boundSearch(Lcom/baidu/mapapi/cloud/BoundSearchInfo;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public destory()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->e:Landroid/os/Handler;

    #v0=(Reference);
    if-eqz v0, :cond_0

    const/16 v0, 0x7d0

    #v0=(PosShort);
    iget-object v1, p0, Lcom/baidu/mapapi/cloud/CloudManager;->e:Landroid/os/Handler;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/cloud/a;->b()I

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    :cond_1
    #v0=(Reference);
    return-void
.end method

.method public detailSearch(Lcom/baidu/mapapi/cloud/DetailSearchInfo;)Z
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/mapapi/cloud/DetailSearchInfo;->a()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->b:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v2, "url"

    #v2=(Reference);
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    iget-object v1, p0, Lcom/baidu/mapapi/cloud/CloudManager;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/cloud/a;->b(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public init(Lcom/baidu/mapapi/cloud/CloudListener;)Z
    .locals 2

    iput-object p1, p0, Lcom/baidu/mapapi/cloud/CloudManager;->f:Lcom/baidu/mapapi/cloud/CloudListener;

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    #v0=(Reference);
    if-nez v0, :cond_1

    new-instance v0, Lcom/baidu/platform/comjni/map/cloud/a;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comjni/map/cloud/a;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/cloud/a;->a()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->d:Lcom/baidu/platform/comjni/map/cloud/a;

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Integer);v1=(Uninit);
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->b:Landroid/os/Bundle;

    new-instance v0, Lcom/baidu/mapapi/cloud/a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/mapapi/cloud/a;-><init>(Lcom/baidu/mapapi/cloud/CloudManager;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudManager;->e:Landroid/os/Handler;

    const/high16 v0, 0x2

    #v0=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/cloud/CloudManager;->e:Landroid/os/Handler;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public localSearch(Lcom/baidu/mapapi/cloud/LocalSearchInfo;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public nearbySearch(Lcom/baidu/mapapi/cloud/NearbySearchInfo;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
