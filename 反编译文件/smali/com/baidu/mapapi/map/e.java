package com.baidu.mapapi.map; class e {/*

.class Lcom/baidu/mapapi/map/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/platform/comapi/map/a;


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/map/MapView;


# direct methods
.method constructor <init>(Lcom/baidu/mapapi/map/MapView;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/e;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    if-eqz p1, :cond_1

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-static {}, Lcom/baidu/mapapi/utils/b;->h()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/BaiduMapSDK/capture.png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/e;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-boolean v1, Lcom/baidu/platform/comapi/a;->a:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/e;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/baidu/mapapi/map/MKMapViewListener;->onGetCurrentMap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/e;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/baidu/mapapi/map/MKMapViewListener;->onGetCurrentMap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/e;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/e;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/baidu/mapapi/map/MKMapViewListener;->onGetCurrentMap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

*/}
