package com.baidu.mapapi.map; class MyLocationOverlay {/*

.class public Lcom/baidu/mapapi/map/MyLocationOverlay;
.super Lcom/baidu/mapapi/map/Overlay;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/map/MyLocationOverlay$1;,
        Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;
    }
.end annotation


# instance fields
.field a:Z

.field b:Lcom/baidu/platform/comapi/map/n;

.field private c:Lcom/baidu/mapapi/map/LocationData;

.field private d:Lcom/baidu/mapapi/map/MapView;

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Landroid/graphics/drawable/Drawable;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;


# direct methods
.method public constructor <init>(Lcom/baidu/mapapi/map/MapView;)V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Lcom/baidu/mapapi/map/Overlay;-><init>()V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->e:Z

    iput-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->f:Ljava/lang/String;

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->a:Z

    iput-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->b:Lcom/baidu/platform/comapi/map/n;

    iput-object p1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    const/4 v0, 0x7

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->mType:I

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->h:Ljava/util/List;

    sget-object v0, Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;->NORMAL:Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;

    iput-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->i:Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    new-instance v0, Lcom/baidu/platform/comapi/map/n;

    #v0=(UninitRef);
    iget v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->mType:I

    #v1=(Integer);
    invoke-direct {v0, v1}, Lcom/baidu/platform/comapi/map/n;-><init>(I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->b:Lcom/baidu/platform/comapi/map/n;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    const-string v1, "location"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->mLayerID:I

    iget v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->mLayerID:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    #v0=(UninitRef);
    const-string v1, "can not create poi layer."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->mLayerID:I

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->b:Lcom/baidu/platform/comapi/map/n;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapapi/map/MapView;->a(ILcom/baidu/platform/comapi/map/d;)V

    return-void
.end method

.method b()Lcom/baidu/platform/comapi/map/d;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->b:Lcom/baidu/platform/comapi/map/n;

    #v0=(Reference);
    return-object v0
.end method

.method c()Landroid/os/Bundle;
    .locals 10

    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->g:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->h:Ljava/util/List;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->g:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/os/Bundle;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/os/Bundle;->clear()V

    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    #v4=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    #v1=(Conflicted);v5=(Reference);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/graphics/drawable/Drawable;

    new-instance v6, Lcom/baidu/platform/comjni/tools/ParcelItem;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/baidu/platform/comjni/tools/ParcelItem;-><init>()V

    #v6=(Reference);
    new-instance v7, Landroid/os/Bundle;

    #v7=(UninitRef);
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    #v7=(Reference);
    move-object v1, v0

    #v1=(Reference);
    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    #v9=(Integer);
    mul-int/2addr v8, v9

    mul-int/lit8 v8, v8, 0x4

    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v1, v8}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v8

    const-string v9, "imgdata"

    #v9=(Reference);
    invoke-virtual {v7, v9, v8}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string v8, "imgindex"

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v7, v8, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "imgH"

    #v0=(Reference);
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v7, v0, v8}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "imgW"

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lcom/baidu/platform/comjni/tools/ParcelItem;->setBundle(Landroid/os/Bundle;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    #v0=(Boolean);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_3

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v5, v0, [Lcom/baidu/platform/comjni/tools/ParcelItem;

    move v1, v2

    :goto_2
    #v1=(Integer);
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comjni/tools/ParcelItem;

    aput-object v0, v5, v1

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_2

    :cond_2
    const-string v0, "icondata"

    #v0=(Reference);
    invoke-virtual {v3, v0, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);
    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->a:Z

    move-object v0, v3

    #v0=(Reference);
    goto/16 :goto_0
.end method

.method d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->f:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public disableCompass()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->e:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->setData(Lcom/baidu/mapapi/map/LocationData;)V

    return-void
.end method

.method protected dispatchTap()Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method e()V
    .locals 6

    const-wide v4, 0x412e848000000000L

    #v4=(LongLo);v5=(LongHi);
    sget-object v0, Lcom/baidu/mapapi/map/MyLocationOverlay$1;->a:[I

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->i:Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;->ordinal()I

    move-result v1

    #v1=(Integer);
    aget v0, v0, v1

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :pswitch_1
    #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    if-eqz v0, :cond_0

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v1=(Reference);
    iget-wide v1, v1, Lcom/baidu/mapapi/map/LocationData;->latitude:D

    #v1=(DoubleLo);v2=(DoubleHi);
    mul-double/2addr v1, v4

    double-to-int v1, v1

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v2=(Reference);
    iget-wide v2, v2, Lcom/baidu/mapapi/map/LocationData;->longitude:D

    #v2=(DoubleLo);v3=(DoubleHi);
    mul-double/2addr v2, v4

    double-to-int v2, v2

    #v2=(Integer);
    invoke-direct {v0, v1, v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v0=(Reference);
    new-instance v1, Lcom/baidu/mapapi/map/MKMapStatus;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/map/MKMapStatus;-><init>()V

    #v1=(Reference);
    iput-object v0, v1, Lcom/baidu/mapapi/map/MKMapStatus;->targetGeo:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    const/16 v0, -0x2d

    #v0=(Byte);
    iput v0, v1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/mapapi/map/LocationData;->direction:F

    #v0=(Integer);
    float-to-int v0, v0

    iput v0, v1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapController;->setMapStatusWithAnimation(Lcom/baidu/mapapi/map/MKMapStatus;)V

    goto :goto_0

    :pswitch_2
    #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    if-eqz v0, :cond_0

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v1=(Reference);
    iget-wide v1, v1, Lcom/baidu/mapapi/map/LocationData;->latitude:D

    #v1=(DoubleLo);v2=(DoubleHi);
    mul-double/2addr v1, v4

    double-to-int v1, v1

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v2=(Reference);
    iget-wide v2, v2, Lcom/baidu/mapapi/map/LocationData;->longitude:D

    #v2=(DoubleLo);v3=(DoubleHi);
    mul-double/2addr v2, v4

    double-to-int v2, v2

    #v2=(Integer);
    invoke-direct {v0, v1, v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/MapController;->animateTo(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public enableCompass()Z
    .locals 2

    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->e:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->setData(Lcom/baidu/mapapi/map/LocationData;)V

    return v1
.end method

.method public getMyLocation()Lcom/baidu/mapapi/map/LocationData;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v0=(Reference);
    return-object v0
.end method

.method public isCompassEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->e:Z

    #v0=(Boolean);
    return v0
.end method

.method public setData(Lcom/baidu/mapapi/map/LocationData;)V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    const/high16 v2, 0x43b4

    #v2=(Integer);
    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->e:Z

    #v0=(Boolean);
    if-nez v0, :cond_2

    const/high16 v0, -0x4080

    #v0=(Integer);
    iput v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    :cond_0
    :goto_0
    #v1=(Conflicted);
    iput-object p1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/LocationData;->clone()Lcom/baidu/mapapi/map/LocationData;

    move-result-object v0

    #v0=(Reference);
    sget-object v1, Lcom/baidu/mapapi/map/MyLocationOverlay$1;->a:[I

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->i:Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;->ordinal()I

    move-result v2

    #v2=(Integer);
    aget v1, v1, v2

    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    :cond_1
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_2
    #v0=(Boolean);v1=(Uninit);
    iget v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    #v0=(Integer);
    rem-float/2addr v0, v2

    #v0=(Float);
    iput v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    iget v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    #v0=(Integer);
    const/high16 v1, 0x4334

    #v1=(Integer);
    cmpl-float v0, v0, v1

    #v0=(Byte);
    if-lez v0, :cond_3

    iget v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    #v0=(Integer);
    sub-float/2addr v0, v2

    #v0=(Float);
    iput v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    goto :goto_0

    :cond_3
    #v0=(Byte);
    iget v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    #v0=(Integer);
    const/high16 v1, -0x3ccc

    cmpg-float v0, v0, v1

    #v0=(Byte);
    if-gez v0, :cond_0

    iget v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    #v0=(Integer);
    add-float/2addr v0, v2

    #v0=(Float);
    iput v0, p1, Lcom/baidu/mapapi/map/LocationData;->direction:F

    goto :goto_0

    :pswitch_0
    #v0=(Reference);
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/LocationData;->a(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->f:Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/LocationData;->a(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->f:Ljava/lang/String;

    goto :goto_1

    :pswitch_2
    #v1=(Integer);
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/LocationData;->a(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->f:Ljava/lang/String;

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setLocationMode(Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;)V
    .locals 2

    iput-object p1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->i:Lcom/baidu/mapapi/map/MyLocationOverlay$LocationMode;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->c:Lcom/baidu/mapapi/map/LocationData;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->setData(Lcom/baidu/mapapi/map/LocationData;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->d:Lcom/baidu/mapapi/map/MapView;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/q;->setRenderMode(I)V

    return-void
.end method

.method public setMarker(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/MyLocationOverlay;->g:Landroid/graphics/drawable/Drawable;

    return-void
.end method

*/}
