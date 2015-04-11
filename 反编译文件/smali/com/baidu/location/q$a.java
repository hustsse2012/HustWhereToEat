package com.baidu.location; class q$a {/*

.class Lcom/baidu/location/q$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 4

    const/16 v0, 0x10

    #v0=(PosByte);
    new-array v1, v0, [C

    #v1=(Reference);
    fill-array-data v1, :array_0

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    array-length v0, p0

    #v0=(Integer);
    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    #v2=(Reference);
    const/4 v0, 0x0

    :goto_0
    #v3=(Conflicted);
    array-length v3, p0

    #v3=(Integer);
    if-ge v0, v3, :cond_0

    aget-byte v3, p0, v0

    #v3=(Byte);
    and-int/lit16 v3, v3, 0xf0

    #v3=(Integer);
    shr-int/lit8 v3, v3, 0x4

    aget-char v3, v1, v3

    #v3=(Char);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-byte v3, p0, v0

    #v3=(Byte);
    and-int/lit8 v3, v3, 0xf

    #v3=(Integer);
    aget-char v3, v1, v3

    #v3=(Char);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v3=(Integer);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);
    nop

    :array_0
    .array-data 0x2
        0x30t 0x0t
        0x31t 0x0t
        0x32t 0x0t
        0x33t 0x0t
        0x34t 0x0t
        0x35t 0x0t
        0x36t 0x0t
        0x37t 0x0t
        0x38t 0x0t
        0x39t 0x0t
        0x41t 0x0t
        0x42t 0x0t
        0x43t 0x0t
        0x44t 0x0t
        0x45t 0x0t
        0x46t 0x0t
    .end array-data
.end method

*/}
