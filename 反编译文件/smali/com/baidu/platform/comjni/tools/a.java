package com.baidu.platform.comjni.tools; class a {/*

.class public Lcom/baidu/platform/comjni/tools/a;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a(Lcom/baidu/platform/comapi/basestruct/c;Lcom/baidu/platform/comapi/basestruct/c;)D
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "x1"

    #v1=(Reference);
    iget v2, p0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "y1"

    iget v2, p0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "x2"

    iget v2, p1, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "y2"

    iget v2, p1, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    invoke-static {v0}, Lcom/baidu/platform/comjni/tools/JNITools;->GetDistanceByMC(Ljava/lang/Object;)V

    const-string v1, "distance"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method public static a(Ljava/lang/String;)Lcom/baidu/platform/comapi/basestruct/a;
    .locals 13

    const/4 v3, 0x0

    #v3=(Null);
    if-eqz p0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    new-instance v6, Landroid/os/Bundle;

    #v6=(UninitRef);
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    #v6=(Reference);
    const-string v0, "strkey"

    #v0=(Reference);
    invoke-virtual {v6, v0, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Lcom/baidu/platform/comjni/tools/JNITools;->TransGeoStr2ComplexPt(Ljava/lang/Object;)Z

    new-instance v5, Lcom/baidu/platform/comapi/basestruct/a;

    #v5=(UninitRef);
    invoke-direct {v5}, Lcom/baidu/platform/comapi/basestruct/a;-><init>()V

    #v5=(Reference);
    const-string v0, "map_bound"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "ll"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(UninitRef);
    const-string v4, "ptx"

    #v4=(Reference);
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    #v7=(DoubleLo);v8=(DoubleHi);
    double-to-int v4, v7

    #v4=(Integer);
    const-string v7, "pty"

    #v7=(Reference);
    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    #v7=(DoubleLo);
    double-to-int v1, v7

    #v1=(Integer);
    invoke-direct {v2, v4, v1}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v2=(Reference);
    iput-object v2, v5, Lcom/baidu/platform/comapi/basestruct/a;->b:Lcom/baidu/platform/comapi/basestruct/c;

    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const-string v1, "ru"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(UninitRef);
    const-string v2, "ptx"

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    #v7=(DoubleLo);v8=(DoubleHi);
    double-to-int v2, v7

    #v2=(Integer);
    const-string v4, "pty"

    #v4=(Reference);
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    double-to-int v0, v7

    #v0=(Integer);
    invoke-direct {v1, v2, v0}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v1=(Reference);
    iput-object v1, v5, Lcom/baidu/platform/comapi/basestruct/a;->c:Lcom/baidu/platform/comapi/basestruct/c;

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    const-string v0, "poly_line"

    #v0=(Reference);
    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, [Lcom/baidu/platform/comjni/tools/ParcelItem;

    check-cast v0, [Lcom/baidu/platform/comjni/tools/ParcelItem;

    move v2, v3

    :goto_1
    #v2=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    array-length v1, v0

    #v1=(Integer);
    if-ge v2, v1, :cond_8

    iget-object v1, v5, Lcom/baidu/platform/comapi/basestruct/a;->d:Ljava/util/ArrayList;

    #v1=(Reference);
    if-nez v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iput-object v1, v5, Lcom/baidu/platform/comapi/basestruct/a;->d:Ljava/util/ArrayList;

    :cond_4
    aget-object v1, v0, v2

    #v1=(Null);
    invoke-virtual {v1}, Lcom/baidu/platform/comjni/tools/ParcelItem;->getBundle()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_7

    const-string v4, "point_array"

    #v4=(Reference);
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, [Lcom/baidu/platform/comjni/tools/ParcelItem;

    check-cast v1, [Lcom/baidu/platform/comjni/tools/ParcelItem;

    new-instance v7, Ljava/util/ArrayList;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    #v7=(Reference);
    move v4, v3

    :goto_2
    #v4=(Integer);
    array-length v8, v1

    #v8=(Integer);
    if-ge v4, v8, :cond_6

    aget-object v8, v1, v4

    #v8=(Null);
    invoke-virtual {v8}, Lcom/baidu/platform/comjni/tools/ParcelItem;->getBundle()Landroid/os/Bundle;

    move-result-object v8

    #v8=(Reference);
    if-eqz v8, :cond_5

    new-instance v9, Lcom/baidu/platform/comapi/basestruct/c;

    #v9=(UninitRef);
    const-string v10, "ptx"

    #v10=(Reference);
    invoke-virtual {v8, v10}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    #v10=(DoubleLo);v11=(DoubleHi);
    double-to-int v10, v10

    #v10=(Integer);
    const-string v11, "pty"

    #v11=(Reference);
    invoke-virtual {v8, v11}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    #v11=(DoubleLo);v12=(DoubleHi);
    double-to-int v8, v11

    #v8=(Integer);
    invoke-direct {v9, v10, v8}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v9=(Reference);
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    #v8=(Integer);
    invoke-virtual {v7}, Ljava/util/ArrayList;->trimToSize()V

    iget-object v1, v5, Lcom/baidu/platform/comapi/basestruct/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    #v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    add-int/lit8 v1, v2, 0x1

    #v1=(Integer);
    move v2, v1

    goto :goto_1

    :cond_8
    iget-object v0, v5, Lcom/baidu/platform/comapi/basestruct/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V

    const-string v0, "type"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    double-to-int v0, v0

    #v0=(Integer);
    iput v0, v5, Lcom/baidu/platform/comapi/basestruct/a;->a:I

    move-object v0, v5

    #v0=(Reference);
    goto/16 :goto_0
.end method

*/}
