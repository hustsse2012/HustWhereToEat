package com.baidu.mapapi.search; class a {/*

.class public Lcom/baidu/mapapi/search/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/search/a$a;
    }
.end annotation


# static fields
.field static a:Landroid/content/Context;

.field static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Lcom/baidu/mapapi/search/j;",
            ">;>;"
        }
    .end annotation
.end field

.field public static c:Z

.field public static d:I

.field public static e:Z

.field public static f:B

.field public static g:Ljava/lang/String;

.field public static h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/search/a;->b:Ljava/util/HashMap;

    sput-boolean v1, Lcom/baidu/mapapi/search/a;->c:Z

    const/4 v0, 0x4

    #v0=(PosByte);
    sput v0, Lcom/baidu/mapapi/search/a;->d:I

    sput-boolean v1, Lcom/baidu/mapapi/search/a;->e:Z

    sput-byte v1, Lcom/baidu/mapapi/search/a;->f:B

    const-string v0, "10.0.0.200"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    const/16 v0, 0x50

    #v0=(PosByte);
    sput v0, Lcom/baidu/mapapi/search/a;->h:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-boolean v0, Lcom/baidu/mapapi/search/a;->c:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-static {}, Lcom/baidu/mapapi/search/a;->b()V

    sget-boolean v0, Lcom/baidu/mapapi/search/a;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    sget-boolean v0, Lcom/baidu/mapapi/search/a;->e:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x7

    #v0=(PosByte);
    const/16 v1, 0x2f

    #v1=(PosByte);
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    #v2=(Integer);
    if-gez v2, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const-string v0, ""

    :goto_1
    #v0=(Reference);
    sget-byte v2, Lcom/baidu/mapapi/search/a;->f:B

    #v2=(Byte);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v2, v3, :cond_2

    new-instance v0, Ljava/net/Proxy;

    #v0=(UninitRef);
    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v2, Ljava/net/InetSocketAddress;

    #v2=(UninitRef);
    sget-object v3, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    #v3=(Reference);
    const/16 v4, 0x50

    #v4=(PosByte);
    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    #v0=(Reference);
    new-instance v1, Ljava/net/URL;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    goto :goto_0

    :cond_1
    #v0=(PosByte);v1=(PosByte);v2=(Integer);v3=(Uninit);v4=(Uninit);
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto :goto_1

    :cond_2
    #v2=(Byte);v3=(One);
    new-instance v2, Ljava/net/URL;

    #v2=(UninitRef);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "http://"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    const-string v2, "X-Online-Host"

    invoke-virtual {v0, v2, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    new-instance v0, Ljava/net/URL;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    goto :goto_0
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/mapapi/search/a;->a:Landroid/content/Context;

    sget-object v0, Lcom/baidu/mapapi/search/a;->b:Ljava/util/HashMap;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public static a(IILjava/lang/String;Lcom/baidu/mapapi/search/a$a;)V
    .locals 1

    if-eqz p2, :cond_0

    const-string v0, "http://"

    #v0=(Reference);
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);
    new-instance v0, Lcom/baidu/mapapi/search/b;

    #v0=(UninitRef);
    invoke-direct {v0, p2, p3, p0, p1}, Lcom/baidu/mapapi/search/b;-><init>(Ljava/lang/String;Lcom/baidu/mapapi/search/a$a;II)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/search/b;->start()V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    sput-object p0, Lcom/baidu/mapapi/search/a;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/net/NetworkInfo;Z)V
    .locals 2

    const/4 v1, 0x1

    #v1=(One);
    sput-boolean p1, Lcom/baidu/mapapi/search/a;->c:Z

    :try_start_0
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    #v0=(Integer);
    if-ne v0, v1, :cond_1

    const/4 v0, 0x4

    #v0=(PosByte);
    sput v0, Lcom/baidu/mapapi/search/a;->d:I

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/baidu/mapapi/search/a;->e:Z

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Integer);v1=(One);
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_4

    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/baidu/mapapi/search/a;->d:I

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v0

    #v0=(Integer);
    sput v0, Lcom/baidu/mapapi/search/a;->h:I

    sget-object v0, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_3

    const-string v0, ""

    sget-object v1, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_3

    const/4 v0, 0x2

    #v0=(PosByte);
    sput v0, Lcom/baidu/mapapi/search/a;->d:I

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/baidu/mapapi/search/a;->e:Z

    const-string v0, "10.0.0.200"

    #v0=(Reference);
    sget-object v1, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    sput-byte v0, Lcom/baidu/mapapi/search/a;->f:B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_2
    #v0=(Boolean);v1=(Reference);
    const/4 v0, 0x0

    :try_start_1
    #v0=(Null);
    sput-byte v0, Lcom/baidu/mapapi/search/a;->f:B

    goto :goto_0

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    sput v0, Lcom/baidu/mapapi/search/a;->d:I

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/baidu/mapapi/search/a;->e:Z

    goto :goto_0

    :cond_4
    #v0=(Reference);v1=(One);
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cmwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_5

    const-string v1, "uniwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_5

    const-string v1, "3gwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_6

    :cond_5
    const/4 v0, 0x2

    #v0=(PosByte);
    sput v0, Lcom/baidu/mapapi/search/a;->d:I

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/baidu/mapapi/search/a;->e:Z

    const/4 v0, 0x0

    #v0=(Null);
    sput-byte v0, Lcom/baidu/mapapi/search/a;->f:B

    const-string v0, "10.0.0.172"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    goto :goto_0

    :cond_6
    const-string v1, "ctwap"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_7

    const/4 v0, 0x2

    #v0=(PosByte);
    sput v0, Lcom/baidu/mapapi/search/a;->d:I

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/baidu/mapapi/search/a;->e:Z

    const/4 v0, 0x1

    sput-byte v0, Lcom/baidu/mapapi/search/a;->f:B

    const-string v0, "10.0.0.200"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/search/a;->g:Ljava/lang/String;

    goto/16 :goto_0

    :cond_7
    const-string v1, "cmnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_8

    const-string v1, "uninet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_8

    const-string v1, "ctnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_8

    const-string v1, "3gnet"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    :cond_8
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    sput v0, Lcom/baidu/mapapi/search/a;->d:I

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/baidu/mapapi/search/a;->e:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method

.method public static b()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/mapapi/search/a;->a:Landroid/content/Context;

    #v1=(Reference);
    if-eqz v1, :cond_0

    sget-object v0, Lcom/baidu/mapapi/search/a;->a:Landroid/content/Context;

    #v0=(Reference);
    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    :cond_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    #v1=(Boolean);
    invoke-static {v0, v1}, Lcom/baidu/mapapi/search/a;->a(Landroid/net/NetworkInfo;Z)V

    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_1
    #v1=(Reference);
    sput-boolean v2, Lcom/baidu/mapapi/search/a;->c:Z

    goto :goto_0

    :cond_2
    sput-boolean v2, Lcom/baidu/mapapi/search/a;->c:Z

    goto :goto_0
.end method

*/}
