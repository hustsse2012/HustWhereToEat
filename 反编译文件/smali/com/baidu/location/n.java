package com.baidu.location; class n {/*

.class Lcom/baidu/location/n;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/n$b;,
        Lcom/baidu/location/n$a;
    }
.end annotation


# static fields
.field private static cA:Ljava/lang/String;

.field private static cB:Ljava/lang/reflect/Method;

.field private static cC:Z

.field private static cE:Ljava/lang/reflect/Method;

.field private static cF:J

.field private static cH:I

.field private static cI:Ljava/lang/Class;

.field private static cv:Ljava/lang/reflect/Method;

.field private static cy:Lcom/baidu/location/n;


# instance fields
.field private cD:I

.field private cG:Z

.field private ct:Lcom/baidu/location/n$a;

.field private cu:I

.field private cw:Lcom/baidu/location/n$b;

.field private cx:Ljava/util/List;

.field private cz:Landroid/telephony/TelephonyManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/n;->cy:Lcom/baidu/location/n;

    sput-object v0, Lcom/baidu/location/n;->cA:Ljava/lang/String;

    sput-object v0, Lcom/baidu/location/n;->cE:Ljava/lang/reflect/Method;

    sput-object v0, Lcom/baidu/location/n;->cB:Ljava/lang/reflect/Method;

    sput-object v0, Lcom/baidu/location/n;->cv:Ljava/lang/reflect/Method;

    sput-object v0, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    const-wide/16 v0, 0xbb8

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/location/n;->cF:J

    const/4 v0, 0x3

    #v0=(PosByte);
    sput v0, Lcom/baidu/location/n;->cH:I

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/baidu/location/n;->cC:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v2, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    new-instance v0, Lcom/baidu/location/n$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/n$a;-><init>(Lcom/baidu/location/n;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    iput-object v2, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    iput-object v2, p0, Lcom/baidu/location/n;->cw:Lcom/baidu/location/n$b;

    iput-boolean v1, p0, Lcom/baidu/location/n;->cG:Z

    iput v1, p0, Lcom/baidu/location/n;->cD:I

    iput v1, p0, Lcom/baidu/location/n;->cu:I

    return-void
.end method

.method private I()Z
    .locals 6

    const/16 v5, 0xa

    #v5=(PosByte);
    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/location/n;->cA:Ljava/lang/String;

    #v1=(Reference);
    if-eqz v1, :cond_0

    sget-object v1, Lcom/baidu/location/n;->cA:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-ge v1, v5, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    :try_start_0
    #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    sget-object v1, Lcom/baidu/location/n;->cA:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    #v2=(Reference);
    move v1, v0

    :goto_1
    #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
    if-ge v1, v5, :cond_2

    aget-char v3, v2, v1

    #v3=(Char);
    const/16 v4, 0x39

    #v4=(PosByte);
    if-gt v3, v4, :cond_0

    aget-char v3, v2, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v4, 0x30

    if-lt v3, v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    #v3=(Conflicted);v4=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :catch_0
    #v0=(Null);v1=(Conflicted);v2=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0
.end method

.method public static K()Lcom/baidu/location/n;
    .locals 1

    sget-object v0, Lcom/baidu/location/n;->cy:Lcom/baidu/location/n;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/n;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/n;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/n;->cy:Lcom/baidu/location/n;

    :cond_0
    sget-object v0, Lcom/baidu/location/n;->cy:Lcom/baidu/location/n;

    return-object v0
.end method

.method static synthetic N()J
    .locals 2

    sget-wide v0, Lcom/baidu/location/n;->cF:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method static synthetic do(Lcom/baidu/location/n;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic for(Lcom/baidu/location/n;)Lcom/baidu/location/n$a;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic if(Lcom/baidu/location/n;)I
    .locals 1

    iget v0, p0, Lcom/baidu/location/n;->cu:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic if(Lcom/baidu/location/n;I)I
    .locals 0

    iput p1, p0, Lcom/baidu/location/n;->cD:I

    return p1
.end method

.method private if(Landroid/telephony/CellLocation;)V
    .locals 8

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v7, 0x3

    #v7=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    sget-boolean v0, Lcom/baidu/location/n;->cC:Z

    #v0=(Boolean);
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/n;->cA:Ljava/lang/String;

    invoke-direct {p0}, Lcom/baidu/location/n;->I()Z

    move-result v0

    #v0=(Boolean);
    sput-boolean v0, Lcom/baidu/location/n;->cC:Z

    :cond_2
    new-instance v3, Lcom/baidu/location/n$a;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Lcom/baidu/location/n$a;-><init>(Lcom/baidu/location/n;)V

    #v3=(Reference);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    iput-wide v4, v3, Lcom/baidu/location/n$a;->byte:J

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_7

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v0, v7, :cond_4

    const/4 v0, 0x0

    #v0=(Null);
    const/4 v5, 0x3

    #v5=(PosByte);
    invoke-virtual {v4, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    if-gez v0, :cond_3

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/location/n$a;->do:I

    :cond_3
    #v0=(Integer);
    iput v0, v3, Lcom/baidu/location/n$a;->do:I

    :cond_4
    #v5=(Conflicted);
    const/4 v0, 0x3

    #v0=(PosByte);
    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_13

    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    #v5=(Reference);
    move v0, v2

    :goto_1
    #v0=(Integer);v6=(Conflicted);
    array-length v6, v5

    #v6=(Integer);
    if-ge v0, v6, :cond_5

    aget-char v6, v5, v0

    #v6=(Char);
    invoke-static {v6}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_d

    :cond_5
    :goto_2
    #v5=(Conflicted);v6=(Conflicted);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v4, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    if-gez v0, :cond_6

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/location/n$a;->if:I

    :cond_6
    #v0=(Integer);
    iput v0, v3, Lcom/baidu/location/n$a;->if:I

    :cond_7
    #v0=(Conflicted);v5=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/n;->cD:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    #v4=(Conflicted);
    instance-of v0, p1, Landroid/telephony/gsm/GsmCellLocation;

    #v0=(Boolean);
    if-eqz v0, :cond_e

    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/telephony/gsm/GsmCellLocation;

    invoke-virtual {v0}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result v0

    #v0=(Integer);
    iput v0, v3, Lcom/baidu/location/n$a;->for:I

    check-cast p1, Landroid/telephony/gsm/GsmCellLocation;

    invoke-virtual {p1}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result v0

    iput v0, v3, Lcom/baidu/location/n$a;->try:I

    const/16 v0, 0x67

    #v0=(PosByte);
    iput-char v0, v3, Lcom/baidu/location/n$a;->new:C

    :cond_8
    :goto_4
    #v0=(Conflicted);
    invoke-virtual {v3}, Lcom/baidu/location/n$a;->for()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v0=(Reference);
    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    invoke-virtual {v0, v3}, Lcom/baidu/location/n$a;->a(Lcom/baidu/location/n$a;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    :cond_9
    #v0=(Conflicted);
    iput-object v3, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    invoke-virtual {v3}, Lcom/baidu/location/n$a;->for()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    #v0=(Reference);
    if-nez v0, :cond_a

    new-instance v0, Ljava/util/LinkedList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    :cond_a
    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_11

    move-object v0, v1

    :goto_5
    #v0=(Reference);v1=(Reference);
    if-eqz v0, :cond_b

    iget v1, v0, Lcom/baidu/location/n$a;->try:I

    #v1=(Integer);
    iget-object v3, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    iget v3, v3, Lcom/baidu/location/n$a;->try:I

    #v3=(Integer);
    if-ne v1, v3, :cond_b

    iget v1, v0, Lcom/baidu/location/n$a;->for:I

    iget-object v3, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v3=(Reference);
    iget v3, v3, Lcom/baidu/location/n$a;->for:I

    #v3=(Integer);
    if-eq v1, v3, :cond_0

    :cond_b
    #v1=(Conflicted);v3=(Conflicted);
    if-eqz v0, :cond_c

    iget-object v1, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v1=(Reference);
    iget-wide v3, v1, Lcom/baidu/location/n$a;->byte:J

    #v3=(LongLo);v4=(LongHi);
    iget-wide v5, v0, Lcom/baidu/location/n$a;->byte:J

    #v5=(LongLo);v6=(LongHi);
    sub-long/2addr v3, v5

    iput-wide v3, v0, Lcom/baidu/location/n$a;->byte:J

    :cond_c
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    iget-object v1, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v1=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    sget v1, Lcom/baidu/location/n;->cH:I

    #v1=(Integer);
    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_d
    #v0=(Integer);v1=(Null);v3=(Reference);v4=(Reference);v5=(Reference);v6=(Boolean);
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    :catch_0
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Lcom/baidu/location/n;->cu:I

    goto/16 :goto_3

    :cond_e
    #v0=(Boolean);
    instance-of v0, p1, Landroid/telephony/cdma/CdmaCellLocation;

    if-eqz v0, :cond_8

    const/16 v0, 0x63

    #v0=(PosByte);
    iput-char v0, v3, Lcom/baidu/location/n$a;->new:C

    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    #v0=(Reference);
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    const/4 v4, 0x5

    #v4=(PosByte);
    if-lt v0, v4, :cond_0

    sget-object v0, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    #v0=(Reference);
    if-nez v0, :cond_f

    :try_start_1
    const-string v0, "android.telephony.cdma.CdmaCellLocation"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    sget-object v0, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    const-string v4, "getBaseStationId"

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    new-array v5, v5, [Ljava/lang/Class;

    #v5=(Reference);
    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/n;->cE:Ljava/lang/reflect/Method;

    sget-object v0, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    const-string v4, "getNetworkId"

    const/4 v5, 0x0

    #v5=(Null);
    new-array v5, v5, [Ljava/lang/Class;

    #v5=(Reference);
    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/n;->cB:Ljava/lang/reflect/Method;

    sget-object v0, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    const-string v4, "getSystemId"

    const/4 v5, 0x0

    #v5=(Null);
    new-array v5, v5, [Ljava/lang/Class;

    #v5=(Reference);
    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lcom/baidu/location/n;->cv:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :cond_f
    #v4=(Conflicted);v5=(Conflicted);
    sget-object v0, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    if-eqz v0, :cond_8

    sget-object v0, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_8

    :try_start_2
    sget-object v0, Lcom/baidu/location/n;->cv:Ljava/lang/reflect/Method;

    #v0=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    invoke-virtual {v0, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    if-gez v0, :cond_10

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/location/n$a;->if:I

    :cond_10
    #v0=(Integer);
    iput v0, v3, Lcom/baidu/location/n$a;->if:I

    sget-object v0, Lcom/baidu/location/n;->cE:Ljava/lang/reflect/Method;

    #v0=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    invoke-virtual {v0, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    iput v0, v3, Lcom/baidu/location/n$a;->try:I

    sget-object v0, Lcom/baidu/location/n;->cB:Ljava/lang/reflect/Method;

    #v0=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    invoke-virtual {v0, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    iput v0, v3, Lcom/baidu/location/n$a;->for:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_4

    :catch_1
    #v0=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    iput v7, p0, Lcom/baidu/location/n;->cu:I

    goto/16 :goto_0

    :catch_2
    move-exception v0

    sput-object v1, Lcom/baidu/location/n;->cI:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/n;->cu:I

    goto/16 :goto_0

    :cond_11
    #v0=(Integer);
    iget-object v1, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    #v1=(Reference);
    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/n$a;

    goto/16 :goto_5

    :cond_12
    #v0=(Boolean);v1=(Null);
    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto/16 :goto_0

    :cond_13
    #v0=(PosByte);v4=(Reference);v6=(Uninit);
    move v0, v2

    #v0=(Null);
    goto/16 :goto_2
.end method

.method static synthetic if(Lcom/baidu/location/n;Landroid/telephony/CellLocation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/n;->if(Landroid/telephony/CellLocation;)V

    return-void
.end method

.method static synthetic int(Lcom/baidu/location/n;)Landroid/telephony/TelephonyManager;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic new(Lcom/baidu/location/n;)I
    .locals 1

    iget v0, p0, Lcom/baidu/location/n;->cD:I

    #v0=(Integer);
    return v0
.end method


# virtual methods
.method public H()Lcom/baidu/location/n$a;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    invoke-virtual {v0}, Lcom/baidu/location/n$a;->do()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/n$a;->for()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    #v0=(Reference);
    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/baidu/location/n;->if(Landroid/telephony/CellLocation;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/n;->ct:Lcom/baidu/location/n$a;

    #v0=(Reference);
    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public J()V
    .locals 4

    const/4 v3, 0x1

    #v3=(One);
    iget-boolean v0, p0, Lcom/baidu/location/n;->cG:Z

    #v0=(Boolean);
    if-ne v0, v3, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "phone"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iput-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    new-instance v0, Ljava/util/LinkedList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    new-instance v0, Lcom/baidu/location/n$b;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/n$b;-><init>(Lcom/baidu/location/n;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/n;->cw:Lcom/baidu/location/n$b;

    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/n;->cw:Lcom/baidu/location/n$b;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/baidu/location/n;->cw:Lcom/baidu/location/n$b;

    const/16 v2, 0x110

    #v2=(PosShort);
    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    #v2=(Conflicted);
    invoke-direct {p0}, Lcom/baidu/location/n;->I()Z

    move-result v0

    #v0=(Boolean);
    sput-boolean v0, Lcom/baidu/location/n;->cC:Z

    iput-boolean v3, p0, Lcom/baidu/location/n;->cG:Z

    goto :goto_0

    :catch_0
    #v0=(Reference);
    move-exception v0

    goto :goto_1
.end method

.method public L()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/location/n;->cA:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public M()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method public O()V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    iget-boolean v0, p0, Lcom/baidu/location/n;->cG:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/n;->cw:Lcom/baidu/location/n$b;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/baidu/location/n;->cw:Lcom/baidu/location/n$b;

    #v1=(Reference);
    invoke-virtual {v0, v1, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    :cond_1
    #v1=(Conflicted);
    iput-object v2, p0, Lcom/baidu/location/n;->cw:Lcom/baidu/location/n$b;

    iput-object v2, p0, Lcom/baidu/location/n;->cz:Landroid/telephony/TelephonyManager;

    iget-object v0, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iput-object v2, p0, Lcom/baidu/location/n;->cx:Ljava/util/List;

    iput-boolean v3, p0, Lcom/baidu/location/n;->cG:Z

    goto :goto_0
.end method

*/}
