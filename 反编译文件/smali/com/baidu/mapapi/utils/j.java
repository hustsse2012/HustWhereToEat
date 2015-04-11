package com.baidu.mapapi.utils; class j {/*

.class public Lcom/baidu/mapapi/utils/j;
.super Ljava/lang/Object;


# static fields
.field public static a:[Ljava/lang/String;

.field public static b:[Ljava/lang/String;

.field public static c:[Ljava/lang/String;

.field public static d:I

.field private static e:Ljava/lang/String;

.field private static f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ""

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->e:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->g:Ljava/util/ArrayList;

    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/baidu/mapapi/utils/j;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    new-instance v0, Landroid/os/StatFs;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v1

    #v1=(Integer);
    int-to-long v1, v1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    #v0=(Integer);
    int-to-long v3, v0

    #v3=(LongLo);v4=(LongHi);
    mul-long v0, v3, v1

    #v0=(LongLo);v1=(LongHi);
    new-instance v2, Ljava/text/DecimalFormat;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/text/DecimalFormat;-><init>()V

    #v2=(Reference);
    const-string v3, "\u672a\u77e5\u5927\u5c0f"

    #v3=(Reference);
    const-wide/16 v3, 0x400

    #v3=(LongLo);
    cmp-long v3, v0, v3

    #v3=(Byte);
    if-gez v3, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "B"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    #v3=(Conflicted);
    return-object v0

    :cond_0
    #v0=(LongLo);v1=(LongHi);v3=(Byte);
    const-wide/32 v3, 0x100000

    #v3=(LongLo);
    cmp-long v3, v0, v3

    #v3=(Byte);
    if-gez v3, :cond_1

    const-string v3, "0"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/text/DecimalFormat;->applyPattern(Ljava/lang/String;)V

    long-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide/high16 v3, 0x4090

    #v3=(LongLo);
    div-double/2addr v0, v3

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "K"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    #v0=(LongLo);v1=(LongHi);v3=(Byte);
    const-wide/32 v3, 0x40000000

    #v3=(LongLo);
    cmp-long v3, v0, v3

    #v3=(Byte);
    if-gez v3, :cond_2

    const-string v3, "0.0"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/text/DecimalFormat;->applyPattern(Ljava/lang/String;)V

    long-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide/high16 v3, 0x4130

    #v3=(LongLo);
    div-double/2addr v0, v3

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "M"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    #v0=(LongLo);v1=(LongHi);v3=(Byte);
    const-string v3, "0.0"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/text/DecimalFormat;->applyPattern(Ljava/lang/String;)V

    long-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide/high16 v3, 0x41d0

    #v3=(LongLo);
    div-double/2addr v0, v3

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "G"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static a()V
    .locals 4

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    sget-object v1, Lcom/baidu/mapapi/utils/j;->e:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :try_start_0
    new-instance v0, Ljava/util/Scanner;

    #v0=(UninitRef);
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    const-string v2, "/proc/mounts"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/util/Scanner;-><init>(Ljava/io/File;)V

    :cond_0
    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {v0}, Ljava/util/Scanner;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "/dev/block/vold/"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    const/16 v2, 0x9

    #v2=(PosByte);
    const/16 v3, 0x20

    #v3=(PosByte);
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    #v2=(One);
    aget-object v1, v1, v2

    #v1=(Null);
    sget-object v2, Lcom/baidu/mapapi/utils/j;->e:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    sget-object v2, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapapi/utils/j;->e:Ljava/lang/String;

    const/4 v0, 0x0

    #v0=(Null);
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    #v1=(Integer);
    const/16 v2, 0xe

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    invoke-static {p0}, Lcom/baidu/mapapi/utils/j;->c(Landroid/content/Context;)Z

    move-result v0

    :cond_0
    #v0=(Boolean);
    if-nez v0, :cond_1

    invoke-static {}, Lcom/baidu/mapapi/utils/j;->a()V

    invoke-static {}, Lcom/baidu/mapapi/utils/j;->b()V

    invoke-static {}, Lcom/baidu/mapapi/utils/j;->c()V

    invoke-static {}, Lcom/baidu/mapapi/utils/j;->d()V

    invoke-static {p0}, Lcom/baidu/mapapi/utils/j;->b(Landroid/content/Context;)V

    :cond_1
    return-void
.end method

.method private static b()V
    .locals 4

    sget-object v0, Lcom/baidu/mapapi/utils/j;->g:Ljava/util/ArrayList;

    #v0=(Reference);
    sget-object v1, Lcom/baidu/mapapi/utils/j;->e:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    const-string v1, "/system/etc/vold.fstab"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    :try_start_0
    #v0=(Reference);v1=(Boolean);v2=(Uninit);v3=(Uninit);
    new-instance v1, Ljava/util/Scanner;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/util/Scanner;-><init>(Ljava/io/File;)V

    :cond_2
    :goto_1
    #v1=(Reference);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {v1}, Ljava/util/Scanner;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v2, "dev_mount"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    const/16 v2, 0x9

    #v2=(PosByte);
    const/16 v3, 0x20

    #v3=(PosByte);
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const-string v2, " "

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    #v2=(PosByte);
    aget-object v0, v0, v2

    #v0=(Null);
    const-string v2, ":"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_3

    const/4 v2, 0x0

    #v2=(Null);
    const-string v3, ":"

    #v3=(Reference);
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_3
    #v0=(Reference);v2=(Boolean);
    sget-object v2, Lcom/baidu/mapapi/utils/j;->e:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_2

    sget-object v2, Lcom/baidu/mapapi/utils/j;->g:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private static b(Landroid/content/Context;)V
    .locals 6

    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    #v2=(Null);
    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    #v3=(Reference);
    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    #v4=(Reference);
    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x9

    #v5=(PosByte);
    if-ge v0, v5, :cond_0

    const-string v0, "Auto"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-le v0, v1, :cond_2

    :goto_1
    #v1=(Integer);
    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_2

    const-string v0, "\u5916\u7f6e\u5b58\u50a8\u5361"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :cond_0
    #v1=(One);
    invoke-static {}, Landroid/os/Environment;->isExternalStorageRemovable()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    const-string v0, "\u5185\u7f6e\u5b58\u50a8\u5361"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    #v0=(Boolean);
    const-string v0, "\u5916\u7f6e\u5b58\u50a8\u5361"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    #v0=(Integer);v1=(Integer);v5=(Conflicted);
    move v1, v2

    :goto_2
    #v2=(Reference);
    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_4

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/d;->a(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    sget-object v2, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    add-int/lit8 v0, v1, -0x1

    #v0=(Integer);
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v1, v0

    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->a:[Ljava/lang/String;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->a:[Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->b:[Ljava/lang/String;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    sget-object v1, Lcom/baidu/mapapi/utils/j;->b:[Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->c:[Ljava/lang/String;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->c:[Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->a:[Ljava/lang/String;

    array-length v0, v0

    #v0=(Integer);
    sget-object v1, Lcom/baidu/mapapi/utils/j;->b:[Ljava/lang/String;

    array-length v1, v1

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sput v0, Lcom/baidu/mapapi/utils/j;->d:I

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private static c()V
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v2=(Conflicted);
    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_1

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v2, Lcom/baidu/mapapi/utils/j;->g:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    sget-object v2, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    add-int/lit8 v0, v1, -0x1

    #v0=(Integer);
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v1, v0

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    #v2=(Conflicted);
    sget-object v0, Lcom/baidu/mapapi/utils/j;->g:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 14

    const-string v0, "storage"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/storage/StorageManager;

    if-eqz v0, :cond_2

    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    #v6=(Reference);
    new-instance v7, Ljava/util/ArrayList;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    #v7=(Reference);
    new-instance v8, Ljava/util/ArrayList;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    #v8=(Reference);
    const-string v1, "android.os.storage.StorageVolume"

    #v1=(Reference);
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "getVolumeList"

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    new-array v4, v4, [Ljava/lang/Class;

    #v4=(Reference);
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "getVolumeState"

    const/4 v9, 0x1

    #v9=(One);
    new-array v9, v9, [Ljava/lang/Class;

    #v9=(Reference);
    const/4 v10, 0x0

    #v10=(Null);
    const-class v11, Ljava/lang/String;

    #v11=(Reference);
    aput-object v11, v9, v10

    invoke-virtual {v3, v4, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    const-string v3, "isRemovable"

    const/4 v4, 0x0

    #v4=(Null);
    new-array v4, v4, [Ljava/lang/Class;

    #v4=(Reference);
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    #v10=(Reference);
    const-string v3, "getPath"

    const/4 v4, 0x0

    #v4=(Null);
    new-array v4, v4, [Ljava/lang/Class;

    #v4=(Reference);
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    const/4 v1, 0x0

    #v1=(Null);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    #v2=(Null);
    move v4, v2

    :goto_0
    #v2=(Integer);v3=(Conflicted);v4=(Integer);v12=(Conflicted);v13=(Conflicted);
    array-length v2, v1

    if-ge v4, v2, :cond_3

    aget-object v2, v1, v4

    #v2=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    invoke-virtual {v11, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/String;

    aget-object v3, v1, v4

    #v3=(Null);
    const/4 v12, 0x0

    #v12=(Null);
    new-array v12, v12, [Ljava/lang/Object;

    #v12=(Reference);
    invoke-virtual {v10, v3, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    #v12=(Boolean);
    if-eqz v2, :cond_0

    sget-object v3, Lcom/baidu/mapapi/utils/j;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    const/4 v3, 0x1

    #v3=(One);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v13, 0x0

    #v13=(Null);
    aput-object v2, v3, v13

    invoke-virtual {v9, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    const-string v13, "mounted"

    #v13=(Reference);
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    if-eqz v12, :cond_1

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    :goto_1
    #v3=(Conflicted);v13=(Conflicted);
    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    move v4, v2

    goto :goto_0

    :cond_1
    #v2=(Reference);v3=(Boolean);v13=(Reference);
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    goto :goto_1

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    :cond_2
    :goto_2
    #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const/4 v0, 0x0

    :goto_3
    #v0=(Boolean);
    return v0

    :cond_3
    #v0=(Reference);v1=(Reference);v2=(Integer);v4=(Integer);v5=(Reference);v6=(Reference);v7=(Reference);v8=(Reference);v9=(Reference);v10=(Reference);v11=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_4
    :try_start_1
    #v0=(Integer);v1=(Integer);v2=(Conflicted);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "\u5185\u7f6e\u5b58\u50a8\u5361"

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_4

    :cond_4
    #v2=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_5
    #v0=(Integer);
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "\u5916\u7f6e\u5b58\u50a8\u5361"

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_5

    :cond_5
    #v2=(Conflicted);
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->a:[Ljava/lang/String;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->a:[Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->b:[Ljava/lang/String;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    sget-object v1, Lcom/baidu/mapapi/utils/j;->b:[Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    sput-object v0, Lcom/baidu/mapapi/utils/j;->c:[Ljava/lang/String;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->c:[Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    sget-object v0, Lcom/baidu/mapapi/utils/j;->a:[Ljava/lang/String;

    array-length v0, v0

    #v0=(Integer);
    sget-object v1, Lcom/baidu/mapapi/utils/j;->b:[Ljava/lang/String;

    array-length v1, v1

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sput v0, Lcom/baidu/mapapi/utils/j;->d:I

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    const/4 v0, 0x1

    #v0=(One);
    goto/16 :goto_3

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto/16 :goto_2

    :catch_2
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto/16 :goto_2

    :catch_3
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto/16 :goto_2

    :catch_4
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto/16 :goto_2
.end method

.method private static d()V
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    move v1, v0

    :goto_0
    #v0=(Integer);v1=(Integer);v2=(Conflicted);
    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_2

    sget-object v0, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v2, Lcom/baidu/mapapi/utils/j;->f:Ljava/util/ArrayList;

    add-int/lit8 v0, v1, -0x1

    #v0=(Integer);
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v1, v0

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    #v2=(Conflicted);
    return-void
.end method

*/}
