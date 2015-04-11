package com.baidu.mapapi.utils; class d {/*

.class public Lcom/baidu/mapapi/utils/d;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;)Z
    .locals 4

    const/4 v1, 0x0

    #v1=(Null);
    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/BaiduMap/vmp/l"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0xb4

    #v3=(PosShort);
    if-le v2, v3, :cond_0

    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/BaiduMap/vmp/h"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :cond_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    move v0, v1

    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Reference);v2=(Boolean);
    new-instance v2, Lcom/baidu/mapapi/utils/e;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/mapapi/utils/e;-><init>()V

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v0, v0

    #v0=(Integer);
    if-gtz v0, :cond_3

    :cond_2
    #v0=(Conflicted);
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(Integer);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

*/}
