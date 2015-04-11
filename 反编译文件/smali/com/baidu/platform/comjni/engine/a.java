package com.baidu.platform.comjni.engine; class a {/*

.class public Lcom/baidu/platform/comjni/engine/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/List",
            "<",
            "Landroid/os/Handler;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/util/SparseArray;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a()V
    .locals 4

    sget-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    #v2=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v3=(Conflicted);
    if-ge v1, v2, :cond_1

    sget-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    #v0=(Reference);
    sget-object v3, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_1
    #v3=(Conflicted);
    sget-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    return-void
.end method

.method public static a(III)V
    .locals 3

    sget-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    #v1=(Reference);v2=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/os/Handler;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v0, p0, p1, p2, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public static a(ILandroid/os/Handler;)V
    .locals 2

    sget-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Landroid/util/SparseArray;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    :cond_0
    sget-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_2
    #v1=(Uninit);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    #v1=(Reference);
    invoke-virtual {v1, p0, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0
.end method

.method public static b(ILandroid/os/Handler;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    sget-object v0, Lcom/baidu/platform/comjni/engine/a;->a:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

*/}
