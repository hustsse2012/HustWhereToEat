package com.baidu.location; class al {/*

.class public Lcom/baidu/location/al;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/al$d;,
        Lcom/baidu/location/al$c;,
        Lcom/baidu/location/al$a;,
        Lcom/baidu/location/al$b;
    }
.end annotation


# static fields
.field private static final gA:Ljava/lang/String; = "GeofenceMan"

.field private static final gB:I = 0x3

.field public static final gC:I = 0xa

.field private static final gD:Ljava/lang/String; = "http://loc.map.baidu.com/fence"

.field private static final gE:Ljava/lang/String; = "geofence_id"

.field private static final gF:Ljava/lang/String; = ";"

.field private static final gH:Ljava/lang/String; = "status_code"

.field private static gI:Lcom/baidu/location/al; = null

.field private static final gK:I = 0x5

.field private static final gL:I = 0x2

.field private static final gM:I = 0x1

.field private static final gO:Ljava/lang/String; = "geofence_ids"

.field private static final l:Ljava/lang/String; = "GeofenceMan"


# instance fields
.field private gG:Ljava/lang/Object;

.field private gJ:Landroid/os/HandlerThread;

.field private gN:Lcom/baidu/location/al$a;

.field private gz:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/al;->gG:Ljava/lang/Object;

    return-void
.end method

.method private bp()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/LocationClient;->PREF_FILE_NAME:Ljava/lang/String;

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v2=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v1, Lcom/baidu/location/LocationClient;->PREF_KEY_NAME:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private br()V
    .locals 3

    new-instance v0, Landroid/os/HandlerThread;

    #v0=(UninitRef);
    const-string v1, "GeofenceMan"

    #v1=(Reference);
    const/16 v2, 0xa

    #v2=(PosByte);
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/al;->gJ:Landroid/os/HandlerThread;

    iget-object v0, p0, Lcom/baidu/location/al;->gJ:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Lcom/baidu/location/al$a;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/al;->gJ:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/baidu/location/al$a;-><init>(Lcom/baidu/location/al;Landroid/os/Looper;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/al;->gN:Lcom/baidu/location/al$a;

    return-void
.end method

.method private declared-synchronized bs()V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/i;->a(Landroid/content/Context;)Lcom/baidu/location/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/i;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    const-string v0, "DELETE FROM %s WHERE EXISTS (SELECT * FROM %s WHERE (%s + %s) < %d)"

    const/4 v4, 0x5

    #v4=(PosByte);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    const-string v6, "geofence_detail"

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x1

    #v5=(One);
    const-string v6, "geofence"

    aput-object v6, v4, v5

    const/4 v5, 0x2

    #v5=(PosByte);
    const-string v6, "valid_date"

    aput-object v6, v4, v5

    const/4 v5, 0x3

    const-string v6, "duration_millis"

    aput-object v6, v4, v5

    const/4 v5, 0x4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DELETE FROM %s WHERE (%s + %s) < %d"

    const/4 v4, 0x4

    #v4=(PosByte);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    const-string v6, "geofence"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    #v5=(One);
    const-string v6, "valid_date"

    aput-object v6, v4, v5

    const/4 v5, 0x2

    #v5=(PosByte);
    const-string v6, "duration_millis"

    aput-object v6, v4, v5

    const/4 v5, 0x3

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v4, v5

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0

    :catchall_1
    #v1=(Reference);
    move-exception v0

    :try_start_4
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method private bt()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/al;->gN:Lcom/baidu/location/al$a;

    #v0=(Reference);
    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/al$a;->sendEmptyMessage(I)Z

    return-void
.end method

.method private final bu()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/o;->if(Landroid/content/Context;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "Not net connection"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    return-void
.end method

.method private declared-synchronized bv()J
    .locals 4

    monitor-enter p0

    const-wide/16 v0, 0x0

    :try_start_0
    #v0=(LongLo);v1=(LongHi);
    iget-object v2, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/location/i;->a(Landroid/content/Context;)Lcom/baidu/location/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/baidu/location/i;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "geofence"

    #v3=(Reference);
    invoke-static {v2, v3}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    #v3=(Conflicted);
    monitor-exit p0

    return-wide v0

    :catchall_0
    #v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0

    :catch_0
    #v0=(LongLo);
    move-exception v2

    #v2=(Reference);
    goto :goto_0
.end method

.method public static do(Landroid/content/Context;)I
    .locals 2

    const-string v0, "phone"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "46000"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "46002"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "46007"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    #v0=(PosByte);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Reference);v1=(Boolean);
    const-string v1, "46001"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_0

    :cond_2
    #v0=(Reference);
    const-string v1, "46003"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    const/4 v0, 0x3

    #v0=(PosByte);
    goto :goto_0

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x5

    #v0=(PosByte);
    goto :goto_0
.end method

.method private declared-synchronized do(Ljava/util/List;)I
    .locals 10

    const/4 v2, 0x1

    #v2=(One);
    const/4 v1, 0x0

    #v1=(Null);
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/i;->a(Landroid/content/Context;)Lcom/baidu/location/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/i;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    #v4=(Reference);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    const/4 v5, 0x1

    #v5=(One);
    new-array v5, v5, [Ljava/lang/String;

    #v5=(Reference);
    const/4 v6, 0x0

    #v6=(Null);
    aput-object v0, v5, v6

    const-string v0, "geofence"

    const-string v6, "%s=?"

    #v6=(Reference);
    const/4 v7, 0x1

    #v7=(One);
    new-array v7, v7, [Ljava/lang/Object;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    const-string v9, "geofence_id"

    #v9=(Reference);
    aput-object v9, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v0, v6, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    const-string v0, "geofence_detail"

    const-string v6, "%s=?"

    const/4 v7, 0x1

    #v7=(One);
    new-array v7, v7, [Ljava/lang/Object;

    #v7=(Reference);
    const/4 v8, 0x0

    const-string v9, "geofence_id"

    aput-object v9, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v0, v6, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    :try_start_2
    #v0=(Reference);
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v2

    :goto_1
    #v0=(Boolean);
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit p0

    return v0

    :cond_0
    :try_start_3
    #v4=(Reference);
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :try_start_4
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v1

    #v0=(Null);
    goto :goto_1

    :catchall_0
    #v0=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    #v0=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0

    :cond_1
    #v3=(Reference);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move v0, v1

    #v0=(Null);
    goto :goto_2
.end method

.method static synthetic do(Lcom/baidu/location/al;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/baidu/location/al;->bp()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic for(Lcom/baidu/location/al;)Lcom/baidu/location/al$a;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/al;->gN:Lcom/baidu/location/al$a;

    #v0=(Reference);
    return-object v0
.end method

.method public static for(Landroid/content/Context;)Lcom/baidu/location/al;
    .locals 1

    sget-object v0, Lcom/baidu/location/al;->gI:Lcom/baidu/location/al;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/al;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/al;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/al;->gI:Lcom/baidu/location/al;

    sget-object v0, Lcom/baidu/location/al;->gI:Lcom/baidu/location/al;

    invoke-direct {v0}, Lcom/baidu/location/al;->br()V

    sget-object v0, Lcom/baidu/location/al;->gI:Lcom/baidu/location/al;

    iput-object p0, v0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    :cond_0
    sget-object v0, Lcom/baidu/location/al;->gI:Lcom/baidu/location/al;

    return-object v0
.end method

.method private declared-synchronized if(Lcom/baidu/location/ah;Ljava/lang/String;)I
    .locals 11

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/location/i;->a(Landroid/content/Context;)Lcom/baidu/location/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/baidu/location/i;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    #v4=(Reference);
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-wide v2

    :try_start_1
    #v2=(LongLo);v3=(LongHi);
    new-instance v5, Landroid/content/ContentValues;

    #v5=(UninitRef);
    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    #v5=(Reference);
    invoke-virtual {p1}, Lcom/baidu/location/ah;->getGeofenceId()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    const-string v7, "geofence_id"

    #v7=(Reference);
    invoke-virtual {v5, v7, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "longitude"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->a()D

    move-result-wide v8

    #v8=(DoubleLo);v9=(DoubleHi);
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v5, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    const-string v7, "latitude"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->byte()D

    move-result-wide v8

    #v8=(DoubleLo);
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v5, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    const-string v7, "radius"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->do()F

    move-result v8

    #v8=(Float);
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v5, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    const-string v7, "radius_type"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->new()I

    move-result v8

    #v8=(Integer);
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v5, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v7, "valid_date"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v5, v7, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "duration_millis"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->else()J

    move-result-wide v7

    #v7=(LongLo);v8=(LongHi);
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v5, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "coord_type"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->int()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "is_lac"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->try()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    move v2, v1

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v5, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "is_cell"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->if()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    move v2, v1

    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v5, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "is_wifi"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->for()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    move v2, v1

    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v5, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "next_active_time"

    const/4 v3, 0x0

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v5, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "geofence"

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v4, v2, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    const-string v2, ";"

    invoke-virtual {p2, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    array-length v7, v5

    #v7=(Integer);
    move v3, v0

    :goto_3
    #v2=(Conflicted);v3=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    if-ge v3, v7, :cond_4

    aget-object v2, v5, v3

    #v2=(Null);
    new-instance v8, Landroid/content/ContentValues;

    #v8=(UninitRef);
    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    #v8=(Reference);
    const-string v9, "geofence_id"

    #v9=(Reference);
    invoke-virtual {v8, v9, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ap_backup"

    invoke-virtual {v8, v9, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "|"

    invoke-virtual {v2, v9}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v9

    #v9=(Integer);
    const/4 v10, -0x1

    #v10=(Byte);
    if-eq v9, v10, :cond_0

    const/4 v10, 0x0

    #v10=(Null);
    invoke-virtual {v2, v10, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_0
    #v2=(Reference);v10=(Byte);
    const-string v9, "ap"

    #v9=(Reference);
    invoke-virtual {v8, v9, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "geofence_detail"

    const/4 v9, 0x0

    #v9=(Null);
    invoke-virtual {v4, v2, v9, v8}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    add-int/lit8 v2, v3, 0x1

    #v2=(Integer);
    move v3, v2

    goto :goto_3

    :cond_1
    #v2=(Boolean);v3=(Reference);v7=(LongLo);v8=(LongHi);v9=(DoubleHi);v10=(Uninit);
    move v2, v0

    #v2=(Null);
    goto :goto_0

    :cond_2
    #v2=(Boolean);
    move v2, v0

    #v2=(Null);
    goto :goto_1

    :cond_3
    #v2=(Boolean);
    move v2, v0

    #v2=(Null);
    goto :goto_2

    :cond_4
    #v2=(Conflicted);v3=(Integer);v7=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :goto_4
    #v0=(Boolean);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_5
    monitor-exit p0

    return v0

    :catch_0
    #v0=(Null);
    move-exception v0

    :try_start_3
    #v0=(Reference);
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v1

    #v0=(One);
    goto :goto_4

    :catchall_0
    #v0=(Null);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    #v0=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method static synthetic if(Lcom/baidu/location/al;Lcom/baidu/location/ah;Ljava/lang/String;)I
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/baidu/location/al;->if(Lcom/baidu/location/ah;Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method static synthetic if(Lcom/baidu/location/al;Ljava/util/List;)I
    .locals 1

    invoke-direct {p0, p1}, Lcom/baidu/location/al;->do(Ljava/util/List;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method static synthetic if(Lcom/baidu/location/al;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v0=(Reference);
    return-object v0
.end method

.method private if(ILjava/lang/String;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    if-ne p1, v0, :cond_0

    :cond_0
    invoke-interface {p3, p1, p2}, Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;->onAddBDGeofencesResult(ILjava/lang/String;)V

    return-void
.end method

.method private if(I[Ljava/lang/String;Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;)V
    .locals 0

    invoke-interface {p3, p1, p2}, Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;->onRemoveBDGeofencesByRequestIdsResult(I[Ljava/lang/String;)V

    return-void
.end method

.method private if(Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/al;->gN:Lcom/baidu/location/al$a;

    #v0=(Reference);
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;)Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    iput v1, v0, Landroid/os/Message;->what:I

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    const-string v2, "status_code"

    #v2=(Reference);
    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "geofence_id"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v1, p0, Lcom/baidu/location/al;->gN:Lcom/baidu/location/al$a;

    invoke-virtual {v1, v0}, Lcom/baidu/location/al$a;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/al;ILjava/lang/String;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/baidu/location/al;->if(ILjava/lang/String;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/al;I[Ljava/lang/String;Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/baidu/location/al;->if(I[Ljava/lang/String;Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/al;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/baidu/location/al;->if(Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;ILjava/lang/String;)V

    return-void
.end method

.method public static int(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/baidu/location/aq;->b2()Lcom/baidu/location/aq;

    move-result-object v0

    #v0=(Reference);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/location/aq;->byte(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic int(Lcom/baidu/location/al;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/al;->bs()V

    return-void
.end method


# virtual methods
.method public bq()V
    .locals 3

    iget-object v1, p0, Lcom/baidu/location/al;->gG:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/al;->gN:Lcom/baidu/location/al$a;

    #v0=(Reference);
    new-instance v2, Lcom/baidu/location/al$2;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Lcom/baidu/location/al$2;-><init>(Lcom/baidu/location/al;)V

    #v2=(Reference);
    invoke-virtual {v0, v2}, Lcom/baidu/location/al$a;->post(Ljava/lang/Runnable;)Z

    monitor-exit v1

    return-void

    :catchall_0
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public if(Lcom/baidu/location/ah;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/al;->gN:Lcom/baidu/location/al$a;

    #v0=(Reference);
    new-instance v1, Lcom/baidu/location/al$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0, p1}, Lcom/baidu/location/al$1;-><init>(Lcom/baidu/location/al;Lcom/baidu/location/ah;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/location/al$a;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public if(Lcom/baidu/location/ah;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V
    .locals 4

    invoke-direct {p0}, Lcom/baidu/location/al;->bu()V

    const-string v0, "OnAddBDGeofenceRecesResultListener not provided."

    #v0=(Reference);
    invoke-static {p2, v0}, Lcom/baidu/location/ae;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/baidu/location/al;->bv()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    const-wide/16 v2, 0xa

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_0

    const/16 v0, 0x3e9

    #v0=(PosShort);
    invoke-virtual {p1}, Lcom/baidu/location/ah;->getGeofenceId()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {p2, v0, v1}, Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;->onAddBDGeofencesResult(ILjava/lang/String;)V

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Byte);v1=(LongHi);
    new-instance v0, Lcom/baidu/location/al$b;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2}, Lcom/baidu/location/al$b;-><init>(Lcom/baidu/location/al;Lcom/baidu/location/ah;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/al$b;->Z()V

    invoke-direct {p0}, Lcom/baidu/location/al;->bt()V

    goto :goto_0
.end method

.method public if(Ljava/util/List;Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    const-string v1, "geofenceRequestIds can\'t be null nor empty."

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/ae;->if(ZLjava/lang/Object;)V

    const-string v0, "onRemoveBDGeofencesResultListener not provided."

    #v0=(Reference);
    invoke-static {p2, v0}, Lcom/baidu/location/ae;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/baidu/location/al;->gN:Lcom/baidu/location/al$a;

    new-instance v1, Lcom/baidu/location/al$d;

    #v1=(UninitRef);
    invoke-direct {v1, p0, p1, p2}, Lcom/baidu/location/al$d;-><init>(Lcom/baidu/location/al;Ljava/util/List;Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/location/al$a;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    #v0=(Conflicted);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public declared-synchronized k(Ljava/lang/String;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/al;->gz:Landroid/content/Context;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/i;->a(Landroid/content/Context;)Lcom/baidu/location/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/i;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    :try_start_2
    new-instance v0, Landroid/content/ContentValues;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    #v0=(Reference);
    const-string v2, "next_active_time"

    #v2=(Reference);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    const-wide/32 v5, 0x1499700

    #v5=(LongLo);v6=(LongHi);
    add-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "geofence"

    const-string v3, "geofence_id= ?"

    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/String;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    aput-object p1, v4, v5

    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0

    :catch_0
    #v0=(Conflicted);v1=(Reference);
    move-exception v0

    :try_start_4
    #v0=(Reference);
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    :catchall_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

*/}
