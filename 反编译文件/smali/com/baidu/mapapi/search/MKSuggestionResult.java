package com.baidu.mapapi.search; class MKSuggestionResult {/*

.class public Lcom/baidu/mapapi/search/MKSuggestionResult;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKSuggestionInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->a:I

    return-void
.end method


# virtual methods
.method a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKSuggestionInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public getAllSuggestions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/mapapi/search/MKSuggestionInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method public getSuggestion(I)Lcom/baidu/mapapi/search/MKSuggestionInfo;
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->b:Ljava/util/ArrayList;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-ltz p1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    if-le p1, v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/MKSuggestionInfo;

    goto :goto_0
.end method

.method public getSuggestionNum()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->b:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->a:I

    :goto_0
    iget v0, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->a:I

    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSuggestionResult;->a:I

    goto :goto_0
.end method

*/}
