package com.baidu.platform.comapi.c; class a {/*

.class public Lcom/baidu/platform/comapi/c/a;
.super Ljava/lang/Object;


# static fields
.field public static a:Lcom/baidu/platform/comapi/c/a;


# instance fields
.field private b:Lorg/json/JSONObject;

.field private c:Lcom/baidu/platform/comjni/base/userdatacollect/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/c/a;->b:Lorg/json/JSONObject;

    iput-object v0, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    return-void
.end method

.method public static a()Lcom/baidu/platform/comapi/c/a;
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    #v1=(Reference);
    if-nez v1, :cond_0

    new-instance v1, Lcom/baidu/platform/comapi/c/a;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/c/a;-><init>()V

    #v1=(Reference);
    sput-object v1, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    sget-object v1, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    invoke-direct {v1}, Lcom/baidu/platform/comapi/c/a;->e()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    sput-object v0, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    #v0=(Reference);
    goto :goto_0
.end method

.method public static b()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    #v0=(Reference);
    if-eqz v0, :cond_1

    sget-object v0, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    iget-object v0, v0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    iget-object v0, v0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/base/userdatacollect/a;->b()I

    sget-object v0, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    iput-object v1, v0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    :cond_0
    sput-object v1, Lcom/baidu/platform/comapi/c/a;->a:Lcom/baidu/platform/comapi/c/a;

    :cond_1
    return-void
.end method

.method private e()Z
    .locals 2

    const/4 v0, 0x1

    #v0=(One);
    iget-object v1, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    #v1=(Reference);
    if-nez v1, :cond_0

    new-instance v1, Lcom/baidu/platform/comjni/base/userdatacollect/a;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comjni/base/userdatacollect/a;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    iget-object v1, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    invoke-virtual {v1}, Lcom/baidu/platform/comjni/base/userdatacollect/a;->a()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v1=(Integer);
    new-instance v1, Lorg/json/JSONObject;

    #v1=(UninitRef);
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/platform/comapi/c/a;->b:Lorg/json/JSONObject;

    goto :goto_0
.end method

.method private f()Landroid/os/Bundle;
    .locals 6

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "pd"

    #v1=(Reference);
    const-string v2, "mapsdk"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "os"

    const-string v2, "android"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "sv"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ov"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "im"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "channel"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mb"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ver"

    const-string v2, "2"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "sw"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->h()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "sh"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->j()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "resid"

    const-string v2, "02"

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "dpi"

    const-string v2, "(%d,%d)"

    const/4 v3, 0x2

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->l()I

    move-result v5

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x1

    #v4=(One);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->m()I

    move-result v5

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    #v0=(Reference);
    const-string v1, "ActParam"

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/platform/comapi/c/a;->b:Lorg/json/JSONObject;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v2=(Conflicted);
    iget-object v1, p0, Lcom/baidu/platform/comapi/c/a;->b:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v1

    #v1=(Integer);
    if-gtz v1, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    invoke-virtual {v0, p1, v3}, Lcom/baidu/platform/comjni/base/userdatacollect/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    #v1=(Conflicted);
    iput-object v3, p0, Lcom/baidu/platform/comapi/c/a;->b:Lorg/json/JSONObject;

    new-instance v0, Lorg/json/JSONObject;

    #v0=(UninitRef);
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/c/a;->b:Lorg/json/JSONObject;

    return-void

    :cond_0
    #v1=(Integer);
    iget-object v1, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    #v1=(Reference);
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lcom/baidu/platform/comjni/base/userdatacollect/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    #v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/baidu/platform/comapi/c/a;->b:Lorg/json/JSONObject;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1
.end method

.method public c()Z
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->r()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/udc/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/baidu/platform/comapi/c/a;->f()Landroid/os/Bundle;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    #v2=(Reference);
    invoke-virtual {v2, v0, v1}, Lcom/baidu/platform/comjni/base/userdatacollect/a;->a(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/c/a;->c:Lcom/baidu/platform/comjni/base/userdatacollect/a;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comjni/base/userdatacollect/a;->c()V

    return-void
.end method

*/}
