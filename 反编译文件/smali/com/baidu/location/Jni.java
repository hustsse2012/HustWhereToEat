package com.baidu.location; class Jni {/*

.class Lcom/baidu/location/Jni;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# static fields
.field private static em:I

.field private static en:I

.field private static eo:I

.field private static ep:I

.field private static eq:I

.field private static er:Z

.field private static es:I

.field private static et:I

.field private static eu:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x1

    #v2=(One);
    const/4 v1, 0x0

    #v1=(Null);
    sput v1, Lcom/baidu/location/Jni;->eu:I

    sput v2, Lcom/baidu/location/Jni;->es:I

    const/4 v0, 0x2

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/Jni;->et:I

    const/16 v0, 0xb

    sput v0, Lcom/baidu/location/Jni;->ep:I

    const/16 v0, 0xc

    sput v0, Lcom/baidu/location/Jni;->eq:I

    const/16 v0, 0xd

    sput v0, Lcom/baidu/location/Jni;->en:I

    const/16 v0, 0xe

    sput v0, Lcom/baidu/location/Jni;->em:I

    const/16 v0, 0x400

    #v0=(PosShort);
    sput v0, Lcom/baidu/location/Jni;->eo:I

    sput-boolean v1, Lcom/baidu/location/Jni;->er:Z

    :try_start_0
    const-string v0, "locSDK4"

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/UnsatisfiedLinkError;->printStackTrace()V

    sput-boolean v2, Lcom/baidu/location/Jni;->er:Z

    goto :goto_0
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static native a([BI)Ljava/lang/String;
.end method

.method private static native b(DDII)Ljava/lang/String;
.end method

.method private static native c([BI)Ljava/lang/String;
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-boolean v0, Lcom/baidu/location/Jni;->er:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const-string v0, "err!"

    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    #v0=(Reference);
    const v1, 0x20568

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/baidu/location/Jni;->c([BI)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const/16 v0, 0x2e4

    #v0=(PosShort);
    const/4 v2, 0x0

    #v2=(Null);
    sget-boolean v1, Lcom/baidu/location/Jni;->er:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const-string v0, "err!"

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_0
    #v0=(PosShort);v1=(Boolean);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    #v3=(Reference);
    sget v1, Lcom/baidu/location/Jni;->eo:I

    #v1=(Integer);
    new-array v4, v1, [B

    #v4=(Reference);
    array-length v1, v3

    if-le v1, v0, :cond_3

    :goto_1
    #v0=(Integer);
    move v1, v2

    :goto_2
    #v2=(Integer);v5=(Conflicted);
    if-ge v2, v0, :cond_2

    aget-byte v5, v3, v2

    #v5=(Byte);
    if-eqz v5, :cond_1

    aget-byte v5, v3, v2

    aput-byte v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    #v5=(Conflicted);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const v1, 0x20568

    invoke-static {v4, v1}, Lcom/baidu/location/Jni;->a([BI)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|tp=3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    #v0=(PosShort);v1=(Integer);v2=(Null);v5=(Uninit);
    move v0, v1

    #v0=(Integer);
    goto :goto_1
.end method

.method public static if(DDLjava/lang/String;)[D
    .locals 7

    const/4 v0, 0x2

    #v0=(PosByte);
    new-array v6, v0, [D

    #v6=(Reference);
    fill-array-data v6, :array_0

    sget-boolean v0, Lcom/baidu/location/Jni;->er:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    move-object v0, v6

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const/4 v4, -0x1

    #v4=(Byte);
    const-string v0, "bd09"

    #v0=(Reference);
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    sget v4, Lcom/baidu/location/Jni;->eu:I

    :cond_1
    :goto_1
    #v4=(Integer);
    const v5, 0x20568

    #v5=(Integer);
    move-wide v0, p0

    #v0=(DoubleLo);v1=(DoubleHi);
    move-wide v2, p2

    :try_start_0
    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-static/range {v0 .. v5}, Lcom/baidu/location/Jni;->b(DDII)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v1, ":"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    aget-object v2, v0, v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    #v2=(DoubleLo);
    aput-wide v2, v6, v1

    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x1

    #v2=(One);
    aget-object v0, v0, v2

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    #v2=(DoubleLo);
    aput-wide v2, v6, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    move-object v0, v6

    goto :goto_0

    :cond_2
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Byte);v5=(Uninit);
    const-string v0, "bd09ll"

    #v0=(Reference);
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    sget v4, Lcom/baidu/location/Jni;->es:I

    #v4=(Integer);
    goto :goto_1

    :cond_3
    #v4=(Byte);
    const-string v0, "gcj02"

    #v0=(Reference);
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    sget v4, Lcom/baidu/location/Jni;->et:I

    #v4=(Integer);
    goto :goto_1

    :cond_4
    #v4=(Byte);
    const-string v0, "gps2gcj"

    #v0=(Reference);
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    sget v4, Lcom/baidu/location/Jni;->ep:I

    #v4=(Integer);
    goto :goto_1

    :cond_5
    #v4=(Byte);
    const-string v0, "bd092gcj"

    #v0=(Reference);
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_6

    sget v4, Lcom/baidu/location/Jni;->eq:I

    #v4=(Integer);
    goto :goto_1

    :cond_6
    #v4=(Byte);
    const-string v0, "bd09ll2gcj"

    #v0=(Reference);
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    sget v4, Lcom/baidu/location/Jni;->en:I

    #v4=(Integer);
    goto :goto_1

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(DoubleHi);v5=(Integer);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    :array_0
    .array-data 0x8
        0x0t 0x0t 0x0t 0x0t 0x0t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x0t 0x0t 0x0t 0x0t 0x0t 0x0t
    .end array-data
.end method

*/}
