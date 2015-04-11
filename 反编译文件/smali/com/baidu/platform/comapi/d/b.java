package com.baidu.platform.comapi.d; class b {/*

.class public Lcom/baidu/platform/comapi/d/b;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a()I
    .locals 5

    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x3

    #v2=(PosByte);
    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    const-string v4, "bad_removal"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v4, "checking"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_3

    :cond_2
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(PosByte);
    const-string v4, "mounted"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_4

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(PosByte);
    const-string v4, "mounted_ro"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    const-string v4, "nofs"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    const-string v4, "removed"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_5

    move v0, v2

    goto :goto_0

    :cond_5
    const-string v4, "shared"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_6

    move v0, v2

    goto :goto_0

    :cond_6
    const-string v4, "unmountable"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    const-string v0, "unmounted"

    #v0=(Reference);
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    move v0, v2

    #v0=(PosByte);
    goto :goto_0
.end method

*/}
