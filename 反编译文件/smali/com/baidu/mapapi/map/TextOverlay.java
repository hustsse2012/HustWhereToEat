package com.baidu.mapapi.map; class TextOverlay {/*

.class public Lcom/baidu/mapapi/map/TextOverlay;
.super Lcom/baidu/mapapi/map/Overlay;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/TextItem;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/baidu/mapapi/map/MapView;


# direct methods
.method public constructor <init>(Lcom/baidu/mapapi/map/MapView;)V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/mapapi/map/Overlay;-><init>()V

    #p0=(Reference);
    iput-object p1, p0, Lcom/baidu/mapapi/map/TextOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    const/16 v0, 0x1e

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->mType:I

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    const-string v1, "text"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    iget v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    #v0=(UninitRef);
    const-string v1, "can not add text layer"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Integer);
    return-void
.end method

.method public addText(Lcom/baidu/mapapi/map/TextItem;)V
    .locals 6

    const/4 v5, 0x0

    #v5=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->text:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget v0, p1, Lcom/baidu/mapapi/map/TextItem;->fontSize:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->fontColor:Lcom/baidu/mapapi/map/Symbol$Color;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    #v0=(Integer);
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    #v0=(Integer);
    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    const-string v3, "x"

    #v3=(Reference);
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "y"

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "fsize"

    #v0=(Reference);
    iget v2, p1, Lcom/baidu/mapapi/map/TextItem;->fontSize:I

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->bgColor:Lcom/baidu/mapapi/map/Symbol$Color;

    if-nez v0, :cond_3

    invoke-static {v5, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    :goto_1
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
    const-string v2, "bgcolor"

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->fontColor:Lcom/baidu/mapapi/map/Symbol$Color;

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/mapapi/map/Symbol$Color;->alpha:I

    #v0=(Integer);
    iget-object v2, p1, Lcom/baidu/mapapi/map/TextItem;->fontColor:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v2, v2, Lcom/baidu/mapapi/map/Symbol$Color;->blue:I

    #v2=(Integer);
    iget-object v3, p1, Lcom/baidu/mapapi/map/TextItem;->fontColor:Lcom/baidu/mapapi/map/Symbol$Color;

    #v3=(Reference);
    iget v3, v3, Lcom/baidu/mapapi/map/Symbol$Color;->green:I

    #v3=(Integer);
    iget-object v4, p1, Lcom/baidu/mapapi/map/TextItem;->fontColor:Lcom/baidu/mapapi/map/Symbol$Color;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/mapapi/map/Symbol$Color;->red:I

    #v4=(Integer);
    invoke-static {v0, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const-string v2, "fcolor"

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "str"

    #v0=(Reference);
    iget-object v2, p1, Lcom/baidu/mapapi/map/TextItem;->text:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "_"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/TextOverlay;->size()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/TextItem;->a(Ljava/lang/String;)V

    const-string v0, "id"

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/TextItem;->a()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "align"

    iget v2, p1, Lcom/baidu/mapapi/map/TextItem;->align:I

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "textaddr"

    iget v2, p0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->typeface:Landroid/graphics/Typeface;

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->typeface:Landroid/graphics/Typeface;

    invoke-virtual {v0}, Landroid/graphics/Typeface;->hashCode()I

    move-result v0

    #v0=(Integer);
    iget-object v2, p1, Lcom/baidu/mapapi/map/TextItem;->typeface:Landroid/graphics/Typeface;

    #v2=(Reference);
    invoke-static {v0, v2}, Lvi/com/gdi/bgl/android/java/EnvDrawText;->registFontCache(ILandroid/graphics/Typeface;)V

    const-string v0, "fstyle"

    #v0=(Reference);
    iget-object v2, p1, Lcom/baidu/mapapi/map/TextItem;->typeface:Landroid/graphics/Typeface;

    invoke-virtual {v2}, Landroid/graphics/Typeface;->hashCode()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_2
    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->i(Landroid/os/Bundle;)I

    goto/16 :goto_0

    :cond_3
    #v3=(Reference);v4=(Uninit);
    iget-object v0, p1, Lcom/baidu/mapapi/map/TextItem;->bgColor:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v0, v0, Lcom/baidu/mapapi/map/Symbol$Color;->alpha:I

    #v0=(Integer);
    iget-object v2, p1, Lcom/baidu/mapapi/map/TextItem;->bgColor:Lcom/baidu/mapapi/map/Symbol$Color;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/mapapi/map/Symbol$Color;->blue:I

    #v2=(Integer);
    iget-object v3, p1, Lcom/baidu/mapapi/map/TextItem;->bgColor:Lcom/baidu/mapapi/map/Symbol$Color;

    iget v3, v3, Lcom/baidu/mapapi/map/Symbol$Color;->green:I

    #v3=(Integer);
    iget-object v4, p1, Lcom/baidu/mapapi/map/TextItem;->bgColor:Lcom/baidu/mapapi/map/Symbol$Color;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/mapapi/map/Symbol$Color;->red:I

    #v4=(Integer);
    invoke-static {v0, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    goto/16 :goto_1

    :cond_4
    #v0=(Reference);v3=(LongHi);
    const-string v0, "fstyle"

    invoke-virtual {v1, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_2
.end method

.method b()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/TextOverlay;->removeAll()Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/TextItem;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/TextOverlay;->addText(Lcom/baidu/mapapi/map/TextItem;)V

    goto :goto_0

    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public getAllText()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/TextItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method public getText(I)Lcom/baidu/mapapi/map/TextItem;
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/TextOverlay;->size()I

    move-result v0

    #v0=(Integer);
    if-ge p1, v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextItem;

    :goto_0
    return-object v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public removeAll()Z
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public removeText(Lcom/baidu/mapapi/map/TextItem;)Z
    .locals 5

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    iget-object v2, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

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
    iget v2, p0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    #v2=(Integer);
    if-nez v2, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    #v1=(Null);
    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    const-string v3, "textaddr"

    #v3=(Reference);
    iget v4, p0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    #v4=(Integer);
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/TextItem;->a()Ljava/lang/String;

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
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/TextItem;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/baidu/mapapi/map/TextOverlay;->b:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v3}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v3

    iget-object v3, v3, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->j(Landroid/os/Bundle;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_4

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    iget-object v1, p1, Lcom/baidu/mapapi/map/TextItem;->typeface:Landroid/graphics/Typeface;

    #v1=(Reference);
    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/baidu/mapapi/map/TextItem;->typeface:Landroid/graphics/Typeface;

    invoke-virtual {v1}, Landroid/graphics/Typeface;->hashCode()I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Lvi/com/gdi/bgl/android/java/EnvDrawText;->removeFontCache(I)V

    :cond_5
    #v1=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextOverlay;->a:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

*/}
