package com.handmark.pulltorefresh.library; class PullToRefreshBase$Mode {/*

.class public final enum Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
.super Ljava/lang/Enum;
.source "PullToRefreshBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

.field public static final enum DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

.field private static final synthetic ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

.field public static final enum MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

.field public static PULL_DOWN_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

.field public static final enum PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

.field public static final enum PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

.field public static PULL_UP_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;


# instance fields
.field private mIntValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    #v6=(PosByte);
    const/4 v5, 0x3

    #v5=(PosByte);
    const/4 v4, 0x2

    #v4=(PosByte);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 1337
    #v2=(Null);
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(UninitRef);
    const-string v1, "DISABLED"

    .line 1340
    #v1=(Reference);
    invoke-direct {v0, v1, v2, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    .line 1342
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(UninitRef);
    const-string v1, "PULL_FROM_START"

    .line 1347
    invoke-direct {v0, v1, v3, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    .line 1349
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(UninitRef);
    const-string v1, "PULL_FROM_END"

    .line 1354
    invoke-direct {v0, v1, v4, v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    .line 1356
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(UninitRef);
    const-string v1, "BOTH"

    .line 1359
    invoke-direct {v0, v1, v5, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    .line 1361
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(UninitRef);
    const-string v1, "MANUAL_REFRESH_ONLY"

    .line 1366
    invoke-direct {v0, v1, v6, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    const/4 v0, 0x5

    #v0=(PosByte);
    new-array v0, v0, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(Reference);
    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    aput-object v1, v0, v6

    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    .line 1371
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_DOWN_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    .line 1376
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_UP_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .parameter
    .parameter
    .parameter "modeInt"

    .prologue
    .line 1404
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 1405
    #p0=(Reference);
    iput p3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->mIntValue:I

    .line 1406
    return-void
.end method

.method static getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
    .locals 1

    .prologue
    .line 1398
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(Reference);
    return-object v0
.end method

.method static mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
    .locals 5
    .parameter "modeInt"

    .prologue
    .line 1387
    invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    move-result-object v2

    #v2=(Reference);
    array-length v3, v2

    #v3=(Integer);
    const/4 v1, 0x0

    :goto_0
    #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
    if-lt v1, v3, :cond_1

    .line 1394
    invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    move-result-object v0

    :cond_0
    #v0=(Reference);
    return-object v0

    .line 1387
    :cond_1
    #v0=(Conflicted);
    aget-object v0, v2, v1

    .line 1388
    .local v0, value:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
    #v0=(Null);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getIntValue()I

    move-result v4

    #v4=(Integer);
    if-eq p0, v4, :cond_0

    .line 1387
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
    .locals 1
    .parameter

    .prologue
    .line 1
    const-class v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(Reference);
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    return-object v0
.end method

.method public static values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    #v3=(Null);
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    new-array v2, v1, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v2=(Reference);
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method


# virtual methods
.method getIntValue()I
    .locals 1

    .prologue
    .line 1430
    iget v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->mIntValue:I

    #v0=(Integer);
    return v0
.end method

.method permitsPullToRefresh()Z
    .locals 1

    .prologue
    .line 1412
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(Reference);
    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public showFooterLoadingLayout()Z
    .locals 1

    .prologue
    .line 1426
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(Reference);
    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public showHeaderLoadingLayout()Z
    .locals 1

    .prologue
    .line 1419
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    #v0=(Reference);
    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

*/}
