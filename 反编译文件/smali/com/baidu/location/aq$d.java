package com.baidu.location; class aq$d {/*

.class Lcom/baidu/location/aq$d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;
.implements Lcom/baidu/location/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/aq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic iY:Lcom/baidu/location/aq;


# direct methods
.method private constructor <init>(Lcom/baidu/location/aq;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/aq$d;->iY:Lcom/baidu/location/aq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Lcom/baidu/location/aq;Lcom/baidu/location/aq$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/aq$d;-><init>(Lcom/baidu/location/aq;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    :try_start_0
    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v0

    const-string v1, "%s|%s|%s|0"

    #v1=(Reference);
    const/4 v2, 0x3

    #v2=(PosByte);
    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    iget v4, v0, Lcom/baidu/location/n$a;->do:I

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v2, v3

    const/4 v3, 0x1

    #v3=(One);
    iget v4, v0, Lcom/baidu/location/n$a;->if:I

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v2, v3

    const/4 v3, 0x2

    #v3=(PosByte);
    iget v4, v0, Lcom/baidu/location/n$a;->for:I

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/baidu/location/Jni;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/aq$d;->iY:Lcom/baidu/location/aq;

    const-string v3, "%s|%s|%s|0"

    #v3=(Reference);
    const/4 v4, 0x3

    #v4=(PosByte);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    iget v6, v0, Lcom/baidu/location/n$a;->do:I

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x1

    #v5=(One);
    iget v6, v0, Lcom/baidu/location/n$a;->if:I

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x2

    #v5=(PosByte);
    iget v0, v0, Lcom/baidu/location/n$a;->for:I

    #v0=(Integer);
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    #v0=(Reference);
    aput-object v0, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/baidu/location/aq;->if(Lcom/baidu/location/aq;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/baidu/location/aq$d;->iY:Lcom/baidu/location/aq;

    iget-object v2, p0, Lcom/baidu/location/aq$d;->iY:Lcom/baidu/location/aq;

    invoke-virtual {v2, v1}, Lcom/baidu/location/aq;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/location/aq;->if(Lcom/baidu/location/aq;Ljava/util/List;)Ljava/util/List;

    iget-object v0, p0, Lcom/baidu/location/aq$d;->iY:Lcom/baidu/location/aq;

    invoke-static {v0}, Lcom/baidu/location/aq;->int(Lcom/baidu/location/aq;)V

    iget-object v0, p0, Lcom/baidu/location/aq$d;->iY:Lcom/baidu/location/aq;

    invoke-static {v0}, Lcom/baidu/location/aq;->if(Lcom/baidu/location/aq;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/location/aq$d;->iY:Lcom/baidu/location/aq;

    invoke-static {}, Lcom/baidu/location/f;->getServiceContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    const v2, 0x57e40

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Lcom/baidu/location/aq;->if(Landroid/content/Context;I)V

    goto :goto_0
.end method

*/}
