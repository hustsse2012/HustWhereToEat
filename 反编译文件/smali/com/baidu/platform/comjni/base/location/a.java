package com.baidu.platform.comjni.base.location; class a {/*

.class public Lcom/baidu/platform/comjni/base/location/a;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:Lcom/baidu/platform/comjni/base/location/JNILocation;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/platform/comjni/base/location/a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/platform/comjni/base/location/a;->b:Lcom/baidu/platform/comjni/base/location/JNILocation;

    new-instance v0, Lcom/baidu/platform/comjni/base/location/JNILocation;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comjni/base/location/JNILocation;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comjni/base/location/a;->b:Lcom/baidu/platform/comjni/base/location/JNILocation;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comjni/base/location/a;->b:Lcom/baidu/platform/comjni/base/location/JNILocation;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comjni/base/location/JNILocation;->Create()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/platform/comjni/base/location/a;->a:I

    iget v0, p0, Lcom/baidu/platform/comjni/base/location/a;->a:I

    return v0
.end method

.method public a(FFLandroid/os/Bundle;Ljava/lang/String;)Z
    .locals 6

    iget-object v0, p0, Lcom/baidu/platform/comjni/base/location/a;->b:Lcom/baidu/platform/comjni/base/location/JNILocation;

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/platform/comjni/base/location/a;->a:I

    #v1=(Integer);
    move v2, p1

    #v2=(Float);
    move v3, p2

    #v3=(Float);
    move-object v4, p3

    #v4=(Reference);
    move-object v5, p4

    #v5=(Reference);
    invoke-virtual/range {v0 .. v5}, Lcom/baidu/platform/comjni/base/location/JNILocation;->CoordinateEncryptEx(IFFLandroid/os/Bundle;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
