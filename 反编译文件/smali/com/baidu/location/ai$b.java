package com.baidu.location; class ai$b {/*

.class public Lcom/baidu/location/ai$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/ai;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/ai;

.field private do:Z

.field public for:Ljava/util/List;

.field private if:J

.field private int:J


# direct methods
.method public constructor <init>(Lcom/baidu/location/ai;Lcom/baidu/location/ai$b;)V
    .locals 3

    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    iput-object p1, p0, Lcom/baidu/location/ai$b;->a:Lcom/baidu/location/ai;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    iput-wide v1, p0, Lcom/baidu/location/ai$b;->if:J

    iput-wide v1, p0, Lcom/baidu/location/ai$b;->int:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/ai$b;->do:Z

    if-eqz p2, :cond_0

    iget-object v0, p2, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    iget-wide v0, p2, Lcom/baidu/location/ai$b;->if:J

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/ai$b;->if:J

    iget-wide v0, p2, Lcom/baidu/location/ai$b;->int:J

    iput-wide v0, p0, Lcom/baidu/location/ai$b;->int:J

    iget-boolean v0, p2, Lcom/baidu/location/ai$b;->do:Z

    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/baidu/location/ai$b;->do:Z

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public constructor <init>(Lcom/baidu/location/ai;Ljava/util/List;J)V
    .locals 3

    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    iput-object p1, p0, Lcom/baidu/location/ai$b;->a:Lcom/baidu/location/ai;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    iput-wide v1, p0, Lcom/baidu/location/ai$b;->if:J

    iput-wide v1, p0, Lcom/baidu/location/ai$b;->int:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/ai$b;->do:Z

    iput-wide p3, p0, Lcom/baidu/location/ai$b;->if:J

    iput-object p2, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/ai$b;->int:J

    invoke-direct {p0}, Lcom/baidu/location/ai$b;->a()V

    const-string v0, "baidu_location_service"

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/baidu/location/ai$b;->int()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/b;->do(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a()V
    .locals 8

    const/4 v5, 0x0

    #v5=(Null);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {p0}, Lcom/baidu/location/ai$b;->try()I

    move-result v0

    #v0=(Integer);
    if-ge v0, v1, :cond_1

    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    :cond_1
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    add-int/lit8 v0, v0, -0x1

    move v3, v0

    #v3=(Integer);
    move v2, v1

    :goto_0
    #v2=(Boolean);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-lt v3, v1, :cond_0

    if-eqz v2, :cond_0

    move v4, v5

    #v4=(Null);
    move v2, v5

    :goto_1
    #v4=(Integer);
    if-ge v4, v3, :cond_2

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v6, v0, Landroid/net/wifi/ScanResult;->level:I

    #v6=(Integer);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    add-int/lit8 v7, v4, 0x1

    #v7=(Integer);
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    if-ge v6, v0, :cond_3

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v2, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v2=(Reference);
    add-int/lit8 v6, v4, 0x1

    iget-object v7, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v7=(Reference);
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v2, v6, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v2, v4, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v0, v1

    :goto_2
    #v0=(Boolean);v2=(Conflicted);v7=(Conflicted);
    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    move v4, v2

    move v2, v0

    #v2=(Boolean);
    goto :goto_1

    :cond_2
    #v0=(Integer);v6=(Conflicted);
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_0

    :cond_3
    #v6=(Integer);v7=(Integer);
    move v0, v2

    #v0=(Boolean);
    goto :goto_2
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 13

    invoke-virtual {p0}, Lcom/baidu/location/ai$b;->try()I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Integer);v1=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    new-instance v6, Ljava/lang/StringBuffer;

    #v6=(UninitRef);
    const/16 v0, 0x200

    #v0=(PosShort);
    invoke-direct {v6, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    #v6=(Reference);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->a:Lcom/baidu/location/ai;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/ai;->bd()Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x1

    if-le v0, p1, :cond_a

    :goto_1
    const/4 v0, 0x0

    #v0=(Null);
    move v5, v0

    :goto_2
    #v0=(Boolean);v1=(Boolean);v2=(Integer);v3=(Conflicted);v4=(Integer);v5=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-ge v5, p1, :cond_5

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    if-nez v0, :cond_1

    move v0, v1

    #v0=(Boolean);
    move v1, v4

    :goto_3
    #v1=(Integer);
    add-int/lit8 v3, v5, 0x1

    #v3=(Integer);
    move v5, v3

    move v4, v1

    move v1, v0

    #v1=(Boolean);
    goto :goto_2

    :cond_1
    #v0=(Integer);v3=(Conflicted);
    if-eqz v1, :cond_3

    const/4 v3, 0x0

    #v3=(Null);
    const-string v0, "&wf="

    #v0=(Reference);
    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v1, ":"

    #v1=(Reference);
    const-string v8, ""

    #v8=(Reference);
    invoke-virtual {v0, v1, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    if-gez v0, :cond_2

    neg-int v0, v0

    :cond_2
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v9, ";%d;"

    #v9=(Reference);
    const/4 v10, 0x1

    #v10=(One);
    new-array v10, v10, [Ljava/lang/Object;

    #v10=(Reference);
    const/4 v11, 0x0

    #v11=(Null);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v10, v11

    invoke-static {v1, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v4, 0x1

    #v1=(Integer);
    if-eqz v7, :cond_9

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_9

    move v0, v1

    :goto_4
    #v0=(Integer);
    move v2, v0

    move v0, v3

    #v0=(Null);
    goto :goto_3

    :cond_3
    #v0=(Integer);v1=(Boolean);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    const-string v0, "|"

    #v0=(Reference);
    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v3, ":"

    #v3=(Reference);
    const-string v8, ""

    #v8=(Reference);
    invoke-virtual {v0, v3, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    if-gez v0, :cond_4

    neg-int v0, v0

    :cond_4
    sget-object v8, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v9, ";%d;"

    #v9=(Reference);
    const/4 v10, 0x1

    #v10=(One);
    new-array v10, v10, [Ljava/lang/Object;

    #v10=(Reference);
    const/4 v11, 0x0

    #v11=(Null);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v10, v11

    invoke-static {v8, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v4, 0x1

    #v0=(Integer);
    if-eqz v7, :cond_8

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_8

    move v2, v0

    move v12, v1

    #v12=(Boolean);
    move v1, v0

    #v1=(Integer);
    move v0, v12

    #v0=(Boolean);
    goto/16 :goto_3

    :cond_5
    #v1=(Boolean);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-nez v1, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "&wf_n="

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "&wf_st="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-wide v0, p0, Lcom/baidu/location/ai$b;->if:J

    #v0=(LongLo);v1=(LongHi);
    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-string v0, "&wf_et="

    #v0=(Reference);
    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-wide v0, p0, Lcom/baidu/location/ai$b;->int:J

    #v0=(LongLo);
    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    if-lez v2, :cond_6

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/ai$b;->do:Z

    :cond_6
    #v0=(Conflicted);
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto/16 :goto_0

    :cond_7
    #v0=(Boolean);v1=(Boolean);
    const/4 v0, 0x0

    #v0=(Null);
    goto/16 :goto_0

    :cond_8
    #v0=(Integer);v8=(Reference);v9=(Reference);v10=(Reference);v11=(Null);
    move v12, v1

    #v12=(Boolean);
    move v1, v0

    #v1=(Integer);
    move v0, v12

    #v0=(Boolean);
    goto/16 :goto_3

    :cond_9
    #v0=(Conflicted);v3=(Null);v12=(Conflicted);
    move v0, v2

    #v0=(Integer);
    goto/16 :goto_4

    :cond_a
    #v1=(One);v2=(Null);v3=(Uninit);v4=(Null);v5=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    move p1, v0

    goto/16 :goto_1
.end method

.method public a(Lcom/baidu/location/ai$b;)Z
    .locals 1

    sget v0, Lcom/baidu/location/b;->aN:F

    #v0=(Integer);
    invoke-virtual {p0, p1, p0, v0}, Lcom/baidu/location/ai$b;->a(Lcom/baidu/location/ai$b;Lcom/baidu/location/ai$b;F)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public a(Lcom/baidu/location/ai$b;Lcom/baidu/location/ai$b;F)Z
    .locals 12

    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    #v3=(Null);
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move v0, v3

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    return v0

    :cond_1
    #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
    iget-object v6, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v6=(Reference);
    iget-object v7, p2, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v7=(Reference);
    if-ne v6, v7, :cond_2

    move v0, v2

    #v0=(One);
    goto :goto_0

    :cond_2
    #v0=(Uninit);
    if-eqz v6, :cond_3

    if-nez v7, :cond_4

    :cond_3
    move v0, v3

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(Uninit);
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    #v8=(Integer);
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    #v9=(Integer);
    add-int v0, v8, v9

    #v0=(Integer);
    int-to-float v10, v0

    #v10=(Float);
    if-nez v8, :cond_5

    if-nez v9, :cond_5

    move v0, v2

    #v0=(One);
    goto :goto_0

    :cond_5
    #v0=(Integer);
    if-eqz v8, :cond_6

    if-nez v9, :cond_7

    :cond_6
    move v0, v3

    #v0=(Null);
    goto :goto_0

    :cond_7
    #v0=(Integer);
    move v5, v3

    #v5=(Null);
    move v1, v3

    :goto_1
    #v1=(Integer);v4=(Conflicted);v5=(Integer);v11=(Conflicted);
    if-ge v5, v8, :cond_a

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v11, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    #v11=(Reference);
    if-nez v11, :cond_8

    move v0, v1

    :goto_2
    #v0=(Integer);
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    move v1, v0

    goto :goto_1

    :cond_8
    #v0=(Reference);
    move v4, v3

    :goto_3
    #v0=(Conflicted);v4=(Integer);
    if-ge v4, v9, :cond_c

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_9

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    goto :goto_2

    :cond_9
    #v0=(Boolean);
    add-int/lit8 v0, v4, 0x1

    #v0=(Integer);
    move v4, v0

    goto :goto_3

    :cond_a
    #v4=(Conflicted);v11=(Conflicted);
    mul-int/lit8 v0, v1, 0x2

    int-to-float v0, v0

    #v0=(Float);
    mul-float v1, v10, p3

    #v1=(Float);
    cmpl-float v0, v0, v1

    #v0=(Byte);
    if-ltz v0, :cond_b

    move v0, v2

    #v0=(One);
    goto :goto_0

    :cond_b
    #v0=(Byte);
    move v0, v3

    #v0=(Null);
    goto :goto_0

    :cond_c
    #v0=(Conflicted);v1=(Integer);v4=(Integer);v11=(Reference);
    move v0, v1

    #v0=(Integer);
    goto :goto_2
.end method

.method public byte()Ljava/lang/String;
    .locals 1

    const/16 v0, 0xf

    :try_start_0
    #v0=(PosByte);
    invoke-virtual {p0, v0}, Lcom/baidu/location/ai$b;->a(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    :catch_0
    #v0=(PosByte);
    move-exception v0

    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public case()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/ai$b;->do:Z

    #v0=(Boolean);
    return v0
.end method

.method public char()Ljava/lang/String;
    .locals 1

    :try_start_0
    sget v0, Lcom/baidu/location/b;->aQ:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/baidu/location/ai$b;->a(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public do()I
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    move v1, v2

    :goto_0
    #v0=(Conflicted);v1=(Integer);
    invoke-virtual {p0}, Lcom/baidu/location/ai$b;->try()I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    neg-int v0, v0

    if-lez v0, :cond_1

    move v2, v0

    :cond_0
    #v2=(Integer);
    return v2

    :cond_1
    #v2=(Null);
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public do(Lcom/baidu/location/ai$b;)Z
    .locals 7

    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    iget-object v0, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    iget-object v1, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    move v1, v0

    :goto_0
    move v3, v2

    :goto_1
    #v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-ge v3, v1, :cond_3

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v4, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    #v4=(Reference);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v5, v0, Landroid/net/wifi/ScanResult;->level:I

    #v5=(Integer);
    iget-object v0, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v6, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    #v6=(Reference);
    iget-object v0, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    if-eq v5, v0, :cond_2

    :cond_0
    move v0, v2

    :goto_2
    #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v0

    :cond_1
    #v0=(Integer);v1=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    iget-object v0, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_2
    #v3=(Integer);v4=(Boolean);v5=(Integer);v6=(Reference);
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_3
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_2

    :cond_4
    #v0=(Reference);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    move v0, v2

    #v0=(Null);
    goto :goto_2
.end method

.method public else()Ljava/lang/String;
    .locals 10

    const/16 v0, 0xa

    #v0=(PosByte);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v3, 0x0

    #v3=(Null);
    new-instance v6, Ljava/lang/StringBuffer;

    #v6=(UninitRef);
    const/16 v1, 0x200

    #v1=(PosShort);
    invoke-direct {v6, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    #v6=(Reference);
    const-string v1, "wifi info:"

    #v1=(Reference);
    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/baidu/location/ai$b;->try()I

    move-result v1

    #v1=(Integer);
    if-ge v1, v5, :cond_0

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    #v0=(Reference);v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v0

    :cond_0
    #v0=(PosByte);v2=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    iget-object v1, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    #v1=(Integer);
    if-le v1, v0, :cond_1

    move v1, v0

    :cond_1
    move v4, v3

    #v4=(Null);
    move v2, v5

    :goto_1
    #v2=(Boolean);v4=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-ge v4, v1, :cond_4

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    if-nez v0, :cond_2

    move v0, v2

    :goto_2
    #v0=(Boolean);v2=(Conflicted);
    add-int/lit8 v2, v4, 0x1

    #v2=(Integer);
    move v4, v2

    move v2, v0

    #v2=(Boolean);
    goto :goto_1

    :cond_2
    #v0=(Integer);
    if-eqz v2, :cond_3

    const-string v0, "wifi="

    #v0=(Reference);
    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v2, ":"

    #v2=(Reference);
    const-string v7, ""

    #v7=(Reference);
    invoke-virtual {v0, v2, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v7, ";%d;"

    new-array v8, v5, [Ljava/lang/Object;

    #v8=(Reference);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v8, v3

    invoke-static {v2, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move v0, v3

    #v0=(Null);
    goto :goto_2

    :cond_3
    #v0=(Integer);v2=(Boolean);v7=(Conflicted);v8=(Conflicted);
    const-string v0, ";"

    #v0=(Reference);
    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v7, ":"

    #v7=(Reference);
    const-string v8, ""

    #v8=(Reference);
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    #v0=(Integer);
    sget-object v7, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v8, ",%d;"

    new-array v9, v5, [Ljava/lang/Object;

    #v9=(Reference);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v9, v3

    invoke-static {v7, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move v0, v2

    #v0=(Boolean);
    goto :goto_2

    :cond_4
    #v0=(PosByte);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto/16 :goto_0
.end method

.method public for()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/ai$b;->int:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public if(I)Ljava/lang/String;
    .locals 5

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/ai$b;->try()I

    move-result v2

    #v2=(Integer);
    if-ge v2, v1, :cond_1

    :cond_0
    #v2=(Conflicted);
    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(One);v2=(Integer);v3=(Uninit);v4=(Uninit);
    new-instance v4, Ljava/lang/StringBuffer;

    #v4=(UninitRef);
    const/16 v2, 0x100

    #v2=(PosShort);
    invoke-direct {v4, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    #v4=(Reference);
    move v2, v0

    #v2=(Null);
    move v3, v1

    #v3=(One);
    move v1, v0

    :goto_1
    #v0=(Integer);v1=(Integer);v2=(Integer);v3=(Integer);
    sget v0, Lcom/baidu/location/b;->aQ:I

    if-ge v1, v0, :cond_4

    and-int v0, v3, p1

    if-eqz v0, :cond_2

    if-nez v2, :cond_3

    const-string v0, "&ssid="

    #v0=(Reference);
    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_2
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, ";"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    :cond_2
    #v0=(Conflicted);
    shl-int/lit8 v3, v3, 0x1

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :cond_3
    const-string v0, "|"

    #v0=(Reference);
    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    :cond_4
    #v0=(Integer);
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public if()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/ai$b;->if:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public if(Lcom/baidu/location/ai$b;)Z
    .locals 5

    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    iget-object v0, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    iget-object v1, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    move v1, v0

    :goto_0
    move v3, v2

    :goto_1
    #v3=(Integer);v4=(Conflicted);
    if-ge v3, v1, :cond_2

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v4, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    #v4=(Reference);
    iget-object v0, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    move v0, v2

    :goto_2
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_0
    #v0=(Integer);v1=(Integer);v3=(Uninit);v4=(Uninit);
    iget-object v0, p1, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_1
    #v0=(Boolean);v3=(Integer);v4=(Reference);
    add-int/lit8 v0, v3, 0x1

    #v0=(Integer);
    move v3, v0

    goto :goto_1

    :cond_2
    #v4=(Conflicted);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_2

    :cond_3
    #v0=(Reference);v1=(Uninit);v3=(Uninit);v4=(Uninit);
    move v0, v2

    #v0=(Null);
    goto :goto_2
.end method

.method public int()Ljava/lang/String;
    .locals 7

    const/4 v2, 0x0

    #v2=(Null);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v0, "wifi="

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    move v1, v2

    :goto_1
    #v0=(Conflicted);v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v4, v0, Landroid/net/wifi/ScanResult;->level:I

    #v4=(Integer);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v5, ":"

    #v5=(Reference);
    const-string v6, ""

    #v6=(Reference);
    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v5, ",%d;"

    const/4 v6, 0x1

    #v6=(One);
    new-array v6, v6, [Ljava/lang/Object;

    #v6=(Reference);
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v6, v2

    invoke-static {v0, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_1

    :cond_1
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public new()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/ai$b;->int:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public try()I
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/location/ai$b;->for:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

*/}
