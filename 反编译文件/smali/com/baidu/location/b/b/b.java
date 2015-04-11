package com.baidu.location.b.b; class b {/*

.class public final Lcom/baidu/location/b/b/b;
.super Ljava/lang/Object;


# static fields
.field private static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x40

    #v0=(PosByte);
    new-array v0, v0, [B

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Lcom/baidu/location/b/b/b;->a:[B

    return-void

    :array_0
    .array-data 0x1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a([BLjava/lang/String;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const/16 v10, 0x3d

    #v10=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    array-length v0, p0

    #v0=(Integer);
    mul-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0x3

    div-int/lit8 v1, v0, 0x4c

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x3

    add-int/2addr v0, v1

    new-array v5, v0, [B

    #v5=(Reference);
    array-length v0, p0

    array-length v1, p0

    rem-int/lit8 v1, v1, 0x3

    sub-int v6, v0, v1

    #v6=(Integer);
    move v0, v3

    #v0=(Null);
    move v4, v3

    #v4=(Null);
    move v1, v3

    :goto_0
    #v0=(Integer);v2=(Conflicted);v4=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-ge v4, v6, :cond_0

    add-int/lit8 v2, v1, 0x1

    #v2=(Integer);
    sget-object v7, Lcom/baidu/location/b/b/b;->a:[B

    #v7=(Reference);
    aget-byte v8, p0, v4

    #v8=(Byte);
    and-int/lit16 v8, v8, 0xff

    #v8=(Integer);
    shr-int/lit8 v8, v8, 0x2

    aget-byte v7, v7, v8

    #v7=(Byte);
    aput-byte v7, v5, v1

    add-int/lit8 v1, v2, 0x1

    sget-object v7, Lcom/baidu/location/b/b/b;->a:[B

    #v7=(Reference);
    aget-byte v8, p0, v4

    #v8=(Byte);
    and-int/lit8 v8, v8, 0x3

    #v8=(Integer);
    shl-int/lit8 v8, v8, 0x4

    add-int/lit8 v9, v4, 0x1

    #v9=(Integer);
    aget-byte v9, p0, v9

    #v9=(Byte);
    and-int/lit16 v9, v9, 0xff

    #v9=(Integer);
    shr-int/lit8 v9, v9, 0x4

    or-int/2addr v8, v9

    aget-byte v7, v7, v8

    #v7=(Byte);
    aput-byte v7, v5, v2

    add-int/lit8 v7, v1, 0x1

    #v7=(Integer);
    sget-object v2, Lcom/baidu/location/b/b/b;->a:[B

    #v2=(Reference);
    add-int/lit8 v8, v4, 0x1

    aget-byte v8, p0, v8

    #v8=(Byte);
    and-int/lit8 v8, v8, 0xf

    #v8=(Integer);
    shl-int/lit8 v8, v8, 0x2

    add-int/lit8 v9, v4, 0x2

    aget-byte v9, p0, v9

    #v9=(Byte);
    and-int/lit16 v9, v9, 0xff

    #v9=(Integer);
    shr-int/lit8 v9, v9, 0x6

    or-int/2addr v8, v9

    aget-byte v2, v2, v8

    #v2=(Byte);
    aput-byte v2, v5, v1

    add-int/lit8 v2, v7, 0x1

    #v2=(Integer);
    sget-object v1, Lcom/baidu/location/b/b/b;->a:[B

    #v1=(Reference);
    add-int/lit8 v8, v4, 0x2

    aget-byte v8, p0, v8

    #v8=(Byte);
    and-int/lit8 v8, v8, 0x3f

    #v8=(Integer);
    aget-byte v1, v1, v8

    #v1=(Byte);
    aput-byte v1, v5, v7

    sub-int v1, v2, v0

    #v1=(Integer);
    rem-int/lit8 v1, v1, 0x4c

    if-nez v1, :cond_1

    if-eqz v2, :cond_1

    add-int/lit8 v1, v2, 0x1

    const/16 v7, 0xa

    #v7=(PosByte);
    aput-byte v7, v5, v2

    add-int/lit8 v0, v0, 0x1

    :goto_1
    #v7=(Integer);
    add-int/lit8 v2, v4, 0x3

    move v4, v2

    goto :goto_0

    :cond_0
    #v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    array-length v0, p0

    rem-int/lit8 v0, v0, 0x3

    packed-switch v0, :pswitch_data_0

    move v0, v1

    :goto_2
    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    invoke-direct {v1, v5, v3, v0, p1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    #v1=(Reference);
    return-object v1

    :pswitch_0
    #v1=(Integer);
    add-int/lit8 v0, v1, 0x1

    sget-object v2, Lcom/baidu/location/b/b/b;->a:[B

    #v2=(Reference);
    aget-byte v4, p0, v6

    #v4=(Byte);
    and-int/lit16 v4, v4, 0xff

    #v4=(Integer);
    shr-int/lit8 v4, v4, 0x2

    aget-byte v2, v2, v4

    #v2=(Byte);
    aput-byte v2, v5, v1

    add-int/lit8 v1, v0, 0x1

    sget-object v2, Lcom/baidu/location/b/b/b;->a:[B

    #v2=(Reference);
    aget-byte v4, p0, v6

    #v4=(Byte);
    and-int/lit8 v4, v4, 0x3

    #v4=(Integer);
    shl-int/lit8 v4, v4, 0x4

    aget-byte v2, v2, v4

    #v2=(Byte);
    aput-byte v2, v5, v0

    add-int/lit8 v2, v1, 0x1

    #v2=(Integer);
    aput-byte v10, v5, v1

    add-int/lit8 v0, v2, 0x1

    aput-byte v10, v5, v2

    goto :goto_2

    :pswitch_1
    #v2=(Conflicted);
    add-int/lit8 v0, v1, 0x1

    sget-object v2, Lcom/baidu/location/b/b/b;->a:[B

    #v2=(Reference);
    aget-byte v4, p0, v6

    #v4=(Byte);
    and-int/lit16 v4, v4, 0xff

    #v4=(Integer);
    shr-int/lit8 v4, v4, 0x2

    aget-byte v2, v2, v4

    #v2=(Byte);
    aput-byte v2, v5, v1

    add-int/lit8 v1, v0, 0x1

    sget-object v2, Lcom/baidu/location/b/b/b;->a:[B

    #v2=(Reference);
    aget-byte v4, p0, v6

    #v4=(Byte);
    and-int/lit8 v4, v4, 0x3

    #v4=(Integer);
    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v7, v6, 0x1

    #v7=(Integer);
    aget-byte v7, p0, v7

    #v7=(Byte);
    and-int/lit16 v7, v7, 0xff

    #v7=(Integer);
    shr-int/lit8 v7, v7, 0x4

    or-int/2addr v4, v7

    aget-byte v2, v2, v4

    #v2=(Byte);
    aput-byte v2, v5, v0

    add-int/lit8 v2, v1, 0x1

    #v2=(Integer);
    sget-object v0, Lcom/baidu/location/b/b/b;->a:[B

    #v0=(Reference);
    add-int/lit8 v4, v6, 0x1

    aget-byte v4, p0, v4

    #v4=(Byte);
    and-int/lit8 v4, v4, 0xf

    #v4=(Integer);
    shl-int/lit8 v4, v4, 0x2

    aget-byte v0, v0, v4

    #v0=(Byte);
    aput-byte v0, v5, v1

    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    aput-byte v10, v5, v2

    goto :goto_2

    :cond_1
    #v8=(Integer);v9=(Integer);
    move v1, v2

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a([B)[B
    .locals 1

    array-length v0, p0

    #v0=(Integer);
    invoke-static {p0, v0}, Lcom/baidu/location/b/b/b;->a([BI)[B

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static a([BI)[B
    .locals 14

    const/16 v12, 0x20

    #v12=(PosByte);
    const/16 v11, 0xd

    #v11=(PosByte);
    const/16 v10, 0xa

    #v10=(PosByte);
    const/16 v9, 0x9

    #v9=(PosByte);
    const/4 v1, 0x0

    #v1=(Null);
    div-int/lit8 v0, p1, 0x4

    #v0=(Integer);
    mul-int/lit8 v0, v0, 0x3

    if-nez v0, :cond_0

    new-array v0, v1, [B

    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v13=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v13=(Uninit);
    new-array v7, v0, [B

    #v7=(Reference);
    move v0, v1

    :goto_1
    #v2=(Conflicted);v3=(Conflicted);
    add-int/lit8 v2, p1, -0x1

    #v2=(Integer);
    aget-byte v2, p0, v2

    #v2=(Byte);
    if-eq v2, v10, :cond_1

    if-eq v2, v11, :cond_1

    if-eq v2, v12, :cond_1

    if-ne v2, v9, :cond_2

    :cond_1
    :goto_2
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_2
    const/16 v3, 0x3d

    #v3=(PosByte);
    if-ne v2, v3, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    move v6, v1

    #v6=(Null);
    move v4, v1

    #v4=(Null);
    move v5, v1

    #v5=(Null);
    move v3, v1

    :goto_3
    #v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Integer);v8=(Conflicted);v13=(Conflicted);
    if-ge v6, p1, :cond_a

    aget-byte v2, p0, v6

    #v2=(Byte);
    if-eq v2, v10, :cond_e

    if-eq v2, v11, :cond_e

    if-eq v2, v12, :cond_e

    if-ne v2, v9, :cond_4

    move v2, v4

    #v2=(Integer);
    move v4, v3

    move v3, v5

    :goto_4
    add-int/lit8 v5, v6, 0x1

    move v6, v5

    move v5, v3

    move v3, v4

    move v4, v2

    goto :goto_3

    :cond_4
    #v2=(Byte);
    const/16 v8, 0x41

    #v8=(PosByte);
    if-lt v2, v8, :cond_5

    const/16 v8, 0x5a

    if-gt v2, v8, :cond_5

    add-int/lit8 v2, v2, -0x41

    :goto_5
    #v2=(Integer);
    shl-int/lit8 v4, v4, 0x6

    int-to-byte v2, v2

    #v2=(Byte);
    or-int/2addr v4, v2

    rem-int/lit8 v2, v5, 0x4

    #v2=(Integer);
    const/4 v8, 0x3

    if-ne v2, v8, :cond_d

    add-int/lit8 v2, v3, 0x1

    const/high16 v8, 0xff

    #v8=(Integer);
    and-int/2addr v8, v4

    shr-int/lit8 v8, v8, 0x10

    #v8=(Short);
    int-to-byte v8, v8

    #v8=(Byte);
    aput-byte v8, v7, v3

    add-int/lit8 v3, v2, 0x1

    const v8, 0xff00

    #v8=(Char);
    and-int/2addr v8, v4

    #v8=(Integer);
    shr-int/lit8 v8, v8, 0x8

    int-to-byte v8, v8

    #v8=(Byte);
    aput-byte v8, v7, v2

    add-int/lit8 v2, v3, 0x1

    and-int/lit16 v8, v4, 0xff

    #v8=(Integer);
    int-to-byte v8, v8

    #v8=(Byte);
    aput-byte v8, v7, v3

    :goto_6
    add-int/lit8 v3, v5, 0x1

    move v13, v4

    #v13=(Integer);
    move v4, v2

    move v2, v13

    goto :goto_4

    :cond_5
    #v2=(Byte);v8=(PosByte);v13=(Conflicted);
    const/16 v8, 0x61

    if-lt v2, v8, :cond_6

    const/16 v8, 0x7a

    if-gt v2, v8, :cond_6

    add-int/lit8 v2, v2, -0x47

    #v2=(Integer);
    goto :goto_5

    :cond_6
    #v2=(Byte);
    const/16 v8, 0x30

    if-lt v2, v8, :cond_7

    const/16 v8, 0x39

    if-gt v2, v8, :cond_7

    add-int/lit8 v2, v2, 0x4

    #v2=(Integer);
    goto :goto_5

    :cond_7
    #v2=(Byte);
    const/16 v8, 0x2b

    if-ne v2, v8, :cond_8

    const/16 v2, 0x3e

    #v2=(PosByte);
    goto :goto_5

    :cond_8
    #v2=(Byte);
    const/16 v8, 0x2f

    if-ne v2, v8, :cond_9

    const/16 v2, 0x3f

    #v2=(PosByte);
    goto :goto_5

    :cond_9
    #v2=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    goto/16 :goto_0

    :cond_a
    #v0=(Integer);v2=(Integer);v8=(Conflicted);
    if-lez v0, :cond_b

    mul-int/lit8 v2, v0, 0x6

    shl-int/2addr v4, v2

    add-int/lit8 v2, v3, 0x1

    const/high16 v5, 0xff

    and-int/2addr v5, v4

    shr-int/lit8 v5, v5, 0x10

    #v5=(Short);
    int-to-byte v5, v5

    #v5=(Byte);
    aput-byte v5, v7, v3

    const/4 v3, 0x1

    #v3=(One);
    if-ne v0, v3, :cond_c

    add-int/lit8 v3, v2, 0x1

    #v3=(Integer);
    const v0, 0xff00

    #v0=(Char);
    and-int/2addr v0, v4

    #v0=(Integer);
    shr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    #v0=(Byte);
    aput-byte v0, v7, v2

    :cond_b
    :goto_7
    #v0=(Integer);v5=(Integer);
    new-array v0, v3, [B

    #v0=(Reference);
    invoke-static {v7, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_0

    :cond_c
    #v0=(Integer);v3=(One);v5=(Byte);
    move v3, v2

    #v3=(Integer);
    goto :goto_7

    :cond_d
    #v5=(Integer);v8=(PosByte);
    move v2, v3

    goto :goto_6

    :cond_e
    #v2=(Byte);v8=(Conflicted);
    move v2, v4

    #v2=(Integer);
    move v4, v3

    move v3, v5

    goto/16 :goto_4
.end method

*/}
