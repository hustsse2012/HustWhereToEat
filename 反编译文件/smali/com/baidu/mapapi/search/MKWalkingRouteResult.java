package com.baidu.mapapi.search; class MKWalkingRouteResult {/*

.class public Lcom/baidu/mapapi/search/MKWalkingRouteResult;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/baidu/mapapi/search/MKPlanNode;

.field private b:Lcom/baidu/mapapi/search/MKPlanNode;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKRoutePlan;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/baidu/mapapi/search/MKRouteAddrResult;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method a(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->e:I

    return-void
.end method

.method a(Lcom/baidu/mapapi/search/MKPlanNode;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->a:Lcom/baidu/mapapi/search/MKPlanNode;

    return-void
.end method

.method a(Lcom/baidu/mapapi/search/MKRouteAddrResult;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->d:Lcom/baidu/mapapi/search/MKRouteAddrResult;

    return-void
.end method

.method a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKRoutePlan;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->c:Ljava/util/ArrayList;

    return-void
.end method

.method b(Lcom/baidu/mapapi/search/MKPlanNode;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->b:Lcom/baidu/mapapi/search/MKPlanNode;

    return-void
.end method

.method public getAddrResult()Lcom/baidu/mapapi/search/MKRouteAddrResult;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->d:Lcom/baidu/mapapi/search/MKRouteAddrResult;

    #v0=(Reference);
    return-object v0
.end method

.method public getEnd()Lcom/baidu/mapapi/search/MKPlanNode;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->b:Lcom/baidu/mapapi/search/MKPlanNode;

    #v0=(Reference);
    return-object v0
.end method

.method public getNumPlan()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getPlan(I)Lcom/baidu/mapapi/search/MKRoutePlan;
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->c:Ljava/util/ArrayList;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-ltz p1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    if-le p1, v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->c:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/MKRoutePlan;

    goto :goto_0
.end method

.method public getStart()Lcom/baidu/mapapi/search/MKPlanNode;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->a:Lcom/baidu/mapapi/search/MKPlanNode;

    #v0=(Reference);
    return-object v0
.end method

.method public getTaxiPrice()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKWalkingRouteResult;->e:I

    #v0=(Integer);
    return v0
.end method

*/}
