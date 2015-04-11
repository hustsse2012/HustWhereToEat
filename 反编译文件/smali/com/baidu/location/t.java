package com.baidu.location; class t {/*

.class Lcom/baidu/location/t;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/t$a;
    }
.end annotation


# static fields
.field public static e0:Z = false

.field public static e1:Z = false

.field private static final e2:Ljava/lang/String; = null

.field public static e4:I = 0x0

.field public static e5:Z = false

.field public static e6:Z = false

.field private static final e8:I = 0x80

.field public static e9:Z

.field private static fa:Lcom/baidu/location/t;

.field public static fb:Z

.field public static fc:I

.field public static fd:I


# instance fields
.field private e3:Lcom/baidu/location/t$a;

.field private e7:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, -0x1

    #v2=(Byte);
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/t;->fa:Lcom/baidu/location/t;

    sput-boolean v1, Lcom/baidu/location/t;->e6:Z

    sput-boolean v1, Lcom/baidu/location/t;->e9:Z

    sput-boolean v3, Lcom/baidu/location/t;->fb:Z

    sput-boolean v1, Lcom/baidu/location/t;->e0:Z

    sput-boolean v1, Lcom/baidu/location/t;->e1:Z

    sput-boolean v1, Lcom/baidu/location/t;->e5:Z

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/con.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/t;->e2:Ljava/lang/String;

    sput v2, Lcom/baidu/location/t;->fc:I

    sput v2, Lcom/baidu/location/t;->e4:I

    sput v3, Lcom/baidu/location/t;->fd:I

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/t;->e3:Lcom/baidu/location/t$a;

    iput-boolean v1, p0, Lcom/baidu/location/t;->e7:Z

    new-instance v0, Lcom/baidu/location/t$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/t$a;-><init>(Lcom/baidu/location/t;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/t;->e3:Lcom/baidu/location/t$a;

    sput-boolean v1, Lcom/baidu/location/t;->fb:Z

    return-void
.end method

.method public static aI()V
    .locals 9

    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    #v2=(Null);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v3, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v3=(Reference);
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/config.dat"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    sget-boolean v0, Lcom/baidu/location/b;->au:Z

    #v0=(Boolean);
    if-eqz v0, :cond_4

    move v0, v1

    :goto_0
    sget-boolean v3, Lcom/baidu/location/b;->aR:Z

    #v3=(Boolean);
    if-eqz v3, :cond_3

    move v3, v1

    :goto_1
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v5=(Reference);
    const-string v6, "{\"ver\":\"%d\",\"gps\":\"%.1f|%.1f|%.1f|%.1f|%d|%d|%d|%d|%d|%d|%d\",\"up\":\"%.1f|%.1f|%.1f|%.1f\",\"wf\":\"%d|%.1f|%d|%.1f\",\"ab\":\"%.2f|%.2f|%d|%d\",\"gpc\":\"%d|%d|%d|%d|%d|%d\",\"zxd\":\"%.1f|%.1f|%d|%d|%d\",\"shak\":\"%d|%d|%.1f\"}"

    #v6=(Reference);
    const/16 v7, 0x26

    #v7=(PosByte);
    new-array v7, v7, [Ljava/lang/Object;

    #v7=(Reference);
    sget v8, Lcom/baidu/location/b;->af:I

    #v8=(Integer);
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    #v8=(Reference);
    aput-object v8, v7, v2

    sget v2, Lcom/baidu/location/b;->ab:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/4 v1, 0x2

    #v1=(PosByte);
    sget v2, Lcom/baidu/location/b;->aK:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/4 v1, 0x3

    sget v2, Lcom/baidu/location/b;->ad:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/4 v1, 0x4

    sget v2, Lcom/baidu/location/b;->aM:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/4 v1, 0x5

    sget v2, Lcom/baidu/location/b;->aC:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/4 v1, 0x6

    sget v2, Lcom/baidu/location/b;->U:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/4 v1, 0x7

    sget v2, Lcom/baidu/location/b;->aD:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x8

    sget v2, Lcom/baidu/location/b;->V:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x9

    sget v2, Lcom/baidu/location/b;->Y:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0xa

    sget v2, Lcom/baidu/location/b;->as:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0xb

    sget v2, Lcom/baidu/location/b;->aW:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0xc

    sget v2, Lcom/baidu/location/b;->a5:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0xd

    sget v2, Lcom/baidu/location/b;->a2:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0xe

    sget v2, Lcom/baidu/location/b;->ak:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0xf

    sget v2, Lcom/baidu/location/b;->aS:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x10

    sget v2, Lcom/baidu/location/b;->aQ:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x11

    sget v2, Lcom/baidu/location/b;->Z:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x12

    sget v2, Lcom/baidu/location/b;->ao:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x13

    sget v2, Lcom/baidu/location/b;->aN:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x14

    sget v2, Lcom/baidu/location/b;->a4:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x15

    sget v2, Lcom/baidu/location/b;->a1:F

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x16

    sget v2, Lcom/baidu/location/b;->aZ:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x17

    sget v2, Lcom/baidu/location/b;->aX:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v7, v1

    const/16 v1, 0x18

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v7, v1

    const/16 v0, 0x19

    #v0=(PosByte);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x1a

    sget v1, Lcom/baidu/location/b;->aq:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x1b

    sget v1, Lcom/baidu/location/b;->at:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x1c

    sget-wide v1, Lcom/baidu/location/b;->aL:J

    #v1=(LongLo);v2=(LongHi);
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x1d

    sget v1, Lcom/baidu/location/b;->aO:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x1e

    sget v1, Lcom/baidu/location/b;->ac:F

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x1f

    sget v1, Lcom/baidu/location/b;->X:F

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x20

    sget v1, Lcom/baidu/location/b;->al:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x21

    sget v1, Lcom/baidu/location/b;->az:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x22

    sget v1, Lcom/baidu/location/b;->ap:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x23

    sget v1, Lcom/baidu/location/b;->aP:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x24

    sget v1, Lcom/baidu/location/b;->aH:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    const/16 v0, 0x25

    sget v1, Lcom/baidu/location/b;->aU:F

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v7, v0

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    sget-object v3, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    new-instance v2, Ljava/io/RandomAccessFile;

    #v2=(UninitRef);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v2, v1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v2=(Reference);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    :cond_1
    #v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
    new-instance v2, Ljava/io/RandomAccessFile;

    #v2=(UninitRef);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v2, v1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v2=(Reference);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v2, v1}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    const-wide/16 v3, 0x2

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    array-length v1, v0

    #v1=(Integer);
    invoke-virtual {v2, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v2, v0}, Ljava/io/RandomAccessFile;->write([B)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_3
    #v0=(Boolean);v1=(One);v2=(Null);v3=(Boolean);v4=(Reference);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    move v3, v2

    #v3=(Null);
    goto/16 :goto_1

    :cond_4
    #v3=(Reference);
    move v0, v2

    #v0=(Null);
    goto/16 :goto_0
.end method

.method public static aJ()V
    .locals 4

    :try_start_0
    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/t;->e2:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    sget-object v2, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v1, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/16 v0, 0x80

    #v0=(PosShort);
    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public static aK()Lcom/baidu/location/t;
    .locals 1

    sget-object v0, Lcom/baidu/location/t;->fa:Lcom/baidu/location/t;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/t;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/t;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/t;->fa:Lcom/baidu/location/t;

    :cond_0
    sget-object v0, Lcom/baidu/location/t;->fa:Lcom/baidu/location/t;

    return-object v0
.end method

.method public static aN()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/config.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v2, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v2}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    const-wide/16 v1, 0x1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    const-wide/16 v1, 0x400

    #v1=(LongLo);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    sget-wide v1, Lcom/baidu/location/b;->aB:D

    #v1=(DoubleLo);v2=(DoubleHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->writeDouble(D)V

    sget-wide v1, Lcom/baidu/location/b;->aa:D

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->writeDouble(D)V

    sget-boolean v1, Lcom/baidu/location/b;->am:Z

    #v1=(Boolean);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeBoolean(Z)V

    sget-boolean v1, Lcom/baidu/location/b;->am:Z

    if-eqz v1, :cond_2

    sget-object v1, Lcom/baidu/location/b;->aw:[B

    #v1=(Reference);
    if-eqz v1, :cond_2

    sget-object v1, Lcom/baidu/location/b;->aw:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->write([B)V

    :cond_2
    #v1=(Conflicted);
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public static aO()V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    sget-object v2, Lcom/baidu/location/t;->e2:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    new-instance v2, Ljava/io/RandomAccessFile;

    #v2=(UninitRef);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v2, v1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v2=(Reference);
    const-wide/16 v3, 0x4

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    #v3=(Integer);
    const-wide/16 v4, 0x80

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v2, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    new-array v4, v1, [B

    :goto_0
    #v0=(Integer);v4=(Reference);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-ge v0, v3, :cond_0

    mul-int v5, v1, v0

    #v5=(Integer);
    add-int/lit16 v5, v5, 0x80

    int-to-long v5, v5

    #v5=(LongLo);v6=(LongHi);
    invoke-virtual {v2, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v5

    #v5=(Integer);
    if-lez v5, :cond_3

    if-ge v5, v1, :cond_3

    const/4 v6, 0x0

    #v6=(Null);
    invoke-virtual {v2, v4, v6, v5}, Ljava/io/RandomAccessFile;->read([BII)I

    add-int/lit8 v6, v5, -0x1

    #v6=(Integer);
    aget-byte v6, v4, v6

    #v6=(Byte);
    if-nez v6, :cond_3

    new-instance v6, Ljava/lang/String;

    #v6=(UninitRef);
    const/4 v7, 0x0

    #v7=(Null);
    add-int/lit8 v5, v5, -0x1

    invoke-direct {v6, v4, v7, v5}, Ljava/lang/String;-><init>([BII)V

    #v6=(Reference);
    sget-object v5, Lcom/baidu/location/ap;->hb:Ljava/lang/String;

    #v5=(Reference);
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_3

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    sput v1, Lcom/baidu/location/t;->fc:I

    sput v0, Lcom/baidu/location/t;->fd:I

    :cond_0
    #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-ne v0, v3, :cond_1

    sput v3, Lcom/baidu/location/t;->fd:I

    :cond_1
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_3
    #v0=(Integer);v1=(Integer);v2=(Reference);v3=(Integer);v4=(Reference);v5=(Integer);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_1
.end method

.method static synthetic do(Lcom/baidu/location/t;Lorg/apache/http/HttpEntity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/t;->do(Lorg/apache/http/HttpEntity;)V

    return-void
.end method

.method private do(Lorg/apache/http/HttpEntity;)V
    .locals 3

    const/4 v1, -0x1

    #v1=(Byte);
    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    const-string v2, "utf-8"

    #v2=(Reference);
    invoke-static {p1, v2}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/location/t;->i(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    invoke-static {}, Lcom/baidu/location/t;->aI()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :cond_0
    :goto_0
    :try_start_1
    #v2=(Conflicted);
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v0, "ctr"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    const-string v0, "ctr"

    #v0=(Reference);
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    sput v0, Lcom/baidu/location/t;->e4:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    :try_start_2
    #v0=(Conflicted);v2=(Conflicted);
    invoke-static {}, Lcom/baidu/location/t;->aO()V

    sget v0, Lcom/baidu/location/t;->e4:I

    #v0=(Integer);
    if-eq v0, v1, :cond_3

    sget v0, Lcom/baidu/location/t;->e4:I

    sget v2, Lcom/baidu/location/t;->e4:I

    #v2=(Integer);
    invoke-static {v2}, Lcom/baidu/location/t;->int(I)V

    :goto_2
    #v2=(Conflicted);
    if-eq v0, v1, :cond_2

    invoke-static {v0}, Lcom/baidu/location/t;->new(I)V

    :cond_2
    invoke-static {}, Lcom/baidu/location/m;->D()Lcom/baidu/location/m;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/m;->E()Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x5c

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :goto_3
    #v1=(Byte);
    return-void

    :cond_3
    #v0=(Integer);
    sget v0, Lcom/baidu/location/t;->fc:I

    if-eq v0, v1, :cond_4

    sget v0, Lcom/baidu/location/t;->fc:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_3

    :catch_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_1

    :catch_2
    move-exception v2

    #v2=(Reference);
    goto :goto_0

    :cond_4
    #v0=(Integer);v2=(Conflicted);
    move v0, v1

    #v0=(Byte);
    goto :goto_2
.end method

.method static synthetic if(Lcom/baidu/location/t;Lorg/apache/http/HttpEntity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/t;->if(Lorg/apache/http/HttpEntity;)V

    return-void
.end method

.method private if(Lorg/apache/http/HttpEntity;)V
    .locals 11

    const-wide v5, 0x3f9999999999999aL

    #v5=(LongLo);v6=(LongHi);
    const/16 v10, 0x8

    #v10=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    const-wide/16 v8, 0xff

    :try_start_0
    #v8=(LongLo);v9=(LongHi);
    invoke-static {p1}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B

    move-result-object v2

    #v2=(Reference);
    if-nez v2, :cond_1

    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/location/t;->aN()V

    :cond_0
    :goto_1
    #v0=(Conflicted);v5=(Conflicted);
    return-void

    :cond_1
    #v0=(Null);v2=(Reference);v3=(Uninit);v4=(Uninit);v5=(LongLo);v7=(Uninit);
    array-length v3, v2

    #v3=(Integer);
    const/16 v4, 0x280

    #v4=(PosShort);
    if-ge v3, v4, :cond_2

    const/4 v0, 0x0

    sput-boolean v0, Lcom/baidu/location/b;->am:Z

    sget-wide v2, Lcom/baidu/location/b;->aj:D

    #v2=(DoubleLo);v3=(DoubleHi);
    add-double/2addr v2, v5

    sput-wide v2, Lcom/baidu/location/b;->aa:D

    sget-wide v2, Lcom/baidu/location/b;->a0:D

    sub-double/2addr v2, v5

    sput-wide v2, Lcom/baidu/location/b;->aB:D

    move v0, v1

    #v0=(One);
    goto :goto_0

    :cond_2
    #v0=(Null);v2=(Reference);v3=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    sput-boolean v3, Lcom/baidu/location/b;->am:Z

    const/4 v3, 0x7

    #v3=(PosByte);
    aget-byte v3, v2, v3

    #v3=(Byte);
    int-to-long v3, v3

    #v3=(LongLo);v4=(LongHi);
    and-long/2addr v3, v8

    const/16 v5, 0x38

    #v5=(PosByte);
    shl-long/2addr v3, v5

    const/4 v5, 0x6

    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x30

    #v7=(PosByte);
    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/4 v5, 0x5

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x28

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/4 v5, 0x4

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/4 v5, 0x3

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x18

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/4 v5, 0x2

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x10

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/4 v5, 0x1

    #v5=(One);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    shl-long/2addr v5, v10

    or-long/2addr v3, v5

    const/4 v5, 0x0

    #v5=(Null);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    or-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    #v3=(LongLo);
    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    sput-wide v3, Lcom/baidu/location/b;->aB:D

    const/16 v3, 0xf

    #v3=(PosByte);
    aget-byte v3, v2, v3

    #v3=(Byte);
    int-to-long v3, v3

    #v3=(LongLo);v4=(LongHi);
    and-long/2addr v3, v8

    const/16 v5, 0x38

    #v5=(PosByte);
    shl-long/2addr v3, v5

    const/16 v5, 0xe

    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x30

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/16 v5, 0xd

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x28

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/16 v5, 0xc

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/16 v5, 0xb

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x18

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/16 v5, 0xa

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    const/16 v7, 0x10

    shl-long/2addr v5, v7

    or-long/2addr v3, v5

    const/16 v5, 0x9

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    shl-long/2addr v5, v10

    or-long/2addr v3, v5

    const/16 v5, 0x8

    #v5=(PosByte);
    aget-byte v5, v2, v5

    #v5=(Byte);
    int-to-long v5, v5

    #v5=(LongLo);
    and-long/2addr v5, v8

    or-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    #v3=(LongLo);
    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    sput-wide v3, Lcom/baidu/location/b;->aa:D

    const/16 v3, 0x271

    #v3=(PosShort);
    new-array v3, v3, [B

    #v3=(Reference);
    sput-object v3, Lcom/baidu/location/b;->aw:[B

    :goto_2
    #v0=(Integer);v4=(Conflicted);
    const/16 v3, 0x271

    #v3=(PosShort);
    if-ge v0, v3, :cond_3

    sget-object v3, Lcom/baidu/location/b;->aw:[B

    #v3=(Reference);
    add-int/lit8 v4, v0, 0x10

    #v4=(Integer);
    aget-byte v4, v2, v4

    #v4=(Byte);
    aput-byte v4, v3, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :catch_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto/16 :goto_1

    :cond_3
    #v0=(Integer);v2=(Reference);v3=(PosShort);v5=(LongLo);v7=(PosByte);
    move v0, v1

    #v0=(One);
    goto/16 :goto_0
.end method

.method public static int(I)V
    .locals 5

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/t;->e2:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    invoke-static {}, Lcom/baidu/location/t;->aJ()V

    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v1, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    const-wide/16 v2, 0x4

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    sget v3, Lcom/baidu/location/t;->fd:I

    #v3=(Integer);
    mul-int/2addr v0, v3

    add-int/lit16 v0, v0, 0x80

    int-to-long v3, v0

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v1, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v3, Lcom/baidu/location/ap;->hb:Ljava/lang/String;

    #v3=(Reference);
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v3, v0

    #v3=(Integer);
    invoke-virtual {v1, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v3, 0x0

    #v3=(Null);
    array-length v4, v0

    #v4=(Integer);
    invoke-virtual {v1, v0, v3, v4}, Ljava/io/RandomAccessFile;->write([BII)V

    invoke-virtual {v1, p0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    sget v0, Lcom/baidu/location/t;->fd:I

    #v0=(Integer);
    if-ne v2, v0, :cond_1

    const-wide/16 v3, 0x8

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v1, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    add-int/lit8 v0, v2, 0x1

    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :cond_1
    #v3=(Conflicted);v4=(Conflicted);
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public static new(I)V
    .locals 6

    const/high16 v5, 0x2

    #v5=(Integer);
    const/high16 v4, 0x1

    #v4=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x1

    #v1=(One);
    and-int/lit8 v0, p0, 0x1

    #v0=(Integer);
    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    #v0=(Boolean);
    sput-boolean v0, Lcom/baidu/location/t;->e6:Z

    and-int/lit8 v0, p0, 0x2

    #v0=(Integer);
    const/4 v3, 0x2

    #v3=(PosByte);
    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_1
    #v0=(Boolean);
    sput-boolean v0, Lcom/baidu/location/t;->e9:Z

    and-int/lit8 v0, p0, 0x4

    #v0=(Integer);
    const/4 v3, 0x4

    if-ne v0, v3, :cond_2

    move v0, v1

    :goto_2
    #v0=(Boolean);
    sput-boolean v0, Lcom/baidu/location/t;->fb:Z

    and-int/lit8 v0, p0, 0x8

    #v0=(Integer);
    const/16 v3, 0x8

    if-ne v0, v3, :cond_3

    move v0, v1

    :goto_3
    #v0=(Boolean);
    sput-boolean v0, Lcom/baidu/location/t;->e0:Z

    and-int v0, p0, v4

    #v0=(Integer);
    if-ne v0, v4, :cond_4

    move v0, v1

    :goto_4
    #v0=(Boolean);
    sput-boolean v0, Lcom/baidu/location/t;->e1:Z

    and-int v0, p0, v5

    #v0=(Integer);
    if-ne v0, v5, :cond_5

    :goto_5
    #v1=(Boolean);
    sput-boolean v1, Lcom/baidu/location/t;->e5:Z

    return-void

    :cond_0
    #v1=(One);v3=(Uninit);
    move v0, v2

    #v0=(Null);
    goto :goto_0

    :cond_1
    #v0=(Integer);v3=(PosByte);
    move v0, v2

    #v0=(Null);
    goto :goto_1

    :cond_2
    #v0=(Integer);
    move v0, v2

    #v0=(Null);
    goto :goto_2

    :cond_3
    #v0=(Integer);
    move v0, v2

    #v0=(Null);
    goto :goto_3

    :cond_4
    #v0=(Integer);
    move v0, v2

    #v0=(Null);
    goto :goto_4

    :cond_5
    #v0=(Integer);
    move v1, v2

    #v1=(Null);
    goto :goto_5
.end method


# virtual methods
.method public aL()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/config.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readBoolean()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const-wide/16 v1, 0x2

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    #v1=(Integer);
    new-array v2, v1, [B

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0, v2, v3, v1}, Ljava/io/RandomAccessFile;->read([BII)I

    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    #v1=(Reference);
    invoke-virtual {p0, v1}, Lcom/baidu/location/t;->i(Ljava/lang/String;)Z

    :cond_0
    #v1=(Conflicted);v3=(Conflicted);
    const-wide/16 v1, 0x1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readBoolean()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    const-wide/16 v1, 0x400

    #v1=(LongLo);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readDouble()D

    move-result-wide v1

    #v1=(DoubleLo);v2=(DoubleHi);
    sput-wide v1, Lcom/baidu/location/b;->aB:D

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readDouble()D

    move-result-wide v1

    sput-wide v1, Lcom/baidu/location/b;->aa:D

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readBoolean()Z

    move-result v1

    #v1=(Boolean);
    sput-boolean v1, Lcom/baidu/location/b;->am:Z

    sget-boolean v1, Lcom/baidu/location/b;->am:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x271

    #v1=(PosShort);
    new-array v1, v1, [B

    #v1=(Reference);
    sput-object v1, Lcom/baidu/location/b;->aw:[B

    sget-object v1, Lcom/baidu/location/b;->aw:[B

    const/4 v2, 0x0

    #v2=(Null);
    const/16 v3, 0x271

    #v3=(PosShort);
    invoke-virtual {v0, v1, v2, v3}, Ljava/io/RandomAccessFile;->read([BII)I

    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_2
    #v0=(Conflicted);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "&ver="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/baidu/location/b;->af:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&usr="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/ap;->bD()Lcom/baidu/location/ap;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/ap;->bC()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&app="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/baidu/location/ap;->hb:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&prod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/baidu/location/ap;->g7:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/t;->e3:Lcom/baidu/location/t$a;

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v0, v2}, Lcom/baidu/location/t$a;->if(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public aM()V
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/t;->e7:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/t;->aL()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/t;->e7:Z

    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/t;->e3:Lcom/baidu/location/t$a;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, p1, v1}, Lcom/baidu/location/t$a;->if(Ljava/lang/String;Z)V

    return-void
.end method

.method public i(Ljava/lang/String;)Z
    .locals 9

    const/4 v7, 0x4

    #v7=(PosByte);
    const/4 v6, 0x3

    #v6=(PosByte);
    const/4 v8, 0x2

    #v8=(PosByte);
    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-eqz p1, :cond_28

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const-string v3, "ver"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    sget v4, Lcom/baidu/location/b;->af:I

    #v4=(Integer);
    if-le v3, v4, :cond_28

    sput v3, Lcom/baidu/location/b;->af:I

    const-string v3, "gps"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_a

    const-string v3, "gps"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\|"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    #v4=(Integer);
    const/16 v5, 0xa

    #v5=(PosByte);
    if-le v4, v5, :cond_a

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    aget-object v4, v3, v4

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->ab:F

    :cond_0
    #v5=(Conflicted);
    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_1

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->aK:F

    :cond_1
    #v5=(Conflicted);
    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_2

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_2

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->ad:F

    :cond_2
    #v5=(Conflicted);
    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_3

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_3

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->aM:F

    :cond_3
    #v5=(Conflicted);
    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_4

    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_4

    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->aC:I

    :cond_4
    #v5=(Conflicted);
    const/4 v4, 0x5

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_5

    const/4 v4, 0x5

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_5

    const/4 v4, 0x5

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->U:I

    :cond_5
    #v5=(Conflicted);
    const/4 v4, 0x6

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_6

    const/4 v4, 0x6

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_6

    const/4 v4, 0x6

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->aD:I

    :cond_6
    #v5=(Conflicted);
    const/4 v4, 0x7

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_7

    const/4 v4, 0x7

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_7

    const/4 v4, 0x7

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->V:I

    :cond_7
    #v5=(Conflicted);
    const/16 v4, 0x8

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_8

    const/16 v4, 0x8

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_8

    const/16 v4, 0x8

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->Y:I

    :cond_8
    #v5=(Conflicted);
    const/16 v4, 0x9

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_9

    const/16 v4, 0x9

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_9

    const/16 v4, 0x9

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->as:I

    :cond_9
    #v5=(Conflicted);
    const/16 v4, 0xa

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_a

    const/16 v4, 0xa

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_a

    const/16 v4, 0xa

    #v4=(PosByte);
    aget-object v3, v3, v4

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    sput v3, Lcom/baidu/location/b;->aW:I

    :cond_a
    #v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    const-string v3, "up"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_e

    const-string v3, "up"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\|"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    #v4=(Integer);
    if-le v4, v6, :cond_e

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    if-eqz v4, :cond_b

    const/4 v4, 0x0

    aget-object v4, v3, v4

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_b

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->a5:F

    :cond_b
    #v5=(Conflicted);
    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_c

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_c

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->a2:F

    :cond_c
    #v5=(Conflicted);
    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_d

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_d

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->ak:F

    :cond_d
    #v5=(Conflicted);
    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_e

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_e

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v3, v3, v4

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    #v3=(Float);
    sput v3, Lcom/baidu/location/b;->aS:F

    :cond_e
    #v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    const-string v3, "wf"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_12

    const-string v3, "wf"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\|"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    #v4=(Integer);
    if-le v4, v6, :cond_12

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    if-eqz v4, :cond_f

    const/4 v4, 0x0

    aget-object v4, v3, v4

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_f

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->aQ:I

    :cond_f
    #v5=(Conflicted);
    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_10

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_10

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->Z:F

    :cond_10
    #v5=(Conflicted);
    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_11

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_11

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->ao:I

    :cond_11
    #v5=(Conflicted);
    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_12

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_12

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v3, v3, v4

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    #v3=(Float);
    sput v3, Lcom/baidu/location/b;->aN:F

    :cond_12
    #v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    const-string v3, "ab"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_16

    const-string v3, "ab"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\|"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    #v4=(Integer);
    if-le v4, v6, :cond_16

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    if-eqz v4, :cond_13

    const/4 v4, 0x0

    aget-object v4, v3, v4

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_13

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->a4:F

    :cond_13
    #v5=(Conflicted);
    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_14

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_14

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->a1:F

    :cond_14
    #v5=(Conflicted);
    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_15

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_15

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->aZ:I

    :cond_15
    #v5=(Conflicted);
    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_16

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_16

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v3, v3, v4

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    sput v3, Lcom/baidu/location/b;->aX:I

    :cond_16
    #v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    const-string v3, "zxd"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1b

    const-string v3, "zxd"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\|"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    #v4=(Integer);
    if-le v4, v7, :cond_1b

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    if-eqz v4, :cond_17

    const/4 v4, 0x0

    aget-object v4, v3, v4

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_17

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->ac:F

    :cond_17
    #v5=(Conflicted);
    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_18

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_18

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    #v4=(Float);
    sput v4, Lcom/baidu/location/b;->X:F

    :cond_18
    #v5=(Conflicted);
    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_19

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_19

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->al:I

    :cond_19
    #v5=(Conflicted);
    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_1a

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1a

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->az:I

    :cond_1a
    #v5=(Conflicted);
    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_1b

    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1b

    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v3, v3, v4

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    sput v3, Lcom/baidu/location/b;->ap:I

    :cond_1b
    #v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    const-string v3, "gpc"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_21

    const-string v3, "gpc"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\|"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    #v4=(Integer);
    const/4 v5, 0x5

    #v5=(PosByte);
    if-le v4, v5, :cond_21

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    if-eqz v4, :cond_1c

    const/4 v4, 0x0

    aget-object v4, v3, v4

    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1c

    const/4 v4, 0x0

    #v4=(Null);
    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_25

    const/4 v4, 0x1

    #v4=(One);
    sput-boolean v4, Lcom/baidu/location/b;->au:Z

    :cond_1c
    :goto_0
    #v4=(Boolean);v5=(Conflicted);
    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_1d

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1d

    const/4 v4, 0x1

    #v4=(One);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_26

    const/4 v4, 0x1

    #v4=(One);
    sput-boolean v4, Lcom/baidu/location/b;->aR:Z

    :cond_1d
    :goto_1
    #v4=(Boolean);v5=(Conflicted);
    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_1e

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1e

    const/4 v4, 0x2

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->aq:I

    :cond_1e
    #v5=(Conflicted);
    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_1f

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1f

    const/4 v4, 0x3

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/b;->at:I

    :cond_1f
    #v5=(Conflicted);
    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_20

    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_20

    const/4 v4, 0x4

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_27

    int-to-long v4, v4

    #v4=(LongLo);v5=(LongHi);
    sput-wide v4, Lcom/baidu/location/b;->aL:J

    sget-wide v4, Lcom/baidu/location/b;->aL:J

    const-wide/16 v6, 0x3e8

    #v6=(LongLo);v7=(LongHi);
    mul-long/2addr v4, v6

    const-wide/16 v6, 0x3c

    mul-long/2addr v4, v6

    sput-wide v4, Lcom/baidu/location/b;->aJ:J

    sget-wide v4, Lcom/baidu/location/b;->aJ:J

    shr-long/2addr v4, v8

    sput-wide v4, Lcom/baidu/location/b;->ay:J

    :cond_20
    :goto_2
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    const/4 v4, 0x5

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    if-eqz v4, :cond_21

    const/4 v4, 0x5

    #v4=(PosByte);
    aget-object v4, v3, v4

    #v4=(Null);
    const-string v5, ""

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_21

    const/4 v4, 0x5

    #v4=(PosByte);
    aget-object v3, v3, v4

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    sput v3, Lcom/baidu/location/b;->aO:I

    :cond_21
    #v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    const-string v3, "shak"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_24

    const-string v3, "shak"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\|"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    #v3=(Integer);
    if-le v3, v8, :cond_24

    const/4 v3, 0x0

    #v3=(Null);
    aget-object v3, v2, v3

    if-eqz v3, :cond_22

    const/4 v3, 0x0

    aget-object v3, v2, v3

    const-string v4, ""

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_22

    const/4 v3, 0x0

    #v3=(Null);
    aget-object v3, v2, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    sput v3, Lcom/baidu/location/b;->aP:I

    :cond_22
    #v4=(Conflicted);
    const/4 v3, 0x1

    #v3=(One);
    aget-object v3, v2, v3

    #v3=(Null);
    if-eqz v3, :cond_23

    const/4 v3, 0x1

    #v3=(One);
    aget-object v3, v2, v3

    #v3=(Null);
    const-string v4, ""

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_23

    const/4 v3, 0x1

    #v3=(One);
    aget-object v3, v2, v3

    #v3=(Null);
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    sput v3, Lcom/baidu/location/b;->aH:I

    :cond_23
    #v4=(Conflicted);
    const/4 v3, 0x2

    #v3=(PosByte);
    aget-object v3, v2, v3

    #v3=(Null);
    if-eqz v3, :cond_24

    const/4 v3, 0x2

    #v3=(PosByte);
    aget-object v3, v2, v3

    #v3=(Null);
    const-string v4, ""

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_24

    const/4 v3, 0x2

    #v3=(PosByte);
    aget-object v2, v2, v3

    #v2=(Null);
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    #v2=(Float);
    sput v2, Lcom/baidu/location/b;->aU:F

    :cond_24
    :goto_3
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move v1, v0

    :goto_4
    #v0=(Conflicted);v1=(Boolean);
    return v1

    :cond_25
    #v0=(One);v1=(Null);v2=(Reference);v3=(Reference);v4=(Integer);v5=(Reference);v6=(PosByte);v7=(PosByte);
    const/4 v4, 0x0

    #v4=(Null);
    sput-boolean v4, Lcom/baidu/location/b;->au:Z

    goto/16 :goto_0

    :catch_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_4

    :cond_26
    #v0=(One);v2=(Reference);v3=(Reference);v4=(Integer);v5=(Reference);v6=(PosByte);v7=(PosByte);
    const/4 v4, 0x0

    #v4=(Null);
    sput-boolean v4, Lcom/baidu/location/b;->aR:Z

    goto/16 :goto_1

    :cond_27
    #v4=(Integer);
    const/4 v4, 0x0

    #v4=(Null);
    sput-boolean v4, Lcom/baidu/location/b;->aY:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :cond_28
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);
    move v0, v1

    #v0=(Null);
    goto :goto_3
.end method

*/}
