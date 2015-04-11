package com.handmark.pulltorefresh.library; class PullToRefreshWebView$2 {/*

.class Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;
.super Landroid/webkit/WebChromeClient;
.source "PullToRefreshWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;


# direct methods
.method constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;

    .line 39
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1
    .parameter "view"
    .parameter "newProgress"

    .prologue
    .line 43
    const/16 v0, 0x64

    #v0=(PosByte);
    if-ne p2, v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView$2;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshWebView;->onRefreshComplete()V

    .line 46
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

*/}
