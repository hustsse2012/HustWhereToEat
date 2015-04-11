package com.baidu.mapapi.search; class f {/*

.class final Lcom/baidu/mapapi/search/f;
.super Landroid/os/Handler;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :pswitch_0
    #v0=(Integer);v1=(Uninit);v2=(Uninit);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/search/j;

    sget-object v1, Lcom/baidu/mapapi/search/PlaceCaterActivity;->c:Landroid/widget/ImageView;

    #v1=(Reference);
    if-eqz v1, :cond_0

    sget-object v1, Lcom/baidu/mapapi/search/PlaceCaterActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lcom/baidu/mapapi/search/j;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :pswitch_1
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Lcom/baidu/mapapi/search/j;

    sget-object v1, Lcom/baidu/mapapi/search/PlaceCaterActivity;->q:Ljava/util/Hashtable;

    #v1=(Reference);
    if-eqz v1, :cond_0

    sget-object v1, Lcom/baidu/mapapi/search/PlaceCaterActivity;->q:Ljava/util/Hashtable;

    iget v2, p1, Landroid/os/Message;->arg1:I

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/search/j;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

*/}
