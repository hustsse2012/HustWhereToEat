package com.baidu.platform.comjni.tools; class b {/*

.class final Lcom/baidu/platform/comjni/tools/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/baidu/platform/comjni/tools/ParcelItem;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/baidu/platform/comjni/tools/ParcelItem;
    .locals 2

    new-instance v0, Lcom/baidu/platform/comjni/tools/ParcelItem;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comjni/tools/ParcelItem;-><init>()V

    #v0=(Reference);
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/tools/ParcelItem;->setBundle(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public a(I)[Lcom/baidu/platform/comjni/tools/ParcelItem;
    .locals 1

    new-array v0, p1, [Lcom/baidu/platform/comjni/tools/ParcelItem;

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/baidu/platform/comjni/tools/b;->a(Landroid/os/Parcel;)Lcom/baidu/platform/comjni/tools/ParcelItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/baidu/platform/comjni/tools/b;->a(I)[Lcom/baidu/platform/comjni/tools/ParcelItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
