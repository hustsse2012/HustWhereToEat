package com.baidu.mapapi; class b {/*

.class public Lcom/baidu/mapapi/b;
.super Landroid/content/BroadcastReceiver;


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/baidu/mapapi/b;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapapi/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lcom/baidu/platform/comapi/d/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->e()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/baidu/platform/comapi/d/c;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/b;->a(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/baidu/platform/comapi/d/a;->a(Landroid/content/Context;)V

    return-void
.end method

*/}
