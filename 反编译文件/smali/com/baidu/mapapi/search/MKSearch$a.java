package com.baidu.mapapi.search; class MKSearch$a {/*

.class Lcom/baidu/mapapi/search/MKSearch$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/platform/comapi/b/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/mapapi/search/MKSearch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/search/MKSearch;


# direct methods
.method private constructor <init>(Lcom/baidu/mapapi/search/MKSearch;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/baidu/mapapi/search/MKSearch;Lcom/baidu/mapapi/search/MKSearch$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/search/MKSearch$a;-><init>(Lcom/baidu/mapapi/search/MKSearch;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    sparse-switch p1, :sswitch_data_0

    :goto_1
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v2, p1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetWalkingRouteResult(Lcom/baidu/mapapi/search/MKWalkingRouteResult;I)V

    goto :goto_0

    :sswitch_0
    #v0=(Boolean);
    const/4 p1, 0x2

    #p1=(PosByte);
    goto :goto_1

    :sswitch_1
    #p1=(Integer);
    const/16 p1, 0x64

    #p1=(PosByte);
    goto :goto_1

    :pswitch_2
    #v0=(Integer);p1=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v2, p1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetTransitRouteResult(Lcom/baidu/mapapi/search/MKTransitRouteResult;I)V

    goto :goto_0

    :pswitch_3
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v2, p1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetTransitRouteResult(Lcom/baidu/mapapi/search/MKTransitRouteResult;I)V

    goto :goto_0

    :pswitch_4
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v2, p1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetBusDetailResult(Lcom/baidu/mapapi/search/MKBusLineResult;I)V

    goto :goto_0

    :pswitch_5
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v2, p1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetAddrResult(Lcom/baidu/mapapi/search/MKAddrInfo;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v2, p1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetAddrResult(Lcom/baidu/mapapi/search/MKAddrInfo;I)V

    goto :goto_0

    :pswitch_6
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/4 v1, 0x1

    #v1=(One);
    invoke-interface {v0, v2, v1, p1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :pswitch_7
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v2, p1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetSuggestionResult(Lcom/baidu/mapapi/search/MKSuggestionResult;I)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
        0x8 -> :sswitch_0
        0xb -> :sswitch_1
        0xc -> :sswitch_1
        0xd -> :sswitch_1
        0xe -> :sswitch_1
        0x194 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public a(Ljava/lang/String;)V
    .locals 7

    const/16 v6, 0x2d

    #v6=(PosByte);
    const/16 v5, 0x15

    #v5=(PosByte);
    const/16 v4, 0xb

    #v4=(PosByte);
    const/16 v3, 0x64

    #v3=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    new-instance v0, Lcom/baidu/mapapi/search/MKAddrInfo;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKAddrInfo;-><init>()V

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->b(Ljava/lang/String;Lcom/baidu/mapapi/search/MKAddrInfo;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetAddrResult(Lcom/baidu/mapapi/search/MKAddrInfo;I)V

    goto :goto_0

    :cond_2
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetAddrResult(Lcom/baidu/mapapi/search/MKAddrInfo;I)V

    goto :goto_0

    :pswitch_2
    #v0=(Integer);v1=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/search/MKPoiResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKPoiResult;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->b(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v1

    #v1=(Integer);
    invoke-static {p1, v0, v1}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPoiResult;I)Z

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v4, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v4, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :pswitch_3
    #v0=(Integer);v1=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/search/MKPoiResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKPoiResult;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->b(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v1

    #v1=(Integer);
    invoke-static {p1, v0, v1}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPoiResult;I)Z

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v5, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v5, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :pswitch_4
    #v0=(Integer);v1=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/search/MKPoiResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKPoiResult;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->b(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v1

    #v1=(Integer);
    invoke-static {p1, v0, v1}, Lcom/baidu/mapapi/search/c;->b(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPoiResult;I)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v6, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto/16 :goto_0

    :cond_5
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v6, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public b(Ljava/lang/String;)V
    .locals 6

    const/16 v5, 0x64

    #v5=(PosByte);
    const/16 v4, 0x2d

    #v4=(PosByte);
    const/4 v3, 0x7

    #v3=(PosByte);
    const/4 v2, 0x4

    #v2=(PosByte);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance v0, Lcom/baidu/mapapi/search/MKPoiResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKPoiResult;-><init>()V

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPoiResult;)Z

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v3, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v3, v5}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :pswitch_1
    #v0=(Integer);v1=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/search/MKPoiResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKPoiResult;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->b(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v1

    #v1=(Integer);
    invoke-static {p1, v0, v1}, Lcom/baidu/mapapi/search/c;->b(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPoiResult;I)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v4, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :cond_3
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v4, v5}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiResult(Lcom/baidu/mapapi/search/MKPoiResult;II)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/lang/String;)V
    .locals 5

    const/16 v4, 0x64

    #v4=(PosByte);
    const/4 v3, 0x4

    #v3=(PosByte);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/search/MKRouteAddrResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKRouteAddrResult;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v1

    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance v1, Lcom/baidu/mapapi/search/MKWalkingRouteResult;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;-><init>()V

    #v1=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKRouteAddrResult;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->a(Lcom/baidu/mapapi/search/MKRouteAddrResult;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v1, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetWalkingRouteResult(Lcom/baidu/mapapi/search/MKWalkingRouteResult;I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v1, v4}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetWalkingRouteResult(Lcom/baidu/mapapi/search/MKWalkingRouteResult;I)V

    goto :goto_0

    :pswitch_1
    #v1=(Integer);v2=(Uninit);
    new-instance v1, Lcom/baidu/mapapi/search/MKDrivingRouteResult;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;-><init>()V

    #v1=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKRouteAddrResult;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;->a(Lcom/baidu/mapapi/search/MKRouteAddrResult;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v1, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetDrivingRouteResult(Lcom/baidu/mapapi/search/MKDrivingRouteResult;I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v1, v4}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetDrivingRouteResult(Lcom/baidu/mapapi/search/MKDrivingRouteResult;I)V

    goto :goto_0

    :pswitch_2
    #v1=(Integer);v2=(Uninit);
    new-instance v1, Lcom/baidu/mapapi/search/MKTransitRouteResult;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/search/MKTransitRouteResult;-><init>()V

    #v1=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKRouteAddrResult;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_4

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/search/MKTransitRouteResult;->a(Lcom/baidu/mapapi/search/MKRouteAddrResult;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v1, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetTransitRouteResult(Lcom/baidu/mapapi/search/MKTransitRouteResult;I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v0, v1, v4}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetTransitRouteResult(Lcom/baidu/mapapi/search/MKTransitRouteResult;I)V

    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 4

    const/16 v3, 0x34

    #v3=(PosByte);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {}, Lcom/baidu/mapapi/search/PlaceCaterActivity;->isShow()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_2

    new-instance v0, Lcom/baidu/mapapi/search/e;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/e;-><init>()V

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/e;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->c(Lcom/baidu/mapapi/search/MKSearch;)Lcom/baidu/mapapi/BMapManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapapi/BMapManager;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/baidu/mapapi/search/PlaceCaterActivity;

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    #v0=(Reference);
    const-string v1, "result"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x1000

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->c(Lcom/baidu/mapapi/search/MKSearch;)Lcom/baidu/mapapi/BMapManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapapi/BMapManager;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-interface {v0, v3, v1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiDetailSearchResult(II)V

    :cond_2
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->d(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v1

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;I)I

    goto :goto_0

    :cond_3
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/16 v1, 0x64

    #v1=(PosByte);
    invoke-interface {v0, v3, v1}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetPoiDetailSearchResult(II)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public g(Ljava/lang/String;)V
    .locals 4

    const/4 v2, -0x1

    #v2=(Byte);
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Byte);v3=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/search/MKShareUrlResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKShareUrlResult;-><init>()V

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKShareUrlResult;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v1

    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    :goto_1
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    iget v2, v0, Lcom/baidu/mapapi/search/MKShareUrlResult;->type:I

    #v2=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-interface {v1, v0, v2, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetShareUrlResult(Lcom/baidu/mapapi/search/MKShareUrlResult;II)V

    goto :goto_0

    :pswitch_0
    #v1=(Integer);v2=(Byte);v3=(Uninit);
    const/16 v1, 0x12

    #v1=(PosByte);
    iput v1, v0, Lcom/baidu/mapapi/search/MKShareUrlResult;->type:I

    goto :goto_1

    :pswitch_1
    #v1=(Integer);
    const/16 v1, 0x11

    #v1=(PosByte);
    iput v1, v0, Lcom/baidu/mapapi/search/MKShareUrlResult;->type:I

    goto :goto_1

    :cond_2
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v2, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetShareUrlResult(Lcom/baidu/mapapi/search/MKShareUrlResult;II)V

    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    new-instance v1, Lcom/baidu/mapapi/search/MKDrivingRouteResult;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/search/MKDrivingRouteResult;-><init>()V

    :try_start_0
    #v1=(Reference);
    invoke-static {p1, v1}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKDrivingRouteResult;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-interface {v0, v1, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetDrivingRouteResult(Lcom/baidu/mapapi/search/MKDrivingRouteResult;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_2
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/16 v2, 0x64

    #v2=(PosByte);
    invoke-interface {v0, v1, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetDrivingRouteResult(Lcom/baidu/mapapi/search/MKDrivingRouteResult;I)V

    goto :goto_0
.end method

.method public i(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/baidu/mapapi/search/MKSearch;->a()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "onGetFootRouteResult: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v2=(Reference);
    new-instance v1, Lcom/baidu/mapapi/search/MKWalkingRouteResult;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/search/MKWalkingRouteResult;-><init>()V

    :try_start_0
    #v1=(Reference);
    invoke-static {p1, v1}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKWalkingRouteResult;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-interface {v0, v1, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetWalkingRouteResult(Lcom/baidu/mapapi/search/MKWalkingRouteResult;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Reference);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_2
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/16 v2, 0x64

    #v2=(PosByte);
    invoke-interface {v0, v1, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetWalkingRouteResult(Lcom/baidu/mapapi/search/MKWalkingRouteResult;I)V

    goto :goto_0
.end method

.method public j(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    new-instance v1, Lcom/baidu/mapapi/search/MKTransitRouteResult;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/search/MKTransitRouteResult;-><init>()V

    :try_start_0
    #v1=(Reference);
    invoke-static {p1, v1}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKTransitRouteResult;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-interface {v0, v1, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetTransitRouteResult(Lcom/baidu/mapapi/search/MKTransitRouteResult;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_2
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/16 v2, 0x64

    #v2=(PosByte);
    invoke-interface {v0, v1, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetTransitRouteResult(Lcom/baidu/mapapi/search/MKTransitRouteResult;I)V

    goto :goto_0
.end method

.method public k(Ljava/lang/String;)V
    .locals 4

    const/16 v3, 0x64

    #v3=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance v0, Lcom/baidu/mapapi/search/MKAddrInfo;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKAddrInfo;-><init>()V

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->b(Ljava/lang/String;Lcom/baidu/mapapi/search/MKAddrInfo;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetAddrResult(Lcom/baidu/mapapi/search/MKAddrInfo;I)V

    goto :goto_0

    :pswitch_1
    #v0=(Integer);v1=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/search/MKAddrInfo;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKAddrInfo;-><init>()V

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKAddrInfo;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetAddrResult(Lcom/baidu/mapapi/search/MKAddrInfo;I)V

    goto :goto_0

    :cond_2
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetAddrResult(Lcom/baidu/mapapi/search/MKAddrInfo;I)V

    goto :goto_0

    :cond_3
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    invoke-interface {v1, v0, v3}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetAddrResult(Lcom/baidu/mapapi/search/MKAddrInfo;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public l(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/search/MKBusLineResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKBusLineResult;-><init>()V

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKBusLineResult;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-interface {v1, v0, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetBusDetailResult(Lcom/baidu/mapapi/search/MKBusLineResult;I)V

    goto :goto_0

    :cond_2
    #v1=(Boolean);v2=(Uninit);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/16 v2, 0x64

    #v2=(PosByte);
    invoke-interface {v1, v0, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetBusDetailResult(Lcom/baidu/mapapi/search/MKBusLineResult;I)V

    goto :goto_0
.end method

.method public m(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/mapapi/search/MKSearch;)I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance v0, Lcom/baidu/mapapi/search/MKSuggestionResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/search/MKSuggestionResult;-><init>()V

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Lcom/baidu/mapapi/search/MKSuggestionResult;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-interface {v1, v0, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetSuggestionResult(Lcom/baidu/mapapi/search/MKSuggestionResult;I)V

    goto :goto_0

    :cond_2
    #v1=(Boolean);v2=(Uninit);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch$a;->a:Lcom/baidu/mapapi/search/MKSearch;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    const/16 v2, 0x64

    #v2=(PosByte);
    invoke-interface {v1, v0, v2}, Lcom/baidu/mapapi/search/MKSearchListener;->onGetSuggestionResult(Lcom/baidu/mapapi/search/MKSuggestionResult;I)V

    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

*/}
