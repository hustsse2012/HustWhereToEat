package com.handmark.pulltorefresh.library.extras; class PullToRefreshWebView2$JsValueCallback {/*

.class final Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;
.super Ljava/lang/Object;
.source "PullToRefreshWebView2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "JsValueCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;


# direct methods
.method constructor <init>(Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;)V
    .locals 0
    .parameter

    .prologue
    .line 122
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;->this$0:Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public isReadyForPullDownResponse(Z)V
    .locals 1
    .parameter "response"

    .prologue
    .line 129
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;->this$0:Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;

    #v0=(Reference);
    invoke-static {v0}, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->access$1(Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 130
    return-void
.end method

.method public isReadyForPullUpResponse(Z)V
    .locals 1
    .parameter "response"

    .prologue
    .line 125
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2$JsValueCallback;->this$0:Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;

    #v0=(Reference);
    invoke-static {v0}, Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;->access$0(Lcom/handmark/pulltorefresh/library/extras/PullToRefreshWebView2;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 126
    return-void
.end method

*/}
