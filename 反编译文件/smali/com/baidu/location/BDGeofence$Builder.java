package com.baidu.location; class BDGeofence$Builder {/*

.class public final Lcom/baidu/location/BDGeofence$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/BDGeofence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private a:I

.field private do:Ljava/lang/String;

.field private for:D

.field private if:J

.field private int:Ljava/lang/String;

.field private new:Z

.field private try:D


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/BDGeofence$Builder;->do:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/BDGeofence$Builder;->new:Z

    const-wide/high16 v0, -0x8000

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/BDGeofence$Builder;->if:J

    return-void
.end method


# virtual methods
.method public build()Lcom/baidu/location/BDGeofence;
    .locals 10

    iget-object v0, p0, Lcom/baidu/location/BDGeofence$Builder;->do:Ljava/lang/String;

    #v0=(Reference);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "BDGeofence name not set."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-boolean v0, p0, Lcom/baidu/location/BDGeofence$Builder;->new:Z

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "BDGeofence region not set."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-wide v0, p0, Lcom/baidu/location/BDGeofence$Builder;->if:J

    #v0=(LongLo);v1=(LongHi);
    const-wide/high16 v2, -0x8000

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "BDGeofence Expiration not set."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_2
    #v0=(Byte);v1=(LongHi);
    iget-object v0, p0, Lcom/baidu/location/BDGeofence$Builder;->int:Ljava/lang/String;

    #v0=(Reference);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "BDGeofence CoordType not set."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_3
    #v0=(Boolean);v1=(LongHi);
    new-instance v0, Lcom/baidu/location/ah;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/BDGeofence$Builder;->do:Ljava/lang/String;

    #v1=(Reference);
    iget-wide v2, p0, Lcom/baidu/location/BDGeofence$Builder;->try:D

    #v2=(DoubleLo);v3=(DoubleHi);
    iget-wide v4, p0, Lcom/baidu/location/BDGeofence$Builder;->for:D

    #v4=(DoubleLo);v5=(DoubleHi);
    iget v6, p0, Lcom/baidu/location/BDGeofence$Builder;->a:I

    #v6=(Integer);
    iget-wide v7, p0, Lcom/baidu/location/BDGeofence$Builder;->if:J

    #v7=(LongLo);v8=(LongHi);
    iget-object v9, p0, Lcom/baidu/location/BDGeofence$Builder;->int:Ljava/lang/String;

    #v9=(Reference);
    invoke-direct/range {v0 .. v9}, Lcom/baidu/location/ah;-><init>(Ljava/lang/String;DDIJLjava/lang/String;)V

    #v0=(Reference);
    return-object v0
.end method

.method public setCircularRegion(DDI)Lcom/baidu/location/BDGeofence$Builder;
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/BDGeofence$Builder;->new:Z

    iput-wide p1, p0, Lcom/baidu/location/BDGeofence$Builder;->try:D

    iput-wide p3, p0, Lcom/baidu/location/BDGeofence$Builder;->for:D

    iput p5, p0, Lcom/baidu/location/BDGeofence$Builder;->a:I

    return-object p0
.end method

.method public setCoordType(Ljava/lang/String;)Lcom/baidu/location/BDGeofence$Builder;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/BDGeofence$Builder;->int:Ljava/lang/String;

    return-object p0
.end method

.method public setExpirationDruation(J)Lcom/baidu/location/BDGeofence$Builder;
    .locals 2

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    cmp-long v0, p1, v0

    #v0=(Byte);
    if-gez v0, :cond_0

    const-wide/16 v0, -0x1

    #v0=(LongLo);
    iput-wide v0, p0, Lcom/baidu/location/BDGeofence$Builder;->if:J

    :goto_0
    #v0=(Conflicted);
    return-object p0

    :cond_0
    #v0=(Byte);
    iput-wide p1, p0, Lcom/baidu/location/BDGeofence$Builder;->if:J

    goto :goto_0
.end method

.method public setGeofenceId(Ljava/lang/String;)Lcom/baidu/location/BDGeofence$Builder;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/BDGeofence$Builder;->do:Ljava/lang/String;

    return-object p0
.end method

*/}
