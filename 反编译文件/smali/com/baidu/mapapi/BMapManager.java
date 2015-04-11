package com.baidu.mapapi; class BMapManager {/*

.class public Lcom/baidu/mapapi/BMapManager;
.super Ljava/lang/Object;


# instance fields
.field a:Lcom/baidu/mapapi/MKGeneralListener;

.field private b:Lcom/baidu/platform/comapi/a;

.field private c:Landroid/content/Context;

.field private d:Landroid/os/Handler;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Lcom/baidu/mapapi/utils/PermissionCheck;

.field private h:Z

.field private i:Lcom/baidu/mapapi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "BaiduMapSDK_v2_2_0"

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->b:Lcom/baidu/platform/comapi/a;

    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->d:Landroid/os/Handler;

    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->e:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->f:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->g:Lcom/baidu/mapapi/utils/PermissionCheck;

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/mapapi/BMapManager;->h:Z

    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->i:Lcom/baidu/mapapi/b;

    iput-object p1, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    return-void
.end method

.method private a()V
    .locals 3

    new-instance v0, Lcom/baidu/mapapi/b;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/b;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/BMapManager;->i:Lcom/baidu/mapapi/b;

    new-instance v0, Landroid/content/IntentFilter;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    #v0=(Reference);
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/baidu/mapapi/BMapManager;->i:Lcom/baidu/mapapi/b;

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    #v2=(Conflicted);
    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/BMapManager;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/BMapManager;->h:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic a(Lcom/baidu/mapapi/BMapManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/BMapManager;->h:Z

    return p1
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->i:Lcom/baidu/mapapi/b;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->i:Lcom/baidu/mapapi/b;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    #v1=(Conflicted);
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->d:Landroid/os/Handler;

    #v0=(Reference);
    if-eqz v0, :cond_0

    const/16 v0, 0x7d0

    #v0=(PosShort);
    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->d:Landroid/os/Handler;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    const/16 v0, 0x7da

    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->d:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    iput-object v2, p0, Lcom/baidu/mapapi/BMapManager;->d:Landroid/os/Handler;

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iput-object v2, p0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    :cond_1
    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->b()V

    invoke-direct {p0}, Lcom/baidu/mapapi/BMapManager;->b()V

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->b:Lcom/baidu/platform/comapi/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/a;->c()V

    invoke-static {}, Lcom/baidu/mapapi/search/a;->a()V

    return-void
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    #v0=(Reference);
    return-object v0
.end method

.method public init(Ljava/lang/String;Lcom/baidu/mapapi/MKGeneralListener;)Z
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    iput-object p1, p0, Lcom/baidu/mapapi/BMapManager;->e:Ljava/lang/String;

    :try_start_0
    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v2, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->f:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->b:Lcom/baidu/platform/comapi/a;

    if-nez v1, :cond_0

    new-instance v1, Lcom/baidu/platform/comapi/a;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/a;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->b:Lcom/baidu/platform/comapi/a;

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/baidu/mapapi/utils/b;->a(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/baidu/mapapi/search/a;->a(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/baidu/mapapi/BMapManager;->a:Lcom/baidu/mapapi/MKGeneralListener;

    new-instance v1, Lcom/baidu/mapapi/a;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/baidu/mapapi/a;-><init>(Lcom/baidu/mapapi/BMapManager;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->d:Landroid/os/Handler;

    const/16 v1, 0x7d0

    #v1=(PosShort);
    iget-object v2, p0, Lcom/baidu/mapapi/BMapManager;->d:Landroid/os/Handler;

    #v2=(Reference);
    invoke-static {v1, v2}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    const/16 v1, 0x7da

    iget-object v2, p0, Lcom/baidu/mapapi/BMapManager;->d:Landroid/os/Handler;

    invoke-static {v1, v2}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->b:Lcom/baidu/platform/comapi/a;

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/baidu/platform/comapi/a;->a(Landroid/content/Context;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    :goto_1
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :catch_0
    #v0=(Null);v2=(Conflicted);
    move-exception v1

    #v1=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, p0, Lcom/baidu/mapapi/BMapManager;->f:Ljava/lang/String;

    goto :goto_0

    :cond_1
    #v1=(Boolean);v2=(Reference);
    invoke-direct {p0}, Lcom/baidu/mapapi/BMapManager;->a()V

    invoke-virtual {p0}, Lcom/baidu/mapapi/BMapManager;->start()Z

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/utils/PermissionCheck;->setContext(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/baidu/mapapi/BMapManager;->c:Landroid/content/Context;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/utils/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/baidu/mapapi/utils/PermissionCheck;->InitParam(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/baidu/mapapi/utils/PermissionCheck;->check()Z

    move-result v0

    #v0=(Boolean);
    goto :goto_1
.end method

.method public start()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->b:Lcom/baidu/platform/comapi/a;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/a;->a()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public stop()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/BMapManager;->b:Lcom/baidu/platform/comapi/a;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/a;->b()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
