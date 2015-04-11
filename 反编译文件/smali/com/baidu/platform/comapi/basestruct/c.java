package com.baidu.platform.comapi.basestruct; class c {/*

.class public Lcom/baidu/platform/comapi/basestruct/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput p1, p0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    iput p2, p0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v0=(Integer);
    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v0=(Integer);
    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v2=(Uninit);v3=(Uninit);
    if-nez p1, :cond_2

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(One);
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    #v3=(Reference);
    if-eq v2, v3, :cond_3

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(One);
    check-cast p1, Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, p0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    iget v3, p1, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v3=(Integer);
    if-eq v2, v3, :cond_4

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    iget v2, p0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    iget v3, p1, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    if-eq v2, v3, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v1=(Integer);
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "Point [x="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", y="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
