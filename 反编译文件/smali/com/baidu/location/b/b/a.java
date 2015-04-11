package com.baidu.location.b.b; class a {/*

.class public final Lcom/baidu/location/b/b/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "AES"

.field private static final if:Ljava/lang/String; = "AES/CBC/PKCS5Padding"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[B)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    #v0=(UninitRef);
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    #v1=(Reference);
    const-string v2, "AES"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    #v0=(Reference);
    const-string v1, "AES/CBC/PKCS5Padding"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    #v2=(UninitRef);
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    #v2=(Reference);
    const/4 v3, 0x2

    #v3=(PosByte);
    invoke-virtual {v1, v3, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v1, p2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static if(Ljava/lang/String;Ljava/lang/String;[B)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    #v0=(UninitRef);
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    #v1=(Reference);
    const-string v2, "AES"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    #v0=(Reference);
    const-string v1, "AES/CBC/PKCS5Padding"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    #v2=(UninitRef);
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v3, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v1, p2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    return-object v0
.end method

*/}
