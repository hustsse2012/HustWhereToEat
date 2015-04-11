package com.baidu.mapapi.cloud; class a {/*

.class Lcom/baidu/mapapi/cloud/a;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/cloud/CloudManager;


# direct methods
.method constructor <init>(Lcom/baidu/mapapi/cloud/CloudManager;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/cloud/a;->a:Lcom/baidu/mapapi/cloud/CloudManager;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    const/4 v5, -0x1

    #v5=(Byte);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {}, Lcom/baidu/mapapi/cloud/CloudManager;->a()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "msg.what:"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " msg.arg1:"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " msg.arg2:"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg2:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    const/high16 v2, 0x2

    #v2=(Integer);
    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/a;->a:Lcom/baidu/mapapi/cloud/CloudManager;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/CloudManager;)Lcom/baidu/mapapi/cloud/CloudListener;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Reference);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);v1=(Null);v3=(Integer);v4=(Uninit);
    iget v0, p1, Landroid/os/Message;->arg1:I

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/a;->a:Lcom/baidu/mapapi/cloud/CloudManager;

    #v0=(Reference);
    const/16 v2, 0x2711

    #v2=(PosShort);
    invoke-static {v0, v2}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/CloudManager;I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-static {}, Lcom/baidu/mapapi/cloud/CloudManager;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "result: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/baidu/mapapi/cloud/CloudSearchResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/cloud/CloudSearchResult;-><init>()V

    :try_start_0
    #v0=(Reference);
    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/cloud/CloudSearchResult;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-object v1, p0, Lcom/baidu/mapapi/cloud/a;->a:Lcom/baidu/mapapi/cloud/CloudManager;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/CloudManager;)Lcom/baidu/mapapi/cloud/CloudListener;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->arg2:I

    #v2=(Integer);
    invoke-interface {v1, v0, v2}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetSearchResult(Lcom/baidu/mapapi/cloud/CloudSearchResult;I)V

    goto :goto_0

    :catch_0
    #v1=(Null);v2=(Reference);v4=(Reference);
    move-exception v2

    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/a;->a:Lcom/baidu/mapapi/cloud/CloudManager;

    invoke-static {v2}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/CloudManager;)Lcom/baidu/mapapi/cloud/CloudListener;

    move-result-object v2

    invoke-interface {v2, v1, v5}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetSearchResult(Lcom/baidu/mapapi/cloud/CloudSearchResult;I)V

    goto :goto_1

    :pswitch_1
    #v0=(Integer);v2=(Integer);v3=(Integer);v4=(Uninit);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/a;->a:Lcom/baidu/mapapi/cloud/CloudManager;

    #v0=(Reference);
    const/16 v2, 0x2712

    #v2=(PosShort);
    invoke-static {v0, v2}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/CloudManager;I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-static {}, Lcom/baidu/mapapi/cloud/CloudManager;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "result: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/baidu/mapapi/cloud/DetailSearchResult;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/cloud/DetailSearchResult;-><init>()V

    :try_start_1
    #v0=(Reference);
    new-instance v3, Lorg/json/JSONObject;

    #v3=(UninitRef);
    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/cloud/DetailSearchResult;->a(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v0

    :cond_2
    :goto_2
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/cloud/a;->a:Lcom/baidu/mapapi/cloud/CloudManager;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/CloudManager;)Lcom/baidu/mapapi/cloud/CloudListener;

    move-result-object v0

    iget v2, p1, Landroid/os/Message;->arg2:I

    #v2=(Integer);
    invoke-interface {v0, v1, v2}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetDetailSearchResult(Lcom/baidu/mapapi/cloud/DetailSearchResult;I)V

    goto/16 :goto_0

    :catch_1
    #v1=(Null);v2=(Reference);v4=(Reference);
    move-exception v2

    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/a;->a:Lcom/baidu/mapapi/cloud/CloudManager;

    invoke-static {v2}, Lcom/baidu/mapapi/cloud/CloudManager;->a(Lcom/baidu/mapapi/cloud/CloudManager;)Lcom/baidu/mapapi/cloud/CloudListener;

    move-result-object v2

    invoke-interface {v2, v1, v5}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetDetailSearchResult(Lcom/baidu/mapapi/cloud/DetailSearchResult;I)V

    move-object v1, v0

    #v1=(Reference);
    goto :goto_2

    :cond_3
    #v0=(Integer);v1=(Null);v2=(Integer);v3=(Integer);v4=(Uninit);
    move-object v0, v1

    #v0=(Null);
    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x2711
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

*/}
