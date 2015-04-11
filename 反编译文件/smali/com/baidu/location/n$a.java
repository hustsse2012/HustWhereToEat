package com.baidu.location; class n$a {/*

.class public Lcom/baidu/location/n$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/n;

.field public byte:J

.field public do:I

.field public for:I

.field public if:I

.field public int:I

.field public new:C

.field public try:I


# direct methods
.method public constructor <init>(Lcom/baidu/location/n;)V
    .locals 3

    const/4 v2, -0x1

    #v2=(Byte);
    iput-object p1, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput v2, p0, Lcom/baidu/location/n$a;->for:I

    iput v2, p0, Lcom/baidu/location/n$a;->try:I

    iput v2, p0, Lcom/baidu/location/n$a;->do:I

    iput v2, p0, Lcom/baidu/location/n$a;->if:I

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/n$a;->byte:J

    iput v2, p0, Lcom/baidu/location/n$a;->int:I

    const/4 v0, 0x0

    #v0=(Null);
    iput-char v0, p0, Lcom/baidu/location/n$a;->new:C

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    iput-wide v0, p0, Lcom/baidu/location/n$a;->byte:J

    return-void
.end method

.method public constructor <init>(Lcom/baidu/location/n;IIIIC)V
    .locals 4

    const/4 v2, -0x1

    #v2=(Byte);
    iput-object p1, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput v2, p0, Lcom/baidu/location/n$a;->for:I

    iput v2, p0, Lcom/baidu/location/n$a;->try:I

    iput v2, p0, Lcom/baidu/location/n$a;->do:I

    iput v2, p0, Lcom/baidu/location/n$a;->if:I

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/n$a;->byte:J

    iput v2, p0, Lcom/baidu/location/n$a;->int:I

    const/4 v0, 0x0

    #v0=(Null);
    iput-char v0, p0, Lcom/baidu/location/n$a;->new:C

    iput p2, p0, Lcom/baidu/location/n$a;->for:I

    iput p3, p0, Lcom/baidu/location/n$a;->try:I

    iput p4, p0, Lcom/baidu/location/n$a;->do:I

    iput p5, p0, Lcom/baidu/location/n$a;->if:I

    iput-char p6, p0, Lcom/baidu/location/n$a;->new:C

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    const-wide/16 v2, 0x3e8

    #v2=(LongLo);v3=(LongHi);
    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/baidu/location/n$a;->byte:J

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuffer;

    #v0=(UninitRef);
    const/16 v1, 0x80

    #v1=(PosShort);
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    #v0=(Reference);
    iget v1, p0, Lcom/baidu/location/n$a;->try:I

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, "H"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Lcom/baidu/location/n$a;->for:I

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, "K"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Lcom/baidu/location/n$a;->if:I

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, "Q"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Lcom/baidu/location/n$a;->do:I

    #v1=(Integer);
    add-int/lit16 v1, v1, 0xcb

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/baidu/location/n$a;)Z
    .locals 2

    iget v0, p0, Lcom/baidu/location/n$a;->for:I

    #v0=(Integer);
    iget v1, p1, Lcom/baidu/location/n$a;->for:I

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/n$a;->try:I

    iget v1, p1, Lcom/baidu/location/n$a;->try:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/n$a;->if:I

    iget v1, p1, Lcom/baidu/location/n$a;->if:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public do()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/n$a;->byte:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    invoke-static {}, Lcom/baidu/location/n;->N()J

    move-result-wide v2

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

.method public for()Z
    .locals 2

    iget v0, p0, Lcom/baidu/location/n$a;->for:I

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-le v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/n$a;->try:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public if()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuffer;

    #v0=(UninitRef);
    const/16 v1, 0x40

    #v1=(PosByte);
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    #v0=(Reference);
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v1=(Reference);
    const-string v2, "cell=%d|%d|%d|%d:%d"

    #v2=(Reference);
    const/4 v3, 0x5

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    iget v5, p0, Lcom/baidu/location/n$a;->do:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x1

    #v4=(One);
    iget v5, p0, Lcom/baidu/location/n$a;->if:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x2

    #v4=(PosByte);
    iget v5, p0, Lcom/baidu/location/n$a;->for:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x3

    iget v5, p0, Lcom/baidu/location/n$a;->try:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x4

    iget v5, p0, Lcom/baidu/location/n$a;->int:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public int()Ljava/lang/String;
    .locals 7

    const/4 v2, 0x0

    :try_start_0
    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->int(Lcom/baidu/location/n;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNeighboringCellInfo()Ljava/util/List;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_4

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_4

    const-string v1, "&nc="

    #v1=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    #v4=(Reference);
    move v3, v0

    :goto_0
    #v0=(Reference);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/telephony/NeighboringCellInfo;

    if-nez v3, :cond_1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getLac()I

    move-result v5

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/location/n$a;->for:I

    #v6=(Integer);
    if-eq v5, v6, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getLac()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getCid()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getRssi()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    add-int/lit8 v1, v3, 0x1

    #v1=(Integer);
    move v3, v1

    move-object v1, v0

    #v1=(Reference);
    goto :goto_0

    :cond_0
    #v5=(Integer);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getCid()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getRssi()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    #v5=(Conflicted);v6=(Conflicted);
    const/16 v5, 0x8

    #v5=(PosByte);
    if-ge v3, v5, :cond_3

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getLac()I

    move-result v5

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/location/n$a;->for:I

    #v6=(Integer);
    if-eq v5, v6, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ";"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getLac()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getCid()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getRssi()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    #v5=(Integer);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ";"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getCid()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/telephony/NeighboringCellInfo;->getRssi()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto/16 :goto_1

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v0, v2

    :goto_2
    return-object v0

    :cond_3
    #v0=(Conflicted);v1=(Reference);v3=(Integer);v4=(Reference);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_2

    :cond_4
    #v0=(Conflicted);v1=(Uninit);v3=(Reference);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    move-object v0, v2

    #v0=(Null);
    goto :goto_2
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    const-wide/16 v9, 0x3e8

    #v9=(LongLo);v10=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    new-instance v3, Ljava/lang/StringBuffer;

    #v3=(UninitRef);
    const/16 v0, 0x80

    #v0=(PosShort);
    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    #v3=(Reference);
    const-string v0, "&nw="

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    invoke-static {v0}, Lcom/baidu/location/n;->for(Lcom/baidu/location/n;)Lcom/baidu/location/n$a;

    move-result-object v0

    iget-char v0, v0, Lcom/baidu/location/n$a;->new:C

    #v0=(Char);
    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v0=(Reference);
    const-string v1, "&cl=%d|%d|%d|%d&cl_s=%d"

    #v1=(Reference);
    const/4 v4, 0x5

    #v4=(PosByte);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    iget v5, p0, Lcom/baidu/location/n$a;->do:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v2

    const/4 v5, 0x1

    #v5=(One);
    iget v6, p0, Lcom/baidu/location/n$a;->if:I

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x2

    #v5=(PosByte);
    iget v6, p0, Lcom/baidu/location/n$a;->for:I

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x3

    iget v6, p0, Lcom/baidu/location/n$a;->try:I

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x4

    iget v6, p0, Lcom/baidu/location/n$a;->int:I

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    invoke-static {v0, v1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "&cl_t="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-wide v0, p0, Lcom/baidu/location/n$a;->byte:J

    #v0=(LongLo);v1=(LongHi);
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->do(Lcom/baidu/location/n;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    invoke-static {v0}, Lcom/baidu/location/n;->do(Lcom/baidu/location/n;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->do(Lcom/baidu/location/n;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    #v4=(Integer);
    const-string v0, "&clt="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move v1, v2

    :goto_0
    #v0=(Conflicted);v1=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-ge v1, v4, :cond_5

    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->do(Lcom/baidu/location/n;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/n$a;

    iget v5, v0, Lcom/baidu/location/n$a;->do:I

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/location/n$a;->do:I

    #v6=(Integer);
    if-eq v5, v6, :cond_0

    iget v5, v0, Lcom/baidu/location/n$a;->do:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_0
    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v5, v0, Lcom/baidu/location/n$a;->if:I

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/location/n$a;->if:I

    if-eq v5, v6, :cond_1

    iget v5, v0, Lcom/baidu/location/n$a;->if:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_1
    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v5, v0, Lcom/baidu/location/n$a;->for:I

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/location/n$a;->for:I

    if-eq v5, v6, :cond_2

    iget v5, v0, Lcom/baidu/location/n$a;->for:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_2
    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v5, v0, Lcom/baidu/location/n$a;->try:I

    #v5=(Integer);
    iget v6, p0, Lcom/baidu/location/n$a;->try:I

    if-eq v5, v6, :cond_3

    iget v5, v0, Lcom/baidu/location/n$a;->try:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_3
    const-string v5, "|"

    #v5=(Reference);
    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v5, v4, -0x1

    #v5=(Integer);
    if-eq v1, v5, :cond_4

    iget-wide v5, v0, Lcom/baidu/location/n$a;->byte:J

    #v5=(LongLo);v6=(LongHi);
    div-long/2addr v5, v9

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    :goto_1
    const-string v0, ";"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v1, 0x1

    #v0=(Integer);
    move v1, v0

    goto :goto_0

    :cond_4
    #v0=(Reference);v5=(Integer);v6=(Integer);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    #v5=(LongLo);v6=(LongHi);
    iget-wide v7, v0, Lcom/baidu/location/n$a;->byte:J

    #v7=(LongLo);v8=(LongHi);
    sub-long/2addr v5, v7

    div-long/2addr v5, v9

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_5
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->new(Lcom/baidu/location/n;)I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x64

    #v1=(PosByte);
    if-le v0, v1, :cond_6

    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0, v2}, Lcom/baidu/location/n;->if(Lcom/baidu/location/n;I)I

    :cond_6
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->if(Lcom/baidu/location/n;)I

    move-result v0

    #v0=(Integer);
    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/baidu/location/n$a;->a:Lcom/baidu/location/n;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/location/n;->new(Lcom/baidu/location/n;)I

    move-result v1

    #v1=(Integer);
    add-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "&cs="

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
