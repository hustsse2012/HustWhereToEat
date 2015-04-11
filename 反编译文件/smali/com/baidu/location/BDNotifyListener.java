package com.baidu.location; class BDNotifyListener {/*

.class public abstract Lcom/baidu/location/BDNotifyListener;
.super Ljava/lang/Object;


# instance fields
.field public Notified:I

.field public differDistance:F

.field public isAdded:Z

.field public mCoorType:Ljava/lang/String;

.field public mLatitude:D

.field public mLatitudeC:D

.field public mLongitude:D

.field public mLongitudeC:D

.field public mNotifyCache:Lcom/baidu/location/u;

.field public mRadius:F


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    const-wide/16 v0, 0x1

    #v0=(LongLo);v1=(LongHi);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-wide v0, p0, Lcom/baidu/location/BDNotifyListener;->mLatitude:D

    iput-wide v0, p0, Lcom/baidu/location/BDNotifyListener;->mLongitude:D

    iput v2, p0, Lcom/baidu/location/BDNotifyListener;->mRadius:F

    iput v2, p0, Lcom/baidu/location/BDNotifyListener;->differDistance:F

    iput-object v4, p0, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    iput-wide v0, p0, Lcom/baidu/location/BDNotifyListener;->mLatitudeC:D

    iput-wide v0, p0, Lcom/baidu/location/BDNotifyListener;->mLongitudeC:D

    iput v3, p0, Lcom/baidu/location/BDNotifyListener;->Notified:I

    iput-boolean v3, p0, Lcom/baidu/location/BDNotifyListener;->isAdded:Z

    iput-object v4, p0, Lcom/baidu/location/BDNotifyListener;->mNotifyCache:Lcom/baidu/location/u;

    return-void
.end method


# virtual methods
.method public SetNotifyLocation(DDFLjava/lang/String;)V
    .locals 2

    iput-wide p1, p0, Lcom/baidu/location/BDNotifyListener;->mLatitude:D

    iput-wide p3, p0, Lcom/baidu/location/BDNotifyListener;->mLongitude:D

    const/4 v0, 0x0

    #v0=(Null);
    cmpg-float v0, p5, v0

    #v0=(Byte);
    if-gez v0, :cond_3

    const/high16 v0, 0x4348

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/BDNotifyListener;->mRadius:F

    :goto_0
    const-string v0, "gcj02"

    #v0=(Reference);
    invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, "bd09"

    #v0=(Reference);
    invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, "bd09ll"

    #v0=(Reference);
    invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, "gps"

    #v0=(Reference);
    invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    :cond_0
    iput-object p6, p0, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    :goto_1
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "gcj02"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/baidu/location/BDNotifyListener;->mLatitude:D

    #v0=(DoubleLo);v1=(DoubleHi);
    iput-wide v0, p0, Lcom/baidu/location/BDNotifyListener;->mLatitudeC:D

    iget-wide v0, p0, Lcom/baidu/location/BDNotifyListener;->mLongitude:D

    iput-wide v0, p0, Lcom/baidu/location/BDNotifyListener;->mLongitudeC:D

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    iget-boolean v0, p0, Lcom/baidu/location/BDNotifyListener;->isAdded:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/location/BDNotifyListener;->Notified:I

    iget-object v0, p0, Lcom/baidu/location/BDNotifyListener;->mNotifyCache:Lcom/baidu/location/u;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Lcom/baidu/location/u;->if(Lcom/baidu/location/BDNotifyListener;)V

    :cond_2
    #v0=(Conflicted);
    return-void

    :cond_3
    #v0=(Byte);v1=(Uninit);
    iput p5, p0, Lcom/baidu/location/BDNotifyListener;->mRadius:F

    goto :goto_0

    :cond_4
    #v0=(Boolean);
    const-string v0, "gcj02"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    goto :goto_1
.end method

.method public onNotify(Lcom/baidu/location/BDLocation;F)V
    .locals 3

    const-string v0, "baidu_location_service"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "new location, not far from the destination..."

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/location/b;->if(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

*/}
