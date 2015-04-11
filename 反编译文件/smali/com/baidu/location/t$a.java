package com.baidu.location; class t$a {/*

.class Lcom/baidu/location/t$a;
.super Lcom/baidu/location/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic cV:Lcom/baidu/location/t;

.field cW:Z

.field cX:Ljava/lang/String;

.field cY:Z


# direct methods
.method public constructor <init>(Lcom/baidu/location/t;)V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    iput-object p1, p0, Lcom/baidu/location/t$a;->cV:Lcom/baidu/location/t;

    invoke-direct {p0}, Lcom/baidu/location/o;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/t$a;->cX:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/baidu/location/t$a;->cW:Z

    iput-boolean v1, p0, Lcom/baidu/location/t$a;->cY:Z

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/t$a;->cP:Ljava/util/List;

    return-void
.end method


# virtual methods
.method V()V
    .locals 5

    invoke-static {}, Lcom/baidu/location/b;->int()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/t$a;->cL:Ljava/lang/String;

    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/t$a;->cO:I

    iget-object v0, p0, Lcom/baidu/location/t$a;->cX:Ljava/lang/String;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, p0, Lcom/baidu/location/t$a;->cX:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/baidu/location/t$a;->cW:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/location/t$a;->cP:Ljava/util/List;

    #v1=(Reference);
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    #v2=(UninitRef);
    const-string v3, "qt"

    #v3=(Reference);
    const-string v4, "grid"

    #v4=(Reference);
    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v2=(Reference);
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v1, p0, Lcom/baidu/location/t$a;->cP:Ljava/util/List;

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    #v2=(UninitRef);
    const-string v3, "req"

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v2=(Reference);
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    #v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-object v1, p0, Lcom/baidu/location/t$a;->cP:Ljava/util/List;

    #v1=(Reference);
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    #v2=(UninitRef);
    const-string v3, "qt"

    #v3=(Reference);
    const-string v4, "conf"

    #v4=(Reference);
    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v2=(Reference);
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public if(Ljava/lang/String;Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/t$a;->cY:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/t$a;->cY:Z

    iput-object p1, p0, Lcom/baidu/location/t$a;->cX:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/baidu/location/t$a;->cW:Z

    invoke-virtual {p0}, Lcom/baidu/location/t$a;->R()V

    goto :goto_0
.end method

.method if(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/t$a;->cM:Lorg/apache/http/HttpEntity;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/t$a;->cW:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/t$a;->cV:Lcom/baidu/location/t;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/t$a;->cM:Lorg/apache/http/HttpEntity;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/t;->if(Lcom/baidu/location/t;Lorg/apache/http/HttpEntity;)V

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/t$a;->cP:Ljava/util/List;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/t$a;->cP:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/t$a;->cY:Z

    return-void

    :cond_2
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/t$a;->cV:Lcom/baidu/location/t;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/t$a;->cM:Lorg/apache/http/HttpEntity;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/t;->do(Lcom/baidu/location/t;Lorg/apache/http/HttpEntity;)V

    goto :goto_0
.end method

*/}
