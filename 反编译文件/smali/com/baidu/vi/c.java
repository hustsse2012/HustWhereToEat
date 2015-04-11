package com.baidu.vi; class c {/*

.class public Lcom/baidu/vi/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/vi/c$1;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(Landroid/net/NetworkInfo;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/vi/c;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/vi/c;->b:I

    sget-object v0, Lcom/baidu/vi/c$1;->a:[I

    #v0=(Reference);
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/net/NetworkInfo$State;->ordinal()I

    move-result v1

    #v1=(Integer);
    aget v0, v0, v1

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Lcom/baidu/vi/c;->c:I

    :goto_0
    #v0=(PosByte);
    return-void

    :pswitch_0
    #v0=(Integer);
    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/vi/c;->c:I

    goto :goto_0

    :pswitch_1
    #v0=(Integer);
    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Lcom/baidu/vi/c;->c:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

*/}
