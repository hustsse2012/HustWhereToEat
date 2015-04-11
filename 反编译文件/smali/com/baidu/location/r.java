package com.baidu.location; class r {/*

.class public Lcom/baidu/location/r;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# static fields
.field private static d0:Ljava/io/File; = null

.field private static final d1:I = 0xe10

.field private static d2:I = 0x0

.field private static d3:J = 0x0L

.field private static d4:J = 0x0L

.field private static d5:Z = false

.field private static final d6:I = 0x400

.field private static d7:I = 0x0

.field private static d8:D = 0.0

.field private static d9:D = 0.0

.field private static final dX:I = 0xc

.field private static dY:Ljava/lang/StringBuffer; = null

.field private static final dZ:I = 0x5

.field private static ea:Ljava/lang/String; = null

.field private static eb:I = 0x0

.field private static ec:I = 0x0

.field private static final ed:I = 0x5

.field private static final ee:I = 0x2ee

.field private static final ef:I = 0x3e8

.field private static final eh:I = 0x64

.field private static ej:I

.field private static ek:Lcom/baidu/location/r;

.field private static el:J


# instance fields
.field private eg:Ljava/lang/String;

.field private ei:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/4 v8, 0x0

    #v8=(Null);
    const-wide/16 v6, 0x0

    #v6=(LongLo);v7=(LongHi);
    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    const/4 v3, 0x0

    #v3=(Null);
    sput-object v8, Lcom/baidu/location/r;->ek:Lcom/baidu/location/r;

    const-string v0, "Temp_in.dat"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/r;->ea:Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v1=(Reference);
    sget-object v2, Lcom/baidu/location/r;->ea:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/r;->d0:Ljava/io/File;

    sput-object v8, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/baidu/location/r;->d5:Z

    sput v3, Lcom/baidu/location/r;->eb:I

    sput v3, Lcom/baidu/location/r;->ej:I

    sput-wide v4, Lcom/baidu/location/r;->d4:J

    sput-wide v4, Lcom/baidu/location/r;->d3:J

    sput-wide v4, Lcom/baidu/location/r;->el:J

    sput-wide v6, Lcom/baidu/location/r;->d8:D

    sput-wide v6, Lcom/baidu/location/r;->d9:D

    sput v3, Lcom/baidu/location/r;->d2:I

    sput v3, Lcom/baidu/location/r;->d7:I

    sput v3, Lcom/baidu/location/r;->ec:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/16 v1, 0x64

    #v1=(PosByte);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/r;->eg:Ljava/lang/String;

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/r;->ei:Z

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_0
    :goto_0
    #v0=(Integer);
    iput-object p1, p0, Lcom/baidu/location/r;->eg:Ljava/lang/String;

    return-void

    :cond_1
    #v0=(One);
    const-string p1, ""

    goto :goto_0
.end method

.method private static ao()Z
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    sget-object v1, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    #v1=(Conflicted);
    sget-object v1, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    sget-object v1, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    :try_start_0
    #v1=(Conflicted);
    sget-object v1, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    sget-object v2, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v2=(Reference);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    invoke-static {}, Lcom/baidu/location/r;->aq()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v0

    :catch_0
    #v0=(Null);v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0
.end method

.method private ap()V
    .locals 2

    sget-object v0, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    #v0=(Reference);
    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x64

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/baidu/location/r;->d(Ljava/lang/String;)Z

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    invoke-static {}, Lcom/baidu/location/r;->aq()V

    return-void
.end method

.method private static aq()V
    .locals 6

    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/baidu/location/r;->d5:Z

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    sput v1, Lcom/baidu/location/r;->eb:I

    sput v1, Lcom/baidu/location/r;->ej:I

    sput-wide v2, Lcom/baidu/location/r;->d4:J

    sput-wide v2, Lcom/baidu/location/r;->d3:J

    sput-wide v2, Lcom/baidu/location/r;->el:J

    sput-wide v4, Lcom/baidu/location/r;->d8:D

    sput-wide v4, Lcom/baidu/location/r;->d9:D

    sput v1, Lcom/baidu/location/r;->d2:I

    sput v1, Lcom/baidu/location/r;->d7:I

    sput v1, Lcom/baidu/location/r;->ec:I

    return-void
.end method

.method public static ar()Lcom/baidu/location/r;
    .locals 2

    sget-object v0, Lcom/baidu/location/r;->ek:Lcom/baidu/location/r;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/r;

    #v0=(UninitRef);
    invoke-static {}, Lcom/baidu/location/ap;->bD()Lcom/baidu/location/ap;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/ap;->bE()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/baidu/location/r;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/r;->ek:Lcom/baidu/location/r;

    :cond_0
    #v1=(Conflicted);
    sget-object v0, Lcom/baidu/location/r;->ek:Lcom/baidu/location/r;

    return-object v0
.end method

.method private as()V
    .locals 0

    return-void
.end method

.method public static at()Ljava/lang/String;
    .locals 12

    const-wide/16 v10, 0x4

    #v10=(LongLo);v11=(LongHi);
    const/4 v1, 0x0

    #v1=(Null);
    sget-object v0, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v0=(Reference);
    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v0

    :cond_0
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    sget-object v0, Lcom/baidu/location/r;->d0:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    move-object v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_1
    :try_start_0
    #v0=(Boolean);
    new-instance v3, Ljava/io/RandomAccessFile;

    #v3=(UninitRef);
    sget-object v0, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v0=(Reference);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v3, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v3=(Reference);
    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v7

    #v7=(Integer);
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    #v0=(Integer);
    invoke-static {v6, v7, v0}, Lcom/baidu/location/r;->if(III)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_2

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    invoke-static {}, Lcom/baidu/location/r;->ao()Z

    move-object v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Integer);
    if-eqz v7, :cond_3

    if-ne v7, v0, :cond_4

    :cond_3
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    move-object v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(Integer);
    add-int/lit8 v0, v7, -0x1

    mul-int/lit16 v0, v0, 0x400

    add-int/lit8 v0, v0, 0xc

    int-to-long v8, v0

    #v8=(LongLo);v9=(LongHi);
    add-long/2addr v4, v8

    invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    new-array v8, v2, [B

    #v8=(Reference);
    add-long/2addr v4, v10

    invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v0, 0x0

    :goto_1
    #v4=(Conflicted);
    if-ge v0, v2, :cond_5

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readByte()B

    move-result v4

    #v4=(Byte);
    aput-byte v4, v8, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    #v4=(Conflicted);
    new-instance v2, Ljava/lang/String;

    #v2=(UninitRef);
    invoke-direct {v2, v8}, Ljava/lang/String;-><init>([B)V

    #v2=(Reference);
    sget v0, Lcom/baidu/location/b;->at:I

    if-ge v6, v0, :cond_6

    add-int/lit8 v0, v7, 0x1

    :goto_2
    const-wide/16 v4, 0x4

    #v4=(LongLo);
    invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    move-object v0, v2

    #v0=(Reference);
    goto :goto_0

    :cond_6
    #v0=(Integer);v4=(Conflicted);
    sget v0, Lcom/baidu/location/b;->at:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v7, v0, :cond_7

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_2

    :cond_7
    #v0=(Integer);
    add-int/lit8 v0, v7, 0x1

    goto :goto_2

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method private au()Z
    .locals 1

    sget-object v0, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    #v0=(Conflicted);
    invoke-static {}, Lcom/baidu/location/r;->aq()V

    sget-object v0, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private d(Ljava/lang/String;)Z
    .locals 11

    const-wide/16 v9, 0x0

    #v9=(LongLo);v10=(LongHi);
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v1, 0x1

    #v1=(One);
    if-eqz p1, :cond_0

    const-string v2, "&nr"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    sget-object v2, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_2

    invoke-static {}, Lcom/baidu/location/r;->ao()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    :try_start_0
    new-instance v4, Ljava/io/RandomAccessFile;

    #v4=(UninitRef);
    sget-object v2, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v2=(Reference);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v4, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v4=(Reference);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v4, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v6

    #v6=(Integer);
    invoke-static {v3, v5, v6}, Lcom/baidu/location/r;->if(III)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_3

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    invoke-static {}, Lcom/baidu/location/r;->ao()Z

    goto :goto_0

    :catch_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0

    :cond_3
    #v1=(One);v2=(Boolean);v3=(Integer);v4=(Reference);v5=(Integer);v6=(Integer);v7=(Uninit);v8=(Uninit);
    sget-boolean v2, Lcom/baidu/location/b;->aR:Z

    if-eqz v2, :cond_6

    sget v2, Lcom/baidu/location/b;->at:I

    #v2=(Integer);
    if-eq v3, v2, :cond_4

    if-le v6, v1, :cond_6

    add-int/lit8 v2, v6, -0x1

    invoke-direct {p0, v2}, Lcom/baidu/location/r;->do(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_6

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :cond_4
    #v2=(Integer);
    if-ne v6, v1, :cond_5

    sget v2, Lcom/baidu/location/b;->at:I

    :goto_1
    invoke-direct {p0, v2}, Lcom/baidu/location/r;->do(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_6

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :cond_5
    #v2=(Integer);
    add-int/lit8 v2, v6, -0x1

    goto :goto_1

    :cond_6
    add-int/lit8 v2, v6, -0x1

    mul-int/lit16 v2, v2, 0x400

    add-int/lit8 v2, v2, 0xc

    int-to-long v7, v2

    #v7=(LongLo);v8=(LongHi);
    add-long/2addr v7, v9

    invoke-virtual {v4, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v7, 0x2ee

    #v7=(PosShort);
    if-le v2, v7, :cond_7

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :cond_7
    invoke-static {p1}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    #v7=(Integer);
    const/16 v8, 0x3fc

    #v8=(PosShort);
    if-le v7, v8, :cond_8

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v4, v7}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeBytes(Ljava/lang/String;)V

    if-nez v3, :cond_9

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v4, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v2, 0x2

    #v2=(PosByte);
    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :goto_2
    #v2=(Integer);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    move v0, v1

    #v0=(One);
    goto/16 :goto_0

    :cond_9
    #v0=(Null);v2=(Reference);v3=(Integer);v5=(Integer);v6=(Integer);
    sget v2, Lcom/baidu/location/b;->at:I

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    if-ge v3, v2, :cond_a

    const-wide/16 v5, 0x0

    #v5=(LongLo);v6=(LongHi);
    invoke-virtual {v4, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    add-int/lit8 v2, v3, 0x1

    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const-wide/16 v5, 0x8

    invoke-virtual {v4, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    add-int/lit8 v2, v3, 0x2

    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    goto :goto_2

    :cond_a
    #v5=(Integer);v6=(Integer);
    sget v2, Lcom/baidu/location/b;->at:I

    add-int/lit8 v2, v2, -0x1

    if-ne v3, v2, :cond_d

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v4, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    sget v2, Lcom/baidu/location/b;->at:I

    #v2=(Integer);
    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    if-eqz v5, :cond_b

    if-ne v5, v1, :cond_c

    :cond_b
    const/4 v2, 0x2

    #v2=(PosByte);
    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :cond_c
    #v2=(Integer);
    const-wide/16 v2, 0x8

    #v2=(LongLo);
    invoke-virtual {v4, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    goto :goto_2

    :cond_d
    #v2=(Integer);v3=(Integer);
    if-ne v6, v5, :cond_10

    sget v2, Lcom/baidu/location/b;->at:I

    if-ne v6, v2, :cond_e

    move v3, v1

    :goto_3
    sget v2, Lcom/baidu/location/b;->at:I

    if-ne v3, v2, :cond_f

    move v2, v1

    :goto_4
    const-wide/16 v5, 0x4

    #v5=(LongLo);v6=(LongHi);
    invoke-virtual {v4, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v4, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    goto :goto_2

    :cond_e
    #v5=(Integer);v6=(Integer);
    add-int/lit8 v2, v6, 0x1

    move v3, v2

    goto :goto_3

    :cond_f
    add-int/lit8 v2, v3, 0x1

    goto :goto_4

    :cond_10
    sget v2, Lcom/baidu/location/b;->at:I

    if-ne v6, v2, :cond_12

    move v3, v1

    :goto_5
    if-ne v3, v5, :cond_11

    sget v2, Lcom/baidu/location/b;->at:I

    if-ne v3, v2, :cond_13

    move v2, v1

    :goto_6
    const-wide/16 v5, 0x4

    #v5=(LongLo);v6=(LongHi);
    invoke-virtual {v4, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v4, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :cond_11
    #v5=(Conflicted);v6=(Conflicted);
    const-wide/16 v5, 0x8

    #v5=(LongLo);v6=(LongHi);
    invoke-virtual {v4, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v4, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_12
    #v5=(Integer);v6=(Integer);
    add-int/lit8 v2, v6, 0x1

    move v3, v2

    goto :goto_5

    :cond_13
    add-int/lit8 v2, v3, 0x1

    goto :goto_6
.end method

.method private do(I)Ljava/lang/String;
    .locals 9

    const-wide/16 v5, 0x0

    #v5=(LongLo);v6=(LongHi);
    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-object v0

    :cond_0
    :try_start_0
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(LongLo);v6=(LongHi);v7=(Uninit);v8=(Uninit);
    new-instance v2, Ljava/io/RandomAccessFile;

    #v2=(UninitRef);
    sget-object v1, Lcom/baidu/location/r;->d0:Ljava/io/File;

    #v1=(Reference);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v2, v1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v2=(Reference);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v4

    #v4=(Integer);
    invoke-static {v1, v3, v4}, Lcom/baidu/location/r;->if(III)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    invoke-static {}, Lcom/baidu/location/r;->ao()Z

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0

    :cond_1
    #v1=(Integer);v2=(Reference);v3=(Boolean);v4=(Integer);v5=(LongLo);v6=(LongHi);v7=(Uninit);v8=(Uninit);
    if-eqz p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    if-ne p1, v1, :cond_3

    :cond_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :cond_3
    const-wide/16 v3, 0xc

    #v3=(LongLo);v4=(LongHi);
    add-long/2addr v3, v5

    add-int/lit8 v1, p1, -0x1

    mul-int/lit16 v1, v1, 0x400

    int-to-long v5, v1

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v5

    #v5=(Integer);
    new-array v6, v5, [B

    #v6=(Reference);
    const-wide/16 v7, 0x4

    #v7=(LongLo);v8=(LongHi);
    add-long/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v1, 0x0

    :goto_1
    #v3=(Conflicted);
    if-ge v1, v5, :cond_4

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readByte()B

    move-result v3

    #v3=(Byte);
    aput-byte v3, v6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    #v3=(Conflicted);
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    invoke-direct {v1, v6}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    #v1=(Reference);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0
.end method

.method private static if(III)Z
    .locals 3

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-ltz p0, :cond_0

    sget v2, Lcom/baidu/location/b;->at:I

    #v2=(Integer);
    if-le p0, v2, :cond_2

    :cond_0
    #v2=(Conflicted);
    move v0, v1

    :cond_1
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_2
    #v0=(One);v2=(Integer);
    if-ltz p1, :cond_3

    add-int/lit8 v2, p0, 0x1

    if-le p1, v2, :cond_4

    :cond_3
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    if-lt p2, v0, :cond_5

    add-int/lit8 v2, p0, 0x1

    if-gt p2, v2, :cond_5

    sget v2, Lcom/baidu/location/b;->at:I

    if-le p2, v2, :cond_1

    :cond_5
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method private if(Landroid/location/Location;II)Z
    .locals 12

    if-eqz p1, :cond_0

    sget-boolean v0, Lcom/baidu/location/b;->au:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/r;->ei:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/location/t;->e9:Z

    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return v0

    :cond_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    sget v0, Lcom/baidu/location/b;->aq:I

    #v0=(Integer);
    const/4 v1, 0x5

    #v1=(PosByte);
    if-ge v0, v1, :cond_4

    const/4 v0, 0x5

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/b;->aq:I

    :cond_2
    :goto_1
    #v0=(Integer);v1=(PosShort);
    sget v0, Lcom/baidu/location/b;->an:I

    const/4 v1, 0x5

    #v1=(PosByte);
    if-ge v0, v1, :cond_5

    const/4 v0, 0x5

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/b;->an:I

    :cond_3
    :goto_2
    #v0=(Integer);v1=(PosShort);
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    const-wide/16 v6, 0x3e8

    #v6=(LongLo);v7=(LongHi);
    div-long v9, v4, v6

    #v9=(LongLo);v10=(LongHi);
    sget-boolean v4, Lcom/baidu/location/r;->d5:Z

    #v4=(Boolean);
    if-eqz v4, :cond_6

    const/4 v4, 0x1

    #v4=(One);
    sput v4, Lcom/baidu/location/r;->eb:I

    new-instance v4, Ljava/lang/StringBuffer;

    #v4=(UninitRef);
    const-string v5, ""

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    sput-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    sget-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v6, "&nr=%s&traj=%d,%.5f,%.5f|"

    #v6=(Reference);
    const/4 v7, 0x4

    #v7=(PosByte);
    new-array v7, v7, [Ljava/lang/Object;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    iget-object v11, p0, Lcom/baidu/location/r;->eg:Ljava/lang/String;

    #v11=(Reference);
    aput-object v11, v7, v8

    const/4 v8, 0x1

    #v8=(One);
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    aput-object v11, v7, v8

    const/4 v8, 0x2

    #v8=(PosByte);
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    aput-object v11, v7, v8

    const/4 v8, 0x3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    aput-object v11, v7, v8

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/r;->ej:I

    sput-wide v9, Lcom/baidu/location/r;->d4:J

    sput-wide v2, Lcom/baidu/location/r;->d8:D

    sput-wide v0, Lcom/baidu/location/r;->d9:D

    const-wide v4, 0x40f86a0000000000L

    #v4=(LongLo);v5=(LongHi);
    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x3fe0

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    sput-wide v2, Lcom/baidu/location/r;->d3:J

    const-wide v2, 0x40f86a0000000000L

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/location/r;->el:J

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/baidu/location/r;->d5:Z

    const/4 v0, 0x1

    #v0=(One);
    goto/16 :goto_0

    :cond_4
    #v0=(Integer);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    sget v0, Lcom/baidu/location/b;->aq:I

    const/16 v1, 0x3e8

    #v1=(PosShort);
    if-le v0, v1, :cond_2

    const/16 v0, 0x3e8

    #v0=(PosShort);
    sput v0, Lcom/baidu/location/b;->aq:I

    goto/16 :goto_1

    :cond_5
    #v0=(Integer);v1=(PosByte);
    sget v0, Lcom/baidu/location/b;->an:I

    const/16 v1, 0xe10

    #v1=(PosShort);
    if-le v0, v1, :cond_3

    const/16 v0, 0xe10

    #v0=(PosShort);
    sput v0, Lcom/baidu/location/b;->an:I

    goto/16 :goto_2

    :cond_6
    #v0=(DoubleLo);v1=(DoubleHi);v2=(DoubleLo);v3=(DoubleHi);v4=(Boolean);v5=(LongHi);v6=(LongLo);v7=(LongHi);v9=(LongLo);v10=(LongHi);
    const/4 v4, 0x1

    #v4=(One);
    new-array v8, v4, [F

    #v8=(Reference);
    sget-wide v4, Lcom/baidu/location/r;->d9:D

    #v4=(DoubleLo);v5=(DoubleHi);
    sget-wide v6, Lcom/baidu/location/r;->d8:D

    #v6=(DoubleLo);v7=(DoubleHi);
    invoke-static/range {v0 .. v8}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    sget-wide v4, Lcom/baidu/location/r;->d4:J

    #v4=(LongLo);v5=(LongHi);
    sub-long v4, v9, v4

    const/4 v6, 0x0

    #v6=(Null);
    aget v6, v8, v6

    #v6=(Integer);
    sget v7, Lcom/baidu/location/b;->aq:I

    #v7=(Integer);
    int-to-float v7, v7

    #v7=(Float);
    cmpl-float v6, v6, v7

    #v6=(Byte);
    if-gez v6, :cond_7

    sget v6, Lcom/baidu/location/b;->an:I

    #v6=(Integer);
    int-to-long v6, v6

    #v6=(LongLo);v7=(LongHi);
    cmp-long v4, v4, v6

    #v4=(Byte);
    if-ltz v4, :cond_b

    :cond_7
    #v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    sget-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    #v4=(Reference);
    if-nez v4, :cond_a

    sget v4, Lcom/baidu/location/r;->eb:I

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x1

    sput v4, Lcom/baidu/location/r;->eb:I

    const/4 v4, 0x0

    #v4=(Null);
    sput v4, Lcom/baidu/location/r;->ej:I

    new-instance v4, Ljava/lang/StringBuffer;

    #v4=(UninitRef);
    const-string v5, ""

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    sput-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    sget-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v6, "&nr=%s&traj=%d,%.5f,%.5f|"

    #v6=(Reference);
    const/4 v7, 0x4

    #v7=(PosByte);
    new-array v7, v7, [Ljava/lang/Object;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    iget-object v11, p0, Lcom/baidu/location/r;->eg:Ljava/lang/String;

    #v11=(Reference);
    aput-object v11, v7, v8

    const/4 v8, 0x1

    #v8=(One);
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    aput-object v11, v7, v8

    const/4 v8, 0x2

    #v8=(PosByte);
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    aput-object v11, v7, v8

    const/4 v8, 0x3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    aput-object v11, v7, v8

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/r;->ej:I

    sput-wide v9, Lcom/baidu/location/r;->d4:J

    sput-wide v2, Lcom/baidu/location/r;->d8:D

    sput-wide v0, Lcom/baidu/location/r;->d9:D

    const-wide v4, 0x40f86a0000000000L

    #v4=(LongLo);v5=(LongHi);
    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x3fe0

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    sput-wide v2, Lcom/baidu/location/r;->d3:J

    const-wide v2, 0x40f86a0000000000L

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/location/r;->el:J

    :goto_3
    #v4=(Conflicted);v5=(Conflicted);
    sget v0, Lcom/baidu/location/r;->ej:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0xf

    const/16 v1, 0x2ee

    #v1=(PosShort);
    if-le v0, v1, :cond_8

    sget-object v0, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/baidu/location/r;->d(Ljava/lang/String;)Z

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    :cond_8
    #v0=(Integer);
    sget v0, Lcom/baidu/location/r;->eb:I

    sget v1, Lcom/baidu/location/b;->at:I

    #v1=(Integer);
    if-lt v0, v1, :cond_9

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/r;->ei:Z

    :cond_9
    #v0=(Integer);
    const/4 v0, 0x1

    #v0=(One);
    goto/16 :goto_0

    :cond_a
    #v0=(DoubleLo);v1=(DoubleHi);v2=(DoubleLo);v3=(DoubleHi);v4=(Reference);v5=(LongHi);v6=(Conflicted);v7=(Conflicted);v8=(Reference);v11=(Uninit);
    sput-wide v2, Lcom/baidu/location/r;->d8:D

    sput-wide v0, Lcom/baidu/location/r;->d9:D

    const-wide v4, 0x40f86a0000000000L

    #v4=(LongLo);
    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x3fe0

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    const-wide v4, 0x40f86a0000000000L

    mul-double/2addr v0, v4

    const-wide/high16 v4, 0x3fe0

    add-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    sget-wide v4, Lcom/baidu/location/r;->d4:J

    sub-long v4, v9, v4

    long-to-int v4, v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/r;->d2:I

    sget-wide v4, Lcom/baidu/location/r;->d3:J

    #v4=(LongLo);
    sub-long v4, v2, v4

    long-to-int v4, v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/r;->d7:I

    sget-wide v4, Lcom/baidu/location/r;->el:J

    #v4=(LongLo);
    sub-long v4, v0, v4

    long-to-int v4, v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/r;->ec:I

    sget-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    #v4=(Reference);
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v5=(Reference);
    const-string v6, "%d,%d,%d|"

    #v6=(Reference);
    const/4 v7, 0x3

    #v7=(PosByte);
    new-array v7, v7, [Ljava/lang/Object;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    sget v11, Lcom/baidu/location/r;->d2:I

    #v11=(Integer);
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    #v11=(Reference);
    aput-object v11, v7, v8

    const/4 v8, 0x1

    #v8=(One);
    sget v11, Lcom/baidu/location/r;->d7:I

    #v11=(Integer);
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    #v11=(Reference);
    aput-object v11, v7, v8

    const/4 v8, 0x2

    #v8=(PosByte);
    sget v11, Lcom/baidu/location/r;->ec:I

    #v11=(Integer);
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    #v11=(Reference);
    aput-object v11, v7, v8

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v4, Lcom/baidu/location/r;->dY:Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I

    move-result v4

    #v4=(Integer);
    sput v4, Lcom/baidu/location/r;->ej:I

    sput-wide v9, Lcom/baidu/location/r;->d4:J

    sput-wide v2, Lcom/baidu/location/r;->d3:J

    sput-wide v0, Lcom/baidu/location/r;->el:J

    goto/16 :goto_3

    :cond_b
    #v0=(DoubleLo);v1=(DoubleHi);v2=(DoubleLo);v3=(DoubleHi);v4=(Byte);v5=(LongHi);v6=(LongLo);v7=(LongHi);v8=(Reference);v11=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto/16 :goto_0
.end method


# virtual methods
.method public av()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/r;->ap()V

    return-void
.end method

.method public do(Landroid/location/Location;)Z
    .locals 2

    sget v0, Lcom/baidu/location/b;->aq:I

    #v0=(Integer);
    sget v1, Lcom/baidu/location/b;->an:I

    #v1=(Integer);
    invoke-direct {p0, p1, v0, v1}, Lcom/baidu/location/r;->if(Landroid/location/Location;II)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
