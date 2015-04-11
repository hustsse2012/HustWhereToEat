package com.baidu.location; class LocationClient$a {/*

.class Lcom/baidu/location/LocationClient$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/LocationClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/LocationClient;


# direct methods
.method private constructor <init>(Lcom/baidu/location/LocationClient;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/baidu/location/LocationClient;Lcom/baidu/location/LocationClient$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/LocationClient$a;-><init>(Lcom/baidu/location/LocationClient;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    const/4 v2, 0x1

    #v2=(One);
    const/4 v1, 0x0

    #v1=(Null);
    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(PosByte);
    return-void

    :sswitch_0
    #v0=(Integer);v1=(Null);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, p1}, Lcom/baidu/location/LocationClient;->int(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V

    goto :goto_0

    :sswitch_1
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, p1}, Lcom/baidu/location/LocationClient;->for(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V

    goto :goto_0

    :sswitch_2
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, p1}, Lcom/baidu/location/LocationClient;->do(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V

    goto :goto_0

    :sswitch_3
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, p1}, Lcom/baidu/location/LocationClient;->if(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V

    goto :goto_0

    :sswitch_4
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, p1}, Lcom/baidu/location/LocationClient;->byte(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V

    goto :goto_0

    :sswitch_5
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, p1}, Lcom/baidu/location/LocationClient;->try(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V

    goto :goto_0

    :sswitch_6
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/LocationClient;->char(Lcom/baidu/location/LocationClient;)V

    goto :goto_0

    :sswitch_7
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/LocationClient;->int(Lcom/baidu/location/LocationClient;)V

    goto :goto_0

    :sswitch_8
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/LocationClient;->byte(Lcom/baidu/location/LocationClient;)V

    goto :goto_0

    :sswitch_9
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/LocationClient;->case(Lcom/baidu/location/LocationClient;)V

    goto :goto_0

    :sswitch_a
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/LocationClient;->if(Lcom/baidu/location/LocationClient;)V

    goto :goto_0

    :sswitch_b
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/LocationClient;->new(Lcom/baidu/location/LocationClient;)V

    goto :goto_0

    :sswitch_c
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/LocationClient;->goto(Lcom/baidu/location/LocationClient;)Lcom/baidu/location/LocationClientOption;

    move-result-object v0

    iget-boolean v0, v0, Lcom/baidu/location/LocationClientOption;->void:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, v2}, Lcom/baidu/location/LocationClient;->int(Lcom/baidu/location/LocationClient;Z)Z

    goto :goto_0

    :sswitch_d
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/LocationClient;->goto(Lcom/baidu/location/LocationClient;)Lcom/baidu/location/LocationClientOption;

    move-result-object v0

    iget-boolean v0, v0, Lcom/baidu/location/LocationClientOption;->void:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/LocationClient;->int(Lcom/baidu/location/LocationClient;Z)Z

    goto :goto_0

    :sswitch_e
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    const/16 v1, 0x15

    #v1=(PosByte);
    invoke-static {v0, p1, v1}, Lcom/baidu/location/LocationClient;->if(Lcom/baidu/location/LocationClient;Landroid/os/Message;I)V

    goto :goto_0

    :sswitch_f
    #v0=(Integer);v1=(Null);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    const/16 v1, 0x1a

    #v1=(PosByte);
    invoke-static {v0, p1, v1}, Lcom/baidu/location/LocationClient;->if(Lcom/baidu/location/LocationClient;Landroid/os/Message;I)V

    goto :goto_0

    :sswitch_10
    #v0=(Integer);v1=(Null);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, p1}, Lcom/baidu/location/LocationClient;->new(Lcom/baidu/location/LocationClient;Landroid/os/Message;)V

    goto :goto_0

    :sswitch_11
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, v2}, Lcom/baidu/location/LocationClient;->for(Lcom/baidu/location/LocationClient;Z)V

    goto/16 :goto_0

    :sswitch_12
    #v0=(Integer);
    iget-object v0, p0, Lcom/baidu/location/LocationClient$a;->a:Lcom/baidu/location/LocationClient;

    #v0=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/LocationClient;->for(Lcom/baidu/location/LocationClient;Z)V

    goto/16 :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_6
        0x2 -> :sswitch_7
        0x3 -> :sswitch_0
        0x4 -> :sswitch_9
        0x5 -> :sswitch_2
        0x6 -> :sswitch_3
        0x7 -> :sswitch_b
        0x8 -> :sswitch_1
        0x9 -> :sswitch_4
        0xa -> :sswitch_5
        0xb -> :sswitch_8
        0xc -> :sswitch_a
        0x15 -> :sswitch_e
        0x1a -> :sswitch_f
        0x1b -> :sswitch_10
        0x36 -> :sswitch_c
        0x37 -> :sswitch_d
        0xcc -> :sswitch_12
        0xcd -> :sswitch_11
    .end sparse-switch
.end method

*/}
