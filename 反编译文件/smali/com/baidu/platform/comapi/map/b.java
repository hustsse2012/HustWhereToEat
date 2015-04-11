package com.baidu.platform.comapi.map; class b {/*

.class public Lcom/baidu/platform/comapi/map/b;
.super Lcom/baidu/platform/comapi/map/d;


# static fields
.field static b:Lcom/baidu/platform/comapi/map/b;


# instance fields
.field a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/platform/comapi/map/b;->b:Lcom/baidu/platform/comapi/map/b;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/platform/comapi/map/d;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/b;->a:Ljava/lang/String;

    iput p1, p0, Lcom/baidu/platform/comapi/map/b;->d:I

    return-void
.end method

.method public static a()Lcom/baidu/platform/comapi/map/d;
    .locals 2

    sget-object v0, Lcom/baidu/platform/comapi/map/b;->b:Lcom/baidu/platform/comapi/map/b;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/platform/comapi/map/b;

    #v0=(UninitRef);
    const/16 v1, 0x14

    #v1=(PosByte);
    invoke-direct {v0, v1}, Lcom/baidu/platform/comapi/map/b;-><init>(I)V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/map/b;->b:Lcom/baidu/platform/comapi/map/b;

    :cond_0
    #v1=(Conflicted);
    sget-object v0, Lcom/baidu/platform/comapi/map/b;->b:Lcom/baidu/platform/comapi/map/b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/b;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/b;->a:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

*/}
