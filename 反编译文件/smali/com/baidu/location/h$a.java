package com.baidu.location; class h$a {/*

.class public Lcom/baidu/location/h$a;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/h;


# direct methods
.method public constructor <init>(Lcom/baidu/location/h;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "com.baidu.locTest.LocationServer"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->if(Lcom/baidu/location/h;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    :try_start_0
    #v0=(Reference);v1=(Boolean);v2=(Uninit);
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const-string v0, "status"

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    #v0=(Integer);
    const-string v1, "plugged"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    #v1=(Integer);
    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    #v0=(Reference);
    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/baidu/location/h;->if(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;

    :goto_1
    #v2=(Reference);
    packed-switch v1, :pswitch_data_1

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    const-string v1, "6"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/h;->if(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    invoke-static {v0, v3}, Lcom/baidu/location/h;->if(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :pswitch_1
    :try_start_1
    #v0=(Integer);v1=(Integer);v2=(Null);
    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    #v0=(Reference);
    const-string v2, "4"

    #v2=(Reference);
    invoke-static {v0, v2}, Lcom/baidu/location/h;->if(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :pswitch_2
    #v0=(Integer);v2=(Null);
    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    #v0=(Reference);
    const-string v2, "3"

    #v2=(Reference);
    invoke-static {v0, v2}, Lcom/baidu/location/h;->if(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :pswitch_3
    iget-object v0, p0, Lcom/baidu/location/h$a;->a:Lcom/baidu/location/h;

    const-string v1, "5"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/h;->if(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

*/}
