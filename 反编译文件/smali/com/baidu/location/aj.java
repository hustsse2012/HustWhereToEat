package com.baidu.location; class aj {/*

.class Lcom/baidu/location/aj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/k;
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# instance fields
.field private gd:J

.field private ge:Landroid/location/Location;

.field private gf:Ljava/util/Queue;

.field private gg:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v2, p0, Lcom/baidu/location/aj;->gg:Ljava/util/List;

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/aj;->gd:J

    new-instance v0, Ljava/util/LinkedList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    iput-object v2, p0, Lcom/baidu/location/aj;->ge:Landroid/location/Location;

    return-void
.end method


# virtual methods
.method public bh()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/aj;->gg:Ljava/util/List;

    iput-object v0, p0, Lcom/baidu/location/aj;->ge:Landroid/location/Location;

    iget-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    return-void
.end method

.method public do(Lcom/baidu/location/ai$b;)Z
    .locals 12

    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    #v2=(Null);
    if-nez p1, :cond_0

    move v0, v2

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v3=(Byte);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v3=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    iget-object v6, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v6=(Reference);
    iget-object v7, p0, Lcom/baidu/location/aj;->gg:Ljava/util/List;

    #v7=(Reference);
    if-ne v6, v7, :cond_1

    move v0, v3

    #v0=(One);
    goto :goto_0

    :cond_1
    #v0=(Uninit);
    if-eqz v6, :cond_2

    if-nez v7, :cond_3

    :cond_2
    iput-object v6, p0, Lcom/baidu/location/aj;->gg:Ljava/util/List;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/aj;->gd:J

    move v0, v2

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(Uninit);v1=(Uninit);
    new-instance v8, Ljava/util/LinkedList;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V

    #v8=(Reference);
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    #v9=(Integer);
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    #v10=(Integer);
    if-nez v9, :cond_4

    if-nez v10, :cond_4

    move v0, v3

    #v0=(One);
    goto :goto_0

    :cond_4
    #v0=(Uninit);
    if-eqz v9, :cond_5

    if-nez v10, :cond_6

    :cond_5
    move v0, v2

    #v0=(Null);
    goto :goto_0

    :cond_6
    #v0=(Uninit);
    move v5, v2

    #v5=(Null);
    move v1, v2

    :goto_1
    #v0=(Conflicted);v1=(Integer);v4=(Conflicted);v5=(Integer);v11=(Conflicted);
    if-ge v5, v9, :cond_a

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v11, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    #v11=(Reference);
    if-nez v11, :cond_8

    move v0, v1

    :cond_7
    :goto_2
    #v0=(Integer);v1=(Conflicted);
    add-int/lit8 v1, v5, 0x1

    #v1=(Integer);
    move v5, v1

    move v1, v0

    goto :goto_1

    :cond_8
    #v0=(Reference);
    move v4, v2

    :goto_3
    #v0=(Conflicted);v4=(Integer);
    if-ge v4, v10, :cond_d

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_9

    add-int/lit8 v0, v1, 0x1

    :goto_4
    #v0=(Integer);
    if-ne v4, v10, :cond_7

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    #v0=(Boolean);v1=(Integer);
    add-int/lit8 v0, v4, 0x1

    #v0=(Integer);
    move v4, v0

    goto :goto_3

    :cond_a
    #v0=(Conflicted);v4=(Conflicted);v11=(Conflicted);
    int-to-float v0, v1

    #v0=(Float);
    int-to-float v1, v9

    #v1=(Float);
    sget v4, Lcom/baidu/location/b;->aN:F

    #v4=(Integer);
    mul-float/2addr v1, v4

    cmpl-float v0, v0, v1

    #v0=(Byte);
    if-ltz v0, :cond_b

    move v0, v3

    #v0=(One);
    goto :goto_0

    :cond_b
    #v0=(Byte);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v3, p0, Lcom/baidu/location/aj;->gd:J

    #v3=(LongLo);v4=(LongHi);
    sub-long v3, v0, v3

    sget v5, Lcom/baidu/location/b;->aP:I

    int-to-long v9, v5

    #v9=(LongLo);v10=(LongHi);
    cmp-long v3, v3, v9

    #v3=(Byte);
    if-lez v3, :cond_c

    iput-object v6, p0, Lcom/baidu/location/aj;->gg:Ljava/util/List;

    iput-wide v0, p0, Lcom/baidu/location/aj;->gd:J

    :goto_5
    #v0=(Conflicted);
    move v0, v2

    #v0=(Null);
    goto/16 :goto_0

    :cond_c
    #v0=(LongLo);
    iget-object v0, p0, Lcom/baidu/location/aj;->gg:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_5

    :cond_d
    #v0=(Conflicted);v1=(Integer);v3=(One);v4=(Integer);v9=(Integer);v10=(Integer);v11=(Reference);
    move v0, v1

    #v0=(Integer);
    goto :goto_4
.end method

.method public new(Lcom/baidu/location/BDLocation;)I
    .locals 12

    const/4 v1, 0x2

    #v1=(PosByte);
    const/4 v2, 0x1

    #v2=(One);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    new-instance v7, Landroid/location/Location;

    #v7=(UninitRef);
    const-string v0, "gps"

    #v0=(Reference);
    invoke-direct {v7, v0}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    new-instance v5, Landroid/location/Location;

    #v5=(UninitRef);
    const-string v0, "gps"

    invoke-direct {v5, v0}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    :try_start_0
    #v5=(Reference);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    const/16 v6, 0xa1

    #v6=(PosShort);
    if-ne v0, v6, :cond_4

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getRadius()F

    move-result v0

    #v0=(Float);
    const/high16 v6, 0x4396

    #v6=(Integer);
    cmpl-float v0, v0, v6

    #v0=(Byte);
    if-lez v0, :cond_1

    invoke-virtual {p0}, Lcom/baidu/location/aj;->bh()V

    move v0, v2

    :cond_0
    :goto_0
    #v0=(PosByte);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return v0

    :cond_1
    #v0=(Byte);v1=(PosByte);v5=(Reference);v6=(Integer);v7=(Reference);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v8

    #v8=(DoubleLo);v9=(DoubleHi);
    invoke-virtual {v5, v8, v9}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Landroid/location/Location;->setLongitude(D)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    #v8=(LongLo);v9=(LongHi);
    invoke-virtual {v5, v8, v9}, Landroid/location/Location;->setTime(J)V

    iget-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_2

    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    move-result-wide v8

    iget-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v10

    #v10=(LongLo);v11=(LongHi);
    sub-long/2addr v8, v10

    sget v0, Lcom/baidu/location/b;->aH:I

    #v0=(Integer);
    int-to-long v10, v0

    cmp-long v0, v8, v10

    #v0=(Byte);
    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    :cond_2
    #v0=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    #v0=(Reference);
    invoke-interface {v0, v5}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v8

    #v8=(Reference);
    move-wide v5, v3

    :goto_1
    #v5=(LongLo);v6=(LongHi);v9=(Conflicted);
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v9

    #v9=(DoubleLo);v10=(DoubleHi);
    add-double/2addr v5, v9

    #v5=(DoubleLo);v6=(DoubleHi);
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v9

    add-double/2addr v3, v9

    #v3=(DoubleLo);v4=(DoubleHi);
    goto :goto_1

    :cond_3
    #v0=(Boolean);v3=(LongLo);v4=(LongHi);v5=(LongLo);v6=(LongHi);v9=(Conflicted);v10=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    #v0=(Integer);
    int-to-double v8, v0

    #v8=(DoubleLo);v9=(DoubleHi);
    div-double/2addr v5, v8

    #v5=(DoubleLo);v6=(DoubleHi);
    iget-object v0, p0, Lcom/baidu/location/aj;->gf:Ljava/util/Queue;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    #v0=(Integer);
    int-to-double v8, v0

    div-double/2addr v3, v8

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-virtual {v7, v5, v6}, Landroid/location/Location;->setLongitude(D)V

    invoke-virtual {v7, v3, v4}, Landroid/location/Location;->setLatitude(D)V

    iget-object v0, p0, Lcom/baidu/location/aj;->ge:Landroid/location/Location;

    #v0=(Reference);
    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/location/aj;->ge:Landroid/location/Location;

    invoke-virtual {v7, v0}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    #v0=(Float);
    sget v7, Lcom/baidu/location/b;->aU:F

    #v7=(Integer);
    cmpg-float v0, v0, v7

    #v0=(Byte);
    if-gez v0, :cond_5

    const/4 v0, 0x3

    :goto_2
    #v0=(PosByte);v7=(Conflicted);
    if-ne v0, v1, :cond_0

    new-instance v1, Landroid/location/Location;

    #v1=(UninitRef);
    const-string v7, "gps"

    #v7=(Reference);
    invoke-direct {v1, v7}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/location/aj;->ge:Landroid/location/Location;

    iget-object v1, p0, Lcom/baidu/location/aj;->ge:Landroid/location/Location;

    invoke-virtual {v1, v5, v6}, Landroid/location/Location;->setLongitude(D)V

    iget-object v1, p0, Lcom/baidu/location/aj;->ge:Landroid/location/Location;

    invoke-virtual {v1, v3, v4}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {p1, v3, v4}, Lcom/baidu/location/BDLocation;->setLatitude(D)V

    invoke-virtual {p1, v5, v6}, Lcom/baidu/location/BDLocation;->setLongitude(D)V

    goto/16 :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v3=(LongLo);v4=(LongHi);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move v0, v2

    #v0=(One);
    goto/16 :goto_0

    :cond_4
    #v0=(Integer);v1=(PosByte);v5=(Reference);v6=(PosShort);v7=(Reference);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    invoke-virtual {p0}, Lcom/baidu/location/aj;->bh()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    #v0=(PosByte);
    goto/16 :goto_0

    :cond_5
    #v0=(Conflicted);v3=(DoubleLo);v4=(DoubleHi);v5=(DoubleLo);v6=(DoubleHi);v7=(Conflicted);v8=(DoubleLo);v9=(DoubleHi);v10=(Conflicted);v11=(Conflicted);
    move v0, v1

    #v0=(PosByte);
    goto :goto_2
.end method

*/}
