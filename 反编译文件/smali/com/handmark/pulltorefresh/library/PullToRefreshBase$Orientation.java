package com.handmark.pulltorefresh.library; class PullToRefreshBase$Orientation {/*

.class public final enum Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
.super Ljava/lang/Enum;
.source "PullToRefreshBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Orientation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

.field public static final enum HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

.field public static final enum VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 1521
    #v2=(Null);
    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    #v0=(UninitRef);
    const-string v1, "VERTICAL"

    #v1=(Reference);
    invoke-direct {v0, v1, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    #v0=(UninitRef);
    const-string v1, "HORIZONTAL"

    invoke-direct {v0, v1, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;-><init>(Ljava/lang/String;I)V

    #v0=(Reference);
    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    .line 1520
    const/4 v0, 0x2

    #v0=(PosByte);
    new-array v0, v0, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    #v0=(Reference);
    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    aput-object v1, v0, v2

    sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    aput-object v1, v0, v3

    sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1520
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    #p0=(Reference);
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
    .locals 1
    .parameter

    .prologue
    .line 1
    const-class v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    #v0=(Reference);
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    return-object v0
.end method

.method public static values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    #v3=(Null);
    sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    new-array v2, v1, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;

    #v2=(Reference);
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

*/}
