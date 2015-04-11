package com.baidu.platform.comapi.map; class A {/*

.class public Lcom/baidu/platform/comapi/map/A;
.super Lcom/baidu/platform/comapi/map/d;


# static fields
.field static f:Lcom/baidu/platform/comapi/map/A;


# instance fields
.field a:Ljava/lang/String;

.field b:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/platform/comapi/map/A;->f:Lcom/baidu/platform/comapi/map/A;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Lcom/baidu/platform/comapi/map/d;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/A;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/platform/comapi/map/A;->b:Landroid/os/Bundle;

    iput p1, p0, Lcom/baidu/platform/comapi/map/A;->d:I

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/A;->b:Landroid/os/Bundle;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/A;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/A;->a:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/A;->b:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

*/}
