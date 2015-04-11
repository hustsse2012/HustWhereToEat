package com.baidu.platform.comjni.engine; class AppEngine {/*

.class public Lcom/baidu/platform/comjni/engine/AppEngine;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static GetFlaxLength(Landroid/os/Bundle;)Z
    .locals 1

    invoke-static {p0}, Lcom/baidu/platform/comjni/engine/JNIEngine;->GetFlaxLength(Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static InitEngine(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/JNIEngine;->initClass(Ljava/lang/Object;I)I

    invoke-static {p0, p1}, Lcom/baidu/platform/comjni/engine/JNIEngine;->InitEngine(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static SetProxyInfo(Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/baidu/platform/comjni/engine/JNIEngine;->SetProxyInfo(Ljava/lang/String;I)V

    return-void
.end method

.method public static StartSocketProc()Z
    .locals 1

    invoke-static {}, Lcom/baidu/platform/comjni/engine/JNIEngine;->StartSocketProc()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static UnInitEngine()Z
    .locals 1

    invoke-static {}, Lcom/baidu/platform/comjni/engine/JNIEngine;->UnInitEngine()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static despatchMessage(III)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/baidu/platform/comjni/engine/a;->a(III)V

    return-void
.end method

*/}
