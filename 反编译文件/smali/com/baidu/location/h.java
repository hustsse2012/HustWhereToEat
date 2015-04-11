package com.baidu.location; class h {/*

.class Lcom/baidu/location/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/h$a;
    }
.end annotation


# static fields
.field private static bB:Ljava/lang/String; = null

.field private static final bD:I = 0xc8

.field private static bE:Ljava/io/File; = null

.field private static bI:Ljava/io/File; = null

.field private static final bK:I = 0x320

.field private static final bL:I = 0x18

.field public static final br:Ljava/lang/String; = "com.baidu.locTest.LocationServer"


# instance fields
.field private bA:Landroid/content/Context;

.field private bC:Ljava/lang/String;

.field private bF:J

.field private bG:Lcom/baidu/location/n$a;

.field private bH:Ljava/lang/String;

.field private bJ:Landroid/app/PendingIntent;

.field private bM:Ljava/lang/String;

.field private bn:[J

.field private bo:Z

.field private bp:Z

.field private final bq:I

.field private bs:I

.field private final bt:J

.field private bu:Landroid/app/AlarmManager;

.field private bv:I

.field private bw:Lcom/baidu/location/h$a;

.field private final bx:I

.field private by:Landroid/os/Handler;

.field private bz:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/h;->L:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/glb.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/h;->bB:Ljava/lang/String;

    sput-object v2, Lcom/baidu/location/h;->bI:Ljava/io/File;

    sput-object v2, Lcom/baidu/location/h;->bE:Ljava/io/File;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/h;->L:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/vm.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/h;->bM:Ljava/lang/String;

    const-wide/32 v0, 0x521c820

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/h;->bt:J

    const/16 v0, 0xc8

    #v0=(PosShort);
    iput v0, p0, Lcom/baidu/location/h;->bx:I

    iput-object v2, p0, Lcom/baidu/location/h;->bu:Landroid/app/AlarmManager;

    iput-object v2, p0, Lcom/baidu/location/h;->bw:Lcom/baidu/location/h$a;

    iput-object v2, p0, Lcom/baidu/location/h;->bJ:Landroid/app/PendingIntent;

    iput-object v2, p0, Lcom/baidu/location/h;->bA:Landroid/content/Context;

    const-wide/16 v0, 0x0

    #v0=(LongLo);
    iput-wide v0, p0, Lcom/baidu/location/h;->bF:J

    const/16 v0, 0x14

    #v0=(PosByte);
    new-array v0, v0, [J

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/h;->bn:[J

    iput v3, p0, Lcom/baidu/location/h;->bs:I

    iput-object v2, p0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    iput-object v2, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    iput v4, p0, Lcom/baidu/location/h;->bv:I

    iput-boolean v3, p0, Lcom/baidu/location/h;->bp:Z

    iput-boolean v3, p0, Lcom/baidu/location/h;->bo:Z

    iput-boolean v3, p0, Lcom/baidu/location/h;->bz:Z

    iput-object v2, p0, Lcom/baidu/location/h;->bH:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/h;->by:Landroid/os/Handler;

    iput v4, p0, Lcom/baidu/location/h;->bq:I

    iput-object p1, p0, Lcom/baidu/location/h;->bA:Landroid/content/Context;

    new-instance v0, Lcom/baidu/location/h$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/h$1;-><init>(Lcom/baidu/location/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/h;->by:Landroid/os/Handler;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    iput-wide v0, p0, Lcom/baidu/location/h;->bF:J

    const-string v0, "alarm"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/baidu/location/h;->bu:Landroid/app/AlarmManager;

    new-instance v0, Lcom/baidu/location/h$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/h$a;-><init>(Lcom/baidu/location/h;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/h;->bw:Lcom/baidu/location/h$a;

    iget-object v0, p0, Lcom/baidu/location/h;->bw:Lcom/baidu/location/h$a;

    new-instance v1, Landroid/content/IntentFilter;

    #v1=(UninitRef);
    const-string v2, "com.baidu.locTest.LocationServer"

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "com.baidu.locTest.LocationServer"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const/high16 v1, 0x800

    #v1=(Integer);
    invoke-static {p1, v3, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/h;->bJ:Landroid/app/PendingIntent;

    iget-object v0, p0, Lcom/baidu/location/h;->bu:Landroid/app/AlarmManager;

    const/4 v1, 0x2

    #v1=(PosByte);
    sget-wide v2, Lcom/baidu/location/b;->aJ:J

    #v2=(LongLo);v3=(LongHi);
    sget-wide v4, Lcom/baidu/location/b;->aJ:J

    #v4=(LongLo);v5=(LongHi);
    iget-object v6, p0, Lcom/baidu/location/h;->bJ:Landroid/app/PendingIntent;

    #v6=(Reference);
    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    iget-object v0, p0, Lcom/baidu/location/h;->bw:Lcom/baidu/location/h$a;

    new-instance v1, Landroid/content/IntentFilter;

    #v1=(UninitRef);
    const-string v2, "android.intent.action.BATTERY_CHANGED"

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/h;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/h;->by:Landroid/os/Handler;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic if(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h;->bH:Ljava/lang/String;

    return-object p1
.end method

.method public static j()V
    .locals 4

    const/4 v3, 0x0

    :try_start_0
    #v3=(Null);
    sget-object v0, Lcom/baidu/location/h;->bB:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->bB:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/h;->bE:Ljava/io/File;

    sget-object v0, Lcom/baidu/location/h;->bE:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->L:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    sget-object v0, Lcom/baidu/location/h;->bE:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->bE:Ljava/io/File;

    #v1=(Reference);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v1, -0x1

    #v1=(Byte);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const-wide/16 v1, 0x0

    #v1=(LongLo);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->writeLong(J)V

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_2
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/h;->bE:Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    sput-object v3, Lcom/baidu/location/h;->bE:Ljava/io/File;

    goto :goto_0
.end method

.method public static l()Ljava/lang/String;
    .locals 10

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    sget-boolean v2, Lcom/baidu/location/b;->aY:Z

    #v2=(Boolean);
    if-nez v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    invoke-static {}, Lcom/baidu/location/h;->j()V

    :try_start_0
    sget-object v2, Lcom/baidu/location/h;->bE:Ljava/io/File;

    #v2=(Reference);
    if-eqz v2, :cond_0

    new-instance v2, Ljava/io/RandomAccessFile;

    #v2=(UninitRef);
    sget-object v3, Lcom/baidu/location/h;->bE:Ljava/io/File;

    #v3=(Reference);
    const-string v4, "rw"

    #v4=(Reference);
    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v4

    #v4=(Integer);
    if-lez v3, :cond_4

    mul-int/lit16 v5, v4, 0x320

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x18

    int-to-long v5, v5

    #v5=(LongLo);v6=(LongHi);
    invoke-virtual {v2, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v5

    #v5=(Integer);
    const/16 v6, 0x320

    #v6=(PosShort);
    new-array v6, v6, [B

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {v2, v6, v7, v5}, Ljava/io/RandomAccessFile;->read([BII)I

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v7

    #v7=(Integer);
    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v4, v4, 0x1

    rem-int/lit16 v4, v4, 0xc8

    const-wide/16 v8, 0x0

    #v8=(LongLo);v9=(LongHi);
    invoke-virtual {v2, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v2, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const-wide/16 v8, 0x8

    invoke-virtual {v2, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->writeInt(I)V

    if-ne v7, v5, :cond_3

    :goto_1
    #v1=(Integer);
    array-length v3, v6

    if-ge v1, v3, :cond_2

    aget-byte v3, v6, v1

    #v3=(Byte);
    xor-int/lit8 v3, v3, 0x5a

    #v3=(Integer);
    int-to-byte v3, v3

    #v3=(Byte);
    aput-byte v3, v6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    #v3=(Integer);
    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-direct {v1, v6, v3, v5}, Ljava/lang/String;-><init>([BII)V

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    move-object v0, v1

    #v0=(Reference);
    goto :goto_0

    :cond_3
    #v0=(Null);v1=(Null);v3=(Integer);
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0

    :cond_4
    #v1=(Null);v2=(Reference);v3=(Integer);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method


# virtual methods
.method public h()V
    .locals 7

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0}, Lcom/baidu/location/h;->i()V

    sget-object v1, Lcom/baidu/location/h;->bI:Ljava/io/File;

    #v1=(Reference);
    if-nez v1, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :cond_0
    :try_start_0
    #v0=(Null);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    sget-object v2, Lcom/baidu/location/h;->bI:Ljava/io/File;

    #v2=(Reference);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v4, 0x1

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-gez v2, :cond_1

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :catch_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Byte);v3=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Uninit);
    const-wide/16 v2, 0x0

    #v2=(LongLo);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    mul-int/lit16 v3, v2, 0xc8

    #v3=(Integer);
    add-int/lit8 v3, v3, 0x4

    add-int/lit8 v2, v2, 0x1

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    int-to-long v2, v3

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->writeLong(J)V

    iget v2, p0, Lcom/baidu/location/h;->bv:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget v2, p0, Lcom/baidu/location/h;->bs:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v2, p0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/n$a;->do:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v2, p0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/n$a;->if:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v2, p0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/n$a;->for:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v2, p0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/n$a;->try:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/16 v2, 0xa0

    #v2=(PosShort);
    new-array v2, v2, [B

    :goto_1
    #v0=(Integer);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
    iget v3, p0, Lcom/baidu/location/h;->bs:I

    #v3=(Integer);
    if-ge v0, v3, :cond_2

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x7

    iget-object v4, p0, Lcom/baidu/location/h;->bn:[J

    #v4=(Reference);
    aget-wide v4, v4, v0

    #v4=(LongLo);
    long-to-int v4, v4

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x6

    iget-object v4, p0, Lcom/baidu/location/h;->bn:[J

    #v4=(Reference);
    aget-wide v4, v4, v0

    #v4=(LongLo);
    const/16 v6, 0x8

    #v6=(PosByte);
    shr-long/2addr v4, v6

    long-to-int v4, v4

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x5

    iget-object v4, p0, Lcom/baidu/location/h;->bn:[J

    #v4=(Reference);
    aget-wide v4, v4, v0

    #v4=(LongLo);
    const/16 v6, 0x10

    shr-long/2addr v4, v6

    long-to-int v4, v4

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x4

    iget-object v4, p0, Lcom/baidu/location/h;->bn:[J

    #v4=(Reference);
    aget-wide v4, v4, v0

    #v4=(LongLo);
    const/16 v6, 0x18

    shr-long/2addr v4, v6

    long-to-int v4, v4

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x3

    iget-object v4, p0, Lcom/baidu/location/h;->bn:[J

    #v4=(Reference);
    aget-wide v4, v4, v0

    #v4=(LongLo);
    const/16 v6, 0x20

    shr-long/2addr v4, v6

    long-to-int v4, v4

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x2

    iget-object v4, p0, Lcom/baidu/location/h;->bn:[J

    #v4=(Reference);
    aget-wide v4, v4, v0

    #v4=(LongLo);
    const/16 v6, 0x28

    shr-long/2addr v4, v6

    long-to-int v4, v4

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lcom/baidu/location/h;->bn:[J

    #v4=(Reference);
    aget-wide v4, v4, v0

    #v4=(LongLo);
    const/16 v6, 0x30

    shr-long/2addr v4, v6

    long-to-int v4, v4

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x0

    iget-object v4, p0, Lcom/baidu/location/h;->bn:[J

    #v4=(Reference);
    aget-wide v4, v4, v0

    #v4=(LongLo);
    const/16 v6, 0x38

    shr-long/2addr v4, v6

    long-to-int v4, v4

    #v4=(Integer);
    int-to-byte v4, v4

    #v4=(Byte);
    aput-byte v4, v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    #v4=(Conflicted);v6=(Conflicted);
    iget v0, p0, Lcom/baidu/location/h;->bs:I

    if-lez v0, :cond_3

    const/4 v0, 0x0

    #v0=(Null);
    iget v3, p0, Lcom/baidu/location/h;->bs:I

    mul-int/lit8 v3, v3, 0x8

    invoke-virtual {v1, v2, v0, v3}, Ljava/io/RandomAccessFile;->write([BII)V

    :cond_3
    #v0=(Integer);
    iget v0, p0, Lcom/baidu/location/h;->bs:I

    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0
.end method

.method public i()V
    .locals 4

    const/4 v3, 0x0

    :try_start_0
    #v3=(Null);
    iget-object v0, p0, Lcom/baidu/location/h;->bM:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/h;->bM:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/h;->bI:Ljava/io/File;

    sget-object v0, Lcom/baidu/location/h;->bI:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->L:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    sget-object v0, Lcom/baidu/location/h;->bI:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->bI:Ljava/io/File;

    #v1=(Reference);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_2
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/h;->bI:Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    sput-object v3, Lcom/baidu/location/h;->bI:Ljava/io/File;

    goto :goto_0
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/h;->bA:Landroid/content/Context;

    #v0=(Reference);
    const-string v1, "keyguard"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public m()V
    .locals 9

    const/16 v0, 0x14

    #v0=(PosByte);
    const/4 v2, 0x0

    :try_start_0
    #v2=(Null);
    invoke-virtual {p0}, Lcom/baidu/location/h;->p()V

    iget-boolean v1, p0, Lcom/baidu/location/h;->bz:Z

    #v1=(Boolean);
    if-eqz v1, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/h;->bz:Z

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void

    :cond_1
    #v0=(PosByte);v1=(Boolean);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    invoke-virtual {p0}, Lcom/baidu/location/h;->r()V

    const/4 v1, 0x0

    #v1=(Null);
    iput v1, p0, Lcom/baidu/location/h;->bs:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/ai;->a8()Z

    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/ai;->ba()Lcom/baidu/location/ai$b;

    move-result-object v4

    #v4=(Reference);
    if-eqz v4, :cond_4

    iget-object v1, v4, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    if-eqz v1, :cond_4

    iget-object v1, v4, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    #v1=(Integer);
    if-le v1, v0, :cond_2

    move v1, v0

    :cond_2
    move v3, v2

    :goto_1
    #v0=(Integer);v2=(Integer);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-ge v3, v1, :cond_3

    iget-object v0, v4, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v5, ":"

    #v5=(Reference);
    const-string v6, ""

    #v6=(Reference);
    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    :try_start_1
    iget-object v6, p0, Lcom/baidu/location/h;->bn:[J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    const/16 v7, 0x10

    :try_start_2
    #v7=(PosByte);
    invoke-static {v5, v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v7

    #v7=(LongLo);v8=(LongHi);
    aput-wide v7, v6, v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :goto_2
    #v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    add-int/lit8 v2, v3, 0x1

    #v2=(Integer);
    move v3, v2

    move v2, v0

    goto :goto_1

    :cond_3
    :try_start_3
    #v5=(Conflicted);v6=(Conflicted);
    iput v2, p0, Lcom/baidu/location/h;->bs:I

    :cond_4
    #v1=(Conflicted);v3=(Conflicted);
    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    iget-object v0, p0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/h;->n()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0

    :catch_1
    #v1=(Integer);v3=(Integer);v4=(Reference);v5=(Reference);v6=(Reference);
    move-exception v0

    move v0, v2

    #v0=(Integer);
    goto :goto_2

    :catch_2
    move-exception v2

    #v2=(Reference);
    goto :goto_2
.end method

.method public n()V
    .locals 20

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/location/h;->i()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/location/h;->k()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const-string v1, "y2"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v2, v0, Lcom/baidu/location/h;->bp:Z

    #v2=(Boolean);
    if-nez v2, :cond_14

    :try_start_1
    new-instance v7, Ljava/io/RandomAccessFile;

    #v7=(UninitRef);
    sget-object v2, Lcom/baidu/location/h;->bI:Ljava/io/File;

    #v2=(Reference);
    const-string v4, "rw"

    #v4=(Reference);
    invoke-direct {v7, v2, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v7=(Reference);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    const-wide/16 v8, 0x1

    #v8=(LongLo);v9=(LongHi);
    cmp-long v2, v4, v8

    #v2=(Byte);
    if-gez v2, :cond_1

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :goto_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    return-void

    :cond_0
    :try_start_2
    #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
    const-string v1, "y1"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    #v1=(Reference);
    goto :goto_0

    :catch_0
    #v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    const-string v1, "y"

    goto :goto_0

    :cond_1
    :try_start_3
    #v0=(Reference);v2=(Byte);v4=(LongLo);v5=(LongHi);v7=(Reference);v8=(LongLo);v9=(LongHi);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v8

    #v8=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    move v6, v2

    :goto_2
    #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    if-ge v6, v8, :cond_13

    mul-int/lit16 v2, v6, 0xc8

    add-int/lit8 v2, v2, 0x4

    int-to-long v4, v2

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v7, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readLong()J

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v9

    #v9=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v10

    #v10=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v11

    #v11=(Integer);
    const/16 v2, 0xc8

    #v2=(PosShort);
    new-array v4, v2, [B

    #v4=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    mul-int/lit8 v5, v11, 0x8

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x10

    invoke-virtual {v7, v4, v2, v5}, Ljava/io/RandomAccessFile;->read([BII)I

    const/4 v2, 0x3

    #v2=(PosByte);
    aget-byte v2, v4, v2

    #v2=(Byte);
    and-int/lit16 v2, v2, 0xff

    #v2=(Integer);
    const/4 v5, 0x2

    #v5=(PosByte);
    aget-byte v5, v4, v5

    #v5=(Byte);
    shl-int/lit8 v5, v5, 0x8

    #v5=(Integer);
    const v12, 0xff00

    #v12=(Char);
    and-int/2addr v5, v12

    or-int/2addr v2, v5

    const/4 v5, 0x1

    #v5=(One);
    aget-byte v5, v4, v5

    #v5=(Byte);
    shl-int/lit8 v5, v5, 0x10

    #v5=(Integer);
    const/high16 v12, 0xff

    #v12=(Integer);
    and-int/2addr v5, v12

    or-int/2addr v2, v5

    const/4 v5, 0x0

    #v5=(Null);
    aget-byte v5, v4, v5

    #v5=(Byte);
    shl-int/lit8 v5, v5, 0x18

    #v5=(Integer);
    const/high16 v12, -0x100

    and-int/2addr v5, v12

    or-int/2addr v2, v5

    const/4 v5, 0x7

    #v5=(PosByte);
    aget-byte v5, v4, v5

    #v5=(Byte);
    and-int/lit16 v5, v5, 0xff

    #v5=(Integer);
    const/4 v12, 0x6

    #v12=(PosByte);
    aget-byte v12, v4, v12

    #v12=(Byte);
    shl-int/lit8 v12, v12, 0x8

    #v12=(Integer);
    const v13, 0xff00

    #v13=(Char);
    and-int/2addr v12, v13

    or-int/2addr v5, v12

    const/4 v12, 0x5

    #v12=(PosByte);
    aget-byte v12, v4, v12

    #v12=(Byte);
    shl-int/lit8 v12, v12, 0x10

    #v12=(Integer);
    const/high16 v13, 0xff

    #v13=(Integer);
    and-int/2addr v12, v13

    or-int/2addr v5, v12

    const/4 v12, 0x4

    #v12=(PosByte);
    aget-byte v12, v4, v12

    #v12=(Byte);
    shl-int/lit8 v12, v12, 0x18

    #v12=(Integer);
    const/high16 v13, -0x100

    and-int/2addr v12, v13

    or-int/2addr v5, v12

    const/16 v12, 0xb

    #v12=(PosByte);
    aget-byte v12, v4, v12

    #v12=(Byte);
    and-int/lit16 v12, v12, 0xff

    #v12=(Integer);
    const/16 v13, 0xa

    #v13=(PosByte);
    aget-byte v13, v4, v13

    #v13=(Byte);
    shl-int/lit8 v13, v13, 0x8

    #v13=(Integer);
    const v14, 0xff00

    #v14=(Char);
    and-int/2addr v13, v14

    or-int/2addr v12, v13

    const/16 v13, 0x9

    #v13=(PosByte);
    aget-byte v13, v4, v13

    #v13=(Byte);
    shl-int/lit8 v13, v13, 0x10

    #v13=(Integer);
    const/high16 v14, 0xff

    #v14=(Integer);
    and-int/2addr v13, v14

    or-int/2addr v12, v13

    const/16 v13, 0x8

    #v13=(PosByte);
    aget-byte v13, v4, v13

    #v13=(Byte);
    shl-int/lit8 v13, v13, 0x18

    #v13=(Integer);
    const/high16 v14, -0x100

    and-int/2addr v13, v14

    or-int/2addr v12, v13

    const/16 v13, 0xf

    #v13=(PosByte);
    aget-byte v13, v4, v13

    #v13=(Byte);
    and-int/lit16 v13, v13, 0xff

    #v13=(Integer);
    const/16 v14, 0xe

    #v14=(PosByte);
    aget-byte v14, v4, v14

    #v14=(Byte);
    shl-int/lit8 v14, v14, 0x8

    #v14=(Integer);
    const v15, 0xff00

    #v15=(Char);
    and-int/2addr v14, v15

    or-int/2addr v13, v14

    const/16 v14, 0xd

    #v14=(PosByte);
    aget-byte v14, v4, v14

    #v14=(Byte);
    shl-int/lit8 v14, v14, 0x10

    #v14=(Integer);
    const/high16 v15, 0xff

    #v15=(Integer);
    and-int/2addr v14, v15

    or-int/2addr v13, v14

    const/16 v14, 0xc

    #v14=(PosByte);
    aget-byte v14, v4, v14

    #v14=(Byte);
    shl-int/lit8 v14, v14, 0x18

    #v14=(Integer);
    const/high16 v15, -0x100

    and-int/2addr v14, v15

    or-int/2addr v13, v14

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v14=(Reference);
    iget v14, v14, Lcom/baidu/location/n$a;->do:I

    #v14=(Integer);
    if-ne v14, v2, :cond_d

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/n$a;->if:I

    #v2=(Integer);
    if-ne v2, v5, :cond_d

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/n$a;->for:I

    #v2=(Integer);
    if-ne v2, v12, :cond_d

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/n$a;->try:I

    #v2=(Integer);
    if-ne v2, v13, :cond_d

    new-array v12, v11, [J

    #v12=(Reference);
    const/4 v2, 0x0

    :goto_3
    #v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    if-ge v2, v11, :cond_2

    mul-int/lit8 v5, v2, 0x8

    add-int/lit8 v5, v5, 0x10

    aget-byte v5, v4, v5

    #v5=(Byte);
    int-to-long v13, v5

    #v13=(LongLo);v14=(LongHi);
    const-wide/16 v15, 0xff

    #v15=(LongLo);v16=(LongHi);
    and-long/2addr v13, v15

    const/16 v5, 0x38

    #v5=(PosByte);
    shl-long/2addr v13, v5

    mul-int/lit8 v5, v2, 0x8

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x1

    aget-byte v5, v4, v5

    #v5=(Byte);
    int-to-long v15, v5

    const-wide/16 v17, 0xff

    #v17=(LongLo);v18=(LongHi);
    and-long v15, v15, v17

    const/16 v5, 0x30

    #v5=(PosByte);
    shl-long/2addr v15, v5

    or-long/2addr v13, v15

    mul-int/lit8 v5, v2, 0x8

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x2

    aget-byte v5, v4, v5

    #v5=(Byte);
    int-to-long v15, v5

    const-wide/16 v17, 0xff

    and-long v15, v15, v17

    const/16 v5, 0x28

    #v5=(PosByte);
    shl-long/2addr v15, v5

    or-long/2addr v13, v15

    mul-int/lit8 v5, v2, 0x8

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x3

    aget-byte v5, v4, v5

    #v5=(Byte);
    int-to-long v15, v5

    const-wide/16 v17, 0xff

    and-long v15, v15, v17

    const/16 v5, 0x20

    #v5=(PosByte);
    shl-long/2addr v15, v5

    or-long/2addr v13, v15

    mul-int/lit8 v5, v2, 0x8

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x4

    aget-byte v5, v4, v5

    #v5=(Byte);
    int-to-long v15, v5

    const-wide/16 v17, 0xff

    and-long v15, v15, v17

    const/16 v5, 0x18

    #v5=(PosByte);
    shl-long/2addr v15, v5

    or-long/2addr v13, v15

    mul-int/lit8 v5, v2, 0x8

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x5

    aget-byte v5, v4, v5

    #v5=(Byte);
    int-to-long v15, v5

    const-wide/16 v17, 0xff

    and-long v15, v15, v17

    const/16 v5, 0x10

    #v5=(PosByte);
    shl-long/2addr v15, v5

    or-long/2addr v13, v15

    mul-int/lit8 v5, v2, 0x8

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x6

    aget-byte v5, v4, v5

    #v5=(Byte);
    int-to-long v15, v5

    const-wide/16 v17, 0xff

    and-long v15, v15, v17

    const/16 v5, 0x8

    #v5=(PosByte);
    shl-long/2addr v15, v5

    or-long/2addr v13, v15

    mul-int/lit8 v5, v2, 0x8

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x10

    add-int/lit8 v5, v5, 0x7

    aget-byte v5, v4, v5

    #v5=(Byte);
    int-to-long v15, v5

    const-wide/16 v17, 0xff

    and-long v15, v15, v17

    or-long/2addr v13, v15

    aput-wide v13, v12, v2

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_3

    :cond_2
    #v5=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    move v5, v2

    :goto_4
    #v2=(Integer);v4=(Integer);
    move-object/from16 v0, p0

    iget v2, v0, Lcom/baidu/location/h;->bs:I

    if-ge v5, v2, :cond_5

    const/4 v2, 0x0

    #v2=(Null);
    move/from16 v19, v2

    #v19=(Null);
    move v2, v4

    #v2=(Integer);
    move/from16 v4, v19

    :goto_5
    if-ge v4, v11, :cond_4

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/baidu/location/h;->bn:[J

    #v13=(Reference);
    aget-wide v13, v13, v5

    #v13=(LongLo);v14=(LongHi);
    aget-wide v15, v12, v4

    #v15=(LongLo);v16=(LongHi);
    cmp-long v13, v13, v15

    #v13=(Byte);
    if-nez v13, :cond_3

    add-int/lit8 v2, v2, 0x1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_4
    #v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move v4, v2

    goto :goto_4

    :cond_5
    #v19=(Conflicted);
    const/4 v2, 0x5

    #v2=(PosByte);
    if-gt v4, v2, :cond_8

    mul-int/lit8 v2, v4, 0x8

    #v2=(Integer);
    move-object/from16 v0, p0

    iget v4, v0, Lcom/baidu/location/h;->bs:I

    add-int/2addr v4, v11

    if-gt v2, v4, :cond_8

    if-nez v11, :cond_6

    move-object/from16 v0, p0

    iget v2, v0, Lcom/baidu/location/h;->bs:I

    if-eqz v2, :cond_8

    :cond_6
    const/4 v2, 0x1

    #v2=(One);
    if-ne v11, v2, :cond_7

    move-object/from16 v0, p0

    iget v2, v0, Lcom/baidu/location/h;->bs:I

    #v2=(Integer);
    const/4 v4, 0x1

    #v4=(One);
    if-ne v2, v4, :cond_7

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bn:[J

    #v2=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    aget-wide v4, v2, v4

    #v4=(LongLo);v5=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    aget-wide v13, v12, v2

    #v13=(LongLo);v14=(LongHi);
    cmp-long v2, v4, v13

    #v2=(Byte);
    if-eqz v2, :cond_8

    :cond_7
    #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    if-le v11, v2, :cond_d

    move-object/from16 v0, p0

    iget v2, v0, Lcom/baidu/location/h;->bs:I

    #v2=(Integer);
    const/4 v4, 0x1

    #v4=(One);
    if-le v2, v4, :cond_d

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bn:[J

    #v2=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    aget-wide v4, v2, v4

    #v4=(LongLo);v5=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    aget-wide v13, v12, v2

    #v13=(LongLo);v14=(LongHi);
    cmp-long v2, v4, v13

    #v2=(Byte);
    if-nez v2, :cond_d

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bn:[J

    #v2=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    aget-wide v4, v2, v4

    #v4=(LongLo);
    const/4 v2, 0x1

    #v2=(One);
    aget-wide v11, v12, v2

    #v11=(LongLo);v12=(LongHi);
    cmp-long v2, v4, v11

    #v2=(Byte);
    if-nez v2, :cond_d

    :cond_8
    #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    add-int/lit8 v3, v10, 0x1

    #v3=(Integer);
    mul-int/lit16 v4, v6, 0xc8

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x10

    int-to-long v4, v4

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v7, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v7, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    #v3=(Reference);
    if-eqz v3, :cond_9

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/location/h;->bH:Ljava/lang/String;

    if-eqz v3, :cond_9

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/baidu/location/h;->bH:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    :cond_9
    :goto_6
    #v2=(Boolean);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :goto_7
    #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-nez v2, :cond_c

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/n$a;->do:I

    #v2=(Integer);
    const/16 v3, 0x1cc

    #v3=(PosShort);
    if-ne v2, v3, :cond_e

    const-string v2, "|x,"

    :goto_8
    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    iget v3, v3, Lcom/baidu/location/n$a;->if:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    iget v3, v3, Lcom/baidu/location/n$a;->for:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/location/h;->bG:Lcom/baidu/location/n$a;

    iget v3, v3, Lcom/baidu/location/n$a;->try:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v5}, Lcom/baidu/location/ai;->bd()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_a

    const/16 v6, 0x10

    :try_start_4
    #v6=(PosByte);
    invoke-static {v5, v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move-result-wide v2

    :cond_a
    :goto_9
    #v6=(Conflicted);
    move-object/from16 v0, p0

    iget v5, v0, Lcom/baidu/location/h;->bs:I

    #v5=(Integer);
    const/4 v6, 0x1

    #v6=(One);
    if-ne v5, v6, :cond_f

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "w"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/baidu/location/h;->bn:[J

    const/4 v6, 0x0

    #v6=(Null);
    aget-wide v5, v5, v6

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v5, v6}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "k"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/baidu/location/h;->bn:[J

    const/4 v6, 0x0

    #v6=(Null);
    aget-wide v5, v5, v6

    #v5=(LongLo);v6=(LongHi);
    cmp-long v2, v5, v2

    #v2=(Byte);
    if-nez v2, :cond_12

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "k"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_a
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/baidu/location/h;->bH:Ljava/lang/String;

    if-eqz v1, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/location/h;->bH:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/location/h;->h()V

    :cond_c
    #v2=(Conflicted);v4=(Conflicted);
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/location/h;->s()V

    const/4 v1, 0x0

    #v1=(Null);
    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    goto/16 :goto_1

    :cond_d
    #v1=(Reference);v2=(Integer);v3=(Null);v6=(Integer);v7=(Reference);v8=(Integer);v9=(Integer);v10=(Integer);
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    goto/16 :goto_2

    :cond_e
    #v3=(PosShort);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    const-string v2, "|x460,"

    #v2=(Reference);
    goto/16 :goto_8

    :cond_f
    #v2=(LongLo);v3=(LongHi);v4=(Reference);v5=(Integer);v6=(One);
    move-object/from16 v0, p0

    iget v5, v0, Lcom/baidu/location/h;->bs:I

    const/4 v6, 0x1

    if-le v5, v6, :cond_12

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "w"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/baidu/location/h;->bn:[J

    const/4 v6, 0x0

    #v6=(Null);
    aget-wide v5, v5, v6

    #v5=(LongLo);v6=(LongHi);
    invoke-static {v5, v6}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/baidu/location/h;->bn:[J

    const/4 v6, 0x0

    #v6=(Null);
    aget-wide v5, v5, v6

    #v5=(LongLo);v6=(LongHi);
    cmp-long v5, v5, v2

    #v5=(Byte);
    if-nez v5, :cond_10

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "k"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-wide/16 v2, 0x0

    :cond_10
    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v5, 0x0

    #v5=(LongLo);
    cmp-long v5, v2, v5

    #v5=(Byte);
    if-lez v5, :cond_11

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v2, v3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "k"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_a

    :cond_11
    #v2=(LongLo);v3=(LongHi);v5=(Byte);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/location/h;->bn:[J

    const/4 v4, 0x1

    #v4=(One);
    aget-wide v3, v3, v4

    #v3=(LongLo);v4=(LongHi);
    invoke-static {v3, v4}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_a

    :catch_1
    #v2=(LongLo);v3=(LongHi);v4=(Reference);v5=(Reference);v6=(PosByte);
    move-exception v5

    goto/16 :goto_9

    :catch_2
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v1

    goto/16 :goto_1

    :cond_12
    #v3=(LongHi);v4=(Reference);
    move-object v2, v4

    #v2=(Reference);
    goto/16 :goto_a

    :cond_13
    #v2=(Integer);v3=(Null);v4=(Conflicted);v6=(Integer);v7=(Reference);v8=(Integer);
    move v2, v3

    #v2=(Null);
    goto/16 :goto_6

    :cond_14
    #v2=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
    move v2, v3

    #v2=(Null);
    goto/16 :goto_7
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public p()V
    .locals 12

    const/4 v0, 0x0

    #v0=(Null);
    const/4 v11, 0x1

    #v11=(One);
    iput-boolean v0, p0, Lcom/baidu/location/h;->bp:Z

    iput-boolean v0, p0, Lcom/baidu/location/h;->bo:Z

    invoke-virtual {p0}, Lcom/baidu/location/h;->i()V

    invoke-static {}, Lcom/baidu/location/h;->j()V

    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    sget-object v2, Lcom/baidu/location/h;->bE:Ljava/io/File;

    #v2=(Reference);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readLong()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v6

    #v6=(Integer);
    if-gez v2, :cond_0

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/h;->bp:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/h;->bo:Z

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void

    :cond_0
    #v0=(Null);v1=(Reference);v2=(Integer);v3=(Integer);v4=(LongLo);v5=(LongHi);v6=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    mul-int/lit16 v2, v3, 0x320

    add-int/lit8 v2, v2, 0x18

    int-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0x2a8

    #v3=(PosShort);
    if-le v2, v3, :cond_1

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/h;->bp:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/h;->bo:Z

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iput-boolean v11, p0, Lcom/baidu/location/h;->bp:Z

    iput-boolean v11, p0, Lcom/baidu/location/h;->bo:Z

    goto :goto_0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Integer);v3=(PosShort);v4=(LongLo);v5=(LongHi);v6=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    const/16 v3, 0x320

    :try_start_1
    new-array v3, v3, [B

    #v3=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {v1, v3, v7, v2}, Ljava/io/RandomAccessFile;->read([BII)I

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v7

    #v7=(Integer);
    if-eq v2, v7, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/h;->bp:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/h;->bo:Z

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :cond_2
    :goto_1
    #v0=(Integer);
    array-length v7, v3

    if-ge v0, v7, :cond_3

    aget-byte v7, v3, v0

    #v7=(Byte);
    xor-int/lit8 v7, v7, 0x5a

    #v7=(Integer);
    int-to-byte v7, v7

    #v7=(Byte);
    aput-byte v7, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    #v7=(Integer);
    new-instance v0, Ljava/lang/String;

    #v0=(UninitRef);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-direct {v0, v3, v7, v2}, Ljava/lang/String;-><init>([BII)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    const-string v2, "&tr="

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_4

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/h;->bp:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/h;->bo:Z

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :cond_4
    #v0=(Boolean);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    sub-long v4, v2, v4

    sget-wide v7, Lcom/baidu/location/b;->aJ:J

    #v7=(LongLo);v8=(LongHi);
    const-wide/16 v9, 0x3

    #v9=(LongLo);v10=(LongHi);
    mul-long/2addr v7, v9

    sget-wide v9, Lcom/baidu/location/b;->ay:J

    sub-long/2addr v7, v9

    cmp-long v0, v4, v7

    #v0=(Byte);
    if-lez v0, :cond_5

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/h;->bp:Z

    :goto_2
    #v0=(Integer);v4=(Conflicted);
    const-wide/16 v4, 0xc

    #v4=(LongLo);
    invoke-virtual {v1, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->writeLong(J)V

    iget v0, p0, Lcom/baidu/location/h;->bv:I

    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->bI:Ljava/io/File;

    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_8

    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Lcom/baidu/location/h;->bp:Z

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    goto/16 :goto_0

    :cond_5
    #v0=(Byte);v1=(Reference);v2=(LongLo);
    sget-wide v7, Lcom/baidu/location/b;->aJ:J

    const-wide/16 v9, 0x2

    mul-long/2addr v7, v9

    sget-wide v9, Lcom/baidu/location/b;->ay:J

    sub-long/2addr v7, v9

    cmp-long v0, v4, v7

    if-lez v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    iget-object v4, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    #v4=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "|"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    add-int/lit8 v0, v6, 0x2

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/h;->bv:I

    goto :goto_2

    :cond_6
    #v0=(Byte);v4=(LongLo);
    sget-wide v7, Lcom/baidu/location/b;->aJ:J

    sget-wide v9, Lcom/baidu/location/b;->ay:J

    sub-long/2addr v7, v9

    cmp-long v0, v4, v7

    if-lez v0, :cond_7

    add-int/lit8 v0, v6, 0x1

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/h;->bv:I

    goto :goto_2

    :cond_7
    #v0=(Byte);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/h;->bz:Z

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    goto/16 :goto_0

    :cond_8
    #v0=(Reference);v1=(Integer);v2=(LongHi);
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method

.method public q()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/h;->bA:Landroid/content/Context;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/h;->bw:Lcom/baidu/location/h$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/baidu/location/h;->bu:Landroid/app/AlarmManager;

    iget-object v1, p0, Lcom/baidu/location/h;->bJ:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/h;->bI:Ljava/io/File;

    return-void
.end method

.method public r()V
    .locals 7

    const/4 v6, 0x2

    #v6=(PosByte);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v0, 0x0

    #v0=(Null);
    iget-boolean v1, p0, Lcom/baidu/location/h;->bp:Z

    #v1=(Boolean);
    if-eqz v1, :cond_1

    iput v5, p0, Lcom/baidu/location/h;->bv:I

    sget-wide v1, Lcom/baidu/location/b;->aL:J

    #v1=(LongLo);v2=(LongHi);
    const-wide/16 v3, 0x3e8

    #v3=(LongLo);v4=(LongHi);
    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    sput-wide v1, Lcom/baidu/location/b;->aJ:J

    sget-wide v1, Lcom/baidu/location/b;->aJ:J

    shr-long/2addr v1, v6

    sput-wide v1, Lcom/baidu/location/b;->ay:J

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    #v1=(Reference);
    const/4 v2, 0x5

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    #v3=(Integer);
    const/16 v4, 0x7d0

    #v4=(PosShort);
    if-le v3, v4, :cond_0

    add-int/lit16 v0, v3, -0x7d0

    :cond_0
    #v0=(Integer);
    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0xb

    #v4=(PosByte);
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    #v4=(Integer);
    const/16 v5, 0xc

    #v5=(PosByte);
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    #v1=(Integer);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    const-string v5, ","

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ","

    #v3=(Reference);
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ","

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-wide v1, Lcom/baidu/location/b;->aL:J

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/baidu/location/h;->bo:Z

    #v1=(Boolean);
    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "&tr="

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/baidu/location/ap;->bD()Lcom/baidu/location/ap;

    move-result-object v2

    invoke-virtual {v2}, Lcom/baidu/location/ap;->bE()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    :goto_0
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->bE:Ljava/io/File;

    const-string v2, "rw"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    const-wide/16 v1, 0xc

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->writeLong(J)V

    iget v1, p0, Lcom/baidu/location/h;->bv:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->bI:Ljava/io/File;

    #v1=(Reference);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    :cond_2
    #v1=(Boolean);v2=(LongHi);v3=(Reference);v4=(Integer);v5=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|T"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_1
.end method

.method public s()V
    .locals 7

    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {}, Lcom/baidu/location/h;->j()V

    sget-object v1, Lcom/baidu/location/h;->bE:Ljava/io/File;

    #v1=(Reference);
    if-nez v1, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :cond_0
    :try_start_0
    #v0=(Null);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    new-instance v3, Ljava/io/RandomAccessFile;

    #v3=(UninitRef);
    sget-object v1, Lcom/baidu/location/h;->bE:Ljava/io/File;

    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v3, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    const-wide/16 v4, 0x1

    #v4=(LongLo);v5=(LongHi);
    cmp-long v1, v1, v4

    #v1=(Byte);
    if-gez v1, :cond_1

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0

    :cond_1
    #v0=(Null);v1=(Byte);v2=(LongHi);v3=(Reference);v4=(LongLo);v5=(LongHi);v6=(Uninit);
    const-wide/16 v1, 0x0

    #v1=(LongLo);
    invoke-virtual {v3, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v4

    #v4=(Integer);
    iget-boolean v5, p0, Lcom/baidu/location/h;->bp:Z

    #v5=(Boolean);
    if-eqz v5, :cond_4

    iget-boolean v5, p0, Lcom/baidu/location/h;->bo:Z

    if-eqz v5, :cond_4

    add-int/lit8 v1, v1, 0x1

    rem-int/lit16 v1, v1, 0xc8

    const-wide/16 v5, 0x4

    #v5=(LongLo);v6=(LongHi);
    invoke-virtual {v3, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    add-int/lit8 v2, v2, 0x1

    const/16 v5, 0xc8

    #v5=(PosShort);
    if-lt v2, v5, :cond_2

    const/16 v2, 0xc7

    :cond_2
    if-ne v1, v4, :cond_3

    if-lez v2, :cond_3

    add-int/lit8 v4, v4, 0x1

    rem-int/lit16 v4, v4, 0xc8

    invoke-virtual {v3, v4}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :cond_3
    mul-int/lit16 v1, v1, 0x320

    add-int/lit8 v1, v1, 0x18

    :goto_1
    #v6=(Conflicted);
    add-int/lit8 v4, v1, 0x4

    int-to-long v4, v4

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v4, p0, Lcom/baidu/location/h;->bC:Ljava/lang/String;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    :goto_2
    #v0=(Integer);v5=(Conflicted);
    array-length v5, v4

    #v5=(Integer);
    if-ge v0, v5, :cond_5

    aget-byte v5, v4, v0

    #v5=(Byte);
    xor-int/lit8 v5, v5, 0x5a

    #v5=(Integer);
    int-to-byte v5, v5

    #v5=(Byte);
    aput-byte v5, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    #v0=(Null);v4=(Integer);v5=(Boolean);v6=(Uninit);
    mul-int/lit16 v1, v1, 0x320

    add-int/lit8 v1, v1, 0x18

    goto :goto_1

    :cond_5
    #v0=(Integer);v4=(Reference);v5=(Integer);v6=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    array-length v5, v4

    invoke-virtual {v3, v4, v0, v5}, Ljava/io/RandomAccessFile;->write([BII)V

    array-length v0, v4

    #v0=(Integer);
    invoke-virtual {v3, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    int-to-long v0, v1

    #v0=(LongLo);v1=(LongHi);
    invoke-virtual {v3, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    array-length v0, v4

    #v0=(Integer);
    invoke-virtual {v3, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-boolean v0, p0, Lcom/baidu/location/h;->bp:Z

    #v0=(Boolean);
    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/baidu/location/h;->bo:Z

    if-eqz v0, :cond_6

    const-wide/16 v0, 0x0

    #v0=(LongLo);
    invoke-virtual {v3, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :cond_6
    #v0=(Conflicted);
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0
.end method

*/}
