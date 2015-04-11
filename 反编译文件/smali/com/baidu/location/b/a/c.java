package com.baidu.location.b.a; class c {/*

.class public final Lcom/baidu/location/b/a/c;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a([BLjava/lang/String;Z)Ljava/lang/String;
    .locals 6

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    array-length v3, p0

    #v3=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
    if-ge v1, v3, :cond_2

    aget-byte v0, p0, v1

    #v0=(Byte);
    and-int/lit16 v0, v0, 0xff

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz p2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    #v4=(Integer);
    const/4 v5, 0x1

    #v5=(One);
    if-ne v4, v5, :cond_1

    const-string v4, "0"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    #v4=(Conflicted);
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_2
    #v5=(Conflicted);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static a([BZ)Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "MD5"

    #v0=(Reference);
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    const-string v1, ""

    #v1=(Reference);
    invoke-static {v0, v1, p1}, Lcom/baidu/location/b/a/c;->a([BLjava/lang/String;Z)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1
.end method

*/}
