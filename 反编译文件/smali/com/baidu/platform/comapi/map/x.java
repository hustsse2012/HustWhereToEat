package com.baidu.platform.comapi.map; class x {/*

.class public Lcom/baidu/platform/comapi/map/x;
.super Lcom/baidu/platform/comapi/map/d;


# static fields
.field static b:Lcom/baidu/platform/comapi/map/x;


# instance fields
.field a:Ljava/lang/String;

.field f:I

.field g:I

.field h:I

.field i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/platform/comapi/map/x;->b:Lcom/baidu/platform/comapi/map/x;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Lcom/baidu/platform/comapi/map/d;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/x;->a:Ljava/lang/String;

    iput v1, p0, Lcom/baidu/platform/comapi/map/x;->f:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/x;->g:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/x;->h:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/x;->i:I

    iput p1, p0, Lcom/baidu/platform/comapi/map/x;->d:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/x;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/x;->a:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "accFlag"

    #v1=(Reference);
    iget v2, p0, Lcom/baidu/platform/comapi/map/x;->f:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "centerFlag"

    iget v2, p0, Lcom/baidu/platform/comapi/map/x;->g:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v1, p0, Lcom/baidu/platform/comapi/map/x;->g:I

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    if-ne v1, v2, :cond_0

    const-string v1, "centerX"

    #v1=(Reference);
    iget v2, p0, Lcom/baidu/platform/comapi/map/x;->h:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "centerY"

    iget v2, p0, Lcom/baidu/platform/comapi/map/x;->i:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    #v1=(Conflicted);
    return-object v0
.end method

*/}
