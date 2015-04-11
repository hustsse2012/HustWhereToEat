package com.baidu.mapapi.utils; class i {/*

.class public Lcom/baidu/mapapi/utils/i;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a(Lcom/baidu/platform/comapi/map/g;)Lcom/baidu/mapapi/map/MKOLSearchRecord;
    .locals 6

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    new-instance v2, Lcom/baidu/mapapi/map/MKOLSearchRecord;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/mapapi/map/MKOLSearchRecord;-><init>()V

    #v2=(Reference);
    iget v0, p0, Lcom/baidu/platform/comapi/map/g;->a:I

    #v0=(Integer);
    iput v0, v2, Lcom/baidu/mapapi/map/MKOLSearchRecord;->cityID:I

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/g;->b:Ljava/lang/String;

    #v0=(Reference);
    iput-object v0, v2, Lcom/baidu/mapapi/map/MKOLSearchRecord;->cityName:Ljava/lang/String;

    iget v0, p0, Lcom/baidu/platform/comapi/map/g;->d:I

    #v0=(Integer);
    iput v0, v2, Lcom/baidu/mapapi/map/MKOLSearchRecord;->cityType:I

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/g;->a()Ljava/util/ArrayList;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_1

    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    #v3=(Reference);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/g;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    #v4=(Reference);
    move v1, v0

    :goto_1
    #v0=(Integer);v1=(Integer);v5=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/g;

    invoke-static {v0}, Lcom/baidu/mapapi/utils/i;->a(Lcom/baidu/platform/comapi/map/g;)Lcom/baidu/mapapi/map/MKOLSearchRecord;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, v0, Lcom/baidu/platform/comapi/map/g;->c:I

    #v0=(Integer);
    add-int/2addr v0, v1

    iput-object v3, v2, Lcom/baidu/mapapi/map/MKOLSearchRecord;->childCities:Ljava/util/ArrayList;

    move v1, v0

    goto :goto_1

    :cond_1
    #v0=(Null);v1=(Reference);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    move v1, v0

    :cond_2
    #v0=(Boolean);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget v0, v2, Lcom/baidu/mapapi/map/MKOLSearchRecord;->cityType:I

    #v0=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v0, v3, :cond_3

    iput v1, v2, Lcom/baidu/mapapi/map/MKOLSearchRecord;->size:I

    :goto_2
    move-object v0, v2

    #v0=(Reference);
    goto :goto_0

    :cond_3
    #v0=(Integer);
    iget v0, p0, Lcom/baidu/platform/comapi/map/g;->c:I

    iput v0, v2, Lcom/baidu/mapapi/map/MKOLSearchRecord;->size:I

    goto :goto_2
.end method

.method public static a(Lcom/baidu/platform/comapi/map/j;)Lcom/baidu/mapapi/map/MKOLUpdateElement;
    .locals 4

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    new-instance v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/mapapi/map/MKOLUpdateElement;-><init>()V

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/platform/comapi/map/j;->a:I

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->cityID:I

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/j;->b:Ljava/lang/String;

    #v1=(Reference);
    iput-object v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->cityName:Ljava/lang/String;

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v1=(UninitRef);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p0, Lcom/baidu/platform/comapi/map/j;->g:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    invoke-direct {v1, v2, v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    iput-object v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->geoPt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :cond_1
    #v2=(Conflicted);v3=(Conflicted);
    iget v1, p0, Lcom/baidu/platform/comapi/map/j;->e:I

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->level:I

    iget v1, p0, Lcom/baidu/platform/comapi/map/j;->i:I

    iput v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->ratio:I

    iget v1, p0, Lcom/baidu/platform/comapi/map/j;->h:I

    iput v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->serversize:I

    iget v1, p0, Lcom/baidu/platform/comapi/map/j;->i:I

    const/16 v2, 0x64

    #v2=(PosByte);
    if-ne v1, v2, :cond_2

    iget v1, p0, Lcom/baidu/platform/comapi/map/j;->h:I

    iput v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->size:I

    :goto_1
    #v2=(Integer);
    iget v1, p0, Lcom/baidu/platform/comapi/map/j;->l:I

    iput v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->status:I

    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/j;->j:Z

    #v1=(Boolean);
    iput-boolean v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->update:Z

    goto :goto_0

    :cond_2
    #v1=(Integer);v2=(PosByte);
    iget v1, p0, Lcom/baidu/platform/comapi/map/j;->h:I

    iget v2, p0, Lcom/baidu/platform/comapi/map/j;->i:I

    #v2=(Integer);
    mul-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x64

    iput v1, v0, Lcom/baidu/mapapi/map/MKOLUpdateElement;->size:I

    goto :goto_1
.end method

*/}
