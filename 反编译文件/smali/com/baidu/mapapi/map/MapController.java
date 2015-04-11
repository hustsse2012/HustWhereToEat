package com.baidu.mapapi.map; class MapController {/*

.class public Lcom/baidu/mapapi/map/MapController;
.super Ljava/lang/Object;


# static fields
.field public static final DEFAULT_ANIMATION_TIME:I = 0x12c

.field private static final c:Ljava/lang/String;


# instance fields
.field a:Lcom/baidu/platform/comapi/map/o;

.field b:Landroid/os/Message;

.field private d:Lcom/baidu/mapapi/map/MapView;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapapi/map/MapController;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/baidu/mapapi/map/MapView;)V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapController;->b:Landroid/os/Message;

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapController;->e:Z

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapController;->f:Z

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapController;->g:Z

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapController;->h:Z

    iput-object p1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    return-void
.end method

.method private a(IILcom/baidu/platform/comapi/map/t;)Lcom/baidu/platform/comapi/map/t;
    .locals 7

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getWidth()I

    move-result v0

    #v0=(Integer);
    if-gt p1, v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getHeight()I

    move-result v0

    #v0=(Integer);
    if-gt p2, v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getRight()I

    move-result v0

    #v0=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getLeft()I

    move-result v1

    #v1=(Integer);
    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getBottom()I

    move-result v1

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/map/MapView;->getTop()I

    move-result v2

    #v2=(Integer);
    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    sub-int v2, p1, v0

    sub-int v3, p2, v1

    #v3=(Integer);
    sget-object v4, Lcom/baidu/mapapi/map/MapController;->c:Ljava/lang/String;

    #v4=(Reference);
    const-string v5, "set center to pixcel"

    #v5=(Reference);
    invoke-static {v4, v5}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Lcom/baidu/mapapi/map/MapController;->c:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "x"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " y"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Lcom/baidu/mapapi/map/MapController;->c:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "xCenter="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    const-string v5, " yCenter="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapController;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v4, "xOffset="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " yOffset="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    int-to-long v0, v2

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p3, Lcom/baidu/platform/comapi/map/t;->h:J

    neg-int v0, v3

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);
    iput-wide v0, p3, Lcom/baidu/platform/comapi/map/t;->i:J

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-object p3
.end method

.method private a(Lcom/baidu/mapapi/map/MKMapStatus;)Lcom/baidu/platform/comapi/map/t;
    .locals 6

    const/4 v0, 0x0

    #v0=(Null);
    const/16 v5, -0x2d

    #v5=(Byte);
    const/high16 v4, 0x4198

    #v4=(Integer);
    const/high16 v3, 0x4040

    #v3=(Integer);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);
    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    #v1=(Integer);
    cmpg-float v1, v1, v3

    #v1=(Byte);
    if-gez v1, :cond_2

    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    #v1=(Integer);
    sget v2, Lcom/baidu/mapapi/map/MKMapStatus;->NOT_CHANGE:I

    #v2=(Integer);
    int-to-float v2, v2

    #v2=(Float);
    cmpl-float v1, v1, v2

    #v1=(Byte);
    if-eqz v1, :cond_2

    iput v3, p1, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    :cond_2
    #v2=(Conflicted);
    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    #v1=(Integer);
    cmpl-float v1, v1, v4

    #v1=(Byte);
    if-lez v1, :cond_3

    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    #v1=(Integer);
    sget v2, Lcom/baidu/mapapi/map/MKMapStatus;->NOT_CHANGE:I

    #v2=(Integer);
    int-to-float v2, v2

    #v2=(Float);
    cmpl-float v1, v1, v2

    #v1=(Byte);
    if-eqz v1, :cond_3

    iput v4, p1, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    :cond_3
    #v2=(Conflicted);
    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    #v1=(Integer);
    sget v2, Lcom/baidu/mapapi/map/MKMapStatus;->NOT_CHANGE:I

    #v2=(Integer);
    if-eq v1, v2, :cond_5

    :goto_1
    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    if-gez v1, :cond_4

    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    add-int/lit16 v1, v1, 0x168

    iput v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    goto :goto_1

    :cond_4
    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    rem-int/lit16 v1, v1, 0x168

    iput v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    :cond_5
    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    if-lez v1, :cond_6

    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    sget v2, Lcom/baidu/mapapi/map/MKMapStatus;->NOT_CHANGE:I

    if-eq v1, v2, :cond_6

    const/4 v1, 0x0

    #v1=(Null);
    iput v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    :cond_6
    #v1=(Integer);
    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    if-ge v1, v5, :cond_7

    iget v1, p1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    sget v2, Lcom/baidu/mapapi/map/MKMapStatus;->NOT_CHANGE:I

    if-eq v1, v2, :cond_7

    iput v5, p1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    :cond_7
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    #v0=(Integer);
    sget v2, Lcom/baidu/mapapi/map/MKMapStatus;->NOT_CHANGE:I

    int-to-float v2, v2

    #v2=(Float);
    cmpl-float v0, v0, v2

    #v0=(Byte);
    if-eqz v0, :cond_8

    iget v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    #v0=(Integer);
    iput v0, v1, Lcom/baidu/platform/comapi/map/t;->a:F

    :cond_8
    iget v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    sget v2, Lcom/baidu/mapapi/map/MKMapStatus;->NOT_CHANGE:I

    #v2=(Integer);
    if-eq v0, v2, :cond_9

    iget v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    iput v0, v1, Lcom/baidu/platform/comapi/map/t;->b:I

    :cond_9
    iget v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    sget v2, Lcom/baidu/mapapi/map/MKMapStatus;->NOT_CHANGE:I

    if-eq v0, v2, :cond_a

    iget v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    iput v0, v1, Lcom/baidu/platform/comapi/map/t;->c:I

    :cond_a
    iget-object v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->targetGeo:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    if-eqz v0, :cond_b

    iget-object v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->targetGeo:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    iput v2, v1, Lcom/baidu/platform/comapi/map/t;->d:I

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    iput v0, v1, Lcom/baidu/platform/comapi/map/t;->e:I

    :cond_b
    #v0=(Conflicted);
    iget-object v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->targetScreen:Landroid/graphics/Point;

    #v0=(Reference);
    if-eqz v0, :cond_c

    iget-object v0, p1, Lcom/baidu/mapapi/map/MKMapStatus;->targetScreen:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    #v0=(Integer);
    iget-object v2, p1, Lcom/baidu/mapapi/map/MKMapStatus;->targetScreen:Landroid/graphics/Point;

    #v2=(Reference);
    iget v2, v2, Landroid/graphics/Point;->y:I

    #v2=(Integer);
    invoke-direct {p0, v0, v2, v1}, Lcom/baidu/mapapi/map/MapController;->a(IILcom/baidu/platform/comapi/map/t;)Lcom/baidu/platform/comapi/map/t;

    :cond_c
    #v0=(Conflicted);
    move-object v0, v1

    #v0=(Reference);
    goto/16 :goto_0
.end method


# virtual methods
.method a()Lcom/baidu/mapapi/map/MKMapStatus;
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_0
    #v2=(Uninit);v3=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/map/MKMapStatus;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/map/MKMapStatus;-><init>()V

    #v0=(Reference);
    iget v2, v1, Lcom/baidu/platform/comapi/map/t;->c:I

    #v2=(Integer);
    iput v2, v0, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    iget v2, v1, Lcom/baidu/platform/comapi/map/t;->b:I

    iput v2, v0, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    iget v2, v1, Lcom/baidu/platform/comapi/map/t;->a:F

    iput v2, v0, Lcom/baidu/mapapi/map/MKMapStatus;->zoom:F

    new-instance v2, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(UninitRef);
    iget v3, v1, Lcom/baidu/platform/comapi/map/t;->e:I

    #v3=(Integer);
    iget v1, v1, Lcom/baidu/platform/comapi/map/t;->d:I

    #v1=(Integer);
    invoke-direct {v2, v3, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, v0, Lcom/baidu/mapapi/map/MKMapStatus;->targetGeo:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapController;->b()Landroid/graphics/Point;

    move-result-object v1

    iput-object v1, v0, Lcom/baidu/mapapi/map/MKMapStatus;->targetScreen:Landroid/graphics/Point;

    goto :goto_0
.end method

.method public animateTo(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 2

    if-nez p1, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapController;->isMapLoadFinish()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/MapController;->setCenter(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    goto :goto_0
.end method

.method public animateTo(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/os/Message;)V
    .locals 2

    if-nez p1, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapController;->isMapLoadFinish()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/MapController;->setCenter(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    iput-object p2, p0, Lcom/baidu/mapapi/map/MapController;->b:Landroid/os/Message;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1, v0, p2}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/os/Message;)V

    goto :goto_0
.end method

.method b()Landroid/graphics/Point;
    .locals 5

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-wide v1, v0, Lcom/baidu/platform/comapi/map/t;->h:J

    #v1=(LongLo);v2=(LongHi);
    long-to-int v1, v1

    #v1=(Integer);
    iget-wide v2, v0, Lcom/baidu/platform/comapi/map/t;->i:J

    #v2=(LongLo);v3=(LongHi);
    long-to-int v0, v2

    #v0=(Integer);
    neg-int v0, v0

    iget-object v2, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/mapapi/map/MapView;->getRight()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/mapapi/map/MapView;->getLeft()I

    move-result v3

    #v3=(Integer);
    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    iget-object v3, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/mapapi/map/MapView;->getBottom()I

    move-result v3

    #v3=(Integer);
    iget-object v4, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v4=(Reference);
    invoke-virtual {v4}, Lcom/baidu/mapapi/map/MapView;->getTop()I

    move-result v4

    #v4=(Integer);
    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v1, v2

    add-int v2, v3, v0

    new-instance v0, Landroid/graphics/Point;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    #v0=(Reference);
    goto :goto_0
.end method

.method public enableClick(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->h(Z)V

    return-void
.end method

.method public handleFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/baidu/platform/comapi/map/o;->a(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isMapLoadFinish()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/baidu/mapapi/map/MapView;->d:Z

    #v0=(Boolean);
    return v0
.end method

.method public isOverlookingGesturesEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapController;->h:Z

    #v0=(Boolean);
    return v0
.end method

.method public isRotateWithTouchEventCenterEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->f()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isRotationGesturesEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapController;->g:Z

    #v0=(Boolean);
    return v0
.end method

.method public isScrollGesturesEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapController;->e:Z

    #v0=(Boolean);
    return v0
.end method

.method public isZoomGesturesEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapController;->f:Z

    #v0=(Boolean);
    return v0
.end method

.method public isZoomWithTouchEventCenterEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->e()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3}, Lcom/baidu/platform/comapi/map/o;->onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public scrollBy(II)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/o;->f(II)V

    return-void
.end method

.method public setCenter(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 3

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    iput v2, v0, Lcom/baidu/platform/comapi/map/t;->d:I

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/platform/comapi/map/t;->e:I

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;)V

    goto :goto_0
.end method

.method public setCenterToPixel(II)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_0
    #v1=(Uninit);
    invoke-direct {p0, p1, p2, v0}, Lcom/baidu/mapapi/map/MapController;->a(IILcom/baidu/platform/comapi/map/t;)Lcom/baidu/platform/comapi/map/t;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;)V

    goto :goto_0
.end method

.method public setCompassMargin(II)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapapi/map/MapView;->b(II)V

    return-void
.end method

.method public setMapStatus(Lcom/baidu/mapapi/map/MKMapStatus;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapController;->a(Lcom/baidu/mapapi/map/MKMapStatus;)Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;)V

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public setMapStatusWithAnimation(Lcom/baidu/mapapi/map/MKMapStatus;)V
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapController;->isMapLoadFinish()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/MapController;->setMapStatus(Lcom/baidu/mapapi/map/MKMapStatus;)V

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapController;->a(Lcom/baidu/mapapi/map/MKMapStatus;)Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    const/16 v2, 0x12c

    #v2=(PosShort);
    invoke-virtual {v1, v0, v2}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;I)V

    goto :goto_0
.end method

.method public setMapStatusWithAnimation(Lcom/baidu/mapapi/map/MKMapStatus;I)V
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapController;->isMapLoadFinish()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/MapController;->setMapStatus(Lcom/baidu/mapapi/map/MKMapStatus;)V

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapController;->a(Lcom/baidu/mapapi/map/MKMapStatus;)Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1, v0, p2}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;I)V

    goto :goto_0
.end method

.method public setOverlooking(I)V
    .locals 2

    if-gtz p1, :cond_0

    const/16 v0, -0x2d

    #v0=(Byte);
    if-ge p1, v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Byte);v1=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/map/MKMapStatus;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/map/MKMapStatus;-><init>()V

    #v0=(Reference);
    iput p1, v0, Lcom/baidu/mapapi/map/MKMapStatus;->overlooking:I

    const/16 v1, 0x12c

    #v1=(PosShort);
    invoke-virtual {p0, v0, v1}, Lcom/baidu/mapapi/map/MapController;->setMapStatusWithAnimation(Lcom/baidu/mapapi/map/MKMapStatus;I)V

    goto :goto_0
.end method

.method public setOverlookingGesturesEnabled(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/MapController;->h:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->d(Z)V

    return-void
.end method

.method public setRotateWithTouchEventCenterEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->f(Z)V

    return-void
.end method

.method public setRotation(I)V
    .locals 2

    new-instance v0, Lcom/baidu/mapapi/map/MKMapStatus;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/map/MKMapStatus;-><init>()V

    #v0=(Reference);
    iput p1, v0, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    const/16 v1, 0x12c

    #v1=(PosShort);
    invoke-virtual {p0, v0, v1}, Lcom/baidu/mapapi/map/MapController;->setMapStatusWithAnimation(Lcom/baidu/mapapi/map/MKMapStatus;I)V

    return-void
.end method

.method public setRotationGesturesEnabled(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/MapController;->g:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->c(Z)V

    return-void
.end method

.method public setScrollGesturesEnabled(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/MapController;->e:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->a(Z)V

    return-void
.end method

.method public setZoom(F)F
    .locals 6

    const/4 v5, 0x0

    #v5=(Null);
    const/high16 v1, 0x4198

    #v1=(Integer);
    const/high16 v0, 0x4040

    #v0=(Integer);
    const/4 v4, 0x1

    #v4=(One);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v2

    if-nez v2, :cond_0

    const/high16 p1, -0x4080

    :goto_0
    #v0=(Conflicted);v3=(Conflicted);p1=(Integer);
    return p1

    :cond_0
    #v0=(Integer);v3=(Uninit);p1=(Float);
    cmpg-float v3, p1, v0

    #v3=(Byte);
    if-gez v3, :cond_2

    move p1, v0

    :cond_1
    :goto_1
    #p1=(Integer);
    iput p1, v2, Lcom/baidu/platform/comapi/map/t;->a:F

    iget-object v3, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v3=(Reference);
    invoke-virtual {v3, v2}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;)V

    cmpl-float v0, p1, v0

    #v0=(Byte);
    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0, v4, v5}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0

    :cond_2
    #v0=(Integer);v3=(Byte);p1=(Float);
    cmpl-float v3, p1, v1

    if-lez v3, :cond_1

    move p1, v1

    #p1=(Integer);
    goto :goto_1

    :cond_3
    #v0=(Byte);v3=(Reference);
    cmpl-float v0, p1, v1

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0, v5, v4}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0

    :cond_4
    #v0=(Byte);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0, v4, v4}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0
.end method

.method public setZoomGesturesEnabled(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/MapController;->f:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->b(Z)V

    return-void
.end method

.method public setZoomWithTouchEventCenterEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->e(Z)V

    return-void
.end method

.method public zoomIn()Z
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->i()Z

    move-result v0

    #v0=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->n()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    const/4 v2, 0x3

    #v2=(PosByte);
    if-gt v1, v2, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v3, v4}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    :goto_0
    return v0

    :cond_0
    #v1=(Integer);
    const/16 v2, 0x13

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v4, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0

    :cond_1
    #v1=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v3, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0
.end method

.method public zoomInFixing(II)Z
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/o;->c(II)Z

    move-result v0

    #v0=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->n()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    const/4 v2, 0x3

    #v2=(PosByte);
    if-gt v1, v2, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v3, v4}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    :goto_0
    return v0

    :cond_0
    #v1=(Integer);
    const/16 v2, 0x13

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v4, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0

    :cond_1
    #v1=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v3, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0
.end method

.method public zoomOut()Z
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->j()Z

    move-result v0

    #v0=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->n()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    const/4 v2, 0x3

    #v2=(PosByte);
    if-gt v1, v2, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v3, v4}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    :goto_0
    return v0

    :cond_0
    #v1=(Integer);
    const/16 v2, 0x13

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v4, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0

    :cond_1
    #v1=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v3, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0
.end method

.method public zoomOutFixing(II)Z
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/o;->d(II)Z

    move-result v0

    #v0=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->n()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    const/4 v2, 0x3

    #v2=(PosByte);
    if-gt v1, v2, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v3, v4}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    :goto_0
    return v0

    :cond_0
    #v1=(Integer);
    const/16 v2, 0x13

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v4, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0

    :cond_1
    #v1=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1, v3, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0
.end method

.method public zoomToSpan(II)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapController;->d:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapapi/map/MapView;->a(II)V

    return-void
.end method

*/}
