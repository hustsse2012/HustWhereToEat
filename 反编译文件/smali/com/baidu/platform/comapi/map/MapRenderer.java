package com.baidu.platform.comapi.map; class MapRenderer {/*

.class public Lcom/baidu/platform/comapi/map/MapRenderer;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# static fields
.field public static a:I

.field public static b:I

.field public static c:I

.field public static d:I

.field public static e:I

.field public static f:I


# instance fields
.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/baidu/platform/comapi/map/MapRenderer;->c:I

    const/16 v0, 0x800

    #v0=(PosShort);
    sput v0, Lcom/baidu/platform/comapi/map/MapRenderer;->d:I

    const/16 v0, 0x3800

    sput v0, Lcom/baidu/platform/comapi/map/MapRenderer;->e:I

    const/16 v0, 0x2000

    sput v0, Lcom/baidu/platform/comapi/map/MapRenderer;->f:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/platform/comapi/map/MapRenderer;->g:I

    iput p1, p0, Lcom/baidu/platform/comapi/map/MapRenderer;->g:I

    return-void
.end method

.method private static native nativeInit()V
.end method

.method private static native nativeRender(I)V
.end method

.method private static native nativeResize(IIIII)V
.end method


# virtual methods
.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 5

    sget v0, Lcom/baidu/platform/comapi/map/MapRenderer;->c:I

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    if-gt v0, v1, :cond_0

    sget v0, Lcom/baidu/platform/comapi/map/MapRenderer;->a:I

    sget v1, Lcom/baidu/platform/comapi/map/MapRenderer;->b:I

    #v1=(Integer);
    sget v2, Lcom/baidu/platform/comapi/map/MapRenderer;->d:I

    #v2=(Integer);
    sget v3, Lcom/baidu/platform/comapi/map/MapRenderer;->e:I

    #v3=(Integer);
    sget v4, Lcom/baidu/platform/comapi/map/MapRenderer;->f:I

    #v4=(Integer);
    invoke-static {v0, v1, v2, v3, v4}, Lcom/baidu/platform/comapi/map/MapRenderer;->nativeResize(IIIII)V

    sget v0, Lcom/baidu/platform/comapi/map/MapRenderer;->c:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/baidu/platform/comapi/map/MapRenderer;->c:I

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget v0, p0, Lcom/baidu/platform/comapi/map/MapRenderer;->g:I

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/MapRenderer;->nativeRender(I)V

    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 3

    sget v0, Lcom/baidu/platform/comapi/map/MapRenderer;->d:I

    #v0=(Integer);
    sget v1, Lcom/baidu/platform/comapi/map/MapRenderer;->e:I

    #v1=(Integer);
    sget v2, Lcom/baidu/platform/comapi/map/MapRenderer;->f:I

    #v2=(Integer);
    invoke-static {p2, p3, v0, v1, v2}, Lcom/baidu/platform/comapi/map/MapRenderer;->nativeResize(IIIII)V

    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 3

    invoke-static {}, Lcom/baidu/platform/comapi/map/MapRenderer;->nativeInit()V

    const/16 v0, 0x1f02

    #v0=(PosShort);
    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glGetString(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "OpenGL ES-CM 1.0"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "OpenGL ES 1.0-CM"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    const/16 v1, 0x100

    #v1=(PosShort);
    sput v1, Lcom/baidu/platform/comapi/map/MapRenderer;->d:I

    const/16 v1, 0x480

    sput v1, Lcom/baidu/platform/comapi/map/MapRenderer;->e:I

    const/16 v1, 0x280

    sput v1, Lcom/baidu/platform/comapi/map/MapRenderer;->f:I

    :cond_1
    const/16 v1, 0x1f01

    invoke-interface {p1, v1}, Ljavax/microedition/khronos/opengles/GL10;->glGetString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->t()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_2

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->t()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->s()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_2

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    :goto_0
    #v2=(Conflicted);
    return-void

    :cond_2
    invoke-static {v0, v1}, Lcom/baidu/platform/comapi/d/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

*/}
