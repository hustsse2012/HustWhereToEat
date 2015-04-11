package com.baidu.mapapi.utils; class g {/*

.class Lcom/baidu/mapapi/utils/g;
.super Lorg/apache/http/conn/ssl/SSLSocketFactory;


# instance fields
.field a:Ljavax/net/ssl/SSLContext;


# direct methods
.method public constructor <init>(Ljava/security/KeyStore;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyManagementException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/UnrecoverableKeyException;
        }
    .end annotation

    const/4 v4, 0x0

    #v4=(Null);
    invoke-direct {p0, p1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V

    #p0=(Reference);
    const-string v0, "TLS"

    #v0=(Reference);
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/utils/g;->a:Ljavax/net/ssl/SSLContext;

    new-instance v0, Lcom/baidu/mapapi/utils/h;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/mapapi/utils/h;-><init>(Lcom/baidu/mapapi/utils/g;)V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/utils/g;->a:Ljavax/net/ssl/SSLContext;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    new-array v2, v2, [Ljavax/net/ssl/TrustManager;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    aput-object v0, v2, v3

    invoke-virtual {v1, v4, v2, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    return-void
.end method


# virtual methods
.method public createSocket()Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/utils/g;->a:Ljavax/net/ssl/SSLContext;

    #v0=(Reference);
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/utils/g;->a:Ljavax/net/ssl/SSLContext;

    #v0=(Reference);
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

*/}
