package com.baidu.platform.comapi.map; class t {/*

.class public Lcom/baidu/platform/comapi/map/t;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/platform/comapi/map/t$b;,
        Lcom/baidu/platform/comapi/map/t$a;
    }
.end annotation


# instance fields
.field public a:F

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Lcom/baidu/platform/comapi/map/t$b;

.field public g:Lcom/baidu/platform/comapi/map/t$a;

.field public h:J

.field public i:J

.field public j:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    const/4 v1, -0x1

    #v1=(Byte);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/high16 v0, -0x4080

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/platform/comapi/map/t;->a:F

    iput v1, p0, Lcom/baidu/platform/comapi/map/t;->b:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/t;->c:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/t;->d:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/t;->e:I

    iput-wide v2, p0, Lcom/baidu/platform/comapi/map/t;->h:J

    iput-wide v2, p0, Lcom/baidu/platform/comapi/map/t;->i:J

    new-instance v0, Lcom/baidu/platform/comapi/map/t$b;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/platform/comapi/map/t$b;-><init>(Lcom/baidu/platform/comapi/map/t;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    new-instance v0, Lcom/baidu/platform/comapi/map/t$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/platform/comapi/map/t$a;-><init>(Lcom/baidu/platform/comapi/map/t;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/platform/comapi/map/t;->j:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    if-nez p1, :cond_2

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(One);
    check-cast p1, Lcom/baidu/platform/comapi/map/t;

    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->d:I

    #v2=(Integer);
    iget v3, p1, Lcom/baidu/platform/comapi/map/t;->d:I

    #v3=(Integer);
    if-eq v2, v3, :cond_3

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(One);
    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->e:I

    iget v3, p1, Lcom/baidu/platform/comapi/map/t;->e:I

    if-eq v2, v3, :cond_4

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    iget-boolean v2, p0, Lcom/baidu/platform/comapi/map/t;->j:Z

    #v2=(Boolean);
    iget-boolean v3, p1, Lcom/baidu/platform/comapi/map/t;->j:Z

    #v3=(Boolean);
    if-eq v2, v3, :cond_5

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_5
    #v0=(One);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    if-nez v2, :cond_6

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    if-eqz v2, :cond_7

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_6
    #v0=(One);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/baidu/platform/comapi/map/t$a;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_7

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_7
    #v0=(One);v2=(Conflicted);v3=(Conflicted);
    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->a:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    iget v3, p1, Lcom/baidu/platform/comapi/map/t;->a:F

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-eq v2, v3, :cond_8

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_8
    #v0=(One);
    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->c:I

    iget v3, p1, Lcom/baidu/platform/comapi/map/t;->c:I

    if-eq v2, v3, :cond_9

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_9
    #v0=(One);
    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->b:I

    iget v3, p1, Lcom/baidu/platform/comapi/map/t;->b:I

    if-eq v2, v3, :cond_a

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_a
    #v0=(One);
    iget-wide v2, p0, Lcom/baidu/platform/comapi/map/t;->i:J

    #v2=(LongLo);v3=(LongHi);
    iget-wide v4, p1, Lcom/baidu/platform/comapi/map/t;->i:J

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_b

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_b
    #v0=(One);
    iget-wide v2, p0, Lcom/baidu/platform/comapi/map/t;->h:J

    #v2=(LongLo);
    iget-wide v4, p1, Lcom/baidu/platform/comapi/map/t;->h:J

    cmp-long v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_c

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_c
    #v0=(One);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v2=(Reference);
    if-nez v2, :cond_d

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    if-eqz v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_d
    #v0=(One);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    iget-object v3, p1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/baidu/platform/comapi/map/t$b;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v1, 0x0

    #v1=(Null);
    iget v0, p0, Lcom/baidu/platform/comapi/map/t;->d:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->e:I

    #v2=(Integer);
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/t;->j:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    add-int/2addr v0, v2

    #v0=(Integer);
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    #v0=(Integer);
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->a:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->c:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/baidu/platform/comapi/map/t;->b:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v2=(Reference);
    if-nez v2, :cond_2

    :goto_2
    #v1=(Integer);
    add-int/2addr v0, v1

    return v0

    :cond_0
    #v0=(Boolean);v1=(Null);v2=(Integer);
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_1
    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/t$a;->hashCode()I

    move-result v0

    #v0=(Integer);
    goto :goto_1

    :cond_2
    #v2=(Reference);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/t$b;->hashCode()I

    move-result v1

    #v1=(Integer);
    goto :goto_2
.end method

*/}
