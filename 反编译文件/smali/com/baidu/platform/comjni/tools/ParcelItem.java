package com.baidu.platform.comjni.tools; class ParcelItem {/*

.class public Lcom/baidu/platform/comjni/tools/ParcelItem;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final a:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/baidu/platform/comjni/tools/ParcelItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/baidu/platform/comjni/tools/b;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comjni/tools/b;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comjni/tools/ParcelItem;->a:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getBundle()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comjni/tools/ParcelItem;->b:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

.method public setBundle(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comjni/tools/ParcelItem;->b:Landroid/os/Bundle;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comjni/tools/ParcelItem;->b:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method

*/}
