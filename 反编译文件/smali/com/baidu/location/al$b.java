package com.baidu.location; class al$b {/*

.class Lcom/baidu/location/al$b;
.super Lcom/baidu/location/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/al;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# static fields
.field private static final dc:Ljava/lang/String; = "error"

.field private static final dd:I = -0x3

.field private static final de:Ljava/lang/String; = "ext"

.field private static final df:Ljava/lang/String; = "cl"

.field private static final dg:Ljava/lang/String; = "fence"

.field private static final dh:Ljava/lang/String; = "lac"

.field private static final dj:Ljava/lang/String; = "wf"

.field private static final dl:Ljava/lang/String; = "radius"


# instance fields
.field private db:Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;

.field final synthetic di:Lcom/baidu/location/al;

.field private dk:I

.field private final dm:Lcom/baidu/location/ah;


# direct methods
.method public constructor <init>(Lcom/baidu/location/al;Lcom/baidu/location/ah;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V
    .locals 1

    iput-object p1, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    invoke-direct {p0}, Lcom/baidu/location/o;-><init>()V

    #p0=(Reference);
    iput-object p2, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    iput-object p3, p0, Lcom/baidu/location/al$b;->db:Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/al$b;->cP:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public V()V
    .locals 8

    const/4 v5, 0x2

    #v5=(PosByte);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    #v6=(Null);
    const-string v0, "http://loc.map.baidu.com/fence"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/al$b;->cL:Ljava/lang/String;

    new-instance v0, Ljava/text/DecimalFormat;

    #v0=(UninitRef);
    const-string v1, "0.00000"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    const-string v1, "&x=%s&y=%s&r=%s&coord=%s&type=%s&cu=%s"

    const/4 v2, 0x6

    #v2=(PosByte);
    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    iget-object v3, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/ah;->a()D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-virtual {v0, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    invoke-virtual {v3}, Lcom/baidu/location/ah;->byte()D

    move-result-wide v3

    #v3=(DoubleLo);
    invoke-virtual {v0, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v7

    iget-object v0, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    invoke-virtual {v0}, Lcom/baidu/location/ah;->new()I

    move-result v0

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v2, v5

    const/4 v0, 0x3

    #v0=(PosByte);
    iget-object v3, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/ah;->int()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x4

    iget-object v3, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    invoke-static {v3}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/location/al;->do(Landroid/content/Context;)I

    move-result v3

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v0

    const/4 v0, 0x5

    iget-object v3, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    invoke-static {v3}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/location/b/a/a;->if(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/al$b;->cP:Ljava/util/List;

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    #v2=(UninitRef);
    const-string v3, "fence"

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v2=(Reference);
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/baidu/location/al$b;->cP:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    #v1=(UninitRef);
    const-string v2, "ext"

    const-string v3, "&ki=%s&sn=%s"

    new-array v4, v5, [Ljava/lang/Object;

    #v4=(Reference);
    iget-object v5, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    #v5=(Reference);
    invoke-static {v5}, Lcom/baidu/location/al;->do(Lcom/baidu/location/al;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    iget-object v5, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    invoke-static {v5}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/baidu/location/q;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v1=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public Z()V
    .locals 0

    invoke-virtual {p0}, Lcom/baidu/location/al$b;->R()V

    return-void
.end method

.method public if(Z)V
    .locals 6

    const/4 v4, 0x1

    #v4=(One);
    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/baidu/location/al$b;->cM:Lorg/apache/http/HttpEntity;

    #v0=(Reference);
    if-eqz v0, :cond_7

    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/al$b;->cM:Lorg/apache/http/HttpEntity;

    #v1=(Reference);
    const-string v2, "UTF-8"

    #v2=(Reference);
    invoke-static {v1, v2}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    if-eqz v2, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "lac"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const-string v1, "lac"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v3}, Lcom/baidu/location/ah;->do(Z)V

    :cond_0
    #v1=(Conflicted);v3=(Conflicted);
    const-string v1, "cl"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    const-string v1, "cl"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v3}, Lcom/baidu/location/ah;->a(Z)V

    :cond_1
    #v1=(Conflicted);v3=(Conflicted);
    const-string v1, "wf"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    const-string v1, "wf"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v3}, Lcom/baidu/location/ah;->if(Z)V

    :cond_2
    #v1=(Conflicted);v3=(Conflicted);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "radius"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    const-string v1, "radius"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    #v1=(Float);
    iget-object v3, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/baidu/location/ah;->a(F)V

    :cond_3
    #v3=(Conflicted);
    const-string v1, "error"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    const-string v1, "error"

    #v1=(Reference);
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Lcom/baidu/location/al$b;->dk:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    #v1=(Conflicted);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_6

    iget v0, p0, Lcom/baidu/location/al$b;->dk:I

    #v0=(Integer);
    const/4 v1, -0x3

    #v1=(Byte);
    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/al$b;->db:Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;

    #v1=(Reference);
    const/16 v2, 0x3ea

    #v2=(PosShort);
    iget-object v3, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/ah;->getGeofenceId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;ILjava/lang/String;)V

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v4=(One);v5=(Uninit);
    move-exception v0

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    iget-object v1, p0, Lcom/baidu/location/al$b;->db:Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/location/ah;->getGeofenceId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v4, v2}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;ILjava/lang/String;)V

    goto :goto_0

    :cond_5
    #v0=(Integer);v1=(Byte);
    iget-object v0, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/al$b;->db:Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    invoke-virtual {v2}, Lcom/baidu/location/ah;->getGeofenceId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v4, v2}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;ILjava/lang/String;)V

    goto :goto_0

    :cond_6
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/location/al;->for(Lcom/baidu/location/al;)Lcom/baidu/location/al$a;

    move-result-object v1

    new-instance v2, Lcom/baidu/location/al$c;

    #v2=(UninitRef);
    iget-object v3, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    #v3=(Reference);
    iget-object v4, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    #v4=(Reference);
    iget-object v5, p0, Lcom/baidu/location/al$b;->db:Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;

    #v5=(Reference);
    invoke-direct {v2, v3, v4, v0, v5}, Lcom/baidu/location/al$c;-><init>(Lcom/baidu/location/al;Lcom/baidu/location/ah;Ljava/lang/String;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Lcom/baidu/location/al$a;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_7
    #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v5=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/al$b;->di:Lcom/baidu/location/al;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/al$b;->db:Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/al$b;->dm:Lcom/baidu/location/ah;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/location/ah;->getGeofenceId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v4, v2}, Lcom/baidu/location/al;->if(Lcom/baidu/location/al;Lcom/baidu/location/GeofenceClient$OnAddBDGeofencesResultListener;ILjava/lang/String;)V

    goto :goto_0
.end method

*/}
