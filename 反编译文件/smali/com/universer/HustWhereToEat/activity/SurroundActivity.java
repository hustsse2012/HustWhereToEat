package com.universer.HustWhereToEat.activity; class SurroundActivity {/*

.class public Lcom/universer/HustWhereToEat/activity/SurroundActivity;
.super Landroid/app/Activity;
.source "SurroundActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;
    }
.end annotation


# static fields
.field public static final MAPKEY:Ljava/lang/String; = "E3466274d2406295cc220c9b43e516d5"


# instance fields
.field private itemList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/OverlayItem;",
            ">;"
        }
    .end annotation
.end field

.field private itemPopLay:Lcom/baidu/mapapi/map/PopupOverlay;

.field private mLocationClient:Lcom/baidu/location/LocationClient;

.field private mLocationData:Lcom/baidu/mapapi/map/LocationData;

.field private mLocationListener:Lcom/baidu/location/BDLocationListener;

.field private mOverlay:Lcom/baidu/mapapi/map/MyLocationOverlay;

.field private mapManager:Lcom/baidu/mapapi/BMapManager;

.field private mapView:Lcom/baidu/mapapi/map/MapView;

.field private overLays:Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

.field private restaurantList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/universer/HustWhereToEat/model/Restaurant;",
            ">;"
        }
    .end annotation
.end field

.field private restautrantPopView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 33
    #v0=(Null);
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 34
    #p0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    .line 35
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    .line 36
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->itemList:Ljava/util/List;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restaurantList:Ljava/util/List;

    .line 45
    new-instance v0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;-><init>(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationListener:Lcom/baidu/location/BDLocationListener;

    .line 33
    return-void
.end method

.method static synthetic access$0(Lcom/universer/HustWhereToEat/activity/SurroundActivity;Lcom/baidu/location/BDLocation;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 100
    invoke-direct {p0, p1}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->initRestaurantData(Lcom/baidu/location/BDLocation;)V

    return-void
.end method

.method static synthetic access$1(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/location/LocationClient;
    .locals 1
    .parameter

    .prologue
    .line 36
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$10(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/PopupOverlay;
    .locals 1
    .parameter

    .prologue
    .line 42
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->itemPopLay:Lcom/baidu/mapapi/map/PopupOverlay;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$2(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/LocationData;
    .locals 1
    .parameter

    .prologue
    .line 38
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationData:Lcom/baidu/mapapi/map/LocationData;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$3(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Ljava/util/List;
    .locals 1
    .parameter

    .prologue
    .line 41
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restaurantList:Ljava/util/List;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$4(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Ljava/util/List;
    .locals 1
    .parameter

    .prologue
    .line 40
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->itemList:Ljava/util/List;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$5(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;
    .locals 1
    .parameter

    .prologue
    .line 39
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->overLays:Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$6(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/MapView;
    .locals 1
    .parameter

    .prologue
    .line 35
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$7(Lcom/universer/HustWhereToEat/activity/SurroundActivity;Lcom/baidu/mapapi/map/PopupOverlay;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 42
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->itemPopLay:Lcom/baidu/mapapi/map/PopupOverlay;

    return-void
.end method

.method static synthetic access$8(Lcom/universer/HustWhereToEat/activity/SurroundActivity;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 319
    invoke-direct {p0, p1}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->initPopLayView(I)V

    return-void
.end method

.method static synthetic access$9(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Landroid/view/View;
    .locals 1
    .parameter

    .prologue
    .line 44
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restautrantPopView:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method public static convertViewToBitmap(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 5
    .parameter "view"

    .prologue
    const/4 v4, 0x0

    .line 264
    #v4=(Null);
    invoke-virtual {p0, v4}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 265
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 266
    #v2=(Integer);
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 265
    #v3=(Integer);
    invoke-virtual {p0, v2, v3}, Landroid/view/View;->measure(II)V

    .line 267
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-virtual {p0, v4, v4, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 268
    invoke-virtual {p0}, Landroid/view/View;->buildDrawingCache()V

    .line 269
    invoke-virtual {p0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 270
    .local v1, cacheBitmap:Landroid/graphics/Bitmap;
    #v1=(Reference);
    invoke-static {v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 271
    .local v0, bitmap:Landroid/graphics/Bitmap;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/view/View;->destroyDrawingCache()V

    .line 272
    return-object v0
.end method

.method private findView()V
    .locals 1

    .prologue
    .line 253
    const v0, 0x7f050015

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/MapView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    .line 254
    return-void
.end method

.method private initLoc()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 175
    #v3=(One);
    new-instance v1, Lcom/baidu/location/LocationClient;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v1, v2}, Lcom/baidu/location/LocationClient;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    .line 176
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    const-string v2, "E3466274d2406295cc220c9b43e516d5"

    invoke-virtual {v1, v2}, Lcom/baidu/location/LocationClient;->setAK(Ljava/lang/String;)V

    .line 177
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationListener:Lcom/baidu/location/BDLocationListener;

    invoke-virtual {v1, v2}, Lcom/baidu/location/LocationClient;->registerLocationListener(Lcom/baidu/location/BDLocationListener;)V

    .line 178
    new-instance v0, Lcom/baidu/location/LocationClientOption;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/LocationClientOption;-><init>()V

    .line 179
    .local v0, option:Lcom/baidu/location/LocationClientOption;
    #v0=(Reference);
    invoke-virtual {v0, v3}, Lcom/baidu/location/LocationClientOption;->setOpenGps(Z)V

    .line 180
    const-string v1, "all"

    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClientOption;->setAddrType(Ljava/lang/String;)V

    .line 181
    const-string v1, "bd09ll"

    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClientOption;->setCoorType(Ljava/lang/String;)V

    .line 182
    const/16 v1, 0x1388

    #v1=(PosShort);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClientOption;->setScanSpan(I)V

    .line 183
    invoke-virtual {v0, v3}, Lcom/baidu/location/LocationClientOption;->disableCache(Z)V

    .line 187
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/location/LocationClient;->setLocOption(Lcom/baidu/location/LocationClientOption;)V

    .line 188
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    invoke-virtual {v1}, Lcom/baidu/location/LocationClient;->start()V

    .line 189
    new-instance v1, Lcom/baidu/mapapi/map/MyLocationOverlay;

    #v1=(UninitRef);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    invoke-direct {v1, v2}, Lcom/baidu/mapapi/map/MyLocationOverlay;-><init>(Lcom/baidu/mapapi/map/MapView;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mOverlay:Lcom/baidu/mapapi/map/MyLocationOverlay;

    .line 190
    new-instance v1, Lcom/baidu/mapapi/map/LocationData;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/map/LocationData;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationData:Lcom/baidu/mapapi/map/LocationData;

    .line 191
    new-instance v1, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

    #v1=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 192
    const v3, 0x7f02003f

    .line 191
    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 192
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    #v3=(Reference);
    invoke-direct {v1, p0, v2, v3}, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;-><init>(Lcom/universer/HustWhereToEat/activity/SurroundActivity;Landroid/graphics/drawable/Drawable;Lcom/baidu/mapapi/map/MapView;)V

    .line 191
    #v1=(Reference);
    iput-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->overLays:Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

    .line 193
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mOverlay:Lcom/baidu/mapapi/map/MyLocationOverlay;

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationData:Lcom/baidu/mapapi/map/LocationData;

    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/MyLocationOverlay;->setData(Lcom/baidu/mapapi/map/LocationData;)V

    .line 194
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mOverlay:Lcom/baidu/mapapi/map/MyLocationOverlay;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MyLocationOverlay;->enableCompass()Z

    .line 195
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mOverlay:Lcom/baidu/mapapi/map/MyLocationOverlay;

    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020035

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/MyLocationOverlay;->setMarker(Landroid/graphics/drawable/Drawable;)V

    .line 196
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getOverlays()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mOverlay:Lcom/baidu/mapapi/map/MyLocationOverlay;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getOverlays()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->overLays:Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    const/high16 v2, 0x4150

    #v2=(Integer);
    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/MapController;->setZoom(F)F

    .line 199
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->refresh()V

    .line 200
    return-void
.end method

.method private initMap()V
    .locals 3

    .prologue
    .line 257
    new-instance v0, Lcom/baidu/mapapi/BMapManager;

    #v0=(UninitRef);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/baidu/mapapi/BMapManager;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    .line 259
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    const-string v1, "E3466274d2406295cc220c9b43e516d5"

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapapi/BMapManager;->init(Ljava/lang/String;Lcom/baidu/mapapi/MKGeneralListener;)Z

    .line 261
    return-void
.end method

.method private initMapSet()V
    .locals 3

    .prologue
    .line 243
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/MapView;->setBuiltInZoomControls(Z)V

    .line 244
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    .line 248
    .local v0, mMapController:Lcom/baidu/mapapi/map/MapController;
    #v0=(Reference);
    const/high16 v1, 0x4160

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/MapController;->setZoom(F)F

    .line 250
    return-void
.end method

.method private initPopLayView(I)V
    .locals 6
    .parameter "index"

    .prologue
    .line 320
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restaurantList:Ljava/util/List;

    #v3=(Reference);
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Lcom/universer/HustWhereToEat/model/Restaurant;

    .line 321
    .local v2, res:Lcom/universer/HustWhereToEat/model/Restaurant;
    invoke-virtual {v2}, Lcom/universer/HustWhereToEat/model/Restaurant;->getAddress()Ljava/lang/String;

    move-result-object v0

    .line 322
    .local v0, address:Ljava/lang/String;
    #v0=(Reference);
    invoke-virtual {v2}, Lcom/universer/HustWhereToEat/model/Restaurant;->getName()Ljava/lang/String;

    move-result-object v1

    .line 323
    .local v1, name:Ljava/lang/String;
    #v1=(Reference);
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    .line 324
    const v4, 0x7f030002

    #v4=(Integer);
    const/4 v5, 0x0

    .line 323
    #v5=(Null);
    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restautrantPopView:Landroid/view/View;

    .line 325
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restautrantPopView:Landroid/view/View;

    const v4, 0x7f050018

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 326
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 327
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restautrantPopView:Landroid/view/View;

    const v4, 0x7f050017

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 328
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    return-void
.end method

.method private initRestaurantData(Lcom/baidu/location/BDLocation;)V
    .locals 13
    .parameter "location"

    .prologue
    const-wide v11, 0x3f947ae147ae147bL

    #v11=(LongLo);v12=(LongHi);
    const-wide/16 v7, 0x0

    #v7=(LongLo);v8=(LongHi);
    const-wide v9, 0x412e848000000000L

    .line 101
    #v9=(LongLo);v10=(LongHi);
    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .local v6, comments:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    #v6=(Reference);
    const-string v1, "\u597d\u8bc4"

    #v1=(Reference);
    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    const-string v1, "\u597d\u8bc4"

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    #v0=(UninitRef);
    const-string v1, "\u9ea6\u82bd\u8297"

    const-string v2, "2130837575"

    .line 123
    #v2=(Reference);
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    #v3=(Integer);
    const-string v4, "\u534e\u79d1\u751f\u6d3b\u95e8"

    #v4=(Reference);
    const-string v5, "13098840196"

    .line 122
    #v5=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 124
    .local v0, res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    new-instance v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    .line 125
    #v1=(UninitRef);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    add-double/2addr v2, v7

    mul-double/2addr v2, v9

    double-to-int v2, v2

    .line 126
    #v2=(Integer);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    add-double/2addr v3, v7

    mul-double/2addr v3, v9

    double-to-int v3, v3

    #v3=(Integer);
    invoke-direct {v1, v2, v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    .line 124
    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/model/Restaurant;->setPoint(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    .line 127
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u897f\u82d1\u5496\u5561"

    const-string v2, "2130837571"

    .line 129
    #v2=(Reference);
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u897f\u5341\u4e00\u820d\u9644\u8fd1"

    #v4=(Reference);
    const-string v5, "13098840196"

    .line 128
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 130
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    new-instance v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    .line 131
    #v1=(UninitRef);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    add-double/2addr v2, v11

    mul-double/2addr v2, v9

    double-to-int v2, v2

    .line 132
    #v2=(Integer);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    add-double/2addr v3, v11

    mul-double/2addr v3, v9

    double-to-int v3, v3

    #v3=(Integer);
    invoke-direct {v1, v2, v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    .line 130
    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/model/Restaurant;->setPoint(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    .line 133
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u9e2d\u8840\u7c89\u4e1d"

    const-string v2, "2130837580"

    .line 135
    #v2=(Reference);
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->SMALL:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u5357\u4e09\u95e8"

    #v4=(Reference);
    const-string v5, "13098840196"

    .line 134
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 136
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    new-instance v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    .line 137
    #v1=(UninitRef);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    const-wide v4, 0x3fa47ae147ae147bL

    #v4=(LongLo);v5=(LongHi);
    add-double/2addr v2, v4

    mul-double/2addr v2, v9

    double-to-int v2, v2

    .line 138
    #v2=(Integer);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    mul-double/2addr v3, v9

    double-to-int v3, v3

    #v3=(Integer);
    invoke-direct {v1, v2, v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    .line 136
    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/model/Restaurant;->setPoint(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    .line 139
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u7b80\u6734\u7530\u56ed\u5be8(\u5149\u8c37\u822a\u6bcd\u5e97) "

    .line 141
    const-string v2, "2130837578"

    #v2=(Reference);
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    .line 142
    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u5357\u5927\u95e8"

    #v4=(Reference);
    const-string v5, "13098840196"

    .line 140
    #v5=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 143
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    new-instance v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    .line 144
    #v1=(UninitRef);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    const-wide v4, 0x3faeb851eb851eb8L

    #v4=(LongLo);v5=(LongHi);
    add-double/2addr v2, v4

    mul-double/2addr v2, v9

    double-to-int v2, v2

    .line 145
    #v2=(Integer);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    mul-double/2addr v3, v9

    double-to-int v3, v3

    #v3=(Integer);
    invoke-direct {v1, v2, v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    .line 143
    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/model/Restaurant;->setPoint(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    .line 146
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    new-instance v0, Lcom/universer/HustWhereToEat/model/Restaurant;

    .end local v0           #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(UninitRef);
    const-string v1, "\u6c27\u6c14\u5c42"

    const-string v2, "2130837576"

    .line 148
    #v2=(Reference);
    sget v3, Lcom/universer/HustWhereToEat/model/Restaurant;->BIG:I

    const-string v4, "\u534e\u4e2d\u79d1\u6280\u5927\u5b66\u897f\u56ed\u98df\u5802\u9644\u8fd1"

    #v4=(Reference);
    const-string v5, "13098840196"

    .line 147
    #v5=(Reference);
    invoke-direct/range {v0 .. v6}, Lcom/universer/HustWhereToEat/model/Restaurant;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 149
    .restart local v0       #res:Lcom/universer/HustWhereToEat/model/Restaurant;
    #v0=(Reference);
    new-instance v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    .line 150
    #v1=(UninitRef);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    const-wide v4, 0x3fb47ae147ae147bL

    #v4=(LongLo);v5=(LongHi);
    add-double/2addr v2, v4

    mul-double/2addr v2, v9

    double-to-int v2, v2

    .line 151
    #v2=(Integer);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    const-wide v7, 0x3f80624dd2f1a9fcL

    sub-double/2addr v3, v7

    mul-double/2addr v3, v9

    double-to-int v3, v3

    #v3=(Integer);
    invoke-direct {v1, v2, v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    .line 149
    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/universer/HustWhereToEat/model/Restaurant;->setPoint(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    .line 152
    iget-object v1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->restaurantList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .parameter "savedInstanceState"

    .prologue
    .line 90
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 91
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->initMap()V

    .line 92
    const v0, 0x7f030001

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->setContentView(I)V

    .line 94
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->findView()V

    .line 95
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->initLoc()V

    .line 96
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->initMapSet()V

    .line 98
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->destroy()V

    .line 220
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mLocationClient:Lcom/baidu/location/LocationClient;

    invoke-virtual {v0}, Lcom/baidu/location/LocationClient;->stop()V

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    if-eqz v0, :cond_1

    .line 224
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    invoke-virtual {v0}, Lcom/baidu/mapapi/BMapManager;->destroy()V

    .line 225
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    .line 227
    :cond_1
    #v0=(Reference);
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 228
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->onPause()V

    .line 235
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    invoke-virtual {v0}, Lcom/baidu/mapapi/BMapManager;->stop()Z

    .line 238
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 239
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapView:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->onResume()V

    .line 205
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->mapManager:Lcom/baidu/mapapi/BMapManager;

    invoke-virtual {v0}, Lcom/baidu/mapapi/BMapManager;->start()Z

    .line 213
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 214
    return-void
.end method

*/}
