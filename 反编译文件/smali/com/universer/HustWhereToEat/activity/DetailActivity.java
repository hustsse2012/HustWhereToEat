package com.universer.HustWhereToEat.activity; class DetailActivity {/*

.class public Lcom/universer/HustWhereToEat/activity/DetailActivity;
.super Landroid/app/Activity;
.source "DetailActivity.java"


# instance fields
.field private addressTxt:Landroid/widget/TextView;

.field private commentListView:Landroid/widget/ListView;

.field comments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mIntent:Landroid/content/Intent;

.field private mListAdapter:Landroid/widget/ListAdapter;

.field private nameTxt:Landroid/widget/TextView;

.field private orderBtn:Landroid/widget/Button;

.field private phoneTxt:Landroid/widget/TextView;

.field private restautantImg:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private findView()V
    .locals 1

    .prologue
    .line 150
    const v0, 0x7f050011

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->orderBtn:Landroid/widget/Button;

    .line 151
    const v0, 0x7f05000e

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->restautantImg:Landroid/widget/ImageView;

    .line 152
    const v0, 0x7f050012

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->addressTxt:Landroid/widget/TextView;

    .line 153
    const v0, 0x7f050013

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->phoneTxt:Landroid/widget/TextView;

    .line 154
    const v0, 0x7f05000d

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->nameTxt:Landroid/widget/TextView;

    .line 155
    const v0, 0x7f050014

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->commentListView:Landroid/widget/ListView;

    .line 156
    return-void
.end method

.method private initView()V
    .locals 6

    .prologue
    .line 48
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mIntent:Landroid/content/Intent;

    #v4=(Reference);
    const-string v5, "NAME"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 49
    .local v1, name:Ljava/lang/String;
    #v1=(Reference);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mIntent:Landroid/content/Intent;

    const-string v5, "IMAGE"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 50
    .local v3, url:Ljava/lang/String;
    #v3=(Reference);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mIntent:Landroid/content/Intent;

    const-string v5, "ADDRESS"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    .local v0, address:Ljava/lang/String;
    #v0=(Reference);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mIntent:Landroid/content/Intent;

    const-string v5, "PHONE"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 52
    .local v2, phone:Ljava/lang/String;
    #v2=(Reference);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mIntent:Landroid/content/Intent;

    const-string v5, "COMMENT"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->comments:Ljava/util/List;

    .line 53
    const-string v4, "URL"

    invoke-static {v4, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->restautantImg:Landroid/widget/ImageView;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 55
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->addressTxt:Landroid/widget/TextView;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->phoneTxt:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->nameTxt:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    new-instance v4, Lcom/universer/HustWhereToEat/activity/DetailActivity$1;

    #v4=(UninitRef);
    invoke-direct {v4, p0}, Lcom/universer/HustWhereToEat/activity/DetailActivity$1;-><init>(Lcom/universer/HustWhereToEat/activity/DetailActivity;)V

    #v4=(Reference);
    iput-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mListAdapter:Landroid/widget/ListAdapter;

    .line 136
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->commentListView:Landroid/widget/ListView;

    iget-object v5, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mListAdapter:Landroid/widget/ListAdapter;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 137
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->orderBtn:Landroid/widget/Button;

    new-instance v5, Lcom/universer/HustWhereToEat/activity/DetailActivity$2;

    #v5=(UninitRef);
    invoke-direct {v5, p0, v2}, Lcom/universer/HustWhereToEat/activity/DetailActivity$2;-><init>(Lcom/universer/HustWhereToEat/activity/DetailActivity;Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .parameter "savedInstanceState"

    .prologue
    .line 36
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 37
    const/high16 v0, 0x7f03

    #v0=(Integer);
    invoke-virtual {p0, v0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->setContentView(I)V

    .line 38
    invoke-virtual {p0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mIntent:Landroid/content/Intent;

    .line 39
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->findView()V

    .line 40
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/DetailActivity;->mIntent:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 41
    invoke-direct {p0}, Lcom/universer/HustWhereToEat/activity/DetailActivity;->initView()V

    .line 44
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 161
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 162
    return-void
.end method

*/}
