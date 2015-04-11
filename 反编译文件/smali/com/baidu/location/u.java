package com.baidu.location; class u {/*

.class public Lcom/baidu/location/u;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/u$b;,
        Lcom/baidu/location/u$a;
    }
.end annotation


# static fields
.field public static final fi:Ljava/lang/String; = "android.com.baidu.location.TIMER.NOTIFY"


# instance fields
.field private fe:I

.field private ff:Landroid/content/Context;

.field private fg:Landroid/app/AlarmManager;

.field private fh:Lcom/baidu/location/u$a;

.field private fj:Landroid/app/PendingIntent;

.field private fk:Ljava/util/ArrayList;

.field private fl:Lcom/baidu/location/BDLocation;

.field private fm:J

.field private fn:Lcom/baidu/location/u$b;

.field private fo:F

.field private fp:Z

.field private fq:Z

.field private fr:J

.field private fs:Z

.field private ft:Lcom/baidu/location/LocationClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/baidu/location/LocationClient;)V
    .locals 5

    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    const v0, 0x7f7fffff

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/u;->fo:F

    iput-object v1, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    iput-wide v3, p0, Lcom/baidu/location/u;->fr:J

    iput-object v1, p0, Lcom/baidu/location/u;->ft:Lcom/baidu/location/LocationClient;

    iput-object v1, p0, Lcom/baidu/location/u;->ff:Landroid/content/Context;

    iput v2, p0, Lcom/baidu/location/u;->fe:I

    iput-wide v3, p0, Lcom/baidu/location/u;->fm:J

    iput-boolean v2, p0, Lcom/baidu/location/u;->fq:Z

    iput-boolean v2, p0, Lcom/baidu/location/u;->fp:Z

    iput-object v1, p0, Lcom/baidu/location/u;->fj:Landroid/app/PendingIntent;

    iput-object v1, p0, Lcom/baidu/location/u;->fg:Landroid/app/AlarmManager;

    iput-object v1, p0, Lcom/baidu/location/u;->fn:Lcom/baidu/location/u$b;

    new-instance v0, Lcom/baidu/location/u$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/u$a;-><init>(Lcom/baidu/location/u;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/u;->fh:Lcom/baidu/location/u$a;

    iput-boolean v2, p0, Lcom/baidu/location/u;->fs:Z

    iput-object p1, p0, Lcom/baidu/location/u;->ff:Landroid/content/Context;

    iput-object p2, p0, Lcom/baidu/location/u;->ft:Lcom/baidu/location/LocationClient;

    iget-object v0, p0, Lcom/baidu/location/u;->ft:Lcom/baidu/location/LocationClient;

    iget-object v1, p0, Lcom/baidu/location/u;->fh:Lcom/baidu/location/u$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient;->registerNotifyLocationListener(Lcom/baidu/location/BDLocationListener;)V

    iget-object v0, p0, Lcom/baidu/location/u;->ff:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/baidu/location/u;->fg:Landroid/app/AlarmManager;

    new-instance v0, Lcom/baidu/location/u$b;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/u$b;-><init>(Lcom/baidu/location/u;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/u;->fn:Lcom/baidu/location/u$b;

    iput-boolean v2, p0, Lcom/baidu/location/u;->fs:Z

    return-void
.end method

.method private aP()V
    .locals 8

    const/16 v1, 0x2710

    #v1=(PosShort);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x1

    #v3=(One);
    invoke-direct {p0}, Lcom/baidu/location/u;->aR()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(PosShort);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    iget v0, p0, Lcom/baidu/location/u;->fo:F

    #v0=(Integer);
    const v4, 0x459c4000

    #v4=(Integer);
    cmpl-float v0, v0, v4

    #v0=(Byte);
    if-lez v0, :cond_2

    const v0, 0x927c0

    :goto_1
    #v0=(Integer);
    iget-boolean v4, p0, Lcom/baidu/location/u;->fp:Z

    #v4=(Boolean);
    if-eqz v4, :cond_6

    iput-boolean v2, p0, Lcom/baidu/location/u;->fp:Z

    :goto_2
    #v1=(Integer);
    iget v0, p0, Lcom/baidu/location/u;->fe:I

    if-eqz v0, :cond_5

    iget-wide v4, p0, Lcom/baidu/location/u;->fm:J

    #v4=(LongLo);v5=(LongHi);
    iget v0, p0, Lcom/baidu/location/u;->fe:I

    int-to-long v6, v0

    #v6=(LongLo);v7=(LongHi);
    add-long/2addr v4, v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v4, v6

    int-to-long v6, v1

    cmp-long v0, v6, v4

    #v0=(Byte);
    if-lez v0, :cond_5

    move v0, v2

    :goto_3
    #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-eqz v0, :cond_0

    iput v1, p0, Lcom/baidu/location/u;->fe:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/u;->fm:J

    iget v0, p0, Lcom/baidu/location/u;->fe:I

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);
    invoke-direct {p0, v0, v1}, Lcom/baidu/location/u;->if(J)V

    goto :goto_0

    :cond_2
    #v0=(Byte);v1=(PosShort);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    iget v0, p0, Lcom/baidu/location/u;->fo:F

    #v0=(Integer);
    const/high16 v4, 0x447a

    cmpl-float v0, v0, v4

    #v0=(Byte);
    if-lez v0, :cond_3

    const v0, 0x1d4c0

    #v0=(Integer);
    goto :goto_1

    :cond_3
    #v0=(Byte);
    iget v0, p0, Lcom/baidu/location/u;->fo:F

    #v0=(Integer);
    const/high16 v4, 0x43fa

    cmpl-float v0, v0, v4

    #v0=(Byte);
    if-lez v0, :cond_4

    const v0, 0xea60

    #v0=(Char);
    goto :goto_1

    :cond_4
    #v0=(Byte);
    move v0, v1

    #v0=(PosShort);
    goto :goto_1

    :cond_5
    #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move v0, v3

    #v0=(One);
    goto :goto_3

    :cond_6
    #v0=(Integer);v1=(PosShort);v4=(Boolean);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    move v1, v0

    #v1=(Integer);
    goto :goto_2
.end method

.method private aR()Z
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    :cond_0
    #v1=(Conflicted);
    move v1, v0

    :cond_1
    #v0=(Boolean);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v1

    :cond_2
    #v0=(Null);v2=(Uninit);v3=(Uninit);
    iget-object v1, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    #v2=(Reference);
    move v1, v0

    :goto_0
    #v0=(Boolean);v1=(Boolean);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/BDNotifyListener;

    iget v0, v0, Lcom/baidu/location/BDNotifyListener;->Notified:I

    #v0=(Integer);
    const/4 v3, 0x3

    #v3=(PosByte);
    if-ge v0, v3, :cond_3

    const/4 v0, 0x1

    :goto_1
    #v0=(Boolean);
    move v1, v0

    goto :goto_0

    :cond_3
    #v0=(Integer);
    move v0, v1

    #v0=(Boolean);
    goto :goto_1
.end method

.method static synthetic do(Lcom/baidu/location/u;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic if(Lcom/baidu/location/u;)Lcom/baidu/location/LocationClient;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/u;->ft:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    return-object v0
.end method

.method private if(J)V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    iget-boolean v0, p0, Lcom/baidu/location/u;->fq:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/u;->fg:Landroid/app/AlarmManager;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/u;->fj:Landroid/app/PendingIntent;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/u;->ff:Landroid/content/Context;

    #v0=(Reference);
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    const-string v2, "android.com.baidu.location.TIMER.NOTIFY"

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    const/high16 v2, 0x800

    #v2=(Integer);
    invoke-static {v0, v4, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/u;->fj:Landroid/app/PendingIntent;

    iget-object v0, p0, Lcom/baidu/location/u;->fg:Landroid/app/AlarmManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    add-long/2addr v1, p1

    iget-object v3, p0, Lcom/baidu/location/u;->fj:Landroid/app/PendingIntent;

    #v3=(Reference);
    invoke-virtual {v0, v4, v1, v2, v3}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/u;Lcom/baidu/location/BDLocation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/u;->int(Lcom/baidu/location/BDLocation;)V

    return-void
.end method

.method private int(Lcom/baidu/location/BDLocation;)V
    .locals 12

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/u;->fq:Z

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x3d

    #v1=(PosByte);
    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    const/16 v1, 0xa1

    #v1=(PosShort);
    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    const/16 v1, 0x41

    #v1=(PosByte);
    if-eq v0, v1, :cond_1

    const-wide/32 v0, 0x1d4c0

    #v0=(LongLo);v1=(LongHi);
    invoke-direct {p0, v0, v1}, Lcom/baidu/location/u;->if(J)V

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return-void

    :cond_1
    #v0=(Integer);v1=(PosShort);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/u;->fr:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    iput-wide v0, p0, Lcom/baidu/location/u;->fr:J

    const/4 v0, 0x1

    #v0=(One);
    new-array v8, v0, [F

    #v8=(Reference);
    const v0, 0x7f7fffff

    #v0=(Integer);
    iget-object v1, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    #v11=(Reference);
    move v10, v0

    :goto_1
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Integer);
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    move-object v9, v0

    #v9=(Reference);
    check-cast v9, Lcom/baidu/location/BDNotifyListener;

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    iget-wide v4, v9, Lcom/baidu/location/BDNotifyListener;->mLatitudeC:D

    #v4=(DoubleLo);v5=(DoubleHi);
    iget-wide v6, v9, Lcom/baidu/location/BDNotifyListener;->mLongitudeC:D

    #v6=(DoubleLo);v7=(DoubleHi);
    invoke-static/range {v0 .. v8}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 v0, 0x0

    #v0=(Null);
    aget v0, v8, v0

    #v0=(Integer);
    iget v1, v9, Lcom/baidu/location/BDNotifyListener;->mRadius:F

    #v1=(Integer);
    sub-float/2addr v0, v1

    #v0=(Float);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getRadius()F

    move-result v1

    #v1=(Float);
    sub-float/2addr v0, v1

    const/4 v1, 0x0

    #v1=(Null);
    cmpl-float v1, v0, v1

    #v1=(Byte);
    if-lez v1, :cond_2

    cmpg-float v1, v0, v10

    if-gez v1, :cond_3

    :goto_2
    #v0=(Integer);
    move v10, v0

    goto :goto_1

    :cond_2
    #v0=(Float);
    iget v0, v9, Lcom/baidu/location/BDNotifyListener;->Notified:I

    #v0=(Integer);
    const/4 v1, 0x3

    #v1=(PosByte);
    if-ge v0, v1, :cond_3

    iget v0, v9, Lcom/baidu/location/BDNotifyListener;->Notified:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v9, Lcom/baidu/location/BDNotifyListener;->Notified:I

    const/4 v0, 0x0

    #v0=(Null);
    aget v0, v8, v0

    #v0=(Integer);
    invoke-virtual {v9, p1, v0}, Lcom/baidu/location/BDNotifyListener;->onNotify(Lcom/baidu/location/BDLocation;F)V

    iget v0, v9, Lcom/baidu/location/BDNotifyListener;->Notified:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_3

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/u;->fp:Z

    :cond_3
    #v0=(Integer);v1=(Byte);
    move v0, v10

    goto :goto_2

    :cond_4
    #v0=(Boolean);v1=(Conflicted);v2=(LongLo);v3=(LongHi);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
    iget v0, p0, Lcom/baidu/location/u;->fo:F

    #v0=(Integer);
    cmpg-float v0, v10, v0

    #v0=(Byte);
    if-gez v0, :cond_5

    iput v10, p0, Lcom/baidu/location/u;->fo:F

    :cond_5
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/location/u;->fe:I

    invoke-direct {p0}, Lcom/baidu/location/u;->aP()V

    goto/16 :goto_0
.end method


# virtual methods
.method public aQ()V
    .locals 2

    iget-boolean v0, p0, Lcom/baidu/location/u;->fq:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/u;->fg:Landroid/app/AlarmManager;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/u;->fj:Landroid/app/PendingIntent;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/u;->fr:J

    iget-boolean v0, p0, Lcom/baidu/location/u;->fs:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/u;->ff:Landroid/content/Context;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/u;->fn:Lcom/baidu/location/u$b;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/u;->fs:Z

    return-void
.end method

.method public do(Lcom/baidu/location/BDNotifyListener;)I
    .locals 12

    const/4 v11, 0x3

    #v11=(PosByte);
    const/4 v10, 0x0

    #v10=(Null);
    const/4 v9, 0x1

    #v9=(One);
    iget-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v9, p1, Lcom/baidu/location/BDNotifyListener;->isAdded:Z

    iput-object p0, p1, Lcom/baidu/location/BDNotifyListener;->mNotifyCache:Lcom/baidu/location/u;

    iget-boolean v0, p0, Lcom/baidu/location/u;->fs:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/u;->ff:Landroid/content/Context;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/u;->fn:Lcom/baidu/location/u$b;

    #v1=(Reference);
    new-instance v2, Landroid/content/IntentFilter;

    #v2=(UninitRef);
    const-string v3, "android.com.baidu.location.TIMER.NOTIFY"

    #v3=(Reference);
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iput-boolean v9, p0, Lcom/baidu/location/u;->fs:Z

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p1, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    #v0=(Reference);
    if-nez v0, :cond_2

    :goto_0
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v9

    :cond_2
    #v0=(Reference);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-object v0, p1, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    const-string v1, "gcj02"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_3

    iget-wide v0, p1, Lcom/baidu/location/BDNotifyListener;->mLongitude:D

    #v0=(DoubleLo);v1=(DoubleHi);
    iget-wide v2, p1, Lcom/baidu/location/BDNotifyListener;->mLatitude:D

    #v2=(DoubleLo);v3=(DoubleHi);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    iget-object v5, p1, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "2gcj"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/baidu/location/Jni;->if(DDLjava/lang/String;)[D

    move-result-object v0

    #v0=(Reference);
    aget-wide v1, v0, v10

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, p1, Lcom/baidu/location/BDNotifyListener;->mLongitudeC:D

    aget-wide v0, v0, v9

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p1, Lcom/baidu/location/BDNotifyListener;->mLatitudeC:D

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    if-eqz v0, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/u;->fr:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_6

    :cond_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/u;->ft:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/LocationClient;->requestNotifyLocation()V

    :cond_5
    :goto_1
    #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-direct {p0}, Lcom/baidu/location/u;->aP()V

    goto :goto_0

    :cond_6
    #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    new-array v8, v9, [F

    #v8=(Reference);
    iget-object v0, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    iget-object v2, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    iget-wide v4, p1, Lcom/baidu/location/BDNotifyListener;->mLatitudeC:D

    #v4=(DoubleLo);v5=(DoubleHi);
    iget-wide v6, p1, Lcom/baidu/location/BDNotifyListener;->mLongitudeC:D

    #v6=(DoubleLo);v7=(DoubleHi);
    invoke-static/range {v0 .. v8}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget v0, v8, v10

    #v0=(Integer);
    iget v1, p1, Lcom/baidu/location/BDNotifyListener;->mRadius:F

    #v1=(Integer);
    sub-float/2addr v0, v1

    #v0=(Float);
    iget-object v1, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/BDLocation;->getRadius()F

    move-result v1

    #v1=(Float);
    sub-float/2addr v0, v1

    const/4 v1, 0x0

    #v1=(Null);
    cmpl-float v1, v0, v1

    #v1=(Byte);
    if-lez v1, :cond_7

    iget v1, p0, Lcom/baidu/location/u;->fo:F

    #v1=(Integer);
    cmpg-float v1, v0, v1

    #v1=(Byte);
    if-gez v1, :cond_5

    iput v0, p0, Lcom/baidu/location/u;->fo:F

    goto :goto_1

    :cond_7
    iget v0, p1, Lcom/baidu/location/BDNotifyListener;->Notified:I

    #v0=(Integer);
    if-ge v0, v11, :cond_5

    iget v0, p1, Lcom/baidu/location/BDNotifyListener;->Notified:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/baidu/location/BDNotifyListener;->Notified:I

    iget-object v0, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    aget v1, v8, v10

    #v1=(Integer);
    invoke-virtual {p1, v0, v1}, Lcom/baidu/location/BDNotifyListener;->onNotify(Lcom/baidu/location/BDLocation;F)V

    iget v0, p1, Lcom/baidu/location/BDNotifyListener;->Notified:I

    #v0=(Integer);
    if-ge v0, v11, :cond_5

    iput-boolean v9, p0, Lcom/baidu/location/u;->fp:Z

    goto :goto_1
.end method

.method public for(Lcom/baidu/location/BDNotifyListener;)I
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/u;->fk:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/baidu/location/u;->fq:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/u;->fg:Landroid/app/AlarmManager;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/u;->fj:Landroid/app/PendingIntent;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public if(Lcom/baidu/location/BDNotifyListener;)V
    .locals 12

    const/4 v11, 0x3

    #v11=(PosByte);
    const/4 v10, 0x1

    #v10=(One);
    const/4 v9, 0x0

    #v9=(Null);
    iget-object v0, p1, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void

    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-object v0, p1, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    const-string v1, "gcj02"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    iget-wide v0, p1, Lcom/baidu/location/BDNotifyListener;->mLongitude:D

    #v0=(DoubleLo);v1=(DoubleHi);
    iget-wide v2, p1, Lcom/baidu/location/BDNotifyListener;->mLatitude:D

    #v2=(DoubleLo);v3=(DoubleHi);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    iget-object v5, p1, Lcom/baidu/location/BDNotifyListener;->mCoorType:Ljava/lang/String;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "2gcj"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/baidu/location/Jni;->if(DDLjava/lang/String;)[D

    move-result-object v0

    #v0=(Reference);
    aget-wide v1, v0, v9

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, p1, Lcom/baidu/location/BDNotifyListener;->mLongitudeC:D

    aget-wide v0, v0, v10

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p1, Lcom/baidu/location/BDNotifyListener;->mLatitudeC:D

    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/u;->fr:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_4

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/u;->ft:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/LocationClient;->requestNotifyLocation()V

    :cond_3
    :goto_1
    #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-direct {p0}, Lcom/baidu/location/u;->aP()V

    goto :goto_0

    :cond_4
    #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    new-array v8, v10, [F

    #v8=(Reference);
    iget-object v0, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    iget-object v2, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v2

    #v2=(DoubleLo);v3=(DoubleHi);
    iget-wide v4, p1, Lcom/baidu/location/BDNotifyListener;->mLatitudeC:D

    #v4=(DoubleLo);v5=(DoubleHi);
    iget-wide v6, p1, Lcom/baidu/location/BDNotifyListener;->mLongitudeC:D

    #v6=(DoubleLo);v7=(DoubleHi);
    invoke-static/range {v0 .. v8}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget v0, v8, v9

    #v0=(Integer);
    iget v1, p1, Lcom/baidu/location/BDNotifyListener;->mRadius:F

    #v1=(Integer);
    sub-float/2addr v0, v1

    #v0=(Float);
    iget-object v1, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/BDLocation;->getRadius()F

    move-result v1

    #v1=(Float);
    sub-float/2addr v0, v1

    const/4 v1, 0x0

    #v1=(Null);
    cmpl-float v1, v0, v1

    #v1=(Byte);
    if-lez v1, :cond_5

    iget v1, p0, Lcom/baidu/location/u;->fo:F

    #v1=(Integer);
    cmpg-float v1, v0, v1

    #v1=(Byte);
    if-gez v1, :cond_3

    iput v0, p0, Lcom/baidu/location/u;->fo:F

    goto :goto_1

    :cond_5
    iget v0, p1, Lcom/baidu/location/BDNotifyListener;->Notified:I

    #v0=(Integer);
    if-ge v0, v11, :cond_3

    iget v0, p1, Lcom/baidu/location/BDNotifyListener;->Notified:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/baidu/location/BDNotifyListener;->Notified:I

    iget-object v0, p0, Lcom/baidu/location/u;->fl:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    aget v1, v8, v9

    #v1=(Integer);
    invoke-virtual {p1, v0, v1}, Lcom/baidu/location/BDNotifyListener;->onNotify(Lcom/baidu/location/BDLocation;F)V

    iget v0, p1, Lcom/baidu/location/BDNotifyListener;->Notified:I

    #v0=(Integer);
    if-ge v0, v11, :cond_3

    iput-boolean v10, p0, Lcom/baidu/location/u;->fp:Z

    goto :goto_1
.end method

*/}
