package com.baidu.location; class GeofenceClient$1 {/*

.class Lcom/baidu/location/GeofenceClient$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/baidu/location/GeofenceClient;


# direct methods
.method constructor <init>(Lcom/baidu/location/GeofenceClient;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/GeofenceClient$1;->a:Lcom/baidu/location/GeofenceClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient$1;->a:Lcom/baidu/location/GeofenceClient;

    #v0=(Reference);
    new-instance v1, Landroid/os/Messenger;

    #v1=(UninitRef);
    invoke-direct {v1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/GeofenceClient;->if(Lcom/baidu/location/GeofenceClient;Landroid/os/Messenger;)Landroid/os/Messenger;

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient$1;->a:Lcom/baidu/location/GeofenceClient;

    invoke-static {v0}, Lcom/baidu/location/GeofenceClient;->if(Lcom/baidu/location/GeofenceClient;)Landroid/os/Messenger;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_0
    #v1=(Reference);
    iget-object v0, p0, Lcom/baidu/location/GeofenceClient$1;->a:Lcom/baidu/location/GeofenceClient;

    const/4 v1, 0x1

    #v1=(One);
    invoke-static {v0, v1}, Lcom/baidu/location/GeofenceClient;->if(Lcom/baidu/location/GeofenceClient;Z)Z

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient$1;->a:Lcom/baidu/location/GeofenceClient;

    invoke-virtual {v0}, Lcom/baidu/location/GeofenceClient;->startGeofenceScann()V

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient$1;->a:Lcom/baidu/location/GeofenceClient;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Lcom/baidu/location/GeofenceClient;->if(Lcom/baidu/location/GeofenceClient;Landroid/os/Messenger;)Landroid/os/Messenger;

    iget-object v0, p0, Lcom/baidu/location/GeofenceClient$1;->a:Lcom/baidu/location/GeofenceClient;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/baidu/location/GeofenceClient;->if(Lcom/baidu/location/GeofenceClient;Z)Z

    return-void
.end method

*/}
