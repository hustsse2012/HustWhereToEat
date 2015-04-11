package com.baidu.location; class c {/*

.class Lcom/baidu/location/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# static fields
.field private static bh:Lcom/baidu/location/c;


# instance fields
.field private be:J

.field public bf:J

.field private bg:J

.field public bi:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/c;->bh:Lcom/baidu/location/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/c;->bi:Z

    iput-wide v1, p0, Lcom/baidu/location/c;->bf:J

    iput-wide v1, p0, Lcom/baidu/location/c;->be:J

    iput-wide v1, p0, Lcom/baidu/location/c;->bg:J

    return-void
.end method

.method public static char()Lcom/baidu/location/c;
    .locals 1

    sget-object v0, Lcom/baidu/location/c;->bh:Lcom/baidu/location/c;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/c;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/c;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/c;->bh:Lcom/baidu/location/c;

    :cond_0
    sget-object v0, Lcom/baidu/location/c;->bh:Lcom/baidu/location/c;

    return-object v0
.end method


# virtual methods
.method public else()V
    .locals 2

    iget-boolean v0, p0, Lcom/baidu/location/c;->bi:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/c;->be:J

    goto :goto_0
.end method

.method public int(Ljava/lang/String;)J
    .locals 2

    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    #v0=(UninitRef);
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    :goto_0
    #v0=(LongLo);v1=(LongHi);
    return-wide v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    const-wide/16 v0, -0x1

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0
.end method

.method public new(Ljava/lang/String;)V
    .locals 6

    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    iget-boolean v0, p0, Lcom/baidu/location/c;->bi:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(LongLo);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/c;->bg:J

    iget-wide v0, p0, Lcom/baidu/location/c;->bg:J

    iget-wide v2, p0, Lcom/baidu/location/c;->be:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v2, v0, v2

    #v2=(Byte);
    if-gtz v2, :cond_0

    cmp-long v2, v0, v4

    if-ltz v2, :cond_0

    invoke-virtual {p0, p1}, Lcom/baidu/location/c;->int(Ljava/lang/String;)J

    move-result-wide v2

    #v2=(LongLo);
    cmp-long v4, v2, v4

    #v4=(Byte);
    if-lez v4, :cond_0

    add-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/baidu/location/c;->bf:J

    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Lcom/baidu/location/c;->bi:Z

    goto :goto_0
.end method

*/}
