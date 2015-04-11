package com.baidu.mapapi.map; class PopupOverlay {/*

.class public Lcom/baidu/mapapi/map/PopupOverlay;
.super Lcom/baidu/mapapi/map/Overlay;


# static fields
.field private static d:I


# instance fields
.field a:Lcom/baidu/mapapi/map/PopupClickListener;

.field private b:Lcom/baidu/mapapi/map/MapView;

.field private c:Lcom/baidu/mapapi/map/MapController;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/PopupClickListener;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Lcom/baidu/mapapi/map/Overlay;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    iput-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iput-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->a:Lcom/baidu/mapapi/map/PopupClickListener;

    iput-object p1, p0, Lcom/baidu/mapapi/map/PopupOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    const/16 v0, 0x15

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->mType:I

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v0, v0, Lcom/baidu/platform/comapi/map/o;->a:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->mLayerID:I

    iput-object p2, p0, Lcom/baidu/mapapi/map/PopupOverlay;->a:Lcom/baidu/mapapi/map/PopupClickListener;

    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    if-nez p1, :cond_1

    move-object p1, v2

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(PosByte);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-object p1

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    if-nez p2, :cond_2

    if-eqz p3, :cond_0

    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    #v6=(Integer);
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    #v1=(Integer);
    move v4, v3

    #v4=(Integer);
    move v3, v1

    :goto_1
    #v1=(Conflicted);
    if-eqz p3, :cond_5

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    :goto_2
    #v0=(Integer);
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int v3, v5, v4

    add-int/2addr v1, v3

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    #v3=(Reference);
    invoke-static {v1, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Landroid/graphics/Canvas;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    #v1=(Reference);
    invoke-virtual {v1, p1, v7, v7, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    if-eqz p2, :cond_3

    int-to-float v3, v5

    #v3=(Float);
    invoke-virtual {v1, p2, v3, v7, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_3
    #v3=(Conflicted);
    if-eqz p3, :cond_4

    add-int v3, v5, v4

    #v3=(Integer);
    int-to-float v3, v3

    #v3=(Float);
    invoke-virtual {v1, p3, v3, v7, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_4
    #v3=(Conflicted);
    const/16 v2, 0x1f

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->save(I)I

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    move-object p1, v0

    goto :goto_0

    :cond_5
    #v0=(Null);v1=(Conflicted);v2=(Null);v3=(Integer);
    move v1, v0

    #v1=(Null);
    goto :goto_2

    :cond_6
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);
    move v3, v0

    #v3=(Null);
    move v4, v0

    #v4=(Null);
    goto :goto_1
.end method


# virtual methods
.method public hidePop()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    sget v0, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    #v0=(Integer);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    sput v2, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    goto :goto_0
.end method

.method public showPopup(Landroid/graphics/Bitmap;Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)V
    .locals 6

    const/4 v5, 0x0

    #v5=(Null);
    const/4 v4, 0x1

    #v4=(One);
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    const-string v2, "layeraddr"

    #v2=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/o;->e:Ljava/util/Map;

    const-string v3, "popup"

    #v3=(Reference);
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "bshow"

    #v0=(Reference);
    invoke-virtual {v1, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {p2}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    const-string v2, "x"

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "y"

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "imgW"

    #v0=(Reference);
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "imgH"

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "showLR"

    invoke-virtual {v1, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "icon0width"

    invoke-virtual {v1, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "icon1width"

    invoke-virtual {v1, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "iconlayer"

    invoke-virtual {v1, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "offset"

    invoke-virtual {v1, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "popname"

    const v2, -0x4cd266b2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    mul-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v2, "imgdata"

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->b(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1, v4}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    sget v0, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    #v0=(Integer);
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    #v0=(Conflicted);
    sget v0, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    goto/16 :goto_0
.end method

.method public showPopup([Landroid/graphics/Bitmap;Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)V
    .locals 8

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v4, 0x2

    #v4=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    #v0=(Integer);
    if-eqz v0, :cond_0

    if-gez p3, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :cond_1
    #v0=(Integer);v1=(Null);v2=(Null);v3=(Uninit);v4=(PosByte);v5=(Uninit);v6=(Uninit);
    array-length v0, p1

    packed-switch v0, :pswitch_data_0

    array-length v0, p1

    if-le v0, v4, :cond_6

    aget-object v0, p1, v1

    #v0=(Null);
    if-eqz v0, :cond_3

    aget-object v0, p1, v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    #v0=(Integer);
    aget-object v2, p1, v7

    if-nez v2, :cond_4

    aget-object v0, p1, v1

    #v0=(Null);
    invoke-virtual {p0, v0, p2, p3}, Lcom/baidu/mapapi/map/PopupOverlay;->showPopup(Landroid/graphics/Bitmap;Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)V

    goto :goto_0

    :pswitch_0
    #v0=(Integer);
    aget-object v0, p1, v1

    #v0=(Null);
    invoke-direct {p0, v0, v2, v2}, Lcom/baidu/mapapi/map/PopupOverlay;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    #v0=(Reference);
    move v2, v1

    move-object v3, v0

    :goto_1
    #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Reference);
    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v4, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v4=(Reference);
    iget-object v4, v4, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v4, v4, Lcom/baidu/platform/comapi/map/o;->a:I

    #v4=(Integer);
    invoke-virtual {v0, v4}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    new-instance v4, Landroid/os/Bundle;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    #v4=(Reference);
    const-string v5, "layeraddr"

    #v5=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/o;->e:Ljava/util/Map;

    const-string v6, "popup"

    #v6=(Reference);
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "bshow"

    #v0=(Reference);
    invoke-virtual {v4, v0, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {p2}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    const-string v5, "x"

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "y"

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "imgW"

    #v0=(Reference);
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "imgH"

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "showLR"

    invoke-virtual {v4, v0, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "icon0width"

    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "icon1width"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "iconlayer"

    invoke-virtual {v4, v0, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "offset"

    invoke-virtual {v4, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "popname"

    const v1, -0x4cd266b2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v3, v0}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "imgdata"

    #v1=(Reference);
    invoke-virtual {v4, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/baidu/platform/comjni/map/basemap/a;->b(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1, v7}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/PopupOverlay;->c:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    sget v0, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    #v0=(Integer);
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/PopupOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    #v0=(Conflicted);
    sget v0, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/baidu/mapapi/map/PopupOverlay;->d:I

    goto/16 :goto_0

    :pswitch_1
    #v1=(Null);v2=(Null);v3=(Uninit);v4=(PosByte);v5=(Uninit);v6=(Uninit);
    aget-object v0, p1, v1

    #v0=(Null);
    if-eqz v0, :cond_7

    aget-object v0, p1, v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    :goto_2
    #v0=(Integer);
    aget-object v3, p1, v1

    #v3=(Null);
    aget-object v4, p1, v7

    #v4=(Null);
    invoke-direct {p0, v3, v4, v2}, Lcom/baidu/mapapi/map/PopupOverlay;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    #v2=(Reference);
    move-object v3, v2

    #v3=(Reference);
    move v2, v0

    #v2=(Integer);
    goto/16 :goto_1

    :cond_3
    #v0=(Null);v2=(Null);v3=(Uninit);v4=(PosByte);
    move v0, v1

    :cond_4
    #v0=(Integer);
    aget-object v2, p1, v4

    if-eqz v2, :cond_5

    aget-object v2, p1, v4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    :goto_3
    #v2=(Integer);
    aget-object v1, p1, v1

    aget-object v3, p1, v7

    #v3=(Null);
    aget-object v4, p1, v4

    #v4=(Null);
    invoke-direct {p0, v1, v3, v4}, Lcom/baidu/mapapi/map/PopupOverlay;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    #v1=(Reference);
    move-object v3, v1

    #v3=(Reference);
    move v1, v2

    #v1=(Integer);
    move v2, v0

    goto/16 :goto_1

    :cond_5
    #v1=(Null);v2=(Null);v3=(Uninit);v4=(PosByte);
    move v2, v1

    goto :goto_3

    :cond_6
    move-object v3, v2

    #v3=(Null);
    move v2, v1

    goto/16 :goto_1

    :cond_7
    #v0=(Null);v3=(Uninit);
    move v0, v1

    goto :goto_2

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

*/}
