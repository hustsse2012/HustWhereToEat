package com.baidu.location; class d {/*

.class Lcom/baidu/location/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/am;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/d$1;,
        Lcom/baidu/location/d$a;,
        Lcom/baidu/location/d$b;
    }
.end annotation


# static fields
.field private static a:Lcom/baidu/location/d;


# instance fields
.field final do:Landroid/os/Handler;

.field private for:Z

.field private if:Z

.field private int:Z

.field private new:Z

.field private try:Lcom/baidu/location/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/d;->a:Lcom/baidu/location/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/d;->try:Lcom/baidu/location/d$a;

    iput-boolean v1, p0, Lcom/baidu/location/d;->int:Z

    iput-boolean v1, p0, Lcom/baidu/location/d;->for:Z

    iput-boolean v1, p0, Lcom/baidu/location/d;->new:Z

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/d;->if:Z

    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/d;->do:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/baidu/location/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/d;->try()V

    return-void
.end method

.method static synthetic a(Lcom/baidu/location/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/d;->new:Z

    return p1
.end method

.method static synthetic do(Lcom/baidu/location/d;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/d;->int:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic if(Lcom/baidu/location/d;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/d;->if:Z

    #v0=(Boolean);
    return v0
.end method

.method public static new()Lcom/baidu/location/d;
    .locals 1

    sget-object v0, Lcom/baidu/location/d;->a:Lcom/baidu/location/d;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/d;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/d;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/d;->a:Lcom/baidu/location/d;

    :cond_0
    sget-object v0, Lcom/baidu/location/d;->a:Lcom/baidu/location/d;

    return-object v0
.end method

.method private try()V
    .locals 5

    const/4 v4, 0x1

    #v4=(One);
    sget-object v1, Landroid/net/NetworkInfo$State;->UNKNOWN:Landroid/net/NetworkInfo$State;

    :try_start_0
    #v1=(Reference);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v2, "connectivity"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v2=(Conflicted);
    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v1, v0, :cond_1

    iget-boolean v0, p0, Lcom/baidu/location/d;->int:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    :goto_1
    #v0=(Conflicted);v3=(Conflicted);
    return-void

    :catch_0
    #v3=(Uninit);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    goto :goto_0

    :cond_0
    #v0=(Boolean);
    iput-boolean v4, p0, Lcom/baidu/location/d;->int:Z

    iget-object v0, p0, Lcom/baidu/location/d;->do:Landroid/os/Handler;

    #v0=(Reference);
    new-instance v1, Lcom/baidu/location/d$b;

    #v1=(UninitRef);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {v1, p0, v2}, Lcom/baidu/location/d$b;-><init>(Lcom/baidu/location/d;Lcom/baidu/location/d$1;)V

    #v1=(Reference);
    sget v2, Lcom/baidu/location/b;->ao:I

    #v2=(Integer);
    int-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-boolean v4, p0, Lcom/baidu/location/d;->new:Z

    goto :goto_1

    :cond_1
    #v2=(Conflicted);v3=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/d;->int:Z

    goto :goto_1
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/d;->if:Z

    return-void
.end method

.method public do()V
    .locals 4

    const/4 v3, 0x1

    :try_start_0
    #v3=(One);
    new-instance v0, Lcom/baidu/location/d$a;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/d$a;-><init>(Lcom/baidu/location/d;Lcom/baidu/location/d$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/d;->try:Lcom/baidu/location/d$a;

    new-instance v0, Landroid/content/IntentFilter;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    #v0=(Reference);
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/d;->try:Lcom/baidu/location/d$a;

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/d;->for:Z

    invoke-direct {p0}, Lcom/baidu/location/d;->try()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iput-boolean v3, p0, Lcom/baidu/location/d;->if:Z

    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public for()V
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/d;->try:Lcom/baidu/location/d$a;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/d$a;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/d$a;-><init>(Lcom/baidu/location/d;Lcom/baidu/location/d$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/d;->try:Lcom/baidu/location/d$a;

    :cond_0
    :try_start_0
    #v1=(Conflicted);
    iget-boolean v0, p0, Lcom/baidu/location/d;->for:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    new-instance v0, Landroid/content/IntentFilter;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    #v0=(Reference);
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/d;->try:Lcom/baidu/location/d$a;

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-direct {p0}, Lcom/baidu/location/d;->try()V

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/d;->for:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public if()V
    .locals 5

    const/4 v4, 0x1

    #v4=(One);
    iput-boolean v4, p0, Lcom/baidu/location/d;->if:Z

    iget-boolean v0, p0, Lcom/baidu/location/d;->new:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-boolean v0, p0, Lcom/baidu/location/d;->if:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/d;->do:Landroid/os/Handler;

    #v0=(Reference);
    new-instance v1, Lcom/baidu/location/d$b;

    #v1=(UninitRef);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {v1, p0, v2}, Lcom/baidu/location/d$b;-><init>(Lcom/baidu/location/d;Lcom/baidu/location/d$1;)V

    #v1=(Reference);
    sget v2, Lcom/baidu/location/b;->ao:I

    #v2=(Integer);
    int-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-boolean v4, p0, Lcom/baidu/location/d;->new:Z

    goto :goto_0
.end method

.method public int()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/d;->try:Lcom/baidu/location/d$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/d;->if:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/location/d;->try:Lcom/baidu/location/d$a;

    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

*/}
