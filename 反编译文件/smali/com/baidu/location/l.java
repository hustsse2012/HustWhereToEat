package com.baidu.location; class l {/*

.class Lcom/baidu/location/l;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/l$a;
    }
.end annotation


# static fields
.field private static b0:I = 0x0

.field private static b1:I = 0x0

.field private static final b2:I = 0x410

.field private static b3:Landroid/location/Location; = null

.field private static final b4:I = 0x20

.field private static b5:Lcom/baidu/location/ai$b; = null

.field private static b6:Ljava/util/ArrayList; = null

.field private static b7:I = 0x0

.field private static b8:Ljava/util/ArrayList; = null

.field private static final b9:Ljava/lang/String; = null

.field private static bN:Landroid/location/Location; = null

.field private static final bO:I = 0x800

.field private static final bP:I = 0x800

.field private static bQ:D = 0.0

.field private static bR:D = 0.0

.field private static bS:I = 0x0

.field private static bT:I = 0x0

.field private static bU:I = 0x0

.field private static bV:I = 0x0

.field private static bW:Ljava/io/File; = null

.field private static final bX:I = 0x80

.field private static bY:Ljava/util/ArrayList; = null

.field private static bZ:D = 0.0

.field private static ca:I = 0x0

.field private static cc:Ljava/util/ArrayList; = null

.field private static cd:D = 0.0

.field private static ce:I = 0x0

.field private static final cf:Ljava/lang/String; = null

.field private static cg:Landroid/location/Location; = null

.field private static ch:Ljava/util/ArrayList; = null

.field private static final ci:I = 0x800

.field private static final cj:Ljava/lang/String;

.field private static final ck:Ljava/lang/String;

.field private static cl:I

.field private static cm:I

.field private static cn:Ljava/util/ArrayList;

.field private static co:Lcom/baidu/location/l;

.field private static cp:Ljava/lang/String;


# instance fields
.field private cb:Lcom/baidu/location/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v4, 0x400

    #v4=(PosShort);
    const/16 v3, 0x8

    #v3=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/l;->b6:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/l;->bY:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/l;->cc:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/l;->cn:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/l;->b8:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/yo.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/l;->cp:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/yoh.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/l;->ck:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/yom.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/l;->cj:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/yol.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/l;->b9:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/yor.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/l;->cf:Ljava/lang/String;

    sput-object v2, Lcom/baidu/location/l;->bW:Ljava/io/File;

    sput v4, Lcom/baidu/location/l;->bU:I

    const/16 v0, 0x200

    #v0=(PosShort);
    sput v0, Lcom/baidu/location/l;->cm:I

    sput v3, Lcom/baidu/location/l;->bT:I

    const/4 v0, 0x5

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/l;->b7:I

    sput v3, Lcom/baidu/location/l;->b0:I

    const/16 v0, 0x10

    sput v0, Lcom/baidu/location/l;->bS:I

    sput v4, Lcom/baidu/location/l;->ce:I

    const/16 v0, 0x100

    #v0=(PosShort);
    sput v0, Lcom/baidu/location/l;->ca:I

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/location/l;->bR:D

    const-wide v0, 0x3fb999999999999aL

    sput-wide v0, Lcom/baidu/location/l;->cd:D

    const-wide/high16 v0, 0x403e

    sput-wide v0, Lcom/baidu/location/l;->bZ:D

    const-wide/high16 v0, 0x4059

    sput-wide v0, Lcom/baidu/location/l;->bQ:D

    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/baidu/location/l;->b1:I

    const/16 v0, 0x40

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/l;->bV:I

    const/16 v0, 0x80

    #v0=(PosShort);
    sput v0, Lcom/baidu/location/l;->cl:I

    sput-object v2, Lcom/baidu/location/l;->b3:Landroid/location/Location;

    sput-object v2, Lcom/baidu/location/l;->cg:Landroid/location/Location;

    sput-object v2, Lcom/baidu/location/l;->bN:Landroid/location/Location;

    sput-object v2, Lcom/baidu/location/l;->b5:Lcom/baidu/location/ai$b;

    sput-object v2, Lcom/baidu/location/l;->co:Lcom/baidu/location/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/l;->cb:Lcom/baidu/location/l$a;

    new-instance v0, Lcom/baidu/location/l$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/l$a;-><init>(Lcom/baidu/location/l;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/l;->cb:Lcom/baidu/location/l$a;

    return-void
.end method

.method public static A()V
    .locals 7

    invoke-static {}, Lcom/baidu/location/l;->w()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    new-instance v0, Ljava/io/BufferedWriter;

    #v0=(UninitRef);
    new-instance v3, Ljava/io/FileWriter;

    #v3=(UninitRef);
    new-instance v4, Ljava/io/File;

    #v4=(UninitRef);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    sget-object v6, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/out.txt"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    const/4 v5, 0x1

    #v5=(One);
    invoke-direct {v3, v4, v5}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    #v3=(Reference);
    invoke-direct {v0, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    #v0=(Reference);
    move-object v1, v2

    :goto_0
    #v1=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V

    invoke-static {}, Lcom/baidu/location/l;->w()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Null);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    #v0=(Null);
    move-object v1, v2

    #v1=(Reference);
    goto :goto_0

    :cond_0
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method public static byte(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

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

    const/16 v0, 0x20

    #v0=(PosByte);
    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/16 v0, 0x800

    #v0=(PosShort);
    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/16 v0, 0x410

    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v0, 0x0

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

.method public static case(Ljava/lang/String;)V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    sget v1, Lcom/baidu/location/b;->aF:I

    #v1=(Integer);
    const/4 v0, 0x1

    #v0=(One);
    if-ne v1, v0, :cond_1

    sget-object v0, Lcom/baidu/location/l;->cn:Ljava/util/ArrayList;

    :goto_0
    #v0=(Reference);
    if-nez v0, :cond_3

    :cond_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(One);v2=(Uninit);v3=(Uninit);
    const/4 v0, 0x2

    #v0=(PosByte);
    if-ne v1, v0, :cond_2

    sget-object v0, Lcom/baidu/location/l;->b8:Ljava/util/ArrayList;

    #v0=(Reference);
    goto :goto_0

    :cond_2
    #v0=(PosByte);
    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    sget-object v0, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v0=(Reference);
    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    #v2=(Integer);
    sget v3, Lcom/baidu/location/l;->bS:I

    #v3=(Integer);
    if-gt v2, v3, :cond_4

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sget v3, Lcom/baidu/location/l;->bS:I

    if-lt v2, v3, :cond_5

    invoke-static {v1, v4}, Lcom/baidu/location/l;->if(IZ)V

    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    sget v2, Lcom/baidu/location/l;->bS:I

    if-le v1, v2, :cond_0

    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1
.end method

.method private static char(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/baidu/location/l;->case(Ljava/lang/String;)V

    return-void
.end method

.method private static else(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/baidu/location/l;->case(Ljava/lang/String;)V

    return-void
.end method

.method private static goto(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/baidu/location/l;->case(Ljava/lang/String;)V

    return-void
.end method

.method private static if(Ljava/util/List;I)I
    .locals 13

    if-eqz p0, :cond_0

    const/16 v0, 0x100

    #v0=(PosShort);
    if-gt p1, v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 v0, -0x1

    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return v0

    :cond_1
    :try_start_0
    #v0=(PosShort);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    sget-object v0, Lcom/baidu/location/l;->bW:Ljava/io/File;

    #v0=(Reference);
    if-nez v0, :cond_2

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/l;->cp:Ljava/lang/String;

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/l;->bW:Ljava/io/File;

    sget-object v0, Lcom/baidu/location/l;->bW:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_2

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/l;->bW:Ljava/io/File;

    const/4 v0, -0x2

    #v0=(Byte);
    goto :goto_0

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);
    new-instance v7, Ljava/io/RandomAccessFile;

    #v7=(UninitRef);
    sget-object v0, Lcom/baidu/location/l;->bW:Ljava/io/File;

    #v0=(Reference);
    const-string v1, "rw"

    #v1=(Reference);
    invoke-direct {v7, v0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v7=(Reference);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    const-wide/16 v2, 0x1

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_3

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V

    const/4 v0, -0x3

    goto :goto_0

    :cond_3
    int-to-long v0, p1

    #v0=(LongLo);
    invoke-virtual {v7, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readLong()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    invoke-static/range {v0 .. v5}, Lcom/baidu/location/l;->if(IIIIJ)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_4

    const/4 v6, 0x1

    #v6=(One);
    if-ge v1, v6, :cond_5

    :cond_4
    #v6=(Boolean);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V

    const/4 v0, -0x4

    #v0=(Byte);
    goto :goto_0

    :cond_5
    #v0=(Integer);v6=(One);
    sget v6, Lcom/baidu/location/l;->ce:I

    #v6=(Integer);
    new-array v8, v6, [B

    #v8=(Reference);
    sget v6, Lcom/baidu/location/l;->bT:I

    move v12, v6

    #v12=(Integer);
    move v6, v1

    move v1, v12

    :goto_1
    #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    if-lez v1, :cond_7

    if-lez v6, :cond_7

    add-int v9, v0, v6

    #v9=(Integer);
    add-int/lit8 v9, v9, -0x1

    rem-int/2addr v9, v2

    mul-int/2addr v9, v3

    int-to-long v9, v9

    #v9=(LongLo);v10=(LongHi);
    add-long/2addr v9, v4

    invoke-virtual {v7, v9, v10}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v9

    #v9=(Integer);
    if-lez v9, :cond_6

    if-ge v9, v3, :cond_6

    const/4 v10, 0x0

    #v10=(Null);
    invoke-virtual {v7, v8, v10, v9}, Ljava/io/RandomAccessFile;->read([BII)I

    add-int/lit8 v10, v9, -0x1

    #v10=(Integer);
    aget-byte v10, v8, v10

    #v10=(Byte);
    if-nez v10, :cond_6

    new-instance v10, Ljava/lang/String;

    #v10=(UninitRef);
    const/4 v11, 0x0

    #v11=(Null);
    add-int/lit8 v9, v9, -0x1

    invoke-direct {v10, v8, v11, v9}, Ljava/lang/String;-><init>([BII)V

    #v10=(Reference);
    invoke-interface {p0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    #v10=(Conflicted);v11=(Conflicted);
    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_7
    #v9=(Conflicted);
    int-to-long v8, p1

    #v8=(LongLo);v9=(LongHi);
    invoke-virtual {v7, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v7, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v7, v6}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v7, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v7, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v7, v4, v5}, Ljava/io/RandomAccessFile;->writeLong(J)V

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V

    sget v0, Lcom/baidu/location/l;->bT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr v0, v1

    goto/16 :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, -0x5

    #v0=(Byte);
    goto/16 :goto_0
.end method

.method public static if(I)Ljava/lang/String;
    .locals 6

    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    if-ne p0, v5, :cond_1

    sget-object v2, Lcom/baidu/location/l;->ck:Ljava/lang/String;

    #v2=(Reference);
    sget-object v1, Lcom/baidu/location/l;->cn:Ljava/util/ArrayList;

    :goto_0
    #v1=(Reference);
    if-nez v1, :cond_4

    :cond_0
    :goto_1
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne p0, v1, :cond_2

    sget-object v2, Lcom/baidu/location/l;->cj:Ljava/lang/String;

    #v2=(Reference);
    sget-object v1, Lcom/baidu/location/l;->b8:Ljava/util/ArrayList;

    #v1=(Reference);
    goto :goto_0

    :cond_2
    #v1=(PosByte);v2=(Uninit);
    const/4 v1, 0x3

    if-ne p0, v1, :cond_3

    sget-object v2, Lcom/baidu/location/l;->b9:Ljava/lang/String;

    #v2=(Reference);
    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v1=(Reference);
    goto :goto_0

    :cond_3
    #v1=(PosByte);v2=(Uninit);
    const/4 v1, 0x4

    if-ne p0, v1, :cond_0

    sget-object v2, Lcom/baidu/location/l;->cf:Ljava/lang/String;

    #v2=(Reference);
    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v1=(Reference);
    goto :goto_0

    :cond_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    #v3=(Integer);
    if-ge v3, v5, :cond_5

    invoke-static {v2, v1}, Lcom/baidu/location/l;->if(Ljava/lang/String;Ljava/util/List;)Z

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1
.end method

.method public static if(DDDD)V
    .locals 2

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    cmpl-double v0, p0, v0

    #v0=(Byte);
    if-lez v0, :cond_0

    :goto_0
    sput-wide p0, Lcom/baidu/location/l;->bR:D

    sput-wide p2, Lcom/baidu/location/l;->cd:D

    const-wide/high16 v0, 0x4034

    #v0=(LongLo);
    cmpl-double v0, p4, v0

    #v0=(Byte);
    if-lez v0, :cond_1

    :goto_1
    sput-wide p4, Lcom/baidu/location/l;->bZ:D

    sput-wide p6, Lcom/baidu/location/l;->bQ:D

    return-void

    :cond_0
    sget-wide p0, Lcom/baidu/location/l;->bR:D

    goto :goto_0

    :cond_1
    sget-wide p4, Lcom/baidu/location/l;->bZ:D

    goto :goto_1
.end method

.method public static if(II)V
    .locals 4

    const-string v1, "I\'m test string!!I\'m test string!!I\'m test string!!I\'m test sting!!I\'m test sting!!I\'m test sting!!I\'m test sting!!I\'m test sting!!I\'m test sting!!"

    #v1=(Reference);
    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
    if-ge v0, p0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "&p="

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&number="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/baidu/location/l;->if(Ljava/lang/String;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method public static if(IIZ)V
    .locals 4

    const-string v1, "I\'m test string!!I\'m test string!!I\'m test string!!I\'m test sting!!I\'m test sting!!I\'m test sting!!I\'m test sting!!I\'m test sting!!I\'m test sting!!"

    #v1=(Reference);
    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
    if-ge v0, p0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "&p="

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&number="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1, p2}, Lcom/baidu/location/l;->if(Ljava/lang/String;IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method public static if(IZ)V
    .locals 13

    const/4 v0, 0x1

    #v0=(One);
    if-ne p0, v0, :cond_3

    sget-object v1, Lcom/baidu/location/l;->ck:Ljava/lang/String;

    #v1=(Reference);
    if-eqz p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return-void

    :cond_1
    #v0=(One);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    sget-object v0, Lcom/baidu/location/l;->cn:Ljava/util/ArrayList;

    #v0=(Reference);
    move-object v12, v0

    #v12=(Reference);
    move-object v0, v1

    move-object v1, v12

    :goto_1
    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_2

    invoke-static {v0}, Lcom/baidu/location/l;->byte(Ljava/lang/String;)V

    :cond_2
    :try_start_0
    new-instance v7, Ljava/io/RandomAccessFile;

    #v7=(UninitRef);
    const-string v0, "rw"

    invoke-direct {v7, v2, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v7=(Reference);
    const-wide/16 v2, 0x4

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v7, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v9

    #v9=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v4

    #v4=(Integer);
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    move v6, v0

    #v6=(Integer);
    move v0, v4

    :goto_2
    #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    sget v4, Lcom/baidu/location/l;->b0:I

    if-le v6, v4, :cond_c

    if-eqz p1, :cond_b

    add-int/lit8 v4, v0, 0x1

    :goto_3
    if-ge v3, v8, :cond_8

    mul-int v0, v9, v3

    add-int/lit16 v0, v0, 0x80

    int-to-long v10, v0

    #v10=(LongLo);v11=(LongHi);
    invoke-virtual {v7, v10, v11}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    #v10=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v10, 0x0

    #v10=(Null);
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v10, v0

    #v10=(Integer);
    invoke-virtual {v7, v10}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v10, 0x0

    #v10=(Null);
    array-length v11, v0

    #v11=(Integer);
    invoke-virtual {v7, v0, v10, v11}, Ljava/io/RandomAccessFile;->write([BII)V

    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v3, 0x1

    #v0=(Integer);
    move v12, v2

    #v12=(Integer);
    move v2, v0

    move v0, v12

    :goto_4
    #v12=(Conflicted);
    add-int/lit8 v3, v6, -0x1

    move v6, v3

    move v3, v2

    move v2, v0

    move v0, v4

    goto :goto_2

    :cond_3
    #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    const/4 v0, 0x2

    #v0=(PosByte);
    if-ne p0, v0, :cond_5

    sget-object v1, Lcom/baidu/location/l;->cj:Ljava/lang/String;

    #v1=(Reference);
    if-eqz p1, :cond_4

    sget-object v0, Lcom/baidu/location/l;->cn:Ljava/util/ArrayList;

    #v0=(Reference);
    move-object v12, v0

    #v12=(Reference);
    move-object v0, v1

    move-object v1, v12

    goto/16 :goto_1

    :cond_4
    #v0=(PosByte);v12=(Uninit);
    sget-object v0, Lcom/baidu/location/l;->b8:Ljava/util/ArrayList;

    #v0=(Reference);
    move-object v12, v0

    #v12=(Reference);
    move-object v0, v1

    move-object v1, v12

    goto/16 :goto_1

    :cond_5
    #v0=(PosByte);v1=(Uninit);v12=(Uninit);
    const/4 v0, 0x3

    if-ne p0, v0, :cond_7

    sget-object v1, Lcom/baidu/location/l;->b9:Ljava/lang/String;

    #v1=(Reference);
    if-eqz p1, :cond_6

    sget-object v0, Lcom/baidu/location/l;->b8:Ljava/util/ArrayList;

    #v0=(Reference);
    move-object v12, v0

    #v12=(Reference);
    move-object v0, v1

    move-object v1, v12

    goto/16 :goto_1

    :cond_6
    #v0=(PosByte);v12=(Uninit);
    sget-object v0, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v0=(Reference);
    move-object v12, v0

    #v12=(Reference);
    move-object v0, v1

    move-object v1, v12

    goto/16 :goto_1

    :cond_7
    #v0=(PosByte);v1=(Uninit);v12=(Uninit);
    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object v1, Lcom/baidu/location/l;->cf:Ljava/lang/String;

    #v1=(Reference);
    if-eqz p1, :cond_0

    sget-object v0, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v0=(Reference);
    move-object v12, v0

    #v12=(Reference);
    move-object v0, v1

    move-object v1, v12

    goto/16 :goto_1

    :cond_8
    #v0=(Integer);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Null);v6=(Integer);v7=(Reference);v8=(Integer);v9=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-eqz p1, :cond_a

    mul-int v0, v2, v9

    add-int/lit16 v0, v0, 0x80

    int-to-long v10, v0

    :try_start_1
    #v10=(LongLo);v11=(LongHi);
    invoke-virtual {v7, v10, v11}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    #v10=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v10, 0x0

    #v10=(Null);
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v10, v0

    #v10=(Integer);
    invoke-virtual {v7, v10}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v10, 0x0

    #v10=(Null);
    array-length v11, v0

    #v11=(Integer);
    invoke-virtual {v7, v0, v10, v11}, Ljava/io/RandomAccessFile;->write([BII)V

    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    if-le v0, v3, :cond_9

    const/4 v0, 0x0

    :cond_9
    move v2, v3

    goto :goto_4

    :cond_a
    #v10=(Conflicted);v11=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    move v1, v0

    #v1=(One);
    move v0, v4

    :goto_5
    #v0=(Integer);v1=(Boolean);
    const-wide/16 v4, 0xc

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v7, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v7, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v7, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v7, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V

    if-eqz v1, :cond_0

    const/4 v0, 0x4

    #v0=(PosByte);
    if-ge p0, v0, :cond_0

    add-int/lit8 v0, p0, 0x1

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    invoke-static {v0, v1}, Lcom/baidu/location/l;->if(IZ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto/16 :goto_0

    :cond_b
    #v0=(Integer);v1=(Reference);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Null);v6=(Integer);v7=(Reference);v8=(Integer);v9=(Integer);
    move v4, v0

    goto/16 :goto_3

    :cond_c
    move v1, v5

    #v1=(Null);
    goto :goto_5
.end method

.method public static if(Lcom/baidu/location/n$a;Lcom/baidu/location/ai$b;Landroid/location/Location;Ljava/lang/String;)V
    .locals 3

    const/4 v2, 0x3

    #v2=(PosByte);
    const/4 v0, 0x0

    #v0=(Null);
    sget-boolean v1, Lcom/baidu/location/t;->e6:Z

    #v1=(Boolean);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Null);v1=(Boolean);
    sget v1, Lcom/baidu/location/b;->ag:I

    #v1=(Integer);
    if-ne v1, v2, :cond_2

    invoke-static {p2, p1}, Lcom/baidu/location/l;->if(Landroid/location/Location;Lcom/baidu/location/ai$b;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {p2, v1}, Lcom/baidu/location/l;->if(Landroid/location/Location;Z)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    :cond_2
    #v1=(Integer);
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/baidu/location/n$a;->do()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    invoke-static {p2, p1}, Lcom/baidu/location/l;->if(Landroid/location/Location;Lcom/baidu/location/ai$b;)Z

    move-result v1

    if-nez v1, :cond_3

    move-object p1, v0

    :cond_3
    const/4 v0, 0x1

    #v0=(One);
    invoke-static {p0, p1, p2, p3, v0}, Lcom/baidu/location/b;->if(Lcom/baidu/location/n$a;Lcom/baidu/location/ai$b;Landroid/location/Location;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/location/l;->else(Ljava/lang/String;)V

    sput-object p2, Lcom/baidu/location/l;->cg:Landroid/location/Location;

    sput-object p2, Lcom/baidu/location/l;->b3:Landroid/location/Location;

    if-eqz p1, :cond_0

    sput-object p1, Lcom/baidu/location/l;->b5:Lcom/baidu/location/ai$b;

    goto :goto_0

    :cond_4
    #v0=(Null);v1=(Integer);
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/baidu/location/ai$b;->if()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_5

    invoke-static {p2, p1}, Lcom/baidu/location/l;->if(Landroid/location/Location;Lcom/baidu/location/ai$b;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {p2}, Lcom/baidu/location/l;->if(Landroid/location/Location;)Z

    move-result v1

    if-nez v1, :cond_9

    :goto_1
    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-static {v0, p1, p2, p3, v1}, Lcom/baidu/location/b;->if(Lcom/baidu/location/n$a;Lcom/baidu/location/ai$b;Landroid/location/Location;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/location/l;->char(Ljava/lang/String;)V

    sput-object p2, Lcom/baidu/location/l;->bN:Landroid/location/Location;

    sput-object p2, Lcom/baidu/location/l;->b3:Landroid/location/Location;

    if-eqz p1, :cond_0

    sput-object p1, Lcom/baidu/location/l;->b5:Lcom/baidu/location/ai$b;

    goto :goto_0

    :cond_5
    #v0=(Null);v1=(Integer);
    invoke-static {p2}, Lcom/baidu/location/l;->if(Landroid/location/Location;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_6

    move-object p0, v0

    :cond_6
    invoke-static {p2, p1}, Lcom/baidu/location/l;->if(Landroid/location/Location;Lcom/baidu/location/ai$b;)Z

    move-result v1

    if-nez v1, :cond_8

    :goto_2
    #v0=(Reference);
    if-nez p0, :cond_7

    if-eqz v0, :cond_0

    :cond_7
    invoke-static {p0, v0, p2, p3, v2}, Lcom/baidu/location/b;->if(Lcom/baidu/location/n$a;Lcom/baidu/location/ai$b;Landroid/location/Location;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/baidu/location/l;->goto(Ljava/lang/String;)V

    sput-object p2, Lcom/baidu/location/l;->b3:Landroid/location/Location;

    if-eqz v0, :cond_0

    sput-object v0, Lcom/baidu/location/l;->b5:Lcom/baidu/location/ai$b;

    goto/16 :goto_0

    :cond_8
    #v0=(Null);v1=(Boolean);
    move-object v0, p1

    #v0=(Reference);
    goto :goto_2

    :cond_9
    #v0=(Null);
    move-object v0, p0

    #v0=(Reference);
    goto :goto_1
.end method

.method public static if(Ljava/lang/String;I)V
    .locals 0

    sput p1, Lcom/baidu/location/b;->aF:I

    invoke-static {p0}, Lcom/baidu/location/l;->case(Ljava/lang/String;)V

    return-void
.end method

.method public static if(Ljava/lang/String;IZ)V
    .locals 1

    sput p1, Lcom/baidu/location/b;->aF:I

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p2, :cond_0

    invoke-static {p0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/l;->case(Ljava/lang/String;)V

    return-void
.end method

.method private static if(IIIIJ)Z
    .locals 3

    const/16 v2, 0x400

    #v2=(PosShort);
    const/4 v0, 0x0

    #v0=(Null);
    if-ltz p0, :cond_0

    if-lt p0, p2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);
    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    if-ltz p2, :cond_0

    if-gt p2, v2, :cond_0

    const/16 v1, 0x80

    #v1=(PosShort);
    if-lt p3, v1, :cond_0

    if-gt p3, v2, :cond_0

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method private static if(Landroid/location/Location;)Z
    .locals 8

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-nez p0, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    sget-object v2, Lcom/baidu/location/l;->cg:Landroid/location/Location;

    #v2=(Reference);
    if-eqz v2, :cond_2

    sget-object v2, Lcom/baidu/location/l;->b3:Landroid/location/Location;

    if-nez v2, :cond_3

    :cond_2
    sput-object p0, Lcom/baidu/location/l;->cg:Landroid/location/Location;

    goto :goto_0

    :cond_3
    sget-object v2, Lcom/baidu/location/l;->cg:Landroid/location/Location;

    invoke-virtual {p0, v2}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v2

    #v2=(Float);
    float-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    sget v4, Lcom/baidu/location/b;->a4:F

    #v4=(Integer);
    float-to-double v4, v4

    #v4=(DoubleLo);v5=(DoubleHi);
    mul-double/2addr v4, v2

    mul-double/2addr v4, v2

    sget v6, Lcom/baidu/location/b;->a1:F

    #v6=(Integer);
    float-to-double v6, v6

    #v6=(DoubleLo);v7=(DoubleHi);
    mul-double/2addr v2, v6

    add-double/2addr v2, v4

    sget v4, Lcom/baidu/location/b;->aZ:I

    #v4=(Integer);
    int-to-double v4, v4

    #v4=(DoubleLo);
    add-double/2addr v2, v4

    sget-object v4, Lcom/baidu/location/l;->b3:Landroid/location/Location;

    #v4=(Reference);
    invoke-virtual {p0, v4}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v4

    #v4=(Float);
    float-to-double v4, v4

    #v4=(DoubleLo);
    cmpl-double v2, v4, v2

    #v2=(Byte);
    if-gtz v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method private static if(Landroid/location/Location;Lcom/baidu/location/ai$b;)Z
    .locals 3

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    iget-object v2, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v2=(Boolean);
    sget-object v2, Lcom/baidu/location/l;->b5:Lcom/baidu/location/ai$b;

    #v2=(Reference);
    invoke-virtual {p1, v2}, Lcom/baidu/location/ai$b;->do(Lcom/baidu/location/ai$b;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    sget-object v0, Lcom/baidu/location/l;->bN:Landroid/location/Location;

    #v0=(Reference);
    if-nez v0, :cond_2

    sput-object p0, Lcom/baidu/location/l;->bN:Landroid/location/Location;

    move v0, v1

    #v0=(One);
    goto :goto_0

    :cond_2
    #v0=(Reference);
    move v0, v1

    #v0=(One);
    goto :goto_0
.end method

.method public static if(Landroid/location/Location;Z)Z
    .locals 1

    sget-object v0, Lcom/baidu/location/l;->b3:Landroid/location/Location;

    #v0=(Reference);
    invoke-static {v0, p0, p1}, Lcom/baidu/location/s;->if(Landroid/location/Location;Landroid/location/Location;Z)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static if(Ljava/lang/String;Ljava/util/List;)Z
    .locals 11

    const/4 v1, 0x0

    #v1=(Null);
    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    move v0, v1

    :goto_0
    #v0=(Boolean);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v0

    :cond_0
    :try_start_0
    #v0=(Reference);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    new-instance v5, Ljava/io/RandomAccessFile;

    #v5=(UninitRef);
    const-string v2, "rw"

    #v2=(Reference);
    invoke-direct {v5, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v5=(Reference);
    const-wide/16 v2, 0x8

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v5, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    sget v0, Lcom/baidu/location/l;->ce:I

    #v0=(Integer);
    new-array v7, v0, [B

    #v7=(Reference);
    sget v0, Lcom/baidu/location/l;->b0:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v0, v0, 0x1

    move v4, v3

    #v4=(Integer);
    move v3, v0

    move v0, v1

    :goto_1
    #v0=(Boolean);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    if-lez v3, :cond_3

    if-lez v4, :cond_3

    if-ge v4, v2, :cond_1

    move v2, v1

    :cond_1
    add-int/lit8 v8, v4, -0x1

    #v8=(Integer);
    mul-int/2addr v8, v6

    add-int/lit16 v8, v8, 0x80

    int-to-long v8, v8

    :try_start_1
    #v8=(LongLo);v9=(LongHi);
    invoke-virtual {v5, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v8

    #v8=(Integer);
    if-lez v8, :cond_2

    if-ge v8, v6, :cond_2

    const/4 v9, 0x0

    #v9=(Null);
    invoke-virtual {v5, v7, v9, v8}, Ljava/io/RandomAccessFile;->read([BII)I

    add-int/lit8 v9, v8, -0x1

    #v9=(Integer);
    aget-byte v9, v7, v9

    #v9=(Byte);
    if-nez v9, :cond_2

    new-instance v9, Ljava/lang/String;

    #v9=(UninitRef);
    const/4 v10, 0x0

    #v10=(Null);
    add-int/lit8 v8, v8, -0x1

    invoke-direct {v9, v7, v10, v8}, Ljava/lang/String;-><init>([BII)V

    #v9=(Reference);
    invoke-interface {p1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    :cond_2
    #v9=(Conflicted);v10=(Conflicted);
    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_3
    #v8=(Conflicted);
    const-wide/16 v6, 0xc

    #v6=(LongLo);v7=(LongHi);
    invoke-virtual {v5, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v5, v4}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v5, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    #v6=(Conflicted);v7=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0

    :catch_1
    #v0=(Conflicted);v1=(Null);v2=(Conflicted);v3=(Conflicted);v4=(Uninit);v5=(Conflicted);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    move-exception v0

    #v0=(Reference);
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public static t()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    sput v1, Lcom/baidu/location/l;->b0:I

    const/4 v0, 0x1

    #v0=(One);
    invoke-static {v0, v1}, Lcom/baidu/location/l;->if(IZ)V

    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-static {v0, v1}, Lcom/baidu/location/l;->if(IZ)V

    const/4 v0, 0x3

    invoke-static {v0, v1}, Lcom/baidu/location/l;->if(IZ)V

    const/16 v0, 0x8

    sput v0, Lcom/baidu/location/l;->b0:I

    return-void
.end method

.method public static u()Lcom/baidu/location/l;
    .locals 1

    sget-object v0, Lcom/baidu/location/l;->co:Lcom/baidu/location/l;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/l;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/l;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/l;->co:Lcom/baidu/location/l;

    :cond_0
    sget-object v0, Lcom/baidu/location/l;->co:Lcom/baidu/location/l;

    return-object v0
.end method

.method public static v()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/location/l;->cj:Ljava/lang/String;

    #v1=(Reference);
    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    const-wide/16 v2, 0x14

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0x80

    #v3=(PosShort);
    if-le v2, v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "&p1="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-wide/16 v2, 0x14

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Integer);v3=(PosShort);v4=(Uninit);
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :cond_2
    :goto_1
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    sget-object v1, Lcom/baidu/location/l;->b9:Ljava/lang/String;

    #v1=(Reference);
    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    :try_start_1
    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    const-wide/16 v2, 0x14

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0x100

    #v3=(PosShort);
    if-le v2, v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "&p2="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v2, 0x14

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    :cond_3
    :goto_2
    sget-object v1, Lcom/baidu/location/l;->cf:Ljava/lang/String;

    #v1=(Reference);
    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    :try_start_2
    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    const-string v3, "rw"

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    const-wide/16 v2, 0x14

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0x200

    #v3=(PosShort);
    if-le v2, v3, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "&p3="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v2, 0x14

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_0

    :catch_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto/16 :goto_0

    :cond_4
    :try_start_3
    #v2=(Integer);v3=(PosShort);
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_2

    :cond_5
    :try_start_4
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_0

    :catch_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto/16 :goto_1
.end method

.method public static w()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/baidu/location/l;->y()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static x()V
    .locals 2

    const/16 v0, 0x16

    #v0=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    invoke-static {v0, v1}, Lcom/baidu/location/l;->if(II)V

    return-void
.end method

.method public static y()Ljava/lang/String;
    .locals 5

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x1

    #v0=(One);
    move v4, v0

    #v4=(One);
    move-object v0, v1

    #v0=(Null);
    move v1, v4

    :goto_0
    #v0=(Reference);v1=(Integer);v2=(Conflicted);
    const/4 v2, 0x5

    #v2=(PosByte);
    if-ge v1, v2, :cond_2

    invoke-static {v1}, Lcom/baidu/location/l;->if(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    #v1=(Conflicted);v2=(Integer);
    return-object v0

    :cond_1
    #v1=(Integer);v2=(PosByte);
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v1=(Reference);
    sget v2, Lcom/baidu/location/l;->bV:I

    #v2=(Integer);
    invoke-static {v1, v2}, Lcom/baidu/location/l;->if(Ljava/util/List;I)I

    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_3

    sget-object v0, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_3
    #v1=(Conflicted);
    if-nez v0, :cond_0

    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v1=(Reference);
    sget v2, Lcom/baidu/location/l;->b1:I

    invoke-static {v1, v2}, Lcom/baidu/location/l;->if(Ljava/util/List;I)I

    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_4

    sget-object v0, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_4
    #v1=(Conflicted);
    if-nez v0, :cond_0

    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v1=(Reference);
    sget v2, Lcom/baidu/location/l;->cl:I

    invoke-static {v1, v2}, Lcom/baidu/location/l;->if(Ljava/util/List;I)I

    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_0

    sget-object v0, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/baidu/location/l;->ch:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1
.end method


# virtual methods
.method public z()V
    .locals 1

    invoke-static {}, Lcom/baidu/location/ai;->bf()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/l;->cb:Lcom/baidu/location/l$a;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/l$a;->W()V

    :cond_0
    #v0=(Conflicted);
    return-void
.end method

*/}
