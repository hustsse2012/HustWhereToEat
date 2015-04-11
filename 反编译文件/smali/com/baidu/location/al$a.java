package com.baidu.location; class al$a {/*

.class Lcom/baidu/location/al$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/al;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# static fields
.field public static final do:I = 0x2

.field public static final for:I = 0x3

.field public static final if:I


# instance fields
.field final synthetic a:Lcom/baidu/location/al;


# direct methods
.method public constructor <init>(Lcom/baidu/location/al;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/al$a;->a:Lcom/baidu/location/al;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    const/4 v1, 0x1

    #v1=(One);
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v2, p1, Landroid/os/Message;->what:I

    #v2=(Integer);
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    #v3=(Reference);
    packed-switch v2, :pswitch_data_0

    :goto_0
    :pswitch_0
    #v0=(Reference);v1=(Conflicted);
    return-void

    :pswitch_1
    #v0=(Null);v1=(One);
    if-eqz v3, :cond_1

    const-string v0, "status_code"

    #v0=(Reference);
    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    #v1=(Integer);
    const-string v0, "geofence_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move v2, v1

    move-object v1, v0

    :goto_1
    #v1=(Reference);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;

    iget-object v3, p0, Lcom/baidu/location/al$a;->a:Lcom/baidu/location/al;

    invoke-static {v3, v2, v1, v0}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;ILjava/lang/String;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V

    goto :goto_0

    :pswitch_2
    #v0=(Null);v1=(One);
    if-eqz v3, :cond_0

    const-string v0, "status_code"

    #v0=(Reference);
    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    #v1=(Integer);
    const-string v0, "geofence_ids"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    move v2, v1

    move-object v1, v0

    :goto_2
    #v1=(Reference);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;

    iget-object v3, p0, Lcom/baidu/location/al$a;->a:Lcom/baidu/location/al;

    invoke-static {v3, v2, v1, v0}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;I[Ljava/lang/String;Lcom/baidu/location/GeofenceClient$OnRemoveBDGeofencesResultListener;)V

    goto :goto_0

    :pswitch_3
    #v0=(Null);v1=(One);
    iget-object v0, p0, Lcom/baidu/location/al$a;->a:Lcom/baidu/location/al;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/al;->bq()V

    goto :goto_0

    :cond_0
    #v0=(Null);
    move v2, v1

    #v2=(One);
    move-object v1, v0

    #v1=(Null);
    goto :goto_2

    :cond_1
    #v1=(One);v2=(Integer);
    move v2, v1

    #v2=(One);
    move-object v1, v0

    #v1=(Null);
    goto :goto_1

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

*/}
