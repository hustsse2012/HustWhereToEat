package com.baidu.location; class o {/*

.class abstract Lcom/baidu/location/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# static fields
.field private static cJ:Ljava/lang/String;

.field private static cK:I

.field private static cQ:I


# instance fields
.field public cL:Ljava/lang/String;

.field public cM:Lorg/apache/http/HttpEntity;

.field private cN:Z

.field public cO:I

.field public cP:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/o;->cK:I

    const-string v0, "10.0.0.172"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/o;->cJ:Ljava/lang/String;

    const/16 v0, 0x50

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/o;->cQ:I

    return-void
.end method

.method constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/o;->cN:Z

    iput-object v1, p0, Lcom/baidu/location/o;->cL:Ljava/lang/String;

    const/4 v0, 0x3

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/o;->cO:I

    iput-object v1, p0, Lcom/baidu/location/o;->cM:Lorg/apache/http/HttpEntity;

    iput-object v1, p0, Lcom/baidu/location/o;->cP:Ljava/util/List;

    return-void
.end method

.method private P()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/location/o;->T()I

    move-result v0

    #v0=(Integer);
    sput v0, Lcom/baidu/location/o;->cK:I

    return-void
.end method

.method static synthetic Q()I
    .locals 1

    sget v0, Lcom/baidu/location/o;->cK:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic S()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/location/o;->cJ:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private T()I
    .locals 10

    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x4

    #v6=(PosByte);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v9

    :try_start_0
    #v9=(Reference);
    const-string v0, "connectivity"

    #v0=(Reference);
    invoke-virtual {v9, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    move v0, v6

    :goto_0
    #v0=(Integer);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v8

    #v8=(Reference);
    if-eqz v8, :cond_1

    :try_start_1
    invoke-virtual {v8}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_2

    :cond_1
    #v0=(Conflicted);
    move v0, v6

    #v0=(PosByte);
    goto :goto_0

    :cond_2
    #v0=(Boolean);
    invoke-virtual {v8}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    #v0=(Integer);
    if-ne v0, v7, :cond_3

    const/4 v0, 0x3

    #v0=(PosByte);
    goto :goto_0

    :cond_3
    #v0=(Integer);
    const-string v0, "content://telephony/carriers/preferapn"

    #v0=(Reference);
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v9}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_9

    const-string v0, "apn"

    #v0=(Reference);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "ctwap"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_6

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_5

    const-string v2, "null"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_5

    :goto_1
    sput-object v0, Lcom/baidu/location/o;->cJ:Ljava/lang/String;

    const/16 v0, 0x50

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/o;->cQ:I

    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    move v0, v7

    #v0=(One);
    goto :goto_0

    :cond_5
    #v0=(Reference);
    const-string v0, "10.0.0.200"

    goto :goto_1

    :cond_6
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "wap"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_9

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_8

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_8

    const-string v2, "null"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_8

    :goto_2
    #v2=(Conflicted);
    sput-object v0, Lcom/baidu/location/o;->cJ:Ljava/lang/String;

    const/16 v0, 0x50

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/o;->cQ:I

    if-eqz v1, :cond_7

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_7
    move v0, v7

    #v0=(One);
    goto/16 :goto_0

    :cond_8
    #v0=(Reference);
    const-string v0, "10.0.0.172"

    goto :goto_2

    :cond_9
    #v0=(Conflicted);
    if-eqz v1, :cond_a

    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :cond_a
    const/4 v0, 0x2

    #v0=(PosByte);
    goto/16 :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    :goto_3
    :try_start_2
    #v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
    invoke-static {v9, v0}, Lcom/baidu/location/o;->if(Landroid/content/Context;Landroid/net/NetworkInfo;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result v0

    #v0=(Integer);
    goto/16 :goto_0

    :catch_1
    #v0=(Reference);
    move-exception v0

    move v0, v6

    #v0=(PosByte);
    goto/16 :goto_0

    :catch_2
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move v0, v6

    #v0=(PosByte);
    goto/16 :goto_0

    :catch_3
    #v0=(Conflicted);v8=(Reference);
    move-exception v0

    #v0=(Reference);
    move-object v0, v8

    goto :goto_3
.end method

.method static synthetic U()I
    .locals 1

    sget v0, Lcom/baidu/location/o;->cQ:I

    #v0=(Integer);
    return v0
.end method

.method private static if(Landroid/content/Context;Landroid/net/NetworkInfo;)I
    .locals 5

    const/4 v0, 0x2

    #v0=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_6

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    const-string v3, "cmwap"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    const-string v3, "uniwap"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    const-string v3, "3gwap"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_3

    :cond_0
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_2

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_2

    const-string v2, "null"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_2

    :goto_0
    #v2=(Conflicted);
    sput-object v0, Lcom/baidu/location/o;->cJ:Ljava/lang/String;

    move v0, v1

    :cond_1
    :goto_1
    #v0=(PosByte);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_2
    #v0=(Reference);v3=(Boolean);v4=(Uninit);
    const-string v0, "10.0.0.172"

    goto :goto_0

    :cond_3
    #v0=(PosByte);v2=(Reference);
    const-string v3, "ctwap"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_5

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_4

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_4

    const-string v2, "null"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_4

    :goto_2
    #v2=(Conflicted);
    sput-object v0, Lcom/baidu/location/o;->cJ:Ljava/lang/String;

    move v0, v1

    #v0=(One);
    goto :goto_1

    :cond_4
    #v0=(Reference);
    const-string v0, "10.0.0.200"

    goto :goto_2

    :cond_5
    #v0=(PosByte);v2=(Reference);
    const-string v3, "cmnet"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    const-string v3, "uninet"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    const-string v3, "ctnet"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    const-string v3, "3gnet"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    :cond_6
    #v2=(Conflicted);v3=(Conflicted);
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    if-lez v3, :cond_1

    const-string v3, "10.0.0.172"

    #v3=(Reference);
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_7

    const-string v0, "10.0.0.172"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/o;->cJ:Ljava/lang/String;

    move v0, v1

    #v0=(One);
    goto :goto_1

    :cond_7
    #v0=(PosByte);
    const-string v3, "10.0.0.200"

    #v3=(Reference);
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    const-string v0, "10.0.0.200"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/o;->cJ:Ljava/lang/String;

    move v0, v1

    #v0=(One);
    goto :goto_1
.end method

.method static synthetic if(Lcom/baidu/location/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/o;->P()V

    return-void
.end method

.method public static if(Landroid/content/Context;)Z
    .locals 3

    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    const-string v0, "connectivity"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    return v0

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_0
    #v0=(Reference);v2=(Reference);
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method static synthetic if(Lcom/baidu/location/o;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/o;->cN:Z

    return p1
.end method


# virtual methods
.method public R()V
    .locals 1

    new-instance v0, Lcom/baidu/location/o$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/o$1;-><init>(Lcom/baidu/location/o;)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/o$1;->start()V

    return-void
.end method

.method abstract V()V
.end method

.method abstract if(Z)V
.end method

*/}
