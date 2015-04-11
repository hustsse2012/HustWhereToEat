package com.baidu.location; class GeofenceClient {/*

.class public Lcom/baidu/location/GeofenceClient;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;,
        Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;,
        Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;,
        Lcom/baidu/location/GeofenceClient$a;
    }
.end annotation


# static fields
.field public static final BUNDLE_FOR_GEOFENCE_ID:Ljava/lang/String; = "geofence_id"

.field private static final ba:I = 0x1


# instance fields
.field private a6:Landroid/content/Context;

.field private a7:Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;

.field private a8:Landroid/content/ServiceConnection;

.field private a9:Landroid/os/Messenger;

.field private bb:Landroid/os/Messenger;

.field private bc:Z

.field private bd:Lcom/baidu/location/GeofenceClient$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/GeofenceClient;->bc:Z

    iput-object v1, p0, Lcom/baidu/location/GeofenceClient;->bb:Landroid/os/Messenger;

    new-instance v0, Lcom/baidu/location/GeofenceClient$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0, v1}, Lcom/baidu/location/GeofenceClient$a;-><init>(Lcom/baidu/location/GeofenceClient;Lcom/baidu/location/GeofenceClient$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/GeofenceClient;->bd:Lcom/baidu/location/GeofenceClient$a;

    new-instance v0, Landroid/os/Messenger;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/GeofenceClient;->bd:Lcom/baidu/location/GeofenceClient$a;

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/GeofenceClient;->a9:Landroid/os/Messenger;

    new-instance v0, Lcom/baidu/location/GeofenceClient$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/GeofenceClient$1;-><init>(Lcom/baidu/location/GeofenceClient;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/GeofenceClient;->a8:Landroid/content/ServiceConnection;

    iput-object p1, p0, Lcom/baidu/location/GeofenceClient;->a6:Landroid/content/Context;

    return-void
.end method

.method private byte()V
    .locals 4

    iget-boolean v0, p0, Lcom/baidu/location/GeofenceClient;->bc:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    iget-object v1, p0, Lcom/baidu/location/GeofenceClient;->a6:Landroid/content/Context;

    #v1=(Reference);
    const-class v2, Lcom/baidu/location/f;

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :try_start_0
    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/GeofenceClient;->a6:Landroid/content/Context;

    iget-object v2, p0, Lcom/baidu/location/GeofenceClient;->a8:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v3=(Conflicted);
    move-exception v0

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/GeofenceClient;->bc:Z

    goto :goto_0
.end method

.method private case()V
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0xcf

    :try_start_0
    #v1=(PosShort);
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/GeofenceClient;->a9:Landroid/os/Messenger;

    #v1=(Reference);
    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/baidu/location/GeofenceClient;->bb:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic do(Lcom/baidu/location/GeofenceClient;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/GeofenceClient;->byte()V

    return-void
.end method

.method private for(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient;->a7:Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient;->a7:Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;

    invoke-interface {v0, p1}, Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;->onGeofenceTrigger(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic if(Lcom/baidu/location/GeofenceClient;)Landroid/os/Messenger;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient;->bb:Landroid/os/Messenger;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic if(Lcom/baidu/location/GeofenceClient;Landroid/os/Messenger;)Landroid/os/Messenger;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/GeofenceClient;->bb:Landroid/os/Messenger;

    return-object p1
.end method

.method static synthetic if(Lcom/baidu/location/GeofenceClient;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/GeofenceClient;->for(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic if(Lcom/baidu/location/GeofenceClient;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/GeofenceClient;->bc:Z

    return p1
.end method


# virtual methods
.method public addBDGeofence(Lcom/baidu/location/BDGeofence;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    const-string v0, "geofence is null"

    #v0=(Reference);
    invoke-static {p1, v0}, Lcom/baidu/location/ae;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/baidu/location/ah;

    #v0=(Boolean);
    const-string v1, "BDGeofence must be created using BDGeofence.Builder"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/ae;->if(ZLjava/lang/Object;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/GeofenceClient;->a6:Landroid/content/Context;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/al;->for(Landroid/content/Context;)Lcom/baidu/location/al;

    move-result-object v0

    check-cast p1, Lcom/baidu/location/ah;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/location/al;->if(Lcom/baidu/location/ah;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V

    return-void
.end method

.method public isStarted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/GeofenceClient;->bc:Z

    #v0=(Boolean);
    return v0
.end method

.method public registerGeofenceTriggerListener(Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient;->a7:Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;

    #v0=(Reference);
    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/baidu/location/GeofenceClient;->a7:Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;

    :cond_0
    return-void
.end method

.method public removeBDGeofences(Ljava/util/List;Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient;->a6:Landroid/content/Context;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/al;->for(Landroid/content/Context;)Lcom/baidu/location/al;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/baidu/location/al;->if(Ljava/util/List;Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;)V

    return-void
.end method

.method public start()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient;->a7:Lcom/baidu/location/GeofenceClient$OnGeofenceTriggerListener;

    #v0=(Reference);
    const-string v1, "OnGeofenceTriggerListener not register!"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/ae;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient;->bd:Lcom/baidu/location/GeofenceClient$a;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Lcom/baidu/location/GeofenceClient$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public startGeofenceScann()V
    .locals 2

    iget-boolean v0, p0, Lcom/baidu/location/GeofenceClient;->bc:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0xce

    :try_start_0
    #v1=(PosShort);
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/GeofenceClient;->a9:Landroid/os/Messenger;

    #v1=(Reference);
    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/baidu/location/GeofenceClient;->bb:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :catch_0
    #v0=(Reference);
    move-exception v0

    goto :goto_0
.end method

.method public stop()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/GeofenceClient;->case()V

    return-void
.end method

*/}
