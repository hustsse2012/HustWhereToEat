package com.baidu.location; class q {/*

.class public Lcom/baidu/location/q;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/q$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-static {p0, v0}, Lcom/baidu/location/q;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "%s;%s"

    #v2=(Reference);
    const/4 v3, 0x2

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    aput-object v1, v3, v4

    const/4 v1, 0x1

    #v1=(One);
    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const/4 v2, 0x0

    #v2=(Null);
    const-string v1, ""

    :try_start_0
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    #v0=(Reference);
    const/16 v3, 0x40

    #v3=(PosByte);
    invoke-virtual {v0, p1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const-string v3, "X.509"

    #v3=(Reference);
    invoke-static {v3}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v3

    new-instance v4, Ljava/io/ByteArrayInputStream;

    #v4=(UninitRef);
    const/4 v5, 0x0

    #v5=(Null);
    aget-object v0, v0, v5

    #v0=(Null);
    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    #v0=(Reference);
    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-static {v0}, Lcom/baidu/location/q;->a(Ljava/security/cert/X509Certificate;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    new-instance v3, Ljava/lang/StringBuffer;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    #v3=(Reference);
    move v1, v2

    :goto_1
    #v1=(Integer);v2=(Conflicted);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-ge v1, v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    #v2=(Char);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    if-lez v1, :cond_0

    rem-int/lit8 v2, v1, 0x2

    #v2=(Integer);
    const/4 v4, 0x1

    #v4=(One);
    if-ne v2, v4, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    const-string v2, ":"

    #v2=(Reference);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    #v2=(Conflicted);v4=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_0
    #v0=(Conflicted);v1=(Reference);v2=(Null);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    goto :goto_0

    :catch_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    goto :goto_0

    :cond_1
    #v1=(Integer);v2=(Integer);v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static a(Ljava/security/cert/X509Certificate;)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getEncoded()[B

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/q;->a([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/location/q$a;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method static a([B)[B
    .locals 1

    :try_start_0
    const-string v0, "SHA1"

    #v0=(Reference);
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
