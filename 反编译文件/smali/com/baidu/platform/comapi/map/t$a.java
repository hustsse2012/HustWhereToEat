package com.baidu.platform.comapi.map; class t$a {/*

.class public Lcom/baidu/platform/comapi/map/t$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/platform/comapi/map/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:J

.field public e:Lcom/baidu/platform/comapi/basestruct/c;

.field public f:Lcom/baidu/platform/comapi/basestruct/c;

.field public g:Lcom/baidu/platform/comapi/basestruct/c;

.field public h:Lcom/baidu/platform/comapi/basestruct/c;

.field final synthetic i:Lcom/baidu/platform/comapi/map/t;


# direct methods
.method public constructor <init>(Lcom/baidu/platform/comapi/map/t;)V
    .locals 4

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    const/4 v1, 0x0

    #v1=(Null);
    iput-object p1, p0, Lcom/baidu/platform/comapi/map/t$a;->i:Lcom/baidu/platform/comapi/map/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->a:J

    iput-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->b:J

    iput-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->c:J

    iput-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->d:J

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/c;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/t$a;->e:Lcom/baidu/platform/comapi/basestruct/c;

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/c;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/t$a;->f:Lcom/baidu/platform/comapi/basestruct/c;

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/c;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/t$a;->g:Lcom/baidu/platform/comapi/basestruct/c;

    new-instance v0, Lcom/baidu/platform/comapi/basestruct/c;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/t$a;->h:Lcom/baidu/platform/comapi/basestruct/c;

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
    instance-of v2, p1, Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Boolean);
    if-nez v2, :cond_3

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(One);
    check-cast p1, Lcom/baidu/platform/comapi/map/t$a;

    iget-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->d:J

    #v2=(LongLo);v3=(LongHi);
    iget-wide v4, p1, Lcom/baidu/platform/comapi/map/t$a;->d:J

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_4

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    iget-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->a:J

    #v2=(LongLo);
    iget-wide v4, p1, Lcom/baidu/platform/comapi/map/t$a;->a:J

    cmp-long v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_5

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_5
    #v0=(One);
    iget-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->b:J

    #v2=(LongLo);
    iget-wide v4, p1, Lcom/baidu/platform/comapi/map/t$a;->b:J

    cmp-long v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_6

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_6
    #v0=(One);
    iget-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->c:J

    #v2=(LongLo);
    iget-wide v4, p1, Lcom/baidu/platform/comapi/map/t$a;->c:J

    cmp-long v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public hashCode()I
    .locals 6

    const/16 v5, 0x20

    #v5=(PosByte);
    iget-wide v0, p0, Lcom/baidu/platform/comapi/map/t$a;->d:J

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/platform/comapi/map/t$a;->d:J

    #v2=(LongLo);v3=(LongHi);
    ushr-long/2addr v2, v5

    xor-long/2addr v0, v2

    long-to-int v0, v0

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/baidu/platform/comapi/map/t$a;->a:J

    #v1=(LongLo);v2=(LongHi);
    iget-wide v3, p0, Lcom/baidu/platform/comapi/map/t$a;->a:J

    #v3=(LongLo);v4=(LongHi);
    ushr-long/2addr v3, v5

    xor-long/2addr v1, v3

    long-to-int v1, v1

    #v1=(Integer);
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/baidu/platform/comapi/map/t$a;->b:J

    #v1=(LongLo);
    iget-wide v3, p0, Lcom/baidu/platform/comapi/map/t$a;->b:J

    ushr-long/2addr v3, v5

    xor-long/2addr v1, v3

    long-to-int v1, v1

    #v1=(Integer);
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/baidu/platform/comapi/map/t$a;->c:J

    #v1=(LongLo);
    iget-wide v3, p0, Lcom/baidu/platform/comapi/map/t$a;->c:J

    ushr-long/2addr v3, v5

    xor-long/2addr v1, v3

    long-to-int v1, v1

    #v1=(Integer);
    add-int/2addr v0, v1

    return v0
.end method

*/}
