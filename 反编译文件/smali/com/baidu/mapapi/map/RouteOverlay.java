package com.baidu.mapapi.map; class RouteOverlay {/*

.class public Lcom/baidu/mapapi/map/RouteOverlay;
.super Lcom/baidu/mapapi/map/ItemizedOverlay;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/map/RouteOverlay$1;,
        Lcom/baidu/mapapi/map/RouteOverlay$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/RouteOverlay$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/baidu/mapapi/map/MapView;

.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;

.field private e:Lcom/baidu/platform/comapi/map/y;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Landroid/graphics/drawable/Drawable;

.field public mRoute:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKRoute;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/baidu/mapapi/map/MapView;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, v0, p2}, Lcom/baidu/mapapi/map/ItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;Lcom/baidu/mapapi/map/MapView;)V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mRoute:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->a:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->c:Landroid/content/Context;

    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->e:Lcom/baidu/platform/comapi/map/y;

    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->f:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->g:Landroid/graphics/drawable/Drawable;

    const/16 v0, 0xc

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mType:I

    iput-object p1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/baidu/mapapi/map/RouteOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mRoute:Ljava/util/ArrayList;

    return-void
.end method

.method private h()V
    .locals 3

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v2=(Conflicted);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/RouteOverlay;->size()I

    move-result v2

    #v2=(Integer);
    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/RouteOverlay;->createItem(I)Lcom/baidu/mapapi/map/OverlayItem;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v2=(Integer);
    invoke-super {p0, v1}, Lcom/baidu/mapapi/map/ItemizedOverlay;->a(Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    new-instance v0, Lcom/baidu/platform/comapi/map/y;

    #v0=(UninitRef);
    iget v1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mType:I

    #v1=(Integer);
    invoke-direct {v0, v1}, Lcom/baidu/platform/comapi/map/y;-><init>(I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->e:Lcom/baidu/platform/comapi/map/y;

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    const-string v1, "default"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mLayerID:I

    iget v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mLayerID:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    #v0=(UninitRef);
    const-string v1, "can not create route layer."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mLayerID:I

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/RouteOverlay;->e:Lcom/baidu/platform/comapi/map/y;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapapi/map/MapView;->a(ILcom/baidu/platform/comapi/map/d;)V

    return-void
.end method

.method public animateTo()V
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/RouteOverlay;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/RouteOverlay;->getItem(I)Lcom/baidu/mapapi/map/OverlayItem;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    iget-object v0, v0, Lcom/baidu/mapapi/map/OverlayItem;->mPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/MapController;->animateTo(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method protected createItem(I)Lcom/baidu/mapapi/map/OverlayItem;
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/RouteOverlay$a;

    new-instance v1, Lcom/baidu/mapapi/map/OverlayItem;

    #v1=(UninitRef);
    iget-object v2, v0, Lcom/baidu/mapapi/map/RouteOverlay$a;->b:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/RouteOverlay$a;->a:Ljava/lang/String;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-direct {v1, v2, v0, v3}, Lcom/baidu/mapapi/map/OverlayItem;-><init>(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Ljava/lang/String;Ljava/lang/String;)V

    #v1=(Reference);
    return-object v1
.end method

.method e()Lcom/baidu/platform/comapi/map/y;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->e:Lcom/baidu/platform/comapi/map/y;

    #v0=(Reference);
    return-object v0
.end method

.method f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->d:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method g()Landroid/os/Bundle;
    .locals 7

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->f:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->g:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/os/Bundle;->clear()V

    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    #v3=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/baidu/platform/comjni/tools/ParcelItem;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comjni/tools/ParcelItem;-><init>()V

    #v1=(Reference);
    new-instance v4, Landroid/os/Bundle;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    #v4=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->f:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    #v6=(Integer);
    mul-int/2addr v5, v6

    mul-int/lit8 v5, v5, 0x4

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v0, v5}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    const-string v6, "imgdata"

    #v6=(Reference);
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string v5, "type"

    const/4 v6, 0x1

    #v6=(One);
    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "imgH"

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "imgW"

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v1, v4}, Lcom/baidu/platform/comjni/tools/ParcelItem;->setBundle(Landroid/os/Bundle;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->g:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-eqz v0, :cond_2

    new-instance v1, Lcom/baidu/platform/comjni/tools/ParcelItem;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comjni/tools/ParcelItem;-><init>()V

    #v1=(Reference);
    new-instance v4, Landroid/os/Bundle;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    #v4=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->g:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    #v6=(Integer);
    mul-int/2addr v5, v6

    mul-int/lit8 v5, v5, 0x4

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v0, v5}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    const-string v6, "imgdata"

    #v6=(Reference);
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string v5, "type"

    const/4 v6, 0x2

    #v6=(PosByte);
    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "imgH"

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "imgW"

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v1, v4}, Lcom/baidu/platform/comjni/tools/ParcelItem;->setBundle(Landroid/os/Bundle;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v4, v0, [Lcom/baidu/platform/comjni/tools/ParcelItem;

    #v4=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_1
    #v0=(Integer);v1=(Integer);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comjni/tools/ParcelItem;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :cond_3
    const-string v0, "icondata"

    #v0=(Reference);
    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_4
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
    move-object v0, v2

    #v0=(Reference);
    goto/16 :goto_0
.end method

.method public getEnMarker()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->g:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    return-object v0
.end method

.method public getStMarker()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->f:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    return-object v0
.end method

.method protected onTap(I)Z
    .locals 4

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/RouteOverlay;->getItem(I)Lcom/baidu/mapapi/map/OverlayItem;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    iget-object v2, v0, Lcom/baidu/mapapi/map/OverlayItem;->mPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/MapController;->animateTo(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    iget-object v1, v0, Lcom/baidu/mapapi/map/OverlayItem;->mTitle:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->c:Landroid/content/Context;

    iget-object v0, v0, Lcom/baidu/mapapi/map/OverlayItem;->mTitle:Ljava/lang/String;

    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    invoke-super {p0, p1}, Lcom/baidu/mapapi/map/ItemizedOverlay;->onTap(I)Z

    return v3
.end method

.method public setData(Lcom/baidu/mapapi/search/MKRoute;)V
    .locals 8

    const/4 v0, 0x3

    #v0=(PosByte);
    const/4 v1, 0x2

    #v1=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    :cond_1
    #v0=(PosByte);v1=(PosByte);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKRoute;->getStart()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKRoute;->getEnd()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mRoute:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKRoute;->getRouteType()I

    move-result v3

    #v3=(Integer);
    if-ne v3, v7, :cond_4

    :goto_1
    #v1=(Integer);
    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKRoute;->getStart()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_3

    new-instance v3, Lcom/baidu/mapapi/map/RouteOverlay$a;

    #v3=(UninitRef);
    invoke-direct {v3, p0, v6}, Lcom/baidu/mapapi/map/RouteOverlay$a;-><init>(Lcom/baidu/mapapi/map/RouteOverlay;Lcom/baidu/mapapi/map/RouteOverlay$1;)V

    #v3=(Reference);
    iput-object v1, v3, Lcom/baidu/mapapi/map/RouteOverlay$a;->b:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iput v2, v3, Lcom/baidu/mapapi/map/RouteOverlay$a;->c:I

    const/4 v1, 0x4

    #v1=(PosByte);
    if-ne v0, v1, :cond_2

    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/search/MKRoute;->getStep(I)Lcom/baidu/mapapi/search/MKStep;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/search/MKStep;->getContent()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Lcom/baidu/mapapi/map/RouteOverlay$a;->a:Ljava/lang/String;

    :cond_2
    #v1=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    #v3=(Conflicted);
    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKRoute;->getNumSteps()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_6

    :goto_2
    #v2=(Integer);v4=(Conflicted);v5=(Conflicted);
    if-ge v2, v1, :cond_6

    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/search/MKRoute;->getStep(I)Lcom/baidu/mapapi/search/MKStep;

    move-result-object v3

    #v3=(Reference);
    new-instance v4, Lcom/baidu/mapapi/map/RouteOverlay$a;

    #v4=(UninitRef);
    invoke-direct {v4, p0, v6}, Lcom/baidu/mapapi/map/RouteOverlay$a;-><init>(Lcom/baidu/mapapi/map/RouteOverlay;Lcom/baidu/mapapi/map/RouteOverlay$1;)V

    #v4=(Reference);
    invoke-virtual {v3}, Lcom/baidu/mapapi/search/MKStep;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    #v5=(Reference);
    iput-object v5, v4, Lcom/baidu/mapapi/map/RouteOverlay$a;->b:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v3}, Lcom/baidu/mapapi/search/MKStep;->getContent()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v4, Lcom/baidu/mapapi/map/RouteOverlay$a;->a:Ljava/lang/String;

    iput v0, v4, Lcom/baidu/mapapi/map/RouteOverlay$a;->c:I

    iget-object v3, p0, Lcom/baidu/mapapi/map/RouteOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    #v1=(PosByte);v2=(Null);v3=(Integer);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKRoute;->getRouteType()I

    move-result v3

    if-ne v3, v1, :cond_5

    move v0, v1

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKRoute;->getRouteType()I

    move-result v1

    #v1=(Integer);
    if-ne v1, v0, :cond_8

    const/4 v0, 0x4

    goto :goto_1

    :cond_6
    #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {p1}, Lcom/baidu/mapapi/search/MKRoute;->getEnd()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_7

    new-instance v1, Lcom/baidu/mapapi/map/RouteOverlay$a;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v6}, Lcom/baidu/mapapi/map/RouteOverlay$a;-><init>(Lcom/baidu/mapapi/map/RouteOverlay;Lcom/baidu/mapapi/map/RouteOverlay$1;)V

    #v1=(Reference);
    iput-object v0, v1, Lcom/baidu/mapapi/map/RouteOverlay$a;->b:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iput v7, v1, Lcom/baidu/mapapi/map/RouteOverlay$a;->c:I

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    #v1=(Conflicted);
    invoke-direct {p0}, Lcom/baidu/mapapi/map/RouteOverlay;->h()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->mRoute:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/baidu/mapapi/search/c;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->d:Ljava/lang/String;

    goto/16 :goto_0

    :cond_8
    #v0=(PosByte);v1=(Integer);v2=(Null);v3=(Integer);v4=(Uninit);v5=(Uninit);
    move v0, v2

    #v0=(Null);
    goto :goto_1
.end method

.method public setEnMarker(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->g:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setStMarker(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/RouteOverlay;->f:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/RouteOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

*/}
