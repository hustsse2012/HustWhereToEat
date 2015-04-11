package com.baidu.mapapi.map; class GraphicsOverlay {/*

.class public Lcom/baidu/mapapi/map/GraphicsOverlay;
.super Lcom/baidu/mapapi/map/Overlay;


# instance fields
.field private a:Landroid/os/Bundle;

.field private b:Lcom/baidu/mapapi/map/MapView;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/Graphic;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method public constructor <init>(Lcom/baidu/mapapi/map/MapView;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Lcom/baidu/mapapi/map/Overlay;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    iput-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->d:Z

    const/16 v0, 0x1d

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->mType:I

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    const-string v1, "geometry"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->mLayerID:I

    iget v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->mLayerID:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    #v0=(UninitRef);
    const-string v1, "can not add geometry layer"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Integer);
    return-void
.end method

.method a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->d:Z

    return-void
.end method

.method b()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->mLayerID:I

    #v0=(Integer);
    return v0
.end method

.method c()V
    .locals 14

    const/4 v13, 0x4

    #v13=(PosByte);
    const/high16 v12, 0x437f

    #v12=(Integer);
    const/4 v11, 0x2

    #v11=(PosByte);
    const/4 v10, 0x1

    #v10=(One);
    const/4 v3, 0x0

    #v3=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    move v2, v3

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v2, v0, :cond_d

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/Graphic;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget-object v5, v1, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v5=(Reference);
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_1

    :cond_0
    :goto_1
    #v1=(Conflicted);v5=(Conflicted);
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_0

    :cond_1
    #v0=(Reference);v1=(Integer);v5=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    if-eq v1, v11, :cond_2

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v4, 0x5

    #v4=(PosByte);
    if-ne v1, v4, :cond_6

    :cond_2
    #v4=(Conflicted);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    #v6=(Integer);
    if-lt v6, v11, :cond_0

    new-array v7, v6, [I

    #v7=(Reference);
    new-array v8, v6, [I

    #v8=(Reference);
    move v4, v3

    :goto_2
    #v4=(Integer);
    if-ge v4, v6, :cond_4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_3

    :goto_3
    #v1=(Conflicted);
    add-int/lit8 v1, v4, 0x1

    #v1=(Integer);
    move v4, v1

    goto :goto_2

    :cond_3
    #v1=(Reference);
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v9

    #v9=(Integer);
    aput v9, v7, v4

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    aput v1, v8, v4

    goto :goto_3

    :cond_4
    #v9=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v4, "x"

    #v4=(Reference);
    invoke-virtual {v1, v4, v7}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "y"

    invoke-virtual {v1, v4, v8}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    :goto_4
    #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "linewidth"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v5

    iget v5, v5, Lcom/baidu/mapapi/map/Symbol;->a:I

    #v5=(Integer);
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "red"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v5

    #v5=(Reference);
    iget-object v5, v5, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v5, v5, Lcom/baidu/mapapi/map/Symbol$Color;->red:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    div-float/2addr v5, v12

    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "green"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v5

    #v5=(Reference);
    iget-object v5, v5, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v5, v5, Lcom/baidu/mapapi/map/Symbol$Color;->green:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    div-float/2addr v5, v12

    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "blue"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v5

    #v5=(Reference);
    iget-object v5, v5, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v5, v5, Lcom/baidu/mapapi/map/Symbol$Color;->blue:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    div-float/2addr v5, v12

    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "alpha"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v5

    #v5=(Reference);
    iget-object v5, v5, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v5, v5, Lcom/baidu/mapapi/map/Symbol$Color;->alpha:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    div-float/2addr v5, v12

    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v4, 0x5

    #v4=(PosByte);
    if-ne v1, v4, :cond_9

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v4, "type"

    #v4=(Reference);
    invoke-virtual {v1, v4, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_5
    #v5=(Integer);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v4, 0x5

    #v4=(PosByte);
    if-ne v1, v4, :cond_a

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v4, "status"

    #v4=(Reference);
    invoke-virtual {v1, v4, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_6
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    if-eq v1, v13, :cond_5

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    if-ne v1, v10, :cond_c

    :cond_5
    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v4, "level"

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v5

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/mapapi/map/Geometry;->c:I

    #v5=(Integer);
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_7
    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "geometryaddr"

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v5

    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v6, "id"

    #v6=(Reference);
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v1, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget-object v6, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    invoke-virtual {v1, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->g(Landroid/os/Bundle;)I

    invoke-virtual {v0, v4, v5}, Lcom/baidu/mapapi/map/Graphic;->a(J)V

    goto/16 :goto_1

    :cond_6
    #v1=(Integer);v4=(PosByte);v5=(Reference);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v4, 0x3

    if-ne v1, v4, :cond_7

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v1, v11, :cond_0

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x5

    #v1=(PosByte);
    new-array v4, v1, [I

    #v4=(Reference);
    new-array v6, v1, [I

    #v6=(Reference);
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v7

    #v7=(Integer);
    aput v7, v4, v3

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    aput v1, v6, v3

    new-instance v7, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v7=(UninitRef);
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    invoke-direct {v7, v8, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v7=(Reference);
    invoke-static {v7}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v7

    #v7=(Integer);
    aput v7, v4, v10

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    aput v1, v6, v10

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v7

    aput v7, v4, v11

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    aput v1, v6, v11

    new-instance v7, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v7=(UninitRef);
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v8

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    invoke-direct {v7, v8, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v7=(Reference);
    invoke-static {v7}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    const/4 v5, 0x3

    #v5=(PosByte);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v7

    #v7=(Integer);
    aput v7, v4, v5

    const/4 v5, 0x3

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    aput v1, v6, v5

    aget v1, v4, v3

    aput v1, v4, v13

    aget v1, v6, v3

    aput v1, v6, v13

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v5, "x"

    #v5=(Reference);
    invoke-virtual {v1, v5, v4}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "y"

    invoke-virtual {v1, v4, v6}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    goto/16 :goto_4

    :cond_7
    #v1=(Integer);v4=(PosByte);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    if-eq v1, v13, :cond_8

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    if-ne v1, v10, :cond_0

    :cond_8
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    new-array v4, v10, [I

    #v4=(Reference);
    new-array v6, v10, [I

    #v6=(Reference);
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v5

    #v5=(Integer);
    aput v5, v4, v3

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    aput v1, v6, v3

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v5, "x"

    #v5=(Reference);
    invoke-virtual {v1, v5, v4}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v4, "y"

    invoke-virtual {v1, v4, v6}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    goto/16 :goto_4

    :cond_9
    #v1=(Integer);v4=(PosByte);v5=(Float);v6=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v4, "type"

    #v4=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v5

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v5=(Integer);
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_5

    :cond_a
    #v1=(Integer);v4=(PosByte);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    if-ne v1, v11, :cond_b

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v4, "status"

    #v4=(Reference);
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_6

    :cond_b
    #v1=(Integer);v4=(PosByte);
    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v4, "status"

    #v4=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v5

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/mapapi/map/Symbol;->c:I

    #v5=(Integer);
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_6

    :cond_c
    #v1=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v1=(Reference);
    const-string v4, "level"

    iget-object v5, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v5=(Reference);
    invoke-virtual {v5}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v5

    iget-object v5, v5, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v5}, Lcom/baidu/platform/comapi/map/o;->n()F

    move-result v5

    #v5=(Float);
    float-to-int v5, v5

    #v5=(Integer);
    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_7

    :cond_d
    #v0=(Integer);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iput-boolean v10, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->d:Z

    return-void
.end method

.method d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->d:Z

    #v0=(Boolean);
    return v0
.end method

.method public getAllGraphics()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/Graphic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method public removeAll()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->d:Z

    return-void
.end method

.method public removeGraphic(J)V
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "geometryaddr"

    #v1=(Reference);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "id"

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comjni/map/basemap/a;->h(Landroid/os/Bundle;)Z

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/Graphic;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Graphic;->getID()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, p1, v2

    #v0=(Byte);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    #v0=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_1
    #v2=(Conflicted);v3=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->d:Z

    return-void
.end method

.method public setData(Lcom/baidu/mapapi/map/Graphic;)J
    .locals 14

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/Bundle;->clear()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    return-wide v0

    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/map/Geometry;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/map/Geometry;-><init>()V

    #v0=(Reference);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/mapapi/map/Geometry;->a:I

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    iput-object v1, v0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->c:I

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/mapapi/map/Geometry;->c:I

    new-instance v1, Lcom/baidu/mapapi/map/Symbol;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/map/Symbol;-><init>()V

    #v1=(Reference);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v2

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iput-object v2, v1, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v2

    iget v2, v2, Lcom/baidu/mapapi/map/Symbol;->a:I

    #v2=(Integer);
    iput v2, v1, Lcom/baidu/mapapi/map/Symbol;->a:I

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v2

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/mapapi/map/Symbol;->c:I

    #v2=(Integer);
    iput v2, v1, Lcom/baidu/mapapi/map/Symbol;->c:I

    new-instance v2, Lcom/baidu/mapapi/map/Graphic;

    #v2=(UninitRef);
    invoke-direct {v2, v0, v1}, Lcom/baidu/mapapi/map/Graphic;-><init>(Lcom/baidu/mapapi/map/Geometry;Lcom/baidu/mapapi/map/Symbol;)V

    #v2=(Reference);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0

    :cond_2
    #v0=(Integer);v1=(Reference);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v0

    #v0=(Reference);
    iget-object v3, v0, Lcom/baidu/mapapi/map/Geometry;->b:Ljava/util/ArrayList;

    #v3=(Reference);
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_4

    :cond_3
    #v0=(Conflicted);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0

    :cond_4
    #v0=(Integer);v1=(Reference);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v0

    #v0=(Reference);
    iget v4, v0, Lcom/baidu/mapapi/map/Symbol;->a:I

    #v4=(Integer);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    if-nez v0, :cond_5

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0

    :cond_5
    #v0=(Reference);v1=(Reference);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v0, v0, Lcom/baidu/mapapi/map/Symbol$Color;->red:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    const/high16 v1, 0x437f

    #v1=(Integer);
    div-float v5, v0, v1

    #v5=(Float);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v0

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v0, v0, Lcom/baidu/mapapi/map/Symbol$Color;->green:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    const/high16 v1, 0x437f

    div-float v6, v0, v1

    #v6=(Float);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v0

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v0, v0, Lcom/baidu/mapapi/map/Symbol$Color;->blue:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    const/high16 v1, 0x437f

    div-float v7, v0, v1

    #v7=(Float);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v0

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/Symbol;->b:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v0, v0, Lcom/baidu/mapapi/map/Symbol$Color;->alpha:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    const/high16 v1, 0x437f

    div-float v8, v0, v1

    #v8=(Float);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v0

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/mapapi/map/Symbol;->c:I

    #v0=(Integer);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v9, v1, Lcom/baidu/mapapi/map/Geometry;->c:I

    #v9=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    cmpg-float v1, v5, v1

    #v1=(Byte);
    if-ltz v1, :cond_6

    const/high16 v1, 0x437f

    #v1=(Integer);
    cmpl-float v1, v5, v1

    #v1=(Byte);
    if-gtz v1, :cond_6

    const/4 v1, 0x0

    #v1=(Null);
    cmpg-float v1, v6, v1

    #v1=(Byte);
    if-ltz v1, :cond_6

    const/high16 v1, 0x437f

    #v1=(Integer);
    cmpl-float v1, v6, v1

    #v1=(Byte);
    if-gtz v1, :cond_6

    const/4 v1, 0x0

    #v1=(Null);
    cmpg-float v1, v7, v1

    #v1=(Byte);
    if-ltz v1, :cond_6

    const/high16 v1, 0x437f

    #v1=(Integer);
    cmpl-float v1, v7, v1

    #v1=(Byte);
    if-gtz v1, :cond_6

    const/4 v1, 0x0

    #v1=(Null);
    cmpg-float v1, v8, v1

    #v1=(Byte);
    if-ltz v1, :cond_6

    const/high16 v1, 0x437f

    #v1=(Integer);
    cmpl-float v1, v8, v1

    #v1=(Byte);
    if-lez v1, :cond_7

    :cond_6
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_7
    #v0=(Integer);v1=(Byte);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v10, 0x2

    #v10=(PosByte);
    if-eq v1, v10, :cond_8

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v10, 0x5

    if-ne v1, v10, :cond_e

    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v10

    #v10=(Integer);
    const/4 v0, 0x2

    #v0=(PosByte);
    if-ge v10, v0, :cond_9

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_9
    #v0=(PosByte);v1=(Integer);
    if-gtz v4, :cond_a

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v0

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_a

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_a
    #v0=(Integer);v1=(Integer);
    new-array v11, v10, [I

    #v11=(Reference);
    new-array v12, v10, [I

    #v12=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_1
    #v0=(Integer);v13=(Conflicted);
    if-ge v1, v10, :cond_c

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_b

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_b
    #v0=(Reference);v1=(Integer);
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v13

    #v13=(Integer);
    aput v13, v11, v1

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    aput v0, v12, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_c
    #v13=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "x"

    #v1=(Reference);
    invoke-virtual {v0, v1, v11}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v1, "y"

    invoke-virtual {v0, v1, v12}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    :goto_2
    #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v1, "linewidth"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v1, "red"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v1, "green"

    invoke-virtual {v0, v1, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v1, "blue"

    invoke-virtual {v0, v1, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v1, "alpha"

    invoke-virtual {v0, v1, v8}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v0

    iget v0, v0, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v0=(Integer);
    const/4 v1, 0x5

    #v1=(PosByte);
    if-ne v0, v1, :cond_1a

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "type"

    #v1=(Reference);
    const/4 v3, 0x2

    #v3=(PosByte);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_3
    #v3=(Integer);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v0

    iget v0, v0, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v0=(Integer);
    const/4 v1, 0x5

    #v1=(PosByte);
    if-ne v0, v1, :cond_1b

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "status"

    #v1=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_4
    #v3=(Integer);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v0

    iget v0, v0, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v0=(Integer);
    const/4 v1, 0x4

    #v1=(PosByte);
    if-eq v0, v1, :cond_d

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v0

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    if-ne v0, v1, :cond_1d

    :cond_d
    #v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "level"

    #v1=(Reference);
    invoke-virtual {v0, v1, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_5
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v1, "geometryaddr"

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-object v3, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v3=(Reference);
    const-string v4, "id"

    #v4=(Reference);
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v3}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v3

    iget-object v3, v3, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v3

    iget-object v4, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    invoke-virtual {v3, v4}, Lcom/baidu/platform/comjni/map/basemap/a;->g(Landroid/os/Bundle;)I

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapapi/map/Graphic;->a(J)V

    invoke-virtual {v2, v0, v1}, Lcom/baidu/mapapi/map/Graphic;->a(J)V

    iget-object v3, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    #v2=(One);
    iput-boolean v2, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->d:Z

    goto/16 :goto_0

    :cond_e
    #v0=(Integer);v1=(Integer);v2=(Reference);v4=(Integer);v5=(Float);v10=(PosByte);v11=(Uninit);v12=(Uninit);v13=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v10, 0x3

    if-ne v1, v10, :cond_14

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v10, 0x2

    if-ge v1, v10, :cond_f

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_f
    #v0=(Integer);v1=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_10

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_11

    :cond_10
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_11
    #v0=(Integer);v1=(Reference);
    if-lez v4, :cond_12

    if-eqz v0, :cond_13

    const/4 v1, 0x1

    #v1=(One);
    if-eq v0, v1, :cond_13

    :cond_12
    #v1=(Conflicted);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_13
    #v0=(Integer);v1=(Conflicted);
    const/4 v0, 0x5

    #v0=(PosByte);
    new-array v1, v0, [I

    #v1=(Reference);
    new-array v10, v0, [I

    #v10=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    const/4 v11, 0x0

    #v11=(Null);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v12

    #v12=(Integer);
    aput v12, v1, v11

    const/4 v11, 0x0

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    aput v0, v10, v11

    new-instance v11, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v11=(UninitRef);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v12

    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-direct {v11, v12, v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v11=(Reference);
    invoke-static {v11}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    const/4 v11, 0x1

    #v11=(One);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v12

    aput v12, v1, v11

    const/4 v11, 0x1

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    aput v0, v10, v11

    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    const/4 v11, 0x2

    #v11=(PosByte);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v12

    aput v12, v1, v11

    const/4 v11, 0x2

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    aput v0, v10, v11

    new-instance v11, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v11=(UninitRef);
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v12

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-direct {v11, v12, v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v11=(Reference);
    invoke-static {v11}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    const/4 v3, 0x3

    #v3=(PosByte);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v11

    #v11=(Integer);
    aput v11, v1, v3

    const/4 v3, 0x3

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    aput v0, v10, v3

    const/4 v0, 0x4

    #v0=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    aget v3, v1, v3

    #v3=(Integer);
    aput v3, v1, v0

    const/4 v0, 0x4

    const/4 v3, 0x0

    #v3=(Null);
    aget v3, v10, v3

    #v3=(Integer);
    aput v3, v10, v0

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v3, "x"

    #v3=(Reference);
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v1, "y"

    invoke-virtual {v0, v1, v10}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    goto/16 :goto_2

    :cond_14
    #v0=(Integer);v1=(Integer);v10=(PosByte);v11=(Uninit);v12=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v10, 0x4

    if-eq v1, v10, :cond_15

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v1

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v1=(Integer);
    const/4 v10, 0x1

    #v10=(One);
    if-ne v1, v10, :cond_19

    :cond_15
    #v10=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    const/4 v10, 0x0

    #v10=(Null);
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    #v10=(Reference);
    if-nez v10, :cond_16

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_16
    #v0=(Integer);v1=(One);
    if-eqz v0, :cond_17

    const/4 v10, 0x1

    #v10=(One);
    if-eq v0, v10, :cond_17

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_17
    #v0=(Integer);v1=(One);v10=(Conflicted);
    if-gtz v9, :cond_18

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_18
    #v0=(Integer);v1=(One);
    new-array v10, v1, [I

    #v10=(Reference);
    new-array v1, v1, [I

    #v1=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v11

    #v11=(Integer);
    aput v11, v10, v3

    const/4 v3, 0x0

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    aput v0, v1, v3

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v3, "x"

    #v3=(Reference);
    invoke-virtual {v0, v3, v10}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    const-string v3, "y"

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    goto/16 :goto_2

    :cond_19
    #v0=(Integer);v1=(Integer);v10=(One);v11=(Uninit);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    goto/16 :goto_0

    :cond_1a
    #v0=(Integer);v1=(PosByte);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "type"

    #v1=(Reference);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v3

    iget v3, v3, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v3=(Integer);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_3

    :cond_1b
    #v0=(Integer);v1=(PosByte);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getGeometry()Lcom/baidu/mapapi/map/Geometry;

    move-result-object v0

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/mapapi/map/Geometry;->a:I

    #v0=(Integer);
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1c

    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "status"

    #v1=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_4

    :cond_1c
    #v0=(Integer);v1=(PosByte);v3=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "status"

    #v1=(Reference);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Graphic;->getSymbol()Lcom/baidu/mapapi/map/Symbol;

    move-result-object v3

    #v3=(Reference);
    iget v3, v3, Lcom/baidu/mapapi/map/Symbol;->c:I

    #v3=(Integer);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_4

    :cond_1d
    #v0=(Integer);v1=(One);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->a:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "level"

    #v1=(Reference);
    iget-object v3, p0, Lcom/baidu/mapapi/map/GraphicsOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v3

    iget-object v3, v3, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/map/o;->n()F

    move-result v3

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_5
.end method

*/}
