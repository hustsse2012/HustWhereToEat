package com.baidu.location; class s$1 {/*

.class Lcom/baidu/location/s$1;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/baidu/location/s;


# direct methods
.method constructor <init>(Lcom/baidu/location/s;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/s$1;->a:Lcom/baidu/location/s;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    sget-boolean v0, Lcom/baidu/location/f;->isServing:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v1, p0, Lcom/baidu/location/s$1;->a:Lcom/baidu/location/s;

    #v1=(Reference);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/location/Location;

    invoke-static {v1, v0}, Lcom/baidu/location/s;->do(Lcom/baidu/location/s;Landroid/location/Location;)V

    goto :goto_0

    :pswitch_1
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/s$1;->a:Lcom/baidu/location/s;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/s;->for(Lcom/baidu/location/s;)Lcom/baidu/location/s$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/s$1;->a:Lcom/baidu/location/s;

    invoke-static {v0}, Lcom/baidu/location/s;->for(Lcom/baidu/location/s;)Lcom/baidu/location/s$a;

    move-result-object v1

    #v1=(Reference);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/baidu/location/s$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    #v0=(Integer);v1=(Uninit);
    iget-object v1, p0, Lcom/baidu/location/s$1;->a:Lcom/baidu/location/s;

    #v1=(Reference);
    const-string v2, "&og=1"

    #v2=(Reference);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/location/Location;

    invoke-static {v1, v2, v0}, Lcom/baidu/location/s;->if(Lcom/baidu/location/s;Ljava/lang/String;Landroid/location/Location;)V

    goto :goto_0

    :pswitch_3
    #v0=(Integer);v1=(Uninit);v2=(Uninit);
    iget-object v1, p0, Lcom/baidu/location/s$1;->a:Lcom/baidu/location/s;

    #v1=(Reference);
    const-string v2, "&og=2"

    #v2=(Reference);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/location/Location;

    invoke-static {v1, v2, v0}, Lcom/baidu/location/s;->if(Lcom/baidu/location/s;Ljava/lang/String;Landroid/location/Location;)V

    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

*/}
