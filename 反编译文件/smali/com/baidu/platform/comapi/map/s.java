package com.baidu.platform.comapi.map; class s {/*

.class public Lcom/baidu/platform/comapi/map/s;
.super Ljava/util/ArrayList;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/ArrayList",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/baidu/platform/comapi/map/q$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/baidu/platform/comapi/map/q$a;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    invoke-interface {v0, p1}, Lcom/baidu/platform/comapi/map/q$a;->a(Ljava/lang/Object;)V

    :cond_1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TE;>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    invoke-interface {v2, v1}, Lcom/baidu/platform/comapi/map/q$a;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    #v1=(Boolean);v2=(Conflicted);
    invoke-super {p0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public clear()V
    .locals 3

    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/s;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    invoke-interface {v2, v1}, Lcom/baidu/platform/comapi/map/q$a;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    #v1=(Boolean);v2=(Conflicted);
    invoke-super {p0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/map/q$a;->b(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    invoke-interface {v0, p1}, Lcom/baidu/platform/comapi/map/q$a;->b(Ljava/lang/Object;)V

    :cond_1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    invoke-interface {v2, v1}, Lcom/baidu/platform/comapi/map/q$a;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    #v1=(Boolean);v2=(Conflicted);
    invoke-super {p0, p1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/s;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    #v2=(Reference);
    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/baidu/platform/comapi/map/s;->a:Lcom/baidu/platform/comapi/map/q$a;

    #v2=(Reference);
    invoke-interface {v2, v1}, Lcom/baidu/platform/comapi/map/q$a;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    #v1=(Boolean);v2=(Conflicted);
    invoke-super {p0, p1}, Ljava/util/ArrayList;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
