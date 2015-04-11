package vi.com.gdi.bgl.android.java; class EnvDrawText {/*

.class public Lvi/com/gdi/bgl/android/java/EnvDrawText;
.super Ljava/lang/Object;


# static fields
.field public static bBmpChange:Z

.field public static bmp:Landroid/graphics/Bitmap;

.field public static buffer:[I

.field public static canvasTemp:Landroid/graphics/Canvas;

.field public static fontCache:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lvi/com/gdi/bgl/android/java/a;",
            ">;"
        }
    .end annotation
.end field

.field public static iWordHightMax:I

.field public static iWordWidthMax:I

.field public static pt:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sput v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    sput v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    sput-boolean v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bBmpChange:Z

    sput-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bmp:Landroid/graphics/Bitmap;

    sput-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    sput-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->buffer:[I

    sput-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static drawText(Ljava/lang/String;II[IIIII)[I
    .locals 11

    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v1=(Reference);
    if-nez v1, :cond_6

    new-instance v1, Landroid/graphics/Paint;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    #v1=(Reference);
    sput-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    :goto_0
    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    if-eqz p2, :cond_0

    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    if-eqz v1, :cond_0

    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/com/gdi/bgl/android/java/a;

    if-eqz v1, :cond_0

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v2=(Reference);
    iget-object v1, v1, Lvi/com/gdi/bgl/android/java/a;->a:Landroid/graphics/Typeface;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_0
    #v2=(Conflicted);
    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    int-to-float v2, p1

    #v2=(Float);
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    const/16 v1, 0x5c

    #v1=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    #v1=(Integer);
    const/4 v2, -0x1

    #v2=(Byte);
    if-ne v1, v2, :cond_9

    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v1

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v2=(Reference);
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    iget v3, v1, Landroid/graphics/Paint$FontMetrics;->descent:F

    #v3=(Integer);
    iget v4, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    #v4=(Integer);
    sub-float/2addr v3, v4

    #v3=(Float);
    float-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    #v3=(Integer);
    const/4 v4, 0x0

    #v4=(Null);
    aput v2, p3, v4

    const/4 v4, 0x1

    #v4=(One);
    aput v3, p3, v4

    int-to-double v4, v2

    #v4=(DoubleLo);v5=(DoubleHi);
    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000

    #v6=(LongLo);v7=(LongHi);
    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    #v6=(DoubleLo);v7=(DoubleHi);
    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v2, v4

    const-wide/high16 v4, 0x4000

    #v4=(LongLo);v5=(LongHi);
    int-to-double v6, v2

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    #v4=(DoubleLo);v5=(DoubleHi);
    double-to-int v2, v4

    int-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    move-result-wide v3

    const-wide/high16 v5, 0x4000

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    #v3=(Integer);
    const-wide/high16 v4, 0x4000

    #v4=(LongLo);v5=(LongHi);
    int-to-double v6, v3

    #v6=(DoubleLo);
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    sget v4, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    #v4=(Integer);
    if-lt v4, v2, :cond_1

    sget v4, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    if-ge v4, v3, :cond_2

    :cond_1
    const/4 v4, 0x1

    #v4=(One);
    sput-boolean v4, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bBmpChange:Z

    sput v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    sput v3, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    :cond_2
    #v4=(Integer);
    const/4 v2, 0x2

    #v2=(PosByte);
    sget v3, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    aput v3, p3, v2

    const/4 v2, 0x3

    sget v3, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    aput v3, p3, v2

    sget-boolean v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bBmpChange:Z

    #v2=(Boolean);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v2, v3, :cond_7

    sget v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    #v2=(Integer);
    sget v3, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    #v3=(Integer);
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    #v4=(Reference);
    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    #v2=(Reference);
    sput-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bmp:Landroid/graphics/Bitmap;

    new-instance v2, Landroid/graphics/Canvas;

    #v2=(UninitRef);
    sget-object v3, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bmp:Landroid/graphics/Bitmap;

    #v3=(Reference);
    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    #v2=(Reference);
    sput-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    :goto_1
    #v4=(Conflicted);
    const/high16 v2, -0x100

    #v2=(Integer);
    and-int v2, v2, p6

    if-nez v2, :cond_8

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    #v2=(Reference);
    const v3, 0x1ffffff

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->drawColor(I)V

    :goto_2
    #v0=(Conflicted);v3=(Conflicted);
    if-eqz p7, :cond_3

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    move/from16 v0, p7

    #v0=(Integer);
    int-to-float v3, v0

    #v3=(Float);
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    move/from16 v0, p5

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    #v4=(Null);
    iget v5, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    #v5=(Integer);
    sub-float/2addr v4, v5

    #v4=(Float);
    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v5=(Reference);
    invoke-virtual {v2, p0, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_3
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    invoke-virtual {v2, p4}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    #v4=(Null);
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    #v1=(Integer);
    sub-float v1, v4, v1

    #v1=(Float);
    sget-object v4, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v4=(Reference);
    invoke-virtual {v2, p0, v3, v1, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_4
    :goto_3
    #v1=(Integer);v2=(Conflicted);v3=(Reference);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    sget v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    sget v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    #v2=(Integer);
    mul-int/2addr v1, v2

    sget-boolean v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bBmpChange:Z

    #v2=(Boolean);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v2, v3, :cond_5

    new-array v1, v1, [I

    #v1=(Reference);
    sput-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->buffer:[I

    :cond_5
    #v1=(Conflicted);
    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bmp:Landroid/graphics/Bitmap;

    #v1=(Reference);
    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->buffer:[I

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    sget v4, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    #v4=(Integer);
    const/4 v5, 0x0

    #v5=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    sget v7, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    #v7=(Integer);
    sget v8, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    #v8=(Integer);
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v1, 0x0

    #v1=(Null);
    sput-boolean v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bBmpChange:Z

    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->buffer:[I

    #v1=(Reference);
    return-object v1

    :cond_6
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->reset()V

    goto/16 :goto_0

    :cond_7
    #v2=(Boolean);v3=(One);v4=(Integer);v5=(LongHi);v6=(DoubleLo);v7=(DoubleHi);
    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bmp:Landroid/graphics/Bitmap;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->eraseColor(I)V

    goto/16 :goto_1

    :cond_8
    #v2=(Integer);v3=(Reference);v4=(Conflicted);
    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    #v2=(Reference);
    move/from16 v0, p6

    #v0=(Integer);
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_2

    :cond_9
    #v0=(Uninit);v1=(Integer);v2=(Byte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    add-int/lit8 v3, v1, 0x1

    #v3=(Integer);
    const/4 v2, 0x2

    #v2=(PosByte);
    sget-object v4, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {p0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    :goto_4
    #v1=(Integer);v2=(Integer);v4=(Conflicted);v5=(Reference);
    const/16 v4, 0x5c

    #v4=(PosByte);
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_b

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    if-le v3, v1, :cond_a

    move v1, v3

    :cond_a
    add-int/lit8 v3, v4, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_b
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-eq v3, v4, :cond_c

    sget-object v4, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v4=(Reference);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    if-le v3, v1, :cond_c

    move v1, v3

    :cond_c
    #v4=(Conflicted);v5=(Conflicted);
    sget-object v3, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    iget v4, v3, Landroid/graphics/Paint$FontMetrics;->descent:F

    #v4=(Integer);
    iget v5, v3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    #v5=(Integer);
    sub-float/2addr v4, v5

    #v4=(Float);
    float-to-double v4, v4

    #v4=(DoubleLo);v5=(DoubleHi);
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    #v4=(Integer);
    mul-int/2addr v2, v4

    const/4 v5, 0x0

    #v5=(Null);
    aput v1, p3, v5

    const/4 v5, 0x1

    #v5=(One);
    aput v2, p3, v5

    int-to-double v5, v1

    #v5=(DoubleLo);v6=(DoubleHi);
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v5

    const-wide/high16 v7, 0x4000

    #v7=(LongLo);v8=(LongHi);
    invoke-static {v7, v8}, Ljava/lang/Math;->log(D)D

    move-result-wide v7

    #v7=(DoubleLo);v8=(DoubleHi);
    div-double/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v1, v5

    const-wide/high16 v5, 0x4000

    #v5=(LongLo);v6=(LongHi);
    int-to-double v7, v1

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    double-to-int v1, v5

    int-to-double v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v5

    const-wide/high16 v7, 0x4000

    #v7=(LongLo);v8=(LongHi);
    invoke-static {v7, v8}, Ljava/lang/Math;->log(D)D

    move-result-wide v7

    #v7=(DoubleLo);v8=(DoubleHi);
    div-double/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v2, v5

    const-wide/high16 v5, 0x4000

    #v5=(LongLo);v6=(LongHi);
    int-to-double v7, v2

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    double-to-int v2, v5

    sget v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    #v5=(Integer);
    if-lt v5, v1, :cond_d

    sget v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    if-ge v5, v2, :cond_e

    :cond_d
    const/4 v5, 0x1

    #v5=(One);
    sput-boolean v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bBmpChange:Z

    sput v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    sput v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    :cond_e
    #v5=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    sget v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    aput v2, p3, v1

    const/4 v1, 0x3

    sget v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    aput v2, p3, v1

    sget-boolean v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bBmpChange:Z

    #v1=(Boolean);
    const/4 v2, 0x1

    #v2=(One);
    if-ne v1, v2, :cond_10

    sget v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordWidthMax:I

    #v1=(Integer);
    sget v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->iWordHightMax:I

    #v2=(Integer);
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    #v5=(Reference);
    invoke-static {v1, v2, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    #v1=(Reference);
    sput-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bmp:Landroid/graphics/Bitmap;

    new-instance v1, Landroid/graphics/Canvas;

    #v1=(UninitRef);
    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bmp:Landroid/graphics/Bitmap;

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    #v1=(Reference);
    sput-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    :goto_5
    #v5=(Conflicted);
    const/high16 v1, -0x100

    #v1=(Integer);
    and-int v1, v1, p6

    if-nez v1, :cond_11

    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    #v1=(Reference);
    const v2, 0x1ffffff

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    :goto_6
    #v0=(Conflicted);v2=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    :goto_7
    #v1=(Integer);v2=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    const/16 v5, 0x5c

    #v5=(PosByte);
    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    #v5=(Integer);
    if-lez v5, :cond_12

    invoke-virtual {p0, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    sget-object v2, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v2=(Reference);
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    #v2=(Float);
    float-to-int v7, v2

    #v7=(Integer);
    add-int/lit8 v2, v5, 0x1

    #v2=(Integer);
    if-eqz p7, :cond_f

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v5=(Reference);
    move/from16 v0, p7

    #v0=(Integer);
    int-to-float v8, v0

    #v8=(Float);
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v8, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    #v8=(Reference);
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v8, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v8, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    move/from16 v0, p5

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    const/4 v8, 0x0

    #v8=(Null);
    aget v8, p3, v8

    #v8=(Integer);
    sub-int/2addr v8, v7

    div-int/lit8 v8, v8, 0x2

    int-to-float v8, v8

    #v8=(Float);
    mul-int v9, v1, v4

    #v9=(Integer);
    int-to-float v9, v9

    #v9=(Float);
    iget v10, v3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    #v10=(Integer);
    sub-float/2addr v9, v10

    sget-object v10, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v10=(Reference);
    invoke-virtual {v5, v6, v8, v9, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_f
    #v0=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v5=(Reference);
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    #v8=(Reference);
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    invoke-virtual {v5, p4}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    const/4 v8, 0x0

    #v8=(Null);
    aget v8, p3, v8

    #v8=(Integer);
    sub-int v7, v8, v7

    div-int/lit8 v7, v7, 0x2

    int-to-float v7, v7

    #v7=(Float);
    mul-int v8, v1, v4

    int-to-float v8, v8

    #v8=(Float);
    iget v9, v3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    #v9=(Integer);
    sub-float/2addr v8, v9

    sget-object v9, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v9=(Reference);
    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_10
    #v0=(Uninit);v1=(Boolean);v2=(One);v5=(Integer);v6=(DoubleHi);v7=(DoubleLo);v8=(DoubleHi);v9=(Uninit);v10=(Uninit);
    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->bmp:Landroid/graphics/Bitmap;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    goto/16 :goto_5

    :cond_11
    #v1=(Integer);v2=(Reference);v5=(Conflicted);
    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    #v1=(Reference);
    move/from16 v0, p6

    #v0=(Integer);
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_6

    :cond_12
    #v0=(Conflicted);v1=(Integer);v2=(Integer);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v2, v5, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {p0, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    sget-object v5, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v5=(Reference);
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    #v5=(Float);
    float-to-int v5, v5

    #v5=(Integer);
    if-eqz p7, :cond_13

    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v6=(Reference);
    move/from16 v0, p7

    #v0=(Integer);
    int-to-float v7, v0

    #v7=(Float);
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    #v7=(Reference);
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    move/from16 v0, p5

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    const/4 v7, 0x0

    #v7=(Null);
    aget v7, p3, v7

    #v7=(Integer);
    sub-int/2addr v7, v5

    div-int/lit8 v7, v7, 0x2

    int-to-float v7, v7

    #v7=(Float);
    mul-int v8, v1, v4

    #v8=(Integer);
    int-to-float v8, v8

    #v8=(Float);
    iget v9, v3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    #v9=(Integer);
    sub-float/2addr v8, v9

    sget-object v9, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v9=(Reference);
    invoke-virtual {v6, v2, v7, v8, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_13
    #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v6=(Reference);
    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    #v7=(Reference);
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    invoke-virtual {v6, p4}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v6, Lvi/com/gdi/bgl/android/java/EnvDrawText;->canvasTemp:Landroid/graphics/Canvas;

    const/4 v7, 0x0

    #v7=(Null);
    aget v7, p3, v7

    #v7=(Integer);
    sub-int v5, v7, v5

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    #v5=(Float);
    mul-int/2addr v1, v4

    int-to-float v1, v1

    #v1=(Float);
    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    #v3=(Integer);
    sub-float/2addr v1, v3

    sget-object v3, Lvi/com/gdi/bgl/android/java/EnvDrawText;->pt:Landroid/graphics/Paint;

    #v3=(Reference);
    invoke-virtual {v6, v2, v5, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto/16 :goto_3
.end method

.method public static getTextSize(Ljava/lang/String;I)[S
    .locals 6

    const/4 v0, 0x1

    #v0=(One);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    if-nez v3, :cond_1

    const/4 v0, 0x0

    :cond_0
    #v0=(Reference);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_1
    #v0=(One);v1=(Uninit);v4=(Uninit);v5=(Uninit);
    new-instance v4, Landroid/graphics/Paint;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    #v4=(Reference);
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    int-to-float v0, p1

    #v0=(Float);
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    new-array v0, v3, [S

    #v0=(Reference);
    move v1, v2

    :goto_0
    #v1=(Integer);v5=(Conflicted);
    if-ge v1, v3, :cond_0

    add-int/lit8 v5, v1, 0x1

    #v5=(Integer);
    invoke-virtual {p0, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    #v5=(Float);
    float-to-int v5, v5

    #v5=(Integer);
    int-to-short v5, v5

    #v5=(Short);
    aput-short v5, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static registFontCache(ILandroid/graphics/Typeface;)V
    .locals 2

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);
    sget-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    #v0=(Reference);
    if-nez v0, :cond_2

    new-instance v0, Landroid/util/SparseArray;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    #v0=(Reference);
    sput-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    :cond_2
    sget-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/com/gdi/bgl/android/java/a;

    if-nez v0, :cond_3

    new-instance v0, Lvi/com/gdi/bgl/android/java/a;

    #v0=(UninitRef);
    invoke-direct {v0}, Lvi/com/gdi/bgl/android/java/a;-><init>()V

    #v0=(Reference);
    iput-object p1, v0, Lvi/com/gdi/bgl/android/java/a;->a:Landroid/graphics/Typeface;

    iget v1, v0, Lvi/com/gdi/bgl/android/java/a;->b:I

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lvi/com/gdi/bgl/android/java/a;->b:I

    sget-object v1, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    #v1=(Reference);
    invoke-virtual {v1, p0, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_3
    #v1=(Uninit);
    iget v1, v0, Lvi/com/gdi/bgl/android/java/a;->b:I

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lvi/com/gdi/bgl/android/java/a;->b:I

    goto :goto_0
.end method

.method public static removeFontCache(I)V
    .locals 2

    sget-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/com/gdi/bgl/android/java/a;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);
    iget v1, v0, Lvi/com/gdi/bgl/android/java/a;->b:I

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lvi/com/gdi/bgl/android/java/a;->b:I

    iget v0, v0, Lvi/com/gdi/bgl/android/java/a;->b:I

    #v0=(Integer);
    if-nez v0, :cond_0

    sget-object v0, Lvi/com/gdi/bgl/android/java/EnvDrawText;->fontCache:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_0
.end method

*/}
