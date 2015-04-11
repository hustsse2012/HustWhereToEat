package android.support.v4.widget; class ScrollerCompat {/*

.class Landroid/support/v4/widget/ScrollerCompat;
.super Ljava/lang/Object;
.source "ScrollerCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;
    }
.end annotation


# instance fields
.field mScroller:Landroid/widget/Scroller;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    #p0=(Reference);
    new-instance v0, Landroid/widget/Scroller;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    .line 52
    return-void
.end method

.method public static from(Landroid/content/Context;)Landroid/support/v4/widget/ScrollerCompat;
    .locals 2
    .parameter "context"

    .prologue
    .line 44
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xe

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 45
    new-instance v0, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;-><init>(Landroid/content/Context;)V

    .line 47
    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Integer);
    new-instance v0, Landroid/support/v4/widget/ScrollerCompat;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/widget/ScrollerCompat;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    goto :goto_0
.end method


# virtual methods
.method public abortAnimation()V
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 180
    return-void
.end method

.method public computeScrollOffset()Z
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public fling(IIIIIIII)V
    .locals 9
    .parameter "startX"
    .parameter "startY"
    .parameter "velocityX"
    .parameter "velocityY"
    .parameter "minX"
    .parameter "maxX"
    .parameter "minY"
    .parameter "maxY"

    .prologue
    .line 170
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    move v1, p1

    #v1=(Integer);
    move v2, p2

    #v2=(Integer);
    move v3, p3

    #v3=(Integer);
    move v4, p4

    #v4=(Integer);
    move v5, p5

    #v5=(Integer);
    move v6, p6

    #v6=(Integer);
    move/from16 v7, p7

    #v7=(Integer);
    move/from16 v8, p8

    #v8=(Integer);
    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 171
    return-void
.end method

.method public getCurrVelocity()F
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getCurrX()I
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getCurrY()I
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getDuration()I
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->getDuration()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public isFinished()Z
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public startScroll(IIII)V
    .locals 1
    .parameter "startX"
    .parameter "startY"
    .parameter "dx"
    .parameter "dy"

    .prologue
    .line 129
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 130
    return-void
.end method

.method public startScroll(IIIII)V
    .locals 6
    .parameter "startX"
    .parameter "startY"
    .parameter "dx"
    .parameter "dy"
    .parameter "duration"

    .prologue
    .line 146
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    move v1, p1

    #v1=(Integer);
    move v2, p2

    #v2=(Integer);
    move v3, p3

    #v3=(Integer);
    move v4, p4

    #v4=(Integer);
    move v5, p5

    #v5=(Integer);
    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 147
    return-void
.end method

*/}
