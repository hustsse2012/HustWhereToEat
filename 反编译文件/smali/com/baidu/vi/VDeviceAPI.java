package com.baidu.vi; class VDeviceAPI {/*

.class public Lcom/baidu/vi/VDeviceAPI;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/os/PowerManager$WakeLock;

.field private static b:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/vi/VDeviceAPI;->a:Landroid/os/PowerManager$WakeLock;

    sput-object v0, Lcom/baidu/vi/VDeviceAPI;->b:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getAppVersion()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    :try_start_0
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static getAvailableMemory()J
    .locals 4

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "activity"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    new-instance v1, Landroid/app/ActivityManager$MemoryInfo;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v0, v1, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    #v0=(LongLo);v1=(LongHi);
    const-wide/16 v2, 0x400

    #v2=(LongLo);v3=(LongHi);
    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static getCachePath()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getCellId()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "phone"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Reference);v2=(Uninit);
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v0

    instance-of v1, v0, Landroid/telephony/gsm/GsmCellLocation;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, " "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    check-cast v0, Landroid/telephony/gsm/GsmCellLocation;

    invoke-virtual {v0}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    #v1=(Boolean);v2=(Uninit);
    const-string v0, " "

    goto :goto_0
.end method

.method public static getCurrentNetworkType()I
    .locals 2

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "connectivity"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

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
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_1
    #v0=(PosByte);
    return v0

    :catch_0
    #v0=(Reference);
    move-exception v0

    move-object v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_0
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_1

    :pswitch_0
    #v0=(Integer);
    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_1

    :pswitch_1
    #v0=(Integer);
    const/4 v0, 0x3

    #v0=(PosByte);
    goto :goto_1

    #v0=(Unknown);v1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getFreeSpace()J
    .locals 4

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Landroid/os/StatFs;

    #v1=(UninitRef);
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    #v0=(Integer);
    int-to-long v2, v0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    mul-long/2addr v0, v2

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static getImei()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "phone"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static getImsi()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "phone"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static getLac()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "phone"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Reference);v2=(Uninit);
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v0

    instance-of v1, v0, Landroid/telephony/gsm/GsmCellLocation;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    check-cast v0, Landroid/telephony/gsm/GsmCellLocation;

    invoke-virtual {v0}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    #v1=(Boolean);v2=(Uninit);
    const-string v0, ""

    goto :goto_0
.end method

.method public static getModuleFileName()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getNetworkInfo(I)Lcom/baidu/vi/c;
    .locals 3

    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v2, "connectivity"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    packed-switch p0, :pswitch_data_0

    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_0

    new-instance v0, Lcom/baidu/vi/c;

    #v0=(UninitRef);
    invoke-direct {v0, v2}, Lcom/baidu/vi/c;-><init>(Landroid/net/NetworkInfo;)V

    :goto_1
    #v0=(Reference);
    return-object v0

    :pswitch_0
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    move-object v2, v0

    #v2=(Reference);
    goto :goto_0

    :pswitch_1
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    move-object v2, v0

    #v2=(Reference);
    goto :goto_0

    :cond_0
    move-object v0, v1

    #v0=(Null);
    goto :goto_1

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static getOsVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "android"

    #v0=(Reference);
    return-object v0
.end method

.method public static getScreenBrightness()I
    .locals 4

    const/4 v0, -0x1

    #v0=(Byte);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    #v2=(Reference);
    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    const-string v3, "screen_brightness_mode"

    #v3=(Reference);
    invoke-static {v2, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v1

    :goto_0
    #v1=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v1, v3, :cond_0

    :goto_1
    #v0=(Integer);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Byte);v1=(Integer);
    const-string v1, "screen_brightness"

    :try_start_1
    #v1=(Reference);
    invoke-static {v2, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    #v0=(Integer);
    goto :goto_1

    :catch_0
    #v0=(Byte);
    move-exception v1

    goto :goto_1

    :catch_1
    #v1=(Null);v3=(Conflicted);
    move-exception v3

    #v3=(Reference);
    goto :goto_0
.end method

.method public static getScreenDensity()F
    .locals 3

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    new-instance v1, Landroid/util/DisplayMetrics;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    #v1=(Reference);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v2, "window"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    :cond_1
    iget v0, v1, Landroid/util/DisplayMetrics;->density:F

    #v0=(Integer);
    goto :goto_0
.end method

.method public static getScreenDensityDpi()I
    .locals 3

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    new-instance v1, Landroid/util/DisplayMetrics;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    #v1=(Reference);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v2, "window"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    :cond_1
    iget v0, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    #v0=(Integer);
    goto :goto_0
.end method

.method public static getSdcardFreeSpace()J
    .locals 4

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Landroid/os/StatFs;

    #v1=(UninitRef);
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    #v0=(Integer);
    int-to-long v2, v0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    mul-long/2addr v0, v2

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static getSdcardPath()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static getSdcardTotalSpace()J
    .locals 4

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Landroid/os/StatFs;

    #v1=(UninitRef);
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    #v0=(Integer);
    int-to-long v2, v0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    mul-long/2addr v0, v2

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static getSystemMetricsX()F
    .locals 3

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Float);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    new-instance v1, Landroid/util/DisplayMetrics;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    #v1=(Reference);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v2, "window"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    :cond_1
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    goto :goto_0
.end method

.method public static getSystemMetricsY()F
    .locals 3

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Float);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    new-instance v1, Landroid/util/DisplayMetrics;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    #v1=(Reference);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v2, "window"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    :cond_1
    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    goto :goto_0
.end method

.method public static getTotalMemory()J
    .locals 5

    const-string v2, "/proc/meminfo"

    #v2=(Reference);
    const-wide/16 v0, 0x0

    :try_start_0
    #v0=(LongLo);v1=(LongHi);
    new-instance v3, Ljava/io/FileReader;

    #v3=(UninitRef);
    invoke-direct {v3, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    new-instance v2, Ljava/io/BufferedReader;

    #v2=(UninitRef);
    const/16 v4, 0x2000

    #v4=(PosShort);
    invoke-direct {v2, v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "\\s+"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    #v4=(One);
    aget-object v3, v3, v4

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    int-to-long v0, v0

    :cond_0
    #v0=(LongLo);v4=(PosShort);
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v3=(Conflicted);v4=(Conflicted);
    return-wide v0

    :catch_0
    #v2=(Conflicted);
    move-exception v2

    #v2=(Reference);
    goto :goto_0
.end method

.method public static getTotalSpace()J
    .locals 4

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Landroid/os/StatFs;

    #v1=(UninitRef);
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    #v0=(Integer);
    int-to-long v2, v0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    mul-long/2addr v0, v2

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static getWifiHotpot()[Landroid/net/wifi/ScanResult;
    .locals 2

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "wifi"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    #v1=(Integer);
    new-array v1, v1, [Landroid/net/wifi/ScanResult;

    #v1=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/net/wifi/ScanResult;

    check-cast v0, [Landroid/net/wifi/ScanResult;

    return-object v0
.end method

.method public static isWifiConnected()Z
    .locals 2

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "connectivity"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public static makeCall(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "android.intent.action.DIAL"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "tel:"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    #v0=(Reference);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static native onNetworkStateChanged()V
.end method

.method public static openUrl(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "android.intent.action.VIEW"

    #v1=(Reference);
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    #v0=(Reference);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static sendMMS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    invoke-static {p0}, Landroid/telephony/PhoneNumberUtils;->isWellFormedSmsAddress(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(PosByte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_0
    :try_start_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    const-string v2, "android.intent.action.SEND"

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    const-string v2, "address"

    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "subject"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "sms_body"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.STREAM"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "file://"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    move-exception v0

    #v0=(Reference);
    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_0
.end method

.method public static sendSMS(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "android.intent.action.SENDTO"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "smsto:"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    #v0=(Reference);
    const-string v1, "sms_body"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static setNetworkChangedCallback()V
    .locals 3

    invoke-static {}, Lcom/baidu/vi/VDeviceAPI;->unsetNetworkChangedCallback()V

    new-instance v0, Lcom/baidu/vi/a;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/vi/a;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/vi/VDeviceAPI;->b:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    #v0=(UninitRef);
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/baidu/vi/VDeviceAPI;->b:Landroid/content/BroadcastReceiver;

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public static setScreenAlwaysOn(Z)V
    .locals 3

    if-eqz p0, :cond_2

    sget-object v0, Lcom/baidu/vi/VDeviceAPI;->a:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    if-nez v0, :cond_0

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "power"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    const/16 v1, 0xa

    #v1=(PosByte);
    const-string v2, "VDeviceAPI"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    sput-object v0, Lcom/baidu/vi/VDeviceAPI;->a:Landroid/os/PowerManager$WakeLock;

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    sget-object v0, Lcom/baidu/vi/VDeviceAPI;->a:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    :cond_1
    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    sget-object v0, Lcom/baidu/vi/VDeviceAPI;->a:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    if-eqz v0, :cond_1

    sget-object v0, Lcom/baidu/vi/VDeviceAPI;->a:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    sget-object v0, Lcom/baidu/vi/VDeviceAPI;->a:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/vi/VDeviceAPI;->a:Landroid/os/PowerManager$WakeLock;

    goto :goto_0
.end method

.method public static setupSoftware(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "android.intent.action.VIEW"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "application/vnd.android.package-archive"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static unsetNetworkChangedCallback()V
    .locals 2

    sget-object v0, Lcom/baidu/vi/VDeviceAPI;->b:Landroid/content/BroadcastReceiver;

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/vi/b;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/baidu/vi/VDeviceAPI;->b:Landroid/content/BroadcastReceiver;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/vi/VDeviceAPI;->b:Landroid/content/BroadcastReceiver;

    :cond_0
    #v0=(Reference);v1=(Conflicted);
    return-void
.end method

*/}
