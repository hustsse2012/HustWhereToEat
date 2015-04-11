package com.baidu.location; class s {/*

.class Lcom/baidu/location/s;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/s$a;,
        Lcom/baidu/location/s$b;,
        Lcom/baidu/location/s$c;
    }
.end annotation


# static fields
.field private static final eA:I = 0x1

.field private static final eE:I = 0xbb8

.field private static final eF:I = 0x3

.field private static final eG:I = 0x5

.field private static eI:Ljava/lang/String; = null

.field private static eL:Ljava/lang/String; = null

.field private static eM:Lcom/baidu/location/s; = null

.field private static final eR:D = 1.0E-5

.field private static eU:I

.field private static ez:Ljava/io/File;


# instance fields
.field private final eB:I

.field private eC:Z

.field private final eD:I

.field private eH:Landroid/location/GpsStatus;

.field private eJ:Lcom/baidu/location/s$a;

.field private eK:J

.field private final eN:I

.field private eO:J

.field private eP:Lcom/baidu/location/s$c;

.field private eQ:Landroid/os/Handler;

.field private eS:Landroid/content/Context;

.field private eT:Z

.field private eV:Lcom/baidu/location/s$b;

.field private eW:Landroid/location/Location;

.field private final eX:J

.field private eY:Landroid/location/LocationManager;

.field private eZ:J

.field private ev:Z

.field private final ew:I

.field private ex:J

.field private ey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v1, 0x0

    #v1=(Null);
    sput-object v1, Lcom/baidu/location/s;->eM:Lcom/baidu/location/s;

    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/baidu/location/s;->eU:I

    sput-object v1, Lcom/baidu/location/s;->eL:Ljava/lang/String;

    const-string v0, "Temp_in.dat"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/s;->eI:Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    sget-object v1, Lcom/baidu/location/f;->L:Ljava/lang/String;

    #v1=(Reference);
    sget-object v2, Lcom/baidu/location/s;->eI:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/s;->ez:Ljava/io/File;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    const/4 v5, 0x0

    #v5=(Null);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const-wide/16 v0, 0x3e8

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/s;->eX:J

    iput-object v2, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    iput-object v2, p0, Lcom/baidu/location/s;->eV:Lcom/baidu/location/s$b;

    iput-object v2, p0, Lcom/baidu/location/s;->eP:Lcom/baidu/location/s$c;

    iput-object v2, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    iput-wide v3, p0, Lcom/baidu/location/s;->eK:J

    iput-wide v3, p0, Lcom/baidu/location/s;->ex:J

    iput-boolean v5, p0, Lcom/baidu/location/s;->ev:Z

    iput-boolean v5, p0, Lcom/baidu/location/s;->eC:Z

    iput-object v2, p0, Lcom/baidu/location/s;->ey:Ljava/lang/String;

    iput-boolean v5, p0, Lcom/baidu/location/s;->eT:Z

    iput-wide v3, p0, Lcom/baidu/location/s;->eO:J

    iput-wide v3, p0, Lcom/baidu/location/s;->eZ:J

    iput-object v2, p0, Lcom/baidu/location/s;->eQ:Landroid/os/Handler;

    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Lcom/baidu/location/s;->eN:I

    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/s;->ew:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/baidu/location/s;->eD:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/baidu/location/s;->eB:I

    return-void
.end method

.method public static aH()Lcom/baidu/location/s;
    .locals 1

    sget-object v0, Lcom/baidu/location/s;->eM:Lcom/baidu/location/s;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/s;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/s;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/s;->eM:Lcom/baidu/location/s;

    :cond_0
    sget-object v0, Lcom/baidu/location/s;->eM:Lcom/baidu/location/s;

    return-object v0
.end method

.method private ax()Z
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public static byte(Landroid/location/Location;)Ljava/lang/String;
    .locals 10

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    invoke-virtual {p0}, Landroid/location/Location;->getSpeed()F

    move-result v0

    #v0=(Float);
    float-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide v2, 0x400ccccccccccccdL

    #v2=(LongLo);v3=(LongHi);
    mul-double/2addr v0, v2

    double-to-float v2, v0

    #v2=(Float);
    invoke-virtual {p0}, Landroid/location/Location;->hasAccuracy()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    :goto_1
    #v0=(Integer);
    float-to-int v3, v0

    #v3=(Integer);
    invoke-virtual {p0}, Landroid/location/Location;->hasAltitude()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v0

    :goto_2
    #v0=(LongLo);v1=(LongHi);
    sget-object v4, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v4=(Reference);
    const-string v5, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d"

    #v5=(Reference);
    const/16 v6, 0x8

    #v6=(PosByte);
    new-array v6, v6, [Ljava/lang/Object;

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    #v8=(DoubleLo);v9=(DoubleHi);
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    #v8=(Reference);
    aput-object v8, v6, v7

    const/4 v7, 0x1

    #v7=(One);
    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v8

    #v8=(DoubleLo);
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    #v8=(Reference);
    aput-object v8, v6, v7

    const/4 v7, 0x2

    #v7=(PosByte);
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v6, v7

    const/4 v2, 0x3

    #v2=(PosByte);
    invoke-virtual {p0}, Landroid/location/Location;->getBearing()F

    move-result v7

    #v7=(Float);
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    #v7=(Reference);
    aput-object v7, v6, v2

    const/4 v2, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v6, v2

    const/4 v2, 0x5

    sget v3, Lcom/baidu/location/s;->eU:I

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v6, v2

    const/4 v2, 0x6

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v6, v2

    const/4 v0, 0x7

    #v0=(PosByte);
    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    const-wide/16 v7, 0x3e8

    #v7=(LongLo);v8=(LongHi);
    div-long/2addr v1, v7

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v6, v0

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0

    :cond_1
    #v0=(Boolean);v1=(DoubleHi);v2=(Float);v3=(LongHi);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    const/high16 v0, -0x4080

    #v0=(Integer);
    goto :goto_1

    :cond_2
    #v0=(Boolean);v3=(Integer);
    const-wide v0, 0x4081580000000000L

    #v0=(LongLo);v1=(LongHi);
    goto :goto_2
.end method

.method static synthetic do(Lcom/baidu/location/s;J)J
    .locals 0

    iput-wide p1, p0, Lcom/baidu/location/s;->eO:J

    return-wide p1
.end method

.method static synthetic do(Lcom/baidu/location/s;)Landroid/location/GpsStatus;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/s;->eH:Landroid/location/GpsStatus;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic do(Lcom/baidu/location/s;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/s;->for(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic do(Lcom/baidu/location/s;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/s;->ev:Z

    return p1
.end method

.method static synthetic for(I)I
    .locals 0

    sput p0, Lcom/baidu/location/s;->eU:I

    return p0
.end method

.method static synthetic for(Lcom/baidu/location/s;J)J
    .locals 0

    iput-wide p1, p0, Lcom/baidu/location/s;->eZ:J

    return-wide p1
.end method

.method static synthetic for(Lcom/baidu/location/s;)Lcom/baidu/location/s$a;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    #v0=(Reference);
    return-object v0
.end method

.method private for(Landroid/location/Location;)V
    .locals 12

    const/4 v11, 0x2

    #v11=(PosByte);
    const/4 v10, 0x1

    #v10=(One);
    iput-object p1, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v0=(Reference);
    if-nez v0, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/s;->ey:Ljava/lang/String;

    :goto_0
    :try_start_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-static {}, Lcom/baidu/location/r;->ar()Lcom/baidu/location/r;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/location/r;->do(Landroid/location/Location;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    #v1=(Conflicted);
    invoke-virtual {p0}, Lcom/baidu/location/s;->ay()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/baidu/location/s;->aw()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/location/g;->try(Ljava/lang/String;)V

    sget v0, Lcom/baidu/location/s;->eU:I

    #v0=(Integer);
    if-le v0, v11, :cond_0

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v0=(Reference);
    invoke-static {v0, v10}, Lcom/baidu/location/l;->if(Landroid/location/Location;Z)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/ai;->a4()Z

    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/ai;->a7()Lcom/baidu/location/ai$b;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v2=(Reference);
    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/g;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/baidu/location/l;->if(Lcom/baidu/location/n$a;Lcom/baidu/location/ai$b;Landroid/location/Location;Ljava/lang/String;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setTime(J)V

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getSpeed()F

    move-result v0

    #v0=(Float);
    float-to-double v3, v0

    #v3=(DoubleLo);v4=(DoubleHi);
    const-wide v5, 0x400ccccccccccccdL

    #v5=(LongLo);v6=(LongHi);
    mul-double/2addr v3, v5

    double-to-float v5, v3

    #v5=(Float);
    sget v0, Lcom/baidu/location/s;->eU:I

    #v0=(Integer);
    if-nez v0, :cond_2

    :try_start_1
    iget-object v3, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "satellites"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    :cond_2
    :goto_2
    #v3=(Conflicted);v4=(Conflicted);
    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v3=(Reference);
    const-string v4, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d"

    #v4=(Reference);
    const/4 v6, 0x6

    #v6=(PosByte);
    new-array v6, v6, [Ljava/lang/Object;

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    iget-object v8, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    #v8=(DoubleLo);v9=(DoubleHi);
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    #v8=(Reference);
    aput-object v8, v6, v7

    iget-object v7, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/location/Location;->getLatitude()D

    move-result-wide v7

    #v7=(DoubleLo);v8=(DoubleHi);
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    #v7=(Reference);
    aput-object v7, v6, v10

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    aput-object v7, v6, v11

    const/4 v7, 0x3

    #v7=(PosByte);
    iget-object v8, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/location/Location;->getBearing()F

    move-result v8

    #v8=(Float);
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    #v8=(Reference);
    aput-object v8, v6, v7

    const/4 v7, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v6, v7

    const/4 v0, 0x5

    #v0=(PosByte);
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, v6, v0

    invoke-static {v3, v4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/s;->ey:Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    #v1=(DoubleLo);v2=(DoubleHi);
    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/baidu/location/s;->if(DDF)V

    goto/16 :goto_0

    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v0

    goto/16 :goto_1

    :catch_1
    #v0=(Integer);v1=(LongLo);v2=(LongHi);v5=(Float);v6=(LongHi);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    move-exception v3

    #v3=(Reference);
    goto :goto_2
.end method

.method private for(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/baidu/location/s;->eT:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/s;->ay()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method static synthetic g(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    sput-object p0, Lcom/baidu/location/s;->eL:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic if(Lcom/baidu/location/s;J)J
    .locals 0

    iput-wide p1, p0, Lcom/baidu/location/s;->ex:J

    return-wide p1
.end method

.method static synthetic if(Lcom/baidu/location/s;Landroid/location/GpsStatus;)Landroid/location/GpsStatus;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/s;->eH:Landroid/location/GpsStatus;

    return-object p1
.end method

.method static synthetic if(Lcom/baidu/location/s;)Landroid/location/LocationManager;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    #v0=(Reference);
    return-object v0
.end method

.method private if(DDF)V
    .locals 8

    const/16 v7, 0x32

    #v7=(PosByte);
    const-wide v5, 0x408f400000000000L

    #v5=(LongLo);v6=(LongHi);
    const/4 v0, 0x0

    #v0=(Null);
    sget-boolean v1, Lcom/baidu/location/t;->e1:Z

    #v1=(Boolean);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(LongLo);
    const-wide v1, 0x4052496801711948L

    #v1=(LongLo);v2=(LongHi);
    cmpg-double v1, p1, v1

    #v1=(Byte);
    if-ltz v1, :cond_2

    const-wide v1, 0x4060e81600f34507L

    #v1=(LongLo);
    cmpl-double v1, p1, v1

    #v1=(Byte);
    if-gtz v1, :cond_2

    const-wide v1, 0x404b212096787ce9L

    #v1=(LongLo);
    cmpl-double v1, p3, v1

    #v1=(Byte);
    if-gtz v1, :cond_2

    const-wide v1, 0x402d35ae81882adcL

    #v1=(LongLo);
    cmpg-double v1, p3, v1

    #v1=(Byte);
    if-ltz v1, :cond_2

    const/high16 v1, 0x4190

    #v1=(Integer);
    cmpl-float v1, p5, v1

    #v1=(Byte);
    if-lez v1, :cond_3

    :cond_2
    :goto_1
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    sget v1, Lcom/baidu/location/b;->ag:I

    #v1=(Integer);
    if-eq v1, v0, :cond_0

    sput v0, Lcom/baidu/location/b;->ag:I

    goto :goto_0

    :cond_3
    #v0=(Null);v1=(Byte);v2=(LongHi);v3=(Uninit);v4=(Uninit);v5=(LongLo);
    sget-wide v1, Lcom/baidu/location/b;->aB:D

    #v1=(DoubleLo);v2=(DoubleHi);
    sub-double v1, p1, v1

    sget-wide v3, Lcom/baidu/location/b;->aa:D

    #v3=(DoubleLo);v4=(DoubleHi);
    sub-double/2addr v3, p3

    mul-double/2addr v1, v5

    double-to-int v1, v1

    #v1=(Integer);
    mul-double v2, v3, v5

    #v2=(DoubleLo);v3=(DoubleHi);
    double-to-int v2, v2

    #v2=(Integer);
    if-lez v1, :cond_4

    if-ge v1, v7, :cond_4

    if-lez v2, :cond_4

    if-ge v2, v7, :cond_4

    mul-int/lit8 v2, v2, 0x32

    add-int/2addr v1, v2

    shr-int/lit8 v2, v1, 0x2

    and-int/lit8 v1, v1, 0x3

    sget-boolean v3, Lcom/baidu/location/b;->am:Z

    #v3=(Boolean);
    if-eqz v3, :cond_2

    sget-object v0, Lcom/baidu/location/b;->aw:[B

    #v0=(Reference);
    aget-byte v0, v0, v2

    #v0=(Byte);
    mul-int/lit8 v1, v1, 0x2

    shr-int/2addr v0, v1

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x3

    goto :goto_1

    :cond_4
    #v0=(Null);v3=(DoubleHi);
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v1=(Reference);
    const-string v2, "&ll=%.5f|%.5f"

    #v2=(Reference);
    const/4 v3, 0x2

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v3, v0

    const/4 v4, 0x1

    #v4=(One);
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&im="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/baidu/location/ap;->bD()Lcom/baidu/location/ap;

    move-result-object v2

    invoke-virtual {v2}, Lcom/baidu/location/ap;->bC()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-wide p1, Lcom/baidu/location/b;->a0:D

    sput-wide p3, Lcom/baidu/location/b;->aj:D

    invoke-static {}, Lcom/baidu/location/t;->aK()Lcom/baidu/location/t;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/baidu/location/t;->h(Ljava/lang/String;)V

    goto :goto_1
.end method

.method static synthetic if(Lcom/baidu/location/s;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/s;->int(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/s;Ljava/lang/String;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/baidu/location/s;->if(Ljava/lang/String;Landroid/location/Location;)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/s;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/s;->for(Z)V

    return-void
.end method

.method private if(Ljava/lang/String;Landroid/location/Location;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/g;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v1

    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/location/ai;->a7()Lcom/baidu/location/ai$b;

    move-result-object v2

    invoke-static {v1, v2, p2, v0}, Lcom/baidu/location/l;->if(Lcom/baidu/location/n$a;Lcom/baidu/location/ai$b;Landroid/location/Location;Ljava/lang/String;)V

    return-void
.end method

.method public static if(Landroid/location/Location;Landroid/location/Location;Z)Z
    .locals 6

    const/high16 v5, 0x40a0

    #v5=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x1

    #v0=(One);
    if-ne p0, p1, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v2

    #v2=(Float);
    if-eqz p2, :cond_2

    sget v3, Lcom/baidu/location/b;->ag:I

    #v3=(Integer);
    const/4 v4, 0x3

    #v4=(PosByte);
    if-ne v3, v4, :cond_2

    cmpg-float v3, v2, v5

    #v3=(Byte);
    if-ltz v3, :cond_0

    :cond_2
    #v3=(Conflicted);v4=(Conflicted);
    invoke-virtual {p1, p0}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v3

    #v3=(Float);
    sget v4, Lcom/baidu/location/b;->a2:F

    #v4=(Integer);
    cmpl-float v4, v2, v4

    #v4=(Byte);
    if-lez v4, :cond_3

    sget v2, Lcom/baidu/location/b;->aS:F

    #v2=(Integer);
    cmpl-float v2, v3, v2

    #v2=(Byte);
    if-gtz v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(One);v2=(Float);
    sget v4, Lcom/baidu/location/b;->a5:F

    #v4=(Integer);
    cmpl-float v2, v2, v4

    #v2=(Byte);
    if-lez v2, :cond_4

    sget v2, Lcom/baidu/location/b;->ak:F

    #v2=(Integer);
    cmpl-float v2, v3, v2

    #v2=(Byte);
    if-gtz v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    cmpl-float v2, v3, v5

    if-gtz v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method static synthetic int(Lcom/baidu/location/s;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/s;->eQ:Landroid/os/Handler;

    #v0=(Reference);
    return-object v0
.end method

.method private int(Landroid/location/Location;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/s;->eQ:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/s;->eQ:Landroid/os/Handler;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public static new(Landroid/location/Location;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lcom/baidu/location/s;->byte(Landroid/location/Location;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/baidu/location/s;->eL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    #v1=(Conflicted);
    return-object v0
.end method

.method static synthetic new(Lcom/baidu/location/s;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/s;->eC:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic try(Lcom/baidu/location/s;)J
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/s;->eZ:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public static try(Landroid/location/Location;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lcom/baidu/location/s;->byte(Landroid/location/Location;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&g_tp=0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    #v1=(Conflicted);
    return-object v0
.end method


# virtual methods
.method public aA()Z
    .locals 4

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    cmpl-double v0, v0, v2

    #v0=(Byte);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    #v0=(DoubleLo);
    cmpl-double v0, v0, v2

    #v0=(Byte);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public aB()V
    .locals 6

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/s;->eS:Landroid/content/Context;

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/s;->eS:Landroid/content/Context;

    const-string v1, "location"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    new-instance v0, Lcom/baidu/location/s$a;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/s$a;-><init>(Lcom/baidu/location/s;Lcom/baidu/location/s$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->addGpsStatusListener(Landroid/location/GpsStatus$Listener;)Z

    new-instance v0, Lcom/baidu/location/s$c;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/s$c;-><init>(Lcom/baidu/location/s;Lcom/baidu/location/s$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/s;->eP:Lcom/baidu/location/s$c;

    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    const-string v1, "passive"

    #v1=(Reference);
    const-wide/16 v2, 0x3e8

    #v2=(LongLo);v3=(LongHi);
    const/4 v4, 0x0

    #v4=(Null);
    iget-object v5, p0, Lcom/baidu/location/s;->eP:Lcom/baidu/location/s$c;

    #v5=(Reference);
    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    new-instance v0, Lcom/baidu/location/s$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/s$1;-><init>(Lcom/baidu/location/s;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/s;->eQ:Landroid/os/Handler;

    return-void

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public aC()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/s;->ey:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public aD()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p0}, Lcom/baidu/location/s;->aG()V

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeGpsStatusListener(Landroid/location/GpsStatus$Listener;)V

    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/baidu/location/s;->eP:Lcom/baidu/location/s$c;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);
    iput-object v2, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    iput-object v2, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    return-void

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public aE()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/location/s;->ay()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    invoke-static {v0}, Lcom/baidu/location/s;->byte(Landroid/location/Location;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public aF()V
    .locals 6

    iget-boolean v0, p0, Lcom/baidu/location/s;->eC:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    :cond_0
    :try_start_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    new-instance v0, Lcom/baidu/location/s$b;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/s$b;-><init>(Lcom/baidu/location/s;Lcom/baidu/location/s$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/s;->eV:Lcom/baidu/location/s$b;

    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    const-string v1, "gps"

    #v1=(Reference);
    const-wide/16 v2, 0x3e8

    #v2=(LongLo);v3=(LongHi);
    const/4 v4, 0x0

    #v4=(Null);
    iget-object v5, p0, Lcom/baidu/location/s;->eV:Lcom/baidu/location/s$b;

    #v5=(Reference);
    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->addNmeaListener(Landroid/location/GpsStatus$NmeaListener;)Z

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/s;->eC:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public aG()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iget-boolean v0, p0, Lcom/baidu/location/s;->eC:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_0
    #v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    #v0=(Reference);
    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/s;->eV:Lcom/baidu/location/s$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/baidu/location/s;->eV:Lcom/baidu/location/s$b;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    :cond_1
    #v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/s;->eY:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/baidu/location/s;->eJ:Lcom/baidu/location/s$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeNmeaListener(Landroid/location/GpsStatus$NmeaListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    #v1=(Conflicted);
    sput v2, Lcom/baidu/location/b;->ah:I

    sput v2, Lcom/baidu/location/b;->ag:I

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/s;->eV:Lcom/baidu/location/s$b;

    iput-boolean v2, p0, Lcom/baidu/location/s;->eC:Z

    invoke-direct {p0, v2}, Lcom/baidu/location/s;->for(Z)V

    goto :goto_0

    :catch_0
    #v0=(Reference);
    move-exception v0

    goto :goto_1
.end method

.method public aw()Ljava/lang/String;
    .locals 12

    const-wide/16 v10, 0x0

    #v10=(LongLo);v11=(LongHi);
    const/4 v9, 0x1

    #v9=(One);
    const/4 v8, 0x0

    #v8=(Null);
    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v1=(Reference);
    if-eqz v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "{\"result\":{\"time\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/b;->if()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\"error\":\"61\"},\"content\":{\"point\":{\"x\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"%f\",\"y\":\"%f\"},\"radius\":\"%d\",\"d\":\"%f\","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"s\":\"%f\",\"n\":\"%d\"}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->hasAccuracy()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    :goto_0
    #v0=(Integer);
    float-to-int v0, v0

    iget-object v2, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/location/Location;->getSpeed()F

    move-result v2

    #v2=(Float);
    float-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    const-wide v4, 0x400ccccccccccccdL

    #v4=(LongLo);v5=(LongHi);
    mul-double/2addr v2, v4

    double-to-float v2, v2

    #v2=(Float);
    iget-object v3, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    iget-object v5, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    #v5=(DoubleLo);v6=(DoubleHi);
    const-string v7, "gps2gcj"

    #v7=(Reference);
    invoke-static {v3, v4, v5, v6, v7}, Lcom/baidu/location/Jni;->if(DDLjava/lang/String;)[D

    move-result-object v3

    #v3=(Reference);
    aget-wide v4, v3, v8

    #v4=(LongLo);v5=(LongHi);
    cmpl-double v4, v4, v10

    #v4=(Byte);
    if-gtz v4, :cond_0

    aget-wide v4, v3, v9

    #v4=(LongLo);
    cmpl-double v4, v4, v10

    #v4=(Byte);
    if-gtz v4, :cond_0

    iget-object v4, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    #v4=(DoubleLo);v5=(DoubleHi);
    aput-wide v4, v3, v8

    iget-object v4, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    #v4=(DoubleLo);
    aput-wide v4, v3, v9

    :cond_0
    #v4=(Conflicted);v5=(LongHi);
    sget-object v4, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v4=(Reference);
    const/4 v5, 0x6

    #v5=(PosByte);
    new-array v5, v5, [Ljava/lang/Object;

    #v5=(Reference);
    aget-wide v6, v3, v8

    #v6=(LongLo);v7=(LongHi);
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v5, v8

    aget-wide v6, v3, v9

    #v6=(LongLo);
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v5, v9

    const/4 v3, 0x2

    #v3=(PosByte);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v5, v3

    const/4 v0, 0x3

    #v0=(PosByte);
    iget-object v3, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/location/Location;->getBearing()F

    move-result v3

    #v3=(Float);
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v5, v0

    const/4 v0, 0x4

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v5, v0

    const/4 v0, 0x5

    sget v2, Lcom/baidu/location/s;->eU:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v5, v0

    invoke-static {v4, v1, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v0

    :cond_2
    #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    const/high16 v0, 0x4120

    #v0=(Integer);
    goto :goto_0
.end method

.method public ay()Z
    .locals 5

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0}, Lcom/baidu/location/s;->aA()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iget-wide v3, p0, Lcom/baidu/location/s;->eO:J

    #v3=(LongLo);v4=(LongHi);
    sub-long/2addr v1, v3

    const-wide/16 v3, 0x2710

    cmp-long v1, v1, v3

    #v1=(Byte);
    if-gtz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-boolean v2, p0, Lcom/baidu/location/s;->ev:Z

    #v2=(Boolean);
    if-eqz v2, :cond_2

    iget-wide v2, p0, Lcom/baidu/location/s;->ex:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :cond_2
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-boolean v0, p0, Lcom/baidu/location/s;->eT:Z

    #v0=(Boolean);
    goto :goto_0
.end method

.method public az()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/s;->eW:Landroid/location/Location;

    #v0=(Reference);
    return-object v0
.end method

.method public do(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/s;->aF()V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/location/s;->aG()V

    goto :goto_0
.end method

*/}
