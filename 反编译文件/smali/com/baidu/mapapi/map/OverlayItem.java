package com.baidu.mapapi.map; class OverlayItem {/*

.class public Lcom/baidu/mapapi/map/OverlayItem;
.super Ljava/lang/Object;


# static fields
.field public static final ALIGN_BOTTON:I = 0x2

.field public static final ALIGN_TOP:I = 0x3

.field public static final ALING_CENTER:I = 0x1


# instance fields
.field private a:I

.field private b:Landroid/graphics/drawable/Drawable;

.field private c:Ljava/lang/String;

.field private d:F

.field private e:F

.field protected mPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field protected mSnippet:Ljava/lang/String;

.field protected mTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object p1, p0, Lcom/baidu/mapapi/map/OverlayItem;->mPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iput-object p2, p0, Lcom/baidu/mapapi/map/OverlayItem;->mTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/baidu/mapapi/map/OverlayItem;->mSnippet:Ljava/lang/String;

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->b:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->a:I

    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->c:Ljava/lang/String;

    const/high16 v0, 0x3f00

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->d:F

    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->e:F

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->a:I

    #v0=(Integer);
    return v0
.end method

.method a(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/map/OverlayItem;->a:I

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/OverlayItem;->c:Ljava/lang/String;

    return-void
.end method

.method b()I
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/OverlayItem;->getMarker()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/OverlayItem;->getMarker()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->c:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getAnchorX()F
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->d:F

    #v0=(Integer);
    return v0
.end method

.method public getAnchorY()F
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->e:F

    #v0=(Integer);
    return v0
.end method

.method public final getMarker()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->b:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    return-object v0
.end method

.method public getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->mPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    return-object v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->mSnippet:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/OverlayItem;->mTitle:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public setAnchor(FF)V
    .locals 6

    const-wide/high16 v4, 0x3ff0

    #v4=(LongLo);v5=(LongHi);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    float-to-double v0, p1

    #v0=(DoubleLo);v1=(DoubleHi);
    cmpl-double v0, v0, v4

    #v0=(Byte);
    if-gtz v0, :cond_0

    float-to-double v0, p1

    #v0=(DoubleLo);
    cmpg-double v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_0

    float-to-double v0, p2

    #v0=(DoubleLo);
    cmpl-double v0, v0, v4

    #v0=(Byte);
    if-gtz v0, :cond_0

    float-to-double v0, p2

    #v0=(DoubleLo);
    cmpg-double v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput p1, p0, Lcom/baidu/mapapi/map/OverlayItem;->d:F

    iput p2, p0, Lcom/baidu/mapapi/map/OverlayItem;->e:F

    goto :goto_0
.end method

.method public setAnchor(I)V
    .locals 2

    const/high16 v1, 0x3f00

    #v1=(Integer);
    packed-switch p1, :pswitch_data_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :pswitch_0
    #v0=(Uninit);
    invoke-virtual {p0, v1, v1}, Lcom/baidu/mapapi/map/OverlayItem;->setAnchor(FF)V

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v1, v0}, Lcom/baidu/mapapi/map/OverlayItem;->setAnchor(FF)V

    goto :goto_0

    :pswitch_2
    #v0=(Uninit);
    const/high16 v0, 0x3f80

    #v0=(Integer);
    invoke-virtual {p0, v1, v0}, Lcom/baidu/mapapi/map/OverlayItem;->setAnchor(FF)V

    goto :goto_0

    #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setGeoPoint(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 0

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-object p1, p0, Lcom/baidu/mapapi/map/OverlayItem;->mPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    goto :goto_0
.end method

.method public setMarker(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/OverlayItem;->b:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setSnippet(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/OverlayItem;->mSnippet:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/OverlayItem;->mTitle:Ljava/lang/String;

    return-void
.end method

*/}
