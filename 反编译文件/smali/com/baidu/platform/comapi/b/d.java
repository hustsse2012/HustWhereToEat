package com.baidu.platform.comapi.b; class d {/*

.class Lcom/baidu/platform/comapi/b/d;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/baidu/platform/comapi/b/c;

.field private b:Lcom/baidu/platform/comapi/b/a;

.field private c:Lcom/baidu/platform/comapi/b/e;


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    iput-object v0, p0, Lcom/baidu/platform/comapi/b/d;->b:Lcom/baidu/platform/comapi/b/a;

    iput-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    return-void
.end method

.method public a(Landroid/os/Message;)V
    .locals 4

    const/16 v3, 0x23

    #v3=(PosByte);
    const/4 v2, 0x0

    #v2=(Null);
    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    const/16 v1, 0x7d0

    #v1=(PosShort);
    if-eq v0, v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);
    return-void

    :cond_1
    #v0=(Integer);v1=(PosShort);v2=(Null);
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x4

    #v1=(PosByte);
    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->b:Lcom/baidu/platform/comapi/b/a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget v0, p1, Landroid/os/Message;->arg2:I

    #v0=(Integer);
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->b:Lcom/baidu/platform/comapi/b/a;

    #v0=(Reference);
    iget v1, p1, Landroid/os/Message;->arg2:I

    #v1=(Integer);
    invoke-interface {v0, v2, v1}, Lcom/baidu/platform/comapi/b/a;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    #v0=(Integer);v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget v0, p1, Landroid/os/Message;->arg2:I

    #v0=(Integer);
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v0=(Reference);
    iget v1, p1, Landroid/os/Message;->arg2:I

    #v1=(Integer);
    invoke-interface {v0, v1}, Lcom/baidu/platform/comapi/b/c;->a(I)V

    goto :goto_0

    :cond_3
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg1:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_f

    :cond_4
    #v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->e(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_1
    #v0=(Integer);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_6

    :cond_5
    #v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->a(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_2
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_8

    :cond_7
    #v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->f(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->f(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_3
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_a

    :cond_9
    #v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_a
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_4
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    const/16 v1, 0x17

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_c

    :cond_b
    #v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->c(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_c
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->c(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_5
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_e

    :cond_d
    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->d(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_e
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->d(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_f
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->e(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_6
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_11

    :cond_10
    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->i(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_11
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->i(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_7
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_12

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_13

    :cond_12
    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->h(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_13
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->h(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_8
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_14

    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->g(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_14
    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->g(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_9
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_15

    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->n(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_15
    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->n(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_a
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_16

    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->o(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_16
    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->o(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_b
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    const/16 v1, 0x1fa

    #v1=(PosShort);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_17

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_18

    :cond_17
    #v1=(PosShort);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->m(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_18
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->m(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_c
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_19

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    invoke-virtual {v0, v3}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    :cond_19
    :sswitch_d
    #v0=(Conflicted);
    iget v0, p1, Landroid/os/Message;->arg2:I

    #v0=(Integer);
    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1b

    :cond_1a
    #v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->k(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1b
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->k(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_e
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    invoke-virtual {v0, v3}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1c

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->k(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1c
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->k(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_f
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_10
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    const-string v0, ""

    #v0=(Reference);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1d

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1e

    :cond_1d
    #v1=(PosByte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->l(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1e
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->l(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_11
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_1f

    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v1=(Reference);
    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/b/c;->j(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1f
    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    invoke-interface {v0, v2}, Lcom/baidu/platform/comapi/b/c;->j(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_12
    #v0=(Integer);v1=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    #v0=(Reference);
    iget v1, p1, Landroid/os/Message;->arg1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_20

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_21

    :cond_20
    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->b:Lcom/baidu/platform/comapi/b/a;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-interface {v0, v2, v1}, Lcom/baidu/platform/comapi/b/a;->a(Ljava/lang/String;I)V

    goto/16 :goto_0

    :cond_21
    #v1=(Boolean);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->b:Lcom/baidu/platform/comapi/b/a;

    #v1=(Reference);
    iget v2, p1, Landroid/os/Message;->arg2:I

    #v2=(Integer);
    invoke-interface {v1, v0, v2}, Lcom/baidu/platform/comapi/b/a;->a(Ljava/lang/String;I)V

    goto/16 :goto_0

    :sswitch_13
    #v0=(Integer);v1=(PosByte);v2=(Null);
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    #v1=(Reference);
    iget v2, p1, Landroid/os/Message;->arg1:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Lcom/baidu/platform/comapi/b/e;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/platform/comapi/b/c;->f(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_12
        0x6 -> :sswitch_2
        0x7 -> :sswitch_3
        0xb -> :sswitch_1
        0xe -> :sswitch_11
        0x12 -> :sswitch_10
        0x14 -> :sswitch_7
        0x15 -> :sswitch_1
        0x17 -> :sswitch_4
        0x1a -> :sswitch_5
        0x1c -> :sswitch_5
        0x1f -> :sswitch_6
        0x21 -> :sswitch_9
        0x23 -> :sswitch_e
        0x2c -> :sswitch_d
        0x2d -> :sswitch_f
        0x2e -> :sswitch_13
        0x33 -> :sswitch_c
        0x1f4 -> :sswitch_8
        0x1fa -> :sswitch_b
        0x1fc -> :sswitch_8
        0x1fe -> :sswitch_a
    .end sparse-switch
.end method

.method public a(Lcom/baidu/platform/comapi/b/c;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/b/d;->a:Lcom/baidu/platform/comapi/b/c;

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/b/e;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/b/d;->c:Lcom/baidu/platform/comapi/b/e;

    return-void
.end method

*/}
