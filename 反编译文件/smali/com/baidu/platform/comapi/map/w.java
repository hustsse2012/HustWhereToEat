package com.baidu.platform.comapi.map; class w {/*

.class public Lcom/baidu/platform/comapi/map/w;
.super Lcom/baidu/platform/comjni/map/basemap/BaseMapCallback;


# instance fields
.field a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/baidu/platform/comapi/map/d;",
            ">;"
        }
    .end annotation
.end field

.field b:Lcom/baidu/platform/comapi/map/o;


# direct methods
.method public constructor <init>(Lcom/baidu/platform/comapi/map/o;)V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/platform/comjni/map/basemap/BaseMapCallback;-><init>()V

    #p0=(Reference);
    new-instance v0, Landroid/util/SparseArray;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/w;->a:Landroid/util/SparseArray;

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/w;->b:Lcom/baidu/platform/comapi/map/o;

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/w;->b:Lcom/baidu/platform/comapi/map/o;

    return-void
.end method


# virtual methods
.method public ReqLayerData(Landroid/os/Bundle;II)I
    .locals 3

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/w;->a:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/platform/comapi/map/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/d;->b()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "jsondata"

    #v2=(Reference);
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/d;->c()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "param"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/d;->e()I

    move-result v0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/w;->b:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/w;->b:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/o;->b()Lcom/baidu/platform/comjni/map/basemap/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->c(I)V

    :cond_0
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/w;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public a(ILcom/baidu/platform/comapi/map/d;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/w;->a:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/w;->b:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {p2, p1, v0}, Lcom/baidu/platform/comapi/map/d;->a(ILcom/baidu/platform/comapi/map/o;)V

    return-void
.end method

*/}
