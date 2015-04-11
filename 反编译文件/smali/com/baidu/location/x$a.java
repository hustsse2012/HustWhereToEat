package com.baidu.location; class x$a {/*

.class Lcom/baidu/location/x$a;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/x;

.field private volatile do:Z

.field private if:J


# direct methods
.method constructor <init>(Lcom/baidu/location/x;)V
    .locals 2

    iput-object p1, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/x$a;->do:Z

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/x$a;->if:J

    return-void
.end method

.method static synthetic a(Lcom/baidu/location/x$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/x$a;->do:Z

    return p1
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v4, 0x0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Null);
    iget-boolean v0, p0, Lcom/baidu/location/x$a;->do:Z

    #v0=(Boolean);
    if-eqz v0, :cond_6

    const-string v0, "IndoorSdk"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "mm:"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    invoke-static {v2}, Lcom/baidu/location/x;->for(Lcom/baidu/location/x;)Lcom/baidu/location/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/baidu/location/aa;->a0()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/location/b;->if(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    invoke-static {v0}, Lcom/baidu/location/x;->int(Lcom/baidu/location/x;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/x$a;->if:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/location/x;->do(Lcom/baidu/location/x;)J

    move-result-wide v2

    #v2=(LongLo);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gtz v0, :cond_1

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/x$a;->if:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/x;->for(Lcom/baidu/location/x;)Lcom/baidu/location/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/aa;->a0()I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    if-eq v0, v1, :cond_3

    :cond_2
    #v1=(Conflicted);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/x$a;->if:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x445c

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_4

    :cond_3
    #v0=(Integer);v1=(Conflicted);
    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/ai;->bc()Z

    iget-object v0, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    invoke-static {v0}, Lcom/baidu/location/x;->for(Lcom/baidu/location/x;)Lcom/baidu/location/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/aa;->aZ()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/x$a;->if:J

    iget-object v0, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    #v0=(Reference);
    invoke-static {v0, v4}, Lcom/baidu/location/x;->if(Lcom/baidu/location/x;Z)Z

    :cond_4
    #v0=(Conflicted);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    iget-object v2, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/location/x;->if(Lcom/baidu/location/x;)J

    move-result-wide v2

    #v2=(LongLo);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0x55f0

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/baidu/location/x$a;->a:Lcom/baidu/location/x;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/location/x;->fF:Lcom/baidu/location/x$c;

    const/16 v1, 0x29

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Lcom/baidu/location/x$c;->sendEmptyMessage(I)Z

    :cond_5
    #v0=(Conflicted);v1=(Conflicted);
    const-wide/16 v0, 0x7d0

    :try_start_0
    #v0=(LongLo);v1=(LongHi);
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    #v0=(Reference);
    iput-boolean v4, p0, Lcom/baidu/location/x$a;->do:Z

    :cond_6
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

*/}
