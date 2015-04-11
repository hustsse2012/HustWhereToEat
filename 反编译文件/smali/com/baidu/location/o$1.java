package com.baidu.location; class o$1 {/*

.class Lcom/baidu/location/o$1;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lcom/baidu/location/o;


# direct methods
.method constructor <init>(Lcom/baidu/location/o;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v9, 0x1

    #v9=(One);
    const/4 v8, 0x0

    #v8=(Null);
    iget-object v0, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/o;->V()V

    iget-object v0, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    iget v0, v0, Lcom/baidu/location/o;->cO:I

    #v0=(Integer);
    iget-object v1, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/location/o;->if(Lcom/baidu/location/o;)V

    move v2, v0

    #v2=(Integer);
    move-object v1, v3

    :goto_0
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-lez v2, :cond_2

    :try_start_0
    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    #v0=(UninitRef);
    iget-object v4, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    #v4=(Reference);
    iget-object v4, v4, Lcom/baidu/location/o;->cL:Ljava/lang/String;

    invoke-direct {v0, v4}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    #v0=(Reference);
    new-instance v1, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    #v1=(UninitRef);
    iget-object v4, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    iget-object v4, v4, Lcom/baidu/location/o;->cP:Ljava/util/List;

    const-string v5, "utf-8"

    #v5=(Reference);
    invoke-direct {v1, v4, v5}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    #v1=(Reference);
    const-string v4, "Content-Type"

    const-string v5, "application/x-www-form-urlencoded; charset=utf-8"

    invoke-virtual {v0, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Accept-Charset"

    const-string v5, "UTF-8;"

    invoke-virtual {v0, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v1=(UninitRef);
    invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    #v1=(Reference);
    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v4

    const-string v5, "http.connection.timeout"

    const/16 v6, 0x2ee0

    #v6=(PosShort);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    invoke-interface {v4, v5, v6}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v4

    const-string v5, "http.socket.timeout"

    const/16 v6, 0x2ee0

    #v6=(PosShort);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    invoke-interface {v4, v5, v6}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v4

    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {v4, v5}, Lorg/apache/http/params/HttpProtocolParams;->setUseExpectContinue(Lorg/apache/http/params/HttpParams;Z)V

    invoke-static {}, Lcom/baidu/location/o;->Q()I

    move-result v4

    #v4=(Integer);
    if-eq v4, v9, :cond_0

    invoke-static {}, Lcom/baidu/location/o;->Q()I

    move-result v4

    const/4 v5, 0x4

    #v5=(PosByte);
    if-ne v4, v5, :cond_1

    :cond_0
    iget-object v4, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/location/o;->cO:I

    #v4=(Integer);
    sub-int/2addr v4, v2

    rem-int/lit8 v4, v4, 0x2

    if-nez v4, :cond_1

    new-instance v4, Lorg/apache/http/HttpHost;

    #v4=(UninitRef);
    invoke-static {}, Lcom/baidu/location/o;->S()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-static {}, Lcom/baidu/location/o;->U()I

    move-result v6

    #v6=(Integer);
    const-string v7, "http"

    #v7=(Reference);
    invoke-direct {v4, v5, v6, v7}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    #v4=(Reference);
    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v5

    const-string v6, "http.route.default-proxy"

    #v6=(Reference);
    invoke-interface {v5, v6, v4}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    :cond_1
    #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    invoke-interface {v1, v0}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v4

    #v4=(Reference);
    invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v4

    #v4=(Integer);
    const/16 v5, 0xc8

    #v5=(PosShort);
    if-ne v4, v5, :cond_4

    iget-object v4, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    #v4=(Reference);
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    iput-object v1, v4, Lcom/baidu/location/o;->cM:Lorg/apache/http/HttpEntity;

    iget-object v1, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {v1, v4}, Lcom/baidu/location/o;->if(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-gtz v2, :cond_3

    iget-object v0, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    #v0=(Reference);
    iput-object v3, v0, Lcom/baidu/location/o;->cM:Lorg/apache/http/HttpEntity;

    iget-object v0, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    invoke-virtual {v0, v8}, Lcom/baidu/location/o;->if(Z)V

    :cond_3
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/o$1;->a:Lcom/baidu/location/o;

    #v0=(Reference);
    invoke-static {v0, v8}, Lcom/baidu/location/o;->if(Lcom/baidu/location/o;Z)Z

    return-void

    :cond_4
    :try_start_2
    #v4=(Integer);v5=(PosShort);v6=(Reference);
    invoke-virtual {v0}, Lorg/apache/http/client/methods/HttpPost;->abort()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_1
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    add-int/lit8 v1, v2, -0x1

    #v1=(Integer);
    move v2, v1

    move-object v1, v0

    #v1=(Reference);
    goto/16 :goto_0

    :catch_0
    #v1=(Conflicted);
    move-exception v1

    :goto_2
    #v1=(Reference);
    invoke-virtual {v0}, Lorg/apache/http/client/methods/HttpPost;->abort()V

    const-string v1, "baidu_location_service"

    const-string v4, "NetworkCommunicationException!"

    #v4=(Reference);
    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    #v0=(Conflicted);v4=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    goto :goto_2
.end method

*/}
