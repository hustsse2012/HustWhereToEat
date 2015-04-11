package com.baidu.location; class ai {/*

.class Lcom/baidu/location/ai;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/ai$1;,
        Lcom/baidu/location/ai$b;,
        Lcom/baidu/location/ai$a;
    }
.end annotation


# static fields
.field private static final f0:I = 0xf

.field private static f8:Lcom/baidu/location/ai;


# instance fields
.field private f1:Z

.field private f2:Lcom/baidu/location/ai$b;

.field private f3:Ljava/lang/Object;

.field private final f4:J

.field private f5:J

.field private final f6:J

.field private f7:Landroid/net/wifi/WifiManager;

.field private f9:Ljava/lang/reflect/Method;

.field private final fZ:J

.field private ga:Z

.field private gb:J

.field private gc:Lcom/baidu/location/ai$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/ai;->f8:Lcom/baidu/location/ai;

    return-void
.end method

.method private constructor <init>()V
    .locals 5

    const-wide/16 v0, 0xbb8

    #v0=(LongLo);v1=(LongHi);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-wide v0, p0, Lcom/baidu/location/ai;->fZ:J

    iput-wide v0, p0, Lcom/baidu/location/ai;->f4:J

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/baidu/location/ai;->f6:J

    iput-object v2, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    iput-object v2, p0, Lcom/baidu/location/ai;->gc:Lcom/baidu/location/ai$a;

    iput-object v2, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    iput-wide v3, p0, Lcom/baidu/location/ai;->f5:J

    iput-wide v3, p0, Lcom/baidu/location/ai;->gb:J

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/ai;->ga:Z

    iput-object v2, p0, Lcom/baidu/location/ai;->f3:Ljava/lang/Object;

    iput-object v2, p0, Lcom/baidu/location/ai;->f9:Ljava/lang/reflect/Method;

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/ai;->f1:Z

    return-void
.end method

.method private a6()V
    .locals 4

    iget-object v0, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    :try_start_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    new-instance v1, Lcom/baidu/location/ai$b;

    #v1=(UninitRef);
    iget-wide v2, p0, Lcom/baidu/location/ai;->f5:J

    #v2=(LongLo);v3=(LongHi);
    invoke-direct {v1, p0, v0, v2, v3}, Lcom/baidu/location/ai$b;-><init>(Lcom/baidu/location/ai;Ljava/util/List;J)V

    #v1=(Reference);
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/baidu/location/ai;->f5:J

    iget-object v0, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    invoke-virtual {v1, v0}, Lcom/baidu/location/ai$b;->if(Lcom/baidu/location/ai$b;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    :cond_2
    #v0=(Conflicted);
    iput-object v1, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    goto :goto_0

    :catch_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    move-exception v0

    goto :goto_0
.end method

.method public static bb()Lcom/baidu/location/ai;
    .locals 1

    sget-object v0, Lcom/baidu/location/ai;->f8:Lcom/baidu/location/ai;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/ai;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/ai;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/ai;->f8:Lcom/baidu/location/ai;

    :cond_0
    sget-object v0, Lcom/baidu/location/ai;->f8:Lcom/baidu/location/ai;

    return-object v0
.end method

.method public static bf()Z
    .locals 4

    const/4 v2, 0x1

    #v2=(One);
    sget-object v1, Landroid/net/NetworkInfo$State;->UNKNOWN:Landroid/net/NetworkInfo$State;

    :try_start_0
    #v1=(Reference);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v3, "connectivity"

    #v3=(Reference);
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v3=(Conflicted);
    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v0, v1, :cond_0

    move v0, v2

    :goto_1
    #v0=(Boolean);
    return v0

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method static synthetic if(Lcom/baidu/location/ai;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/ai;->a6()V

    return-void
.end method


# virtual methods
.method public a4()Z
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/ai;->gb:J

    #v2=(LongLo);v3=(LongHi);
    sub-long v2, v0, v2

    const-wide/16 v4, 0x2710

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-gtz v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(LongLo);
    iput-wide v0, p0, Lcom/baidu/location/ai;->gb:J

    invoke-virtual {p0}, Lcom/baidu/location/ai;->a8()Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public a5()Z
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x3

    #v0=(PosByte);
    iget-object v1, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getWifiState()I

    move-result v1

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(PosByte);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public a7()Lcom/baidu/location/ai$b;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    invoke-virtual {v0}, Lcom/baidu/location/ai$b;->for()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    invoke-virtual {p0}, Lcom/baidu/location/ai;->be()Lcom/baidu/location/ai$b;

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_1
    #v0=(Boolean);
    iget-object v0, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    #v0=(Reference);
    goto :goto_0
.end method

.method public a8()Z
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iget-wide v3, p0, Lcom/baidu/location/ai;->f5:J

    #v3=(LongLo);v4=(LongHi);
    sub-long/2addr v1, v3

    const-wide/16 v3, 0xbb8

    cmp-long v1, v1, v3

    #v1=(Byte);
    if-lez v1, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/ai;->bc()Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public a9()V
    .locals 5

    const/4 v4, 0x1

    #v4=(One);
    iget-boolean v0, p0, Lcom/baidu/location/ai;->ga:Z

    #v0=(Boolean);
    if-ne v0, v4, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "wifi"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    new-instance v0, Lcom/baidu/location/ai$a;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/ai$a;-><init>(Lcom/baidu/location/ai;Lcom/baidu/location/ai$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/ai;->gc:Lcom/baidu/location/ai$a;

    :try_start_0
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/ai;->gc:Lcom/baidu/location/ai$a;

    #v1=(Reference);
    new-instance v2, Landroid/content/IntentFilter;

    #v2=(UninitRef);
    const-string v3, "android.net.wifi.SCAN_RESULTS"

    #v3=(Reference);
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    #v2=(Conflicted);v3=(Conflicted);
    iput-boolean v4, p0, Lcom/baidu/location/ai;->ga:Z

    :try_start_1
    const-string v0, "android.net.wifi.WifiManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "mService"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    iget-object v1, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/ai;->f3:Ljava/lang/Object;

    iget-object v0, p0, Lcom/baidu/location/ai;->f3:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "startScan"

    const/4 v2, 0x1

    #v2=(One);
    new-array v2, v2, [Ljava/lang/Class;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    #v4=(Reference);
    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/ai;->f9:Ljava/lang/reflect/Method;

    iget-object v0, p0, Lcom/baidu/location/ai;->f9:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ai;->f9:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    goto :goto_0

    :catch_1
    #v1=(Reference);v4=(One);
    move-exception v0

    goto :goto_1
.end method

.method public ba()Lcom/baidu/location/ai$b;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    invoke-virtual {v0}, Lcom/baidu/location/ai$b;->new()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    invoke-virtual {p0}, Lcom/baidu/location/ai;->be()Lcom/baidu/location/ai$b;

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_1
    #v0=(Boolean);
    iget-object v0, p0, Lcom/baidu/location/ai;->f2:Lcom/baidu/location/ai$b;

    #v0=(Reference);
    goto :goto_0
.end method

.method public bc()Z
    .locals 7

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    iget-object v2, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/baidu/location/ai;->f9:Ljava/lang/reflect/Method;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/location/ai;->f3:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_0

    :try_start_1
    iget-object v2, p0, Lcom/baidu/location/ai;->f9:Ljava/lang/reflect/Method;

    iget-object v3, p0, Lcom/baidu/location/ai;->f3:Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    iget-boolean v6, p0, Lcom/baidu/location/ai;->f1:Z

    #v6=(Boolean);
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    :try_start_2
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Lcom/baidu/location/ai;->f5:J

    :goto_1
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v0

    :catch_0
    #v0=(One);v2=(Reference);
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    iget-object v2, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->startScan()Z

    goto :goto_0

    :catch_1
    #v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move v0, v1

    #v0=(Null);
    goto :goto_1

    :cond_0
    #v0=(One);v2=(Reference);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    iget-object v2, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->startScan()Z

    goto :goto_0

    :cond_1
    #v2=(Boolean);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Lcom/baidu/location/ai;->f5:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move v0, v1

    #v0=(Null);
    goto :goto_1
.end method

.method public bd()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_1
    :try_start_0
    #v0=(Null);v2=(Uninit);v3=(Uninit);
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, ":"

    #v2=(Reference);
    const-string v3, ""

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    #v0=(Reference);
    goto :goto_0

    :catch_0
    #v0=(Null);v2=(Conflicted);v3=(Conflicted);
    move-exception v1

    goto :goto_0
.end method

.method public be()Lcom/baidu/location/ai$b;
    .locals 6

    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    iget-object v0, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v0=(Reference);
    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lcom/baidu/location/ai$b;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v1

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-direct {v0, p0, v1, v2, v3}, Lcom/baidu/location/ai$b;-><init>(Lcom/baidu/location/ai;Ljava/util/List;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    :cond_0
    #v0=(Reference);
    new-instance v0, Lcom/baidu/location/ai$b;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1, v4, v5}, Lcom/baidu/location/ai$b;-><init>(Lcom/baidu/location/ai;Ljava/util/List;J)V

    #v0=(Reference);
    goto :goto_0
.end method

.method public bg()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iget-boolean v0, p0, Lcom/baidu/location/ai;->ga:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_0
    :try_start_0
    #v1=(Uninit);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/ai;->gc:Lcom/baidu/location/ai$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    #v1=(Conflicted);
    iput-object v2, p0, Lcom/baidu/location/ai;->gc:Lcom/baidu/location/ai$a;

    iput-object v2, p0, Lcom/baidu/location/ai;->f7:Landroid/net/wifi/WifiManager;

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/ai;->ga:Z

    goto :goto_0

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_1
.end method

*/}
