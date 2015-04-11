package com.baidu.location; class ak {/*

.class Lcom/baidu/location/ak;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/ak$a;
    }
.end annotation


# instance fields
.field public gh:I

.field private gi:I

.field private gj:Ljava/util/List;

.field private gk:D

.field private gl:Ljava/lang/String;

.field private gm:Z

.field private gn:D

.field private go:C

.field private gp:Ljava/lang/String;

.field private gq:Ljava/util/List;

.field private gr:Z

.field private gs:I

.field private gt:Z

.field private gu:I

.field private gv:I

.field private gw:Ljava/lang/String;

.field private gx:Ljava/lang/String;

.field private gy:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-boolean v1, p0, Lcom/baidu/location/ak;->gr:Z

    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/ak;->gp:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/baidu/location/ak;->gy:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/baidu/location/ak;->gl:Ljava/lang/String;

    iput v1, p0, Lcom/baidu/location/ak;->gs:I

    iput v1, p0, Lcom/baidu/location/ak;->gu:I

    const-string v0, ""

    iput-object v0, p0, Lcom/baidu/location/ak;->gw:Ljava/lang/String;

    const/16 v0, 0x4e

    #v0=(PosByte);
    iput-char v0, p0, Lcom/baidu/location/ak;->go:C

    const-string v0, ""

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/ak;->gx:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/baidu/location/ak;->gt:Z

    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Lcom/baidu/location/ak;->gi:I

    iput-wide v2, p0, Lcom/baidu/location/ak;->gn:D

    iput-wide v2, p0, Lcom/baidu/location/ak;->gk:D

    iput-object v4, p0, Lcom/baidu/location/ak;->gj:Ljava/util/List;

    iput-boolean v1, p0, Lcom/baidu/location/ak;->gm:Z

    iput-object v4, p0, Lcom/baidu/location/ak;->gq:Ljava/util/List;

    iput v1, p0, Lcom/baidu/location/ak;->gv:I

    iput v1, p0, Lcom/baidu/location/ak;->gh:I

    iput-object p1, p0, Lcom/baidu/location/ak;->gj:Ljava/util/List;

    iput-object p2, p0, Lcom/baidu/location/ak;->gp:Ljava/lang/String;

    iput-object p3, p0, Lcom/baidu/location/ak;->gw:Ljava/lang/String;

    iput-object p4, p0, Lcom/baidu/location/ak;->gx:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/ak;->gq:Ljava/util/List;

    invoke-direct {p0}, Lcom/baidu/location/ak;->bl()V

    return-void
.end method

.method private bl()V
    .locals 12

    const/4 v3, 0x7

    #v3=(PosByte);
    const/4 v8, 0x2

    #v8=(PosByte);
    const/4 v5, 0x6

    #v5=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    #v6=(Null);
    iget-object v0, p0, Lcom/baidu/location/ak;->gp:Ljava/lang/String;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/baidu/location/ak;->j(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/ak;->gp:Ljava/lang/String;

    #v0=(Reference);
    const-string v1, ","

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    #v1=(Integer);
    const/16 v2, 0xf

    #v2=(PosByte);
    if-eq v1, v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Integer);v7=(Boolean);v8=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Integer);v2=(PosByte);v3=(PosByte);v4=(Uninit);v5=(PosByte);v7=(One);v8=(PosByte);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    aget-object v1, v0, v5

    #v1=(Null);
    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    aget-object v1, v0, v3

    #v1=(Null);
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    aget-object v1, v0, v5

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Lcom/baidu/location/ak;->gs:I

    aget-object v0, v0, v3

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/ak;->gu:I

    iput-boolean v7, p0, Lcom/baidu/location/ak;->gy:Z

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/ak;->gx:Ljava/lang/String;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/baidu/location/ak;->j(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/location/ak;->gx:Ljava/lang/String;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/ak;->gx:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x3

    invoke-virtual {v0, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    move v0, v6

    #v0=(Null);
    move v1, v6

    :goto_1
    #v0=(Integer);v3=(Char);v4=(Conflicted);
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    if-ge v0, v3, :cond_4

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    #v3=(Char);
    const/16 v4, 0x2c

    #v4=(PosByte);
    if-ne v3, v4, :cond_3

    add-int/lit8 v1, v1, 0x1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    #v3=(Integer);v4=(Conflicted);
    const-string v0, ","

    #v0=(Reference);
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-lt v1, v5, :cond_0

    aget-object v1, v0, v8

    #v1=(Null);
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_5

    array-length v1, v0

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x3

    aget-object v1, v0, v1

    #v1=(Null);
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_5

    array-length v1, v0

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x2

    aget-object v1, v0, v1

    #v1=(Null);
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_5

    array-length v1, v0

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    aget-object v1, v0, v1

    #v1=(Null);
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_5

    aget-object v1, v0, v8

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Lcom/baidu/location/ak;->gi:I

    array-length v1, v0

    add-int/lit8 v1, v1, -0x3

    aget-object v1, v0, v1

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    #v1=(DoubleLo);v2=(DoubleHi);
    iput-wide v1, p0, Lcom/baidu/location/ak;->gn:D

    array-length v1, v0

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x2

    aget-object v0, v0, v1

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    iput-wide v0, p0, Lcom/baidu/location/ak;->gk:D

    iput-boolean v7, p0, Lcom/baidu/location/ak;->gt:Z

    :cond_5
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/ak;->gj:Ljava/util/List;

    #v0=(Reference);
    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/baidu/location/ak;->gj:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_f

    iget-object v0, p0, Lcom/baidu/location/ak;->gj:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_6
    #v0=(Conflicted);v5=(Integer);v8=(Integer);v9=(Reference);v10=(Conflicted);v11=(Conflicted);
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/baidu/location/ak;->j(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_e

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x3

    invoke-virtual {v0, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    move v0, v6

    #v0=(Null);
    move v1, v6

    :goto_2
    #v0=(Integer);
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_8

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    #v3=(Char);
    const/16 v4, 0x2c

    #v4=(PosByte);
    if-ne v3, v4, :cond_7

    add-int/lit8 v1, v1, 0x1

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    #v3=(Integer);v4=(Conflicted);
    const-string v0, ","

    #v0=(Reference);
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v10

    #v10=(Reference);
    aget-object v0, v10, v7

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    iget-object v1, p0, Lcom/baidu/location/ak;->gj:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    #v1=(Integer);
    if-ne v0, v1, :cond_a

    array-length v0, v10

    const/16 v1, 0x8

    #v1=(PosByte);
    if-le v0, v1, :cond_a

    move v0, v7

    :goto_3
    #v0=(Boolean);v1=(Integer);
    iput-boolean v0, p0, Lcom/baidu/location/ak;->gm:Z

    iget-boolean v0, p0, Lcom/baidu/location/ak;->gm:Z

    if-nez v0, :cond_b

    :cond_9
    :goto_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    iget-boolean v0, p0, Lcom/baidu/location/ak;->gy:Z

    #v0=(Boolean);
    if-eqz v0, :cond_10

    iget-boolean v0, p0, Lcom/baidu/location/ak;->gt:Z

    if-eqz v0, :cond_10

    :goto_5
    #v7=(Boolean);
    iput-boolean v7, p0, Lcom/baidu/location/ak;->gr:Z

    goto/16 :goto_0

    :cond_a
    #v0=(Integer);v1=(Integer);v2=(Reference);v7=(One);v9=(Reference);v10=(Reference);
    move v0, v6

    #v0=(Null);
    goto :goto_3

    :cond_b
    #v0=(Boolean);
    const/4 v0, 0x4

    #v0=(PosByte);
    move v8, v0

    :goto_6
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    array-length v0, v10

    if-ge v8, v0, :cond_6

    aget-object v0, v10, v8

    #v0=(Null);
    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_c

    add-int/lit8 v0, v8, 0x1

    #v0=(Integer);
    aget-object v0, v10, v0

    #v0=(Null);
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_c

    add-int/lit8 v0, v8, 0x2

    #v0=(Integer);
    aget-object v0, v10, v0

    #v0=(Null);
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_c

    iget v0, p0, Lcom/baidu/location/ak;->gv:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/baidu/location/ak;->gv:I

    aget-object v0, v10, v8

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v0, v8, 0x1

    #v0=(Integer);
    aget-object v0, v10, v0

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    #v4=(Integer);
    add-int/lit8 v0, v8, 0x2

    #v0=(Integer);
    aget-object v0, v10, v0

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/lit8 v0, v8, 0x3

    #v0=(Integer);
    aget-object v0, v10, v0

    #v0=(Null);
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_d

    move v5, v6

    :goto_7
    #v0=(Conflicted);
    iget-object v11, p0, Lcom/baidu/location/ak;->gq:Ljava/util/List;

    #v11=(Reference);
    new-instance v0, Lcom/baidu/location/ak$a;

    #v0=(UninitRef);
    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/baidu/location/ak$a;-><init>(Lcom/baidu/location/ak;IIII)V

    #v0=(Reference);
    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v11=(Conflicted);
    add-int/lit8 v0, v8, 0x4

    #v0=(Integer);
    move v8, v0

    goto :goto_6

    :cond_d
    #v0=(Boolean);v2=(Integer);v4=(Integer);
    add-int/lit8 v0, v8, 0x3

    #v0=(Integer);
    aget-object v0, v10, v0

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_7

    :cond_e
    #v1=(Boolean);v2=(Conflicted);v4=(Conflicted);v10=(Conflicted);
    iput-boolean v6, p0, Lcom/baidu/location/ak;->gm:Z

    goto/16 :goto_4

    :cond_f
    #v0=(Conflicted);v1=(Conflicted);v5=(PosByte);v8=(PosByte);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    iput-boolean v6, p0, Lcom/baidu/location/ak;->gm:Z

    goto/16 :goto_4

    :cond_10
    #v0=(Boolean);v5=(Integer);v8=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    move v7, v6

    #v7=(Null);
    goto/16 :goto_5
.end method

.method private do(DD)[D
    .locals 4

    const/4 v0, 0x2

    #v0=(PosByte);
    new-array v0, v0, [D

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v2, p1

    aput-wide v2, v0, v1

    const/4 v1, 0x1

    #v1=(One);
    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    mul-double/2addr v2, p1

    aput-wide v2, v0, v1

    return-object v0
.end method

.method private if(ZZZZZ)I
    .locals 12

    iget-boolean v0, p0, Lcom/baidu/location/ak;->gr:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(PosByte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    const/4 v4, 0x3

    #v4=(PosByte);
    if-eqz p1, :cond_2

    iget-boolean v0, p0, Lcom/baidu/location/ak;->gy:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Lcom/baidu/location/ak;->gh:I

    iget v0, p0, Lcom/baidu/location/ak;->gu:I

    #v0=(Integer);
    sget v1, Lcom/baidu/location/b;->U:I

    #v1=(Integer);
    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :cond_1
    #v0=(Integer);
    iget v0, p0, Lcom/baidu/location/ak;->gu:I

    sget v1, Lcom/baidu/location/b;->aC:I

    if-gt v0, v1, :cond_2

    const/4 v0, 0x4

    #v0=(PosByte);
    goto :goto_0

    :cond_2
    #v0=(Integer);v1=(Conflicted);
    if-eqz p2, :cond_4

    iget-boolean v0, p0, Lcom/baidu/location/ak;->gt:Z

    #v0=(Boolean);
    if-eqz v0, :cond_4

    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/ak;->gh:I

    iget-wide v0, p0, Lcom/baidu/location/ak;->gk:D

    #v0=(DoubleLo);v1=(DoubleHi);
    sget v2, Lcom/baidu/location/b;->ab:F

    #v2=(Integer);
    float-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    cmpg-double v0, v0, v2

    #v0=(Byte);
    if-gtz v0, :cond_3

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :cond_3
    #v0=(Byte);
    iget-wide v0, p0, Lcom/baidu/location/ak;->gk:D

    #v0=(DoubleLo);
    sget v2, Lcom/baidu/location/b;->aK:F

    #v2=(Integer);
    float-to-double v2, v2

    #v2=(DoubleLo);
    cmpl-double v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_4

    const/4 v0, 0x4

    #v0=(PosByte);
    goto :goto_0

    :cond_4
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    if-eqz p3, :cond_6

    iget-boolean v0, p0, Lcom/baidu/location/ak;->gt:Z

    #v0=(Boolean);
    if-eqz v0, :cond_6

    const/4 v0, 0x3

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/ak;->gh:I

    iget-wide v0, p0, Lcom/baidu/location/ak;->gn:D

    #v0=(DoubleLo);v1=(DoubleHi);
    sget v2, Lcom/baidu/location/b;->ad:F

    #v2=(Integer);
    float-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    cmpg-double v0, v0, v2

    #v0=(Byte);
    if-gtz v0, :cond_5

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :cond_5
    #v0=(Byte);
    iget-wide v0, p0, Lcom/baidu/location/ak;->gn:D

    #v0=(DoubleLo);
    sget v2, Lcom/baidu/location/b;->aM:F

    #v2=(Integer);
    float-to-double v2, v2

    #v2=(DoubleLo);
    cmpl-double v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_6

    const/4 v0, 0x4

    #v0=(PosByte);
    goto :goto_0

    :cond_6
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-boolean v0, p0, Lcom/baidu/location/ak;->gm:Z

    #v0=(Boolean);
    if-nez v0, :cond_7

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :cond_7
    #v0=(Boolean);
    if-eqz p4, :cond_a

    const/4 v0, 0x4

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/ak;->gh:I

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/ak;->gq:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    #v2=(Reference);
    move v1, v0

    :goto_1
    #v0=(Integer);v1=(Integer);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/ak$a;

    invoke-virtual {v0}, Lcom/baidu/location/ak$a;->do()I

    move-result v0

    #v0=(Integer);
    sget v3, Lcom/baidu/location/b;->Y:I

    #v3=(Integer);
    if-lt v0, v3, :cond_16

    add-int/lit8 v0, v1, 0x1

    :goto_2
    move v1, v0

    goto :goto_1

    :cond_8
    #v0=(Boolean);v3=(Conflicted);
    sget v0, Lcom/baidu/location/b;->V:I

    #v0=(Integer);
    if-lt v1, v0, :cond_9

    const/4 v0, 0x1

    #v0=(One);
    goto/16 :goto_0

    :cond_9
    #v0=(Integer);
    sget v0, Lcom/baidu/location/b;->aD:I

    if-gt v1, v0, :cond_a

    const/4 v0, 0x4

    #v0=(PosByte);
    goto/16 :goto_0

    :cond_a
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    if-eqz p5, :cond_14

    const/4 v0, 0x5

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/ak;->gh:I

    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    #v3=(Reference);
    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    #v6=(Reference);
    const/4 v0, 0x0

    :goto_3
    #v0=(Integer);
    const/16 v1, 0xa

    #v1=(PosByte);
    if-ge v0, v1, :cond_b

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_b
    #v1=(PosByte);
    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/ak;->gq:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    #v7=(Reference);
    move v2, v0

    :goto_4
    #v0=(Integer);v1=(Conflicted);v2=(Integer);v8=(Conflicted);v9=(Conflicted);
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/ak$a;

    const/4 v1, 0x1

    #v1=(One);
    const/16 v8, 0xa

    #v8=(PosByte);
    invoke-virtual {v0}, Lcom/baidu/location/ak$a;->do()I

    move-result v9

    #v9=(Integer);
    if-lt v9, v8, :cond_15

    invoke-virtual {v0}, Lcom/baidu/location/ak$a;->if()I

    move-result v9

    if-lt v9, v1, :cond_15

    invoke-virtual {v0}, Lcom/baidu/location/ak$a;->do()I

    move-result v1

    #v1=(Integer);
    sub-int/2addr v1, v8

    div-int/lit8 v1, v1, 0x5

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move v0, v2

    :goto_5
    #v0=(Integer);v1=(Conflicted);
    move v2, v0

    goto :goto_4

    :cond_c
    #v0=(Boolean);v8=(Conflicted);v9=(Conflicted);
    const/4 v0, 0x4

    #v0=(PosByte);
    if-lt v2, v0, :cond_13

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_6
    #v0=(Integer);v1=(Integer);
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_e

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_d

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/baidu/location/ak;->if(Ljava/util/List;)[D

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    #v0=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_6

    :cond_e
    if-eqz v5, :cond_12

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_12

    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, [D

    const/4 v2, 0x0

    #v2=(Null);
    aget-wide v7, v0, v2

    #v7=(LongLo);v8=(LongHi);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    int-to-double v9, v1

    #v9=(DoubleLo);v10=(DoubleHi);
    mul-double/2addr v7, v9

    #v7=(DoubleLo);v8=(DoubleHi);
    aput-wide v7, v0, v2

    const/4 v2, 0x1

    #v2=(One);
    aget-wide v7, v0, v2

    #v7=(LongLo);v8=(LongHi);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    int-to-double v9, v1

    mul-double/2addr v7, v9

    #v7=(DoubleLo);v8=(DoubleHi);
    aput-wide v7, v0, v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_10

    const/4 v1, 0x1

    #v1=(One);
    move v3, v1

    :goto_7
    #v1=(Integer);v3=(Integer);v9=(LongLo);v10=(LongHi);v11=(Conflicted);
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_f

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, [D

    const/4 v7, 0x0

    #v7=(Null);
    aget-wide v8, v1, v7

    #v8=(LongLo);v9=(LongHi);
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    #v2=(Integer);
    int-to-double v10, v2

    #v10=(DoubleLo);v11=(DoubleHi);
    mul-double/2addr v8, v10

    #v8=(DoubleLo);v9=(DoubleHi);
    aput-wide v8, v1, v7

    const/4 v7, 0x1

    #v7=(One);
    aget-wide v8, v1, v7

    #v8=(LongLo);v9=(LongHi);
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    #v2=(Integer);
    int-to-double v10, v2

    mul-double/2addr v8, v10

    #v8=(DoubleLo);v9=(DoubleHi);
    aput-wide v8, v1, v7

    const/4 v2, 0x0

    #v2=(Null);
    aget-wide v7, v0, v2

    #v7=(LongLo);v8=(LongHi);
    const/4 v9, 0x0

    #v9=(Null);
    aget-wide v9, v1, v9

    #v9=(LongLo);v10=(LongHi);
    add-double/2addr v7, v9

    #v7=(DoubleLo);v8=(DoubleHi);
    aput-wide v7, v0, v2

    const/4 v2, 0x1

    #v2=(One);
    aget-wide v7, v0, v2

    #v7=(LongLo);v8=(LongHi);
    const/4 v9, 0x1

    #v9=(One);
    aget-wide v9, v1, v9

    #v9=(LongLo);
    add-double/2addr v7, v9

    #v7=(DoubleLo);v8=(DoubleHi);
    aput-wide v7, v0, v2

    add-int/lit8 v1, v3, 0x1

    #v1=(Integer);
    move v3, v1

    goto :goto_7

    :cond_f
    #v11=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    aget-wide v2, v0, v1

    #v2=(LongLo);v3=(LongHi);
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    #v6=(Integer);
    int-to-double v6, v6

    #v6=(DoubleLo);v7=(DoubleHi);
    div-double/2addr v2, v6

    #v2=(DoubleLo);v3=(DoubleHi);
    aput-wide v2, v0, v1

    const/4 v1, 0x1

    #v1=(One);
    aget-wide v2, v0, v1

    #v2=(LongLo);v3=(LongHi);
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    #v5=(Integer);
    int-to-double v5, v5

    #v5=(DoubleLo);v6=(DoubleHi);
    div-double/2addr v2, v5

    #v2=(DoubleLo);v3=(DoubleHi);
    aput-wide v2, v0, v1

    :cond_10
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    aget-wide v1, v0, v1

    #v1=(LongLo);v2=(LongHi);
    const/4 v3, 0x1

    #v3=(One);
    aget-wide v5, v0, v3

    #v5=(LongLo);v6=(LongHi);
    invoke-direct {p0, v1, v2, v5, v6}, Lcom/baidu/location/ak;->if(DD)[D

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    aget-wide v1, v0, v1

    #v1=(LongLo);
    sget v3, Lcom/baidu/location/b;->as:I

    #v3=(Integer);
    int-to-double v5, v3

    #v5=(DoubleLo);v6=(DoubleHi);
    cmpg-double v1, v1, v5

    #v1=(Byte);
    if-gtz v1, :cond_11

    const/4 v0, 0x1

    #v0=(One);
    goto/16 :goto_0

    :cond_11
    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    aget-wide v0, v0, v1

    #v0=(LongLo);v1=(LongHi);
    sget v2, Lcom/baidu/location/b;->aW:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    cmpl-double v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_14

    const/4 v0, 0x4

    #v0=(PosByte);
    goto/16 :goto_0

    :cond_12
    #v0=(Integer);v1=(Integer);v2=(Integer);v3=(Reference);v5=(Reference);v6=(Reference);v7=(Reference);v8=(Conflicted);v9=(Conflicted);v10=(Uninit);v11=(Uninit);
    const/4 v0, 0x4

    #v0=(PosByte);
    goto/16 :goto_0

    :cond_13
    #v1=(Conflicted);
    const/4 v0, 0x4

    goto/16 :goto_0

    :cond_14
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/location/ak;->gh:I

    move v0, v4

    #v0=(PosByte);
    goto/16 :goto_0

    :cond_15
    #v0=(Reference);v1=(One);v2=(Integer);v3=(Reference);v5=(Reference);v6=(Reference);v7=(Reference);v8=(PosByte);v9=(Integer);v10=(Uninit);v11=(Uninit);
    move v0, v2

    #v0=(Integer);
    goto/16 :goto_5

    :cond_16
    #v1=(Integer);v2=(Reference);v3=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move v0, v1

    goto/16 :goto_2
.end method

.method private if(DD)[D
    .locals 8

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    cmpl-double v2, p3, v0

    #v2=(Byte);
    if-nez v2, :cond_2

    cmpl-double v2, p1, v0

    if-lez v2, :cond_1

    const-wide v0, 0x4056800000000000L

    :cond_0
    :goto_0
    const/4 v2, 0x2

    #v2=(PosByte);
    new-array v2, v2, [D

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    mul-double v4, p1, p1

    #v4=(DoubleLo);v5=(DoubleHi);
    mul-double v6, p3, p3

    #v6=(DoubleLo);v7=(DoubleHi);
    add-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    aput-wide v4, v2, v3

    const/4 v3, 0x1

    #v3=(One);
    aput-wide v0, v2, v3

    return-object v2

    :cond_1
    #v2=(Byte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    cmpg-double v2, p1, v0

    if-gez v2, :cond_0

    const-wide v0, 0x4070e00000000000L

    goto :goto_0

    :cond_2
    div-double v0, p1, p3

    #v0=(DoubleLo);v1=(DoubleHi);
    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    goto :goto_0
.end method

.method private if(Ljava/util/List;)[D
    .locals 9

    const/4 v2, 0x1

    #v2=(One);
    const/4 v8, 0x0

    #v8=(Null);
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_2

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/ak$a;

    invoke-virtual {v0}, Lcom/baidu/location/ak$a;->if()I

    move-result v0

    #v0=(Integer);
    rsub-int/lit8 v0, v0, 0x5a

    int-to-double v3, v0

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/ak$a;

    invoke-virtual {v0}, Lcom/baidu/location/ak$a;->a()I

    move-result v0

    #v0=(Integer);
    int-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    invoke-direct {p0, v3, v4, v0, v1}, Lcom/baidu/location/ak;->do(DD)[D

    move-result-object v3

    #v3=(Reference);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-le v0, v2, :cond_1

    move v1, v2

    :goto_0
    #v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/ak$a;

    invoke-virtual {v0}, Lcom/baidu/location/ak$a;->if()I

    move-result v0

    #v0=(Integer);
    rsub-int/lit8 v0, v0, 0x5a

    int-to-double v4, v0

    #v4=(DoubleLo);v5=(DoubleHi);
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/ak$a;

    invoke-virtual {v0}, Lcom/baidu/location/ak$a;->a()I

    move-result v0

    #v0=(Integer);
    int-to-double v6, v0

    #v6=(DoubleLo);v7=(DoubleHi);
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/baidu/location/ak;->do(DD)[D

    move-result-object v0

    #v0=(Reference);
    aget-wide v4, v3, v8

    #v4=(LongLo);v5=(LongHi);
    aget-wide v6, v0, v8

    #v6=(LongLo);v7=(LongHi);
    add-double/2addr v4, v6

    #v4=(DoubleLo);v5=(DoubleHi);
    aput-wide v4, v3, v8

    aget-wide v4, v3, v2

    #v4=(LongLo);v5=(LongHi);
    aget-wide v6, v0, v2

    add-double/2addr v4, v6

    #v4=(DoubleLo);v5=(DoubleHi);
    aput-wide v4, v3, v2

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_0
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    aget-wide v0, v3, v8

    #v0=(LongLo);v1=(LongHi);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    #v4=(Integer);
    int-to-double v4, v4

    #v4=(DoubleLo);v5=(DoubleHi);
    div-double/2addr v0, v4

    #v0=(DoubleLo);v1=(DoubleHi);
    aput-wide v0, v3, v8

    aget-wide v0, v3, v2

    #v0=(LongLo);v1=(LongHi);
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    #v4=(Integer);
    int-to-double v4, v4

    #v4=(DoubleLo);
    div-double/2addr v0, v4

    #v0=(DoubleLo);v1=(DoubleHi);
    aput-wide v0, v3, v2

    :cond_1
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-object v0, v3

    :goto_1
    #v0=(Reference);v1=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_2
    #v0=(Conflicted);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method private j(Ljava/lang/String;)Z
    .locals 5

    const/4 v1, 0x1

    #v1=(One);
    const/4 v3, 0x0

    #v3=(Null);
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    const/16 v2, 0x8

    #v2=(PosByte);
    if-le v0, v2, :cond_1

    move v0, v1

    #v0=(One);
    move v2, v3

    :goto_0
    #v0=(Integer);v2=(Integer);v4=(Conflicted);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    #v4=(Integer);
    add-int/lit8 v4, v4, -0x3

    if-ge v0, v4, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    #v4=(Char);
    xor-int/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v4=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    move v3, v1

    :cond_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
    return v3
.end method


# virtual methods
.method public bi()I
    .locals 6

    const/4 v1, 0x1

    #v1=(One);
    move-object v0, p0

    #v0=(Reference);
    move v2, v1

    #v2=(One);
    move v3, v1

    #v3=(One);
    move v4, v1

    #v4=(One);
    move v5, v1

    #v5=(One);
    invoke-direct/range {v0 .. v5}, Lcom/baidu/location/ak;->if(ZZZZZ)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public bj()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/ak;->gr:Z

    #v0=(Boolean);
    return v0
.end method

.method public bk()D
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/ak;->gk:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method public bm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/ak;->gl:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public bn()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/ak;->gs:I

    #v0=(Integer);
    return v0
.end method

.method public bo()D
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/ak;->gn:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

*/}
