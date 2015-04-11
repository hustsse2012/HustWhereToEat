package com.handmark.pulltorefresh.library; class PullToRefreshBase$3 {/*

.class Lcom/handmark/pulltorefresh/library/PullToRefreshBase$3;
.super Ljava/lang/Object;
.source "PullToRefreshBase.java"

# interfaces
.implements Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollToAndBack(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;


# direct methods
.method constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$3;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    .line 1280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onSmoothScrollFinished()V
    .locals 7

    .prologue
    .line 1284
    iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$3;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const-wide/16 v2, 0xc8

    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v4, 0xe1

    #v4=(LongLo);v5=(LongHi);
    const/4 v6, 0x0

    #v6=(Null);
    invoke-static/range {v0 .. v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->access$5(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IJJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V

    .line 1285
    return-void
.end method

*/}
