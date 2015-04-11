package com.baidu.platform.comjni.tools; class BundleKeySet {/*

.class public Lcom/baidu/platform/comjni/tools/BundleKeySet;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getBundleKeys(Landroid/os/Bundle;)[Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-virtual {p1}, Landroid/os/Bundle;->isEmpty()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/os/Bundle;->size()I

    move-result v0

    #v0=(Integer);
    new-array v2, v0, [Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    #v1=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    #v3=(Reference);
    move v1, v0

    :goto_1
    #v0=(Integer);v1=(Integer);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v1

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :cond_2
    #v0=(Boolean);
    move-object v0, v2

    #v0=(Reference);
    goto :goto_0
.end method

*/}
