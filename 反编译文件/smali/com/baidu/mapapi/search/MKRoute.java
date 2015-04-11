package com.baidu.mapapi.search; class MKRoute {/*

.class public Lcom/baidu/mapapi/search/MKRoute;
.super Ljava/lang/Object;


# static fields
.field public static final ROUTE_TYPE_BUS_LINE:I = 0x3

.field public static final ROUTE_TYPE_DRIVING:I = 0x1

.field public static final ROUTE_TYPE_UNKNOW:I = 0x0

.field public static final ROUTE_TYPE_WALKING:I = 0x2


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;>;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field private g:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKStep;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/String;


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

    iput p1, p0, Lcom/baidu/mapapi/search/MKRoute;->c:I

    return-void
.end method

.method a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKRoute;->f:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x0

    #v1=(Null);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    #v4=(Reference);
    move v0, v1

    #v0=(Null);
    move v2, v1

    :goto_0
    #v0=(Integer);v2=(Boolean);v5=(Conflicted);v6=(Conflicted);
    array-length v5, v4

    #v5=(Integer);
    if-ge v0, v5, :cond_3

    aget-char v5, v4, v0

    #v5=(Char);
    const/16 v6, 0x3c

    #v6=(PosByte);
    if-ne v5, v6, :cond_1

    const/4 v2, 0x1

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    aget-char v5, v4, v0

    const/16 v6, 0x3e

    if-ne v5, v6, :cond_2

    move v2, v1

    #v2=(Null);
    goto :goto_1

    :cond_2
    #v2=(Boolean);
    if-nez v2, :cond_0

    aget-char v5, v4, v0

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    #v5=(Integer);v6=(Conflicted);
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->j:Ljava/lang/String;

    return-void
.end method

.method a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKStep;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    return-void
.end method

.method b(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKRoute;->b:I

    return-void
.end method

.method b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKRoute;->g:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    return-void
.end method

.method b(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKRoute;->h:Ljava/util/ArrayList;

    return-void
.end method

.method c(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKRoute;->e:I

    return-void
.end method

.method public customizeRoute(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;[Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    check-cast v0, [[Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [[Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    aput-object p3, v0, v1

    invoke-virtual {p0, p1, p2, v0}, Lcom/baidu/mapapi/search/MKRoute;->customizeRoute(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;[[Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    goto :goto_0
.end method

.method public customizeRoute(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;[[Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 15

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
    if-eqz p1, :cond_2

    move-object/from16 v0, p1

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->f:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :cond_2
    #v0=(Conflicted);
    if-eqz p2, :cond_3

    move-object/from16 v0, p2

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->g:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :cond_3
    #v0=(Conflicted);
    const/4 v1, 0x3

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/mapapi/search/MKRoute;->e:I

    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    const/4 v3, 0x0

    #v3=(Null);
    if-eqz p3, :cond_0

    move-object/from16 v0, p3

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    if-lez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_1
    #v1=(Integer);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-object/from16 v0, p3

    array-length v2, v0

    #v2=(Integer);
    if-ge v1, v2, :cond_7

    aget-object v6, p3, v1

    #v6=(Null);
    if-nez v6, :cond_4

    :goto_2
    #v2=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    #v2=(Integer);
    new-instance v7, Ljava/util/ArrayList;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    #v7=(Reference);
    const/4 v2, 0x0

    :goto_3
    array-length v8, v6

    #v8=(Integer);
    if-ge v2, v8, :cond_6

    aget-object v8, v6, v2

    #v8=(Null);
    if-nez v8, :cond_5

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    aget-object v8, v6, v2

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    #v8=(Integer);
    iget-object v2, p0, Lcom/baidu/mapapi/search/MKRoute;->h:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    #v2=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    const/4 v1, 0x0

    #v1=(Null);
    move v7, v1

    :goto_5
    #v1=(Integer);v2=(Conflicted);v3=(Reference);v7=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->h:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v7, v1, :cond_b

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->h:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    #v2=(Reference);
    check-cast v2, Ljava/util/ArrayList;

    new-instance v8, Ljava/util/ArrayList;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    #v8=(Reference);
    new-instance v9, Lcom/baidu/mapapi/search/MKStep;

    #v9=(UninitRef);
    invoke-direct {v9}, Lcom/baidu/mapapi/search/MKStep;-><init>()V

    #v9=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    move-object v12, v3

    #v12=(Reference);
    move v3, v1

    #v3=(Null);
    move-wide v13, v4

    #v13=(LongLo);v14=(LongHi);
    move-wide v5, v13

    #v5=(LongLo);v6=(LongHi);
    move-object v4, v12

    :goto_6
    #v1=(Reference);v3=(Integer);v4=(Reference);v12=(Conflicted);v13=(Conflicted);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v3, v1, :cond_a

    if-nez v7, :cond_8

    if-nez v3, :cond_8

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v10, 0x1

    #v10=(One);
    if-le v1, v10, :cond_8

    new-instance v10, Lcom/baidu/mapapi/search/MKStep;

    #v10=(UninitRef);
    invoke-direct {v10}, Lcom/baidu/mapapi/search/MKStep;-><init>()V

    #v10=(Reference);
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v10, v1}, Lcom/baidu/mapapi/search/MKStep;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v10, v1}, Lcom/baidu/mapapi/search/MKStep;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    #v1=(Conflicted);v10=(Conflicted);
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v4, :cond_c

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1, v4}, Lcom/baidu/mapapi/utils/DistanceUtil;->getDistance(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;)D

    move-result-wide v10

    #v10=(DoubleLo);v11=(DoubleHi);
    add-double v4, v5, v10

    :goto_7
    #v4=(LongLo);v5=(LongHi);v10=(Conflicted);v11=(Conflicted);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    if-ne v3, v1, :cond_9

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v9, v1}, Lcom/baidu/mapapi/search/MKStep;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v9, v1}, Lcom/baidu/mapapi/search/MKStep;->a(Ljava/lang/String;)V

    :cond_9
    #v1=(Conflicted);
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    add-int/lit8 v3, v3, 0x1

    move-wide v12, v4

    #v12=(LongLo);v13=(LongHi);
    move-wide v5, v12

    #v5=(LongLo);
    move-object v4, v1

    #v4=(Reference);
    goto :goto_6

    :cond_a
    #v1=(Integer);v12=(Conflicted);v13=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v7, 0x1

    #v1=(Integer);
    move v7, v1

    move-object v3, v4

    #v3=(Reference);
    move-wide v12, v5

    #v12=(LongLo);v13=(LongHi);
    move-wide v4, v12

    #v4=(LongLo);v5=(LongHi);
    goto/16 :goto_5

    :cond_b
    #v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    double-to-int v1, v4

    iput v1, p0, Lcom/baidu/mapapi/search/MKRoute;->c:I

    goto/16 :goto_0

    :cond_c
    #v1=(Reference);v2=(Reference);v3=(Integer);v4=(Reference);v5=(LongLo);v6=(LongHi);v8=(Reference);v9=(Reference);v14=(LongHi);
    move-wide v4, v5

    #v4=(LongLo);v5=(LongHi);
    goto :goto_7
.end method

.method d(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKRoute;->d:I

    return-void
.end method

.method public getArrayPoints()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/basestruct/GeoPoint;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->h:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    iget v0, p0, Lcom/baidu/mapapi/search/MKRoute;->e:I

    const/4 v1, 0x1

    #v1=(One);
    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    #v1=(Reference);v2=(Conflicted);v3=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/search/MKStep;

    invoke-virtual {v0}, Lcom/baidu/mapapi/search/MKStep;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/baidu/mapapi/search/MKRoute;->h:Ljava/util/ArrayList;

    #v2=(Reference);
    iget-object v3, p0, Lcom/baidu/mapapi/search/MKRoute;->a:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-static {v0, v2, v3}, Lcom/baidu/mapapi/search/c;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->h:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method public getDistance()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKRoute;->c:I

    #v0=(Integer);
    return v0
.end method

.method public getEnd()Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->g:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    return-object v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKRoute;->b:I

    #v0=(Integer);
    return v0
.end method

.method public getNumSteps()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

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

.method public getRouteType()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKRoute;->e:I

    #v0=(Integer);
    return v0
.end method

.method public getStart()Lcom/baidu/platform/comapi/basestruct/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->f:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    return-object v0
.end method

.method public getStep(I)Lcom/baidu/mapapi/search/MKStep;
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-ltz p1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

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
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->i:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/MKStep;

    goto :goto_0
.end method

.method public getTime()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKRoute;->d:I

    #v0=(Integer);
    return v0
.end method

.method public getTip()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKRoute;->j:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

*/}
