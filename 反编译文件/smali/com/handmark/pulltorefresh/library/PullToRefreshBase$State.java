package com.handmark.pulltorefresh.library; class PullToRefreshBase$State {/*

.class public final enum Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
.super Ljava/lang/Enum;
.source "PullToRefreshBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

.field public static final enum MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

.field public static final enum OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

.field public static final enum PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

.field public static final enum REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

.field public static final enum RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

.field public static final enum RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;


# instance fields
.field private mIntValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    #v8=(PosByte);
    const/4 v7, 0x3

    #v7=(PosByte);
    const/4 v6, 0x2

    #v6=(PosByte);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    .line 1526
    #v4=(Null);
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(UninitRef);
    const-string v1, "RESET"

    .line 1530
    #v1=(Reference);
    invoke-direct {v0, v1, v4, v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    .line 1532
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(UninitRef);
    const-string v1, "PULL_TO_REFRESH"

    .line 1536
    invoke-direct {v0, v1, v5, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    .line 1538
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(UninitRef);
    const-string v1, "RELEASE_TO_REFRESH"

    .line 1542
    invoke-direct {v0, v1, v6, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    .line 1544
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(UninitRef);
    const-string v1, "REFRESHING"

    .line 1547
    const/16 v2, 0x8

    #v2=(PosByte);
    invoke-direct {v0, v1, v7, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    .line 1549
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(UninitRef);
    const-string v1, "MANUAL_REFRESHING"

    .line 1553
    const/16 v2, 0x9

    invoke-direct {v0, v1, v8, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    .line 1555
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(UninitRef);
    const-string v1, "OVERSCROLLING"

    const/4 v2, 0x5

    .line 1559
    const/16 v3, 0x10

    #v3=(PosByte);
    invoke-direct {v0, v1, v2, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;-><init>(Ljava/lang/String;II)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    .line 1524
    const/4 v0, 0x6

    #v0=(PosByte);
    new-array v0, v0, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(Reference);
    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    aput-object v1, v0, v5

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    aput-object v1, v0, v6

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    aput-object v1, v0, v7

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    #v1=(PosByte);
    sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v2=(Reference);
    aput-object v2, v0, v1

    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .parameter
    .parameter
    .parameter "intValue"

    .prologue
    .line 1580
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 1581
    #p0=(Reference);
    iput p3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->mIntValue:I

    .line 1582
    return-void
.end method

.method static mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
    .locals 5
    .parameter "stateInt"

    .prologue
    .line 1568
    invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    move-result-object v2

    #v2=(Reference);
    array-length v3, v2

    #v3=(Integer);
    const/4 v1, 0x0

    :goto_0
    #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
    if-lt v1, v3, :cond_1

    .line 1575
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    :cond_0
    #v0=(Reference);
    return-object v0

    .line 1568
    :cond_1
    #v0=(Conflicted);
    aget-object v0, v2, v1

    .line 1569
    .local v0, value:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;,"Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;"
    #v0=(Null);
    invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->getIntValue()I

    move-result v4

    #v4=(Integer);
    if-eq p0, v4, :cond_0

    .line 1568
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
    .locals 1
    .parameter

    .prologue
    .line 1
    const-class v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(Reference);
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    return-object v0
.end method

.method public static values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    #v3=(Null);
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    new-array v2, v1, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;

    #v2=(Reference);
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method


# virtual methods
.method getIntValue()I
    .locals 1

    .prologue
    .line 1585
    iget v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->mIntValue:I

    #v0=(Integer);
    return v0
.end method

*/}
