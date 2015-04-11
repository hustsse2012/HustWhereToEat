package com.baidu.location; class d$b {/*

.class Lcom/baidu/location/d$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/d;


# direct methods
.method private constructor <init>(Lcom/baidu/location/d;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/d$b;->a:Lcom/baidu/location/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/baidu/location/d;Lcom/baidu/location/d$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/d$b;-><init>(Lcom/baidu/location/d;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/d$b;->a:Lcom/baidu/location/d;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/d;->do(Lcom/baidu/location/d;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/d$b;->a:Lcom/baidu/location/d;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/d;->if(Lcom/baidu/location/d;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/location/l;->u()Lcom/baidu/location/l;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/l;->z()V

    iget-object v0, p0, Lcom/baidu/location/d$b;->a:Lcom/baidu/location/d;

    iget-object v0, v0, Lcom/baidu/location/d;->do:Landroid/os/Handler;

    sget v1, Lcom/baidu/location/b;->ao:I

    #v1=(Integer);
    int-to-long v1, v1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v0, p0, Lcom/baidu/location/d$b;->a:Lcom/baidu/location/d;

    const/4 v1, 0x1

    #v1=(One);
    invoke-static {v0, v1}, Lcom/baidu/location/d;->a(Lcom/baidu/location/d;Z)Z

    :goto_0
    #v1=(Boolean);v2=(Conflicted);
    return-void

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/d$b;->a:Lcom/baidu/location/d;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Lcom/baidu/location/d;->a(Lcom/baidu/location/d;Z)Z

    goto :goto_0
.end method

*/}
