package com.baidu.location; class ad {/*

.class public Lcom/baidu/location/ad;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/ad$a;
    }
.end annotation


# static fields
.field private static im:Lcom/baidu/location/ad; = null

.field private static in:[Ljava/lang/String; = null

.field private static final io:Ljava/lang/String; = "loc_cache.dat"

.field private static final ip:Ljava/lang/String; = ";"

.field private static final ir:Ljava/lang/String; = ","

.field private static final is:I = 0x5

.field private static final it:D = 121.314


# instance fields
.field private iq:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    return-void
.end method

.method private bN()D
    .locals 4

    const/4 v3, 0x2

    #v3=(PosByte);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iget-object v2, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    array-length v2, v2

    #v2=(Integer);
    if-le v2, v3, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v0=(Reference);
    aget-object v0, v0, v3

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :cond_0
    #v0=(LongLo);v2=(Conflicted);
    return-wide v0
.end method

.method private bO()D
    .locals 4

    const/4 v3, 0x1

    #v3=(One);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iget-object v2, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    array-length v2, v2

    #v2=(Integer);
    if-le v2, v3, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v0=(Reference);
    aget-object v0, v0, v3

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide v2, 0x405e54189374bc6aL

    #v2=(LongLo);v3=(LongHi);
    sub-double/2addr v0, v2

    :cond_0
    #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);
    return-wide v0
.end method

.method private bP()J
    .locals 4

    const/4 v3, 0x3

    #v3=(PosByte);
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iget-object v2, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    array-length v2, v2

    #v2=(Integer);
    if-lt v2, v3, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v0=(Reference);
    aget-object v0, v0, v3

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :cond_0
    #v0=(LongLo);v2=(Conflicted);
    return-wide v0
.end method

.method private bQ()Z
    .locals 7

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x1

    #v0=(One);
    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v2

    const-string v3, "%s|%s|%s|%s"

    #v3=(Reference);
    const/4 v4, 0x4

    #v4=(PosByte);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    iget v5, v2, Lcom/baidu/location/n$a;->do:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v1

    iget v5, v2, Lcom/baidu/location/n$a;->if:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v0

    const/4 v5, 0x2

    #v5=(PosByte);
    iget v6, v2, Lcom/baidu/location/n$a;->for:I

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x3

    iget v2, v2, Lcom/baidu/location/n$a;->try:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/baidu/location/ad;->in:[Ljava/lang/String;

    aget-object v3, v3, v0

    #v3=(Null);
    sget-object v4, Lcom/baidu/location/ad;->in:[Ljava/lang/String;

    aget-object v4, v4, v0

    #v4=(Null);
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    :cond_0
    #v2=(Conflicted);
    move v0, v1

    :cond_1
    #v0=(Boolean);
    return v0
.end method

.method private bS()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v0=(Reference);
    if-nez v0, :cond_0

    sget-object v0, Lcom/baidu/location/ad;->in:[Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/location/ad;->in:[Ljava/lang/String;

    const/4 v1, 0x0

    #v1=(Null);
    aget-object v0, v0, v1

    #v0=(Null);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, ","

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method private bT()D
    .locals 4

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iget-object v2, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    array-length v2, v2

    #v2=(Integer);
    if-lez v2, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ad;->iq:[Ljava/lang/String;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    aget-object v0, v0, v1

    #v0=(Null);
    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide v2, 0x405e54189374bc6aL

    #v2=(LongLo);v3=(LongHi);
    sub-double/2addr v0, v2

    :cond_0
    #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);
    return-wide v0
.end method

.method public static bU()Lcom/baidu/location/ad;
    .locals 1

    sget-object v0, Lcom/baidu/location/ad;->im:Lcom/baidu/location/ad;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/ad;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/ad;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/ad;->im:Lcom/baidu/location/ad;

    :cond_0
    sget-object v0, Lcom/baidu/location/ad;->im:Lcom/baidu/location/ad;

    return-object v0
.end method


# virtual methods
.method public bR()Lcom/baidu/location/ad$a;
    .locals 6

    const/4 v0, 0x0

    #v0=(Null);
    const-string v1, "mounted"

    #v1=(Reference);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    sget-object v3, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "loc_cache.dat"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    #v2=(Reference);
    const/16 v1, 0x80

    #v1=(PosShort);
    new-array v1, v1, [B

    #v1=(Reference);
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :goto_0
    #v3=(Reference);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v2, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v4

    #v4=(Integer);
    const/4 v5, -0x1

    #v5=(Byte);
    if-eq v4, v5, :cond_1

    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v3, v1, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v1

    :cond_0
    :goto_1
    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    #v1=(Reference);
    const-string v0, ";"

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/ad;->in:[Ljava/lang/String;

    invoke-direct {p0}, Lcom/baidu/location/ad;->bS()V

    new-instance v0, Lcom/baidu/location/ad$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/ad$a;-><init>(Lcom/baidu/location/ad;)V

    #v0=(Reference);
    invoke-direct {p0}, Lcom/baidu/location/ad;->bT()D

    move-result-wide v1

    #v1=(DoubleLo);v2=(DoubleHi);
    iput-wide v1, v0, Lcom/baidu/location/ad$a;->int:D

    invoke-direct {p0}, Lcom/baidu/location/ad;->bO()D

    move-result-wide v1

    iput-wide v1, v0, Lcom/baidu/location/ad$a;->try:D

    invoke-direct {p0}, Lcom/baidu/location/ad;->bN()D

    move-result-wide v1

    iput-wide v1, v0, Lcom/baidu/location/ad$a;->if:D

    invoke-direct {p0}, Lcom/baidu/location/ad;->bQ()Z

    move-result v1

    #v1=(Boolean);
    iput-boolean v1, v0, Lcom/baidu/location/ad$a;->for:Z

    invoke-virtual {p0}, Lcom/baidu/location/ad;->bV()I

    move-result v1

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/location/ad$a;->do:I

    invoke-direct {p0}, Lcom/baidu/location/ad;->bP()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, v0, Lcom/baidu/location/ad$a;->new:J

    return-object v0

    :cond_1
    :try_start_1
    #v0=(Null);v1=(Reference);v2=(Reference);v3=(Reference);v4=(Integer);v5=(Byte);
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public bV()I
    .locals 8

    const/4 v3, 0x2

    #v3=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/location/ad;->in:[Ljava/lang/String;

    #v1=(Reference);
    aget-object v1, v1, v3

    #v1=(Null);
    if-eqz v1, :cond_4

    sget-object v0, Lcom/baidu/location/ad;->in:[Ljava/lang/String;

    #v0=(Reference);
    aget-object v0, v0, v3

    #v0=(Null);
    const-string v1, ","

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    move-object v1, v0

    :goto_0
    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/ai;->a7()Lcom/baidu/location/ai$b;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v5, v0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v5=(Reference);
    if-eqz v5, :cond_2

    move v4, v2

    #v4=(Null);
    move v3, v2

    :goto_1
    #v0=(Conflicted);v3=(Integer);v4=(Integer);v6=(Conflicted);v7=(Conflicted);
    const/4 v0, 0x5

    #v0=(PosByte);
    if-ge v4, v0, :cond_1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/wifi/ScanResult;

    if-eqz v0, :cond_3

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v6, ":"

    #v6=(Reference);
    const-string v7, ""

    #v7=(Reference);
    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    move v0, v2

    :goto_2
    #v0=(Integer);v7=(Conflicted);
    array-length v7, v1

    #v7=(Integer);
    if-ge v0, v7, :cond_3

    aget-object v7, v1, v0

    #v7=(Null);
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_0

    add-int/lit8 v0, v3, 0x1

    :goto_3
    #v6=(Conflicted);v7=(Conflicted);
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move v3, v0

    goto :goto_1

    :cond_0
    #v6=(Reference);v7=(Boolean);
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    #v0=(PosByte);v6=(Conflicted);v7=(Conflicted);
    move v2, v3

    :cond_2
    #v0=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
    return v2

    :cond_3
    #v2=(Null);v4=(Integer);v5=(Reference);
    move v0, v3

    #v0=(Integer);
    goto :goto_3

    :cond_4
    #v0=(Null);v1=(Null);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    move-object v1, v0

    goto :goto_0
.end method

.method public try(Lcom/baidu/location/BDLocation;)V
    .locals 10

    const/4 v9, 0x3

    #v9=(PosByte);
    const/4 v8, 0x2

    #v8=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const-wide v5, 0x405e54189374bc6aL

    #v5=(LongLo);v6=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0xa1

    #v1=(PosShort);
    if-eq v0, v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    :cond_1
    #v0=(Integer);v1=(PosShort);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(LongLo);v6=(LongHi);v7=(One);
    const-string v0, "%s,%s,%s,%d"

    #v0=(Reference);
    const/4 v1, 0x4

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    add-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v3

    #v3=(DoubleLo);
    add-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v7

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getRadius()F

    move-result v3

    #v3=(Float);
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v9

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/n$a;->for()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_6

    const-string v0, "%s|%s|%s|%s"

    #v0=(Reference);
    const/4 v4, 0x4

    #v4=(PosByte);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    iget v5, v1, Lcom/baidu/location/n$a;->do:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v2

    iget v5, v1, Lcom/baidu/location/n$a;->if:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v7

    iget v5, v1, Lcom/baidu/location/n$a;->for:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v8

    iget v1, v1, Lcom/baidu/location/n$a;->try:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v4, v9

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_1
    #v4=(Conflicted);v5=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Lcom/baidu/location/ai;->a7()Lcom/baidu/location/ai$b;

    move-result-object v4

    if-eqz v4, :cond_4

    iget-object v4, v4, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    if-eqz v4, :cond_4

    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    #v0=(Integer);v2=(Integer);v5=(Reference);v6=(Conflicted);v7=(Conflicted);
    const/4 v0, 0x5

    #v0=(PosByte);
    if-ge v2, v0, :cond_3

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/wifi/ScanResult;

    if-eqz v0, :cond_2

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v6, ":"

    #v6=(Reference);
    const-string v7, ""

    #v7=(Reference);
    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    #v6=(Conflicted);v7=(Conflicted);
    add-int/lit8 v0, v2, 0x1

    #v0=(Integer);
    move v2, v0

    goto :goto_2

    :cond_3
    #v0=(PosByte);
    const-string v0, ","

    #v0=(Reference);
    invoke-static {v0, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    :cond_4
    #v5=(Conflicted);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ";"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    sget-object v3, Lcom/baidu/location/f;->L:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "loc_cache.dat"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_5

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_5
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    #v2=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    #v2=(Conflicted);
    move-exception v0

    goto/16 :goto_0

    :cond_6
    #v0=(Null);v2=(Null);v3=(Reference);v4=(Boolean);v5=(LongLo);v6=(LongHi);v7=(One);
    move-object v1, v0

    #v1=(Null);
    goto/16 :goto_1
.end method

*/}
