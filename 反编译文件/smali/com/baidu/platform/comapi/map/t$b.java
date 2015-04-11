package com.baidu.platform.comapi.map; class t$b {/*

.class public Lcom/baidu/platform/comapi/map/t$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/platform/comapi/map/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field final synthetic e:Lcom/baidu/platform/comapi/map/t;


# direct methods
.method public constructor <init>(Lcom/baidu/platform/comapi/map/t;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    iput-object p1, p0, Lcom/baidu/platform/comapi/map/t$b;->e:Lcom/baidu/platform/comapi/map/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput v0, p0, Lcom/baidu/platform/comapi/map/t$b;->a:I

    iput v0, p0, Lcom/baidu/platform/comapi/map/t$b;->b:I

    iput v0, p0, Lcom/baidu/platform/comapi/map/t$b;->c:I

    iput v0, p0, Lcom/baidu/platform/comapi/map/t$b;->d:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v2=(Uninit);v3=(Uninit);
    if-nez p1, :cond_2

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(One);
    instance-of v2, p1, Lcom/baidu/platform/comapi/map/t$b;

    #v2=(Boolean);
    if-nez v2, :cond_3

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(One);
    check-cast p1, Lcom/baidu/platform/comapi/map/t$b;

    iget v2, p0, Lcom/baidu/platform/comapi/map/t$b;->d:I

    #v2=(Integer);
    iget v3, p1, Lcom/baidu/platform/comapi/map/t$b;->d:I

    #v3=(Integer);
    if-eq v2, v3, :cond_4

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    iget v2, p0, Lcom/baidu/platform/comapi/map/t$b;->a:I

    iget v3, p1, Lcom/baidu/platform/comapi/map/t$b;->a:I

    if-eq v2, v3, :cond_5

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_5
    #v0=(One);
    iget v2, p0, Lcom/baidu/platform/comapi/map/t$b;->b:I

    iget v3, p1, Lcom/baidu/platform/comapi/map/t$b;->b:I

    if-eq v2, v3, :cond_6

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_6
    #v0=(One);
    iget v2, p0, Lcom/baidu/platform/comapi/map/t$b;->c:I

    iget v3, p1, Lcom/baidu/platform/comapi/map/t$b;->c:I

    if-eq v2, v3, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/baidu/platform/comapi/map/t$b;->d:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/baidu/platform/comapi/map/t$b;->a:I

    #v1=(Integer);
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/baidu/platform/comapi/map/t$b;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/baidu/platform/comapi/map/t$b;->c:I

    add-int/2addr v0, v1

    return v0
.end method

*/}
