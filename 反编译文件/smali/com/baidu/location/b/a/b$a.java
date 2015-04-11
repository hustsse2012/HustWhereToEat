package com.baidu.location.b.a; class b$a {/*

.class final Lcom/baidu/location/b/a/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/b/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final do:Ljava/lang/String; = "bd_setting_i"


# instance fields
.field public final a:Z

.field public final if:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object p1, p0, Lcom/baidu/location/b/a/b$a;->if:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/baidu/location/b/a/b$a;->a:Z

    return-void
.end method

.method static a(Landroid/content/Context;)Lcom/baidu/location/b/a/b$a;
    .locals 7

    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    #v2=(Null);
    const-string v1, ""

    :try_start_0
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    #v0=(Reference);
    const-string v4, "bd_setting_i"

    #v4=(Reference);
    invoke-static {v0, v4}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const-string v0, ""

    #v0=(Reference);
    invoke-static {p0, v0}, Lcom/baidu/location/b/a/b$a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v4, "bd_setting_i"

    invoke-static {v1, v4, v0}, Landroid/provider/Settings$System;->putString(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move v1, v2

    :goto_1
    #v1=(Boolean);v5=(Conflicted);v6=(Conflicted);
    new-instance v4, Lcom/baidu/location/b/a/b$a;

    #v4=(UninitRef);
    if-nez v1, :cond_0

    :goto_2
    #v3=(Boolean);
    invoke-direct {v4, v0, v3}, Lcom/baidu/location/b/a/b$a;-><init>(Ljava/lang/String;Z)V

    #v4=(Reference);
    return-object v4

    :catch_0
    #v0=(Conflicted);v1=(Reference);v3=(One);v4=(Conflicted);v5=(Uninit);v6=(Uninit);
    move-exception v0

    #v0=(Reference);
    move-object v6, v0

    #v6=(Reference);
    move-object v0, v1

    move-object v1, v6

    :goto_3
    #v6=(Conflicted);
    const-string v4, "DeviceId"

    #v4=(Reference);
    const-string v5, "Settings.System.getString or putString failed"

    #v5=(Reference);
    invoke-static {v4, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    const-string v0, ""

    invoke-static {p0, v0}, Lcom/baidu/location/b/a/b$a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move v1, v3

    #v1=(One);
    goto :goto_1

    :cond_0
    #v1=(Boolean);v4=(UninitRef);v5=(Conflicted);
    move v3, v2

    #v3=(Null);
    goto :goto_2

    :catch_1
    #v1=(Reference);v3=(One);v4=(Reference);v5=(Uninit);v6=(Uninit);
    move-exception v1

    goto :goto_3

    :cond_1
    #v1=(Boolean);v5=(Reference);v6=(Conflicted);
    move v1, v3

    #v1=(One);
    goto :goto_1

    :cond_2
    #v0=(Boolean);v1=(Reference);v5=(Uninit);v6=(Uninit);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    const-string v0, "phone"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :goto_1
    return-object p1

    :catch_0
    #v0=(Conflicted);v1=(Null);v2=(Uninit);v3=(Uninit);
    move-exception v0

    #v0=(Reference);
    const-string v2, "DeviceId"

    #v2=(Reference);
    const-string v3, "Read IMEI failed"

    #v3=(Reference);
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);
    move-object v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_1
    #v0=(Reference);v1=(Boolean);
    move-object p1, v0

    goto :goto_1
.end method

*/}
