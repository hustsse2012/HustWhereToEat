package com.baidu.platform.comjni.map.commonmemcache; class a {/*

.class public Lcom/baidu/platform/comjni/map/commonmemcache/a;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->b:Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;

    new-instance v0, Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->b:Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->b:Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;->Create()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->a:I

    iget v0, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->a:I

    return v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->b:Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1, p1}, Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;->Init(ILandroid/os/Bundle;)V

    return-void
.end method

.method public b()I
    .locals 2

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->b:Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/platform/comjni/map/commonmemcache/a;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/commonmemcache/JNICommonMemCache;->Release(I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

*/}
