package com.baidu.location; class BDLocation$1 {/*

.class final Lcom/baidu/location/BDLocation$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/baidu/location/BDLocation;
    .locals 2

    new-instance v0, Lcom/baidu/location/BDLocation;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p1, v1}, Lcom/baidu/location/BDLocation;-><init>(Landroid/os/Parcel;Lcom/baidu/location/BDLocation$1;)V

    #v0=(Reference);
    return-object v0
.end method

.method public a(I)[Lcom/baidu/location/BDLocation;
    .locals 1

    new-array v0, p1, [Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/baidu/location/BDLocation$1;->a(Landroid/os/Parcel;)Lcom/baidu/location/BDLocation;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/baidu/location/BDLocation$1;->a(I)[Lcom/baidu/location/BDLocation;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
