package com.baidu.mapapi.map; class MKOfflineMap {/*

.class public Lcom/baidu/mapapi/map/MKOfflineMap;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/map/MKOfflineMap$a;
    }
.end annotation


# static fields
.field public static final TYPE_DOWNLOAD_UPDATE:I = 0x0

.field public static final TYPE_NEW_OFFLINE:I = 0x6

.field public static final TYPE_VER_UPDATE:I = 0x4


# instance fields
.field private a:Lcom/baidu/platform/comapi/map/h;

.field private b:Lcom/baidu/mapapi/map/a;

.field private c:Lcom/baidu/mapapi/map/MKOfflineMap$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    iput-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->b:Lcom/baidu/mapapi/map/a;

    iput-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->c:Lcom/baidu/mapapi/map/MKOfflineMap$a;

    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/MKOfflineMap;)Lcom/baidu/mapapi/map/a;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->b:Lcom/baidu/mapapi/map/a;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/h;->d(I)Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/h;->b(Lcom/baidu/platform/comapi/map/l;)V

    invoke-static {}, Lcom/baidu/platform/comapi/map/h;->a()V

    return-void
.end method

.method public getAllUpdateInfo()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/MKOLUpdateElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/h;->d()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/k;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/k;->a()Lcom/baidu/platform/comapi/map/j;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/mapapi/utils/i;->a(Lcom/baidu/platform/comapi/map/j;)Lcom/baidu/mapapi/map/MKOLUpdateElement;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    #v0=(Boolean);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0
.end method

.method public getHotCityList()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/MKOLSearchRecord;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/h;->b()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/g;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/i;->a(Lcom/baidu/platform/comapi/map/g;)Lcom/baidu/mapapi/map/MKOLSearchRecord;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    #v0=(Boolean);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0
.end method

.method public getOfflineCityList()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/MKOLSearchRecord;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/h;->c()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/g;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/i;->a(Lcom/baidu/platform/comapi/map/g;)Lcom/baidu/mapapi/map/MKOLSearchRecord;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    #v0=(Boolean);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0
.end method

.method public getUpdateInfo(I)Lcom/baidu/mapapi/map/MKOLUpdateElement;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/h;->f(I)Lcom/baidu/platform/comapi/map/k;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/k;->a()Lcom/baidu/platform/comapi/map/j;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/mapapi/utils/i;->a(Lcom/baidu/platform/comapi/map/j;)Lcom/baidu/mapapi/map/MKOLUpdateElement;

    move-result-object v0

    goto :goto_0
.end method

.method public init(Lcom/baidu/mapapi/map/MapController;Lcom/baidu/mapapi/map/MKOfflineMapListener;)Z
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);
    iget-object v1, p1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/platform/comapi/map/h;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/h;

    move-result-object v1

    iput-object v1, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/baidu/mapapi/map/MKOfflineMap$a;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/baidu/mapapi/map/MKOfflineMap$a;-><init>(Lcom/baidu/mapapi/map/MKOfflineMap;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->c:Lcom/baidu/mapapi/map/MKOfflineMap$a;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    iget-object v2, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->c:Lcom/baidu/mapapi/map/MKOfflineMap$a;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/baidu/platform/comapi/map/h;->a(Lcom/baidu/platform/comapi/map/l;)V

    new-instance v1, Lcom/baidu/mapapi/map/a;

    #v1=(UninitRef);
    invoke-direct {v1, p2}, Lcom/baidu/mapapi/map/a;-><init>(Lcom/baidu/mapapi/map/MKOfflineMapListener;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->b:Lcom/baidu/mapapi/map/a;

    iget-object v1, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->c:Lcom/baidu/mapapi/map/MKOfflineMap$a;

    const/4 v2, 0x4

    #v2=(PosByte);
    invoke-virtual {v1, v2, v0}, Lcom/baidu/mapapi/map/MKOfflineMap$a;->a(II)V

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public pause(I)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/h;->c(I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public remove(I)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/h;->e(I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public scan()I
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Lcom/baidu/mapapi/map/MKOfflineMap;->scan(Z)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public scan(Z)I
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/h;->d()Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    move v1, v0

    :goto_0
    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v2=(Reference);
    invoke-virtual {v2, p1}, Lcom/baidu/platform/comapi/map/h;->a(Z)Z

    iget-object v2, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/map/h;->d()Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_0
    sub-int/2addr v0, v1

    return v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Uninit);
    move v1, v0

    #v1=(Null);
    goto :goto_0
.end method

.method public searchCity(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/map/MKOLSearchRecord;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/h;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/g;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/i;->a(Lcom/baidu/platform/comapi/map/g;)Lcom/baidu/mapapi/map/MKOLSearchRecord;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    #v0=(Boolean);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0
.end method

.method public start(I)Z
    .locals 4

    const/4 v1, 0x0

    #v1=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/h;->d()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/h;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    #v2=(Reference);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/k;

    iget-object v3, v0, Lcom/baidu/platform/comapi/map/k;->a:Lcom/baidu/platform/comapi/map/j;

    #v3=(Reference);
    iget v3, v3, Lcom/baidu/platform/comapi/map/j;->a:I

    #v3=(Integer);
    if-ne v3, p1, :cond_1

    iget-object v2, v0, Lcom/baidu/platform/comapi/map/k;->a:Lcom/baidu/platform/comapi/map/j;

    iget-boolean v2, v2, Lcom/baidu/platform/comapi/map/j;->j:Z

    #v2=(Boolean);
    if-nez v2, :cond_2

    iget-object v2, v0, Lcom/baidu/platform/comapi/map/k;->a:Lcom/baidu/platform/comapi/map/j;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/j;->l:I

    #v2=(Integer);
    const/4 v3, 0x2

    #v3=(PosByte);
    if-eq v2, v3, :cond_2

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/k;->a:Lcom/baidu/platform/comapi/map/j;

    iget v0, v0, Lcom/baidu/platform/comapi/map/j;->l:I

    #v0=(Integer);
    const/4 v2, 0x3

    #v2=(PosByte);
    if-ne v0, v2, :cond_3

    :cond_2
    #v0=(Conflicted);v2=(Integer);v3=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/h;->b(I)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    :cond_3
    #v0=(Integer);v2=(PosByte);v3=(PosByte);
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap;->a:Lcom/baidu/platform/comapi/map/h;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/map/h;->a(I)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

*/}
