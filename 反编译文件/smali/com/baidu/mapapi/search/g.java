package com.baidu.mapapi.search; class g {/*

.class Lcom/baidu/mapapi/search/g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/search/PlaceCaterActivity;


# direct methods
.method constructor <init>(Lcom/baidu/mapapi/search/PlaceCaterActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/g;->a:Lcom/baidu/mapapi/search/PlaceCaterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/baidu/mapapi/search/g;->a:Lcom/baidu/mapapi/search/PlaceCaterActivity;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/search/PlaceCaterActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    const-string v2, "android.intent.action.DIAL"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "tel:"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    #v1=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/search/g;->a:Lcom/baidu/mapapi/search/PlaceCaterActivity;

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/search/PlaceCaterActivity;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Lcom/baidu/platform/comapi/c/a;->a()Lcom/baidu/platform/comapi/c/a;

    move-result-object v0

    const-string v1, "pkgname"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/baidu/platform/comapi/c/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/baidu/platform/comapi/c/a;->a()Lcom/baidu/platform/comapi/c/a;

    move-result-object v0

    const-string v1, "place_telbutton_click"

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/c/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :catch_0
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

*/}
