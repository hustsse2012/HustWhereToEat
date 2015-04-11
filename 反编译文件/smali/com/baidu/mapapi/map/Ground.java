package com.baidu.mapapi.map; class Ground {/*

.class public Lcom/baidu/mapapi/map/Ground;
.super Ljava/lang/Object;


# static fields
.field private static final l:Ljava/lang/String;


# instance fields
.field a:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field b:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field c:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field d:I

.field e:I

.field f:F

.field g:F

.field h:F

.field i:I

.field j:Ljava/lang/String;

.field k:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/baidu/mapapi/map/Ground;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapapi/map/Ground;->l:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/baidu/platform/comapi/basestruct/GeoPoint;II)V
    .locals 1

    const/high16 v0, 0x3f00

    #v0=(Integer);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput v0, p0, Lcom/baidu/mapapi/map/Ground;->f:F

    iput v0, p0, Lcom/baidu/mapapi/map/Ground;->g:F

    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/baidu/mapapi/map/Ground;->h:F

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/Ground;->setBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, p2, p3, p4}, Lcom/baidu/mapapi/map/Ground;->setPosition(Lcom/baidu/platform/comapi/basestruct/GeoPoint;II)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 1

    const/high16 v0, 0x3f00

    #v0=(Integer);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput v0, p0, Lcom/baidu/mapapi/map/Ground;->f:F

    iput v0, p0, Lcom/baidu/mapapi/map/Ground;->g:F

    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/baidu/mapapi/map/Ground;->h:F

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/Ground;->setBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, p2, p3}, Lcom/baidu/mapapi/map/Ground;->setPosition(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    return-void
.end method

.method private a(Landroid/os/Bundle;IIII)V
    .locals 3

    const-string v0, "left_bottom_longitude"

    #v0=(Reference);
    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "left_bottom_latitude"

    invoke-virtual {p1, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "right_top_longitude"

    invoke-virtual {p1, v0, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "right_top_latitude"

    invoke-virtual {p1, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    sget-object v0, Lcom/baidu/mapapi/map/Ground;->l:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "left_bottom_longitude: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/baidu/mapapi/map/Ground;->l:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "left_bottom_latitude: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/baidu/mapapi/map/Ground;->l:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "right_top_longitude: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/baidu/mapapi/map/Ground;->l:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "right_top_latitude: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method a()Landroid/os/Bundle;
    .locals 8

    const/high16 v7, 0x3f80

    #v7=(Integer);
    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    const-string v0, "ground_id"

    #v0=(Reference);
    iget-object v2, p0, Lcom/baidu/mapapi/map/Ground;->j:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/Ground;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    #v0=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/Ground;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    #v2=(Integer);
    mul-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    #v0=(Reference);
    sget-object v2, Lcom/baidu/mapapi/map/Ground;->l:Ljava/lang/String;

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "drawable data length: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/baidu/mapapi/map/Ground;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v0}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    const-string v2, "drawable"

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string v0, "drawable_width"

    iget-object v2, p0, Lcom/baidu/mapapi/map/Ground;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "drawable_height"

    iget-object v2, p0, Lcom/baidu/mapapi/map/Ground;->k:Landroid/graphics/Bitmap;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "drawable_hashcode"

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/Ground;->b()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v0, p0, Lcom/baidu/mapapi/map/Ground;->i:I

    #v0=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/Ground;->a:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    iget-object v2, p0, Lcom/baidu/mapapi/map/Ground;->b:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v5}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v4

    invoke-virtual {v5}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v5

    :goto_0
    #v0=(Conflicted);v5=(Integer);v6=(Conflicted);
    move-object v0, p0

    #v0=(Reference);
    invoke-direct/range {v0 .. v5}, Lcom/baidu/mapapi/map/Ground;->a(Landroid/os/Bundle;IIII)V

    const-string v0, "transparency"

    iget v2, p0, Lcom/baidu/mapapi/map/Ground;->h:F

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v1

    :cond_0
    #v0=(Integer);v2=(One);v3=(Reference);v5=(Uninit);v6=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/Ground;->c:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v4

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    int-to-float v2, v4

    #v2=(Float);
    iget v3, p0, Lcom/baidu/mapapi/map/Ground;->f:F

    #v3=(Integer);
    iget v5, p0, Lcom/baidu/mapapi/map/Ground;->d:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    mul-float/2addr v3, v5

    #v3=(Float);
    sub-float/2addr v2, v3

    float-to-int v2, v2

    #v2=(Integer);
    int-to-float v3, v0

    iget v5, p0, Lcom/baidu/mapapi/map/Ground;->g:F

    #v5=(Integer);
    sub-float v5, v7, v5

    #v5=(Float);
    iget v6, p0, Lcom/baidu/mapapi/map/Ground;->e:I

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    mul-float/2addr v5, v6

    sub-float/2addr v3, v5

    float-to-int v3, v3

    #v3=(Integer);
    int-to-float v4, v4

    #v4=(Float);
    iget v5, p0, Lcom/baidu/mapapi/map/Ground;->f:F

    #v5=(Integer);
    sub-float v5, v7, v5

    #v5=(Float);
    iget v6, p0, Lcom/baidu/mapapi/map/Ground;->d:I

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    float-to-int v4, v4

    #v4=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    iget v5, p0, Lcom/baidu/mapapi/map/Ground;->g:F

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/mapapi/map/Ground;->e:I

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    mul-float/2addr v5, v6

    #v5=(Float);
    add-float/2addr v0, v5

    float-to-int v5, v0

    #v5=(Integer);
    goto :goto_0
.end method

.method a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/Ground;->j:Ljava/lang/String;

    return-void
.end method

.method b()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Ground;->k:Landroid/graphics/Bitmap;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Ground;->j:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getAnchorX()F
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/Ground;->f:F

    #v0=(Integer);
    return v0
.end method

.method public getAnchorY()F
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/Ground;->g:F

    #v0=(Integer);
    return v0
.end method

.method public getTransparency()F
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/Ground;->h:F

    #v0=(Integer);
    return v0
.end method

.method public setAnchor(FF)V
    .locals 3

    const/high16 v2, 0x3f80

    #v2=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    cmpl-float v0, p1, v2

    #v0=(Byte);
    if-gtz v0, :cond_0

    cmpg-float v0, p1, v1

    if-ltz v0, :cond_0

    cmpl-float v0, p2, v2

    if-gtz v0, :cond_0

    cmpg-float v0, p2, v1

    if-gez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "anchor must in [0.0, 1.0] scope."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(Byte);v1=(Null);
    iget v0, p0, Lcom/baidu/mapapi/map/Ground;->i:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-eq v0, v1, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "if you specify the leftBottom and rightTop bound, you can\'t set anchor info"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_2
    #v0=(Integer);v1=(PosByte);
    iput p1, p0, Lcom/baidu/mapapi/map/Ground;->f:F

    iput p2, p0, Lcom/baidu/mapapi/map/Ground;->g:F

    return-void
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "bitmap can not be null"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    iput-object p1, p0, Lcom/baidu/mapapi/map/Ground;->k:Landroid/graphics/Bitmap;

    return-void
.end method

.method public setPosition(Lcom/baidu/platform/comapi/basestruct/GeoPoint;II)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "location can\'t be null"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    if-lez p2, :cond_1

    if-gtz p3, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "width and height can not less than or equal to 0"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_2
    #v0=(Uninit);v1=(Uninit);
    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/Ground;->i:I

    iput-object p1, p0, Lcom/baidu/mapapi/map/Ground;->c:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iput p2, p0, Lcom/baidu/mapapi/map/Ground;->d:I

    iput p3, p0, Lcom/baidu/mapapi/map/Ground;->e:I

    return-void
.end method

.method public setPosition(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 2

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "lb and rt can\'t be null"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(Uninit);v1=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    if-ge v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    if-lt v0, v1, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "lb is must at left and bottom of rt."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_3
    #v0=(Integer);v1=(Integer);
    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Lcom/baidu/mapapi/map/Ground;->i:I

    iput-object p1, p0, Lcom/baidu/mapapi/map/Ground;->a:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iput-object p2, p0, Lcom/baidu/mapapi/map/Ground;->b:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    return-void
.end method

.method public setTransparency(F)V
    .locals 2

    const/high16 v0, 0x3f80

    #v0=(Integer);
    cmpl-float v0, p1, v0

    #v0=(Byte);
    if-gtz v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    cmpg-float v0, p1, v0

    #v0=(Byte);
    if-gez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "transparency must be in [0.0f, 1.0f] scope"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(Byte);v1=(Uninit);
    iput p1, p0, Lcom/baidu/mapapi/map/Ground;->h:F

    return-void
.end method

*/}
