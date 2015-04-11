package com.baidu.mapapi.map; class MapView {/*

.class public Lcom/baidu/mapapi/map/MapView;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/map/MapView$b;,
        Lcom/baidu/mapapi/map/MapView$c;,
        Lcom/baidu/mapapi/map/MapView$a;,
        Lcom/baidu/mapapi/map/MapView$LayoutParams;
    }
.end annotation


# static fields
.field private static final C:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<[I>;"
        }
    .end annotation
.end field

.field private static final e:Ljava/lang/String;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/ImageView;

.field private D:I

.field private E:I

.field private F:I

.field private G:Z

.field a:Lcom/baidu/platform/comapi/map/q;

.field b:Lcom/baidu/mapapi/map/MapView$c;

.field c:Lcom/baidu/platform/comapi/map/a;

.field d:Z

.field private f:Lcom/baidu/mapapi/map/MapController;

.field private g:Lcom/baidu/platform/comapi/map/u;

.field private h:I

.field private i:I

.field private j:Landroid/widget/ZoomControls;

.field private k:F

.field private l:Lcom/baidu/platform/comapi/map/Projection;

.field private m:I

.field private n:I

.field private o:Lcom/baidu/platform/comapi/map/q$a;

.field private p:Landroid/content/Context;

.field private q:Lcom/baidu/mapapi/map/MKMapViewListener;

.field private r:Lcom/baidu/mapapi/map/MKMapTouchListener;

.field private s:Z

.field private t:Lcom/baidu/mapapi/map/MKMapStatusChangeListener;

.field private u:Lcom/baidu/platform/comapi/map/t;

.field private v:Z

.field private w:Z

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/Overlay;",
            ">;"
        }
    .end annotation
.end field

.field private y:Landroid/widget/RelativeLayout;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v11, 0x1

    #v11=(One);
    const/4 v10, 0x0

    #v10=(Null);
    const-wide/high16 v8, 0x4000

    #v8=(LongLo);v9=(LongHi);
    const/4 v7, 0x2

    #v7=(PosByte);
    const-class v0, Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapapi/map/MapView;->e:Ljava/lang/String;

    new-instance v0, Landroid/util/SparseArray;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/4 v1, 0x3

    #v1=(PosByte);
    new-array v2, v7, [I

    #v2=(Reference);
    const v3, 0x1e8480

    #v3=(Integer);
    aput v3, v2, v10

    const-wide v3, 0x413e848000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x402e

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/4 v1, 0x4

    new-array v2, v7, [I

    const v3, 0xf4240

    aput v3, v2, v10

    const-wide v3, 0x412e848000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x402c

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/4 v1, 0x5

    new-array v2, v7, [I

    const v3, 0x7a120

    aput v3, v2, v10

    const-wide v3, 0x411e848000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x402a

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/4 v1, 0x6

    new-array v2, v7, [I

    const v3, 0x30d40

    aput v3, v2, v10

    const-wide v3, 0x41086a0000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4028

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/4 v1, 0x7

    new-array v2, v7, [I

    const v3, 0x186a0

    aput v3, v2, v10

    const-wide v3, 0x40f86a0000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4026

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0x8

    new-array v2, v7, [I

    const v3, 0xc350

    #v3=(Char);
    aput v3, v2, v10

    const-wide v3, 0x40e86a0000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4024

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0x9

    new-array v2, v7, [I

    const/16 v3, 0x61a8

    #v3=(PosShort);
    aput v3, v2, v10

    const-wide v3, 0x40d86a0000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4022

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0xa

    new-array v2, v7, [I

    const/16 v3, 0x4e20

    #v3=(PosShort);
    aput v3, v2, v10

    const-wide v3, 0x40d3880000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4020

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0xb

    new-array v2, v7, [I

    const/16 v3, 0x2710

    #v3=(PosShort);
    aput v3, v2, v10

    const-wide v3, 0x40c3880000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x401c

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0xc

    new-array v2, v7, [I

    const/16 v3, 0x1388

    #v3=(PosShort);
    aput v3, v2, v10

    const-wide v3, 0x40b3880000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4018

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0xd

    new-array v2, v7, [I

    const/16 v3, 0x7d0

    #v3=(PosShort);
    aput v3, v2, v10

    const-wide v3, 0x409f400000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4014

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0xe

    new-array v2, v7, [I

    const/16 v3, 0x3e8

    #v3=(PosShort);
    aput v3, v2, v10

    const-wide v3, 0x408f400000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4010

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0xf

    new-array v2, v7, [I

    const/16 v3, 0x1f4

    #v3=(PosShort);
    aput v3, v2, v10

    const-wide v3, 0x407f400000000000L

    #v3=(LongLo);v4=(LongHi);
    const-wide/high16 v5, 0x4008

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v3, v5

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-int v3, v3

    #v3=(Integer);
    aput v3, v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0x10

    new-array v2, v7, [I

    fill-array-data v2, :array_0

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0x11

    new-array v2, v7, [I

    fill-array-data v2, :array_1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0x12

    new-array v2, v7, [I

    fill-array-data v2, :array_2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    const/16 v1, 0x13

    new-array v2, v7, [I

    fill-array-data v2, :array_3

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void

    :array_0
    .array-data 0x4
        0xc8t 0x0t 0x0t 0x0t
        0x32t 0x0t 0x0t 0x0t
    .end array-data

    :array_1
    .array-data 0x4
        0x64t 0x0t 0x0t 0x0t
        0x32t 0x0t 0x0t 0x0t
    .end array-data

    :array_2
    .array-data 0x4
        0x32t 0x0t 0x0t 0x0t
        0x32t 0x0t 0x0t 0x0t
    .end array-data

    :array_3
    .array-data 0x4
        0x14t 0x0t 0x0t 0x0t
        0x28t 0x0t 0x0t 0x0t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->g:Lcom/baidu/platform/comapi/map/u;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->c:Lcom/baidu/platform/comapi/map/a;

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    const/high16 v0, -0x4080

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/MapView;->k:F

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->l:Lcom/baidu/platform/comapi/map/Projection;

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->m:I

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->n:I

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->o:Lcom/baidu/platform/comapi/map/q$a;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->d:Z

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->p:Landroid/content/Context;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->q:Lcom/baidu/mapapi/map/MKMapViewListener;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->r:Lcom/baidu/mapapi/map/MKMapTouchListener;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->t:Lcom/baidu/mapapi/map/MKMapStatusChangeListener;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->v:Z

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->w:Z

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapView;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->g:Lcom/baidu/platform/comapi/map/u;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->c:Lcom/baidu/platform/comapi/map/a;

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    const/high16 v0, -0x4080

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/MapView;->k:F

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->l:Lcom/baidu/platform/comapi/map/Projection;

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->m:I

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->n:I

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->o:Lcom/baidu/platform/comapi/map/q$a;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->d:Z

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->p:Landroid/content/Context;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->q:Lcom/baidu/mapapi/map/MKMapViewListener;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->r:Lcom/baidu/mapapi/map/MKMapTouchListener;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->t:Lcom/baidu/mapapi/map/MKMapStatusChangeListener;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->v:Z

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->w:Z

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapView;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->g:Lcom/baidu/platform/comapi/map/u;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->c:Lcom/baidu/platform/comapi/map/a;

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    const/high16 v0, -0x4080

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/MapView;->k:F

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->l:Lcom/baidu/platform/comapi/map/Projection;

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->m:I

    iput v2, p0, Lcom/baidu/mapapi/map/MapView;->n:I

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->o:Lcom/baidu/platform/comapi/map/q$a;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->d:Z

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->p:Landroid/content/Context;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->q:Lcom/baidu/mapapi/map/MKMapViewListener;

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->r:Lcom/baidu/mapapi/map/MKMapTouchListener;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->t:Lcom/baidu/mapapi/map/MKMapStatusChangeListener;

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->v:Z

    iput-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->w:Z

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapView;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/MapView;F)F
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/map/MapView;->k:F

    return p1
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/MapView;I)I
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/map/MapView;->F:I

    return p1
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->q:Lcom/baidu/mapapi/map/MKMapViewListener;

    #v0=(Reference);
    return-object v0
.end method

.method private a(ILcom/baidu/platform/comapi/basestruct/GeoPoint;I)V
    .locals 5

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v3, 0x1b

    #v3=(PosByte);
    if-ne v0, v3, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getProjection()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v4

    #v4=(Integer);
    invoke-interface {v0, v3, v4}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    #v3=(Reference);
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/ItemizedOverlay;

    invoke-virtual {v0, v3, p0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->onTap(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/mapapi/map/MapView;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, -0x1

    #v0=(Byte);
    if-eq p1, v0, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    #v0=(Integer);
    if-ne p3, v0, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/ItemizedOverlay;

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/ItemizedOverlay;->onTap(I)Z

    :cond_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 10

    const/high16 v9, 0x4130

    #v9=(Integer);
    const/16 v8, 0xe

    #v8=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v5, -0x2

    #v5=(Byte);
    iput-object p1, p0, Lcom/baidu/mapapi/map/MapView;->p:Landroid/content/Context;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    if-nez v0, :cond_1

    new-instance v0, Lcom/baidu/platform/comapi/map/q;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/baidu/platform/comapi/map/q;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "overlooking"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v1, "rotation"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v1, "centerptx"

    const-wide v2, 0x4168b73a40000000L

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "centerpty"

    const-wide v2, 0x415268ccc0000000L

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "modulePath"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->r()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "appSdcardPath"

    invoke-static {}, Lcom/baidu/mapapi/utils/b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "appCachePath"

    invoke-static {}, Lcom/baidu/mapapi/utils/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "appSecondCachePath"

    invoke-static {}, Lcom/baidu/mapapi/utils/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mapTmpMax"

    invoke-static {}, Lcom/baidu/mapapi/utils/b;->d()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "domTmpMax"

    invoke-static {}, Lcom/baidu/mapapi/utils/b;->e()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "itsTmpMax"

    invoke-static {}, Lcom/baidu/mapapi/utils/b;->f()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    new-instance v1, Lcom/baidu/mapapi/map/MapView$b;

    #v1=(UninitRef);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {v1, p0, v2}, Lcom/baidu/mapapi/map/MapView$b;-><init>(Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/b;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/map/MapView;->o:Lcom/baidu/platform/comapi/map/q$a;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->o:Lcom/baidu/platform/comapi/map/q$a;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/baidu/platform/comapi/map/q;->a(Lcom/baidu/platform/comapi/map/q$a;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v1, v0, p1}, Lcom/baidu/platform/comapi/map/q;->a(Landroid/os/Bundle;Landroid/content/Context;)V

    new-instance v0, Lcom/baidu/mapapi/map/MapController;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/MapController;-><init>(Lcom/baidu/mapapi/map/MapView;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/q;->b()Lcom/baidu/platform/comapi/map/o;

    move-result-object v1

    iput-object v1, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-direct {p0}, Lcom/baidu/mapapi/map/MapView;->g()V

    const/high16 v0, 0x4210

    #v0=(Integer);
    sget v1, Lcom/baidu/platform/comapi/d/c;->C:F

    #v1=(Integer);
    mul-float/2addr v0, v1

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/MapView;->m:I

    const/high16 v0, 0x4220

    sget v1, Lcom/baidu/platform/comapi/d/c;->C:F

    mul-float/2addr v0, v1

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/MapView;->n:I

    invoke-direct {p0}, Lcom/baidu/mapapi/map/MapView;->f()V

    invoke-direct {p0}, Lcom/baidu/mapapi/map/MapView;->e()V

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->refresh()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/q;->getLeft()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/map/q;->getTop()I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v2, v2, 0x1

    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/map/q;->getRight()I

    move-result v3

    #v3=(Integer);
    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v4=(Reference);
    invoke-virtual {v4}, Lcom/baidu/platform/comapi/map/q;->getBottom()I

    move-result v4

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/platform/comapi/map/q;->layout(IIII)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0, v6}, Lcom/baidu/platform/comapi/map/q;->setVisibility(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0, v7}, Lcom/baidu/platform/comapi/map/q;->setFocusable(Z)V

    new-instance v0, Landroid/widget/ZoomControls;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/ZoomControls;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {v0}, Landroid/widget/ZoomControls;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    new-instance v1, Lcom/baidu/mapapi/map/b;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/baidu/mapapi/map/b;-><init>(Lcom/baidu/mapapi/map/MapView;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/ZoomControls;->setOnZoomOutClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    new-instance v1, Lcom/baidu/mapapi/map/c;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/baidu/mapapi/map/c;-><init>(Lcom/baidu/mapapi/map/MapView;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/ZoomControls;->setOnZoomInClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {v0, v7}, Landroid/widget/ZoomControls;->setFocusable(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {v0, v6}, Landroid/widget/ZoomControls;->setVisibility(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {v0, v6, v6}, Landroid/widget/ZoomControls;->measure(II)V

    :cond_0
    #v1=(Conflicted);
    new-instance v0, Lcom/baidu/mapapi/map/MapView$c;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Lcom/baidu/mapapi/map/MapView$c;-><init>(Lcom/baidu/mapapi/map/MapView;Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    invoke-virtual {v0, v6}, Lcom/baidu/mapapi/map/MapView$c;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/q;->getLeft()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/map/q;->getTop()I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v2, v2, 0x1

    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/map/q;->getRight()I

    move-result v3

    #v3=(Integer);
    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v4=(Reference);
    invoke-virtual {v4}, Lcom/baidu/platform/comapi/map/q;->getBottom()I

    move-result v4

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/mapapi/map/MapView$c;->layout(IIII)V

    const/high16 v0, -0x8000

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/map/MapView;->D:I

    const/high16 v0, -0x8000

    iput v0, p0, Lcom/baidu/mapapi/map/MapView;->E:I

    new-instance v0, Landroid/widget/RelativeLayout;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    #v0=(Reference);
    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    const-string v2, "#FFFFFF"

    #v2=(Reference);
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    const/4 v2, 0x2

    #v2=(PosByte);
    invoke-virtual {v1, v2, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    const v1, 0x7fffffff

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/TextView;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->A:Landroid/widget/TextView;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    #v0=(Reference);
    iput v5, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    iput v5, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->A:Landroid/widget/TextView;

    const-string v2, "#000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->A:Landroid/widget/TextView;

    const/4 v2, 0x2

    #v2=(PosByte);
    invoke-virtual {v1, v2, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->A:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/ImageView;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->B:Landroid/widget/ImageView;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    #v0=(Reference);
    iput v5, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    iput v5, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v1, 0x3

    #v1=(PosByte);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/TextView;->getId()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->B:Landroid/widget/ImageView;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    :try_start_0
    const-string v1, "icon_scale.9.png"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    new-instance v2, Landroid/graphics/drawable/NinePatchDrawable;

    #v2=(UninitRef);
    new-instance v3, Landroid/graphics/Rect;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-direct {v2, v0, v1, v3, v4}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V

    #v2=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->B:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->B:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    :cond_1
    #v1=(Conflicted);v4=(Conflicted);
    return-void

    :catch_0
    #v1=(Reference);v4=(Integer);
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method private a(Landroid/view/View;)V
    .locals 4

    const/high16 v3, 0x4000

    #v3=(Integer);
    const/4 v1, -0x2

    #v1=(Byte);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_0
    #v0=(Reference);
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v1=(Integer);
    if-lez v1, :cond_1

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    :goto_0
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    #v0=(Integer);
    if-lez v0, :cond_2

    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    :goto_1
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->measure(II)V

    return-void

    :cond_1
    #v0=(Reference);
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_0

    :cond_2
    #v0=(Integer);
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    goto :goto_1
.end method

.method private a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 6

    const/4 v5, 0x0

    #v5=(Null);
    const/4 v4, -0x1

    #v4=(Byte);
    const/4 v2, -0x2

    #v2=(Byte);
    iget v0, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    #v0=(Integer);
    iget v1, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    #v1=(Integer);
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->measure(II)V

    iget v1, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v1, v4, :cond_2

    iget v1, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    move v3, v1

    :goto_0
    #v3=(Integer);
    if-ne v0, v4, :cond_3

    iget v0, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    :cond_0
    :goto_1
    invoke-virtual {p0, p2}, Lcom/baidu/mapapi/map/MapView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    check-cast p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;

    iget v2, p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;->x:I

    #v2=(Integer);
    iget v1, p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;->y:I

    #v1=(Integer);
    iget v4, p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;->mode:I

    #v4=(Integer);
    if-nez v4, :cond_1

    iget-object v4, p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;->point:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v4=(Reference);
    if-eqz v4, :cond_1

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getProjection()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v1

    #v1=(Reference);
    iget-object v2, p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;->point:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-interface {v1, v2, v4}, Lcom/baidu/platform/comapi/map/Projection;->toPixels(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v1

    iget v2, v1, Landroid/graphics/Point;->x:I

    #v2=(Integer);
    iget v4, p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;->x:I

    #v4=(Integer);
    add-int/2addr v2, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    #v1=(Integer);
    iget v4, p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;->y:I

    add-int/2addr v1, v4

    :cond_1
    #v4=(Conflicted);
    iget v4, p2, Lcom/baidu/mapapi/map/MapView$LayoutParams;->alignment:I

    #v4=(Integer);
    sparse-switch v4, :sswitch_data_0

    :goto_2
    :sswitch_0
    add-int/2addr v3, v2

    add-int/2addr v0, v1

    invoke-virtual {p1, v2, v1, v3, v0}, Landroid/view/View;->layout(IIII)V

    :goto_3
    return-void

    :cond_2
    #v2=(Byte);v3=(Uninit);v4=(Byte);
    if-ne v1, v2, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    move v3, v1

    #v3=(Integer);
    goto :goto_0

    :cond_3
    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    goto :goto_1

    :sswitch_1
    #v2=(Integer);v4=(Integer);
    sub-int/2addr v1, v0

    goto :goto_2

    :sswitch_2
    sub-int/2addr v2, v3

    goto :goto_2

    :sswitch_3
    div-int/lit8 v4, v3, 0x2

    sub-int/2addr v2, v4

    sub-int/2addr v1, v0

    goto :goto_2

    :sswitch_4
    div-int/lit8 v4, v3, 0x2

    sub-int/2addr v2, v4

    div-int/lit8 v4, v0, 0x2

    sub-int/2addr v1, v4

    goto :goto_2

    :sswitch_5
    div-int/lit8 v4, v3, 0x2

    sub-int/2addr v2, v4

    goto :goto_2

    :sswitch_6
    div-int/lit8 v4, v0, 0x2

    sub-int/2addr v1, v4

    goto :goto_2

    :cond_4
    #v1=(Boolean);v2=(Byte);v4=(Byte);
    invoke-virtual {p1, v5, v5, v3, v0}, Landroid/view/View;->layout(IIII)V

    goto :goto_3

    :cond_5
    #v1=(Integer);v3=(Uninit);
    move v3, v1

    #v3=(Integer);
    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_5
        0x3 -> :sswitch_0
        0x5 -> :sswitch_2
        0x10 -> :sswitch_6
        0x11 -> :sswitch_4
        0x30 -> :sswitch_0
        0x33 -> :sswitch_0
        0x50 -> :sswitch_1
        0x51 -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/MapView;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/baidu/mapapi/map/MapView;->c(II)V

    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/MapView;ILcom/baidu/platform/comapi/basestruct/GeoPoint;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/baidu/mapapi/map/MapView;->a(ILcom/baidu/platform/comapi/basestruct/GeoPoint;I)V

    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/Overlay;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/Overlay;)V

    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/MapView;Lcom/baidu/platform/comapi/map/r;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/platform/comapi/map/r;I)V

    return-void
.end method

.method private a(Lcom/baidu/mapapi/map/Overlay;)V
    .locals 3

    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v1, 0x15

    #v1=(PosByte);
    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Integer);v1=(PosByte);v2=(Uninit);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/RuntimeException;

    #v0=(UninitRef);
    const-string v1, "cat not add overlay,overlay already exists in mapview"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_2
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    const/16 v1, 0x1b

    if-ne v0, v1, :cond_3

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/ItemizedOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->a()V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->b()V

    :cond_3
    #v0=(Conflicted);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const v1, 0x21341231

    #v1=(Integer);
    if-ne v0, v1, :cond_5

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/GroundOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GroundOverlay;->a()V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GroundOverlay;->b()V

    :cond_4
    :goto_1
    #v0=(Conflicted);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    goto :goto_0

    :cond_5
    #v0=(Integer);v2=(Uninit);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    const/16 v1, 0xc

    #v1=(PosByte);
    if-ne v0, v1, :cond_6

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/RouteOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/RouteOverlay;->a()V

    goto :goto_1

    :cond_6
    #v0=(Integer);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_7

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/TransitOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TransitOverlay;->a()V

    goto :goto_1

    :cond_7
    #v0=(Integer);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    const/16 v1, 0xe

    if-ne v0, v1, :cond_8

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/PoiOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/PoiOverlay;->a()V

    goto :goto_1

    :cond_8
    #v0=(Integer);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_9

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/GraphicsOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->a()V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->c()V

    goto :goto_1

    :cond_9
    #v0=(Integer);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_a

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->a()V

    goto :goto_1

    :cond_a
    #v0=(Integer);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_4

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/TextOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextOverlay;->a()V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextOverlay;->b()V

    goto :goto_1
.end method

.method private a(Lcom/baidu/platform/comapi/map/r;I)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_2

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    #v0=(Integer);
    if-ne v0, p2, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v3, 0xc

    #v3=(PosByte);
    if-ne v0, v3, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/RouteOverlay;

    iget v3, p1, Lcom/baidu/platform/comapi/map/r;->b:I

    #v3=(Integer);
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/RouteOverlay;->onTap(I)Z

    :cond_0
    #v0=(Conflicted);
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v3, 0x1c

    #v3=(PosByte);
    if-ne v0, v3, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/TransitOverlay;

    iget v3, p1, Lcom/baidu/platform/comapi/map/r;->b:I

    #v3=(Integer);
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/TransitOverlay;->onTap(I)Z

    :cond_1
    #v0=(Conflicted);v3=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method private b(I)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/4 v3, 0x7

    #v3=(PosByte);
    if-ne v0, v3, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    #v0=(Integer);
    if-ne v0, p1, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->dispatchTap()Z

    :cond_0
    #v0=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method static synthetic b(Lcom/baidu/mapapi/map/MapView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapView;->c(I)V

    return-void
.end method

.method static synthetic b(Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/Overlay;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapView;->b(Lcom/baidu/mapapi/map/Overlay;)V

    return-void
.end method

.method private b(Lcom/baidu/mapapi/map/Overlay;)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    #v0=(Integer);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Integer);v1=(Uninit);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mType:I

    const/16 v1, 0x15

    #v1=(PosByte);
    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    goto :goto_0

    :cond_1
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->a(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    invoke-virtual {v0, v1, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget v1, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->b(I)I

    iput v2, p1, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    goto :goto_0
.end method

.method static synthetic b(Lcom/baidu/mapapi/map/MapView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->G:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic c(Lcom/baidu/mapapi/map/MapView;)I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/MapView;->F:I

    #v0=(Integer);
    return v0
.end method

.method private c(I)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v3, 0x15

    #v3=(PosByte);
    if-ne v0, v3, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/PopupOverlay;

    iget-object v0, v0, Lcom/baidu/mapapi/map/PopupOverlay;->a:Lcom/baidu/mapapi/map/PopupClickListener;

    if-eqz v0, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/PopupOverlay;

    iget-object v0, v0, Lcom/baidu/mapapi/map/PopupOverlay;->a:Lcom/baidu/mapapi/map/PopupClickListener;

    invoke-interface {v0, p1}, Lcom/baidu/mapapi/map/PopupClickListener;->onClickedPopup(I)V

    :cond_0
    #v0=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method private c(II)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v3, 0xe

    #v3=(PosByte);
    if-ne v0, v3, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mLayerID:I

    #v0=(Integer);
    if-ne v0, p2, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/PoiOverlay;

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/PoiOverlay;->onTap(I)Z

    :cond_0
    #v0=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method static synthetic c(Lcom/baidu/mapapi/map/MapView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/MapView;->b(I)V

    return-void
.end method

.method static synthetic d()Landroid/util/SparseArray;
    .locals 1

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->C:Landroid/util/SparseArray;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic d(Lcom/baidu/mapapi/map/MapView;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->B:Landroid/widget/ImageView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic e(Lcom/baidu/mapapi/map/MapView;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->z:Landroid/widget/TextView;

    #v0=(Reference);
    return-object v0
.end method

.method private e()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->p:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v1

    #v1=(Integer);
    const/16 v2, 0xb4

    #v2=(PosShort);
    if-lt v1, v2, :cond_0

    const-string v1, "logo_h.png"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_0
    #v1=(Integer);v2=(PosShort);v3=(Uninit);v4=(Uninit);
    const-string v1, "logo_l.png"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    const-string v3, "logoaddr"

    #v3=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/o;->g:Ljava/util/Map;

    const-string v4, "logo"

    #v4=(Reference);
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "bshow"

    #v0=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "imgW"

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "imgH"

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "showLR"

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "iconwidth"

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "iconlayer"

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "bound"

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "popname"

    const v3, -0x4cd266b3

    #v3=(Integer);
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    mul-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v1, v0}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "imgdata"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->f(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->c:I

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    iget v1, v1, Lcom/baidu/platform/comapi/map/o;->c:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1
.end method

.method static synthetic f(Lcom/baidu/mapapi/map/MapView;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->A:Landroid/widget/TextView;

    #v0=(Reference);
    return-object v0
.end method

.method private f()V
    .locals 4

    const-string v0, "{\"dataset\":[{\"x\":%d,\"y\":%d,\"hidetime\":1000}]}"

    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    iget v3, p0, Lcom/baidu/mapapi/map/MapView;->m:I

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    iget v3, p0, Lcom/baidu/mapapi/map/MapView;->n:I

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/baidu/platform/comapi/map/b;->a()Lcom/baidu/platform/comapi/map/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/d;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/baidu/platform/comapi/map/b;->a()Lcom/baidu/platform/comapi/map/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/d;->d()V

    return-void
.end method

.method static synthetic g(Lcom/baidu/mapapi/map/MapView;)F
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/MapView;->k:F

    #v0=(Integer);
    return v0
.end method

.method private g()V
    .locals 2

    new-instance v0, Lcom/baidu/mapapi/map/d;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/d;-><init>(Lcom/baidu/mapapi/map/MapView;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->g:Lcom/baidu/platform/comapi/map/u;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->g:Lcom/baidu/platform/comapi/map/u;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/q;->a(Lcom/baidu/platform/comapi/map/u;)V

    new-instance v0, Lcom/baidu/mapapi/map/e;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/e;-><init>(Lcom/baidu/mapapi/map/MapView;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->c:Lcom/baidu/platform/comapi/map/a;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->c:Lcom/baidu/platform/comapi/map/a;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/q;->a(Lcom/baidu/platform/comapi/map/a;)V

    return-void
.end method

.method static synthetic h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic i(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapTouchListener;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->r:Lcom/baidu/mapapi/map/MKMapTouchListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic j(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapStatusChangeListener;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->t:Lcom/baidu/mapapi/map/MKMapStatusChangeListener;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method a(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/q;->a(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method a()V
    .locals 5

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getChildCount()I

    move-result v3

    #v3=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    move v2, v0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Integer);v4=(Conflicted);
    if-ge v2, v3, :cond_2

    invoke-super {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    #v4=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    #v0=(Reference);
    if-eq v4, v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    if-eq v4, v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    if-eq v4, v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    if-ne v4, v0, :cond_1

    :cond_0
    :goto_1
    #v0=(Conflicted);
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_0

    :cond_1
    #v0=(Reference);
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    #v1=(Reference);
    instance-of v0, v1, Lcom/baidu/mapapi/map/MapView$LayoutParams;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    move-object v0, v1

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/MapView$LayoutParams;

    iget v0, v0, Lcom/baidu/mapapi/map/MapView$LayoutParams;->mode:I

    #v0=(Integer);
    if-nez v0, :cond_0

    invoke-direct {p0, v4, v1}, Lcom/baidu/mapapi/map/MapView;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_2
    #v1=(Conflicted);v4=(Conflicted);
    return-void
.end method

.method a(I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/q;->a(I)V

    return-void
.end method

.method a(II)V
    .locals 7

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->k()Lcom/baidu/platform/comapi/map/t;

    move-result-object v1

    #v1=(Reference);
    iget v0, v1, Lcom/baidu/platform/comapi/map/t;->a:F

    #v0=(Integer);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getMapCenter()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v2

    #v2=(Reference);
    new-instance v3, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v3=(UninitRef);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    #v4=(Integer);
    div-int/lit8 v5, p1, 0x2

    #v5=(Integer);
    sub-int/2addr v4, v5

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v5

    div-int/lit8 v6, p2, 0x2

    #v6=(Integer);
    add-int/2addr v5, v6

    invoke-direct {v3, v4, v5}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v3=(Reference);
    new-instance v4, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v4=(UninitRef);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v5

    div-int/lit8 v6, p1, 0x2

    add-int/2addr v5, v6

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    div-int/lit8 v6, p2, 0x2

    sub-int/2addr v2, v6

    invoke-direct {v4, v5, v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v4=(Reference);
    invoke-static {v3}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v2

    #v2=(Reference);
    invoke-static {v4}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    new-instance v4, Lcom/baidu/platform/comapi/basestruct/c;

    #v4=(UninitRef);
    invoke-direct {v4}, Lcom/baidu/platform/comapi/basestruct/c;-><init>()V

    #v4=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/baidu/platform/comapi/basestruct/c;->a(I)V

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v4, v2}, Lcom/baidu/platform/comapi/basestruct/c;->b(I)V

    new-instance v2, Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/platform/comapi/basestruct/c;-><init>()V

    #v2=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/baidu/platform/comapi/basestruct/c;->a(I)V

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2, v3}, Lcom/baidu/platform/comapi/basestruct/c;->b(I)V

    new-instance v3, Lcom/baidu/platform/comapi/basestruct/b;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/baidu/platform/comapi/basestruct/b;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v4}, Lcom/baidu/platform/comapi/basestruct/b;->a(Lcom/baidu/platform/comapi/basestruct/c;)V

    invoke-virtual {v3, v2}, Lcom/baidu/platform/comapi/basestruct/b;->b(Lcom/baidu/platform/comapi/basestruct/c;)V

    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, v3}, Lcom/baidu/platform/comapi/map/q;->a(Lcom/baidu/platform/comapi/basestruct/b;)F

    move-result v0

    :cond_0
    #v0=(Integer);
    iput v0, v1, Lcom/baidu/platform/comapi/map/t;->a:F

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;)V

    return-void
.end method

.method a(ILcom/baidu/platform/comapi/map/d;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/q;->a(ILcom/baidu/platform/comapi/map/d;)V

    return-void
.end method

.method a(ZZ)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v0=(Reference);
    invoke-virtual {v0, p2}, Landroid/widget/ZoomControls;->setIsZoomOutEnabled(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {v0, p1}, Landroid/widget/ZoomControls;->setIsZoomInEnabled(Z)V

    return-void
.end method

.method b(II)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/map/MapView;->m:I

    iput p2, p0, Lcom/baidu/mapapi/map/MapView;->n:I

    invoke-direct {p0}, Lcom/baidu/mapapi/map/MapView;->f()V

    return-void
.end method

.method b()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapController;->zoomIn()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method c()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapController;->zoomOut()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    instance-of v0, p1, Lcom/baidu/mapapi/map/MapView$LayoutParams;

    #v0=(Boolean);
    return v0
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->a()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    :cond_0
    #v0=(Reference);
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/baidu/mapapi/map/MapView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Integer);v1=(Uninit);
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    #v1=(One);
    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/baidu/mapapi/map/MapView;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    :cond_1
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public displayZoomControls(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/ZoomControls;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    :cond_1
    #v0=(Conflicted);
    return-void
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->destroy()V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    new-instance v0, Lcom/baidu/mapapi/map/MapView$LayoutParams;

    #v0=(UninitRef);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1, p1}, Lcom/baidu/mapapi/map/MapView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    #v0=(Reference);
    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, Lcom/baidu/mapapi/map/MapView$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Lcom/baidu/mapapi/map/MapView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    #v0=(Reference);
    return-object v0
.end method

.method public getCenterPixel()Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapController;->b()Landroid/graphics/Point;

    move-result-object v0

    return-object v0
.end method

.method public getController()Lcom/baidu/mapapi/map/MapController;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    return-object v0
.end method

.method public getCurrentMap()Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

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

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/o;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public getLatitudeSpan()I
    .locals 4

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getProjection()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v0, v1, v1}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    iget v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    iget v3, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    #v3=(Integer);
    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0, v2, v3}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    return v0
.end method

.method public getLongitudeSpan()I
    .locals 4

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getProjection()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v0, v1, v1}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    iget v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    iget v3, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    #v3=(Integer);
    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0, v2, v3}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    return v0
.end method

.method public getMapCenter()Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->h()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    goto :goto_0
.end method

.method public getMapOverlooking()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->j()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getMapRotation()I
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getMapStatus()Lcom/baidu/mapapi/map/MKMapStatus;

    move-result-object v0

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/mapapi/map/MKMapStatus;->rotate:I

    #v0=(Integer);
    return v0
.end method

.method public getMapStatus()Lcom/baidu/mapapi/map/MKMapStatus;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapController;->a()Lcom/baidu/mapapi/map/MKMapStatus;

    move-result-object v0

    return-object v0
.end method

.method public getMaxZoomLevel()I
    .locals 1

    const/16 v0, 0x13

    #v0=(PosByte);
    return v0
.end method

.method public getMinZoomLevel()I
    .locals 1

    const/4 v0, 0x3

    #v0=(PosByte);
    return v0
.end method

.method public getOverlays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/Overlay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getProjection()Lcom/baidu/platform/comapi/map/Projection;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->l:Lcom/baidu/platform/comapi/map/Projection;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/mapapi/map/MapView$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/MapView$a;-><init>(Lcom/baidu/mapapi/map/MapView;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->l:Lcom/baidu/platform/comapi/map/Projection;

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->l:Lcom/baidu/platform/comapi/map/Projection;

    return-object v0
.end method

.method public getZoomControls()Landroid/view/View;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v0=(Reference);
    return-object v0
.end method

.method public getZoomLevel()F
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->i()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public isDoubleClickZooming()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->g()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isSatellite()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->e()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isTraffic()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->f()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->indexOfChild(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->setBuiltInZoomControls(Z)V

    :cond_1
    #v0=(Boolean);
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/ZoomControls;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/q;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/q;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 7

    const/4 v4, -0x2

    #v4=(Byte);
    const/high16 v6, -0x8000

    #v6=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    sub-int v1, p4, p2

    #v1=(Integer);
    iput v1, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    sub-int v1, p5, p3

    iput v1, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView$c;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    #v2=(Integer);
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v2, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/MapView$c;->setVisibility(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    iget v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    iget v3, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    #v3=(Integer);
    invoke-virtual {v1, v0, v0, v2, v3}, Lcom/baidu/mapapi/map/MapView$c;->layout(IIII)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/q;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v2, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/q;->setVisibility(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iget v2, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    iget v3, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    invoke-virtual {v1, v0, v0, v2, v3}, Lcom/baidu/platform/comapi/map/q;->layout(IIII)V

    iget-boolean v1, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    #v1=(Boolean);
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v1=(Reference);
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {v1}, Landroid/widget/ZoomControls;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {v1, v0}, Landroid/widget/ZoomControls;->setVisibility(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    sub-int v2, p4, p2

    sub-int v3, p5, p3

    invoke-virtual {v1, v2, v3}, Landroid/widget/ZoomControls;->measure(II)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {v1}, Landroid/widget/ZoomControls;->getMeasuredWidth()I

    move-result v1

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/ZoomControls;->getMeasuredHeight()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v3=(Reference);
    add-int/lit8 v4, p4, -0xa

    #v4=(Integer);
    sub-int v1, v4, v1

    add-int/lit8 v4, p5, -0x5

    sub-int v2, v4, v2

    sub-int/2addr v2, p3

    add-int/lit8 v4, p4, -0xa

    add-int/lit8 v5, p5, -0x5

    #v5=(Integer);
    sub-int/2addr v5, p3

    invoke-virtual {v3, v1, v2, v4, v5}, Landroid/widget/ZoomControls;->layout(IIII)V

    :cond_1
    #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
    iget-boolean v1, p0, Lcom/baidu/mapapi/map/MapView;->G:Z

    #v1=(Boolean);
    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Landroid/view/View;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v1

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v2

    #v2=(Integer);
    iget v3, p0, Lcom/baidu/mapapi/map/MapView;->D:I

    #v3=(Integer);
    if-eq v3, v6, :cond_2

    iget v3, p0, Lcom/baidu/mapapi/map/MapView;->E:I

    if-ne v3, v6, :cond_5

    :cond_2
    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    #v3=(Reference);
    const/4 v4, 0x5

    #v4=(PosByte);
    sub-int v5, p5, p3

    #v5=(Integer);
    sub-int v2, v5, v2

    add-int/lit8 v2, v2, -0x38

    add-int/lit8 v1, v1, 0x5

    sub-int v5, p5, p3

    add-int/lit8 v5, v5, -0x38

    invoke-virtual {v3, v4, v2, v1, v5}, Landroid/widget/RelativeLayout;->layout(IIII)V

    :cond_3
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getChildCount()I

    move-result v1

    :goto_1
    #v0=(Integer);v1=(Integer);v2=(Conflicted);
    if-ge v0, v1, :cond_7

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    #v2=(Reference);
    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->b:Lcom/baidu/mapapi/map/MapView$c;

    #v3=(Reference);
    if-eq v2, v3, :cond_4

    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    if-eq v2, v3, :cond_4

    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    if-eq v2, v3, :cond_4

    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    if-ne v2, v3, :cond_6

    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    #v0=(Null);v2=(Integer);v3=(Integer);
    iget-object v3, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    #v3=(Reference);
    iget v4, p0, Lcom/baidu/mapapi/map/MapView;->D:I

    iget v5, p0, Lcom/baidu/mapapi/map/MapView;->E:I

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/mapapi/map/MapView;->D:I

    add-int/2addr v1, v6

    iget v6, p0, Lcom/baidu/mapapi/map/MapView;->E:I

    add-int/2addr v2, v6

    invoke-virtual {v3, v4, v5, v1, v2}, Landroid/widget/RelativeLayout;->layout(IIII)V

    goto :goto_0

    :cond_6
    #v0=(Integer);v2=(Reference);v5=(Conflicted);
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/baidu/mapapi/map/MapView;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    :cond_7
    #v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method public onPause()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->k()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->u:Lcom/baidu/platform/comapi/map/t;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->e()Z

    move-result v0

    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->v:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->f()Z

    move-result v0

    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->w:Z

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getOverlays()Ljava/util/List;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MapView;->x:Ljava/util/List;

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->onPause()V

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "lat"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    const-string v1, "lon"

    #v1=(Reference);
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v2=(Reference);
    new-instance v3, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v3=(UninitRef);
    invoke-direct {v3, v0, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/MapController;->setCenter(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);
    const-string v0, "zoom"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    #v0=(Float);
    const/4 v1, 0x0

    #v1=(Null);
    cmpl-float v1, v0, v1

    #v1=(Byte);
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/MapController;->setZoom(F)F

    :cond_1
    #v1=(Conflicted);
    const-string v0, "traffic"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->setTraffic(Z)V

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->onResume()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->u:Lcom/baidu/platform/comapi/map/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->k()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->u:Lcom/baidu/platform/comapi/map/t;

    #v1=(Reference);
    iget-object v0, v0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    iput-object v0, v1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->u:Lcom/baidu/platform/comapi/map/t;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/q;->a(Lcom/baidu/platform/comapi/map/t;)V

    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iget-boolean v1, p0, Lcom/baidu/mapapi/map/MapView;->v:Z

    #v1=(Boolean);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/q;->a(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    iget-boolean v1, p0, Lcom/baidu/mapapi/map/MapView;->w:Z

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/q;->b(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->x:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->x:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    #v1=(Conflicted);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->refresh()V

    :cond_2
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getMapCenter()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "lat"

    #v1=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "lon"

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "zoom"

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getZoomLevel()F

    move-result v1

    #v1=(Float);
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v0, "traffic"

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->isTraffic()Z

    move-result v1

    #v1=(Boolean);
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/baidu/mapapi/map/MapView;->h:I

    iput p2, p0, Lcom/baidu/mapapi/map/MapView;->i:I

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/o;->e(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/q;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public preLoad()V
    .locals 0

    return-void
.end method

.method public refresh()V
    .locals 7

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v6, 0x1

    #v6=(One);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getOverlays()Ljava/util/List;

    move-result-object v4

    #v4=(Reference);
    if-eqz v4, :cond_c

    move v2, v3

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v5=(Conflicted);
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v2, v0, :cond_c

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v1, 0x1b

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/ItemizedOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->c()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->getAllItem()Ljava/util/ArrayList;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-gtz v1, :cond_8

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->d()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->d()I

    move-result v5

    invoke-virtual {v1, v5, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->d()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    :goto_1
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/ItemizedOverlay;->a(Z)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const v1, 0x21341231

    #v1=(Integer);
    if-ne v0, v1, :cond_1

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/GroundOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GroundOverlay;->c()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GroundOverlay;->size()I

    move-result v1

    #v1=(Integer);
    if-gtz v1, :cond_9

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v5, v0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v5=(Integer);
    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v5, v0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    invoke-virtual {v1, v5, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v5, v0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    :goto_2
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/GroundOverlay;->a(Z)V

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v1, 0xe

    #v1=(PosByte);
    if-ne v0, v1, :cond_2

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/PoiOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/PoiOverlay;->b()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/PoiOverlay;->b()Ljava/lang/String;

    move-result-object v1

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/PoiOverlay;->getInnerOverlay()Lcom/baidu/platform/comapi/map/d;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/map/x;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/PoiOverlay;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/x;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lcom/baidu/platform/comapi/map/x;->a(Z)V

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/x;->d()V

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v1, 0xc

    #v1=(PosByte);
    if-ne v0, v1, :cond_3

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/RouteOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/RouteOverlay;->f()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/RouteOverlay;->f()Ljava/lang/String;

    move-result-object v1

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/RouteOverlay;->e()Lcom/baidu/platform/comapi/map/y;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/RouteOverlay;->g()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comapi/map/y;->a(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/RouteOverlay;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/y;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lcom/baidu/platform/comapi/map/y;->a(Z)V

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/y;->d()V

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v1, 0x1c

    #v1=(PosByte);
    if-ne v0, v1, :cond_4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/TransitOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TransitOverlay;->f()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TransitOverlay;->f()Ljava/lang/String;

    move-result-object v1

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TransitOverlay;->e()Lcom/baidu/platform/comapi/map/A;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TransitOverlay;->g()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comapi/map/A;->a(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TransitOverlay;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comapi/map/A;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lcom/baidu/platform/comapi/map/A;->a(Z)V

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/A;->d()V

    :cond_4
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/4 v1, 0x7

    #v1=(PosByte);
    if-ne v0, v1, :cond_5

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->d()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->d()Ljava/lang/String;

    move-result-object v1

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_5

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->b()Lcom/baidu/platform/comapi/map/d;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/map/n;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->c()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comapi/map/n;->a(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comapi/map/n;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lcom/baidu/platform/comapi/map/n;->a(Z)V

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/n;->d()V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MyLocationOverlay;->e()V

    :cond_5
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v1, 0x1d

    #v1=(PosByte);
    if-ne v0, v1, :cond_6

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/GraphicsOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->d()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->getAllGraphics()Ljava/util/ArrayList;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_a

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v5

    invoke-virtual {v1, v5, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    :goto_3
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/GraphicsOverlay;->a(Z)V

    :cond_6
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/Overlay;

    iget v0, v0, Lcom/baidu/mapapi/map/Overlay;->mType:I

    #v0=(Integer);
    const/16 v1, 0x1e

    #v1=(PosByte);
    if-ne v0, v1, :cond_7

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/TextOverlay;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextOverlay;->size()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_b

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v5, v0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    #v5=(Integer);
    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v5, v0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    invoke-virtual {v1, v5, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v0, v0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    #v0=(Integer);
    invoke-virtual {v1, v0}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    :cond_7
    :goto_4
    #v1=(Conflicted);v5=(Conflicted);
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    :cond_8
    #v0=(Reference);v1=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->d()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/ItemizedOverlay;->d()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    goto/16 :goto_1

    :cond_9
    #v1=(Integer);v5=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v5, v0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    #v5=(Integer);
    invoke-virtual {v1, v5, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v5, v0, Lcom/baidu/mapapi/map/GroundOverlay;->mLayerID:I

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    goto/16 :goto_2

    :cond_a
    #v1=(Integer);v5=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/GraphicsOverlay;->b()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    goto/16 :goto_3

    :cond_b
    #v1=(Integer);v5=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v5, v0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    #v5=(Integer);
    invoke-virtual {v1, v5, v6}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v1

    iget v0, v0, Lcom/baidu/mapapi/map/TextOverlay;->mLayerID:I

    #v0=(Integer);
    invoke-virtual {v1, v0}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    goto :goto_4

    :cond_c
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
    return-void
.end method

.method public regMapStatusChangeListener(Lcom/baidu/mapapi/map/MKMapStatusChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/MapView;->t:Lcom/baidu/mapapi/map/MKMapStatusChangeListener;

    return-void
.end method

.method public regMapTouchListner(Lcom/baidu/mapapi/map/MKMapTouchListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/MapView;->r:Lcom/baidu/mapapi/map/MKMapTouchListener;

    return-void
.end method

.method public regMapViewListener(Lcom/baidu/mapapi/BMapManager;Lcom/baidu/mapapi/map/MKMapViewListener;)V
    .locals 0

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-object p2, p0, Lcom/baidu/mapapi/map/MapView;->q:Lcom/baidu/mapapi/map/MKMapViewListener;

    goto :goto_0
.end method

.method public setBuiltInZoomControls(Z)V
    .locals 1

    if-eqz p1, :cond_2

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/ZoomControls;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_2
    #v0=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->s:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->j:Landroid/widget/ZoomControls;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    goto :goto_0
.end method

.method public setDoubleClickZooming(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->f:Lcom/baidu/mapapi/map/MapController;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->g(Z)V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/q;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/q;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setSatellite(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/MapView;->v:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/q;->a(Z)V

    return-void
.end method

.method public setScaleControlPosition(II)V
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getWidth()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getHeight()I

    move-result v1

    #v1=(Integer);
    iget-boolean v2, p0, Lcom/baidu/mapapi/map/MapView;->G:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    if-ltz p2, :cond_0

    if-gt p2, v1, :cond_0

    if-ltz p1, :cond_0

    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/baidu/mapapi/map/MapView;->D:I

    iput p2, p0, Lcom/baidu/mapapi/map/MapView;->E:I

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/baidu/mapapi/map/MapView;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v0

    #v0=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    #v2=(Reference);
    add-int/2addr v0, p1

    add-int/2addr v1, p2

    invoke-virtual {v2, p1, p2, v0, v1}, Landroid/widget/RelativeLayout;->layout(IIII)V

    :cond_0
    #v2=(Conflicted);
    return-void
.end method

.method public setTraffic(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/MapView;->w:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/q;->b(Z)V

    return-void
.end method

.method public setVisibility(I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/q;->setVisibility(I)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public showScaleControl(Z)V
    .locals 2

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->G:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->e:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "add scale control"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;)V

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/MapView;->G:Z

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v1=(Uninit);
    if-nez p1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/MapView;->G:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/mapapi/map/MapView;->e:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "remove scale control"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/MapView;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/MapView;->G:Z

    goto :goto_0
.end method

*/}
