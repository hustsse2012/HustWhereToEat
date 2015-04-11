package com.universer.HustWhereToEat.fragment; class AllFragment$GetDataTask {/*

.class Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;
.super Landroid/os/AsyncTask;
.source "AllFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/universer/HustWhereToEat/fragment/AllFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GetDataTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field mRefreshedView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 214
    .local p1, refreshedView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase<*>;"
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 215
    #p0=(Reference);
    iput-object p1, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;->mRefreshedView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    .line 216
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2
    .parameter "params"

    .prologue
    .line 222
    const-wide/16 v0, 0xfa0

    :try_start_0
    #v0=(LongLo);v1=(LongHi);
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    :goto_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0

    .line 223
    :catch_0
    #v0=(LongLo);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1
    .parameter "result"

    .prologue
    .line 230
    iget-object v0, p0, Lcom/universer/HustWhereToEat/fragment/AllFragment$GetDataTask;->mRefreshedView:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onRefreshComplete()V

    .line 231
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 232
    return-void
.end method

*/}
