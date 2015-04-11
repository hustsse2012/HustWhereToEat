package com.baidu.mapapi.search; class b {/*

.class final Lcom/baidu/mapapi/search/b;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/baidu/mapapi/search/a$a;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/baidu/mapapi/search/a$a;II)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/baidu/mapapi/search/b;->b:Lcom/baidu/mapapi/search/a$a;

    iput p3, p0, Lcom/baidu/mapapi/search/b;->c:I

    iput p4, p0, Lcom/baidu/mapapi/search/b;->d:I

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    const/4 v2, 0x0

    #v2=(Null);
    sget-object v3, Lcom/baidu/mapapi/search/a;->b:Ljava/util/HashMap;

    #v3=(Reference);
    monitor-enter v3

    :try_start_0
    sget-object v0, Lcom/baidu/mapapi/search/a;->b:Ljava/util/HashMap;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/b;->a:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/j;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/search/b;->b:Lcom/baidu/mapapi/search/a$a;

    iget v2, p0, Lcom/baidu/mapapi/search/b;->c:I

    #v2=(Integer);
    iget v4, p0, Lcom/baidu/mapapi/search/b;->d:I

    #v4=(Integer);
    iget-object v5, p0, Lcom/baidu/mapapi/search/b;->a:Ljava/lang/String;

    #v5=(Reference);
    invoke-interface {v1, v2, v4, v5, v0}, Lcom/baidu/mapapi/search/a$a;->onOk(IILjava/lang/String;Ljava/lang/Object;)V

    monitor-exit v3

    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void

    :cond_0
    #v0=(Reference);v2=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    #v4=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/search/b;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/mapapi/search/a;->a(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v1

    if-eqz v1, :cond_5

    const/16 v0, 0x4e20

    :try_start_2
    #v0=(PosShort);
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    #v0=(Integer);
    const/16 v5, 0xc8

    #v5=(PosShort);
    if-ne v0, v5, :cond_2

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    #v2=(Reference);
    const/16 v0, 0x800

    #v0=(PosShort);
    new-array v5, v0, [B

    #v5=(Reference);
    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    move-result v0

    :goto_1
    #v0=(Integer);v6=(Conflicted);
    const/4 v6, -0x1

    #v6=(Byte);
    if-eq v0, v6, :cond_1

    const/4 v6, 0x0

    #v6=(Null);
    invoke-virtual {v4, v5, v6, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    move-result v0

    goto :goto_1

    :cond_1
    #v6=(Byte);
    iget-object v0, p0, Lcom/baidu/mapapi/search/b;->b:Lcom/baidu/mapapi/search/a$a;

    #v0=(Reference);
    if-eqz v0, :cond_2

    new-instance v0, Lcom/baidu/mapapi/search/j;

    #v0=(UninitRef);
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    invoke-direct {v0, v4}, Lcom/baidu/mapapi/search/j;-><init>([B)V

    #v0=(Reference);
    new-instance v4, Ljava/lang/ref/SoftReference;

    #v4=(UninitRef);
    invoke-direct {v4, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    #v4=(Reference);
    sget-object v5, Lcom/baidu/mapapi/search/a;->b:Ljava/util/HashMap;

    iget-object v6, p0, Lcom/baidu/mapapi/search/b;->a:Ljava/lang/String;

    #v6=(Reference);
    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lcom/baidu/mapapi/search/b;->b:Lcom/baidu/mapapi/search/a$a;

    iget v5, p0, Lcom/baidu/mapapi/search/b;->c:I

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/mapapi/search/b;->d:I

    #v6=(Integer);
    iget-object v7, p0, Lcom/baidu/mapapi/search/b;->a:Ljava/lang/String;

    #v7=(Reference);
    invoke-interface {v4, v5, v6, v7, v0}, Lcom/baidu/mapapi/search/a$a;->onOk(IILjava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    :goto_2
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-eqz v2, :cond_3

    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_3
    :goto_3
    if-eqz v1, :cond_4

    :try_start_4
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    :goto_4
    #v8=(Conflicted);
    monitor-exit v3

    goto :goto_0

    :catchall_0
    #v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :cond_5
    :try_start_5
    #v1=(Reference);v2=(Null);v4=(Reference);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/search/b;->b:Lcom/baidu/mapapi/search/a$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/search/b;->b:Lcom/baidu/mapapi/search/a$a;

    iget v4, p0, Lcom/baidu/mapapi/search/b;->c:I

    #v4=(Integer);
    iget v5, p0, Lcom/baidu/mapapi/search/b;->d:I

    #v5=(Integer);
    iget-object v6, p0, Lcom/baidu/mapapi/search/b;->a:Ljava/lang/String;

    #v6=(Reference);
    const-string v7, "\u7f51\u7edc\u8fde\u63a5\u5931\u8d25"

    #v7=(Reference);
    invoke-interface {v0, v4, v5, v6, v7}, Lcom/baidu/mapapi/search/a$a;->onError(IILjava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_2

    :catch_0
    #v0=(Conflicted);v2=(Reference);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    :goto_5
    :try_start_6
    #v0=(Reference);
    iget-object v4, p0, Lcom/baidu/mapapi/search/b;->b:Lcom/baidu/mapapi/search/a$a;

    #v4=(Reference);
    if-eqz v4, :cond_6

    iget-object v4, p0, Lcom/baidu/mapapi/search/b;->b:Lcom/baidu/mapapi/search/a$a;

    iget v5, p0, Lcom/baidu/mapapi/search/b;->c:I

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/mapapi/search/b;->d:I

    #v6=(Integer);
    iget-object v7, p0, Lcom/baidu/mapapi/search/b;->a:Ljava/lang/String;

    #v7=(Reference);
    const-string v8, "\u7f51\u7edc\u8fde\u63a5\u5931\u8d25"

    #v8=(Reference);
    invoke-interface {v4, v5, v6, v7, v8}, Lcom/baidu/mapapi/search/a$a;->onError(IILjava/lang/String;Ljava/lang/Object;)V

    :cond_6
    #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v2, :cond_7

    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    :cond_7
    :goto_6
    if-eqz v1, :cond_4

    :try_start_8
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_4

    :catch_1
    #v0=(Conflicted);v4=(Conflicted);v8=(Uninit);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    :catch_2
    #v4=(Reference);v8=(Conflicted);
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_6

    :catchall_1
    #v2=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    move-exception v0

    move-object v1, v2

    :goto_7
    #v2=(Reference);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-eqz v2, :cond_8

    :try_start_9
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    :cond_8
    :goto_8
    if-eqz v1, :cond_9

    :try_start_a
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_9
    throw v0

    :catch_3
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_8

    :catchall_2
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_7

    :catch_4
    #v2=(Null);v4=(Reference);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    move-exception v0

    move-object v1, v2

    #v1=(Null);
    goto :goto_5
.end method

*/}
