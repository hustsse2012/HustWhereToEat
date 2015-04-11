package com.baidu.location; class z {/*

.class abstract Lcom/baidu/location/z;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/an;
.implements Lcom/baidu/location/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/z$a;,
        Lcom/baidu/location/z$b;
    }
.end annotation


# static fields
.field public static dw:Ljava/lang/String;


# instance fields
.field private dA:Z

.field private dB:Z

.field public dC:Lcom/baidu/location/ai$b;

.field private dx:Z

.field final dy:Landroid/os/Handler;

.field public dz:Lcom/baidu/location/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/baidu/location/z;->dw:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/z;->dC:Lcom/baidu/location/ai$b;

    iput-object v0, p0, Lcom/baidu/location/z;->dz:Lcom/baidu/location/n$a;

    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Lcom/baidu/location/z;->dx:Z

    iput-boolean v1, p0, Lcom/baidu/location/z;->dB:Z

    iput-boolean v1, p0, Lcom/baidu/location/z;->dA:Z

    new-instance v0, Lcom/baidu/location/z$b;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/location/z$b;-><init>(Lcom/baidu/location/z;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/z;->dy:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method abstract ab()V
.end method

.method abstract byte(Landroid/os/Message;)V
.end method

.method public void(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v6, 0x0

    #v6=(Null);
    iget-object v0, p0, Lcom/baidu/location/z;->dz:Lcom/baidu/location/n$a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/z;->dz:Lcom/baidu/location/n$a;

    invoke-virtual {v0}, Lcom/baidu/location/n$a;->do()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/n;->H()Lcom/baidu/location/n$a;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/z;->dz:Lcom/baidu/location/n$a;

    :cond_1
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/z;->dz:Lcom/baidu/location/n$a;

    #v0=(Reference);
    if-eqz v0, :cond_7

    const-string v0, "baidu_location_service"

    iget-object v1, p0, Lcom/baidu/location/z;->dz:Lcom/baidu/location/n$a;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/n$a;->if()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/location/b;->do(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/baidu/location/z;->dC:Lcom/baidu/location/ai$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/z;->dC:Lcom/baidu/location/ai$b;

    invoke-virtual {v0}, Lcom/baidu/location/ai$b;->for()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_3

    :cond_2
    #v0=(Conflicted);
    invoke-static {}, Lcom/baidu/location/ai;->bb()Lcom/baidu/location/ai;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/ai;->ba()Lcom/baidu/location/ai$b;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/z;->dC:Lcom/baidu/location/ai$b;

    :cond_3
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/location/z;->dC:Lcom/baidu/location/ai$b;

    #v0=(Reference);
    if-eqz v0, :cond_8

    const-string v0, "baidu_location_service"

    iget-object v1, p0, Lcom/baidu/location/z;->dC:Lcom/baidu/location/ai$b;

    invoke-virtual {v1}, Lcom/baidu/location/ai$b;->else()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/location/b;->do(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {}, Lcom/baidu/location/s;->aH()Lcom/baidu/location/s;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/location/s;->ay()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    invoke-static {}, Lcom/baidu/location/s;->aH()Lcom/baidu/location/s;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/location/s;->az()Landroid/location/Location;

    move-result-object v0

    :cond_4
    invoke-static {}, Lcom/baidu/location/g;->g()Lcom/baidu/location/g;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/location/g;->f()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-static {}, Lcom/baidu/location/ai;->bf()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_9

    const-string v1, "&cn=32"

    :goto_2
    #v1=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-boolean v3, p0, Lcom/baidu/location/z;->dx:Z

    #v3=(Boolean);
    if-eqz v3, :cond_5

    invoke-static {}, Lcom/baidu/location/l;->v()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_5
    #v3=(Conflicted);v4=(Conflicted);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_6
    iget-object v2, p0, Lcom/baidu/location/z;->dz:Lcom/baidu/location/n$a;

    iget-object v3, p0, Lcom/baidu/location/z;->dC:Lcom/baidu/location/ai$b;

    invoke-static {v2, v3, v0, v1, v6}, Lcom/baidu/location/b;->if(Lcom/baidu/location/n$a;Lcom/baidu/location/ai$b;Landroid/location/Location;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_7
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const-string v0, "baidu_location_service"

    const-string v1, "cellInfo null..."

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/location/b;->do(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    const-string v0, "baidu_location_service"

    const-string v1, "wifi list null"

    invoke-static {v0, v1}, Lcom/baidu/location/b;->do(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    #v1=(Boolean);v2=(Reference);
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v1=(Reference);
    const-string v3, "&cn=%d"

    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    invoke-static {}, Lcom/baidu/location/n;->K()Lcom/baidu/location/n;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v5}, Lcom/baidu/location/n;->M()I

    move-result v5

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v4, v6

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2
.end method

*/}
