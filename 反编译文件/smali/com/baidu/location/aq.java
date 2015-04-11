package com.baidu.location; class aq {/*

.class public Lcom/baidu/location/aq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/aq$1;,
        Lcom/baidu/location/aq$c;,
        Lcom/baidu/location/aq$d;,
        Lcom/baidu/location/aq$b;,
        Lcom/baidu/location/aq$a;
    }
.end annotation


# static fields
.field private static final iB:Ljava/lang/String; = "GeofenceStrategyService"

.field public static final iE:J = 0x1499700L

.field private static final iF:Ljava/lang/String; = "1"

.field private static final iK:Ljava/lang/String; = "com.baidu.locsdk.geofence.geofencestrategyservice"

.field private static final iL:I = 0x2bf20

.field private static final iN:I = 0xea60

.field public static iP:Lcom/baidu/location/aq; = null

.field private static final iR:Ljava/lang/String; = "0"

.field public static final iS:Ljava/lang/String; = "http://loc.map.baidu.com/fence"

.field private static final iV:Ljava/lang/String; = "&gf=1"

.field private static final iu:Ljava/lang/String; = "GeofenceStrategyService"

.field private static final iv:I = 0x7530

.field private static final iw:I = 0x57e40

.field private static final iy:I = 0x6


# instance fields
.field private iA:Z

.field private iC:Ljava/lang/String;

.field private iD:Lcom/baidu/location/aq$d;

.field private iG:Landroid/os/Handler;

.field private iH:Ljava/lang/String;

.field private iI:Lcom/baidu/location/aq$c;

.field private iJ:Landroid/os/PowerManager$WakeLock;

.field private iM:I

.field private iO:Landroid/os/HandlerThread;

.field private iQ:Landroid/os/Messenger;

.field private iT:Ljava/lang/String;

.field private iU:Lcom/baidu/location/ai$b;

.field private iW:Ljava/util/List;

.field private iX:Lcom/baidu/location/ai$b;

.field private ix:Ljava/lang/String;

.field private iz:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aq;->iG:Landroid/os/Handler;

    return-void
.end method

.method private b0()V
    .locals 3

    new-instance v0, Landroid/os/HandlerThread;

    #v0=(UninitRef);
    const-string v1, "GeofenceStrategyService"

    #v1=(Reference);
    const/16 v2, 0xa

    #v2=(PosByte);
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aq;->iO:Landroid/os/HandlerThread;

    iget-object v0, p0, Lcom/baidu/location/aq;->iO:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/aq;->iO:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aq;->iG:Landroid/os/Handler;

    new-instance v0, Lcom/baidu/location/aq$d;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/aq$d;-><init>(Lcom/baidu/location/aq;Lcom/baidu/location/aq$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aq;->iD:Lcom/baidu/location/aq$d;

    return-void
.end method

.method private b1()Ljava/util/List;
    .locals 6

    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/ai;->a7()Lcom/baidu/location/ai$b;

    move-result-object v1

    iput-object v1, p0, Lcom/baidu/location/aq;->iX:Lcom/baidu/location/ai$b;

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    const-string v2, "%s|%s|%s|%s"

    #v2=(Reference);
    const/4 v3, 0x4

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    iget v5, v0, Lcom/baidu/location/n$a;->do:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x1

    #v4=(One);
    iget v5, v0, Lcom/baidu/location/n$a;->if:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x2

    #v4=(PosByte);
    iget v5, v0, Lcom/baidu/location/n$a;->for:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x3

    iget v0, v0, Lcom/baidu/location/n$a;->try:I

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/aq;->iC:Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/aq;->iC:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/baidu/location/aq;->iX:Lcom/baidu/location/ai$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/aq;->iX:Lcom/baidu/location/ai$b;

    iget-object v0, v0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    #v4=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/wifi/ScanResult;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v3, ":"

    const-string v4, ""

    #v4=(Reference);
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    #v0=(Conflicted);v4=(Conflicted);
    return-object v1
.end method

.method public static b2()Lcom/baidu/location/aq;
    .locals 1

    sget-object v0, Lcom/baidu/location/aq;->iP:Lcom/baidu/location/aq;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/aq;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/aq;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/aq;->iP:Lcom/baidu/location/aq;

    sget-object v0, Lcom/baidu/location/aq;->iP:Lcom/baidu/location/aq;

    invoke-direct {v0}, Lcom/baidu/location/aq;->b0()V

    :cond_0
    sget-object v0, Lcom/baidu/location/aq;->iP:Lcom/baidu/location/aq;

    return-object v0
.end method

.method private bW()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/aq;->iJ:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/aq;->iJ:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/aq;->iJ:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/aq;->iJ:Landroid/os/PowerManager$WakeLock;

    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method private bX()Z
    .locals 4

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    iget-object v2, p0, Lcom/baidu/location/aq;->iU:Lcom/baidu/location/ai$b;

    #v2=(Reference);
    if-nez v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v2=(Reference);v3=(Uninit);
    iget-object v2, p0, Lcom/baidu/location/aq;->iX:Lcom/baidu/location/ai$b;

    iget-object v3, p0, Lcom/baidu/location/aq;->iU:Lcom/baidu/location/ai$b;

    #v3=(Reference);
    if-ne v2, v3, :cond_2

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(One);
    iget-object v2, p0, Lcom/baidu/location/aq;->iU:Lcom/baidu/location/ai$b;

    iget-object v3, p0, Lcom/baidu/location/aq;->iX:Lcom/baidu/location/ai$b;

    invoke-virtual {v2, v3}, Lcom/baidu/location/ai$b;->a(Lcom/baidu/location/ai$b;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method private bY()V
    .locals 6

    const v1, 0x2bf20

    #v1=(Integer);
    const/16 v5, 0x7530

    #v5=(PosShort);
    iget-boolean v0, p0, Lcom/baidu/location/aq;->iz:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0, v5}, Lcom/baidu/location/aq;->if(Landroid/content/Context;I)V

    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget v0, p0, Lcom/baidu/location/aq;->iM:I

    #v0=(Integer);
    if-lez v0, :cond_2

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v2

    #v2=(Reference);
    iget v0, p0, Lcom/baidu/location/aq;->iM:I

    const/4 v3, 0x6

    #v3=(PosByte);
    if-lt v0, v3, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {p0, v2, v0}, Lcom/baidu/location/aq;->if(Landroid/content/Context;I)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/baidu/location/aq;->iM:I

    mul-int/lit16 v0, v0, 0x7530

    goto :goto_1

    :cond_2
    #v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/aq;->iW:Ljava/util/List;

    #v0=(Reference);
    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/baidu/location/aq;->iW:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_6

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v2, p0, Lcom/baidu/location/aq;->iW:Ljava/util/List;

    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    #v3=(Reference);
    move v2, v0

    :goto_2
    #v0=(Boolean);v2=(Boolean);v4=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/ah;

    invoke-virtual {v0}, Lcom/baidu/location/ah;->if()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_3

    invoke-virtual {v0}, Lcom/baidu/location/ah;->for()Z

    move-result v4

    if-nez v4, :cond_3

    const/4 v2, 0x1

    #v2=(One);
    invoke-direct {p0, v0}, Lcom/baidu/location/aq;->do(Lcom/baidu/location/ah;)V

    :cond_3
    #v2=(Boolean);
    move v0, v2

    #v0=(Boolean);
    move v2, v0

    goto :goto_2

    :cond_4
    #v4=(Conflicted);
    if-eqz v2, :cond_5

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0, v5}, Lcom/baidu/location/aq;->if(Landroid/content/Context;I)V

    goto :goto_0

    :cond_5
    #v0=(Boolean);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0, v1}, Lcom/baidu/location/aq;->if(Landroid/content/Context;I)V

    goto :goto_0

    :cond_6
    #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    const v1, 0x57e40

    invoke-virtual {p0, v0, v1}, Lcom/baidu/location/aq;->if(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method private bZ()V
    .locals 5

    const/4 v1, 0x1

    #v1=(One);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-direct {p0}, Lcom/baidu/location/aq;->b1()Ljava/util/List;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0}, Lcom/baidu/location/aq;->for(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/baidu/location/aq;->iC:Ljava/lang/String;

    #v2=(Reference);
    iget-object v3, p0, Lcom/baidu/location/aq;->iH:Ljava/lang/String;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    invoke-direct {p0}, Lcom/baidu/location/aq;->bX()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    #v0=(Conflicted);v2=(Reference);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/ah;

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lcom/baidu/location/aq;->iz:Z

    invoke-direct {p0, v0}, Lcom/baidu/location/aq;->do(Lcom/baidu/location/ah;)V

    iget-object v0, p0, Lcom/baidu/location/aq;->iC:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/aq;->iH:Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/aq;->iX:Lcom/baidu/location/ai$b;

    iput-object v0, p0, Lcom/baidu/location/aq;->iU:Lcom/baidu/location/ai$b;

    iput v4, p0, Lcom/baidu/location/aq;->iM:I

    goto :goto_0

    :cond_1
    iput-boolean v4, p0, Lcom/baidu/location/aq;->iz:Z

    iget v0, p0, Lcom/baidu/location/aq;->iM:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/baidu/location/aq;->iM:I

    iget v0, p0, Lcom/baidu/location/aq;->iM:I

    const v3, 0x7fffffff

    #v3=(Integer);
    if-ne v0, v3, :cond_2

    move v0, v1

    :goto_1
    iput v0, p0, Lcom/baidu/location/aq;->iM:I

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/baidu/location/aq;->iM:I

    goto :goto_1

    :cond_3
    #v0=(Reference);v2=(Uninit);v3=(Uninit);
    iput-boolean v4, p0, Lcom/baidu/location/aq;->iz:Z

    :cond_4
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method static synthetic do(Lcom/baidu/location/aq;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/aq;->iG:Landroid/os/Handler;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic do(Lcom/baidu/location/aq;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/aq;->iH:Ljava/lang/String;

    return-object p1
.end method

.method private do(Lcom/baidu/location/ah;)V
    .locals 3

    new-instance v0, Lcom/baidu/location/aq$b;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/aq$b;-><init>(Lcom/baidu/location/aq;Lcom/baidu/location/aq$1;)V

    #v0=(Reference);
    const-string v1, "&gf=1"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/location/aq$b;->void(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "gcj02"

    invoke-virtual {p1}, Lcom/baidu/location/ah;->int()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/baidu/location/aq$a;

    #v1=(UninitRef);
    invoke-direct {v1, p0, p1, v0}, Lcom/baidu/location/aq$a;-><init>(Lcom/baidu/location/aq;Lcom/baidu/location/ah;Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/aq$a;->aa()V

    return-void
.end method

.method static synthetic for(Lcom/baidu/location/aq;)Lcom/baidu/location/aq$d;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/aq;->iD:Lcom/baidu/location/aq$d;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic if(Lcom/baidu/location/aq;Lcom/baidu/location/ai$b;)Lcom/baidu/location/ai$b;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/aq;->iU:Lcom/baidu/location/ai$b;

    return-object p1
.end method

.method static synthetic if(Lcom/baidu/location/aq;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/aq;->ix:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic if(Lcom/baidu/location/aq;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/aq;->iW:Ljava/util/List;

    return-object p1
.end method

.method static synthetic if(Lcom/baidu/location/aq;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/aq;->bY()V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/aq;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/aq;->new(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/aq;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/aq;->iz:Z

    return p1
.end method

.method static synthetic int(Lcom/baidu/location/aq;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/aq;->bZ()V

    return-void
.end method

.method static synthetic new(Lcom/baidu/location/aq;)Landroid/os/Messenger;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/aq;->iQ:Landroid/os/Messenger;

    #v0=(Reference);
    return-object v0
.end method

.method private new(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/aq;->iJ:Landroid/os/PowerManager$WakeLock;

    #v0=(Reference);
    if-nez v0, :cond_0

    const-string v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    const/4 v1, 0x1

    #v1=(One);
    const-string v2, "GeofenceStrategyService"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/aq;->iJ:Landroid/os/PowerManager$WakeLock;

    iget-object v0, p0, Lcom/baidu/location/aq;->iJ:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    iget-object v0, p0, Lcom/baidu/location/aq;->iJ:Landroid/os/PowerManager$WakeLock;

    const-wide/32 v1, 0xea60

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method


# virtual methods
.method public byte(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iput-boolean v2, p0, Lcom/baidu/location/aq;->iA:Z

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "com.baidu.locsdk.geofence.geofencestrategyservice"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const/high16 v1, 0x800

    #v1=(Integer);
    invoke-static {p1, v2, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/baidu/location/e;->a(Landroid/content/Context;Landroid/app/PendingIntent;)V

    invoke-direct {p0}, Lcom/baidu/location/aq;->bW()V

    iget-object v0, p0, Lcom/baidu/location/aq;->iI:Lcom/baidu/location/aq$c;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/aq;->iI:Lcom/baidu/location/aq$c;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public for(Ljava/util/List;)Ljava/util/List;
    .locals 32

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/location/i;->a(Landroid/content/Context;)Lcom/baidu/location/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/i;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v17

    #v17=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    if-eqz v17, :cond_7

    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    #v18=(LongLo);v19=(LongHi);
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v20

    #v20=(Reference);
    move-object v3, v1

    :goto_0
    :try_start_1
    #v0=(Conflicted);v1=(Reference);v2=(Reference);v3=(Reference);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_5

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    move-object v0, v1

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    move-object v11, v0

    #v11=(Reference);
    const-string v1, "SELECT b.geofence_id, b.longitude, b.latitude, b.radius, b.coord_type, b.duration_millis, b.is_lac, b.is_cell, b.is_wifi, b.radius_type FROM %s AS a LEFT JOIN %s AS b WHERE (a.geofence_id = b.geofence_id) AND (a.ap = \'%s\' AND  (b.valid_date + b.duration_millis) >= %d) AND (b.next_active_time < %d)"

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
    invoke-static {v11}, Lcom/baidu/location/Jni;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x3

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x4

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    #v4=(Null);
    move-object/from16 v0, v17

    invoke-virtual {v0, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v13

    #v13=(Reference);
    if-eqz v13, :cond_9

    :try_start_2
    invoke-interface {v13}, Landroid/database/Cursor;->getCount()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_9

    new-instance v12, Ljava/util/ArrayList;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    #v12=(Reference);
    invoke-interface {v12}, Ljava/util/List;->clear()V

    invoke-interface {v13}, Landroid/database/Cursor;->moveToFirst()Z

    const-string v1, "geofence_id"

    #v1=(Reference);
    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    #v21=(Integer);
    const-string v1, "longitude"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    #v22=(Integer);
    const-string v1, "latitude"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v23

    #v23=(Integer);
    const-string v1, "radius"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v24

    #v24=(Integer);
    const-string v1, "coord_type"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v25

    #v25=(Integer);
    const-string v1, "duration_millis"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v26

    #v26=(Integer);
    const-string v1, "is_lac"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v27

    #v27=(Integer);
    const-string v1, "is_cell"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v28

    #v28=(Integer);
    const-string v1, "is_wifi"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v29

    #v29=(Integer);
    const-string v1, "radius_type"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v30

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v30=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iput-object v11, v0, Lcom/baidu/location/aq;->iT:Ljava/lang/String;

    move/from16 v0, v21

    #v0=(Integer);
    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    move/from16 v0, v22

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v3

    #v3=(Float);
    move/from16 v0, v23

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    #v5=(Float);
    move/from16 v0, v24

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v31

    #v31=(Float);
    move/from16 v0, v25

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    #v10=(Reference);
    move/from16 v0, v26

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    #v8=(LongLo);v9=(LongHi);
    move/from16 v0, v27

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_2

    const/4 v1, 0x1

    #v1=(One);
    move/from16 v16, v1

    :goto_1
    #v1=(Boolean);v16=(Boolean);
    move/from16 v0, v28

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_3

    const/4 v1, 0x1

    #v1=(One);
    move v15, v1

    :goto_2
    #v1=(Boolean);v15=(Boolean);
    move/from16 v0, v29

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_4

    const/4 v1, 0x1

    #v1=(One);
    move v14, v1

    :goto_3
    #v1=(Boolean);v14=(Boolean);
    move/from16 v0, v30

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    #v7=(Integer);
    new-instance v1, Lcom/baidu/location/ah;

    #v1=(UninitRef);
    float-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    float-to-double v5, v5

    #v5=(DoubleLo);v6=(DoubleHi);
    invoke-direct/range {v1 .. v10}, Lcom/baidu/location/ah;-><init>(Ljava/lang/String;DDIJLjava/lang/String;)V

    #v1=(Reference);
    if-eqz v1, :cond_1

    move/from16 v0, v31

    #v0=(Float);
    invoke-virtual {v1, v0}, Lcom/baidu/location/ah;->a(F)V

    move/from16 v0, v16

    #v0=(Boolean);
    invoke-virtual {v1, v0}, Lcom/baidu/location/ah;->do(Z)V

    invoke-virtual {v1, v15}, Lcom/baidu/location/ah;->a(Z)V

    invoke-virtual {v1, v14}, Lcom/baidu/location/ah;->if(Z)V

    :cond_1
    #v0=(Integer);
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    move-object v1, v12

    :goto_4
    #v0=(Conflicted);v1=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
    move-object v3, v13

    #v3=(Reference);
    move-object v2, v1

    goto/16 :goto_0

    :cond_2
    #v0=(Integer);v1=(Integer);v3=(Float);v5=(Float);v8=(LongLo);v9=(LongHi);v10=(Reference);v12=(Reference);v21=(Integer);v22=(Integer);v23=(Integer);v24=(Integer);v25=(Integer);v26=(Integer);v27=(Integer);v28=(Integer);v29=(Integer);v30=(Integer);v31=(Float);
    const/4 v1, 0x0

    #v1=(Null);
    move/from16 v16, v1

    #v16=(Null);
    goto :goto_1

    :cond_3
    #v1=(Integer);v16=(Boolean);
    const/4 v1, 0x0

    #v1=(Null);
    move v15, v1

    #v15=(Null);
    goto :goto_2

    :cond_4
    #v1=(Integer);v15=(Boolean);
    const/4 v1, 0x0

    #v1=(Null);
    move v14, v1

    #v14=(Null);
    goto :goto_3

    :cond_5
    #v0=(Conflicted);v1=(Boolean);v3=(Reference);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
    if-eqz v3, :cond_6

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_6
    :goto_5
    #v1=(Conflicted);v3=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    invoke-virtual/range {v17 .. v17}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_7
    return-object v2

    :catch_0
    #v0=(Uninit);v1=(Null);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);
    move-exception v3

    :goto_6
    #v0=(Conflicted);v1=(Reference);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
    if-eqz v1, :cond_6

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_5

    :catchall_0
    #v0=(Uninit);v1=(Null);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);
    move-exception v2

    #v2=(Reference);
    move-object v13, v1

    #v13=(Null);
    move-object v1, v2

    :goto_7
    #v0=(Conflicted);v1=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Reference);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
    if-eqz v13, :cond_8

    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    :cond_8
    throw v1

    :catchall_1
    #v1=(Conflicted);v11=(Reference);v18=(LongLo);v19=(LongHi);v20=(Reference);
    move-exception v1

    #v1=(Reference);
    goto :goto_7

    :catchall_2
    #v1=(Conflicted);v3=(Reference);v11=(Conflicted);v13=(Conflicted);
    move-exception v1

    #v1=(Reference);
    move-object v13, v3

    #v13=(Reference);
    goto :goto_7

    :catch_1
    #v1=(Conflicted);v3=(Conflicted);v11=(Reference);v12=(Reference);
    move-exception v1

    #v1=(Reference);
    move-object v1, v13

    move-object v2, v12

    goto :goto_6

    :catch_2
    #v1=(Conflicted);v3=(Reference);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    move-exception v1

    #v1=(Reference);
    move-object v1, v3

    goto :goto_6

    :catch_3
    #v0=(Reference);v1=(Conflicted);v4=(Null);v5=(PosByte);v6=(Reference);v11=(Reference);v13=(Reference);
    move-exception v1

    #v1=(Reference);
    move-object v1, v13

    goto :goto_6

    :cond_9
    #v1=(Conflicted);
    move-object v1, v2

    #v1=(Reference);
    goto :goto_4
.end method

.method public if(Landroid/content/Context;I)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-string v1, "com.baidu.locsdk.geofence.geofencestrategyservice"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const/high16 v2, 0x800

    #v2=(Integer);
    invoke-static {p1, v1, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    #v1=(Reference);
    if-gtz p2, :cond_0

    invoke-static {p1, v1}, Lcom/baidu/location/e;->a(Landroid/content/Context;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :goto_0
    return-void

    :cond_0
    invoke-static {p1, v1, p2}, Lcom/baidu/location/e;->a(Landroid/content/Context;Landroid/app/PendingIntent;I)V

    goto :goto_0
.end method

.method public if(Landroid/content/Context;Landroid/os/Message;)V
    .locals 3

    iget-boolean v0, p0, Lcom/baidu/location/aq;->iA:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    iget-object v0, p2, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aq;->iQ:Landroid/os/Messenger;

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/aq;->iA:Z

    new-instance v0, Lcom/baidu/location/aq$c;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/aq$c;-><init>(Lcom/baidu/location/aq;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aq;->iI:Lcom/baidu/location/aq$c;

    iget-object v0, p0, Lcom/baidu/location/aq;->iI:Lcom/baidu/location/aq$c;

    new-instance v1, Landroid/content/IntentFilter;

    #v1=(UninitRef);
    const-string v2, "com.baidu.locsdk.geofence.geofencestrategyservice"

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, v0}, Lcom/baidu/location/aq;->if(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method public m(Ljava/lang/String;)Ljava/util/List;
    .locals 28

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/location/i;->a(Landroid/content/Context;)Lcom/baidu/location/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/i;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v16

    #v16=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    if-eqz v16, :cond_4

    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    :try_start_0
    #v3=(LongLo);v4=(LongHi);
    const-string v5, "SELECT b.geofence_id, b.longitude, b.latitude, b.radius, b.coord_type, b.duration_millis, b.is_lac, b.is_cell, b.is_wifi, b.radius_type FROM %s AS a LEFT JOIN %s AS b WHERE (a.geofence_id = b.geofence_id) AND (a.ap = \'%s\' AND  (b.valid_date + b.duration_millis >= %d) AND b.next_active_time < %d)"

    #v5=(Reference);
    const/4 v6, 0x5

    #v6=(PosByte);
    new-array v6, v6, [Ljava/lang/Object;

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    const-string v8, "geofence_detail"

    #v8=(Reference);
    aput-object v8, v6, v7

    const/4 v7, 0x1

    #v7=(One);
    const-string v8, "geofence"

    aput-object v8, v6, v7

    const/4 v7, 0x2

    #v7=(PosByte);
    aput-object p1, v6, v7

    const/4 v7, 0x3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x4

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    #v4=(Null);
    move-object/from16 v0, v16

    #v0=(Reference);
    invoke-virtual {v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v11

    #v11=(Reference);
    if-eqz v11, :cond_2

    :try_start_1
    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_2

    new-instance v12, Ljava/util/ArrayList;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    #v12=(Reference);
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    const-string v1, "geofence_id"

    #v1=(Reference);
    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    #v17=(Integer);
    const-string v1, "longitude"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    #v18=(Integer);
    const-string v1, "latitude"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    #v19=(Integer);
    const-string v1, "radius"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    #v20=(Integer);
    const-string v1, "coord_type"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    #v21=(Integer);
    const-string v1, "duration_millis"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    #v22=(Integer);
    const-string v1, "is_lac"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v23

    #v23=(Integer);
    const-string v1, "is_cell"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v24

    #v24=(Integer);
    const-string v1, "is_wifi"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v25

    #v25=(Integer);
    const-string v1, "radius_type"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v26

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v26=(Integer);v27=(Conflicted);
    move/from16 v0, v17

    #v0=(Integer);
    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    move/from16 v0, v18

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v3

    #v3=(Float);
    move/from16 v0, v19

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    #v5=(Float);
    move/from16 v0, v20

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v27

    #v27=(Float);
    move/from16 v0, v21

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    #v10=(Reference);
    move/from16 v0, v22

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    #v8=(LongLo);v9=(LongHi);
    move/from16 v0, v23

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_5

    const/4 v1, 0x1

    #v1=(One);
    move v15, v1

    :goto_0
    #v1=(Boolean);v15=(Boolean);
    move/from16 v0, v24

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_6

    const/4 v1, 0x1

    #v1=(One);
    move v14, v1

    :goto_1
    #v1=(Boolean);v14=(Boolean);
    move/from16 v0, v25

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_7

    const/4 v1, 0x1

    #v1=(One);
    move v13, v1

    :goto_2
    #v1=(Boolean);v13=(Boolean);
    move/from16 v0, v26

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    new-instance v1, Lcom/baidu/location/ah;

    #v1=(UninitRef);
    float-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    float-to-double v5, v5

    #v5=(DoubleLo);v6=(DoubleHi);
    invoke-direct/range {v1 .. v10}, Lcom/baidu/location/ah;-><init>(Ljava/lang/String;DDIJLjava/lang/String;)V

    #v1=(Reference);
    if-eqz v1, :cond_1

    move/from16 v0, v27

    #v0=(Float);
    invoke-virtual {v1, v0}, Lcom/baidu/location/ah;->a(F)V

    invoke-virtual {v1, v15}, Lcom/baidu/location/ah;->do(Z)V

    invoke-virtual {v1, v14}, Lcom/baidu/location/ah;->a(Z)V

    invoke-virtual {v1, v13}, Lcom/baidu/location/ah;->if(Z)V

    :cond_1
    #v0=(Integer);
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    move-object v1, v12

    :cond_2
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
    if-eqz v11, :cond_3

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_3
    :goto_3
    #v7=(Conflicted);v11=(Conflicted);
    invoke-virtual/range {v16 .. v16}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_4
    return-object v1

    :cond_5
    #v0=(Integer);v1=(Integer);v2=(Reference);v3=(Float);v5=(Float);v7=(Integer);v8=(LongLo);v9=(LongHi);v10=(Reference);v11=(Reference);v12=(Reference);v17=(Integer);v18=(Integer);v19=(Integer);v20=(Integer);v21=(Integer);v22=(Integer);v23=(Integer);v24=(Integer);v25=(Integer);v26=(Integer);v27=(Float);
    const/4 v1, 0x0

    #v1=(Null);
    move v15, v1

    #v15=(Null);
    goto :goto_0

    :cond_6
    #v1=(Integer);v15=(Boolean);
    const/4 v1, 0x0

    #v1=(Null);
    move v14, v1

    #v14=(Null);
    goto :goto_1

    :cond_7
    #v1=(Integer);v14=(Boolean);
    const/4 v1, 0x0

    #v1=(Null);
    move v13, v1

    #v13=(Null);
    goto :goto_2

    :catch_0
    #v0=(Conflicted);v2=(Null);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);
    move-exception v3

    :goto_4
    #v1=(Reference);v2=(Reference);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
    if-eqz v2, :cond_3

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_3

    :catchall_0
    #v1=(Null);v2=(Null);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);
    move-exception v1

    #v1=(Reference);
    move-object v11, v2

    :goto_5
    #v2=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Reference);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
    if-eqz v11, :cond_8

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_8
    throw v1

    :catchall_1
    #v1=(Conflicted);v7=(Integer);
    move-exception v1

    #v1=(Reference);
    goto :goto_5

    :catch_1
    #v0=(Reference);v1=(Null);v2=(Integer);v3=(Reference);v4=(Null);v5=(Reference);v6=(Reference);v7=(PosByte);v8=(Reference);v9=(Uninit);v10=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);
    move-exception v2

    #v2=(Reference);
    move-object v2, v11

    goto :goto_4

    :catch_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Reference);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
    move-exception v1

    #v1=(Reference);
    move-object v2, v11

    #v2=(Reference);
    move-object v1, v12

    goto :goto_4
.end method

.method public try(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, v0}, Lcom/baidu/location/aq;->if(Landroid/content/Context;Landroid/os/Message;)V

    return-void
.end method

*/}
