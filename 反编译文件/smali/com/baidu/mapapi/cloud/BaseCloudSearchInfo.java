package com.baidu.mapapi.cloud; class BaseCloudSearchInfo {/*

.class public abstract Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;
.super Lcom/baidu/mapapi/cloud/BaseSearchInfo;


# instance fields
.field public filter:Ljava/lang/String;

.field public pageIndex:I

.field public pageSize:I

.field public q:Ljava/lang/String;

.field public sortby:Ljava/lang/String;

.field public tags:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/mapapi/cloud/BaseSearchInfo;-><init>()V

    #p0=(Reference);
    const/16 v0, 0xa

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->pageSize:I

    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 4

    const/16 v3, 0x2d

    #v3=(PosByte);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-super {p0}, Lcom/baidu/mapapi/cloud/BaseSearchInfo;->a()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_6

    invoke-super {p0}, Lcom/baidu/mapapi/cloud/BaseSearchInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->q:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->q:Ljava/lang/String;

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->q:Ljava/lang/String;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-gt v0, v3, :cond_0

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "q"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :try_start_0
    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->q:Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->tags:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->tags:Ljava/lang/String;

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->tags:Ljava/lang/String;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-gt v0, v3, :cond_1

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "tags"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :try_start_1
    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->tags:Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->sortby:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->sortby:Ljava/lang/String;

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_2

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "sortby"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->sortby:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    #v0=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->filter:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->filter:Ljava/lang/String;

    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_3

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "filter"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->filter:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    #v0=(Conflicted);v2=(Conflicted);
    iget v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->pageIndex:I

    #v0=(Integer);
    if-ltz v0, :cond_4

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "page_index"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->pageIndex:I

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_4
    iget v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->pageSize:I

    if-ltz v0, :cond_5

    iget v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->pageSize:I

    const/16 v2, 0x32

    #v2=(PosByte);
    if-gt v0, v2, :cond_5

    const-string v0, "&"

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "page_size"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/baidu/mapapi/cloud/BaseCloudSearchInfo;->pageSize:I

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    #v2=(Conflicted);
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    #v0=(Reference);
    return-object v0

    :cond_6
    #v2=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_2

    :catch_0
    #v0=(Reference);v2=(Reference);
    move-exception v0

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto/16 :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto/16 :goto_1
.end method

*/}
