package com.baidu.mapapi.map; class ItemizedOverlay {/*

.class public Lcom/baidu/mapapi/map/ItemizedOverlay;
.super Lcom/baidu/mapapi/map/Overlay;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Item:",
        "Lcom/baidu/mapapi/map/OverlayItem;",
        ">",
        "Lcom/baidu/mapapi/map/Overlay;",
        "Ljava/util/Comparator",
        "<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/OverlayItem;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/graphics/drawable/Drawable;

.field private d:Z

.field protected mMapView:Lcom/baidu/mapapi/map/MapView;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lcom/baidu/mapapi/map/MapView;)V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/mapapi/map/Overlay;-><init>()V

    #p0=(Reference);
    const/16 v0, 0x1b

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mType:I

    iput-object p1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->c:Landroid/graphics/drawable/Drawable;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->b:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mMapView:Lcom/baidu/mapapi/map/MapView;

    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    return-void
.end method

.method private a(Ljava/util/List;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/OverlayItem;",
            ">;Z)V"
        }
    .end annotation

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v11, 0x1

    #v11=(One);
    iget v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    #v0=(Integer);
    if-nez v0, :cond_1

    if-nez p2, :cond_d

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    iget-object v2, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    #v0=(Integer);v1=(Uninit);v2=(Uninit);
    new-instance v4, Landroid/os/Bundle;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/os/Bundle;->clear()V

    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    const-string v0, "itemaddr"

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    #v1=(Integer);
    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "bshow"

    invoke-virtual {v4, v0, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p2, :cond_2

    const-string v0, "extparam"

    const-string v1, "update"

    #v1=(Reference);
    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    #v1=(Conflicted);
    move v2, v3

    :goto_1
    #v0=(Conflicted);v2=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v2, v0, :cond_a

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    if-nez v0, :cond_4

    :cond_3
    :goto_2
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_1

    :cond_4
    #v0=(Reference);
    if-nez p2, :cond_5

    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    :cond_5
    #v1=(Conflicted);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getMarker()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_3

    :cond_6
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getMarker()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/OverlayItem;->setMarker(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    if-nez p2, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v8, ""

    #v8=(Reference);
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, "_"

    #v6=(Reference);
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/OverlayItem;->a(Ljava/lang/String;)V

    :cond_8
    #v6=(Conflicted);v8=(Conflicted);
    new-instance v6, Lcom/baidu/platform/comjni/tools/ParcelItem;

    #v6=(UninitRef);
    invoke-direct {v6}, Lcom/baidu/platform/comjni/tools/ParcelItem;-><init>()V

    #v6=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getMarker()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v7, Landroid/os/Bundle;

    #v7=(UninitRef);
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    #v7=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v8

    #v8=(Reference);
    if-eqz v8, :cond_3

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v8

    invoke-static {v8}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v8

    const-string v9, "x"

    #v9=(Reference);
    invoke-virtual {v8}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v10

    #v10=(Integer);
    invoke-virtual {v7, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v9, "y"

    invoke-virtual {v8}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v7, v9, v8}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v8, "imgW"

    #v8=(Reference);
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    #v9=(Integer);
    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v8, "imgH"

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v8, "showLR"

    invoke-virtual {v7, v8, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v8, "iconwidth"

    invoke-virtual {v7, v8, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v8, "iconlayer"

    invoke-virtual {v7, v8, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v8, "ax"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getAnchorX()F

    move-result v9

    #v9=(Float);
    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v8, "ay"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getAnchorY()F

    move-result v9

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v8, "bound"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->a()I

    move-result v9

    #v9=(Integer);
    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v8, "popname"

    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    #v9=(Reference);
    const-string v10, ""

    #v10=(Reference);
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "imgindex"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->b()I

    move-result v9

    #v9=(Integer);
    invoke-virtual {v7, v8, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-nez p2, :cond_9

    invoke-direct {p0, v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->a(Lcom/baidu/mapapi/map/OverlayItem;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_9

    const-string v1, "imgdata"

    const/4 v8, 0x0

    #v8=(Null);
    invoke-virtual {v7, v1, v8}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :goto_3
    #v8=(Reference);
    invoke-virtual {v6, v7}, Lcom/baidu/platform/comjni/tools/ParcelItem;->setBundle(Landroid/os/Bundle;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p2, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_9
    #v8=(Conflicted);
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    mul-int/2addr v8, v9

    mul-int/lit8 v8, v8, 0x4

    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v1, v8}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    const-string v8, "imgdata"

    invoke-virtual {v7, v8, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    goto :goto_3

    :cond_a
    #v0=(Integer);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_c

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v1, v0, [Lcom/baidu/platform/comjni/tools/ParcelItem;

    :goto_4
    #v0=(Conflicted);v1=(Reference);v3=(Integer);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v3, v0, :cond_b

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comjni/tools/ParcelItem;

    aput-object v0, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_b
    #v0=(Integer);
    const-string v0, "itemdatas"

    #v0=(Reference);
    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mMapView:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/baidu/platform/comjni/map/basemap/a;->c(Landroid/os/Bundle;)V

    :cond_c
    #v0=(Conflicted);v1=(Conflicted);
    iput-boolean v11, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->d:Z

    :cond_d
    #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void
.end method

.method private a(Lcom/baidu/mapapi/map/OverlayItem;)Z
    .locals 5

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v4, -0x1

    #v4=(Byte);
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    #v0=(Conflicted);v2=(Reference);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->b()I

    move-result v3

    #v3=(Integer);
    if-ne v3, v4, :cond_1

    move v0, v1

    :goto_0
    #v0=(Boolean);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(Reference);v3=(Integer);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->b()I

    move-result v3

    if-eq v3, v4, :cond_0

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->b()I

    move-result v3

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->b()I

    move-result v0

    #v0=(Integer);
    if-ne v3, v0, :cond_0

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :cond_2
    #v0=(Boolean);v3=(Conflicted);
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method private b(Z)I
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Uninit);v3=(Uninit);
    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_0

    const/high16 v1, -0x8000

    const v0, 0x7fffffff

    #v0=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    #v3=(Reference);
    move v2, v1

    #v2=(Integer);
    move v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_2

    sub-int v0, v2, v1

    #v0=(Integer);
    goto :goto_0

    :cond_2
    #v0=(Boolean);
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    :goto_2
    #v0=(Integer);
    if-le v0, v2, :cond_3

    move v2, v0

    :cond_3
    if-ge v0, v1, :cond_5

    :goto_3
    move v1, v0

    goto :goto_1

    :cond_4
    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_3
.end method

.method protected static boundCenter(Lcom/baidu/mapapi/map/OverlayItem;)V
    .locals 2

    const/high16 v1, 0x3f00

    #v1=(Integer);
    if-nez p0, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);
    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/OverlayItem;->a(I)V

    invoke-virtual {p0, v1, v1}, Lcom/baidu/mapapi/map/OverlayItem;->setAnchor(FF)V

    goto :goto_0
.end method

.method protected static boundCenterBottom(Lcom/baidu/mapapi/map/OverlayItem;)V
    .locals 2

    if-nez p0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/OverlayItem;->a(I)V

    const/high16 v0, 0x3f00

    #v0=(Integer);
    const/high16 v1, 0x3f80

    #v1=(Integer);
    invoke-virtual {p0, v0, v1}, Lcom/baidu/mapapi/map/OverlayItem;->setAnchor(FF)V

    goto :goto_0
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mMapView:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    const-string v1, "item"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    iget v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    #v0=(UninitRef);
    const-string v1, "can not add new layer"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Integer);
    return-void
.end method

.method a(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/OverlayItem;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->b:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v3=(Conflicted);
    if-ge v1, v2, :cond_3

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getMarker()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/OverlayItem;->setMarker(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    iget-object v3, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_3
    #v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->d:Z

    return-void
.end method

.method public addItem(Lcom/baidu/mapapi/map/OverlayItem;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->addItem(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public addItem(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/OverlayItem;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->a(Ljava/util/List;Z)V

    goto :goto_0
.end method

.method b()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->removeAll()Z

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->addItem(Ljava/util/List;)V

    return-void
.end method

.method c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->d:Z

    #v0=(Boolean);
    return v0
.end method

.method public compare(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 6

    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, -0x1

    #v2=(Byte);
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    #v3=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v5

    #v5=(Integer);
    if-le v4, v5, :cond_1

    move v1, v2

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Byte);v2=(Integer);
    return v1

    :cond_1
    #v0=(Reference);v1=(One);v2=(Byte);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v5

    if-lt v4, v5, :cond_0

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v4

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v5

    if-ge v4, v5, :cond_2

    move v1, v2

    #v1=(Byte);
    goto :goto_0

    :cond_2
    #v1=(One);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    if-ne v2, v0, :cond_3

    const/4 v0, 0x0

    :goto_1
    #v0=(Boolean);
    move v1, v0

    #v1=(Boolean);
    goto :goto_0

    :cond_3
    #v0=(Integer);v1=(One);
    move v0, v1

    #v0=(One);
    goto :goto_1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/baidu/mapapi/map/ItemizedOverlay;->compare(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method protected createItem(I)Lcom/baidu/mapapi/map/OverlayItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TItem;"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method d()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    #v0=(Integer);
    return v0
.end method

.method public getAllItem()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/OverlayItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method public getCenter()Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->getIndexToDraw(I)I

    move-result v0

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->getItem(I)Lcom/baidu/mapapi/map/OverlayItem;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    goto :goto_0
.end method

.method protected getIndexToDraw(I)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 p1, -0x1

    :cond_1
    return p1
.end method

.method public final getItem(I)Lcom/baidu/mapapi/map/OverlayItem;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-le v0, p1, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    :goto_0
    return-object v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getLatSpanE6()I
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->b(Z)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getLonSpanE6()I
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->b(Z)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method protected hitTest(Lcom/baidu/mapapi/map/OverlayItem;Landroid/graphics/drawable/Drawable;II)Z
    .locals 8

    const/high16 v7, 0x3f80

    #v7=(Integer);
    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    move-object v0, p2

    #v0=(Reference);
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    #v0=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mMapView:Lcom/baidu/mapapi/map/MapView;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/map/MapView;->getProjection()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v2

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-interface {v2, v3, v4}, Lcom/baidu/platform/comapi/map/Projection;->toPixels(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v4, v2, Landroid/graphics/Point;->x:I

    #v4=(Integer);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->getAnchorX()F

    move-result v5

    #v5=(Float);
    int-to-float v6, v0

    #v6=(Float);
    mul-float/2addr v5, v6

    float-to-int v5, v5

    #v5=(Integer);
    sub-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Point;->x:I

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->getAnchorX()F

    move-result v5

    #v5=(Float);
    sub-float v5, v7, v5

    int-to-float v0, v0

    #v0=(Float);
    mul-float/2addr v0, v5

    float-to-int v0, v0

    #v0=(Integer);
    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->right:I

    iget v0, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->getAnchorY()F

    move-result v4

    #v4=(Float);
    sub-float v4, v7, v4

    int-to-float v5, v1

    mul-float/2addr v4, v5

    float-to-int v4, v4

    #v4=(Integer);
    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    iget v0, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->getAnchorY()F

    move-result v2

    #v2=(Float);
    int-to-float v1, v1

    #v1=(Float);
    mul-float/2addr v1, v2

    float-to-int v1, v1

    #v1=(Integer);
    sub-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v3, p3, p4}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method protected onTap(I)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onTap(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/mapapi/map/MapView;)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public removeAll()Z
    .locals 3

    const/4 v2, 0x1

    #v2=(One);
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mMapView:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->d:Z

    return v2
.end method

.method public removeItem(Lcom/baidu/mapapi/map/OverlayItem;)Z
    .locals 5

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    iget-object v2, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    #v0=(Boolean);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);
    iget v2, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    #v2=(Integer);
    if-nez v2, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    #v1=(Null);
    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    const-string v3, "itemaddr"

    #v3=(Reference);
    iget v4, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    #v4=(Integer);
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_3

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(One);
    const-string v3, "id"

    #v3=(Reference);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mMapView:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v3}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v3

    iget-object v3, v3, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->d(Landroid/os/Bundle;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_4

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    iget-object v1, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->d:Z

    goto :goto_0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method public updateItem(Lcom/baidu/mapapi/map/OverlayItem;)Z
    .locals 5

    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    #v2=(Null);
    iget v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->mLayerID:I

    #v0=(Integer);
    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_0
    #v0=(Integer);v3=(Uninit);v4=(Uninit);
    if-nez p1, :cond_1

    move v0, v2

    #v0=(Null);
    goto :goto_0

    :cond_1
    #v0=(Integer);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->c()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v3, ""

    #v3=(Reference);
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    move v0, v2

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Boolean);
    iget-object v0, p0, Lcom/baidu/mapapi/map/ItemizedOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    #v0=(Conflicted);v4=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/OverlayItem;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayItem;->c()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/OverlayItem;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    #v4=(Conflicted);
    if-nez v0, :cond_4

    move v0, v2

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(Boolean);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, v0, v1}, Lcom/baidu/mapapi/map/ItemizedOverlay;->a(Ljava/util/List;Z)V

    move v0, v1

    #v0=(One);
    goto :goto_0

    :cond_5
    #v0=(Boolean);
    move v0, v2

    #v0=(Null);
    goto :goto_1
.end method

*/}
