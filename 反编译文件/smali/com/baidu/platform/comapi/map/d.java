package com.baidu.platform.comapi.map; class d {/*

.class public abstract Lcom/baidu/platform/comapi/map/d;
.super Ljava/lang/Object;


# instance fields
.field c:I

.field d:I

.field e:Lcom/baidu/platform/comapi/map/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput v0, p0, Lcom/baidu/platform/comapi/map/d;->c:I

    iput v0, p0, Lcom/baidu/platform/comapi/map/d;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/platform/comapi/map/d;->e:Lcom/baidu/platform/comapi/map/o;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput v0, p0, Lcom/baidu/platform/comapi/map/d;->c:I

    iput v0, p0, Lcom/baidu/platform/comapi/map/d;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/platform/comapi/map/d;->e:Lcom/baidu/platform/comapi/map/o;

    iput p1, p0, Lcom/baidu/platform/comapi/map/d;->d:I

    return-void
.end method


# virtual methods
.method public a(ILcom/baidu/platform/comapi/map/o;)V
    .locals 0

    iput p1, p0, Lcom/baidu/platform/comapi/map/d;->c:I

    iput-object p2, p0, Lcom/baidu/platform/comapi/map/d;->e:Lcom/baidu/platform/comapi/map/o;

    return-void
.end method

.method public abstract a(Ljava/lang/String;)V
.end method

.method public a(Z)V
    .locals 2

    iget v0, p0, Lcom/baidu/platform/comapi/map/d;->c:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/d;->e:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/d;->e:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/baidu/platform/comapi/map/d;->c:I

    #v1=(Integer);
    invoke-virtual {v0, v1, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IZ)V

    goto :goto_0
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Landroid/os/Bundle;
.end method

.method public d()V
    .locals 2

    iget v0, p0, Lcom/baidu/platform/comapi/map/d;->c:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/d;->e:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/d;->e:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/baidu/platform/comapi/map/d;->c:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(I)V

    goto :goto_0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/baidu/platform/comapi/map/d;->d:I

    #v0=(Integer);
    return v0
.end method

*/}
