package com.baidu.mapapi.search; class j {/*

.class public Lcom/baidu/mapapi/search/j;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    array-length v1, p1

    #v1=(Integer);
    invoke-static {p1, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/search/j;->a:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/j;->a:Landroid/graphics/Bitmap;

    #v0=(Reference);
    return-object v0
.end method

*/}
