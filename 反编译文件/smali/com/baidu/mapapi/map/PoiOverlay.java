package com.baidu.mapapi.map; class PoiOverlay {/*

.class public Lcom/baidu/mapapi/map/PoiOverlay;
.super Lcom/baidu/mapapi/map/Overlay;


# instance fields
.field private a:Lcom/baidu/mapapi/map/MapView;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKPoiInfo;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Lcom/baidu/platform/comapi/map/d;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/baidu/mapapi/map/MapView;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Lcom/baidu/mapapi/map/Overlay;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->a:Lcom/baidu/mapapi/map/MapView;

    iput-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->b:Landroid/content/Context;

    iput-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->d:Ljava/lang/String;

    const/16 v0, 0xe

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->mType:I

    iput-object p1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->b:Landroid/content/Context;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/baidu/mapapi/map/PoiOverlay;->a:Lcom/baidu/mapapi/map/MapView;

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    new-instance v0, Lcom/baidu/platform/comapi/map/x;

    #v0=(UninitRef);
    iget v1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->mType:I

    #v1=(Integer);
    invoke-direct {v0, v1}, Lcom/baidu/platform/comapi/map/x;-><init>(I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->e:Lcom/baidu/platform/comapi/map/d;

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->a:Lcom/baidu/mapapi/map/MapView;

    const-string v1, "default"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->mLayerID:I

    iget v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->mLayerID:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    #v0=(UninitRef);
    const-string v1, "can not create poi layer."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->mLayerID:I

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/PoiOverlay;->e:Lcom/baidu/platform/comapi/map/d;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapapi/map/MapView;->a(ILcom/baidu/platform/comapi/map/d;)V

    return-void
.end method

.method public animateTo()V
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/PoiOverlay;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    #v1=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/MKPoiInfo;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/MapController;->animateTo(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->d:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getInnerOverlay()Lcom/baidu/platform/comapi/map/d;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->e:Lcom/baidu/platform/comapi/map/d;

    #v0=(Reference);
    return-object v0
.end method

.method public getPoi(I)Lcom/baidu/mapapi/search/MKPoiInfo;
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Reference);
    if-ltz p1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge p1, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/MKPoiInfo;

    goto :goto_0
.end method

.method protected onTap(I)Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    #v1=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/MKPoiInfo;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/MapController;->animateTo(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/MKPoiInfo;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKPoiInfo;->name:Ljava/lang/String;

    const/4 v2, 0x1

    #v2=(One);
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public setData(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKPoiInfo;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    :goto_1
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    #v1=(Integer);v2=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/search/c;->c(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->d:Ljava/lang/String;

    goto :goto_0
.end method

.method public size()I
    .locals 2

    const/16 v0, 0xa

    #v0=(PosByte);
    iget-object v1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    #v1=(Reference);
    if-nez v1, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(PosByte);v1=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-gt v1, v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/PoiOverlay;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

*/}
