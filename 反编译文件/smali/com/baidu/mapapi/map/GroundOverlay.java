package com.baidu.mapapi.map; class GroundOverlay {/*

.class public Lcom/baidu/mapapi/map/GroundOverlay;
.super Lcom/baidu/mapapi/map/Overlay;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/Ground;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/baidu/mapapi/map/MapView;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/baidu/mapapi/map/GroundOverlay;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapapi/map/GroundOverlay;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/baidu/mapapi/map/MapView;)V
    .locals 2

    invoke-direct {p0}, Lcom/baidu/mapapi/map/Overlay;-><init>()V

    #p0=(Reference);
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "mapview can not be null"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    const v0, 0x21341231

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mType:I

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    iput-object p1, p0, Lcom/baidu/mapapi/map/GroundOverlay;->c:Lcom/baidu/mapapi/map/MapView;

    return-void
.end method

.method private a(Lcom/baidu/mapapi/map/Ground;)Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Ground;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Ground;->b()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Ground;->b()I

    move-result v2

    #v2=(Integer);
    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method


# virtual methods
.method a()V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->c:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    const-string v1, "ground_layer_tag"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    sget-object v0, Lcom/baidu/mapapi/map/GroundOverlay;->a:Ljava/lang/String;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "ground layer added: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v0=(Integer);
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

.method a(Ljava/util/List;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/Ground;",
            ">;Z)V"
        }
    .end annotation

    if-nez p2, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    #v2=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    #v3=(Reference);v4=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Ground;

    if-eqz v0, :cond_0

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    #v0=(Boolean);v4=(Conflicted);
    move-object p1, v1

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_3

    :goto_1
    #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void

    :cond_3
    #v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    new-instance v3, Landroid/os/Bundle;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    #v3=(Reference);
    const-string v0, "ground_layer_addr"

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v1=(Integer);
    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p2, :cond_4

    const-string v0, "extparam"

    const-string v1, "update"

    #v1=(Reference);
    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    #v1=(Conflicted);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    new-array v4, v0, [Landroid/os/Bundle;

    #v4=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    move v2, v0

    :goto_2
    #v0=(Integer);v2=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_8

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Ground;

    if-nez p2, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    #v5=(LongLo);v6=(LongHi);
    sget-object v1, Lcom/baidu/mapapi/map/GroundOverlay;->a:Ljava/lang/String;

    #v1=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "set id: "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "_"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/Ground;->a(Ljava/lang/String;)V

    :cond_5
    #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Ground;->a()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v4, v2

    if-nez p2, :cond_6

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapapi/map/Ground;

    invoke-direct {p0, v1}, Lcom/baidu/mapapi/map/GroundOverlay;->a(Lcom/baidu/mapapi/map/Ground;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_6

    sget-object v1, Lcom/baidu/mapapi/map/GroundOverlay;->a:Ljava/lang/String;

    #v1=(Reference);
    const-string v5, "same drawable added"

    #v5=(Reference);
    invoke-static {v1, v5}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    aget-object v1, v4, v2

    #v1=(Null);
    const-string v5, "drawable"

    const/4 v6, 0x0

    #v6=(Null);
    invoke-virtual {v1, v5, v6}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :cond_6
    #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-nez p2, :cond_7

    iget-object v1, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    #v1=(Conflicted);
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_2

    :cond_8
    const-string v0, "ground_bundles"

    #v0=(Reference);
    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->c:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/baidu/platform/comjni/map/basemap/a;->e(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->d:Z

    goto/16 :goto_1
.end method

.method a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/GroundOverlay;->d:Z

    return-void
.end method

.method public addAllGround(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/Ground;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Integer);v1=(Uninit);v2=(Uninit);
    iget v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    if-nez v0, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Ground;

    iget-object v2, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v2=(Reference);
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_2

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v2=(Reference);
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    #v0=(Integer);v1=(Uninit);v2=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, v0}, Lcom/baidu/mapapi/map/GroundOverlay;->a(Ljava/util/List;Z)V

    goto :goto_0
.end method

.method public addGround(Lcom/baidu/mapapi/map/Ground;)V
    .locals 1

    if-nez p1, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/GroundOverlay;->addAllGround(Ljava/util/List;)V

    goto :goto_0
.end method

.method b()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/GroundOverlay;->addAllGround(Ljava/util/List;)V

    return-void
.end method

.method c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->d:Z

    #v0=(Boolean);
    return v0
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->c:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->d:Z

    return-void
.end method

.method public getGround(I)Lcom/baidu/mapapi/map/Ground;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/Ground;

    return-object v0
.end method

.method public removeGround(Lcom/baidu/mapapi/map/Ground;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v0=(Integer);
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    #v0=(Integer);
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "itemaddr"

    #v1=(Reference);
    iget v2, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "id"

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/Ground;->c()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/GroundOverlay;->c:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comjni/map/basemap/a;->d(Landroid/os/Bundle;)Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->d:Z

    goto :goto_0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public updateGround(Lcom/baidu/mapapi/map/Ground;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->b:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget v0, p0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {p0, v0, v1}, Lcom/baidu/mapapi/map/GroundOverlay;->a(Ljava/util/List;Z)V

    goto :goto_0
.end method

*/}
