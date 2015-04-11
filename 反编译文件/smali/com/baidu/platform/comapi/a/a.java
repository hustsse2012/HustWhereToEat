package com.baidu.platform.comapi.a; class a {/*

.class public Lcom/baidu/platform/comapi/a/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/baidu/platform/comapi/a/a;


# instance fields
.field private b:Lcom/baidu/platform/comjni/base/location/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/platform/comapi/a/a;->a:Lcom/baidu/platform/comapi/a/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/a/a;->b:Lcom/baidu/platform/comjni/base/location/a;

    return-void
.end method

.method public static a()Lcom/baidu/platform/comapi/a/a;
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/a/a;->a:Lcom/baidu/platform/comapi/a/a;

    #v1=(Reference);
    if-nez v1, :cond_0

    new-instance v1, Lcom/baidu/platform/comapi/a/a;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/a/a;-><init>()V

    #v1=(Reference);
    sput-object v1, Lcom/baidu/platform/comapi/a/a;->a:Lcom/baidu/platform/comapi/a/a;

    sget-object v1, Lcom/baidu/platform/comapi/a/a;->a:Lcom/baidu/platform/comapi/a/a;

    invoke-direct {v1}, Lcom/baidu/platform/comapi/a/a;->b()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    sput-object v0, Lcom/baidu/platform/comapi/a/a;->a:Lcom/baidu/platform/comapi/a/a;

    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/a/a;->a:Lcom/baidu/platform/comapi/a/a;

    #v0=(Reference);
    goto :goto_0
.end method

.method private b()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/a/a;->b:Lcom/baidu/platform/comjni/base/location/a;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/platform/comjni/base/location/a;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comjni/base/location/a;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/a/a;->b:Lcom/baidu/platform/comjni/base/location/a;

    iget-object v0, p0, Lcom/baidu/platform/comapi/a/a;->b:Lcom/baidu/platform/comjni/base/location/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/base/location/a;->a()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/a/a;->b:Lcom/baidu/platform/comjni/base/location/a;

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method


# virtual methods
.method public a(FFLjava/lang/String;)Lcom/baidu/platform/comapi/basestruct/c;
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    if-nez p3, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Null);
    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    const-string p3, "bd09ll"

    :cond_2
    const-string v1, "bd09ll"

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    const-string v1, "bd09mc"

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    const-string v1, "gcj02"

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    const-string v1, "wgs84"

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    :cond_3
    const-string v1, "bd09mc"

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/c;

    #v0=(UninitRef);
    float-to-int v1, p1

    #v1=(Integer);
    float-to-int v2, p2

    #v2=(Integer);
    invoke-direct {v0, v1, v2}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v0=(Reference);
    goto :goto_0

    :cond_4
    #v0=(Null);v1=(Boolean);v2=(Uninit);
    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/platform/comapi/a/a;->b:Lcom/baidu/platform/comjni/base/location/a;

    #v2=(Reference);
    invoke-virtual {v2, p1, p2, v1, p3}, Lcom/baidu/platform/comjni/base/location/a;->a(FFLandroid/os/Bundle;Ljava/lang/String;)Z

    invoke-virtual {v1}, Landroid/os/Bundle;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/c;

    #v0=(UninitRef);
    invoke-direct {v0, v3, v3}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v0=(Reference);
    const-string v2, "x"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    double-to-int v2, v2

    #v2=(Integer);
    invoke-virtual {v0, v2}, Lcom/baidu/platform/comapi/basestruct/c;->a(I)V

    const-string v2, "y"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    #v1=(DoubleLo);v2=(DoubleHi);
    double-to-int v1, v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/basestruct/c;->b(I)V

    goto :goto_0
.end method

*/}
