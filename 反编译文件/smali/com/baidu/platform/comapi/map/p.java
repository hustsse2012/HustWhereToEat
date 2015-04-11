package com.baidu.platform.comapi.map; class p {/*

.class Lcom/baidu/platform/comapi/map/p;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/baidu/platform/comapi/map/o;


# direct methods
.method constructor <init>(Lcom/baidu/platform/comapi/map/o;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x1

    #v1=(One);
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    const/16 v3, 0xfa0

    #v3=(PosShort);
    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->f:Lcom/baidu/platform/comapi/map/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v3, v0, Lcom/baidu/platform/comapi/map/q;->f:Lcom/baidu/platform/comapi/map/a;

    #v3=(Reference);
    iget v0, p1, Landroid/os/Message;->arg2:I

    #v0=(Integer);
    if-ne v0, v1, :cond_7

    move v0, v1

    :goto_0
    #v0=(Boolean);
    invoke-interface {v3, v0}, Lcom/baidu/platform/comapi/map/a;->a(Z)V

    :cond_0
    #v0=(Conflicted);v3=(Conflicted);
    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    const/16 v3, 0x27

    #v3=(PosByte);
    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    if-eqz v0, :cond_4

    iget v0, p1, Landroid/os/Message;->arg1:I

    #v0=(Integer);
    const/16 v3, 0x64

    if-ne v0, v3, :cond_8

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v0}, Lcom/baidu/platform/comapi/map/u;->b()V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->b(Lcom/baidu/platform/comapi/map/o;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->c(Lcom/baidu/platform/comapi/map/o;)V

    :cond_1
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->d(Lcom/baidu/platform/comapi/map/o;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->e(Lcom/baidu/platform/comapi/map/o;)V

    :cond_2
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/platform/comapi/map/u;->a(Lcom/baidu/platform/comapi/map/t;)V

    :cond_3
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v3=(PosShort);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v0}, Lcom/baidu/platform/comapi/map/u;->a()V

    :cond_4
    #v0=(Conflicted);
    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    const/16 v1, 0x200

    #v1=(PosShort);
    if-ne v0, v1, :cond_5

    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v1

    iget-object v1, v1, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v1}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v1

    iget-object v1, v1, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v1, v0}, Lcom/baidu/platform/comapi/map/u;->a(I)V

    :cond_5
    #v1=(Conflicted);
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x29

    #v1=(PosByte);
    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/platform/comapi/map/u;->a(Lcom/baidu/platform/comapi/map/t;)V

    :cond_6
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_7
    #v0=(Integer);v1=(One);v3=(Reference);
    move v0, v2

    #v0=(Null);
    goto/16 :goto_0

    :cond_8
    #v0=(Integer);v3=(PosByte);
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v3, 0xc8

    #v3=(PosShort);
    if-ne v0, v3, :cond_9

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v0}, Lcom/baidu/platform/comapi/map/u;->c()V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/platform/comapi/map/u;->a(Lcom/baidu/platform/comapi/map/t;)V

    goto/16 :goto_1

    :cond_9
    #v0=(Integer);v1=(One);
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/baidu/platform/comapi/map/q;->setRenderMode(I)V

    goto/16 :goto_1

    :cond_a
    #v0=(Integer);
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/p;->a:Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/map/q;->setRenderMode(I)V

    goto/16 :goto_1
.end method

*/}
