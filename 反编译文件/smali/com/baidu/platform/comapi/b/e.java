package com.baidu.platform.comapi.b; class e {/*

.class public Lcom/baidu/platform/comapi/b/e;
.super Ljava/lang/Object;


# static fields
.field private static b:Lcom/baidu/platform/comapi/b/e;


# instance fields
.field private a:Lcom/baidu/platform/comjni/map/search/a;

.field private c:Lcom/baidu/platform/comapi/b/d;

.field private d:Landroid/os/Handler;

.field private e:I

.field private f:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v1, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    iput-object v1, p0, Lcom/baidu/platform/comapi/b/e;->c:Lcom/baidu/platform/comapi/b/d;

    iput-object v1, p0, Lcom/baidu/platform/comapi/b/e;->d:Landroid/os/Handler;

    const/16 v0, 0xa

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/platform/comapi/b/e;->e:I

    iput-object v1, p0, Lcom/baidu/platform/comapi/b/e;->f:Landroid/os/Bundle;

    return-void
.end method

.method private a(Lcom/baidu/platform/comapi/b/b;)Landroid/os/Bundle;
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "type"

    #v1=(Reference);
    iget v2, p1, Lcom/baidu/platform/comapi/b/b;->a:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "uid"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->d:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v1, :cond_1

    const-string v1, "x"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "y"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    #v2=(Conflicted);
    const-string v1, "keyword"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/baidu/platform/comapi/b/e;)Lcom/baidu/platform/comapi/b/d;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->c:Lcom/baidu/platform/comapi/b/d;

    #v0=(Reference);
    return-object v0
.end method

.method public static a()Lcom/baidu/platform/comapi/b/e;
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    sget-object v1, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    #v1=(Reference);
    if-nez v1, :cond_0

    new-instance v1, Lcom/baidu/platform/comapi/b/e;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/b/e;-><init>()V

    #v1=(Reference);
    sput-object v1, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    sget-object v1, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    invoke-direct {v1}, Lcom/baidu/platform/comapi/b/e;->d()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    sput-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    goto :goto_0
.end method

.method public static b()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    if-eqz v0, :cond_2

    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    iget-object v0, v0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    iget-object v0, v0, Lcom/baidu/platform/comapi/b/e;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/16 v0, 0x7d0

    #v0=(PosShort);
    sget-object v1, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/platform/comapi/b/e;->d:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    iput-object v2, v0, Lcom/baidu/platform/comapi/b/e;->d:Landroid/os/Handler;

    :cond_0
    #v1=(Conflicted);
    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    iget-object v0, v0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/search/a;->b()I

    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    iput-object v2, v0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    iput-object v2, v0, Lcom/baidu/platform/comapi/b/e;->f:Landroid/os/Bundle;

    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    iget-object v0, v0, Lcom/baidu/platform/comapi/b/e;->c:Lcom/baidu/platform/comapi/b/d;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/b/d;->a()V

    sget-object v0, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    iput-object v2, v0, Lcom/baidu/platform/comapi/b/e;->c:Lcom/baidu/platform/comapi/b/d;

    :cond_1
    sput-object v2, Lcom/baidu/platform/comapi/b/e;->b:Lcom/baidu/platform/comapi/b/e;

    :cond_2
    return-void
.end method

.method private d()Z
    .locals 3

    const/4 v0, 0x1

    #v0=(One);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    #v1=(Reference);
    if-nez v1, :cond_0

    new-instance v1, Lcom/baidu/platform/comjni/map/search/a;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comjni/map/search/a;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    iget-object v1, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v1}, Lcom/baidu/platform/comjni/map/search/a;->a()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v1=(Integer);v2=(Uninit);
    new-instance v1, Lcom/baidu/platform/comapi/b/d;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/b/d;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/platform/comapi/b/e;->c:Lcom/baidu/platform/comapi/b/d;

    new-instance v1, Lcom/baidu/platform/comapi/b/f;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/baidu/platform/comapi/b/f;-><init>(Lcom/baidu/platform/comapi/b/e;)V

    #v1=(Reference);
    iput-object v1, p0, Lcom/baidu/platform/comapi/b/e;->d:Landroid/os/Handler;

    const/16 v1, 0x7d0

    #v1=(PosShort);
    iget-object v2, p0, Lcom/baidu/platform/comapi/b/e;->d:Landroid/os/Handler;

    #v2=(Reference);
    invoke-static {v1, v2}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    iget-object v1, p0, Lcom/baidu/platform/comapi/b/e;->c:Lcom/baidu/platform/comapi/b/d;

    #v1=(Reference);
    invoke-virtual {v1, p0}, Lcom/baidu/platform/comapi/b/d;->a(Lcom/baidu/platform/comapi/b/e;)V

    goto :goto_0
.end method

.method private e()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->f:Landroid/os/Bundle;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/b/e;->f:Landroid/os/Bundle;

    :goto_0
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->f:Landroid/os/Bundle;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->f:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->clear()V

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    if-lez p1, :cond_0

    const/16 v0, 0x32

    #v0=(PosByte);
    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/baidu/platform/comapi/b/e;->e:I

    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/b/c;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->c:Lcom/baidu/platform/comapi/b/d;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/b/d;->a(Lcom/baidu/platform/comapi/b/c;)V

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/b/b;Lcom/baidu/platform/comapi/b/b;Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;IILjava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/baidu/platform/comapi/b/b;",
            "Lcom/baidu/platform/comapi/b/b;",
            "Ljava/lang/String;",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "II",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p3, :cond_0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-direct {p0}, Lcom/baidu/platform/comapi/b/e;->e()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {p0, p1}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/b/b;)Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {p0, p2}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/b/b;)Landroid/os/Bundle;

    move-result-object v3

    #v3=(Reference);
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    const-string v4, "start"

    #v4=(Reference);
    invoke-virtual {v1, v4, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v2, "end"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const/4 v2, 0x3

    #v2=(PosByte);
    if-lt p6, v2, :cond_0

    const/4 v2, 0x6

    if-gt p6, v2, :cond_0

    const-string v0, "strategy"

    #v0=(Reference);
    invoke-virtual {v1, v0, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "cityid"

    invoke-virtual {v1, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p4, :cond_2

    iget-object v0, p4, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v0, :cond_2

    iget-object v0, p4, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v0, :cond_2

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v2, "level"

    #v2=(Reference);
    invoke-virtual {v0, v2, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "ll_x"

    iget-object v3, p4, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "ll_y"

    iget-object v3, p4, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "ru_x"

    iget-object v3, p4, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "ru_y"

    iget-object v3, p4, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "mapbound"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    #v2=(Conflicted);v3=(Conflicted);
    if-eqz p7, :cond_4

    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    invoke-interface {p7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    #v3=(Reference);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-interface {p7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    #v0=(Boolean);
    const-string v0, "extparams"

    #v0=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    #v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/search/a;->d(Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    goto/16 :goto_0
.end method

.method public a(Lcom/baidu/platform/comapi/b/b;Lcom/baidu/platform/comapi/b/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;IIILjava/util/ArrayList;Ljava/util/Map;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/baidu/platform/comapi/b/b;",
            "Lcom/baidu/platform/comapi/b/b;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "III",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/baidu/platform/comapi/b/g;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v1

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    iget-object v1, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    if-nez v1, :cond_3

    if-eqz p4, :cond_2

    const-string v1, ""

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    :cond_2
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0

    :cond_3
    #v1=(Conflicted);
    iget-object v1, p2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    if-nez v1, :cond_5

    if-eqz p5, :cond_4

    const-string v1, ""

    move-object/from16 v0, p5

    #v0=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_5

    :cond_4
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0

    :cond_5
    #v1=(Conflicted);
    invoke-direct {p0}, Lcom/baidu/platform/comapi/b/e;->e()Landroid/os/Bundle;

    move-result-object v6

    #v6=(Reference);
    const-string v1, "starttype"

    #v1=(Reference);
    iget v2, p1, Lcom/baidu/platform/comapi/b/b;->a:I

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v1, :cond_6

    const-string v1, "startptx"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "startpty"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_6
    const-string v1, "startkeyword"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "startuid"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->d:Ljava/lang/String;

    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "endtype"

    iget v2, p2, Lcom/baidu/platform/comapi/b/b;->a:I

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v1, :cond_7

    const-string v1, "endptx"

    iget-object v2, p2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "endpty"

    iget-object v2, p2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_7
    const-string v1, "endkeyword"

    iget-object v2, p2, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "enduid"

    iget-object v2, p2, Lcom/baidu/platform/comapi/b/b;->d:Ljava/lang/String;

    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "level"

    move/from16 v0, p7

    #v0=(Integer);
    invoke-virtual {v6, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p6, :cond_8

    move-object/from16 v0, p6

    #v0=(Reference);
    iget-object v1, v0, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v1, :cond_8

    move-object/from16 v0, p6

    iget-object v1, v0, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v1, :cond_8

    const-string v1, "ll_x"

    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "ll_y"

    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "ru_x"

    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "ru_y"

    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_8
    #v0=(Conflicted);v2=(Conflicted);
    const-string v1, "strategy"

    move/from16 v0, p8

    #v0=(Integer);
    invoke-virtual {v6, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "cityid"

    invoke-virtual {v6, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "st_cityid"

    invoke-virtual {v6, v1, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "en_cityid"

    move-object/from16 v0, p5

    #v0=(Reference);
    invoke-virtual {v6, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "traffic"

    move/from16 v0, p9

    #v0=(Integer);
    invoke-virtual {v6, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p10, :cond_d

    invoke-virtual/range {p10 .. p10}, Ljava/util/ArrayList;->size()I

    move-result v7

    #v7=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    const-string v4, ""

    #v4=(Reference);
    const-string v2, ""

    #v2=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    move v5, v1

    :goto_1
    #v0=(Conflicted);v1=(Reference);v3=(Integer);v5=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    if-ge v5, v7, :cond_c

    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    #v8=(UninitRef);
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    #v8=(Reference);
    move-object/from16 v0, p10

    #v0=(Reference);
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/b/g;

    iget-object v1, v1, Lcom/baidu/platform/comapi/b/g;->a:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v1, :cond_b

    const-string v1, "type"

    const/4 v9, 0x1

    #v9=(One);
    invoke-virtual {v8, v1, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :goto_2
    #v9=(PosByte);
    const-string v9, "keyword"

    #v9=(Reference);
    move-object/from16 v0, p10

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/b/g;

    iget-object v1, v1, Lcom/baidu/platform/comapi/b/g;->b:Ljava/lang/String;

    invoke-virtual {v8, v9, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v0, p10

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/b/g;

    iget-object v1, v1, Lcom/baidu/platform/comapi/b/g;->a:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v1, :cond_9

    const-string v9, "xy"

    new-instance v10, Ljava/lang/StringBuilder;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    #v10=(Reference);
    move-object/from16 v0, p10

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/b/g;

    iget-object v1, v1, Lcom/baidu/platform/comapi/b/g;->a:Lcom/baidu/platform/comapi/basestruct/c;

    iget v1, v1, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v10, ","

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p10

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/b/g;

    iget-object v1, v1, Lcom/baidu/platform/comapi/b/g;->a:Lcom/baidu/platform/comapi/basestruct/c;

    iget v1, v1, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v9, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    #v10=(Conflicted);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    move-object/from16 v0, p10

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/platform/comapi/b/g;

    iget-object v1, v1, Lcom/baidu/platform/comapi/b/g;->c:Ljava/lang/String;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v2

    add-int/lit8 v4, v7, -0x1

    #v4=(Integer);
    if-eq v3, v4, :cond_a

    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, "|"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, "|"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v1

    :cond_a
    #v4=(Conflicted);
    add-int/lit8 v3, v3, 0x1

    :goto_3
    #v0=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    add-int/lit8 v4, v5, 0x1

    #v4=(Integer);
    move v5, v4

    move-object v4, v2

    #v4=(Reference);
    move-object v2, v1

    goto/16 :goto_1

    :cond_b
    :try_start_3
    #v0=(Reference);v8=(Reference);
    const-string v1, "type"

    const/4 v9, 0x2

    #v9=(PosByte);
    invoke-virtual {v8, v1, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_2

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v1

    #v1=(Reference);
    move-object v1, v2

    move-object v2, v4

    goto :goto_3

    :cond_c
    const-string v1, "wp"

    invoke-virtual {v6, v1, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "wpc"

    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_d
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    if-eqz p11, :cond_f

    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    invoke-interface/range {p11 .. p11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    #v3=(Reference);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/lang/String;

    move-object/from16 v0, p11

    #v0=(Reference);
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_e
    #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);
    const-string v1, "extparams"

    #v1=(Reference);
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_f
    #v2=(Conflicted);v3=(Conflicted);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v1, v6}, Lcom/baidu/platform/comjni/map/search/a;->e(Landroid/os/Bundle;)Z

    move-result v1

    #v1=(Boolean);
    goto/16 :goto_0

    :catch_1
    #v0=(Reference);v1=(Reference);v2=(Reference);v3=(Integer);v5=(Integer);v7=(Integer);v8=(Reference);v9=(Reference);
    move-exception v4

    #v4=(Reference);
    goto :goto_3

    :catch_2
    #v2=(Conflicted);
    move-exception v2

    #v2=(Reference);
    move-object v2, v4

    goto :goto_3
.end method

.method public a(Lcom/baidu/platform/comapi/b/b;Lcom/baidu/platform/comapi/b/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;ILjava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/baidu/platform/comapi/b/b;",
            "Lcom/baidu/platform/comapi/b/b;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "I",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-object v1, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    if-nez v1, :cond_2

    if-eqz p4, :cond_0

    const-string v1, ""

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    :cond_2
    #v1=(Conflicted);
    iget-object v1, p2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    if-nez v1, :cond_3

    if-eqz p5, :cond_0

    const-string v1, ""

    invoke-virtual {p5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    :cond_3
    #v1=(Conflicted);
    invoke-direct {p0}, Lcom/baidu/platform/comapi/b/e;->e()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    const-string v0, "starttype"

    #v0=(Reference);
    iget v2, p1, Lcom/baidu/platform/comapi/b/b;->a:I

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v0, :cond_4

    const-string v0, "startptx"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "startpty"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_4
    const-string v0, "startkeyword"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "startuid"

    iget-object v2, p1, Lcom/baidu/platform/comapi/b/b;->d:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "endtype"

    iget v2, p2, Lcom/baidu/platform/comapi/b/b;->a:I

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v0, :cond_5

    const-string v0, "endptx"

    iget-object v2, p2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "endpty"

    iget-object v2, p2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    const-string v0, "endkeyword"

    iget-object v2, p2, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "enduid"

    iget-object v2, p2, Lcom/baidu/platform/comapi/b/b;->d:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-virtual {v1, v0, p7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p6, :cond_6

    iget-object v0, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v0, :cond_6

    iget-object v0, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    if-eqz v0, :cond_6

    const-string v0, "ll_x"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ll_y"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_x"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_y"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_6
    #v2=(Conflicted);
    const-string v0, "cityid"

    invoke-virtual {v1, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "st_cityid"

    invoke-virtual {v1, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "en_cityid"

    invoke-virtual {v1, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p8, :cond_8

    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    invoke-interface {p8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    #v3=(Reference);v4=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-interface {p8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    #v0=(Boolean);v4=(Conflicted);
    const-string v0, "extparams"

    #v0=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_8
    #v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/search/a;->f(Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    goto/16 :goto_0
.end method

.method public a(Lcom/baidu/platform/comapi/basestruct/c;)Z
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    iget-object v2, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    #v2=(Reference);
    invoke-virtual {v2, v1, v0}, Lcom/baidu/platform/comjni/map/search/a;->a(II)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public a(Lcom/baidu/platform/comapi/basestruct/c;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    #v0=(Reference);
    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2, p2, p3}, Lcom/baidu/platform/comjni/map/search/a;->a(IILjava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x63

    #v3=(PosByte);
    if-gt v2, v3, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/search/a;->a(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public a(Ljava/lang/String;IIILcom/baidu/platform/comapi/basestruct/b;Lcom/baidu/platform/comapi/basestruct/b;Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "III",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x63

    #v3=(PosByte);
    if-gt v2, v3, :cond_0

    invoke-direct {p0}, Lcom/baidu/platform/comapi/b/e;->e()Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    const-string v0, "keyword"

    #v0=(Reference);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pagenum"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "count"

    iget v1, p0, Lcom/baidu/platform/comapi/b/e;->e:I

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "cityid"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "level"

    invoke-virtual {v2, v0, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p6, :cond_2

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "ll_x"

    #v1=(Reference);
    iget-object v3, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "ll_y"

    iget-object v3, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "ru_x"

    iget-object v3, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "ru_y"

    iget-object v3, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "mapbound"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    #v1=(Conflicted);
    if-eqz p5, :cond_3

    const-string v0, "ll_x"

    iget-object v1, p5, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ll_y"

    iget-object v1, p5, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_x"

    iget-object v1, p5, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_y"

    iget-object v1, p5, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "loc_x"

    iget-object v1, p5, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    iget-object v3, p5, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    add-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "loc_y"

    iget-object v1, p5, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v1

    #v1=(Integer);
    iget-object v3, p5, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v3

    #v3=(Integer);
    add-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    #v1=(Conflicted);
    if-eqz p7, :cond_5

    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    invoke-interface {p7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    #v3=(Reference);v4=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-interface {p7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    #v0=(Boolean);v4=(Conflicted);
    const-string v0, "extparams"

    #v0=(Reference);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    #v1=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v0, v2}, Lcom/baidu/platform/comjni/map/search/a;->b(Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    goto/16 :goto_0
.end method

.method public a(Ljava/lang/String;IILcom/baidu/platform/comapi/basestruct/b;ILcom/baidu/platform/comapi/basestruct/c;Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "I",
            "Lcom/baidu/platform/comapi/basestruct/c;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p4, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x63

    #v3=(PosByte);
    if-gt v2, v3, :cond_0

    invoke-direct {p0}, Lcom/baidu/platform/comapi/b/e;->e()Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    const-string v0, "keyword"

    #v0=(Reference);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pagenum"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "count"

    iget v1, p0, Lcom/baidu/platform/comapi/b/e;->e:I

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "cityid"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-virtual {v2, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p4, :cond_2

    const-string v0, "ll_x"

    iget-object v1, p4, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ll_y"

    iget-object v1, p4, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_x"

    iget-object v1, p4, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_y"

    iget-object v1, p4, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    #v1=(Conflicted);
    if-eqz p6, :cond_3

    const-string v0, "loc_x"

    iget v1, p6, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "loc_y"

    iget v1, p6, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    #v1=(Conflicted);
    if-eqz p7, :cond_5

    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    invoke-interface {p7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    #v3=(Reference);v4=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-interface {p7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    #v0=(Boolean);v4=(Conflicted);
    const-string v0, "extparams"

    #v0=(Reference);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    #v1=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v0, v2}, Lcom/baidu/platform/comjni/map/search/a;->h(Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    goto/16 :goto_0
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;ILcom/baidu/platform/comapi/basestruct/c;)Z
    .locals 3

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);
    if-eqz p2, :cond_2

    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne p2, v1, :cond_0

    :cond_2
    #v1=(Conflicted);
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    const/16 v2, 0x63

    #v2=(PosByte);
    if-gt v1, v2, :cond_0

    invoke-direct {p0}, Lcom/baidu/platform/comapi/b/e;->e()Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "keyword"

    #v1=(Reference);
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "type"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "cityid"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    const-string v2, "level"

    #v2=(Reference);
    invoke-virtual {v1, v2, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "mapbound"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    if-eqz p6, :cond_3

    const-string v1, "loc_x"

    iget v2, p6, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "loc_y"

    iget v2, p6, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    #v2=(Conflicted);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comjni/map/search/a;->g(Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    if-eqz p1, :cond_0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x63

    #v3=(PosByte);
    if-gt v2, v3, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    #v0=(Reference);
    invoke-virtual {v0, p1, v1}, Lcom/baidu/platform/comjni/map/search/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;ILcom/baidu/platform/comapi/basestruct/b;ILjava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "I",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    #v0=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x63

    #v3=(PosByte);
    if-gt v2, v3, :cond_0

    invoke-direct {p0}, Lcom/baidu/platform/comapi/b/e;->e()Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    const-string v0, "keyword"

    #v0=(Reference);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pagenum"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "count"

    iget v1, p0, Lcom/baidu/platform/comapi/b/e;->e:I

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "cityid"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-virtual {v2, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p4, :cond_2

    const-string v0, "ll_x"

    iget-object v1, p4, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ll_y"

    iget-object v1, p4, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_x"

    iget-object v1, p4, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_y"

    iget-object v1, p4, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    if-eqz p6, :cond_4

    new-instance v1, Landroid/os/Bundle;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    #v1=(Reference);
    invoke-interface {p6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    #v3=(Reference);v4=(Conflicted);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-interface {p6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    #v0=(Boolean);v4=(Conflicted);
    const-string v0, "extparams"

    #v0=(Reference);
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    #v1=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v0, v2}, Lcom/baidu/platform/comjni/map/search/a;->a(Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    goto/16 :goto_0
.end method

.method public a([Ljava/lang/String;IIIILcom/baidu/platform/comapi/basestruct/b;Lcom/baidu/platform/comapi/basestruct/b;Ljava/util/Map;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "IIII",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "Lcom/baidu/platform/comapi/basestruct/b;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/16 v6, 0x63

    #v6=(PosByte);
    const/4 v1, 0x0

    #v1=(Null);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v1

    :cond_1
    #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    array-length v0, p1

    #v0=(Integer);
    const/4 v2, 0x2

    #v2=(PosByte);
    if-lt v0, v2, :cond_0

    array-length v0, p1

    const/16 v2, 0xa

    if-gt v0, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    move v0, v1

    :goto_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    array-length v3, p1

    #v3=(Integer);
    if-ge v0, v3, :cond_3

    aget-object v3, p1, v0

    #v3=(Null);
    if-eqz v3, :cond_0

    aget-object v3, p1, v0

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    #v4=(Integer);
    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v4, v6, :cond_0

    aget-object v4, p1, v0

    #v4=(Null);
    const-string v5, "$$"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v3, p1

    #v3=(Integer);
    add-int/lit8 v3, v3, -0x1

    if-eq v0, v3, :cond_2

    const-string v3, "$$"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    #v3=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    #v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-gt v0, v6, :cond_0

    invoke-direct {p0}, Lcom/baidu/platform/comapi/b/e;->e()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    const-string v0, "keyword"

    #v0=(Reference);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pagenum"

    invoke-virtual {v1, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "count"

    iget v2, p0, Lcom/baidu/platform/comapi/b/e;->e:I

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "cityid"

    invoke-virtual {v1, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "level"

    invoke-virtual {v1, v0, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "radius"

    invoke-virtual {v1, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    if-eqz p7, :cond_4

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v2, "ll_x"

    #v2=(Reference);
    iget-object v3, p7, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "ll_y"

    iget-object v3, p7, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "ru_x"

    iget-object v3, p7, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "ru_y"

    iget-object v3, p7, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "mapbound"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    #v2=(Conflicted);
    if-eqz p6, :cond_5

    const-string v0, "ll_x"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ll_y"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_x"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ru_y"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "loc_x"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->a()I

    move-result v3

    #v3=(Integer);
    add-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "loc_y"

    iget-object v2, p6, Lcom/baidu/platform/comapi/basestruct/b;->a:Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p6, Lcom/baidu/platform/comapi/basestruct/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/c;->b()I

    move-result v3

    #v3=(Integer);
    add-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    #v2=(Conflicted);
    if-eqz p8, :cond_7

    new-instance v2, Landroid/os/Bundle;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    #v2=(Reference);
    invoke-interface {p8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    #v3=(Reference);
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    invoke-interface {p8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    #v0=(Boolean);v4=(Conflicted);
    const-string v0, "extparams"

    #v0=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_7
    #v2=(Conflicted);v3=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/search/a;->c(Landroid/os/Bundle;)Z

    move-result v1

    #v1=(Boolean);
    goto/16 :goto_0
.end method

.method b(I)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comjni/map/search/a;->a(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-gtz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    #v1=(Conflicted);
    return-object v0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comjni/map/search/a;->b(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/e;->a:Lcom/baidu/platform/comjni/map/search/a;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comjni/map/search/a;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/baidu/platform/comapi/b/e;->e:I

    #v0=(Integer);
    return v0
.end method

*/}
