package com.baidu.location; class g {/*

.class Lcom/baidu/location/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/g$a;
    }
.end annotation


# static fields
.field private static bl:Lcom/baidu/location/g;


# instance fields
.field private bj:Z

.field private bk:Ljava/util/ArrayList;

.field private bm:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/g;->bl:Lcom/baidu/location/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    iput-boolean v1, p0, Lcom/baidu/location/g;->bm:Z

    iput-boolean v1, p0, Lcom/baidu/location/g;->bj:Z

    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    return-void
.end method

.method private d()V
    .locals 6

    const/4 v3, 0x1

    #v3=(One);
    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    #v4=(Reference);
    move v1, v0

    #v1=(Null);
    move v2, v0

    :goto_0
    #v0=(Boolean);v1=(Boolean);v2=(Boolean);v5=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    iget-object v5, v0, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v5=(Reference);
    iget-boolean v5, v5, Lcom/baidu/location/LocationClientOption;->case:Z

    #v5=(Boolean);
    if-eqz v5, :cond_0

    move v2, v3

    :cond_0
    iget-object v0, v0, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget-boolean v0, v0, Lcom/baidu/location/LocationClientOption;->void:Z

    #v0=(Boolean);
    if-eqz v0, :cond_3

    move v0, v3

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_1
    #v5=(Conflicted);
    sput-boolean v1, Lcom/baidu/location/b;->aV:Z

    iget-boolean v0, p0, Lcom/baidu/location/g;->bm:Z

    if-eq v0, v2, :cond_2

    iput-boolean v2, p0, Lcom/baidu/location/g;->bm:Z

    invoke-static {}, Lcom/baidu/location/s;->aH()Lcom/baidu/location/s;

    move-result-object v0

    #v0=(Reference);
    iget-boolean v1, p0, Lcom/baidu/location/g;->bm:Z

    invoke-virtual {v0, v1}, Lcom/baidu/location/s;->do(Z)V

    :cond_2
    #v0=(Conflicted);
    return-void

    :cond_3
    #v0=(Boolean);v5=(Boolean);
    move v0, v1

    goto :goto_1
.end method

.method public static g()Lcom/baidu/location/g;
    .locals 1

    sget-object v0, Lcom/baidu/location/g;->bl:Lcom/baidu/location/g;

    #v0=(Reference);
    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/location/g;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/location/g;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/location/g;->bl:Lcom/baidu/location/g;

    :cond_0
    sget-object v0, Lcom/baidu/location/g;->bl:Lcom/baidu/location/g;

    return-object v0
.end method

.method private if(Landroid/os/Messenger;)Lcom/baidu/location/g$a;
    .locals 4

    const/4 v1, 0x0

    #v1=(Null);
    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v0=(Reference);
    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_0
    #v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    #v2=(Reference);v3=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    iget-object v3, v0, Lcom/baidu/location/g$a;->for:Landroid/os/Messenger;

    #v3=(Reference);
    invoke-virtual {v3, p1}, Landroid/os/Messenger;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    #v0=(Boolean);v3=(Conflicted);
    move-object v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method private if(Lcom/baidu/location/g$a;)V
    .locals 1

    if-nez p1, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);
    iget-object v0, p1, Lcom/baidu/location/g$a;->for:Landroid/os/Messenger;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/baidu/location/g;->if(Landroid/os/Messenger;)Lcom/baidu/location/g$a;

    move-result-object v0

    if-eqz v0, :cond_1

    const/16 v0, 0xe

    #v0=(PosByte);
    invoke-static {p1, v0}, Lcom/baidu/location/g$a;->a(Lcom/baidu/location/g$a;I)V

    goto :goto_0

    :cond_1
    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v0, 0xd

    #v0=(PosByte);
    invoke-static {p1, v0}, Lcom/baidu/location/g$a;->a(Lcom/baidu/location/g$a;I)V

    goto :goto_0
.end method

.method private long()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/location/g;->d()V

    invoke-virtual {p0}, Lcom/baidu/location/g;->e()V

    return-void
.end method


# virtual methods
.method public do(Landroid/os/Message;)V
    .locals 2

    iget-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/baidu/location/g;->if(Landroid/os/Messenger;)Lcom/baidu/location/g$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    #v1=(Conflicted);
    invoke-direct {p0}, Lcom/baidu/location/g;->long()V

    return-void
.end method

.method public do(Lcom/baidu/location/BDLocation;)V
    .locals 5

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    #v2=(Reference);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    invoke-virtual {v0, p1}, Lcom/baidu/location/g$a;->a(Lcom/baidu/location/BDLocation;)V

    iget v3, v0, Lcom/baidu/location/g$a;->if:I

    #v3=(Integer);
    const/4 v4, 0x4

    #v4=(PosByte);
    if-le v3, v4, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    #v0=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    iget-object v2, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    #v0=(Integer);
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    invoke-virtual {v0}, Lcom/baidu/location/g$a;->if()V

    goto :goto_0

    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 3

    new-instance v1, Ljava/lang/StringBuffer;

    #v1=(UninitRef);
    const/16 v0, 0x100

    #v0=(PosShort);
    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    #v1=(Reference);
    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "&prod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/baidu/location/ap;->g7:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/baidu/location/ap;->hb:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Boolean);v1=(Reference);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/g$a;

    iget-object v2, v0, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget-object v2, v2, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    iget-object v2, v0, Lcom/baidu/location/g$a;->int:Ljava/lang/String;

    if-eqz v2, :cond_2

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, v0, Lcom/baidu/location/g$a;->int:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "|"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "&prod="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    #v1=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public for(Landroid/os/Message;)I
    .locals 3

    const/4 v0, 0x1

    #v0=(One);
    if-eqz p1, :cond_0

    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v1=(Reference);v2=(Uninit);
    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {p0, v1}, Lcom/baidu/location/g;->if(Landroid/os/Messenger;)Lcom/baidu/location/g$a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v0, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/location/LocationClientOption;->goto:I

    #v0=(Integer);
    goto :goto_0
.end method

.method public goto()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    #v1=(Reference);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    invoke-virtual {v0}, Lcom/baidu/location/g$a;->a()V

    goto :goto_0

    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public if(Landroid/os/Message;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    #v0=(Null);
    const/4 v6, 0x1

    #v6=(One);
    if-eqz p1, :cond_0

    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    #v1=(Reference);
    if-nez v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_1
    #v0=(Null);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {p0, v1}, Lcom/baidu/location/g;->if(Landroid/os/Messenger;)Lcom/baidu/location/g$a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v0=(Reference);
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "num"

    #v3=(Reference);
    iget-object v4, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/location/LocationClientOption;->a:I

    #v4=(Integer);
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    #v2=(Integer);
    iput v2, v0, Lcom/baidu/location/LocationClientOption;->a:I

    iget-object v0, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "distance"

    iget-object v4, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/location/LocationClientOption;->do:F

    #v4=(Integer);
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v2

    #v2=(Float);
    iput v2, v0, Lcom/baidu/location/LocationClientOption;->do:F

    iget-object v0, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "extraInfo"

    iget-object v4, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v4=(Reference);
    iget-boolean v4, v4, Lcom/baidu/location/LocationClientOption;->if:Z

    #v4=(Boolean);
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    #v2=(Boolean);
    iput-boolean v2, v0, Lcom/baidu/location/LocationClientOption;->if:Z

    iget-object v0, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iput-boolean v6, v0, Lcom/baidu/location/LocationClientOption;->else:Z

    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v2, "&poi=%.1f|%d"

    #v2=(Reference);
    const/4 v3, 0x2

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    iget-object v5, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/location/LocationClientOption;->do:F

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    iget-object v4, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/location/LocationClientOption;->a:I

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v3, v6

    invoke-static {v0, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v1, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget-boolean v1, v1, Lcom/baidu/location/LocationClientOption;->if:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public if(Lcom/baidu/location/BDLocation;I)V
    .locals 5

    new-instance v1, Ljava/util/ArrayList;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    #v1=(Reference);
    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    #v2=(Reference);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/location/g$a;->a(Lcom/baidu/location/BDLocation;I)V

    iget v3, v0, Lcom/baidu/location/g$a;->if:I

    #v3=(Integer);
    const/4 v4, 0x4

    #v4=(PosByte);
    if-le v3, v4, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    #v0=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    iget-object v2, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    #v0=(Integer);
    return-void
.end method

.method public if(Lcom/baidu/location/BDLocation;Landroid/os/Message;)V
    .locals 3

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v0, p2, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/baidu/location/g;->if(Landroid/os/Messenger;)Lcom/baidu/location/g$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/location/g$a;->a(Lcom/baidu/location/BDLocation;)V

    iget v1, v0, Lcom/baidu/location/g$a;->if:I

    #v1=(Integer);
    const/4 v2, 0x4

    #v2=(PosByte);
    if-le v1, v2, :cond_0

    iget-object v1, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public int(Landroid/os/Message;)Z
    .locals 8

    const/16 v7, 0x3e8

    #v7=(PosShort);
    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    #v1=(Reference);
    invoke-direct {p0, v1}, Lcom/baidu/location/g;->if(Landroid/os/Messenger;)Lcom/baidu/location/g$a;

    move-result-object v2

    #v2=(Reference);
    if-nez v2, :cond_0

    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v0

    :cond_0
    #v0=(Null);v2=(Reference);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    iget-object v1, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget v1, v1, Lcom/baidu/location/LocationClientOption;->int:I

    #v1=(Integer);
    iget-object v3, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v3=(Reference);
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    #v4=(Reference);
    const-string v5, "scanSpan"

    #v5=(Reference);
    iget-object v6, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v6=(Reference);
    iget v6, v6, Lcom/baidu/location/LocationClientOption;->int:I

    #v6=(Integer);
    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/location/LocationClientOption;->int:I

    iget-object v3, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget v3, v3, Lcom/baidu/location/LocationClientOption;->int:I

    #v3=(Integer);
    if-ge v3, v7, :cond_3

    invoke-static {}, Lcom/baidu/location/d;->new()Lcom/baidu/location/d;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/d;->a()V

    :goto_1
    iget-object v3, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget v3, v3, Lcom/baidu/location/LocationClientOption;->int:I

    #v3=(Integer);
    const/16 v4, 0x3e7

    #v4=(PosShort);
    if-le v3, v4, :cond_1

    if-ge v1, v7, :cond_1

    const/4 v0, 0x1

    :cond_1
    #v0=(Boolean);
    iget-object v1, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v1=(Reference);
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    #v3=(Reference);
    const-string v4, "openGPS"

    #v4=(Reference);
    iget-object v5, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget-boolean v5, v5, Lcom/baidu/location/LocationClientOption;->case:Z

    #v5=(Boolean);
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    #v3=(Boolean);
    iput-boolean v3, v1, Lcom/baidu/location/LocationClientOption;->case:Z

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    const-string v3, "coorType"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    if-eqz v1, :cond_4

    const-string v4, ""

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_4

    :goto_2
    #v4=(Conflicted);
    iput-object v1, v3, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    const-string v3, "addrType"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    if-eqz v1, :cond_5

    const-string v4, ""

    #v4=(Reference);
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_5

    :goto_3
    #v4=(Conflicted);
    iput-object v1, v3, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    sget-object v1, Lcom/baidu/location/b;->ar:Ljava/lang/String;

    iget-object v3, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget-object v3, v3, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    invoke-static {}, Lcom/baidu/location/y;->ag()Lcom/baidu/location/y;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/y;->ah()V

    :cond_2
    #v1=(Conflicted);
    iget-object v1, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v1=(Reference);
    iget-object v1, v1, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    sput-object v1, Lcom/baidu/location/b;->ar:Ljava/lang/String;

    iget-object v1, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "timeOut"

    #v4=(Reference);
    iget-object v5, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/location/LocationClientOption;->long:I

    #v5=(Integer);
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    #v3=(Integer);
    iput v3, v1, Lcom/baidu/location/LocationClientOption;->long:I

    iget-object v1, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    #v3=(Reference);
    const-string v4, "location_change_notify"

    iget-object v5, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    #v5=(Reference);
    iget-boolean v5, v5, Lcom/baidu/location/LocationClientOption;->void:Z

    #v5=(Boolean);
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    #v3=(Boolean);
    iput-boolean v3, v1, Lcom/baidu/location/LocationClientOption;->void:Z

    iget-object v1, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    #v3=(Reference);
    const-string v4, "priority"

    iget-object v2, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget v2, v2, Lcom/baidu/location/LocationClientOption;->goto:I

    #v2=(Integer);
    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, v1, Lcom/baidu/location/LocationClientOption;->goto:I

    invoke-direct {p0}, Lcom/baidu/location/g;->long()V

    goto/16 :goto_0

    :cond_3
    #v0=(Null);v1=(Integer);v2=(Reference);v3=(Integer);v4=(Integer);v5=(Reference);
    invoke-static {}, Lcom/baidu/location/d;->new()Lcom/baidu/location/d;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/location/d;->if()V

    goto/16 :goto_1

    :cond_4
    #v0=(Boolean);v1=(Reference);v4=(Conflicted);v5=(Boolean);
    iget-object v1, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget-object v1, v1, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    goto :goto_2

    :cond_5
    iget-object v1, v2, Lcom/baidu/location/g$a;->do:Lcom/baidu/location/LocationClientOption;

    iget-object v1, v1, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    goto :goto_3
.end method

.method public new(Landroid/os/Message;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    #v0=(Reference);
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_1
    #v0=(Reference);
    new-instance v0, Lcom/baidu/location/g$a;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Lcom/baidu/location/g$a;-><init>(Lcom/baidu/location/g;Landroid/os/Message;)V

    #v0=(Reference);
    invoke-direct {p0, v0}, Lcom/baidu/location/g;->if(Lcom/baidu/location/g$a;)V

    invoke-direct {p0}, Lcom/baidu/location/g;->long()V

    goto :goto_0
.end method

.method public try(Ljava/lang/String;)V
    .locals 3

    new-instance v1, Lcom/baidu/location/BDLocation;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Lcom/baidu/location/BDLocation;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-static {}, Lcom/baidu/location/ab;->a()Lcom/baidu/location/ab;

    move-result-object v0

    #v0=(Reference);
    iput-object p1, v0, Lcom/baidu/location/ab;->new:Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/g;->bk:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/location/g$a;

    invoke-virtual {v0, v1}, Lcom/baidu/location/g$a;->if(Lcom/baidu/location/BDLocation;)V

    goto :goto_0

    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public void()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/g;->bm:Z

    #v0=(Boolean);
    return v0
.end method

*/}
