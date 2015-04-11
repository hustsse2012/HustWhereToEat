package com.baidu.location; class p {/*

.class Lcom/baidu/location/p;
.super Lcom/baidu/location/z;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# static fields
.field private static dS:Lcom/baidu/location/p; = null

.field static final dT:I = 0xbb8


# instance fields
.field private dU:J

.field private dV:Lcom/baidu/location/BDLocation;

.field public dW:Lcom/baidu/location/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/p;->dS:Lcom/baidu/location/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Lcom/baidu/location/z;-><init>()V

    #p0=(Reference);
    iput-object v2, p0, Lcom/baidu/location/p;->dV:Lcom/baidu/location/BDLocation;

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/p;->dU:J

    iput-object v2, p0, Lcom/baidu/location/p;->dW:Lcom/baidu/location/z$a;

    new-instance v0, Lcom/baidu/location/z$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/z$a;-><init>(Lcom/baidu/location/z;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/p;->dW:Lcom/baidu/location/z$a;

    return-void
.end method

.method private am()V
    .locals 1

    invoke-static {}, Lcom/baidu/location/l;->u()Lcom/baidu/location/l;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/l;->z()V

    return-void
.end method

.method public static an()Lcom/baidu/location/p;
    .locals 1

    sget-object v0, Lcom/baidu/location/p;->dS:Lcom/baidu/location/p;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/p;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/p;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/p;->dS:Lcom/baidu/location/p;

    :cond_0
    sget-object v0, Lcom/baidu/location/p;->dS:Lcom/baidu/location/p;

    return-object v0
.end method

.method private goto(Landroid/os/Message;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Lcom/baidu/location/p;->dU:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/p;->dV:Lcom/baidu/location/BDLocation;

    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/p;->dV:Lcom/baidu/location/BDLocation;

    #v1=(Reference);
    const/16 v2, 0x1a

    #v2=(PosByte);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/location/g;->if(Lcom/baidu/location/BDLocation;I)V

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_0
    #v1=(LongHi);v2=(LongLo);
    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/location/g;->if(Landroid/os/Message;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/baidu/location/p;->void(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/p;->dW:Lcom/baidu/location/z$a;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Lcom/baidu/location/z$a;->long(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Lcom/baidu/location/p;->dU:J

    goto :goto_0
.end method


# virtual methods
.method ab()V
    .locals 3

    const-string v0, "baidu_location_service"

    #v0=(Reference);
    const-string v1, "on network exception"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/b;->do(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/p;->dV:Lcom/baidu/location/BDLocation;

    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v0

    #v0=(Reference);
    invoke-static {}, Lcom/baidu/location/ao;->bz()Lcom/baidu/location/ao;

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Lcom/baidu/location/ao;->new(Z)Lcom/baidu/location/BDLocation;

    move-result-object v1

    const/16 v2, 0x1a

    #v2=(PosByte);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/location/g;->if(Lcom/baidu/location/BDLocation;I)V

    invoke-direct {p0}, Lcom/baidu/location/p;->am()V

    return-void
.end method

.method byte(Landroid/os/Message;)V
    .locals 3

    const-string v0, "baidu_location_service"

    #v0=(Reference);
    const-string v1, "on network success"

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/b;->do(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/BDLocation;

    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v1

    const/16 v2, 0x1a

    #v2=(PosByte);
    invoke-virtual {v1, v0, v2}, Lcom/baidu/location/g;->if(Lcom/baidu/location/BDLocation;I)V

    invoke-static {v0}, Lcom/baidu/location/b;->if(Lcom/baidu/location/BDLocation;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    iput-object v0, p0, Lcom/baidu/location/p;->dV:Lcom/baidu/location/BDLocation;

    :goto_0
    invoke-direct {p0}, Lcom/baidu/location/p;->am()V

    return-void

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/p;->dV:Lcom/baidu/location/BDLocation;

    goto :goto_0
.end method

.method public else(Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/p;->goto(Landroid/os/Message;)V

    return-void
.end method

*/}
