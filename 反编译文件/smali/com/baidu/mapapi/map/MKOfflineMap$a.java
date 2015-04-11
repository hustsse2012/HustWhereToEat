package com.baidu.mapapi.map; class MKOfflineMap$a {/*

.class Lcom/baidu/mapapi/map/MKOfflineMap$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/platform/comapi/map/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/mapapi/map/MKOfflineMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/map/MKOfflineMap;


# direct methods
.method constructor <init>(Lcom/baidu/mapapi/map/MKOfflineMap;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/MKOfflineMap$a;->a:Lcom/baidu/mapapi/map/MKOfflineMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 6

    const/4 v5, 0x0

    #v5=(Null);
    packed-switch p1, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :pswitch_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap$a;->a:Lcom/baidu/mapapi/map/MKOfflineMap;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MKOfflineMap;->a(Lcom/baidu/mapapi/map/MKOfflineMap;)Lcom/baidu/mapapi/map/a;

    move-result-object v0

    new-instance v1, Lcom/baidu/mapapi/map/MKEvent;

    #v1=(UninitRef);
    const/4 v2, 0x6

    #v2=(PosByte);
    invoke-direct {v1, v2, v5, p2}, Lcom/baidu/mapapi/map/MKEvent;-><init>(III)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/a;->a(Lcom/baidu/mapapi/map/MKEvent;)V

    goto :goto_0

    :pswitch_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/MKOfflineMap$a;->a:Lcom/baidu/mapapi/map/MKOfflineMap;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MKOfflineMap;->getAllUpdateInfo()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;

    iget-boolean v2, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->update:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/baidu/mapapi/map/MKOfflineMap$a;->a:Lcom/baidu/mapapi/map/MKOfflineMap;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/mapapi/map/MKOfflineMap;->a(Lcom/baidu/mapapi/map/MKOfflineMap;)Lcom/baidu/mapapi/map/a;

    move-result-object v2

    new-instance v3, Lcom/baidu/mapapi/map/MKEvent;

    #v3=(UninitRef);
    const/4 v4, 0x4

    #v4=(PosByte);
    iget v0, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->cityID:I

    #v0=(Integer);
    invoke-direct {v3, v4, v5, v0}, Lcom/baidu/mapapi/map/MKEvent;-><init>(III)V

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/a;->a(Lcom/baidu/mapapi/map/MKEvent;)V

    goto :goto_1

    :pswitch_3
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    const v0, 0xffff

    #v0=(Char);
    shr-int/lit8 v1, p2, 0x10

    #v1=(Short);
    and-int/2addr v0, v1

    #v0=(Integer);
    iget-object v1, p0, Lcom/baidu/mapapi/map/MKOfflineMap$a;->a:Lcom/baidu/mapapi/map/MKOfflineMap;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MKOfflineMap;->a(Lcom/baidu/mapapi/map/MKOfflineMap;)Lcom/baidu/mapapi/map/a;

    move-result-object v1

    new-instance v2, Lcom/baidu/mapapi/map/MKEvent;

    #v2=(UninitRef);
    invoke-direct {v2, v5, v5, v0}, Lcom/baidu/mapapi/map/MKEvent;-><init>(III)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/a;->a(Lcom/baidu/mapapi/map/MKEvent;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

*/}
