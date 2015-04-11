package com.baidu.location; class ao {/*

.class Lcom/baidu/location/ao;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# static fields
.field private static gW:Lcom/baidu/location/ao;


# instance fields
.field private g0:Ljava/lang/String;

.field private g1:D

.field private g2:Z

.field private g3:D

.field private g4:Ljava/lang/String;

.field private g5:I

.field private g6:Z

.field private gU:D

.field private gV:Ljava/lang/String;

.field private gX:Landroid/database/sqlite/SQLiteDatabase;

.field private gY:J

.field private gZ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/ao;->gW:Lcom/baidu/location/ao;

    return-void
.end method

.method private constructor <init>()V
    .locals 5

    const/4 v1, 0x0

    #v1=(Null);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    const-string v0, "bdcltb09"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/ao;->g4:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/ao;->gV:Ljava/lang/String;

    iput-boolean v2, p0, Lcom/baidu/location/ao;->g6:Z

    iput-boolean v2, p0, Lcom/baidu/location/ao;->g2:Z

    iput-object v1, p0, Lcom/baidu/location/ao;->g0:Ljava/lang/String;

    iput v2, p0, Lcom/baidu/location/ao;->g5:I

    iput-wide v3, p0, Lcom/baidu/location/ao;->g3:D

    iput-wide v3, p0, Lcom/baidu/location/ao;->g1:D

    iput-wide v3, p0, Lcom/baidu/location/ao;->gU:D

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/ao;->gY:J

    iput-boolean v2, p0, Lcom/baidu/location/ao;->gZ:Z

    :try_start_0
    invoke-direct {p0}, Lcom/baidu/location/ao;->bA()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :catch_0
    #v0=(LongLo);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method private bA()V
    .locals 4

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/ao;->L:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    sget-object v3, Lcom/baidu/location/ao;->L:Ljava/lang/String;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/ls.db"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    #v0=(Conflicted);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "CREATE TABLE IF NOT EXISTS "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/ao;->g4:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(id CHAR(40) PRIMARY KEY,time DOUBLE,tag DOUBLE, type DOUBLE , ac INT);"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_2
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    :catch_0
    #v0=(Boolean);v2=(Boolean);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public static bz()Lcom/baidu/location/ao;
    .locals 1

    sget-object v0, Lcom/baidu/location/ao;->gW:Lcom/baidu/location/ao;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/ao;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/ao;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/ao;->gW:Lcom/baidu/location/ao;

    :cond_0
    sget-object v0, Lcom/baidu/location/ao;->gW:Lcom/baidu/location/ao;

    return-object v0
.end method

.method private g(Landroid/os/Message;)V
    .locals 2

    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v0

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {p0, v1}, Lcom/baidu/location/ao;->new(Z)Lcom/baidu/location/BDLocation;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1, p1}, Lcom/baidu/location/g;->if(Lcom/baidu/location/BDLocation;Landroid/os/Message;)V

    return-void
.end method

.method private int(Z)Ljava/lang/String;
    .locals 9

    const/4 v2, 0x4

    #v2=(PosByte);
    const/4 v8, 0x3

    #v8=(PosByte);
    const/4 v7, 0x2

    #v7=(PosByte);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v5, 0x1

    #v5=(One);
    iget-boolean v0, p0, Lcom/baidu/location/ao;->g6:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "{\"result\":{\"time\":\""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/b;->if()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    iget-wide v3, p0, Lcom/baidu/location/ao;->g3:D

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v6

    iget-wide v3, p0, Lcom/baidu/location/ao;->g1:D

    #v3=(DoubleLo);
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v5

    iget-wide v3, p0, Lcom/baidu/location/ao;->gU:D

    #v3=(DoubleLo);
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v7

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v8

    invoke-static {v1, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "{\"result\":{\"time\":\""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/b;->if()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\"error\":\"68\"},\"content\":{\"point\":{\"x\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    iget-wide v3, p0, Lcom/baidu/location/ao;->g3:D

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v6

    iget-wide v3, p0, Lcom/baidu/location/ao;->g1:D

    #v3=(DoubleLo);
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v5

    iget-wide v3, p0, Lcom/baidu/location/ao;->gU:D

    #v3=(DoubleLo);
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v7

    invoke-static {}, Lcom/baidu/location/y;->ag()Lcom/baidu/location/y;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/location/y;->ai()Z

    move-result v3

    #v3=(Boolean);
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v8

    invoke-static {v1, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);
    if-eqz p1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "{\"result\":{\"time\":\""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/b;->if()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\"error\":\"67\"}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    #v0=(Boolean);v1=(Uninit);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "{\"result\":{\"time\":\""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/b;->if()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\"error\":\"63\"}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private l(Ljava/lang/String;)V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    iget-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    #v0=(Reference);
    if-eqz v0, :cond_0

    if-nez p1, :cond_2

    :cond_0
    iput-boolean v4, p0, Lcom/baidu/location/ao;->g6:Z

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_2
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/ao;->gY:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x5dc

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/ao;->gV:Ljava/lang/String;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    iput-boolean v4, p0, Lcom/baidu/location/ao;->g6:Z

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "select * from "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/ao;->g4:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " where id = \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\";"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object p1, p0, Lcom/baidu/location/ao;->gV:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, p0, Lcom/baidu/location/ao;->gY:J

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    const/4 v1, 0x1

    #v1=(One);
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v1

    #v1=(DoubleLo);v2=(DoubleHi);
    const-wide v3, 0x40934dbaacd9e83eL

    #v3=(LongLo);v4=(LongHi);
    sub-double/2addr v1, v3

    iput-wide v1, p0, Lcom/baidu/location/ao;->g3:D

    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v1

    #v1=(DoubleLo);
    const-wide v3, 0x40b0e60000000000L

    sub-double/2addr v1, v3

    iput-wide v1, p0, Lcom/baidu/location/ao;->gU:D

    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v1

    #v1=(DoubleLo);
    const-wide v3, 0x40a27ea4b5dcc63fL

    sub-double/2addr v1, v3

    iput-wide v1, p0, Lcom/baidu/location/ao;->g1:D

    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Lcom/baidu/location/ao;->g6:Z

    :cond_3
    #v1=(Boolean);v2=(LongHi);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/ao;->gY:J

    goto/16 :goto_0
.end method


# virtual methods
.method public bB()V
    .locals 0

    return-void
.end method

.method public by()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    :cond_0
    #v0=(Reference);
    return-void
.end method

.method public h(Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/ao;->g(Landroid/os/Message;)V

    return-void
.end method

.method public if(Ljava/lang/String;Lcom/baidu/location/n$a;)V
    .locals 13

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    iget-object v2, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    #v2=(Reference);
    if-eqz v2, :cond_0

    invoke-static {}, Lcom/baidu/location/y;->ag()Lcom/baidu/location/y;

    move-result-object v2

    invoke-virtual {v2}, Lcom/baidu/location/y;->ai()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return-void

    :cond_1
    #v0=(Null);v1=(One);v2=(Boolean);v3=(LongLo);v4=(LongHi);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p2}, Lcom/baidu/location/n$a;->for()Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_0

    invoke-virtual {p2}, Lcom/baidu/location/n$a;->a()Ljava/lang/String;

    move-result-object v6

    :try_start_0
    #v6=(Reference);
    new-instance v5, Lorg/json/JSONObject;

    #v5=(UninitRef);
    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    const-string v7, "result"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    const-string v8, "error"

    #v8=(Reference);
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    #v7=(Integer);
    const/16 v8, 0xa1

    #v8=(PosShort);
    if-ne v7, v8, :cond_3

    const-string v7, "content"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    const-string v5, "clf"

    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_4

    const-string v1, "clf"

    #v1=(Reference);
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    const-string v1, "point"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "x"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    #v4=(DoubleLo);v5=(DoubleHi);
    const-string v2, "y"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    const-string v1, "radius"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v1

    :goto_1
    #v0=(Boolean);v1=(Float);v2=(LongLo);v3=(LongHi);v4=(LongLo);v5=(LongHi);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-nez v0, :cond_0

    const-wide v7, 0x40934dbaacd9e83eL

    #v7=(LongLo);v8=(LongHi);
    add-double/2addr v4, v7

    #v4=(DoubleLo);v5=(DoubleHi);
    const-wide v7, 0x40a27ea4b5dcc63fL

    add-double/2addr v2, v7

    #v2=(DoubleLo);v3=(DoubleHi);
    const v0, 0x45873000

    #v0=(Integer);
    add-float/2addr v0, v1

    #v0=(Float);
    new-instance v1, Landroid/content/ContentValues;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    #v1=(Reference);
    const-string v7, "time"

    #v7=(Reference);
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v1, v7, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    const-string v4, "tag"

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v1, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    const-string v0, "type"

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    :try_start_1
    iget-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/baidu/location/ao;->g4:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "id = \""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    if-gtz v0, :cond_0

    const-string v0, "id"

    #v0=(Reference);
    invoke-virtual {v1, v0, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/baidu/location/ao;->g4:Ljava/lang/String;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :catch_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Reference);
    move-exception v0

    #v0=(Reference);
    goto/16 :goto_0

    :cond_2
    :try_start_2
    #v0=(Null);v2=(Boolean);v3=(LongLo);v4=(LongHi);v5=(Boolean);v8=(PosShort);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    const-string v2, "\\|"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    aget-object v2, v1, v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    #v4=(DoubleLo);v5=(DoubleHi);
    const/4 v2, 0x1

    #v2=(One);
    aget-object v2, v1, v2

    #v2=(Null);
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    const/4 v7, 0x2

    #v7=(PosByte);
    aget-object v1, v1, v7

    #v1=(Null);
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    #v1=(Float);
    goto/16 :goto_1

    :cond_3
    #v1=(One);v2=(Null);v3=(LongLo);v4=(LongHi);v5=(Reference);v7=(Integer);
    const/16 v0, 0xa7

    #v0=(PosShort);
    if-ne v7, v0, :cond_4

    iget-object v0, p0, Lcom/baidu/location/ao;->gX:Landroid/database/sqlite/SQLiteDatabase;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/ao;->g4:Ljava/lang/String;

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "id = \""

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_0

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto/16 :goto_0

    :cond_4
    #v0=(PosShort);v1=(One);v2=(Null);v3=(LongLo);v4=(LongHi);v8=(PosShort);
    move v0, v1

    #v0=(One);
    move v1, v2

    #v1=(Null);
    move-wide v9, v3

    #v9=(LongLo);v10=(LongHi);
    move-wide v11, v3

    #v11=(LongLo);v12=(LongHi);
    move-wide v4, v11

    #v4=(LongLo);v5=(LongHi);
    move-wide v2, v9

    #v2=(LongLo);v3=(LongHi);
    goto/16 :goto_1
.end method

.method public new(Z)Lcom/baidu/location/BDLocation;
    .locals 2

    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/n$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/baidu/location/ao;->l(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/baidu/location/ao;->int(Z)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/baidu/location/BDLocation;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Lcom/baidu/location/BDLocation;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    return-object v1
.end method

*/}
