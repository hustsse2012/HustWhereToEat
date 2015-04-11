package com.baidu.location; class LocationClient {/*

.class public final Lcom/baidu/location/LocationClient;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/j;
.implements Lcom/baidu/location/an;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/LocationClient$a;,
        Lcom/baidu/location/LocationClient$b;
    }
.end annotation


# static fields
.field public static PREF_FILE_NAME:Ljava/lang/String; = null

.field public static PREF_KEY_NAME:Ljava/lang/String; = null

.field private static final hA:I = 0x9

.field private static final hC:I = 0x7

.field private static final hI:I = 0x5

.field private static final hJ:I = 0xc

.field private static final hK:I = 0x6

.field private static final hL:I = 0x2

.field private static final hO:I = 0x1770

.field private static final hV:I = 0xb

.field private static final hY:I = 0x4

.field private static final hg:I = 0xa

.field private static final hi:Ljava/lang/String; = "baidu_location_Client"

.field private static final hl:I = 0x1

.field private static final hq:I = 0x3e8

.field private static final hu:I = 0x3

.field private static final hv:Ljava/lang/String; = "sign"

.field private static final hw:I = 0x8

.field private static final hy:Ljava/lang/String; = "key"


# instance fields
.field private hB:Z

.field private final hD:Landroid/os/Messenger;

.field private hE:Landroid/content/Context;

.field private hF:Landroid/os/Messenger;

.field private hG:J

.field private hH:Lcom/baidu/location/LocationClientOption;

.field private hM:Z

.field private hN:J

.field private hP:J

.field private hQ:Landroid/content/ServiceConnection;

.field private hR:Ljava/lang/String;

.field private hS:Z

.field private hT:Z

.field private hU:Lcom/baidu/location/BDLocation;

.field private hW:Ljava/lang/String;

.field private hX:Ljava/lang/String;

.field private hZ:Ljava/util/ArrayList;

.field private hf:Z

.field private hh:Lcom/baidu/location/LocationClient$a;

.field private final hj:Ljava/lang/Object;

.field private hk:Lcom/baidu/location/BDErrorReport;

.field private hm:Lcom/baidu/location/LocationClient$b;

.field private hn:Ljava/lang/Boolean;

.field private ho:J

.field private hp:Lcom/baidu/location/u;

.field private hr:J

.field private hs:Ljava/lang/Boolean;

.field private ht:Z

.field private hx:Lcom/baidu/location/BDLocationListener;

.field private hz:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "pref_key"

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/LocationClient;->PREF_FILE_NAME:Ljava/lang/String;

    const-string v0, "access_key"

    sput-object v0, Lcom/baidu/location/LocationClient;->PREF_KEY_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->hN:J

    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->ho:J

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hX:Ljava/lang/String;

    new-instance v0, Lcom/baidu/location/LocationClientOption;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/LocationClientOption;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hM:Z

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    new-instance v0, Lcom/baidu/location/LocationClient$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0, v2}, Lcom/baidu/location/LocationClient$a;-><init>(Lcom/baidu/location/LocationClient;Lcom/baidu/location/LocationClient$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    new-instance v0, Landroid/os/Messenger;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hz:Z

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hS:Z

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hB:Z

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hf:Z

    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hj:Ljava/lang/Object;

    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->hG:J

    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->hP:J

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hp:Lcom/baidu/location/u;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hT:Z

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hx:Lcom/baidu/location/BDLocationListener;

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hW:Ljava/lang/String;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->ht:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hs:Ljava/lang/Boolean;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hn:Ljava/lang/Boolean;

    new-instance v0, Lcom/baidu/location/LocationClient$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/LocationClient$1;-><init>(Lcom/baidu/location/LocationClient;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hQ:Landroid/content/ServiceConnection;

    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->hr:J

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hk:Lcom/baidu/location/BDErrorReport;

    iput-object p1, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    new-instance v0, Lcom/baidu/location/LocationClientOption;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/LocationClientOption;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    new-instance v0, Lcom/baidu/location/u;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lcom/baidu/location/u;-><init>(Landroid/content/Context;Lcom/baidu/location/LocationClient;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hp:Lcom/baidu/location/u;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/baidu/location/LocationClientOption;)V
    .locals 6

    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->hN:J

    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->ho:J

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hX:Ljava/lang/String;

    new-instance v0, Lcom/baidu/location/LocationClientOption;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/LocationClientOption;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hM:Z

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    new-instance v0, Lcom/baidu/location/LocationClient$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0, v2}, Lcom/baidu/location/LocationClient$a;-><init>(Lcom/baidu/location/LocationClient;Lcom/baidu/location/LocationClient$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    new-instance v0, Landroid/os/Messenger;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hz:Z

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hS:Z

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hB:Z

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hf:Z

    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hj:Ljava/lang/Object;

    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->hG:J

    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->hP:J

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hp:Lcom/baidu/location/u;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hT:Z

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hx:Lcom/baidu/location/BDLocationListener;

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hW:Ljava/lang/String;

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->ht:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hs:Ljava/lang/Boolean;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hn:Ljava/lang/Boolean;

    new-instance v0, Lcom/baidu/location/LocationClient$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/LocationClient$1;-><init>(Lcom/baidu/location/LocationClient;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hQ:Landroid/content/ServiceConnection;

    iput-wide v4, p0, Lcom/baidu/location/LocationClient;->hr:J

    iput-object v2, p0, Lcom/baidu/location/LocationClient;->hk:Lcom/baidu/location/BDErrorReport;

    iput-object p1, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    iput-object p2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    new-instance v0, Lcom/baidu/location/u;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lcom/baidu/location/u;-><init>(Landroid/content/Context;Lcom/baidu/location/LocationClient;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hp:Lcom/baidu/location/u;

    return-void
.end method

.method private bF()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "num"

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/LocationClientOption;->a:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "distance"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/LocationClientOption;->do:F

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "extraInfo"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget-boolean v2, v2, Lcom/baidu/location/LocationClientOption;->if:Z

    #v2=(Boolean);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0
.end method

.method private bG()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "packName"

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hX:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "prodName"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    iget-object v2, v2, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "coorType"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    iget-object v2, v2, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "addrType"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    iget-object v2, v2, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "openGPS"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    iget-boolean v2, v2, Lcom/baidu/location/LocationClientOption;->case:Z

    #v2=(Boolean);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "location_change_notify"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget-boolean v2, v2, Lcom/baidu/location/LocationClientOption;->void:Z

    #v2=(Boolean);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "scanSpan"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/LocationClientOption;->int:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "timeOut"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/LocationClientOption;->long:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "priority"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/LocationClientOption;->goto:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "map"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hs:Ljava/lang/Boolean;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    #v2=(Boolean);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "import"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hn:Ljava/lang/Boolean;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    #v2=(Boolean);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0
.end method

.method private bH()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Reference);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0x19

    #v1=(PosByte);
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :try_start_0
    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    #v1=(Reference);
    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bF()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/LocationClient;->ho:J

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/LocationClient;->hS:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private bI()V
    .locals 4

    const/4 v1, 0x1

    #v1=(One);
    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->hM:Z

    #v0=(Boolean);
    if-ne v0, v1, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(One);v2=(Uninit);v3=(Uninit);
    invoke-static {}, Lcom/baidu/location/b;->new()V

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hX:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hX:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_bdls_v2.9"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hW:Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    const-class v2, Lcom/baidu/location/f;

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    #v0=(Reference);
    const-string v1, "key"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hR:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "sign"

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    invoke-static {v2}, Lcom/baidu/location/q;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    if-nez v1, :cond_1

    new-instance v1, Lcom/baidu/location/LocationClientOption;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/location/LocationClientOption;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hQ:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v3=(Conflicted);
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/LocationClient;->hM:Z

    goto :goto_0
.end method

.method private bJ()V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->hM:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Uninit);
    const/16 v0, 0xc

    #v0=(PosByte);
    invoke-static {v4, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    #v1=(Reference);
    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    :try_start_0
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hQ:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hj:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->hB:Z

    #v0=(Boolean);
    const/4 v2, 0x1

    #v2=(One);
    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    #v2=(Reference);
    invoke-virtual {v0, v2}, Lcom/baidu/location/LocationClient$a;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/LocationClient;->hB:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_2
    :try_start_2
    #v0=(Conflicted);v2=(Conflicted);
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hp:Lcom/baidu/location/u;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/u;->aQ()V

    iput-object v4, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    invoke-static {}, Lcom/baidu/location/b;->try()V

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hM:Z

    goto :goto_0

    :catch_0
    #v2=(Uninit);
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :catchall_0
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    :try_start_3
    #v0=(Reference);
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catch_1
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_2
.end method

.method private bK()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_0
    #v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0x16

    #v1=(PosByte);
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :try_start_0
    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    #v1=(Reference);
    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v1=(Conflicted);
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private bL()V
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0x1c

    #v1=(PosByte);
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :try_start_0
    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    #v1=(Reference);
    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private bM()V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_0
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/LocationClient;->hG:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gtz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/baidu/location/LocationClientOption;->void:Z

    #v0=(Boolean);
    if-nez v0, :cond_3

    :cond_1
    #v0=(Byte);
    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->ht:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    iget-wide v2, p0, Lcom/baidu/location/LocationClient;->hP:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x4e20

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_3

    :cond_2
    const/16 v0, 0x16

    #v0=(PosByte);
    invoke-static {v4, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :try_start_0
    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    #v1=(Reference);
    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/LocationClient;->hN:J

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/LocationClient;->hz:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hj:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    iget v0, v0, Lcom/baidu/location/LocationClientOption;->int:I

    #v0=(Integer);
    const/16 v2, 0x3e8

    #v2=(PosShort);
    if-lt v0, v2, :cond_5

    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->hB:Z

    #v0=(Boolean);
    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    #v0=(Reference);
    if-nez v0, :cond_4

    new-instance v0, Lcom/baidu/location/LocationClient$b;

    #v0=(UninitRef);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {v0, p0, v2}, Lcom/baidu/location/LocationClient$b;-><init>(Lcom/baidu/location/LocationClient;Lcom/baidu/location/LocationClient$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    :cond_4
    #v2=(PosShort);
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    #v2=(Reference);
    iget-object v3, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v3=(Reference);
    iget v3, v3, Lcom/baidu/location/LocationClientOption;->int:I

    #v3=(Integer);
    int-to-long v3, v3

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v0, v2, v3, v4}, Lcom/baidu/location/LocationClient$a;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/LocationClient;->hB:Z

    :cond_5
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(LongLo);v3=(LongHi);v4=(Null);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method private byte(I)V
    .locals 6

    const/16 v5, 0x43

    #v5=(PosByte);
    const/16 v4, 0x42

    #v4=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v1, 0x1

    #v1=(One);
    const/16 v0, 0x1a

    #v0=(PosByte);
    if-ne p1, v0, :cond_2

    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->hS:Z

    #v0=(Boolean);
    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    #v1=(Reference);v2=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/BDLocationListener;

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    #v2=(Reference);
    invoke-interface {v0, v2}, Lcom/baidu/location/BDLocationListener;->onReceivePoi(Lcom/baidu/location/BDLocation;)V

    goto :goto_0

    :cond_0
    #v0=(Boolean);v2=(Conflicted);
    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hS:Z

    :cond_1
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_2
    #v0=(PosByte);v1=(One);v2=(Uninit);
    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->hz:Z

    #v0=(Boolean);
    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/baidu/location/LocationClientOption;->void:Z

    #v0=(Boolean);
    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x3d

    #v1=(PosByte);
    if-eq v0, v1, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    if-eq v0, v4, :cond_4

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    if-eq v0, v5, :cond_4

    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->ht:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_4
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    #v1=(Reference);v2=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/BDLocationListener;

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    #v2=(Reference);
    invoke-interface {v0, v2}, Lcom/baidu/location/BDLocationListener;->onReceiveLocation(Lcom/baidu/location/BDLocation;)V

    goto :goto_2

    :cond_5
    #v0=(Boolean);v2=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    if-eq v0, v4, :cond_1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    if-eq v0, v5, :cond_1

    iput-boolean v3, p0, Lcom/baidu/location/LocationClient;->hz:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/LocationClient;->hP:J

    goto :goto_1
.end method

.method static synthetic byte(Lcom/baidu/location/LocationClient;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bK()V

    return-void
.end method

.method static synthetic byte(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient;->i(Landroid/os/Message;)V

    return-void
.end method

.method private byte(Z)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hk:Lcom/baidu/location/BDErrorReport;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hk:Lcom/baidu/location/BDErrorReport;

    invoke-virtual {v0, p1}, Lcom/baidu/location/BDErrorReport;->onReportResult(Z)V

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hk:Lcom/baidu/location/BDErrorReport;

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/LocationClient;->hr:J

    return-void
.end method

.method static synthetic case(Lcom/baidu/location/LocationClient;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bM()V

    return-void
.end method

.method private case(I)Z
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/baidu/location/LocationClient;->hM:Z

    #v1=(Boolean);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);
    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    invoke-static {v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v2=(Reference);
    invoke-virtual {v2, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :catch_0
    #v0=(Null);v2=(Conflicted);
    move-exception v1

    goto :goto_0
.end method

.method static synthetic char(Lcom/baidu/location/LocationClient;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bI()V

    return-void
.end method

.method static synthetic do(Lcom/baidu/location/LocationClient;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hj:Ljava/lang/Object;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic do(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient;->n(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic do(Lcom/baidu/location/LocationClient;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/LocationClient;->hM:Z

    return p1
.end method

.method static synthetic else(Lcom/baidu/location/LocationClient;)Landroid/os/Messenger;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic for(Lcom/baidu/location/LocationClient;)Lcom/baidu/location/LocationClient$a;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic for(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient;->o(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic for(Lcom/baidu/location/LocationClient;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient;->byte(Z)V

    return-void
.end method

.method static synthetic goto(Lcom/baidu/location/LocationClient;)Lcom/baidu/location/LocationClientOption;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    return-object v0
.end method

.method private i(Landroid/os/Message;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/BDNotifyListener;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hp:Lcom/baidu/location/u;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/location/u;->do(Lcom/baidu/location/BDNotifyListener;)I

    goto :goto_0
.end method

.method static synthetic if(Lcom/baidu/location/LocationClient;Landroid/os/Messenger;)Landroid/os/Messenger;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    return-object p1
.end method

.method private if(Landroid/os/Message;I)V
    .locals 2

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    const-class v1, Lcom/baidu/location/BDLocation;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "locStr"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/BDLocation;

    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x3d

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/LocationClient;->hG:J

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    invoke-direct {p0, p2}, Lcom/baidu/location/LocationClient;->byte(I)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/LocationClient;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bL()V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient;->j(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/LocationClient;Landroid/os/Message;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/baidu/location/LocationClient;->if(Landroid/os/Message;I)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/LocationClient;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/LocationClient;->hB:Z

    return p1
.end method

.method static synthetic int(Lcom/baidu/location/LocationClient;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bJ()V

    return-void
.end method

.method static synthetic int(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient;->k(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic int(Lcom/baidu/location/LocationClient;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/LocationClient;->hf:Z

    return p1
.end method

.method private j(Landroid/os/Message;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/BDLocationListener;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private k(Landroid/os/Message;)V
    .locals 6

    const/4 v3, 0x1

    #v3=(One);
    if-eqz p1, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(One);v4=(Uninit);v5=(Uninit);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/LocationClientOption;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/location/LocationClientOption;->equals(Lcom/baidu/location/LocationClientOption;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v1=(Reference);
    iget v1, v1, Lcom/baidu/location/LocationClientOption;->int:I

    #v1=(Integer);
    iget v2, v0, Lcom/baidu/location/LocationClientOption;->int:I

    #v2=(Integer);
    if-eq v1, v2, :cond_5

    :try_start_0
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hj:Ljava/lang/Object;

    #v2=(Reference);
    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-boolean v1, p0, Lcom/baidu/location/LocationClient;->hB:Z

    #v1=(Boolean);
    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v1=(Reference);
    iget-object v3, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    #v3=(Reference);
    invoke-virtual {v1, v3}, Lcom/baidu/location/LocationClient$a;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v1, 0x0

    #v1=(Null);
    iput-boolean v1, p0, Lcom/baidu/location/LocationClient;->hB:Z

    :cond_2
    #v1=(Boolean);v3=(Conflicted);
    iget v1, v0, Lcom/baidu/location/LocationClientOption;->int:I

    #v1=(Integer);
    const/16 v3, 0x3e8

    #v3=(PosShort);
    if-lt v1, v3, :cond_4

    iget-boolean v1, p0, Lcom/baidu/location/LocationClient;->hB:Z

    #v1=(Boolean);
    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    #v1=(Reference);
    if-nez v1, :cond_3

    new-instance v1, Lcom/baidu/location/LocationClient$b;

    #v1=(UninitRef);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-direct {v1, p0, v3}, Lcom/baidu/location/LocationClient$b;-><init>(Lcom/baidu/location/LocationClient;Lcom/baidu/location/LocationClient$1;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    :cond_3
    #v3=(PosShort);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    iget-object v3, p0, Lcom/baidu/location/LocationClient;->hm:Lcom/baidu/location/LocationClient$b;

    #v3=(Reference);
    iget v4, v0, Lcom/baidu/location/LocationClientOption;->int:I

    #v4=(Integer);
    int-to-long v4, v4

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v1, v3, v4, v5}, Lcom/baidu/location/LocationClient$a;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Lcom/baidu/location/LocationClient;->hB:Z

    :cond_4
    #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);
    new-instance v1, Lcom/baidu/location/LocationClientOption;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Lcom/baidu/location/LocationClientOption;-><init>(Lcom/baidu/location/LocationClientOption;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0xf

    :try_start_2
    #v1=(PosByte);
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    #v1=(Reference);
    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bG()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    #v1=(Conflicted);
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catchall_0
    #v2=(Reference);
    move-exception v1

    :try_start_3
    #v1=(Reference);
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    #v1=(Conflicted);v2=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_1
.end method

.method private l(Landroid/os/Message;)V
    .locals 3

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    const-class v1, Lcom/baidu/location/BDLocation;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "locStr"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/BDLocation;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hx:Lcom/baidu/location/BDLocationListener;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    invoke-virtual {v1}, Lcom/baidu/location/LocationClientOption;->isDisableCache()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/baidu/location/BDLocation;->getLocType()I

    move-result v1

    #v1=(Integer);
    const/16 v2, 0x41

    #v2=(PosByte);
    if-ne v1, v2, :cond_1

    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hx:Lcom/baidu/location/BDLocationListener;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/location/BDLocationListener;->onReceiveLocation(Lcom/baidu/location/BDLocation;)V

    goto :goto_0
.end method

.method static synthetic long(Lcom/baidu/location/LocationClient;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method private m(Landroid/os/Message;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/BDNotifyListener;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hp:Lcom/baidu/location/u;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/location/u;->for(Lcom/baidu/location/BDNotifyListener;)I

    goto :goto_0
.end method

.method private n(Landroid/os/Message;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/BDLocationListener;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    #v1=(Reference);
    if-nez v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    :cond_2
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method static synthetic new(Lcom/baidu/location/LocationClient;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bH()V

    return-void
.end method

.method static synthetic new(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient;->l(Landroid/os/Message;)V

    return-void
.end method

.method private o(Landroid/os/Message;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/BDLocationListener;

    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hx:Lcom/baidu/location/BDLocationListener;

    goto :goto_0
.end method

.method static synthetic try(Lcom/baidu/location/LocationClient;)Landroid/os/Messenger;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic try(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient;->m(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic void(Lcom/baidu/location/LocationClient;)Landroid/os/Bundle;
    .locals 1

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bG()Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public cancleError()V
    .locals 1

    const/16 v0, 0xca

    #v0=(PosShort);
    invoke-direct {p0, v0}, Lcom/baidu/location/LocationClient;->case(I)Z

    return-void
.end method

.method public getLastKnownLocation()Lcom/baidu/location/BDLocation;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hU:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    return-object v0
.end method

.method public getLocOption()Lcom/baidu/location/LocationClientOption;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "4.0"

    #v0=(Reference);
    return-object v0
.end method

.method public isStarted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/LocationClient;->hM:Z

    #v0=(Boolean);
    return v0
.end method

.method public notifyError()Z
    .locals 1

    const/16 v0, 0xc9

    #v0=(PosShort);
    invoke-direct {p0, v0}, Lcom/baidu/location/LocationClient;->case(I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public registerLocationListener(Lcom/baidu/location/BDLocationListener;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/4 v1, 0x5

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public registerNotify(Lcom/baidu/location/BDNotifyListener;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/16 v1, 0x9

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public registerNotifyLocationListener(Lcom/baidu/location/BDLocationListener;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/16 v1, 0x8

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public removeNotifyEvent(Lcom/baidu/location/BDNotifyListener;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/16 v1, 0xa

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public reportErrorWithInfo(Lcom/baidu/location/BDErrorReport;)I
    .locals 5

    const/4 v0, 0x1

    #v0=(One);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/baidu/location/LocationClient;->hM:Z

    #v1=(Boolean);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(PosByte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    if-nez p1, :cond_2

    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_0

    :cond_2
    #v0=(One);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iget-wide v3, p0, Lcom/baidu/location/LocationClient;->hr:J

    #v3=(LongLo);v4=(LongHi);
    sub-long/2addr v1, v3

    const-wide/32 v3, 0xc350

    cmp-long v1, v1, v3

    #v1=(Byte);
    if-gez v1, :cond_3

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hk:Lcom/baidu/location/BDErrorReport;

    #v1=(Reference);
    if-eqz v1, :cond_3

    const/4 v0, 0x4

    #v0=(PosByte);
    goto :goto_0

    :cond_3
    #v0=(One);v1=(Conflicted);
    invoke-virtual {p1}, Lcom/baidu/location/BDErrorReport;->getErrorInfo()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    if-nez v1, :cond_4

    const/4 v0, 0x3

    #v0=(PosByte);
    goto :goto_0

    :cond_4
    #v0=(One);
    const/4 v2, 0x0

    #v2=(Null);
    const/16 v3, 0xcb

    :try_start_0
    #v3=(PosShort);
    invoke-static {v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v2

    #v2=(Reference);
    iget-object v3, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    #v3=(Reference);
    iput-object v3, v2, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-virtual {v2, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    invoke-virtual {v1, v2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p1, p0, Lcom/baidu/location/LocationClient;->hk:Lcom/baidu/location/BDErrorReport;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/LocationClient;->hr:J

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :catch_0
    #v0=(One);v1=(Reference);v3=(Conflicted);
    move-exception v1

    goto :goto_0
.end method

.method public requestLocation()I
    .locals 4

    const/4 v0, 0x1

    #v0=(One);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(PosByte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v1=(Reference);v2=(Uninit);v3=(Uninit);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v1, v0, :cond_3

    :cond_2
    #v1=(Conflicted);
    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_0

    :cond_3
    #v0=(One);v1=(Integer);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/LocationClient;->hN:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_4

    const/4 v0, 0x6

    #v0=(PosByte);
    goto :goto_0

    :cond_4
    #v0=(Byte);
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/4 v1, 0x4

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public requestNotifyLocation()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/16 v1, 0xb

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public requestOfflineLocation()I
    .locals 2

    const/4 v0, 0x1

    #v0=(One);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(PosByte);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v1=(Reference);
    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v1, v0, :cond_3

    :cond_2
    #v1=(Conflicted);
    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_0

    :cond_3
    #v0=(One);v1=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/16 v1, 0xc

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public requestPoi()I
    .locals 6

    const/4 v0, 0x7

    #v0=(PosByte);
    const/4 v1, 0x1

    #v1=(One);
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    if-nez v2, :cond_2

    :cond_0
    move v0, v1

    :cond_1
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v0

    :cond_2
    #v1=(One);v2=(Reference);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hZ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    if-ge v2, v1, :cond_4

    :cond_3
    #v2=(Conflicted);
    const/4 v0, 0x2

    goto :goto_0

    :cond_4
    #v2=(Integer);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    iget-wide v4, p0, Lcom/baidu/location/LocationClient;->ho:J

    #v4=(LongLo);v5=(LongHi);
    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1770

    cmp-long v2, v2, v4

    #v2=(Byte);
    if-gez v2, :cond_5

    const/4 v0, 0x6

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hH:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/location/LocationClientOption;->a:I

    #v2=(Integer);
    if-lt v2, v1, :cond_1

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setAK(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, "[&=]"

    #v0=(Reference);
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iput-object p1, p0, Lcom/baidu/location/LocationClient;->hR:Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    #v0=(Reference);
    sget-object v1, Lcom/baidu/location/LocationClient;->PREF_FILE_NAME:Ljava/lang/String;

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hE:Landroid/content/Context;

    #v2=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    sget-object v1, Lcom/baidu/location/LocationClient;->PREF_KEY_NAME:Ljava/lang/String;

    iget-object v2, p0, Lcom/baidu/location/LocationClient;->hR:Ljava/lang/String;

    #v2=(Reference);
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public setForBaiduMap(Z)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClient;->hs:Ljava/lang/Boolean;

    return-void
.end method

.method public setLocOption(Lcom/baidu/location/LocationClientOption;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Lcom/baidu/location/LocationClientOption;

    #p1=(UninitRef);
    invoke-direct {p1}, Lcom/baidu/location/LocationClientOption;-><init>()V

    :cond_0
    #p1=(Reference);
    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public start()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public stop()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/LocationClient;->bJ()V

    return-void
.end method

.method public unRegisterLocationListener(Lcom/baidu/location/BDLocationListener;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hh:Lcom/baidu/location/LocationClient$a;

    #v0=(Reference);
    const/4 v1, 0x6

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/LocationClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public updateLocation(Landroid/location/Location;)Z
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/LocationClient;->hD:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Reference);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0x39

    :try_start_0
    #v1=(PosByte);
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    #v0=(Reference);
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/baidu/location/LocationClient;->hF:Landroid/os/Messenger;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    #v1=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :catch_0
    #v0=(Reference);
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

*/}
