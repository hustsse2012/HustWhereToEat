package com.universer.HustWhereToEat.activity; class LoginActivity {/*

.class public Lcom/universer/HustWhereToEat/activity/LoginActivity;
.super Landroid/app/Activity;
.source "LoginActivity.java"


# instance fields
.field private forwardseeBtn:Landroid/widget/Button;

.field listener:Landroid/content/DialogInterface$OnClickListener;

.field private login_Button:Landroid/widget/Button;

.field private password:Landroid/widget/EditText;

.field private registButton:Landroid/widget/Button;

.field private user:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 93
    #p0=(Reference);
    new-instance v0, Lcom/universer/HustWhereToEat/activity/LoginActivity$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/universer/HustWhereToEat/activity/LoginActivity$1;-><init>(Lcom/universer/HustWhereToEat/activity/LoginActivity;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->listener:Landroid/content/DialogInterface$OnClickListener;

    .line 17
    return-void
.end method

.method static synthetic access$0(Lcom/universer/HustWhereToEat/activity/LoginActivity;)Landroid/widget/EditText;
    .locals 1
    .parameter

    .prologue
    .line 21
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->user:Landroid/widget/EditText;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1(Lcom/universer/HustWhereToEat/activity/LoginActivity;)Landroid/widget/EditText;
    .locals 1
    .parameter

    .prologue
    .line 22
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->password:Landroid/widget/EditText;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .parameter "savedInstanceState"

    .prologue
    .line 26
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    const v0, 0x7f03000c

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->setContentView(I)V

    .line 29
    const v0, 0x7f050029

    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->user:Landroid/widget/EditText;

    .line 30
    const v0, 0x7f05002b

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->password:Landroid/widget/EditText;

    .line 31
    const v0, 0x7f05002c

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->login_Button:Landroid/widget/Button;

    .line 32
    const v0, 0x7f05002e

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->registButton:Landroid/widget/Button;

    .line 33
    const v0, 0x7f05002d

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->forwardseeBtn:Landroid/widget/Button;

    .line 34
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->registButton:Landroid/widget/Button;

    new-instance v1, Lcom/universer/HustWhereToEat/activity/LoginActivity$2;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/universer/HustWhereToEat/activity/LoginActivity$2;-><init>(Lcom/universer/HustWhereToEat/activity/LoginActivity;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->forwardseeBtn:Landroid/widget/Button;

    new-instance v1, Lcom/universer/HustWhereToEat/activity/LoginActivity$3;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/universer/HustWhereToEat/activity/LoginActivity$3;-><init>(Lcom/universer/HustWhereToEat/activity/LoginActivity;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->login_Button:Landroid/widget/Button;

    new-instance v1, Lcom/universer/HustWhereToEat/activity/LoginActivity$4;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Lcom/universer/HustWhereToEat/activity/LoginActivity$4;-><init>(Lcom/universer/HustWhereToEat/activity/LoginActivity;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3
    .parameter "keyCode"
    .parameter "event"

    .prologue
    .line 73
    const/4 v1, 0x4

    #v1=(PosByte);
    if-ne p1, v1, :cond_0

    .line 75
    new-instance v1, Landroid/app/AlertDialog$Builder;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 77
    .local v0, isExit:Landroid/app/AlertDialog;
    #v0=(Reference);
    const-string v1, "\u7cfb\u7edf\u63d0\u793a"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 79
    const-string v1, "\u786e\u5b9a\u8981\u9000\u51fa\u5417"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 81
    const-string v1, "\u786e\u5b9a"

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->listener:Landroid/content/DialogInterface$OnClickListener;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog;->setButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 82
    const-string v1, "\u53d6\u6d88"

    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/LoginActivity;->listener:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog;->setButton2(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 84
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 88
    .end local v0           #isExit:Landroid/app/AlertDialog;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    return v1
.end method

*/}
