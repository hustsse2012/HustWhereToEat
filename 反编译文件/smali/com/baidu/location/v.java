package com.baidu.location; class v {/*

.class public Lcom/baidu/location/v;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    invoke-virtual {p0}, Lcom/baidu/location/v;->aS()V

    return-void
.end method

.method private if(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/io/StringWriter;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    #v0=(Reference);
    new-instance v1, Ljava/io/PrintWriter;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    #v1=(Reference);
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public aS()V
    .locals 7

    const/4 v0, 0x0

    #v0=(Null);
    const/16 v6, 0x800

    :try_start_0
    #v6=(PosShort);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/traces"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/error_fs.dat"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    new-instance v3, Ljava/io/RandomAccessFile;

    #v3=(UninitRef);
    const-string v1, "rw"

    #v1=(Reference);
    invoke-direct {v3, v2, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v3=(Reference);
    const-wide/16 v1, 0x118

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v3, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/16 v1, 0x52e

    #v1=(PosShort);
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    if-ne v1, v2, :cond_1

    const-wide/16 v1, 0x134

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v3, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_3

    if-ge v2, v6, :cond_3

    new-array v4, v2, [B

    #v4=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v3, v4, v1, v2}, Ljava/io/RandomAccessFile;->read([BII)I

    new-instance v1, Ljava/lang/String;

    #v1=(UninitRef);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-direct {v1, v4, v5, v2}, Ljava/lang/String;-><init>([BII)V

    :goto_0
    #v1=(Reference);v4=(Conflicted);v5=(Conflicted);
    const-wide/16 v4, 0x258

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v2

    if-lez v2, :cond_0

    if-ge v2, v6, :cond_0

    new-array v4, v2, [B

    #v4=(Reference);
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v2}, Ljava/io/RandomAccessFile;->read([BII)I

    new-instance v0, Ljava/lang/String;

    #v0=(UninitRef);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-direct {v0, v4, v5, v2}, Ljava/lang/String;-><init>([BII)V

    :cond_0
    #v0=(Reference);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {p0, v1, v0}, Lcom/baidu/location/v;->for(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    const-wide/16 v0, 0x118

    #v0=(LongLo);v1=(LongHi);
    invoke-virtual {v3, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    const/16 v0, 0x303a

    #v0=(PosShort);
    invoke-virtual {v3, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :cond_1
    #v1=(Conflicted);
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_1

    :cond_3
    #v0=(Null);v1=(LongLo);v2=(Integer);v3=(Reference);v4=(Uninit);v5=(Uninit);
    move-object v1, v0

    #v1=(Null);
    goto :goto_0
.end method

.method for(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {}, Lcom/baidu/location/ai;->bf()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    const/16 v1, 0x2ee0

    :try_start_0
    #v1=(PosShort);
    new-instance v2, Lorg/apache/http/client/methods/HttpPost;

    #v2=(UninitRef);
    sget-object v3, Lcom/baidu/location/b;->W:Ljava/lang/String;

    #v3=(Reference);
    invoke-direct {v2, v3}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    #v3=(Reference);
    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    #v4=(UninitRef);
    const-string v5, "e0"

    #v5=(Reference);
    invoke-direct {v4, v5, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v4=(Reference);
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    #v4=(UninitRef);
    const-string v5, "e1"

    invoke-direct {v4, v5, p2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v4=(Reference);
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    #v4=(UninitRef);
    const-string v5, "utf-8"

    invoke-direct {v4, v3, v5}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    #v4=(Reference);
    invoke-virtual {v2, v4}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;

    #v3=(UninitRef);
    invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    #v3=(Reference);
    invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v4

    const-string v5, "http.connection.timeout"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    invoke-interface {v4, v5, v6}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v4

    const-string v5, "http.socket.timeout"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v4, v5, v1}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    invoke-interface {v3, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    #v1=(Integer);
    const/16 v2, 0xc8

    #v2=(PosShort);
    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :catch_0
    #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0
.end method

.method public if(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    #v0=(UninitRef);
    const-string v1, "rw"

    #v1=(Reference);
    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v0=(Reference);
    const-wide/16 v1, 0x118

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/16 v1, 0x303a

    #v1=(PosShort);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const-wide/16 v1, 0x12c

    #v1=(LongLo);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->writeLong(J)V

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    #v1=(Reference);
    array-length v2, v1

    #v2=(Integer);
    invoke-virtual {v0, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v2, 0x0

    #v2=(Null);
    array-length v3, v1

    #v3=(Integer);
    invoke-virtual {v0, v1, v2, v3}, Ljava/io/RandomAccessFile;->write([BII)V

    const-wide/16 v1, 0x258

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    #v1=(Reference);
    array-length v2, v1

    #v2=(Integer);
    invoke-virtual {v0, v2}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v2, 0x0

    #v2=(Null);
    array-length v3, v1

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/RandomAccessFile;->write([BII)V

    invoke-virtual {p0, p2, p3}, Lcom/baidu/location/v;->for(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-wide/16 v1, 0x118

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/16 v1, 0x52e

    #v1=(PosShort);
    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :cond_0
    #v2=(Conflicted);
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);v3=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    const/4 v1, 0x0

    #v1=(Null);
    sget-boolean v0, Lcom/baidu/location/t;->e0:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    #v0=(Integer);
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    :cond_0
    :try_start_0
    #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    invoke-direct {p0, p2}, Lcom/baidu/location/v;->if(Ljava/lang/Throwable;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    :try_start_1
    #v2=(Reference);
    invoke-static {}, Lcom/baidu/location/ap;->bD()Lcom/baidu/location/ap;

    move-result-object v0

    #v0=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0, v3}, Lcom/baidu/location/ap;->try(Z)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/location/g;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    :goto_1
    move-object v3, v0

    :goto_2
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/traces"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "/error_fs.dat"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_2

    new-instance v5, Ljava/io/File;

    #v5=(UninitRef);
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result v4

    if-nez v4, :cond_4

    :goto_3
    #v1=(Reference);
    invoke-virtual {p0, v1, v3, v2}, Lcom/baidu/location/v;->if(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_4
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    #v0=(Integer);
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    goto/16 :goto_0

    :catch_0
    #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    move-exception v0

    #v0=(Reference);
    move-object v0, v1

    :goto_5
    #v2=(Conflicted);v3=(Conflicted);
    move-object v2, v0

    #v2=(Reference);
    move-object v3, v1

    #v3=(Null);
    goto :goto_2

    :cond_2
    :try_start_3
    #v3=(Reference);v4=(Reference);v5=(Boolean);
    new-instance v1, Ljava/io/RandomAccessFile;

    #v1=(UninitRef);
    const-string v4, "rw"

    invoke-direct {v1, v0, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    #v1=(Reference);
    const-wide/16 v4, 0x12c

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v1, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readLong()J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    sub-long v4, v6, v4

    const-wide/32 v6, 0x240c8400

    cmp-long v4, v4, v6

    #v4=(Byte);
    if-lez v4, :cond_3

    invoke-virtual {p0, v0, v3, v2}, Lcom/baidu/location/v;->if(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_4

    :catch_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_4

    :catch_2
    #v0=(Conflicted);v1=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    move-exception v0

    #v0=(Reference);
    move-object v0, v2

    goto :goto_5

    :cond_4
    #v3=(Reference);v4=(Boolean);v5=(Reference);
    move-object v1, v0

    #v1=(Reference);
    goto :goto_3

    :cond_5
    #v1=(Null);v4=(Uninit);v5=(Uninit);
    move-object v0, v1

    #v0=(Null);
    goto/16 :goto_1
.end method

*/}
