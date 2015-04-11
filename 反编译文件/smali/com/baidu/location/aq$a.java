package com.baidu.location; class aq$a {/*

.class Lcom/baidu/location/aq$a;
.super Lcom/baidu/location/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/aq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# static fields
.field private static final dp:Ljava/lang/String; = "fence"

.field private static final dr:Ljava/lang/String; = "bloc"

.field private static final ds:Ljava/lang/String; = "ext"

.field private static final dt:Ljava/lang/String; = "error"

.field private static final dv:Ljava/lang/String; = "in"


# instance fields
.field final synthetic dn:Lcom/baidu/location/aq;

.field private dq:Lcom/baidu/location/ah;

.field private final du:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/baidu/location/aq;Lcom/baidu/location/ah;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/baidu/location/aq$a;->dn:Lcom/baidu/location/aq;

    invoke-direct {p0}, Lcom/baidu/location/o;-><init>()V

    #p0=(Reference);
    iput-object p2, p0, Lcom/baidu/location/aq$a;->dq:Lcom/baidu/location/ah;

    iput-object p3, p0, Lcom/baidu/location/aq$a;->du:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aq$a;->cP:Ljava/util/List;

    return-void
.end method


# virtual methods
.method V()V
    .locals 8

    const/4 v5, 0x2

    #v5=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    #v6=(Null);
    const-string v0, "http://loc.map.baidu.com/fence"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/aq$a;->cL:Ljava/lang/String;

    new-instance v0, Ljava/text/DecimalFormat;

    #v0=(UninitRef);
    const-string v1, "0.00000"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "&x=%s&y=%s&r=%s&coord=%s&type=%s&cu=%s&fence_type=%s&wf_on=%s"

    const/16 v2, 0x8

    #v2=(PosByte);
    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    iget-object v3, p0, Lcom/baidu/location/aq$a;->dq:Lcom/baidu/location/ah;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/ah;->a()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-virtual {v0, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/baidu/location/aq$a;->dq:Lcom/baidu/location/ah;

    invoke-virtual {v3}, Lcom/baidu/location/ah;->byte()D

    move-result-wide v3

    #v3=(DoubleLo);
    invoke-virtual {v0, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v7

    iget-object v0, p0, Lcom/baidu/location/aq$a;->dq:Lcom/baidu/location/ah;

    invoke-virtual {v0}, Lcom/baidu/location/ah;->do()F

    move-result v0

    #v0=(Float);
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v2, v5

    const/4 v0, 0x3

    #v0=(PosByte);
    iget-object v3, p0, Lcom/baidu/location/aq$a;->dq:Lcom/baidu/location/ah;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/ah;->int()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x4

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/location/al;->do(Landroid/content/Context;)I

    move-result v3

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v0

    const/4 v0, 0x5

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/location/b/a/a;->if(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x6

    iget-object v3, p0, Lcom/baidu/location/aq$a;->dq:Lcom/baidu/location/ah;

    invoke-virtual {v3}, Lcom/baidu/location/ah;->case()I

    move-result v3

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v0

    const/4 v3, 0x7

    #v3=(PosByte);
    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/ai;->a5()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const-string v0, "1"

    :goto_0
    #v0=(Reference);
    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/aq$a;->cP:Ljava/util/List;

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    #v2=(UninitRef);
    const-string v3, "fence"

    #v3=(Reference);
    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v2=(Reference);
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/baidu/location/aq$a;->cP:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    #v1=(UninitRef);
    const-string v2, "bloc"

    iget-object v3, p0, Lcom/baidu/location/aq$a;->du:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v1=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/baidu/location/aq$a;->cP:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    #v1=(UninitRef);
    const-string v2, "ext"

    const-string v3, "&ki=%s&sn=%s"

    new-array v4, v5, [Ljava/lang/Object;

    #v4=(Reference);
    invoke-static {}, Lcom/baidu/location/ap;->bD()Lcom/baidu/location/ap;

    sget-object v5, Lcom/baidu/location/ap;->g9:Ljava/lang/String;

    #v5=(Reference);
    aput-object v5, v4, v6

    invoke-static {}, Lcom/baidu/location/ap;->bD()Lcom/baidu/location/ap;

    sget-object v5, Lcom/baidu/location/ap;->g8:Ljava/lang/String;

    aput-object v5, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v1=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    #v0=(Boolean);v3=(PosByte);v4=(DoubleHi);v5=(PosByte);
    const-string v0, "0"

    #v0=(Reference);
    goto :goto_0
.end method

.method public aa()V
    .locals 0

    invoke-virtual {p0}, Lcom/baidu/location/aq$a;->R()V

    return-void
.end method

.method if(Z)V
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/aq$a;->dn:Lcom/baidu/location/aq;

    #v1=(Reference);
    invoke-static {v1, v0}, Lcom/baidu/location/aq;->if(Lcom/baidu/location/aq;Z)Z

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/baidu/location/aq$a;->cM:Lorg/apache/http/HttpEntity;

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, p0, Lcom/baidu/location/aq$a;->cM:Lorg/apache/http/HttpEntity;

    const-string v2, "UTF-8"

    #v2=(Reference);
    invoke-static {v1, v2}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    if-eqz v2, :cond_1

    const-string v1, "error"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    const-string v3, "in"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    const-string v0, "in"

    #v0=(Reference);
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_0
    #v0=(Integer);
    if-nez v1, :cond_1

    const/4 v1, 0x1

    #v1=(One);
    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/baidu/location/aq$a;->dn:Lcom/baidu/location/aq;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Lcom/baidu/location/aq;->do(Lcom/baidu/location/aq;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/aq$a;->dn:Lcom/baidu/location/aq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/baidu/location/aq;->if(Lcom/baidu/location/aq;Lcom/baidu/location/ai$b;)Lcom/baidu/location/ai$b;

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/location/al;->for(Landroid/content/Context;)Lcom/baidu/location/al;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/aq$a;->dq:Lcom/baidu/location/ah;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/location/al;->if(Lcom/baidu/location/ah;)V

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/location/al;->for(Landroid/content/Context;)Lcom/baidu/location/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/al;->bq()V

    iget-object v0, p0, Lcom/baidu/location/aq$a;->dn:Lcom/baidu/location/aq;

    invoke-static {v0}, Lcom/baidu/location/aq;->new(Lcom/baidu/location/aq;)Landroid/os/Messenger;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    const/16 v1, 0xd0

    #v1=(PosShort);
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    const-string v2, "geofence_id"

    iget-object v3, p0, Lcom/baidu/location/aq$a;->dq:Lcom/baidu/location/ah;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/ah;->getGeofenceId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object v1, p0, Lcom/baidu/location/aq$a;->dn:Lcom/baidu/location/aq;

    invoke-static {v1}, Lcom/baidu/location/aq;->new(Lcom/baidu/location/aq;)Landroid/os/Messenger;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

*/}
