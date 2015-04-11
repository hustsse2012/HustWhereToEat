package com.baidu.platform.comapi.d; class a {/*

.class public Lcom/baidu/platform/comapi/d/a;
.super Ljava/lang/Object;


# static fields
.field public static a:Z

.field public static b:Ljava/lang/String;

.field public static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    sput-boolean v1, Lcom/baidu/platform/comapi/d/a;->a:Z

    const-string v0, ""

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/d/a;->b:Ljava/lang/String;

    sput v1, Lcom/baidu/platform/comapi/d/a;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 8

    const/4 v7, 0x0

    #v7=(Null);
    const/16 v6, 0x50

    #v6=(PosByte);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-static {p0}, Lcom/baidu/platform/comapi/d/a;->b(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "wifi"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v7, v4}, Lcom/baidu/platform/comjni/engine/AppEngine;->SetProxyInfo(Ljava/lang/String;I)V

    sput-boolean v4, Lcom/baidu/platform/comapi/d/a;->a:Z

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Reference);v2=(Boolean);v3=(Uninit);
    const-string v2, "mobile"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_2

    const-string v2, "wifi"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/baidu/platform/comapi/d/a;->a(Landroid/net/NetworkInfo;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    #v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v0

    sput-boolean v4, Lcom/baidu/platform/comapi/d/a;->a:Z

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cmwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    const-string v1, "uniwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    const-string v1, "3gwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_5

    :cond_3
    const-string v0, "10.0.0.172"

    sput-object v0, Lcom/baidu/platform/comapi/d/a;->b:Ljava/lang/String;

    sput v6, Lcom/baidu/platform/comapi/d/a;->c:I

    sput-boolean v5, Lcom/baidu/platform/comapi/d/a;->a:Z

    :cond_4
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    sget-boolean v0, Lcom/baidu/platform/comapi/d/a;->a:Z

    #v0=(Boolean);
    if-ne v0, v5, :cond_a

    sget-object v0, Lcom/baidu/platform/comapi/d/a;->b:Ljava/lang/String;

    #v0=(Reference);
    sget v1, Lcom/baidu/platform/comapi/d/a;->c:I

    #v1=(Integer);
    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/AppEngine;->SetProxyInfo(Ljava/lang/String;I)V

    goto :goto_0

    :cond_5
    #v1=(Boolean);v3=(Uninit);
    const-string v1, "ctwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_6

    const-string v0, "10.0.0.200"

    sput-object v0, Lcom/baidu/platform/comapi/d/a;->b:Ljava/lang/String;

    sput v6, Lcom/baidu/platform/comapi/d/a;->c:I

    sput-boolean v5, Lcom/baidu/platform/comapi/d/a;->a:Z

    goto :goto_1

    :cond_6
    const-string v1, "cmnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_7

    const-string v1, "uninet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_7

    const-string v1, "ctnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_7

    const-string v1, "3gnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    :cond_7
    #v0=(Conflicted);v1=(Conflicted);
    sput-boolean v4, Lcom/baidu/platform/comapi/d/a;->a:Z

    goto :goto_1

    :cond_8
    #v0=(Reference);
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v1

    #v1=(Integer);
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_4

    const-string v2, "10.0.0.172"

    #v2=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_9

    const-string v0, "10.0.0.172"

    sput-object v0, Lcom/baidu/platform/comapi/d/a;->b:Ljava/lang/String;

    sput v1, Lcom/baidu/platform/comapi/d/a;->c:I

    sput-boolean v5, Lcom/baidu/platform/comapi/d/a;->a:Z

    goto :goto_1

    :cond_9
    const-string v1, "10.0.0.200"

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    const-string v0, "10.0.0.200"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/d/a;->b:Ljava/lang/String;

    sput v6, Lcom/baidu/platform/comapi/d/a;->c:I

    sput-boolean v5, Lcom/baidu/platform/comapi/d/a;->a:Z

    goto :goto_1

    :cond_a
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-static {v7, v4}, Lcom/baidu/platform/comjni/engine/AppEngine;->SetProxyInfo(Ljava/lang/String;I)V

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;Lorg/apache/http/params/HttpParams;)V
    .locals 5

    const/16 v4, 0x50

    #v4=(PosByte);
    invoke-static {p0}, Lcom/baidu/platform/comapi/d/a;->b(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Reference);v2=(Uninit);v3=(Uninit);
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v1, "cmwap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    const-string v1, "uniwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    const-string v1, "3gwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    :cond_2
    new-instance v0, Lorg/apache/http/HttpHost;

    #v0=(UninitRef);
    const-string v1, "10.0.0.172"

    #v1=(Reference);
    invoke-direct {v0, v1, v4}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    const-string v1, "http.route.default-proxy"

    invoke-interface {p1, v1, v0}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    goto :goto_0

    :cond_3
    #v1=(Boolean);
    const-string v1, "ctwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    new-instance v0, Lorg/apache/http/HttpHost;

    #v0=(UninitRef);
    const-string v1, "10.0.0.200"

    #v1=(Reference);
    invoke-direct {v0, v1, v4}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    const-string v1, "http.route.default-proxy"

    invoke-interface {p1, v1, v0}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    goto :goto_0

    :cond_4
    #v1=(Boolean);
    const-string v1, "cmnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "uninet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "ctnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "3gnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    :cond_5
    #v0=(Conflicted);
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v1

    #v1=(Integer);
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_0

    const-string v2, "10.0.0.172"

    #v2=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_6

    new-instance v0, Lorg/apache/http/HttpHost;

    #v0=(UninitRef);
    const-string v2, "10.0.0.172"

    #v2=(Reference);
    invoke-direct {v0, v2, v1}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    const-string v1, "http.route.default-proxy"

    #v1=(Reference);
    invoke-interface {p1, v1, v0}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    goto/16 :goto_0

    :cond_6
    #v1=(Integer);v2=(Boolean);
    const-string v1, "10.0.0.200"

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    new-instance v0, Lorg/apache/http/HttpHost;

    #v0=(UninitRef);
    const-string v1, "10.0.0.200"

    invoke-direct {v0, v1, v4}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    const-string v1, "http.route.default-proxy"

    invoke-interface {p1, v1, v0}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    goto/16 :goto_0
.end method

.method private static a(Landroid/net/NetworkInfo;)Z
    .locals 3

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    #v2=(Integer);
    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    move v1, v0

    :goto_1
    #v0=(Conflicted);v1=(Boolean);
    return v1

    :cond_0
    #v0=(One);v1=(Null);v2=(Integer);
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :catch_0
    #v0=(One);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_1

    :cond_1
    #v0=(One);v2=(Uninit);
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Landroid/net/NetworkInfo;
    .locals 2

    const-string v0, "connectivity"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    move-object v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {p0}, Lcom/baidu/platform/comapi/d/a;->b(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    #v2=(Integer);
    if-ne v2, v0, :cond_0

    :goto_0
    #v0=(PosByte);v2=(Conflicted);
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(One);v2=(Integer);
    const-string v0, "phone"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    :cond_1
    #v2=(Conflicted);
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :pswitch_0
    #v0=(Integer);v2=(Integer);
    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_0

    :pswitch_1
    #v0=(Integer);
    const/4 v0, 0x4

    #v0=(PosByte);
    goto :goto_0

    :pswitch_2
    #v0=(Integer);
    const/4 v0, 0x5

    #v0=(PosByte);
    goto :goto_0

    :pswitch_3
    #v0=(Integer);
    const/4 v0, 0x6

    #v0=(PosByte);
    goto :goto_0

    :pswitch_4
    #v0=(Integer);
    const/4 v0, 0x7

    #v0=(PosByte);
    goto :goto_0

    :pswitch_5
    #v0=(Integer);
    const/16 v0, 0x8

    #v0=(PosByte);
    goto :goto_0

    :pswitch_6
    #v0=(Integer);
    const/16 v0, 0x9

    #v0=(PosByte);
    goto :goto_0

    :pswitch_7
    #v0=(Integer);
    const/16 v0, 0xa

    #v0=(PosByte);
    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

*/}
