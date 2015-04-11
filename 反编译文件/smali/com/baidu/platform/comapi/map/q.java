package com.baidu.platform.comapi.map; class q {/*

.class public Lcom/baidu/platform/comapi/map/q;
.super Landroid/opengl/GLSurfaceView;

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/platform/comapi/map/q$a;
    }
.end annotation


# static fields
.field static a:Lcom/baidu/platform/comapi/map/w;

.field static b:Lcom/baidu/platform/comapi/map/e;

.field public static d:I

.field private static final l:Ljava/lang/String;

.field private static o:Lcom/baidu/platform/comapi/map/o;

.field private static p:I


# instance fields
.field public c:Lcom/baidu/platform/comapi/map/MapRenderer;

.field e:Lcom/baidu/platform/comapi/map/u;

.field f:Lcom/baidu/platform/comapi/map/a;

.field g:Lcom/baidu/platform/comapi/map/c;

.field h:Lcom/baidu/platform/comapi/map/z;

.field i:Landroid/view/GestureDetector;

.field j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/map/Overlay;",
            ">;"
        }
    .end annotation
.end field

.field k:Z

.field private m:Z

.field private n:Z

.field private q:Lcom/baidu/platform/comapi/map/q$a;

.field private r:I

.field private s:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    const-class v0, Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/map/q;->l:Ljava/lang/String;

    sput-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    sput-object v1, Lcom/baidu/platform/comapi/map/q;->a:Lcom/baidu/platform/comapi/map/w;

    sput-object v1, Lcom/baidu/platform/comapi/map/q;->b:Lcom/baidu/platform/comapi/map/e;

    sput v2, Lcom/baidu/platform/comapi/map/q;->p:I

    sput v2, Lcom/baidu/platform/comapi/map/q;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    #p0=(Reference);
    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/q;->m:Z

    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/q;->n:Z

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/q;->f:Lcom/baidu/platform/comapi/map/a;

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/q;->g:Lcom/baidu/platform/comapi/map/c;

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/q;->h:Lcom/baidu/platform/comapi/map/z;

    new-instance v0, Landroid/view/GestureDetector;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/q;->i:Landroid/view/GestureDetector;

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/q;->j:Ljava/util/List;

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/q;->q:Lcom/baidu/platform/comapi/map/q$a;

    iput v2, p0, Lcom/baidu/platform/comapi/map/q;->r:I

    iput v2, p0, Lcom/baidu/platform/comapi/map/q;->s:I

    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/q;->k:Z

    return-void
.end method

.method private l()V
    .locals 6

    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    #v4=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);
    const-string v1, "compass"

    #v1=(Reference);
    invoke-virtual {v0, v4, v4, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IILjava/lang/String;)I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_2

    sput v1, Lcom/baidu/platform/comapi/map/q;->d:I

    invoke-virtual {v0, v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->b(IZ)V

    invoke-virtual {v0, v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    sget-object v2, Lcom/baidu/platform/comapi/map/q;->a:Lcom/baidu/platform/comapi/map/w;

    #v2=(Reference);
    invoke-static {}, Lcom/baidu/platform/comapi/map/b;->a()Lcom/baidu/platform/comapi/map/d;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v1, v3}, Lcom/baidu/platform/comapi/map/w;->a(ILcom/baidu/platform/comapi/map/d;)V

    :cond_2
    #v2=(Conflicted);v3=(Conflicted);
    const-string v1, "logo"

    #v1=(Reference);
    invoke-virtual {v0, v4, v4, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IILjava/lang/String;)I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_3

    invoke-virtual {v0, v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->b(IZ)V

    invoke-virtual {v0, v1, v4}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    sget-object v2, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v2=(Reference);
    iput v1, v2, Lcom/baidu/platform/comapi/map/o;->c:I

    sget-object v2, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    iget-object v2, v2, Lcom/baidu/platform/comapi/map/o;->g:Ljava/util/Map;

    const-string v3, "logo"

    #v3=(Reference);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    const-string v1, "popup"

    #v1=(Reference);
    invoke-virtual {v0, v4, v4, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IILjava/lang/String;)I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_0

    invoke-virtual {v0, v1, v5}, Lcom/baidu/platform/comjni/map/basemap/a;->b(IZ)V

    invoke-virtual {v0, v1, v4}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    iput v1, v0, Lcom/baidu/platform/comapi/map/o;->a:I

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/o;->e:Ljava/util/Map;

    const-string v2, "popup"

    #v2=(Reference);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/baidu/platform/comapi/basestruct/b;)F
    .locals 9

    const/4 v3, 0x0

    #v3=(Null);
    const/high16 v1, 0x4198

    #v1=(Integer);
    const/high16 v2, 0x4190

    #v2=(Integer);
    const/high16 v0, 0x4040

    #v0=(Integer);
    sget-object v4, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v4=(Reference);
    if-eqz v4, :cond_1

    sget-object v4, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v4}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v4, p1, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    iget v4, v4, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v4=(Integer);
    iget-object v5, p1, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v5=(Integer);
    if-eq v4, v5, :cond_0

    iget-object v4, p1, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v4=(Integer);
    iget-object v5, p1, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v5=(Integer);
    if-ne v4, v5, :cond_2

    :cond_0
    move v0, v2

    :cond_1
    :goto_0
    #v3=(Byte);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v0

    :cond_2
    #v3=(Null);v4=(Integer);v5=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-object v4, p1, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v4=(Integer);
    iget-object v5, p1, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v5=(Integer);
    sub-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v5

    iget-object v4, p1, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v4=(Integer);
    iget-object v6, p1, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v6=(Reference);
    iget v6, v6, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v6=(Integer);
    sub-int/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->h()I

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->j()I

    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/q;->getWidth()I

    move-result v6

    div-int/lit8 v7, v6, 0x4

    #v7=(Integer);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/q;->getHeight()I

    move-result v6

    div-int/lit8 v8, v6, 0x4

    #v8=(Integer);
    if-lez v7, :cond_3

    if-gtz v8, :cond_7

    :cond_3
    move v0, v2

    goto :goto_0

    :goto_1
    if-le v2, v7, :cond_6

    shr-int/lit8 v6, v2, 0x1

    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v2, v6

    goto :goto_1

    :goto_2
    #v3=(Integer);
    if-le v3, v8, :cond_4

    shr-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x14

    int-to-float v2, v2

    #v2=(Float);
    cmpg-float v3, v2, v0

    #v3=(Byte);
    if-ltz v3, :cond_1

    cmpl-float v0, v2, v1

    #v0=(Byte);
    if-lez v0, :cond_5

    move v0, v1

    #v0=(Integer);
    goto :goto_0

    :cond_5
    #v0=(Byte);
    move v0, v2

    #v0=(Float);
    goto :goto_0

    :cond_6
    #v0=(Integer);v2=(Integer);v3=(Null);
    move v2, v3

    #v2=(Null);
    move v3, v4

    #v3=(Integer);
    goto :goto_2

    :cond_7
    #v2=(Integer);v3=(Null);
    move v2, v5

    move v5, v3

    #v5=(Null);
    goto :goto_1
.end method

.method public a(Ljava/lang/String;)I
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v2

    #v2=(Reference);
    if-nez v2, :cond_0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_0
    #v0=(Null);v1=(Reference);v3=(Uninit);v4=(Uninit);
    const-string v1, "location"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    const/16 v1, 0x8

    #v1=(PosByte);
    const/16 v3, 0x3e8

    #v3=(PosShort);
    const-string v4, "location"

    #v4=(Reference);
    invoke-virtual {v2, v1, v3, v4}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IILjava/lang/String;)I

    move-result v1

    :goto_1
    #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
    if-lez v1, :cond_1

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v2, v1, v3}, Lcom/baidu/platform/comjni/map/basemap/a;->b(IZ)V

    invoke-virtual {v2, v1, v0}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    :cond_1
    #v3=(Conflicted);
    move v0, v1

    #v0=(Integer);
    goto :goto_0

    :cond_2
    #v0=(Null);v1=(Boolean);v3=(Uninit);v4=(Uninit);
    invoke-virtual {v2, v0, v0, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IILjava/lang/String;)I

    move-result v1

    #v1=(Integer);
    goto :goto_1
.end method

.method public a()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    sget v0, Lcom/baidu/platform/comapi/map/q;->p:I

    #v0=(Integer);
    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/baidu/platform/comapi/map/q;->p:I

    sget v0, Lcom/baidu/platform/comapi/map/q;->p:I

    if-nez v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->o()V

    sput-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    sput-object v1, Lcom/baidu/platform/comapi/map/q;->a:Lcom/baidu/platform/comapi/map/w;

    sput-object v1, Lcom/baidu/platform/comapi/map/q;->b:Lcom/baidu/platform/comapi/map/e;

    :cond_0
    #v0=(Conflicted);
    iput-object v1, p0, Lcom/baidu/platform/comapi/map/q;->c:Lcom/baidu/platform/comapi/map/MapRenderer;

    return-void
.end method

.method public a(I)V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->a:Lcom/baidu/platform/comapi/map/w;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/w;->a(I)V

    return-void
.end method

.method a(II)V
    .locals 3

    iget v0, p0, Lcom/baidu/platform/comapi/map/q;->r:I

    #v0=(Integer);
    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p1

    iget v1, p0, Lcom/baidu/platform/comapi/map/q;->s:I

    #v1=(Integer);
    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, p2

    sget-object v2, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v2=(Reference);
    invoke-virtual {v2, v0, v1}, Lcom/baidu/platform/comapi/map/o;->a(II)V

    return-void
.end method

.method public a(ILcom/baidu/platform/comapi/map/d;)V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->a:Lcom/baidu/platform/comapi/map/w;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/w;->a(ILcom/baidu/platform/comapi/map/d;)V

    return-void
.end method

.method public a(Landroid/os/Bundle;Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    new-instance v0, Lcom/baidu/platform/comapi/map/s;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comapi/map/s;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/q;->q:Lcom/baidu/platform/comapi/map/q$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/s;->a(Lcom/baidu/platform/comapi/map/q$a;)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/platform/comapi/map/q;->j:Ljava/util/List;

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    if-nez v0, :cond_1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->a:Lcom/baidu/platform/comapi/map/w;

    if-nez v0, :cond_1

    new-instance v0, Lcom/baidu/platform/comapi/map/o;

    #v0=(UninitRef);
    invoke-direct {v0, p2, p0}, Lcom/baidu/platform/comapi/map/o;-><init>(Landroid/content/Context;Lcom/baidu/platform/comapi/map/q;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    new-instance v0, Lcom/baidu/platform/comapi/map/w;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-direct {v0, v1}, Lcom/baidu/platform/comapi/map/w;-><init>(Lcom/baidu/platform/comapi/map/o;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/map/q;->a:Lcom/baidu/platform/comapi/map/w;

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    sget-object v1, Lcom/baidu/platform/comapi/map/q;->a:Lcom/baidu/platform/comapi/map/w;

    invoke-virtual {v0, p1, v1}, Lcom/baidu/platform/comapi/map/o;->a(Landroid/os/Bundle;Lcom/baidu/platform/comapi/map/w;)V

    :cond_0
    invoke-direct {p0}, Lcom/baidu/platform/comapi/map/q;->l()V

    new-instance v0, Lcom/baidu/platform/comapi/map/e;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-direct {v0, v1}, Lcom/baidu/platform/comapi/map/e;-><init>(Lcom/baidu/platform/comapi/map/o;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/map/q;->b:Lcom/baidu/platform/comapi/map/e;

    :cond_1
    sget v0, Lcom/baidu/platform/comapi/map/q;->p:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/baidu/platform/comapi/map/q;->p:I

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    if-eqz v0, :cond_2

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0, p0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/q;)V

    new-instance v0, Lcom/baidu/platform/comapi/map/MapRenderer;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->a()I

    move-result v1

    #v1=(Integer);
    invoke-direct {v0, v1}, Lcom/baidu/platform/comapi/map/MapRenderer;-><init>(I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/q;->c:Lcom/baidu/platform/comapi/map/MapRenderer;

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/q;->c:Lcom/baidu/platform/comapi/map/MapRenderer;

    invoke-virtual {p0, v0}, Lcom/baidu/platform/comapi/map/q;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(Landroid/os/Bundle;)V

    :cond_2
    #v1=(Conflicted);
    invoke-virtual {p0, v2}, Lcom/baidu/platform/comapi/map/q;->setLongClickable(Z)V

    invoke-virtual {p0, v2}, Lcom/baidu/platform/comapi/map/q;->setFocusable(Z)V

    return-void
.end method

.method a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/os/Message;Ljava/lang/Runnable;)V
    .locals 3

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/platform/comapi/map/t;->d:I

    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    iput v1, v0, Lcom/baidu/platform/comapi/map/t;->e:I

    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    const/16 v2, 0x1f4

    #v2=(PosShort);
    invoke-virtual {v1, v0, v2}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;I)V

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/map/a;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/q;->f:Lcom/baidu/platform/comapi/map/a;

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/map/q$a;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/q;->q:Lcom/baidu/platform/comapi/map/q$a;

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/map/t;)V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;)V

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/map/u;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    return-void
.end method

.method public a(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/q;->n:Z

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/q;->n:Z

    #v1=(Boolean);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(Z)V

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    if-eqz v1, :cond_1

    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1, p1}, Lcom/baidu/platform/comapi/map/o;->a(Landroid/view/MotionEvent;)Z

    move-result v1

    #v1=(Boolean);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/q;->i:Landroid/view/GestureDetector;

    #v2=(Reference);
    invoke-virtual {v2, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v1, :cond_0

    if-eqz v2, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0
.end method

.method public b()Lcom/baidu/platform/comapi/map/o;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    return-object v0
.end method

.method public b(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/q;->m:Z

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/q;->m:Z

    #v1=(Boolean);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->b(Z)V

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public c()Ljava/util/List;
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

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/q;->j:Ljava/util/List;

    #v0=(Reference);
    return-object v0
.end method

.method public d()Lcom/baidu/platform/comapi/map/Projection;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->b:Lcom/baidu/platform/comapi/map/e;

    #v0=(Reference);
    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/q;->n:Z

    #v0=(Boolean);
    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/q;->m:Z

    #v0=(Boolean);
    return v0
.end method

.method g()D
    .locals 4

    const-wide/high16 v0, 0x4000

    #v0=(LongLo);v1=(LongHi);
    const/high16 v2, 0x4190

    #v2=(Integer);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/q;->i()F

    move-result v3

    #v3=(Float);
    sub-float/2addr v2, v3

    #v2=(Float);
    float-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method public h()Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 3

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    new-instance v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v1=(UninitRef);
    iget v2, v0, Lcom/baidu/platform/comapi/map/t;->e:I

    #v2=(Integer);
    iget v0, v0, Lcom/baidu/platform/comapi/map/t;->d:I

    #v0=(Integer);
    invoke-direct {v1, v2, v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v1=(Reference);
    return-object v1
.end method

.method public i()F
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->n()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public j()I
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    iget v0, v0, Lcom/baidu/platform/comapi/map/t;->c:I

    #v0=(Integer);
    return v0
.end method

.method public k()Lcom/baidu/platform/comapi/map/t;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    return-void
.end method

.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    invoke-interface {v0, v1, v2}, Lcom/baidu/platform/comapi/map/u;->b(II)V

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->l:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, "onfling"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->d()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/baidu/platform/comapi/map/o;->a(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    const/16 v3, 0x13

    #v3=(PosByte);
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v1, 0x1

    #v1=(One);
    const/16 v2, 0x15

    #v2=(PosByte);
    if-eq p1, v2, :cond_0

    const/16 v2, 0x1d

    if-ne p1, v2, :cond_2

    :cond_0
    sget-object v2, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v2=(Reference);
    const/16 v3, 0x12

    invoke-virtual {v2, v1, v3, v0}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    move-result v2

    #v2=(Integer);
    if-ne v2, v1, :cond_1

    move v0, v1

    :cond_1
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_2
    #v0=(Null);v2=(PosByte);
    if-eq p1, v3, :cond_3

    const/16 v2, 0x33

    if-ne p1, v2, :cond_4

    :cond_3
    sget-object v2, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v2=(Reference);
    invoke-virtual {v2, v1, v3, v0}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    move-result v2

    #v2=(Integer);
    if-ne v2, v1, :cond_1

    move v0, v1

    #v0=(One);
    goto :goto_0

    :cond_4
    #v0=(Null);v2=(PosByte);
    const/16 v2, 0x14

    if-eq p1, v2, :cond_5

    const/16 v2, 0x2f

    if-ne p1, v2, :cond_6

    :cond_5
    sget-object v2, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v2=(Reference);
    const/16 v3, 0x11

    invoke-virtual {v2, v1, v3, v0}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    move-result v2

    #v2=(Integer);
    if-ne v2, v1, :cond_1

    move v0, v1

    #v0=(One);
    goto :goto_0

    :cond_6
    #v0=(Null);v2=(PosByte);
    const/16 v2, 0x16

    if-eq p1, v2, :cond_7

    const/16 v2, 0x20

    if-ne p1, v2, :cond_1

    :cond_7
    sget-object v2, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v2=(Reference);
    const/16 v3, 0x10

    invoke-virtual {v2, v1, v3, v0}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    move-result v2

    #v2=(Integer);
    if-ne v2, v1, :cond_1

    move v0, v1

    #v0=(One);
    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    invoke-interface {v0, v1, v2}, Lcom/baidu/platform/comapi/map/u;->c(II)V

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public onPause()V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->d()V

    :cond_0
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0, p0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/q;)V

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->f()V

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->e()V

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->j()V

    :cond_0
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Uninit);v3=(Uninit);
    sget-object v1, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1, p1}, Lcom/baidu/platform/comapi/map/o;->d(Landroid/view/MotionEvent;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :cond_2
    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    invoke-interface {v1, v2, v3}, Lcom/baidu/platform/comapi/map/u;->a(II)V

    goto :goto_0
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    sput p3, Lcom/baidu/platform/comapi/map/MapRenderer;->a:I

    sput p4, Lcom/baidu/platform/comapi/map/MapRenderer;->b:I

    iput p3, p0, Lcom/baidu/platform/comapi/map/q;->r:I

    iput p4, p0, Lcom/baidu/platform/comapi/map/q;->s:I

    sput v2, Lcom/baidu/platform/comapi/map/MapRenderer;->c:I

    invoke-super {p0, p1, p2, p3, p4}, Landroid/opengl/GLSurfaceView;->surfaceChanged(Landroid/view/SurfaceHolder;III)V

    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/q;->k()Lcom/baidu/platform/comapi/map/t;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, v0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v1=(Reference);
    iput v2, v1, Lcom/baidu/platform/comapi/map/t$b;->a:I

    iget-object v1, v0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    iput v2, v1, Lcom/baidu/platform/comapi/map/t$b;->c:I

    iget-object v1, v0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    iput p4, v1, Lcom/baidu/platform/comapi/map/t$b;->d:I

    iget-object v1, v0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    iput p3, v1, Lcom/baidu/platform/comapi/map/t$b;->b:I

    invoke-virtual {p0, v0}, Lcom/baidu/platform/comapi/map/q;->a(Lcom/baidu/platform/comapi/map/t;)V

    sget-object v0, Lcom/baidu/platform/comapi/map/q;->o:Lcom/baidu/platform/comapi/map/o;

    iget v1, p0, Lcom/baidu/platform/comapi/map/q;->r:I

    #v1=(Integer);
    iget v2, p0, Lcom/baidu/platform/comapi/map/q;->s:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/platform/comapi/map/o;->e(II)V

    return-void
.end method

*/}
